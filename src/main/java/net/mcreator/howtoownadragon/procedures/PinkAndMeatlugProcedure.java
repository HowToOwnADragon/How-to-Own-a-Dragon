package net.mcreator.howtoownadragon.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.core.BlockPos;

import net.mcreator.howtoownadragon.init.HowToOwnADragonModMobEffects;
import net.mcreator.howtoownadragon.init.HowToOwnADragonModBlocks;
import net.mcreator.howtoownadragon.entity.MeatlugMaleEntity;
import net.mcreator.howtoownadragon.entity.GroncklePinkFemaleEntity;

import javax.annotation.Nullable;

import java.util.Comparator;

@Mod.EventBusSubscriber
public class PinkAndMeatlugProcedure {
	@SubscribeEvent
	public static void onRightClickEntity(PlayerInteractEvent.EntityInteract event) {
		if (event.getHand() != event.getEntity().getUsedItemHand())
			return;
		execute(event, event.getLevel(), event.getPos().getX(), event.getPos().getY(), event.getPos().getZ(), event.getTarget(), event.getEntity());
	}

	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, Entity sourceentity) {
		execute(null, world, x, y, z, entity, sourceentity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z, Entity entity, Entity sourceentity) {
		if (entity == null || sourceentity == null)
			return;
		if (!(entity instanceof LivingEntity _livEnt0 && _livEnt0.hasEffect(HowToOwnADragonModMobEffects.BREED_COOLDOWN.get()))) {
			if (entity instanceof GroncklePinkFemaleEntity) {
				if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Blocks.STONE.asItem()) {
					if (((Entity) world.getEntitiesOfClass(MeatlugMaleEntity.class, AABB.ofSize(new Vec3(x, y, z), 10, 10, 10), e -> true).stream().sorted(new Object() {
						Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
							return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
						}
					}.compareDistOf(x, y, z)).findFirst().orElse(null)) instanceof LivingEntity _livEnt5 && _livEnt5.hasEffect(HowToOwnADragonModMobEffects.IN_LOVE.get())) {
						if (entity instanceof Player _player) {
							ItemStack _stktoremove = new ItemStack(Blocks.STONE);
							_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
						}
						if (((Entity) world.getEntitiesOfClass(MeatlugMaleEntity.class, AABB.ofSize(new Vec3(x, y, z), 10, 10, 10), e -> true).stream().sorted(new Object() {
							Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
								return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
							}
						}.compareDistOf(x, y, z)).findFirst().orElse(null)) instanceof LivingEntity _entity)
							_entity.removeEffect(HowToOwnADragonModMobEffects.IN_LOVE.get());
						if (Mth.nextInt(RandomSource.create(), 1, 2) == 1) {
							world.setBlock(BlockPos.containing(x, y, z), HowToOwnADragonModBlocks.PINK_GRONCKLE_EGG.get().defaultBlockState(), 3);
						} else if (Mth.nextInt(RandomSource.create(), 1, 2) == 2) {
							world.setBlock(BlockPos.containing(x, y, z), HowToOwnADragonModBlocks.MEATLUGS_EGG.get().defaultBlockState(), 3);
						}
						if (entity instanceof LivingEntity _entity && !_entity.level.isClientSide())
							_entity.addEffect(new MobEffectInstance(HowToOwnADragonModMobEffects.BREED_COOLDOWN.get(), 48000, 1, false, false));
					}
				} else if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Blocks.SANDSTONE.asItem()) {
					if (((Entity) world.getEntitiesOfClass(MeatlugMaleEntity.class, AABB.ofSize(new Vec3(x, y, z), 10, 10, 10), e -> true).stream().sorted(new Object() {
						Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
							return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
						}
					}.compareDistOf(x, y, z)).findFirst().orElse(null)) instanceof LivingEntity _livEnt17 && _livEnt17.hasEffect(HowToOwnADragonModMobEffects.IN_LOVE.get())) {
						if (entity instanceof Player _player) {
							ItemStack _stktoremove = new ItemStack(Blocks.SANDSTONE);
							_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
						}
						if (((Entity) world.getEntitiesOfClass(MeatlugMaleEntity.class, AABB.ofSize(new Vec3(x, y, z), 10, 10, 10), e -> true).stream().sorted(new Object() {
							Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
								return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
							}
						}.compareDistOf(x, y, z)).findFirst().orElse(null)) instanceof LivingEntity _entity)
							_entity.removeEffect(HowToOwnADragonModMobEffects.IN_LOVE.get());
						if (Mth.nextInt(RandomSource.create(), 1, 2) == 1) {
							world.setBlock(BlockPos.containing(x, y, z), HowToOwnADragonModBlocks.PINK_GRONCKLE_EGG.get().defaultBlockState(), 3);
						} else if (Mth.nextInt(RandomSource.create(), 1, 2) == 2) {
							world.setBlock(BlockPos.containing(x, y, z), HowToOwnADragonModBlocks.MEATLUGS_EGG.get().defaultBlockState(), 3);
						}
						if (entity instanceof LivingEntity _entity && !_entity.level.isClientSide())
							_entity.addEffect(new MobEffectInstance(HowToOwnADragonModMobEffects.BREED_COOLDOWN.get(), 48000, 1, false, false));
					}
				} else if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Blocks.COBBLESTONE.asItem()) {
					if (((Entity) world.getEntitiesOfClass(MeatlugMaleEntity.class, AABB.ofSize(new Vec3(x, y, z), 10, 10, 10), e -> true).stream().sorted(new Object() {
						Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
							return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
						}
					}.compareDistOf(x, y, z)).findFirst().orElse(null)) instanceof LivingEntity _livEnt29 && _livEnt29.hasEffect(HowToOwnADragonModMobEffects.IN_LOVE.get())) {
						if (entity instanceof Player _player) {
							ItemStack _stktoremove = new ItemStack(Blocks.COBBLESTONE);
							_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
						}
						if (((Entity) world.getEntitiesOfClass(MeatlugMaleEntity.class, AABB.ofSize(new Vec3(x, y, z), 10, 10, 10), e -> true).stream().sorted(new Object() {
							Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
								return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
							}
						}.compareDistOf(x, y, z)).findFirst().orElse(null)) instanceof LivingEntity _entity)
							_entity.removeEffect(HowToOwnADragonModMobEffects.IN_LOVE.get());
						if (Mth.nextInt(RandomSource.create(), 1, 2) == 1) {
							world.setBlock(BlockPos.containing(x, y, z), HowToOwnADragonModBlocks.PINK_GRONCKLE_EGG.get().defaultBlockState(), 3);
						} else if (Mth.nextInt(RandomSource.create(), 1, 2) == 2) {
							world.setBlock(BlockPos.containing(x, y, z), HowToOwnADragonModBlocks.MEATLUGS_EGG.get().defaultBlockState(), 3);
						}
						if (entity instanceof LivingEntity _entity && !_entity.level.isClientSide())
							_entity.addEffect(new MobEffectInstance(HowToOwnADragonModMobEffects.BREED_COOLDOWN.get(), 48000, 1, false, false));
					}
				} else if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Blocks.DEEPSLATE.asItem()) {
					if (((Entity) world.getEntitiesOfClass(MeatlugMaleEntity.class, AABB.ofSize(new Vec3(x, y, z), 10, 10, 10), e -> true).stream().sorted(new Object() {
						Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
							return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
						}
					}.compareDistOf(x, y, z)).findFirst().orElse(null)) instanceof LivingEntity _livEnt41 && _livEnt41.hasEffect(HowToOwnADragonModMobEffects.IN_LOVE.get())) {
						if (entity instanceof Player _player) {
							ItemStack _stktoremove = new ItemStack(Blocks.DEEPSLATE);
							_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
						}
						if (((Entity) world.getEntitiesOfClass(MeatlugMaleEntity.class, AABB.ofSize(new Vec3(x, y, z), 10, 10, 10), e -> true).stream().sorted(new Object() {
							Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
								return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
							}
						}.compareDistOf(x, y, z)).findFirst().orElse(null)) instanceof LivingEntity _entity)
							_entity.removeEffect(HowToOwnADragonModMobEffects.IN_LOVE.get());
						if (Mth.nextInt(RandomSource.create(), 1, 2) == 1) {
							world.setBlock(BlockPos.containing(x, y, z), HowToOwnADragonModBlocks.PINK_GRONCKLE_EGG.get().defaultBlockState(), 3);
						} else if (Mth.nextInt(RandomSource.create(), 1, 2) == 2) {
							world.setBlock(BlockPos.containing(x, y, z), HowToOwnADragonModBlocks.MEATLUGS_EGG.get().defaultBlockState(), 3);
						}
						if (entity instanceof LivingEntity _entity && !_entity.level.isClientSide())
							_entity.addEffect(new MobEffectInstance(HowToOwnADragonModMobEffects.BREED_COOLDOWN.get(), 48000, 1, false, false));
					}
				} else if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Blocks.COBBLED_DEEPSLATE.asItem()) {
					if (((Entity) world.getEntitiesOfClass(MeatlugMaleEntity.class, AABB.ofSize(new Vec3(x, y, z), 10, 10, 10), e -> true).stream().sorted(new Object() {
						Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
							return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
						}
					}.compareDistOf(x, y, z)).findFirst().orElse(null)) instanceof LivingEntity _livEnt53 && _livEnt53.hasEffect(HowToOwnADragonModMobEffects.IN_LOVE.get())) {
						if (entity instanceof Player _player) {
							ItemStack _stktoremove = new ItemStack(Blocks.COBBLED_DEEPSLATE);
							_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
						}
						if (((Entity) world.getEntitiesOfClass(MeatlugMaleEntity.class, AABB.ofSize(new Vec3(x, y, z), 10, 10, 10), e -> true).stream().sorted(new Object() {
							Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
								return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
							}
						}.compareDistOf(x, y, z)).findFirst().orElse(null)) instanceof LivingEntity _entity)
							_entity.removeEffect(HowToOwnADragonModMobEffects.IN_LOVE.get());
						if (Mth.nextInt(RandomSource.create(), 1, 2) == 1) {
							world.setBlock(BlockPos.containing(x, y, z), HowToOwnADragonModBlocks.PINK_GRONCKLE_EGG.get().defaultBlockState(), 3);
						} else if (Mth.nextInt(RandomSource.create(), 1, 2) == 2) {
							world.setBlock(BlockPos.containing(x, y, z), HowToOwnADragonModBlocks.MEATLUGS_EGG.get().defaultBlockState(), 3);
						}
						if (entity instanceof LivingEntity _entity && !_entity.level.isClientSide())
							_entity.addEffect(new MobEffectInstance(HowToOwnADragonModMobEffects.BREED_COOLDOWN.get(), 48000, 1, false, false));
					}
				} else if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Blocks.DIORITE.asItem()) {
					if (((Entity) world.getEntitiesOfClass(MeatlugMaleEntity.class, AABB.ofSize(new Vec3(x, y, z), 10, 10, 10), e -> true).stream().sorted(new Object() {
						Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
							return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
						}
					}.compareDistOf(x, y, z)).findFirst().orElse(null)) instanceof LivingEntity _livEnt65 && _livEnt65.hasEffect(HowToOwnADragonModMobEffects.IN_LOVE.get())) {
						if (entity instanceof Player _player) {
							ItemStack _stktoremove = new ItemStack(Blocks.DIORITE);
							_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
						}
						if (((Entity) world.getEntitiesOfClass(MeatlugMaleEntity.class, AABB.ofSize(new Vec3(x, y, z), 10, 10, 10), e -> true).stream().sorted(new Object() {
							Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
								return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
							}
						}.compareDistOf(x, y, z)).findFirst().orElse(null)) instanceof LivingEntity _entity)
							_entity.removeEffect(HowToOwnADragonModMobEffects.IN_LOVE.get());
						if (Mth.nextInt(RandomSource.create(), 1, 2) == 1) {
							world.setBlock(BlockPos.containing(x, y, z), HowToOwnADragonModBlocks.PINK_GRONCKLE_EGG.get().defaultBlockState(), 3);
						} else if (Mth.nextInt(RandomSource.create(), 1, 2) == 2) {
							world.setBlock(BlockPos.containing(x, y, z), HowToOwnADragonModBlocks.MEATLUGS_EGG.get().defaultBlockState(), 3);
						}
						if (entity instanceof LivingEntity _entity && !_entity.level.isClientSide())
							_entity.addEffect(new MobEffectInstance(HowToOwnADragonModMobEffects.BREED_COOLDOWN.get(), 48000, 1, false, false));
					}
				} else if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Blocks.GRANITE.asItem()) {
					if (((Entity) world.getEntitiesOfClass(MeatlugMaleEntity.class, AABB.ofSize(new Vec3(x, y, z), 10, 10, 10), e -> true).stream().sorted(new Object() {
						Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
							return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
						}
					}.compareDistOf(x, y, z)).findFirst().orElse(null)) instanceof LivingEntity _livEnt77 && _livEnt77.hasEffect(HowToOwnADragonModMobEffects.IN_LOVE.get())) {
						if (entity instanceof Player _player) {
							ItemStack _stktoremove = new ItemStack(Blocks.GRANITE);
							_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
						}
						if (((Entity) world.getEntitiesOfClass(MeatlugMaleEntity.class, AABB.ofSize(new Vec3(x, y, z), 10, 10, 10), e -> true).stream().sorted(new Object() {
							Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
								return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
							}
						}.compareDistOf(x, y, z)).findFirst().orElse(null)) instanceof LivingEntity _entity)
							_entity.removeEffect(HowToOwnADragonModMobEffects.IN_LOVE.get());
						if (Mth.nextInt(RandomSource.create(), 1, 2) == 1) {
							world.setBlock(BlockPos.containing(x, y, z), HowToOwnADragonModBlocks.PINK_GRONCKLE_EGG.get().defaultBlockState(), 3);
						} else if (Mth.nextInt(RandomSource.create(), 1, 2) == 2) {
							world.setBlock(BlockPos.containing(x, y, z), HowToOwnADragonModBlocks.MEATLUGS_EGG.get().defaultBlockState(), 3);
						}
						if (entity instanceof LivingEntity _entity && !_entity.level.isClientSide())
							_entity.addEffect(new MobEffectInstance(HowToOwnADragonModMobEffects.BREED_COOLDOWN.get(), 48000, 1, false, false));
					}
				} else if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Blocks.ANDESITE.asItem()) {
					if (((Entity) world.getEntitiesOfClass(MeatlugMaleEntity.class, AABB.ofSize(new Vec3(x, y, z), 10, 10, 10), e -> true).stream().sorted(new Object() {
						Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
							return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
						}
					}.compareDistOf(x, y, z)).findFirst().orElse(null)) instanceof LivingEntity _livEnt89 && _livEnt89.hasEffect(HowToOwnADragonModMobEffects.IN_LOVE.get())) {
						if (entity instanceof Player _player) {
							ItemStack _stktoremove = new ItemStack(Blocks.ANDESITE);
							_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
						}
						if (((Entity) world.getEntitiesOfClass(MeatlugMaleEntity.class, AABB.ofSize(new Vec3(x, y, z), 10, 10, 10), e -> true).stream().sorted(new Object() {
							Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
								return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
							}
						}.compareDistOf(x, y, z)).findFirst().orElse(null)) instanceof LivingEntity _entity)
							_entity.removeEffect(HowToOwnADragonModMobEffects.IN_LOVE.get());
						if (Mth.nextInt(RandomSource.create(), 1, 2) == 1) {
							world.setBlock(BlockPos.containing(x, y, z), HowToOwnADragonModBlocks.PINK_GRONCKLE_EGG.get().defaultBlockState(), 3);
						} else if (Mth.nextInt(RandomSource.create(), 1, 2) == 2) {
							world.setBlock(BlockPos.containing(x, y, z), HowToOwnADragonModBlocks.MEATLUGS_EGG.get().defaultBlockState(), 3);
						}
						if (entity instanceof LivingEntity _entity && !_entity.level.isClientSide())
							_entity.addEffect(new MobEffectInstance(HowToOwnADragonModMobEffects.BREED_COOLDOWN.get(), 48000, 1, false, false));
					}
				}
			}
		}
	}
}
