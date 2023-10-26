
package net.mcreator.howtoownadragon.entity;

import net.minecraft.world.entity.ai.attributes.Attribute;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.level.material.Material;
import net.minecraft.nbt.Tag;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.network.syncher.EntityDataAccessor;
import net.minecraft.network.syncher.EntityDataSerializers;
import net.minecraft.network.syncher.SynchedEntityData;

import javax.annotation.Nullable;

import software.bernie.geckolib.core.animation.AnimatableManager;
import software.bernie.geckolib.core.animation.AnimationState;

public class TTTestEntity extends Monster implements GeoEntity {
	public static final EntityDataAccessor<Boolean> SHOOT = SynchedEntityData.defineId(TTTestEntity.class, EntityDataSerializers.BOOLEAN);
	public static final EntityDataAccessor<String> ANIMATION = SynchedEntityData.defineId(TTTestEntity.class, EntityDataSerializers.STRING);
	public static final EntityDataAccessor<String> TEXTURE = SynchedEntityData.defineId(TTTestEntity.class, EntityDataSerializers.STRING);
	private final AnimatableInstanceCache cache = GeckoLibUtil.createInstanceCache(this);
	private boolean swinging;
	private boolean lastloop;
	private long lastSwing;
	public String animationprocedure = "empty";

	public TTTestEntity(PlayMessages.SpawnEntity packet, Level world) {
		this(HowToOwnADragonModEntities.TT_TEST.get(), world);
	}

	public TTTestEntity(EntityType<TTTestEntity> type, Level world) {
		super(type, world);
		xpReward = 0;
		setNoAi(false);

		setPersistenceRequired();

	}

	@Override
	protected void defineSynchedData() {
		super.defineSynchedData();
		this.entityData.define(SHOOT, false);
		this.entityData.define(ANIMATION, "undefined");
		this.entityData.define(TEXTURE, "greentt");
	}

	public void setTexture(String texture) {
		this.entityData.set(TEXTURE, texture);
	}

	public String getTexture() {
		return this.entityData.get(TEXTURE);
	}

	@Override
	public Packet<ClientGamePacketListener> getAddEntityPacket() {
		return NetworkHooks.getEntitySpawningPacket(this);
	}

	@Override
	protected void registerGoals() {
		super.registerGoals();

		this.goalSelector.addGoal(2, new LookAtPlayerGoal(this, Player.class, (float) 6) {
			@Override
			public boolean canUse() {
				double x = TTTestEntity.this.getX();
				double y = TTTestEntity.this.getY();
				double z = TTTestEntity.this.getZ();
				Entity entity = TTTestEntity.this;
				Level world = TTTestEntity.this.level;
				return super.canUse() &&

						ValkaFollowMeTriggerProcedure.execute(world, entity)

				;
			}
		});
		this.goalSelector.addGoal(4, new LookAtPlayerGoal(this, Player.class, (float) 6) {
			@Override
			public boolean canUse() {
				double x = TTTestEntity.this.getX();
				double y = TTTestEntity.this.getY();
				double z = TTTestEntity.this.getZ();
				Entity entity = TTTestEntity.this;
				Level world = TTTestEntity.this.level;
				return super.canUse() &&

						AllFollowMeTriggerProcedure.execute(world, entity)

				;
			}
		});
		this.goalSelector.addGoal(5, new TemptGoal(this, 1, Ingredient.of(Items.BREAD), true) {
			@Override
			public boolean canUse() {
				double x = TTTestEntity.this.getX();
				double y = TTTestEntity.this.getY();
				double z = TTTestEntity.this.getZ();
				Entity entity = TTTestEntity.this;
				Level world = TTTestEntity.this.level;
				return super.canUse() &&

						WildAIProcedure.execute()

				;
			}
		});
		this.goalSelector.addGoal(6, new TemptGoal(this, 1, Ingredient.of(Items.COD), true) {
			@Override
			public boolean canUse() {
				double x = TTTestEntity.this.getX();
				double y = TTTestEntity.this.getY();
				double z = TTTestEntity.this.getZ();
				Entity entity = TTTestEntity.this;
				Level world = TTTestEntity.this.level;
				return super.canUse() &&

						WildAIProcedure.execute()

				;
			}
		});
		this.goalSelector.addGoal(7, new TemptGoal(this, 1, Ingredient.of(Items.SALMON), true) {
			@Override
			public boolean canUse() {
				double x = TTTestEntity.this.getX();
				double y = TTTestEntity.this.getY();
				double z = TTTestEntity.this.getZ();
				Entity entity = TTTestEntity.this;
				Level world = TTTestEntity.this.level;
				return super.canUse() &&

						WildAIProcedure.execute()

				;
			}
		});
		this.goalSelector.addGoal(8, new TemptGoal(this, 1, Ingredient.of(Items.COOKED_CHICKEN), true) {
			@Override
			public boolean canUse() {
				double x = TTTestEntity.this.getX();
				double y = TTTestEntity.this.getY();
				double z = TTTestEntity.this.getZ();
				Entity entity = TTTestEntity.this;
				Level world = TTTestEntity.this.level;
				return super.canUse() &&

						WildAIProcedure.execute()

				;
			}
		});
		this.goalSelector.addGoal(9, new RandomStrollGoal(this, 1) {
			@Override
			public boolean canUse() {
				double x = TTTestEntity.this.getX();
				double y = TTTestEntity.this.getY();
				double z = TTTestEntity.this.getZ();
				Entity entity = TTTestEntity.this;
				Level world = TTTestEntity.this.level;
				return super.canUse() &&

						WildDayAIProcedure.execute()

				;
			}
		});
		this.goalSelector.addGoal(10, new RandomLookAroundGoal(this) {
			@Override
			public boolean canUse() {
				double x = TTTestEntity.this.getX();
				double y = TTTestEntity.this.getY();
				double z = TTTestEntity.this.getZ();
				Entity entity = TTTestEntity.this;
				Level world = TTTestEntity.this.level;
				return super.canUse() &&

						WildNightAIProcedure.execute()

				;
			}
		});
		this.goalSelector.addGoal(11, new FloatGoal(this) {
			@Override
			public boolean canUse() {
				double x = TTTestEntity.this.getX();
				double y = TTTestEntity.this.getY();
				double z = TTTestEntity.this.getZ();
				Entity entity = TTTestEntity.this;
				Level world = TTTestEntity.this.level;
				return super.canUse() &&

						DontAllFollowMeTriggerProcedure.execute(world, entity)

				;
			}
		});
		this.goalSelector.addGoal(12, new WaterAvoidingRandomStrollGoal(this, 0.8) {
			@Override
			public boolean canUse() {
				double x = TTTestEntity.this.getX();
				double y = TTTestEntity.this.getY();
				double z = TTTestEntity.this.getZ();
				Entity entity = TTTestEntity.this;
				Level world = TTTestEntity.this.level;
				return super.canUse() &&

						WildDayAIProcedure.execute()

				;
			}
		});

	}

	@Override
	public MobType getMobType() {
		return MobType.UNDEFINED;
	}

	@Override
	public boolean removeWhenFarAway(double distanceToClosestPlayer) {
		return false;
	}

	@Override
	public SoundEvent getHurtSound(DamageSource ds) {
		return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.generic.hurt"));
	}

	@Override
	public SoundEvent getDeathSound() {
		return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.generic.death"));
	}

	@Override
	public boolean hurt(DamageSource source, float amount) {
		if (source.is(DamageTypes.FALL))
			return false;
		return super.hurt(source, amount);
	}

	@Override
	public void die(DamageSource source) {
		super.die(source);
		GrownTTDiesProcedureProcedure.execute(

		);
	}

	@Override
	public SpawnGroupData finalizeSpawn(ServerLevelAccessor world, DifficultyInstance difficulty, MobSpawnType reason, @Nullable SpawnGroupData livingdata, @Nullable CompoundTag tag) {
		SpawnGroupData retval = super.finalizeSpawn(world, difficulty, reason, livingdata, tag);
		MaleOnInitialEntitySpawnTTProcedure.execute(

		);
		return retval;
	}

	@Override
	public void baseTick() {
		super.baseTick();
		this.refreshDimensions();
	}

	@Override
	public EntityDimensions getDimensions(Pose p_33597_) {
		return super.getDimensions(p_33597_).scale((float) 1);
	}

	public static void init() {

	}

	public static AttributeSupplier.Builder createAttributes() {
		AttributeSupplier.Builder builder = Mob.createMobAttributes();
		builder = builder.add(Attributes.MOVEMENT_SPEED, 0.3);
		builder = builder.add(Attributes.MAX_HEALTH, 10);
		builder = builder.add(Attributes.ARMOR, 0);
		builder = builder.add(Attributes.ATTACK_DAMAGE, 3);
		builder = builder.add(Attributes.FOLLOW_RANGE, 16);

		return builder;
	}

	private PlayState movementPredicate(AnimationState event) {
		if (this.animationprocedure.equals("empty")) {
			if ((event.isMoving() || !(event.getLimbSwingAmount() > -0.15F && event.getLimbSwingAmount() < 0.15F))

			) {
				return event.setAndContinue(RawAnimation.begin().thenLoop("animation.tt.walk"));
			}
			return event.setAndContinue(RawAnimation.begin().thenLoop("animation.tt.idle"));
		}
		return PlayState.STOP;
	}

	private PlayState procedurePredicate(AnimationState event) {
		Entity entity = this;
		Level world = entity.level;
		boolean loop = false;
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();
		if (!loop && this.lastloop) {
			this.lastloop = false;
			event.getController().setAnimation(RawAnimation.begin().thenPlay(this.animationprocedure));
			event.getController().forceAnimationReset();

			return PlayState.STOP;
		}
		if (!this.animationprocedure.equals("empty") && event.getController().getAnimationState() == AnimationController.State.STOPPED) {
			if (!loop) {
				event.getController().setAnimation(RawAnimation.begin().thenPlay(this.animationprocedure));
				if (event.getController().getAnimationState() == AnimationController.State.STOPPED) {
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

	@Override
	protected void tickDeath() {
		++this.deathTime;
		if (this.deathTime == 20) {
			this.remove(TTTestEntity.RemovalReason.KILLED);
			this.dropExperience();

		}
	}

	public String getSyncedAnimation() {
		return this.entityData.get(ANIMATION);
	}

	public void setAnimation(String animation) {
		this.entityData.set(ANIMATION, animation);
	}

	@Override
	public void registerControllers(AnimatableManager.ControllerRegistrar data) {
		data.add(new AnimationController<>(this, "movement", 4, this::movementPredicate));
		data.add(new AnimationController<>(this, "procedure", 4, this::procedurePredicate));
	}

	@Override
	public AnimatableInstanceCache getAnimatableInstanceCache() {
		return this.cache;
	}

}
