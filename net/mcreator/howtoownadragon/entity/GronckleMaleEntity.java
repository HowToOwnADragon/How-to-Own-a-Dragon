package net.mcreator.howtoownadragon.entity;

import io.netty.buffer.Unpooled;
import java.util.List;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import net.mcreator.howtoownadragon.init.HowToOwnADragonModEntities;
import net.mcreator.howtoownadragon.procedures.AllFollowMeTriggerProcedure;
import net.mcreator.howtoownadragon.procedures.DontAllFollowMeTriggerProcedure;
import net.mcreator.howtoownadragon.procedures.FlyAtDayFollowMeTriggerProcedure;
import net.mcreator.howtoownadragon.procedures.GronckleFlyingTickUpdateProcedure;
import net.mcreator.howtoownadragon.procedures.GronckleMaleOnInitialEntitySpawnProcedure;
import net.mcreator.howtoownadragon.procedures.LookAtNightDontFollowMeProcedure;
import net.mcreator.howtoownadragon.procedures.ValkaFollowMeTriggerProcedure;
import net.mcreator.howtoownadragon.world.inventory.MaleGronckleGUIMenu;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.nbt.Tag;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.network.chat.Component;
import net.minecraft.network.protocol.Packet;
import net.minecraft.network.protocol.game.ClientGamePacketListener;
import net.minecraft.network.syncher.EntityDataAccessor;
import net.minecraft.network.syncher.EntityDataSerializers;
import net.minecraft.network.syncher.SynchedEntityData;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.util.RandomSource;
import net.minecraft.world.DifficultyInstance;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.MenuProvider;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.damagesource.DamageTypes;
import net.minecraft.world.entity.AgeableMob;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityDimensions;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.MobType;
import net.minecraft.world.entity.Pose;
import net.minecraft.world.entity.SpawnGroupData;
import net.minecraft.world.entity.SpawnPlacements;
import net.minecraft.world.entity.TamableAnimal;
import net.minecraft.world.entity.Entity.RemovalReason;
import net.minecraft.world.entity.SpawnPlacements.Type;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier.Builder;
import net.minecraft.world.entity.ai.control.FlyingMoveControl;
import net.minecraft.world.entity.ai.goal.FloatGoal;
import net.minecraft.world.entity.ai.goal.FollowOwnerGoal;
import net.minecraft.world.entity.ai.goal.LookAtPlayerGoal;
import net.minecraft.world.entity.ai.goal.RandomLookAroundGoal;
import net.minecraft.world.entity.ai.goal.RandomStrollGoal;
import net.minecraft.world.entity.ai.goal.WaterAvoidingRandomStrollGoal;
import net.minecraft.world.entity.ai.goal.target.NearestAttackableTargetGoal;
import net.minecraft.world.entity.ai.navigation.FlyingPathNavigation;
import net.minecraft.world.entity.ai.navigation.PathNavigation;
import net.minecraft.world.entity.animal.Sheep;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.SpawnEggItem;
import net.minecraft.world.item.enchantment.EnchantmentHelper;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.ServerLevelAccessor;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.levelgen.Heightmap.Types;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.phys.Vec3;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.common.capabilities.ForgeCapabilities;
import net.minecraftforge.common.util.LazyOptional;
import net.minecraftforge.event.ForgeEventFactory;
import net.minecraftforge.items.IItemHandlerModifiable;
import net.minecraftforge.items.ItemStackHandler;
import net.minecraftforge.items.wrapper.CombinedInvWrapper;
import net.minecraftforge.items.wrapper.EntityArmorInvWrapper;
import net.minecraftforge.items.wrapper.EntityHandsInvWrapper;
import net.minecraftforge.network.NetworkHooks;
import net.minecraftforge.network.PlayMessages.SpawnEntity;
import net.minecraftforge.registries.ForgeRegistries;
import software.bernie.geckolib.animatable.GeoEntity;
import software.bernie.geckolib.core.animatable.instance.AnimatableInstanceCache;
import software.bernie.geckolib.core.animation.AnimationController;
import software.bernie.geckolib.core.animation.AnimationState;
import software.bernie.geckolib.core.animation.RawAnimation;
import software.bernie.geckolib.core.animation.AnimatableManager.ControllerRegistrar;
import software.bernie.geckolib.core.animation.AnimationController.State;
import software.bernie.geckolib.core.object.PlayState;
import software.bernie.geckolib.util.GeckoLibUtil;

public class GronckleMaleEntity extends TamableAnimal implements GeoEntity {
   public static final EntityDataAccessor<Boolean> SHOOT;
   public static final EntityDataAccessor<String> ANIMATION;
   public static final EntityDataAccessor<String> TEXTURE;
   private final AnimatableInstanceCache cache;
   private boolean swinging;
   private boolean lastloop;
   private long lastSwing;
   public String animationprocedure;
   private final ItemStackHandler inventory;
   private final CombinedInvWrapper combined;

   public GronckleMaleEntity(SpawnEntity packet, Level world) {
      this((EntityType)HowToOwnADragonModEntities.GRONCKLE_MALE.get(), world);
   }

   public GronckleMaleEntity(EntityType<GronckleMaleEntity> type, Level world) {
      super(type, world);
      this.cache = GeckoLibUtil.createInstanceCache(this);
      this.animationprocedure = "empty";
      this.inventory = new ItemStackHandler(1) {
         public int getSlotLimit(int slot) {
            return 1;
         }
      };
      this.combined = new CombinedInvWrapper(new IItemHandlerModifiable[]{this.inventory, new EntityHandsInvWrapper(this), new EntityArmorInvWrapper(this)});
      this.f_21364_ = 0;
      this.m_21557_(false);
      this.f_21342_ = new FlyingMoveControl(this, 10, true);
   }

   protected void m_8097_() {
      super.m_8097_();
      this.f_19804_.m_135372_(SHOOT, false);
      this.f_19804_.m_135372_(ANIMATION, "undefined");
      this.f_19804_.m_135372_(TEXTURE, "meatlug");
   }

   public void setTexture(String texture) {
      this.f_19804_.m_135381_(TEXTURE, texture);
   }

   public String getTexture() {
      return (String)this.f_19804_.m_135370_(TEXTURE);
   }

   protected float m_6431_(Pose poseIn, EntityDimensions sizeIn) {
      return 0.8F;
   }

   public Packet<ClientGamePacketListener> m_5654_() {
      return NetworkHooks.getEntitySpawningPacket(this);
   }

   protected PathNavigation m_6037_(Level world) {
      return new FlyingPathNavigation(this, world);
   }

   protected void m_8099_() {
      super.m_8099_();
      this.f_21345_.m_25352_(1, new LookAtPlayerGoal(this, ServerPlayer.class, 3.0F) {
         public boolean m_8036_() {
            double x = GronckleMaleEntity.this.m_20185_();
            double y = GronckleMaleEntity.this.m_20186_();
            double z = GronckleMaleEntity.this.m_20189_();
            Entity entity = GronckleMaleEntity.this;
            Level world = GronckleMaleEntity.this.f_19853_;
            return super.m_8036_() && ValkaFollowMeTriggerProcedure.execute(world, entity);
         }
      });
      this.f_21345_.m_25352_(2, new LookAtPlayerGoal(this, Player.class, 3.0F) {
         public boolean m_8036_() {
            double x = GronckleMaleEntity.this.m_20185_();
            double y = GronckleMaleEntity.this.m_20186_();
            double z = GronckleMaleEntity.this.m_20189_();
            Entity entity = GronckleMaleEntity.this;
            Level world = GronckleMaleEntity.this.f_19853_;
            return super.m_8036_() && ValkaFollowMeTriggerProcedure.execute(world, entity);
         }
      });
      this.f_21345_.m_25352_(3, new FollowOwnerGoal(this, 1.0D, 6.0F, 16.0F, false) {
         public boolean m_8036_() {
            double x = GronckleMaleEntity.this.m_20185_();
            double y = GronckleMaleEntity.this.m_20186_();
            double z = GronckleMaleEntity.this.m_20189_();
            Entity entity = GronckleMaleEntity.this;
            Level world = GronckleMaleEntity.this.f_19853_;
            return super.m_8036_() && ValkaFollowMeTriggerProcedure.execute(world, entity);
         }
      });
      this.f_21345_.m_25352_(4, new LookAtPlayerGoal(this, ServerPlayer.class, 3.0F) {
         public boolean m_8036_() {
            double x = GronckleMaleEntity.this.m_20185_();
            double y = GronckleMaleEntity.this.m_20186_();
            double z = GronckleMaleEntity.this.m_20189_();
            Entity entity = GronckleMaleEntity.this;
            Level world = GronckleMaleEntity.this.f_19853_;
            return super.m_8036_() && AllFollowMeTriggerProcedure.execute(world, entity);
         }
      });
      this.f_21345_.m_25352_(5, new LookAtPlayerGoal(this, Player.class, 3.0F) {
         public boolean m_8036_() {
            double x = GronckleMaleEntity.this.m_20185_();
            double y = GronckleMaleEntity.this.m_20186_();
            double z = GronckleMaleEntity.this.m_20189_();
            Entity entity = GronckleMaleEntity.this;
            Level world = GronckleMaleEntity.this.f_19853_;
            return super.m_8036_() && AllFollowMeTriggerProcedure.execute(world, entity);
         }
      });
      this.f_21345_.m_25352_(6, new FollowOwnerGoal(this, 1.0D, 6.0F, 16.0F, false) {
         public boolean m_8036_() {
            double x = GronckleMaleEntity.this.m_20185_();
            double y = GronckleMaleEntity.this.m_20186_();
            double z = GronckleMaleEntity.this.m_20189_();
            Entity entity = GronckleMaleEntity.this;
            Level world = GronckleMaleEntity.this.f_19853_;
            return super.m_8036_() && AllFollowMeTriggerProcedure.execute(world, entity);
         }
      });
      this.f_21346_.m_25352_(7, new NearestAttackableTargetGoal(this, Sheep.class, true, true) {
         public boolean m_8036_() {
            double x = GronckleMaleEntity.this.m_20185_();
            double y = GronckleMaleEntity.this.m_20186_();
            double z = GronckleMaleEntity.this.m_20189_();
            Entity entity = GronckleMaleEntity.this;
            Level world = GronckleMaleEntity.this.f_19853_;
            return super.m_8036_() && FlyAtDayFollowMeTriggerProcedure.execute(world, entity);
         }
      });
      this.f_21345_.m_25352_(8, new RandomStrollGoal(this, 1.0D) {
         public boolean m_8036_() {
            double x = GronckleMaleEntity.this.m_20185_();
            double y = GronckleMaleEntity.this.m_20186_();
            double z = GronckleMaleEntity.this.m_20189_();
            Entity entity = GronckleMaleEntity.this;
            Level world = GronckleMaleEntity.this.f_19853_;
            return super.m_8036_() && FlyAtDayFollowMeTriggerProcedure.execute(world, entity);
         }
      });
      this.f_21345_.m_25352_(9, new RandomLookAroundGoal(this) {
         public boolean m_8036_() {
            double x = GronckleMaleEntity.this.m_20185_();
            double y = GronckleMaleEntity.this.m_20186_();
            double z = GronckleMaleEntity.this.m_20189_();
            Entity entity = GronckleMaleEntity.this;
            Level world = GronckleMaleEntity.this.f_19853_;
            return super.m_8036_() && LookAtNightDontFollowMeProcedure.execute(world, entity);
         }
      });
      this.f_21345_.m_25352_(10, new FloatGoal(this) {
         public boolean m_8036_() {
            double x = GronckleMaleEntity.this.m_20185_();
            double y = GronckleMaleEntity.this.m_20186_();
            double z = GronckleMaleEntity.this.m_20189_();
            Entity entity = GronckleMaleEntity.this;
            Level world = GronckleMaleEntity.this.f_19853_;
            return super.m_8036_() && DontAllFollowMeTriggerProcedure.execute(world, entity);
         }
      });
      this.f_21345_.m_25352_(11, new WaterAvoidingRandomStrollGoal(this, 0.8D) {
         public boolean m_8036_() {
            double x = GronckleMaleEntity.this.m_20185_();
            double y = GronckleMaleEntity.this.m_20186_();
            double z = GronckleMaleEntity.this.m_20189_();
            Entity entity = GronckleMaleEntity.this;
            Level world = GronckleMaleEntity.this.f_19853_;
            return super.m_8036_() && FlyAtDayFollowMeTriggerProcedure.execute(world, entity);
         }
      });
      this.f_21345_.m_25352_(12, new RandomStrollGoal(this, 0.8D, 20) {
         protected Vec3 m_7037_() {
            RandomSource random = GronckleMaleEntity.this.m_217043_();
            double dir_x = GronckleMaleEntity.this.m_20185_() + (double)((random.m_188501_() * 2.0F - 1.0F) * 16.0F);
            double dir_y = GronckleMaleEntity.this.m_20186_() + (double)((random.m_188501_() * 2.0F - 1.0F) * 16.0F);
            double dir_z = GronckleMaleEntity.this.m_20189_() + (double)((random.m_188501_() * 2.0F - 1.0F) * 16.0F);
            return new Vec3(dir_x, dir_y, dir_z);
         }

         public boolean m_8036_() {
            double x = GronckleMaleEntity.this.m_20185_();
            double y = GronckleMaleEntity.this.m_20186_();
            double z = GronckleMaleEntity.this.m_20189_();
            Entity entity = GronckleMaleEntity.this;
            Level world = GronckleMaleEntity.this.f_19853_;
            return super.m_8036_() && FlyAtDayFollowMeTriggerProcedure.execute(world, entity);
         }
      });
   }

   public MobType m_6336_() {
      return MobType.f_21640_;
   }

   public double m_6048_() {
      return super.m_6048_() + 0.3D;
   }

   public SoundEvent m_7975_(DamageSource ds) {
      return (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.generic.hurt"));
   }

   public SoundEvent m_5592_() {
      return (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.generic.death"));
   }

   public boolean m_142535_(float l, float d, DamageSource source) {
      return false;
   }

   public boolean m_6469_(DamageSource source, float amount) {
      if (source.m_276093_(DamageTypes.f_268631_)) {
         return false;
      } else if (source.m_7640_() instanceof AbstractArrow) {
         return false;
      } else {
         return source.m_276093_(DamageTypes.f_268671_) ? false : super.m_6469_(source, amount);
      }
   }

   public SpawnGroupData m_6518_(ServerLevelAccessor world, DifficultyInstance difficulty, MobSpawnType reason, @Nullable SpawnGroupData livingdata, @Nullable CompoundTag tag) {
      SpawnGroupData retval = super.m_6518_(world, difficulty, reason, livingdata, tag);
      GronckleMaleOnInitialEntitySpawnProcedure.execute(this);
      return retval;
   }

   public <T> LazyOptional<T> getCapability(@Nonnull Capability<T> capability, @Nullable Direction side) {
      return this.m_6084_() && capability == ForgeCapabilities.ITEM_HANDLER && side == null ? LazyOptional.of(() -> {
         return this.combined;
      }).cast() : super.getCapability(capability, side);
   }

   protected void m_5907_() {
      super.m_5907_();

      for(int i = 0; i < this.inventory.getSlots(); ++i) {
         ItemStack itemstack = this.inventory.getStackInSlot(i);
         if (!itemstack.m_41619_() && !EnchantmentHelper.m_44924_(itemstack)) {
            this.m_19983_(itemstack);
         }
      }

   }

   public void m_7380_(CompoundTag compound) {
      super.m_7380_(compound);
      compound.m_128365_("InventoryCustom", this.inventory.serializeNBT());
   }

   public void m_7378_(CompoundTag compound) {
      super.m_7378_(compound);
      Tag inventoryCustom = compound.m_128423_("InventoryCustom");
      if (inventoryCustom instanceof CompoundTag) {
         CompoundTag inventoryTag = (CompoundTag)inventoryCustom;
         this.inventory.deserializeNBT(inventoryTag);
      }

   }

   public InteractionResult m_6071_(final Player sourceentity, InteractionHand hand) {
      ItemStack itemstack = sourceentity.m_21120_(hand);
      InteractionResult retval = InteractionResult.m_19078_(this.f_19853_.m_5776_());
      if (sourceentity.m_36341_()) {
         if (sourceentity instanceof ServerPlayer) {
            ServerPlayer serverPlayer = (ServerPlayer)sourceentity;
            NetworkHooks.openScreen(serverPlayer, new MenuProvider() {
               public Component m_5446_() {
                  return Component.m_237113_("Male Gronckle");
               }

               public AbstractContainerMenu m_7208_(int id, Inventory inventory, Player player) {
                  FriendlyByteBuf packetBuffer = new FriendlyByteBuf(Unpooled.buffer());
                  packetBuffer.m_130064_(sourceentity.m_20183_());
                  packetBuffer.writeByte(0);
                  packetBuffer.m_130130_(GronckleMaleEntity.this.m_19879_());
                  return new MaleGronckleGUIMenu(id, inventory, packetBuffer);
               }
            }, (buf) -> {
               buf.m_130064_(sourceentity.m_20183_());
               buf.writeByte(0);
               buf.m_130130_(this.m_19879_());
            });
         }

         return InteractionResult.m_19078_(this.f_19853_.m_5776_());
      } else {
         Item item = itemstack.m_41720_();
         if (itemstack.m_41720_() instanceof SpawnEggItem) {
            retval = super.m_6071_(sourceentity, hand);
         } else if (this.f_19853_.m_5776_()) {
            retval = (!this.m_21824_() || !this.m_21830_(sourceentity)) && !this.m_6898_(itemstack) ? InteractionResult.PASS : InteractionResult.m_19078_(this.f_19853_.m_5776_());
         } else if (this.m_21824_()) {
            if (this.m_21830_(sourceentity)) {
               if (item.m_41472_() && this.m_6898_(itemstack) && this.m_21223_() < this.m_21233_()) {
                  this.m_142075_(sourceentity, hand, itemstack);
                  this.m_5634_((float)item.m_41473_().m_38744_());
                  retval = InteractionResult.m_19078_(this.f_19853_.m_5776_());
               } else if (this.m_6898_(itemstack) && this.m_21223_() < this.m_21233_()) {
                  this.m_142075_(sourceentity, hand, itemstack);
                  this.m_5634_(4.0F);
                  retval = InteractionResult.m_19078_(this.f_19853_.m_5776_());
               } else {
                  retval = super.m_6071_(sourceentity, hand);
               }
            }
         } else if (this.m_6898_(itemstack)) {
            this.m_142075_(sourceentity, hand, itemstack);
            if (this.f_19796_.m_188503_(3) == 0 && !ForgeEventFactory.onAnimalTame(this, sourceentity)) {
               this.m_21828_(sourceentity);
               this.f_19853_.m_7605_(this, (byte)7);
            } else {
               this.f_19853_.m_7605_(this, (byte)6);
            }

            this.m_21530_();
            retval = InteractionResult.m_19078_(this.f_19853_.m_5776_());
         } else {
            retval = super.m_6071_(sourceentity, hand);
            if (retval == InteractionResult.SUCCESS || retval == InteractionResult.CONSUME) {
               this.m_21530_();
            }
         }

         return retval;
      }
   }

   public void m_6075_() {
      super.m_6075_();
      GronckleFlyingTickUpdateProcedure.execute(this);
      this.m_6210_();
   }

   public EntityDimensions m_6972_(Pose p_33597_) {
      return super.m_6972_(p_33597_).m_20388_(1.0F);
   }

   public void m_7023_(Vec3 dir) {
      Entity entity = this.m_20197_().isEmpty() ? null : (Entity)this.m_20197_().get(0);
      if (this.m_20160_()) {
         this.m_146922_(entity.m_146908_());
         this.f_19859_ = this.m_146908_();
         this.m_146926_(entity.m_146909_() * 0.5F);
         this.m_19915_(this.m_146908_(), this.m_146909_());
         this.f_20883_ = entity.m_146908_();
         this.f_20885_ = entity.m_146908_();
         this.f_19793_ = 1.0F;
         if (entity instanceof LivingEntity) {
            LivingEntity passenger = (LivingEntity)entity;
            this.m_7910_((float)this.m_21133_(Attributes.f_22279_));
            float forward = passenger.f_20902_;
            float strafe = passenger.f_20900_;
            super.m_7023_(new Vec3((double)strafe, 0.0D, (double)forward));
         }

         double d1 = this.m_20185_() - this.f_19854_;
         double d0 = this.m_20189_() - this.f_19856_;
         float f1 = (float)Math.sqrt(d1 * d1 + d0 * d0) * 4.0F;
         if (f1 > 1.0F) {
            f1 = 1.0F;
         }

         this.f_267362_.m_267771_(this.f_267362_.m_267731_() + (f1 - this.f_267362_.m_267731_()) * 0.4F);
         this.f_267362_.m_267590_(this.f_267362_.m_267756_() + this.f_267362_.m_267731_());
         this.m_267651_(true);
      } else {
         this.f_19793_ = 0.5F;
         super.m_7023_(dir);
      }
   }

   public AgeableMob m_142606_(ServerLevel serverWorld, AgeableMob ageable) {
      GronckleMaleEntity retval = (GronckleMaleEntity)((EntityType)HowToOwnADragonModEntities.GRONCKLE_MALE.get()).m_20615_(serverWorld);
      retval.m_6518_(serverWorld, serverWorld.m_6436_(retval.m_20183_()), MobSpawnType.BREEDING, (SpawnGroupData)null, (CompoundTag)null);
      return retval;
   }

   public boolean m_6898_(ItemStack stack) {
      return List.of().contains(stack.m_41720_());
   }

   protected void m_7840_(double y, boolean onGroundIn, BlockState state, BlockPos pos) {
   }

   public void m_20242_(boolean ignored) {
      super.m_20242_(true);
   }

   public void m_8107_() {
      super.m_8107_();
      this.m_21203_();
      this.m_20242_(true);
   }

   public static void init() {
      SpawnPlacements.m_21754_((EntityType)HowToOwnADragonModEntities.GRONCKLE_MALE.get(), Type.ON_GROUND, Types.MOTION_BLOCKING_NO_LEAVES, (entityType, world, reason, pos, random) -> {
         return world.m_8055_(pos.m_7495_()).m_60767_() == Material.f_76315_ && world.m_45524_(pos, 0) > 8;
      });
   }

   public static Builder createAttributes() {
      Builder builder = Mob.m_21552_();
      builder = builder.m_22268_(Attributes.f_22279_, 0.3D);
      builder = builder.m_22268_(Attributes.f_22276_, 10.0D);
      builder = builder.m_22268_(Attributes.f_22284_, 0.0D);
      builder = builder.m_22268_(Attributes.f_22281_, 3.0D);
      builder = builder.m_22268_(Attributes.f_22277_, 16.0D);
      builder = builder.m_22268_(Attributes.f_22280_, 0.3D);
      return builder;
   }

   private PlayState movementPredicate(AnimationState event) {
      if (!this.animationprocedure.equals("empty")) {
         return PlayState.STOP;
      } else if ((event.isMoving() || !(event.getLimbSwingAmount() > -0.15F) || !(event.getLimbSwingAmount() < 0.15F)) && this.m_20096_() && !this.m_20160_()) {
         return event.setAndContinue(RawAnimation.begin().thenLoop("animation.gronckle.walk"));
      } else if (this.m_21224_()) {
         return event.setAndContinue(RawAnimation.begin().thenPlay("animation.gronckle.death"));
      } else if (this.m_6144_()) {
         return event.setAndContinue(RawAnimation.begin().thenLoop("animation.gronckle.sneak"));
      } else if (this.m_20142_()) {
         return event.setAndContinue(RawAnimation.begin().thenLoop("animation.gronckle.sprint"));
      } else if (!this.m_20096_()) {
         return event.setAndContinue(RawAnimation.begin().thenLoop("animation.gronckle.flight"));
      } else {
         return this.m_20160_() && event.isMoving() ? event.setAndContinue(RawAnimation.begin().thenLoop("animation.gronckle.sprint")) : event.setAndContinue(RawAnimation.begin().thenLoop("animation.gronckle.idle"));
      }
   }

   private PlayState attackingPredicate(AnimationState event) {
      double d1 = this.m_20185_() - this.f_19790_;
      double d0 = this.m_20189_() - this.f_19792_;
      float velocity = (float)Math.sqrt(d1 * d1 + d0 * d0);
      if (this.m_21324_(event.getPartialTick()) > 0.0F && !this.swinging) {
         this.swinging = true;
         this.lastSwing = this.f_19853_.m_46467_();
      }

      if (this.swinging && this.lastSwing + 7L <= this.f_19853_.m_46467_()) {
         this.swinging = false;
      }

      if (this.swinging && event.getController().getAnimationState() == State.STOPPED) {
         event.getController().forceAnimationReset();
         return event.setAndContinue(RawAnimation.begin().thenPlay("animation.gronckle.walk"));
      } else {
         return PlayState.CONTINUE;
      }
   }

   private PlayState procedurePredicate(AnimationState event) {
      Level world = super.f_19853_;
      boolean loop = false;
      double x = this.m_20185_();
      double y = this.m_20186_();
      double z = this.m_20189_();
      if (!loop && this.lastloop) {
         this.lastloop = false;
         event.getController().setAnimation(RawAnimation.begin().thenPlay(this.animationprocedure));
         event.getController().forceAnimationReset();
         return PlayState.STOP;
      } else {
         if (!this.animationprocedure.equals("empty") && event.getController().getAnimationState() == State.STOPPED) {
            if (!loop) {
               event.getController().setAnimation(RawAnimation.begin().thenPlay(this.animationprocedure));
               if (event.getController().getAnimationState() == State.STOPPED) {
                  this.animationprocedure = "empty";
                  event.getController().forceAnimationReset();
               }
            } else {
               event.getController().setAnimation(RawAnimation.begin().thenLoop(this.animationprocedure));
               this.lastloop = true;
            }
         }

         return PlayState.CONTINUE;
      }
   }

   protected void m_6153_() {
      ++this.f_20919_;
      if (this.f_20919_ == 20) {
         this.m_142687_(RemovalReason.KILLED);
         this.m_21226_();
      }

   }

   public String getSyncedAnimation() {
      return (String)this.f_19804_.m_135370_(ANIMATION);
   }

   public void setAnimation(String animation) {
      this.f_19804_.m_135381_(ANIMATION, animation);
   }

   public void registerControllers(ControllerRegistrar data) {
      data.add(new AnimationController[]{new AnimationController(this, "movement", 4, this::movementPredicate)});
      data.add(new AnimationController[]{new AnimationController(this, "attacking", 4, this::attackingPredicate)});
      data.add(new AnimationController[]{new AnimationController(this, "procedure", 4, this::procedurePredicate)});
   }

   public AnimatableInstanceCache getAnimatableInstanceCache() {
      return this.cache;
   }

   static {
      SHOOT = SynchedEntityData.m_135353_(GronckleMaleEntity.class, EntityDataSerializers.f_135035_);
      ANIMATION = SynchedEntityData.m_135353_(GronckleMaleEntity.class, EntityDataSerializers.f_135030_);
      TEXTURE = SynchedEntityData.m_135353_(GronckleMaleEntity.class, EntityDataSerializers.f_135030_);
   }
}
