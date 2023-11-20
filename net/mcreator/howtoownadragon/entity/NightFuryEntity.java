package net.mcreator.howtoownadragon.entity;

import io.netty.buffer.Unpooled;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import net.mcreator.howtoownadragon.init.HowToOwnADragonModEntities;
import net.mcreator.howtoownadragon.init.HowToOwnADragonModItems;
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
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.util.RandomSource;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.MenuProvider;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.damagesource.DamageTypes;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityDimensions;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.MobType;
import net.minecraft.world.entity.Pose;
import net.minecraft.world.entity.Entity.RemovalReason;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier.Builder;
import net.minecraft.world.entity.ai.control.FlyingMoveControl;
import net.minecraft.world.entity.ai.goal.RandomLookAroundGoal;
import net.minecraft.world.entity.ai.goal.RandomStrollGoal;
import net.minecraft.world.entity.ai.navigation.FlyingPathNavigation;
import net.minecraft.world.entity.ai.navigation.PathNavigation;
import net.minecraft.world.entity.monster.Monster;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.enchantment.EnchantmentHelper;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.Vec3;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.common.capabilities.ForgeCapabilities;
import net.minecraftforge.common.util.LazyOptional;
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

public class NightFuryEntity extends Monster implements GeoEntity {
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

   public NightFuryEntity(SpawnEntity packet, Level world) {
      this((EntityType)HowToOwnADragonModEntities.NIGHT_FURY.get(), world);
   }

   public NightFuryEntity(EntityType<NightFuryEntity> type, Level world) {
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
      this.m_21530_();
      this.f_21342_ = new FlyingMoveControl(this, 10, true);
   }

   protected void m_8097_() {
      super.m_8097_();
      this.f_19804_.m_135372_(SHOOT, false);
      this.f_19804_.m_135372_(ANIMATION, "undefined");
      this.f_19804_.m_135372_(TEXTURE, "nightfuryskin");
   }

   public void setTexture(String texture) {
      this.f_19804_.m_135381_(TEXTURE, texture);
   }

   public String getTexture() {
      return (String)this.f_19804_.m_135370_(TEXTURE);
   }

   public Packet<ClientGamePacketListener> m_5654_() {
      return NetworkHooks.getEntitySpawningPacket(this);
   }

   protected PathNavigation m_6037_(Level world) {
      return new FlyingPathNavigation(this, world);
   }

   protected void m_8099_() {
      super.m_8099_();
      this.f_21345_.m_25352_(1, new RandomStrollGoal(this, 1.0D));
      this.f_21345_.m_25352_(2, new RandomStrollGoal(this, 0.8D, 20) {
         protected Vec3 m_7037_() {
            RandomSource random = NightFuryEntity.this.m_217043_();
            double dir_x = NightFuryEntity.this.m_20185_() + (double)((random.m_188501_() * 2.0F - 1.0F) * 16.0F);
            double dir_y = NightFuryEntity.this.m_20186_() + (double)((random.m_188501_() * 2.0F - 1.0F) * 16.0F);
            double dir_z = NightFuryEntity.this.m_20189_() + (double)((random.m_188501_() * 2.0F - 1.0F) * 16.0F);
            return new Vec3(dir_x, dir_y, dir_z);
         }
      });
      this.f_21345_.m_25352_(3, new RandomLookAroundGoal(this));
   }

   public MobType m_6336_() {
      return MobType.f_21640_;
   }

   public boolean m_6785_(double distanceToClosestPlayer) {
      return false;
   }

   protected void m_7472_(DamageSource source, int looting, boolean recentlyHitIn) {
      super.m_7472_(source, looting, recentlyHitIn);
      this.m_19983_(new ItemStack((ItemLike)HowToOwnADragonModItems.NIGHT_FURY_SCALE.get()));
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
      } else if (source.m_276093_(DamageTypes.f_268671_)) {
         return false;
      } else {
         return source.m_276093_(DamageTypes.f_268450_) ? false : super.m_6469_(source, amount);
      }
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
      sourceentity.m_21120_(hand);
      InteractionResult retval = InteractionResult.m_19078_(this.f_19853_.m_5776_());
      if (sourceentity.m_36341_()) {
         if (sourceentity instanceof ServerPlayer) {
            ServerPlayer serverPlayer = (ServerPlayer)sourceentity;
            NetworkHooks.openScreen(serverPlayer, new MenuProvider() {
               public Component m_5446_() {
                  return Component.m_237113_("Night Fury");
               }

               public AbstractContainerMenu m_7208_(int id, Inventory inventory, Player player) {
                  FriendlyByteBuf packetBuffer = new FriendlyByteBuf(Unpooled.buffer());
                  packetBuffer.m_130064_(sourceentity.m_20183_());
                  packetBuffer.writeByte(0);
                  packetBuffer.m_130130_(NightFuryEntity.this.m_19879_());
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
         super.m_6071_(sourceentity, hand);
         sourceentity.m_20329_(this);
         return retval;
      }
   }

   public void m_6075_() {
      super.m_6075_();
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

   protected void m_7840_(double y, boolean onGroundIn, BlockState state, BlockPos pos) {
   }

   public void m_20242_(boolean ignored) {
      super.m_20242_(true);
   }

   public void m_8107_() {
      super.m_8107_();
      this.m_20242_(true);
   }

   public static void init() {
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
         return event.setAndContinue(RawAnimation.begin().thenLoop("animation.nightfury.runwalk"));
      } else if (this.m_20142_()) {
         return event.setAndContinue(RawAnimation.begin().thenLoop("animation.nightfury.runwalk"));
      } else if (!this.m_20096_()) {
         return event.setAndContinue(RawAnimation.begin().thenLoop("animation.nightfury.flying"));
      } else {
         return this.m_20160_() && event.isMoving() ? event.setAndContinue(RawAnimation.begin().thenLoop("animation.nightfury.runwalk")) : event.setAndContinue(RawAnimation.begin().thenLoop("animation.nightfury.idle"));
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
      data.add(new AnimationController[]{new AnimationController(this, "procedure", 4, this::procedurePredicate)});
   }

   public AnimatableInstanceCache getAnimatableInstanceCache() {
      return this.cache;
   }

   static {
      SHOOT = SynchedEntityData.m_135353_(NightFuryEntity.class, EntityDataSerializers.f_135035_);
      ANIMATION = SynchedEntityData.m_135353_(NightFuryEntity.class, EntityDataSerializers.f_135030_);
      TEXTURE = SynchedEntityData.m_135353_(NightFuryEntity.class, EntityDataSerializers.f_135030_);
   }
}
