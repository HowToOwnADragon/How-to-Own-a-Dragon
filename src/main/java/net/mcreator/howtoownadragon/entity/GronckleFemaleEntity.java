
package net.mcreator.howtoownadragon.entity;

import software.bernie.geckolib.util.GeckoLibUtil;
import software.bernie.geckolib.core.object.PlayState;
import software.bernie.geckolib.core.animation.RawAnimation;
import software.bernie.geckolib.core.animation.AnimationState;
import software.bernie.geckolib.core.animation.AnimationController;
import software.bernie.geckolib.core.animation.AnimatableManager;
import software.bernie.geckolib.core.animatable.instance.AnimatableInstanceCache;
import software.bernie.geckolib.animatable.GeoEntity;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.network.PlayMessages;
import net.minecraftforge.network.NetworkHooks;
import net.minecraftforge.items.wrapper.EntityHandsInvWrapper;
import net.minecraftforge.items.wrapper.EntityArmorInvWrapper;
import net.minecraftforge.items.wrapper.CombinedInvWrapper;
import net.minecraftforge.items.ItemStackHandler;
import net.minecraftforge.common.util.LazyOptional;
import net.minecraftforge.common.capabilities.ForgeCapabilities;
import net.minecraftforge.common.capabilities.Capability;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.levelgen.Heightmap;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.ServerLevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.enchantment.EnchantmentHelper;
import net.minecraft.world.item.SpawnEggItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.animal.Sheep;
import net.minecraft.world.entity.ai.navigation.PathNavigation;
import net.minecraft.world.entity.ai.navigation.FlyingPathNavigation;
import net.minecraft.world.entity.ai.goal.target.NearestAttackableTargetGoal;
import net.minecraft.world.entity.ai.goal.WaterAvoidingRandomStrollGoal;
import net.minecraft.world.entity.ai.goal.RandomStrollGoal;
import net.minecraft.world.entity.ai.goal.RandomLookAroundGoal;
import net.minecraft.world.entity.ai.goal.LookAtPlayerGoal;
import net.minecraft.world.entity.ai.goal.FollowOwnerGoal;
import net.minecraft.world.entity.ai.goal.FloatGoal;
import net.minecraft.world.entity.ai.control.FlyingMoveControl;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.TamableAnimal;
import net.minecraft.world.entity.SpawnPlacements;
import net.minecraft.world.entity.SpawnGroupData;
import net.minecraft.world.entity.Pose;
import net.minecraft.world.entity.MobType;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.EntityDimensions;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.AgeableMob;
import net.minecraft.world.damagesource.DamageTypes;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.MenuProvider;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.DifficultyInstance;
import net.minecraft.util.RandomSource;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.syncher.SynchedEntityData;
import net.minecraft.network.syncher.EntityDataSerializers;
import net.minecraft.network.syncher.EntityDataAccessor;
import net.minecraft.network.protocol.game.ClientGamePacketListener;
import net.minecraft.network.protocol.Packet;
import net.minecraft.network.chat.Component;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.nbt.Tag;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;

import net.mcreator.howtoownadragon.world.inventory.FemaleGronckleGUIMenu;
import net.mcreator.howtoownadragon.procedures.ValkaFollowMeTriggerProcedure;
import net.mcreator.howtoownadragon.procedures.LookAtNightDontFollowMeProcedure;
import net.mcreator.howtoownadragon.procedures.GrownGronckleDiesProcedureProcedure;
import net.mcreator.howtoownadragon.procedures.GronckleFlyingTickUpdateProcedure;
import net.mcreator.howtoownadragon.procedures.GronckleFemaleOnInitialEntitySpawnProcedure;
import net.mcreator.howtoownadragon.procedures.FlyAtDayFollowMeTriggerProcedure;
import net.mcreator.howtoownadragon.procedures.DontAllFollowMeTriggerProcedure;
import net.mcreator.howtoownadragon.procedures.AllFollowMeTriggerProcedure;
import net.mcreator.howtoownadragon.init.HowToOwnADragonModEntities;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;

import java.util.List;

import io.netty.buffer.Unpooled;

public class GronckleFemaleEntity extends TamableAnimal implements GeoEntity {
	public static final EntityDataAccessor<Boolean> SHOOT = SynchedEntityData.defineId(GronckleFemaleEntity.class, EntityDataSerializers.BOOLEAN);
	public static final EntityDataAccessor<String> ANIMATION = SynchedEntityData.defineId(GronckleFemaleEntity.class, EntityDataSerializers.STRING);
	public static final EntityDataAccessor<String> TEXTURE = SynchedEntityData.defineId(GronckleFemaleEntity.class, EntityDataSerializers.STRING);
	private final AnimatableInstanceCache cache = GeckoLibUtil.createInstanceCache(this);
	private boolean swinging;
	private boolean lastloop;
	private long lastSwing;
	public String animationprocedure = "empty";

	public GronckleFemaleEntity(PlayMessages.SpawnEntity packet, Level world) {
		this(HowToOwnADragonModEntities.GRONCKLE_FEMALE.get(), world);
	}

	public GronckleFemaleEntity(EntityType<GronckleFemaleEntity> type, Level world) {
		super(type, world);
		xpReward = 0;
		setNoAi(false);
		this.moveControl = new FlyingMoveControl(this, 10, true);
	}

	@Override
	protected void defineSynchedData() {
		super.defineSynchedData();
		this.entityData.define(SHOOT, false);
		this.entityData.define(ANIMATION, "undefined");
		this.entityData.define(TEXTURE, "meatlug");
	}

	public void setTexture(String texture) {
		this.entityData.set(TEXTURE, texture);
	}

	public String getTexture() {
		return this.entityData.get(TEXTURE);
	}

	@Override
	protected float getStandingEyeHeight(Pose poseIn, EntityDimensions sizeIn) {
		return 0.8F;
	}

	@Override
	public Packet<ClientGamePacketListener> getAddEntityPacket() {
		return NetworkHooks.getEntitySpawningPacket(this);
	}

	@Override
	protected PathNavigation createNavigation(Level world) {
		return new FlyingPathNavigation(this, world);
	}

	@Override
	protected void registerGoals() {
		super.registerGoals();
		this.goalSelector.addGoal(1, new LookAtPlayerGoal(this, ServerPlayer.class, (float) 3) {
			@Override
			public boolean canUse() {
				double x = GronckleFemaleEntity.this.getX();
				double y = GronckleFemaleEntity.this.getY();
				double z = GronckleFemaleEntity.this.getZ();
				Entity entity = GronckleFemaleEntity.this;
				Level world = GronckleFemaleEntity.this.level;
				return super.canUse() && ValkaFollowMeTriggerProcedure.execute(world, entity);
			}
		});
		this.goalSelector.addGoal(2, new LookAtPlayerGoal(this, Player.class, (float) 3) {
			@Override
			public boolean canUse() {
				double x = GronckleFemaleEntity.this.getX();
				double y = GronckleFemaleEntity.this.getY();
				double z = GronckleFemaleEntity.this.getZ();
				Entity entity = GronckleFemaleEntity.this;
				Level world = GronckleFemaleEntity.this.level;
				return super.canUse() && ValkaFollowMeTriggerProcedure.execute(world, entity);
			}
		});
		this.goalSelector.addGoal(3, new FollowOwnerGoal(this, 1, (float) 6, (float) 16, false) {
			@Override
			public boolean canUse() {
				double x = GronckleFemaleEntity.this.getX();
				double y = GronckleFemaleEntity.this.getY();
				double z = GronckleFemaleEntity.this.getZ();
				Entity entity = GronckleFemaleEntity.this;
				Level world = GronckleFemaleEntity.this.level;
				return super.canUse() && ValkaFollowMeTriggerProcedure.execute(world, entity);
			}
		});
		this.goalSelector.addGoal(4, new LookAtPlayerGoal(this, ServerPlayer.class, (float) 3) {
			@Override
			public boolean canUse() {
				double x = GronckleFemaleEntity.this.getX();
				double y = GronckleFemaleEntity.this.getY();
				double z = GronckleFemaleEntity.this.getZ();
				Entity entity = GronckleFemaleEntity.this;
				Level world = GronckleFemaleEntity.this.level;
				return super.canUse() && AllFollowMeTriggerProcedure.execute(world, entity);
			}
		});
		this.goalSelector.addGoal(5, new LookAtPlayerGoal(this, Player.class, (float) 3) {
			@Override
			public boolean canUse() {
				double x = GronckleFemaleEntity.this.getX();
				double y = GronckleFemaleEntity.this.getY();
				double z = GronckleFemaleEntity.this.getZ();
				Entity entity = GronckleFemaleEntity.this;
				Level world = GronckleFemaleEntity.this.level;
				return super.canUse() && AllFollowMeTriggerProcedure.execute(world, entity);
			}
		});
		this.goalSelector.addGoal(6, new FollowOwnerGoal(this, 1, (float) 6, (float) 16, false) {
			@Override
			public boolean canUse() {
				double x = GronckleFemaleEntity.this.getX();
				double y = GronckleFemaleEntity.this.getY();
				double z = GronckleFemaleEntity.this.getZ();
				Entity entity = GronckleFemaleEntity.this;
				Level world = GronckleFemaleEntity.this.level;
				return super.canUse() && AllFollowMeTriggerProcedure.execute(world, entity);
			}
		});
		this.targetSelector.addGoal(7, new NearestAttackableTargetGoal(this, Sheep.class, true, true) {
			@Override
			public boolean canUse() {
				double x = GronckleFemaleEntity.this.getX();
				double y = GronckleFemaleEntity.this.getY();
				double z = GronckleFemaleEntity.this.getZ();
				Entity entity = GronckleFemaleEntity.this;
				Level world = GronckleFemaleEntity.this.level;
				return super.canUse() && FlyAtDayFollowMeTriggerProcedure.execute(world, entity);
			}
		});
		this.goalSelector.addGoal(8, new RandomStrollGoal(this, 1) {
			@Override
			public boolean canUse() {
				double x = GronckleFemaleEntity.this.getX();
				double y = GronckleFemaleEntity.this.getY();
				double z = GronckleFemaleEntity.this.getZ();
				Entity entity = GronckleFemaleEntity.this;
				Level world = GronckleFemaleEntity.this.level;
				return super.canUse() && FlyAtDayFollowMeTriggerProcedure.execute(world, entity);
			}
		});
		this.goalSelector.addGoal(9, new RandomLookAroundGoal(this) {
			@Override
			public boolean canUse() {
				double x = GronckleFemaleEntity.this.getX();
				double y = GronckleFemaleEntity.this.getY();
				double z = GronckleFemaleEntity.this.getZ();
				Entity entity = GronckleFemaleEntity.this;
				Level world = GronckleFemaleEntity.this.level;
				return super.canUse() && LookAtNightDontFollowMeProcedure.execute(world, entity);
			}
		});
		this.goalSelector.addGoal(10, new FloatGoal(this) {
			@Override
			public boolean canUse() {
				double x = GronckleFemaleEntity.this.getX();
				double y = GronckleFemaleEntity.this.getY();
				double z = GronckleFemaleEntity.this.getZ();
				Entity entity = GronckleFemaleEntity.this;
				Level world = GronckleFemaleEntity.this.level;
				return super.canUse() && DontAllFollowMeTriggerProcedure.execute(world, entity);
			}
		});
		this.goalSelector.addGoal(11, new WaterAvoidingRandomStrollGoal(this, 0.8) {
			@Override
			public boolean canUse() {
				double x = GronckleFemaleEntity.this.getX();
				double y = GronckleFemaleEntity.this.getY();
				double z = GronckleFemaleEntity.this.getZ();
				Entity entity = GronckleFemaleEntity.this;
				Level world = GronckleFemaleEntity.this.level;
				return super.canUse() && FlyAtDayFollowMeTriggerProcedure.execute(world, entity);
			}
		});
		this.goalSelector.addGoal(12, new RandomStrollGoal(this, 0.8, 20) {
			@Override
			protected Vec3 getPosition() {
				RandomSource random = GronckleFemaleEntity.this.getRandom();
				double dir_x = GronckleFemaleEntity.this.getX() + ((random.nextFloat() * 2 - 1) * 16);
				double dir_y = GronckleFemaleEntity.this.getY() + ((random.nextFloat() * 2 - 1) * 16);
				double dir_z = GronckleFemaleEntity.this.getZ() + ((random.nextFloat() * 2 - 1) * 16);
				return new Vec3(dir_x, dir_y, dir_z);
			}

			@Override
			public boolean canUse() {
				double x = GronckleFemaleEntity.this.getX();
				double y = GronckleFemaleEntity.this.getY();
				double z = GronckleFemaleEntity.this.getZ();
				Entity entity = GronckleFemaleEntity.this;
				Level world = GronckleFemaleEntity.this.level;
				return super.canUse() && FlyAtDayFollowMeTriggerProcedure.execute(world, entity);
			}

		});
	}

	@Override
	public MobType getMobType() {
		return MobType.UNDEFINED;
	}

	@Override
	public double getPassengersRidingOffset() {
		return super.getPassengersRidingOffset() + 0.3;
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
	public boolean causeFallDamage(float l, float d, DamageSource source) {
		return false;
	}

	@Override
	public boolean hurt(DamageSource source, float amount) {
		if (source.is(DamageTypes.IN_FIRE))
			return false;
		if (source.getDirectEntity() instanceof AbstractArrow)
			return false;
		if (source.is(DamageTypes.FALL))
			return false;
		return super.hurt(source, amount);
	}

	@Override
	public void die(DamageSource source) {
		super.die(source);
		GrownGronckleDiesProcedureProcedure.execute(this.level, this.getX(), this.getY(), this.getZ());
	}

	@Override
	public SpawnGroupData finalizeSpawn(ServerLevelAccessor world, DifficultyInstance difficulty, MobSpawnType reason, @Nullable SpawnGroupData livingdata, @Nullable CompoundTag tag) {
		SpawnGroupData retval = super.finalizeSpawn(world, difficulty, reason, livingdata, tag);
		GronckleFemaleOnInitialEntitySpawnProcedure.execute(this);
		return retval;
	}

	private final ItemStackHandler inventory = new ItemStackHandler(1) {
		@Override
		public int getSlotLimit(int slot) {
			return 1;
		}
	};
	private final CombinedInvWrapper combined = new CombinedInvWrapper(inventory, new EntityHandsInvWrapper(this), new EntityArmorInvWrapper(this));

	@Override
	public <T> LazyOptional<T> getCapability(@Nonnull Capability<T> capability, @Nullable Direction side) {
		if (this.isAlive() && capability == ForgeCapabilities.ITEM_HANDLER && side == null)
			return LazyOptional.of(() -> combined).cast();
		return super.getCapability(capability, side);
	}

	@Override
	protected void dropEquipment() {
		super.dropEquipment();
		for (int i = 0; i < inventory.getSlots(); ++i) {
			ItemStack itemstack = inventory.getStackInSlot(i);
			if (!itemstack.isEmpty() && !EnchantmentHelper.hasVanishingCurse(itemstack)) {
				this.spawnAtLocation(itemstack);
			}
		}
	}

	@Override
	public void addAdditionalSaveData(CompoundTag compound) {
		super.addAdditionalSaveData(compound);
		compound.put("InventoryCustom", inventory.serializeNBT());
	}

	@Override
	public void readAdditionalSaveData(CompoundTag compound) {
		super.readAdditionalSaveData(compound);
		Tag inventoryCustom = compound.get("InventoryCustom");
		if (inventoryCustom instanceof CompoundTag inventoryTag)
			inventory.deserializeNBT(inventoryTag);
	}

	@Override
	public InteractionResult mobInteract(Player sourceentity, InteractionHand hand) {
		ItemStack itemstack = sourceentity.getItemInHand(hand);
		InteractionResult retval = InteractionResult.sidedSuccess(this.level.isClientSide());
		if (sourceentity.isSecondaryUseActive()) {
			if (sourceentity instanceof ServerPlayer serverPlayer) {
				NetworkHooks.openScreen(serverPlayer, new MenuProvider() {
					@Override
					public Component getDisplayName() {
						return Component.literal("Female Gronckle");
					}	

					@Override
					public AbstractContainerMenu createMenu(int id, Inventory inventory, Player player) {
						FriendlyByteBuf packetBuffer = new FriendlyByteBuf(Unpooled.buffer());
						packetBuffer.writeBlockPos(sourceentity.blockPosition());
						packetBuffer.writeByte(0);
						packetBuffer.writeVarInt(GronckleFemaleEntity.this.getId());
						return new FemaleGronckleGUIMenu(id, inventory, packetBuffer);
					}
				}, buf -> {
					buf.writeBlockPos(sourceentity.blockPosition());
					buf.writeByte(0);
					buf.writeVarInt(this.getId());
				});
			}
			return InteractionResult.sidedSuccess(this.level.isClientSide());
		}
		Item item = itemstack.getItem();
		if (itemstack.getItem() instanceof SpawnEggItem) {
			retval = super.mobInteract(sourceentity, hand);
		} else if (this.level.isClientSide()) {
			retval = (this.isTame() && this.isOwnedBy(sourceentity) || this.isFood(itemstack)) ? InteractionResult.sidedSuccess(this.level.isClientSide()) : InteractionResult.PASS;
		} else {
			if (this.isTame()) {
				if (this.isOwnedBy(sourceentity)) {
					if (item.isEdible() && this.isFood(itemstack) && this.getHealth() < this.getMaxHealth()) {
						this.usePlayerItem(sourceentity, hand, itemstack);
						this.heal((float) item.getFoodProperties().getNutrition());
						retval = InteractionResult.sidedSuccess(this.level.isClientSide());
					} else if (this.isFood(itemstack) && this.getHealth() < this.getMaxHealth()) {
						this.usePlayerItem(sourceentity, hand, itemstack);
						this.heal(4);
						retval = InteractionResult.sidedSuccess(this.level.isClientSide());
					} else {
						retval = super.mobInteract(sourceentity, hand);
					}
				}
			} else if (this.isFood(itemstack)) {
				this.usePlayerItem(sourceentity, hand, itemstack);
				if (this.random.nextInt(3) == 0 && !net.minecraftforge.event.ForgeEventFactory.onAnimalTame(this, sourceentity)) {
					this.tame(sourceentity);
					this.level.broadcastEntityEvent(this, (byte) 7);
				} else {
					this.level.broadcastEntityEvent(this, (byte) 6);
				}
				this.setPersistenceRequired();
				retval = InteractionResult.sidedSuccess(this.level.isClientSide());
			} else {
				retval = super.mobInteract(sourceentity, hand);
				if (retval == InteractionResult.SUCCESS || retval == InteractionResult.CONSUME)
					this.setPersistenceRequired();
			}
		}
		return retval;
	}

	@Override
	public void baseTick() {
		super.baseTick();
		GronckleFlyingTickUpdateProcedure.execute(this);
		this.refreshDimensions();
	}
			@Override
	public void travel(Vec3 dir) {
		Entity entity = this.getPassengers().isEmpty() ? null : (Entity) this.getPassengers().get(0);
		if (this.isVehicle()) {
			this.setYRot(entity.getYRot());
			this.yRotO = this.getYRot();
			this.setXRot(entity.getXRot() * 0.5F);
			this.setRot(this.getYRot(), this.getXRot());
			this.yBodyRot = entity.getYRot();
			this.yHeadRot = entity.getYRot();
			this.maxUpStep = 1.0F;
			if (entity instanceof LivingEntity passenger) {
				this.setSpeed((float) this.getAttributeValue(Attributes.MOVEMENT_SPEED));
				float forward = passenger.zza;
				float strafe = passenger.xxa;
				super.travel(new Vec3(strafe, 0, forward));
			}
			double d1 = this.getX() - this.xo;
			double d0 = this.getZ() - this.zo;
			float f1 = (float) Math.sqrt(d1 * d1 + d0 * d0) * 4;
			if (f1 > 1.0F)
				f1 = 1.0F;
			this.walkAnimation.setSpeed(this.walkAnimation.speed() + (f1 - this.walkAnimation.speed()) * 0.4F);
			this.walkAnimation.position(this.walkAnimation.position() + this.walkAnimation.speed());
			this.calculateEntityAnimation(true);
			return;
		}
		this.maxUpStep = 0.5F;
		super.travel(dir);
	}

	@Override
	public EntityDimensions getDimensions(Pose p_33597_) {
		return super.getDimensions(p_33597_).scale((float) 1);
	}

	@Override
	public AgeableMob getBreedOffspring(ServerLevel serverWorld, AgeableMob ageable) {
		GronckleFemaleEntity retval = HowToOwnADragonModEntities.GRONCKLE_FEMALE.get().create(serverWorld);
		retval.finalizeSpawn(serverWorld, serverWorld.getCurrentDifficultyAt(retval.blockPosition()), MobSpawnType.BREEDING, null, null);
		return retval;
	}

	@Override
	public boolean isFood(ItemStack stack) {
		return List.of().contains(stack.getItem());
	}

	@Override
	protected void checkFallDamage(double y, boolean onGroundIn, BlockState state, BlockPos pos) {
	}

	@Override
	public void setNoGravity(boolean ignored) {
		super.setNoGravity(true);
	}

	@Override
	public void aiStep() {
		super.aiStep();
		this.updateSwingTime();
		this.setNoGravity(true);
	}

	public static void init() {
		SpawnPlacements.register(HowToOwnADragonModEntities.GRONCKLE_FEMALE.get(), SpawnPlacements.Type.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES,
				(entityType, world, reason, pos, random) -> (world.getBlockState(pos.below()).getMaterial() == Material.GRASS && world.getRawBrightness(pos, 0) > 8));
	}

	public static AttributeSupplier.Builder createAttributes() {
		AttributeSupplier.Builder builder = Mob.createMobAttributes();
		builder = builder.add(Attributes.MOVEMENT_SPEED, 0.3);
		builder = builder.add(Attributes.MAX_HEALTH, 10);
		builder = builder.add(Attributes.ARMOR, 0);
		builder = builder.add(Attributes.ATTACK_DAMAGE, 3);
		builder = builder.add(Attributes.FOLLOW_RANGE, 16);
		builder = builder.add(Attributes.FLYING_SPEED, 0.3);
		return builder;
	}

	private PlayState movementPredicate(AnimationState event) {
		if (this.animationprocedure.equals("empty")) {
			if ((event.isMoving() || !(event.getLimbSwingAmount() > -0.15F && event.getLimbSwingAmount() < 0.15F)) && this.isOnGround() && !this.isVehicle()) {
				return event.setAndContinue(RawAnimation.begin().thenLoop("animation.gronckle.walk"));
			}
			if (this.isDeadOrDying()) {
				return event.setAndContinue(RawAnimation.begin().thenPlay("animation.gronckle.death"));
			}
			if (this.isShiftKeyDown()) {
				return event.setAndContinue(RawAnimation.begin().thenLoop("animation.gronckle.sneak"));
			}
			if (this.isSprinting()) {
				return event.setAndContinue(RawAnimation.begin().thenLoop("animation.gronckle.sprint"));
			}
			if (!this.isOnGround()) {
				return event.setAndContinue(RawAnimation.begin().thenLoop("animation.gronckle.flight"));
			}
			if (this.isVehicle() && event.isMoving()) {
				return event.setAndContinue(RawAnimation.begin().thenLoop("animation.gronckle.sprint"));
			}
			return event.setAndContinue(RawAnimation.begin().thenLoop("animation.gronckle.idle"));
		}
		return PlayState.STOP;
	}

	private PlayState attackingPredicate(AnimationState event) {
		double d1 = this.getX() - this.xOld;
		double d0 = this.getZ() - this.zOld;
		float velocity = (float) Math.sqrt(d1 * d1 + d0 * d0);
		if (getAttackAnim(event.getPartialTick()) > 0f && !this.swinging) {
			this.swinging = true;
			this.lastSwing = level.getGameTime();
		}
		if (this.swinging && this.lastSwing + 7L <= level.getGameTime()) {
			this.swinging = false;
		}
		if (this.swinging && event.getController().getAnimationState() == AnimationController.State.STOPPED) {
			event.getController().forceAnimationReset();
			return event.setAndContinue(RawAnimation.begin().thenPlay("animation.gronckle.walk"));
		}
		return PlayState.CONTINUE;
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
			this.remove(GronckleFemaleEntity.RemovalReason.KILLED);
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
		data.add(new AnimationController<>(this, "attacking", 4, this::attackingPredicate));
		data.add(new AnimationController<>(this, "procedure", 4, this::procedurePredicate));
	}

	@Override
	public AnimatableInstanceCache getAnimatableInstanceCache() {
		return this.cache;
	}
}
