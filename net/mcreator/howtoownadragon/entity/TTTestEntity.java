package net.mcreator.howtoownadragon.entity;

import javax.annotation.Nullable;
import net.mcreator.howtoownadragon.init.HowToOwnADragonModEntities;
import net.mcreator.howtoownadragon.procedures.AllFollowMeTriggerProcedure;
import net.mcreator.howtoownadragon.procedures.DontAllFollowMeTriggerProcedure;
import net.mcreator.howtoownadragon.procedures.GrownTTDiesProcedureProcedure;
import net.mcreator.howtoownadragon.procedures.MaleOnInitialEntitySpawnTTProcedure;
import net.mcreator.howtoownadragon.procedures.ValkaFollowMeTriggerProcedure;
import net.mcreator.howtoownadragon.procedures.WildAIProcedure;
import net.mcreator.howtoownadragon.procedures.WildDayAIProcedure;
import net.mcreator.howtoownadragon.procedures.WildNightAIProcedure;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.protocol.Packet;
import net.minecraft.network.protocol.game.ClientGamePacketListener;
import net.minecraft.network.syncher.EntityDataAccessor;
import net.minecraft.network.syncher.EntityDataSerializers;
import net.minecraft.network.syncher.SynchedEntityData;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.DifficultyInstance;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.damagesource.DamageTypes;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityDimensions;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.MobType;
import net.minecraft.world.entity.Pose;
import net.minecraft.world.entity.SpawnGroupData;
import net.minecraft.world.entity.Entity.RemovalReason;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier.Builder;
import net.minecraft.world.entity.ai.goal.FloatGoal;
import net.minecraft.world.entity.ai.goal.LookAtPlayerGoal;
import net.minecraft.world.entity.ai.goal.RandomLookAroundGoal;
import net.minecraft.world.entity.ai.goal.RandomStrollGoal;
import net.minecraft.world.entity.ai.goal.TemptGoal;
import net.minecraft.world.entity.ai.goal.WaterAvoidingRandomStrollGoal;
import net.minecraft.world.entity.monster.Monster;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.ServerLevelAccessor;
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

public class TTTestEntity extends Monster implements GeoEntity {
   public static final EntityDataAccessor<Boolean> SHOOT;
   public static final EntityDataAccessor<String> ANIMATION;
   public static final EntityDataAccessor<String> TEXTURE;
   private final AnimatableInstanceCache cache;
   private boolean swinging;
   private boolean lastloop;
   private long lastSwing;
   public String animationprocedure;

   public TTTestEntity(SpawnEntity packet, Level world) {
      this((EntityType)HowToOwnADragonModEntities.TT_TEST.get(), world);
   }

   public TTTestEntity(EntityType<TTTestEntity> type, Level world) {
      super(type, world);
      this.cache = GeckoLibUtil.createInstanceCache(this);
      this.animationprocedure = "empty";
      this.f_21364_ = 0;
      this.m_21557_(false);
      this.m_21530_();
   }

   protected void m_8097_() {
      super.m_8097_();
      this.f_19804_.m_135372_(SHOOT, false);
      this.f_19804_.m_135372_(ANIMATION, "undefined");
      this.f_19804_.m_135372_(TEXTURE, "greentt");
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

   protected void m_8099_() {
      super.m_8099_();
      this.f_21345_.m_25352_(2, new LookAtPlayerGoal(this, Player.class, 6.0F) {
         public boolean m_8036_() {
            double x = TTTestEntity.this.m_20185_();
            double y = TTTestEntity.this.m_20186_();
            double z = TTTestEntity.this.m_20189_();
            Entity entity = TTTestEntity.this;
            Level world = TTTestEntity.this.f_19853_;
            return super.m_8036_() && ValkaFollowMeTriggerProcedure.execute(world, entity);
         }
      });
      this.f_21345_.m_25352_(4, new LookAtPlayerGoal(this, Player.class, 6.0F) {
         public boolean m_8036_() {
            double x = TTTestEntity.this.m_20185_();
            double y = TTTestEntity.this.m_20186_();
            double z = TTTestEntity.this.m_20189_();
            Entity entity = TTTestEntity.this;
            Level world = TTTestEntity.this.f_19853_;
            return super.m_8036_() && AllFollowMeTriggerProcedure.execute(world, entity);
         }
      });
      this.f_21345_.m_25352_(5, new TemptGoal(this, 1.0D, Ingredient.m_43929_(new ItemLike[]{Items.f_42406_}), true) {
         public boolean m_8036_() {
            double x = TTTestEntity.this.m_20185_();
            double y = TTTestEntity.this.m_20186_();
            double z = TTTestEntity.this.m_20189_();
            Entity entity = TTTestEntity.this;
            Level world = TTTestEntity.this.f_19853_;
            return super.m_8036_() && WildAIProcedure.execute(entity);
         }
      });
      this.f_21345_.m_25352_(6, new TemptGoal(this, 1.0D, Ingredient.m_43929_(new ItemLike[]{Items.f_42526_}), true) {
         public boolean m_8036_() {
            double x = TTTestEntity.this.m_20185_();
            double y = TTTestEntity.this.m_20186_();
            double z = TTTestEntity.this.m_20189_();
            Entity entity = TTTestEntity.this;
            Level world = TTTestEntity.this.f_19853_;
            return super.m_8036_() && WildAIProcedure.execute(entity);
         }
      });
      this.f_21345_.m_25352_(7, new TemptGoal(this, 1.0D, Ingredient.m_43929_(new ItemLike[]{Items.f_42527_}), true) {
         public boolean m_8036_() {
            double x = TTTestEntity.this.m_20185_();
            double y = TTTestEntity.this.m_20186_();
            double z = TTTestEntity.this.m_20189_();
            Entity entity = TTTestEntity.this;
            Level world = TTTestEntity.this.f_19853_;
            return super.m_8036_() && WildAIProcedure.execute(entity);
         }
      });
      this.f_21345_.m_25352_(8, new TemptGoal(this, 1.0D, Ingredient.m_43929_(new ItemLike[]{Items.f_42582_}), true) {
         public boolean m_8036_() {
            double x = TTTestEntity.this.m_20185_();
            double y = TTTestEntity.this.m_20186_();
            double z = TTTestEntity.this.m_20189_();
            Entity entity = TTTestEntity.this;
            Level world = TTTestEntity.this.f_19853_;
            return super.m_8036_() && WildAIProcedure.execute(entity);
         }
      });
      this.f_21345_.m_25352_(9, new RandomStrollGoal(this, 1.0D) {
         public boolean m_8036_() {
            double x = TTTestEntity.this.m_20185_();
            double y = TTTestEntity.this.m_20186_();
            double z = TTTestEntity.this.m_20189_();
            Entity entity = TTTestEntity.this;
            Level world = TTTestEntity.this.f_19853_;
            return super.m_8036_() && WildDayAIProcedure.execute(world, entity);
         }
      });
      this.f_21345_.m_25352_(10, new RandomLookAroundGoal(this) {
         public boolean m_8036_() {
            double x = TTTestEntity.this.m_20185_();
            double y = TTTestEntity.this.m_20186_();
            double z = TTTestEntity.this.m_20189_();
            Entity entity = TTTestEntity.this;
            Level world = TTTestEntity.this.f_19853_;
            return super.m_8036_() && WildNightAIProcedure.execute(world, entity);
         }
      });
      this.f_21345_.m_25352_(11, new FloatGoal(this) {
         public boolean m_8036_() {
            double x = TTTestEntity.this.m_20185_();
            double y = TTTestEntity.this.m_20186_();
            double z = TTTestEntity.this.m_20189_();
            Entity entity = TTTestEntity.this;
            Level world = TTTestEntity.this.f_19853_;
            return super.m_8036_() && DontAllFollowMeTriggerProcedure.execute(world, entity);
         }
      });
      this.f_21345_.m_25352_(12, new WaterAvoidingRandomStrollGoal(this, 0.8D) {
         public boolean m_8036_() {
            double x = TTTestEntity.this.m_20185_();
            double y = TTTestEntity.this.m_20186_();
            double z = TTTestEntity.this.m_20189_();
            Entity entity = TTTestEntity.this;
            Level world = TTTestEntity.this.f_19853_;
            return super.m_8036_() && WildDayAIProcedure.execute(world, entity);
         }
      });
   }

   public MobType m_6336_() {
      return MobType.f_21640_;
   }

   public boolean m_6785_(double distanceToClosestPlayer) {
      return false;
   }

   public SoundEvent m_7975_(DamageSource ds) {
      return (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.generic.hurt"));
   }

   public SoundEvent m_5592_() {
      return (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.generic.death"));
   }

   public boolean m_6469_(DamageSource source, float amount) {
      return source.m_276093_(DamageTypes.f_268671_) ? false : super.m_6469_(source, amount);
   }

   public void m_6667_(DamageSource source) {
      super.m_6667_(source);
      GrownTTDiesProcedureProcedure.execute(this.f_19853_, this.m_20185_(), this.m_20186_(), this.m_20189_());
   }

   public SpawnGroupData m_6518_(ServerLevelAccessor world, DifficultyInstance difficulty, MobSpawnType reason, @Nullable SpawnGroupData livingdata, @Nullable CompoundTag tag) {
      SpawnGroupData retval = super.m_6518_(world, difficulty, reason, livingdata, tag);
      MaleOnInitialEntitySpawnTTProcedure.execute(world, this.m_20185_(), this.m_20186_(), this.m_20189_(), this);
      return retval;
   }

   public void m_6075_() {
      super.m_6075_();
      this.m_6210_();
   }

   public EntityDimensions m_6972_(Pose p_33597_) {
      return super.m_6972_(p_33597_).m_20388_(1.0F);
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
      return builder;
   }

   private PlayState movementPredicate(AnimationState event) {
      if (this.animationprocedure.equals("empty")) {
         return !event.isMoving() && event.getLimbSwingAmount() > -0.15F && event.getLimbSwingAmount() < 0.15F ? event.setAndContinue(RawAnimation.begin().thenLoop("animation.tt.idle")) : event.setAndContinue(RawAnimation.begin().thenLoop("animation.tt.walk"));
      } else {
         return PlayState.STOP;
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
      SHOOT = SynchedEntityData.m_135353_(TTTestEntity.class, EntityDataSerializers.f_135035_);
      ANIMATION = SynchedEntityData.m_135353_(TTTestEntity.class, EntityDataSerializers.f_135030_);
      TEXTURE = SynchedEntityData.m_135353_(TTTestEntity.class, EntityDataSerializers.f_135030_);
   }
}
