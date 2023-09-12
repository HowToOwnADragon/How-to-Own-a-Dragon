
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

import net.minecraft.world.level.levelgen.Heightmap;
import net.minecraft.world.level.ServerLevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.enchantment.EnchantmentHelper;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.SpawnEggItem;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.monster.Monster;
import net.minecraft.world.entity.ai.goal.WaterAvoidingRandomStrollGoal;
import net.minecraft.world.entity.ai.goal.TemptGoal;
import net.minecraft.world.entity.ai.goal.RandomStrollGoal;
import net.minecraft.world.entity.ai.goal.RandomLookAroundGoal;
import net.minecraft.world.entity.ai.goal.LookAtPlayerGoal;
import net.minecraft.world.entity.ai.goal.FollowOwnerGoal;
import net.minecraft.world.entity.ai.goal.FloatGoal;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.TamableAnimal;
import net.minecraft.world.entity.SpawnPlacements;
import net.minecraft.world.entity.SpawnGroupData;
import net.minecraft.world.entity.Pose;
import net.minecraft.world.entity.MobType;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.Mob;
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
import net.minecraft.world.Difficulty;
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

import net.mcreator.howtoownadragon.world.inventory.MaleTTGUIMenu;
import net.mcreator.howtoownadragon.procedures.WildNightAIProcedure;
import net.mcreator.howtoownadragon.procedures.WildDayAIProcedure;
import net.mcreator.howtoownadragon.procedures.WildAIProcedure;
import net.mcreator.howtoownadragon.procedures.ValkaFollowMeTriggerProcedure;
import net.mcreator.howtoownadragon.procedures.TTDiesNotGrownProcedure;
import net.mcreator.howtoownadragon.procedures.MaleOnInitialEntitySpawnTTProcedure;
import net.mcreator.howtoownadragon.procedures.DontAllFollowMeTriggerProcedure;
import net.mcreator.howtoownadragon.procedures.AllFollowMeTriggerProcedure;
import net.mcreator.howtoownadragon.init.HowToOwnADragonModEntities;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;

import java.util.List;

import io.netty.buffer.Unpooled;

public class BabyTTMaleEntity extends TamableAnimal implements GeoEntity {
	public static final EntityDataAccessor<Boolean> SHOOT = SynchedEntityData.defineId(BabyTTMaleEntity.class, EntityDataSerializers.BOOLEAN);
	public static final EntityDataAccessor<String> ANIMATION = SynchedEntityData.defineId(BabyTTMaleEntity.class, EntityDataSerializers.STRING);
	public static final EntityDataAccessor<String> TEXTURE = SynchedEntityData.defineId(BabyTTMaleEntity.class, EntityDataSerializers.STRING);
	private final AnimatableInstanceCache cache = GeckoLibUtil.createInstanceCache(this);
	private boolean swinging;
	private boolean lastloop;
	private long lastSwing;
	public String animationprocedure = "empty";

	public BabyTTMaleEntity(PlayMessages.SpawnEntity packet, Level world) {
		this(HowToOwnADragonModEntities.BABY_TT_MALE.get(), world);
	}

	public BabyTTMaleEntity(EntityType<BabyTTMaleEntity> type, Level world) {
		super(type, world);
		xpReward = 0;
		setNoAi(false);
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
		this.goalSelector.addGoal(1, new FollowOwnerGoal(this, 1, (float) 3, (float) 32, false) {
			@Override
			public boolean canUse() {
				double x = BabyTTMaleEntity.this.getX();
				double y = BabyTTMaleEntity.this.getY();
				double z = BabyTTMaleEntity.this.getZ();
				Entity entity = BabyTTMaleEntity.this;
				Level world = BabyTTMaleEntity.this.level;
				return super.canUse() && ValkaFollowMeTriggerProcedure.execute(world, entity);
			}
		});
		this.goalSelector.addGoal(2, new LookAtPlayerGoal(this, Player.class, (float) 6) {
			@Override
			public boolean canUse() {
				double x = BabyTTMaleEntity.this.getX();
				double y = BabyTTMaleEntity.this.getY();
				double z = BabyTTMaleEntity.this.getZ();
				Entity entity = BabyTTMaleEntity.this;
				Level world = BabyTTMaleEntity.this.level;
				return super.canUse() && ValkaFollowMeTriggerProcedure.execute(world, entity);
			}
		});
		this.goalSelector.addGoal(3, new FollowOwnerGoal(this, 1, (float) 3, (float) 32, false) {
			@Override
			public boolean canUse() {
				double x = BabyTTMaleEntity.this.getX();
				double y = BabyTTMaleEntity.this.getY();
				double z = BabyTTMaleEntity.this.getZ();
				Entity entity = BabyTTMaleEntity.this;
				Level world = BabyTTMaleEntity.this.level;
				return super.canUse() && AllFollowMeTriggerProcedure.execute(world, entity);
			}
		});
		this.goalSelector.addGoal(4, new LookAtPlayerGoal(this, Player.class, (float) 6) {
			@Override
			public boolean canUse() {
				double x = BabyTTMaleEntity.this.getX();
				double y = BabyTTMaleEntity.this.getY();
				double z = BabyTTMaleEntity.this.getZ();
				Entity entity = BabyTTMaleEntity.this;
				Level world = BabyTTMaleEntity.this.level;
				return super.canUse() && AllFollowMeTriggerProcedure.execute(world, entity);
			}
		});
		this.goalSelector.addGoal(5, new TemptGoal(this, 1, Ingredient.of(Items.BREAD), true) {
			@Override
			public boolean canUse() {
				double x = BabyTTMaleEntity.this.getX();
				double y = BabyTTMaleEntity.this.getY();
				double z = BabyTTMaleEntity.this.getZ();
				Entity entity = BabyTTMaleEntity.this;
				Level world = BabyTTMaleEntity.this.level;
				return super.canUse() && WildAIProcedure.execute(entity);
			}
		});
		this.goalSelector.addGoal(6, new TemptGoal(this, 1, Ingredient.of(Items.COD), true) {
			@Override
			public boolean canUse() {
				double x = BabyTTMaleEntity.this.getX();
				double y = BabyTTMaleEntity.this.getY();
				double z = BabyTTMaleEntity.this.getZ();
				Entity entity = BabyTTMaleEntity.this;
				Level world = BabyTTMaleEntity.this.level;
				return super.canUse() && WildAIProcedure.execute(entity);
			}
		});
		this.goalSelector.addGoal(7, new TemptGoal(this, 1, Ingredient.of(Items.SALMON), true) {
			@Override
			public boolean canUse() {
				double x = BabyTTMaleEntity.this.getX();
				double y = BabyTTMaleEntity.this.getY();
				double z = BabyTTMaleEntity.this.getZ();
				Entity entity = BabyTTMaleEntity.this;
				Level world = BabyTTMaleEntity.this.level;
				return super.canUse() && WildAIProcedure.execute(entity);
			}
		});
		this.goalSelector.addGoal(8, new TemptGoal(this, 1, Ingredient.of(Items.COOKED_CHICKEN), true) {
			@Override
			public boolean canUse() {
				double x = BabyTTMaleEntity.this.getX();
				double y = BabyTTMaleEntity.this.getY();
				double z = BabyTTMaleEntity.this.getZ();
				Entity entity = BabyTTMaleEntity.this;
				Level world = BabyTTMaleEntity.this.level;
				return super.canUse() && WildAIProcedure.execute(entity);
			}
		});
		this.goalSelector.addGoal(9, new RandomStrollGoal(this, 1) {
			@Override
			public boolean canUse() {
				double x = BabyTTMaleEntity.this.getX();
				double y = BabyTTMaleEntity.this.getY();
				double z = BabyTTMaleEntity.this.getZ();
				Entity entity = BabyTTMaleEntity.this;
				Level world = BabyTTMaleEntity.this.level;
				return super.canUse() && WildDayAIProcedure.execute(world, entity);
			}
		});
		this.goalSelector.addGoal(10, new RandomLookAroundGoal(this) {
			@Override
			public boolean canUse() {
				double x = BabyTTMaleEntity.this.getX();
				double y = BabyTTMaleEntity.this.getY();
				double z = BabyTTMaleEntity.this.getZ();
				Entity entity = BabyTTMaleEntity.this;
				Level world = BabyTTMaleEntity.this.level;
				return super.canUse() && WildNightAIProcedure.execute(world, entity);
			}
		});
		this.goalSelector.addGoal(11, new FloatGoal(this) {
			@Override
			public boolean canUse() {
				double x = BabyTTMaleEntity.this.getX();
				double y = BabyTTMaleEntity.this.getY();
				double z = BabyTTMaleEntity.this.getZ();
				Entity entity = BabyTTMaleEntity.this;
				Level world = BabyTTMaleEntity.this.level;
				return super.canUse() && DontAllFollowMeTriggerProcedure.execute(world, entity);
			}
		});
		this.goalSelector.addGoal(12, new WaterAvoidingRandomStrollGoal(this, 0.8) {
			@Override
			public boolean canUse() {
				double x = BabyTTMaleEntity.this.getX();
				double y = BabyTTMaleEntity.this.getY();
				double z = BabyTTMaleEntity.this.getZ();
				Entity entity = BabyTTMaleEntity.this;
				Level world = BabyTTMaleEntity.this.level;
				return super.canUse() && WildDayAIProcedure.execute(world, entity);
			}
		});
	}

	@Override
	public MobType getMobType() {
		return MobType.UNDEFINED;
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
		TTDiesNotGrownProcedure.execute(this.level, this.getX(), this.getY(), this.getZ());
	}

	@Override
	public SpawnGroupData finalizeSpawn(ServerLevelAccessor world, DifficultyInstance difficulty, MobSpawnType reason, @Nullable SpawnGroupData livingdata, @Nullable CompoundTag tag) {
		SpawnGroupData retval = super.finalizeSpawn(world, difficulty, reason, livingdata, tag);
		MaleOnInitialEntitySpawnTTProcedure.execute(this);
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
		if (sourceentity instanceof ServerPlayer serverPlayer) {
			NetworkHooks.openScreen(serverPlayer, new MenuProvider() {
				@Override
				public Component getDisplayName() {
					return Component.literal("Male Terrible Terror");
				}

				@Override
				public AbstractContainerMenu createMenu(int id, Inventory inventory, Player player) {
					FriendlyByteBuf packetBuffer = new FriendlyByteBuf(Unpooled.buffer());
					packetBuffer.writeBlockPos(sourceentity.blockPosition());
					packetBuffer.writeByte(0);
					packetBuffer.writeVarInt(BabyTTMaleEntity.this.getId());
					return new MaleTTGUIMenu(id, inventory, packetBuffer);
				}
			}, buf -> {
				buf.writeBlockPos(sourceentity.blockPosition());
				buf.writeByte(0);
				buf.writeVarInt(this.getId());
			});
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
		this.refreshDimensions();
	}

	@Override
	public EntityDimensions getDimensions(Pose p_33597_) {
		return super.getDimensions(p_33597_).scale((float) 1);
	}

	@Override
	public AgeableMob getBreedOffspring(ServerLevel serverWorld, AgeableMob ageable) {
		BabyTTMaleEntity retval = HowToOwnADragonModEntities.BABY_TT_MALE.get().create(serverWorld);
		retval.finalizeSpawn(serverWorld, serverWorld.getCurrentDifficultyAt(retval.blockPosition()), MobSpawnType.BREEDING, null, null);
		return retval;
	}

	@Override
	public boolean isFood(ItemStack stack) {
		return List.of().contains(stack.getItem());
	}

	@Override
	public void aiStep() {
		super.aiStep();
		this.updateSwingTime();
	}

	public static void init() {
		SpawnPlacements.register(HowToOwnADragonModEntities.BABY_TT_MALE.get(), SpawnPlacements.Type.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES,
				(entityType, world, reason, pos, random) -> (world.getDifficulty() != Difficulty.PEACEFUL && Monster.isDarkEnoughToSpawn(world, pos, random) && Mob.checkMobSpawnRules(entityType, world, reason, pos, random)));
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
			this.remove(BabyTTMaleEntity.RemovalReason.KILLED);
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
