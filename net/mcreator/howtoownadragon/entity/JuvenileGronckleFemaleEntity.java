package net.mcreator.howtoownadragon.entity;

import java.util.List;
import javax.annotation.Nullable;
import net.mcreator.howtoownadragon.init.HowToOwnADragonModEntities;
import net.mcreator.howtoownadragon.procedures.GronckleGrowingTickRateProcedure;
import net.mcreator.howtoownadragon.procedures.NotGrownGronckleDiesProcedureProcedure;
import net.minecraft.core.BlockPos;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.protocol.Packet;
import net.minecraft.network.protocol.game.ClientGamePacketListener;
import net.minecraft.network.syncher.EntityDataAccessor;
import net.minecraft.network.syncher.EntityDataSerializers;
import net.minecraft.network.syncher.SynchedEntityData;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.util.RandomSource;
import net.minecraft.world.DifficultyInstance;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.damagesource.DamageTypes;
import net.minecraft.world.entity.AgeableMob;
import net.minecraft.world.entity.EntityDimensions;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.MobType;
import net.minecraft.world.entity.Pose;
import net.minecraft.world.entity.SpawnGroupData;
import net.minecraft.world.entity.TamableAnimal;
import net.minecraft.world.entity.Entity.RemovalReason;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier.Builder;
import net.minecraft.world.entity.ai.control.FlyingMoveControl;
import net.minecraft.world.entity.ai.goal.RandomLookAroundGoal;
import net.minecraft.world.entity.ai.goal.RandomStrollGoal;
import net.minecraft.world.entity.ai.navigation.FlyingPathNavigation;
import net.minecraft.world.entity.ai.navigation.PathNavigation;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.SpawnEggItem;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.ServerLevelAccessor;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.Vec3;
import net.minecraftforge.event.ForgeEventFactory;
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

public class JuvenileGronckleFemaleEntity extends TamableAnimal implements GeoEntity {
   public static final EntityDataAccessor<Boolean> SHOOT;
   public static final EntityDataAccessor<String> ANIMATION;
   public static final EntityDataAccessor<String> TEXTURE;
   private final AnimatableInstanceCache cache;
   private boolean swinging;
   private boolean lastloop;
   private long lastSwing;
   public String animationprocedure;

   public JuvenileGronckleFemaleEntity(SpawnEntity packet, Level world) {
      this((EntityType)HowToOwnADragonModEntities.JUVENILE_GRONCKLE_FEMALE.get(), world);
   }

   public JuvenileGronckleFemaleEntity(EntityType<JuvenileGronckleFemaleEntity> type, Level world) {
      super(type, world);
      this.cache = GeckoLibUtil.createInstanceCache(this);
      this.animationprocedure = "empty";
      this.f_21364_ = 0;
      this.m_21557_(false);
      this.m_21530_();
      this.f_21342_ = new FlyingMoveControl(this, 10, true);
   }

   protected void m_8097_() {
      super.m_8097_();
      this.f_19804_.m_135372_(SHOOT, false);
      this.f_19804_.m_135372_(ANIMATION, "undefined");
      this.f_19804_.m_135372_(TEXTURE, "juvimeatlug");
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
      this.f_21345_.m_25352_(1, new RandomStrollGoal(this, 0.8D));
      this.f_21345_.m_25352_(2, new RandomLookAroundGoal(this));
      this.f_21345_.m_25352_(3, new RandomStrollGoal(this, 0.8D, 20) {
         protected Vec3 m_7037_() {
            RandomSource random = JuvenileGronckleFemaleEntity.this.m_217043_();
            double dir_x = JuvenileGronckleFemaleEntity.this.m_20185_() + (double)((random.m_188501_() * 2.0F - 1.0F) * 16.0F);
            double dir_y = JuvenileGronckleFemaleEntity.this.m_20186_() + (double)((random.m_188501_() * 2.0F - 1.0F) * 16.0F);
            double dir_z = JuvenileGronckleFemaleEntity.this.m_20189_() + (double)((random.m_188501_() * 2.0F - 1.0F) * 16.0F);
            return new Vec3(dir_x, dir_y, dir_z);
         }
      });
   }

   public MobType m_6336_() {
      return MobType.f_21640_;
   }

   public boolean m_6785_(double distanceToClosestPlayer) {
      return false;
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

   public void m_6667_(DamageSource source) {
      super.m_6667_(source);
      NotGrownGronckleDiesProcedureProcedure.execute(this.f_19853_, this.m_20185_(), this.m_20186_(), this.m_20189_());
   }

   public SpawnGroupData m_6518_(ServerLevelAccessor world, DifficultyInstance difficulty, MobSpawnType reason, @Nullable SpawnGroupData livingdata, @Nullable CompoundTag tag) {
      SpawnGroupData retval = super.m_6518_(world, difficulty, reason, livingdata, tag);
      GronckleGrowingTickRateProcedure.execute(world, this.m_20185_(), this.m_20186_(), this.m_20189_(), this);
      return retval;
   }

   public InteractionResult m_6071_(Player sourceentity, InteractionHand hand) {
      ItemStack itemstack = sourceentity.m_21120_(hand);
      InteractionResult retval = InteractionResult.m_19078_(this.f_19853_.m_5776_());
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

   public void m_6075_() {
      super.m_6075_();
      this.m_6210_();
   }

   public EntityDimensions m_6972_(Pose p_33597_) {
      return super.m_6972_(p_33597_).m_20388_(1.0F);
   }

   public AgeableMob m_142606_(ServerLevel serverWorld, AgeableMob ageable) {
      JuvenileGronckleFemaleEntity retval = (JuvenileGronckleFemaleEntity)((EntityType)HowToOwnADragonModEntities.JUVENILE_GRONCKLE_FEMALE.get()).m_20615_(serverWorld);
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
      } else if ((event.isMoving() || !(event.getLimbSwingAmount() > -0.15F) || !(event.getLimbSwingAmount() < 0.15F)) && this.m_20096_()) {
         return event.setAndContinue(RawAnimation.begin().thenLoop("animation.juvigronckle.walk"));
      } else {
         return !this.m_20096_() ? event.setAndContinue(RawAnimation.begin().thenLoop("animation.juvigronckle.flight")) : event.setAndContinue(RawAnimation.begin().thenLoop("animation.juvigronckle.idle"));
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
      SHOOT = SynchedEntityData.m_135353_(JuvenileGronckleFemaleEntity.class, EntityDataSerializers.f_135035_);
      ANIMATION = SynchedEntityData.m_135353_(JuvenileGronckleFemaleEntity.class, EntityDataSerializers.f_135030_);
      TEXTURE = SynchedEntityData.m_135353_(JuvenileGronckleFemaleEntity.class, EntityDataSerializers.f_135030_);
   }
}
