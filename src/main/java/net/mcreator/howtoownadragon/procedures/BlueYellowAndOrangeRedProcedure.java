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
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.core.BlockPos;

import net.mcreator.howtoownadragon.init.HowToOwnADragonModMobEffects;
import net.mcreator.howtoownadragon.init.HowToOwnADragonModBlocks;
import net.mcreator.howtoownadragon.entity.MeatlugFemaleEntity;
import net.mcreator.howtoownadragon.entity.GroncklePinkMaleEntity;

import javax.annotation.Nullable;

import java.util.Comparator;

@Mod.EventBusSubscriber
public class BlueYellowAndOrangeRedProcedure {
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
		if (entity instanceof MeatlugFemaleEntity) {
			if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Blocks.STONE.asItem()) {
				if (((Entity) world.getEntitiesOfClass(GroncklePinkMaleEntity.class, AABB.ofSize(new Vec3(x, y, z), 10, 10, 10), e -> true).stream().sorted(new Object() {
					Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
						return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
					}
				}.compareDistOf(x, y, z)).findFirst().orElse(null)) instanceof LivingEntity _livEnt4 && _livEnt4.hasEffect(HowToOwnADragonModMobEffects.IN_LOVE.get())) {
					if (entity instanceof Player _player) {
						ItemStack _stktoremove = new ItemStack(Blocks.STONE);
						_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
					}
					if (((Entity) world.getEntitiesOfClass(GroncklePinkMaleEntity.class, AABB.ofSize(new Vec3(x, y, z), 10, 10, 10), e -> true).stream().sorted(new Object() {
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
				}
			} else if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Blocks.SANDSTONE.asItem()) {
				if (((Entity) world.getEntitiesOfClass(GroncklePinkMaleEntity.class, AABB.ofSize(new Vec3(x, y, z), 10, 10, 10), e -> true).stream().sorted(new Object() {
					Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
						return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
					}
				}.compareDistOf(x, y, z)).findFirst().orElse(null)) instanceof LivingEntity _livEnt15 && _livEnt15.hasEffect(HowToOwnADragonModMobEffects.IN_LOVE.get())) {
					if (entity instanceof Player _player) {
						ItemStack _stktoremove = new ItemStack(Blocks.SANDSTONE);
						_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
					}
					if (((Entity) world.getEntitiesOfClass(GroncklePinkMaleEntity.class, AABB.ofSize(new Vec3(x, y, z), 10, 10, 10), e -> true).stream().sorted(new Object() {
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
				}
			} else if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Blocks.COBBLESTONE.asItem()) {
				if (((Entity) world.getEntitiesOfClass(GroncklePinkMaleEntity.class, AABB.ofSize(new Vec3(x, y, z), 10, 10, 10), e -> true).stream().sorted(new Object() {
					Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
						return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
					}
				}.compareDistOf(x, y, z)).findFirst().orElse(null)) instanceof LivingEntity _livEnt26 && _livEnt26.hasEffect(HowToOwnADragonModMobEffects.IN_LOVE.get())) {
					if (entity instanceof Player _player) {
						ItemStack _stktoremove = new ItemStack(Blocks.COBBLESTONE);
						_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
					}
					if (((Entity) world.getEntitiesOfClass(GroncklePinkMaleEntity.class, AABB.ofSize(new Vec3(x, y, z), 10, 10, 10), e -> true).stream().sorted(new Object() {
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
				}
			} else if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Blocks.DEEPSLATE.asItem()) {
				if (((Entity) world.getEntitiesOfClass(GroncklePinkMaleEntity.class, AABB.ofSize(new Vec3(x, y, z), 10, 10, 10), e -> true).stream().sorted(new Object() {
					Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
						return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
					}
				}.compareDistOf(x, y, z)).findFirst().orElse(null)) instanceof LivingEntity _livEnt37 && _livEnt37.hasEffect(HowToOwnADragonModMobEffects.IN_LOVE.get())) {
					if (entity instanceof Player _player) {
						ItemStack _stktoremove = new ItemStack(Blocks.DEEPSLATE);
						_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
					}
					if (((Entity) world.getEntitiesOfClass(GroncklePinkMaleEntity.class, AABB.ofSize(new Vec3(x, y, z), 10, 10, 10), e -> true).stream().sorted(new Object() {
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
				}
			} else if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Blocks.COBBLED_DEEPSLATE.asItem()) {
				if (((Entity) world.getEntitiesOfClass(GroncklePinkMaleEntity.class, AABB.ofSize(new Vec3(x, y, z), 10, 10, 10), e -> true).stream().sorted(new Object() {
					Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
						return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
					}
				}.compareDistOf(x, y, z)).findFirst().orElse(null)) instanceof LivingEntity _livEnt48 && _livEnt48.hasEffect(HowToOwnADragonModMobEffects.IN_LOVE.get())) {
					if (entity instanceof Player _player) {
						ItemStack _stktoremove = new ItemStack(Blocks.COBBLED_DEEPSLATE);
						_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
					}
					if (((Entity) world.getEntitiesOfClass(GroncklePinkMaleEntity.class, AABB.ofSize(new Vec3(x, y, z), 10, 10, 10), e -> true).stream().sorted(new Object() {
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
				}
			} else if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Blocks.DIORITE.asItem()) {
				if (((Entity) world.getEntitiesOfClass(GroncklePinkMaleEntity.class, AABB.ofSize(new Vec3(x, y, z), 10, 10, 10), e -> true).stream().sorted(new Object() {
					Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
						return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
					}
				}.compareDistOf(x, y, z)).findFirst().orElse(null)) instanceof LivingEntity _livEnt59 && _livEnt59.hasEffect(HowToOwnADragonModMobEffects.IN_LOVE.get())) {
					if (entity instanceof Player _player) {
						ItemStack _stktoremove = new ItemStack(Blocks.DIORITE);
						_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
					}
					if (((Entity) world.getEntitiesOfClass(GroncklePinkMaleEntity.class, AABB.ofSize(new Vec3(x, y, z), 10, 10, 10), e -> true).stream().sorted(new Object() {
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
				}
			} else if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Blocks.GRANITE.asItem()) {
				if (((Entity) world.getEntitiesOfClass(GroncklePinkMaleEntity.class, AABB.ofSize(new Vec3(x, y, z), 10, 10, 10), e -> true).stream().sorted(new Object() {
					Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
						return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
					}
				}.compareDistOf(x, y, z)).findFirst().orElse(null)) instanceof LivingEntity _livEnt70 && _livEnt70.hasEffect(HowToOwnADragonModMobEffects.IN_LOVE.get())) {
					if (entity instanceof Player _player) {
						ItemStack _stktoremove = new ItemStack(Blocks.GRANITE);
						_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
					}
					if (((Entity) world.getEntitiesOfClass(GroncklePinkMaleEntity.class, AABB.ofSize(new Vec3(x, y, z), 10, 10, 10), e -> true).stream().sorted(new Object() {
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
				}
			} else if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Blocks.ANDESITE.asItem()) {
				if (((Entity) world.getEntitiesOfClass(GroncklePinkMaleEntity.class, AABB.ofSize(new Vec3(x, y, z), 10, 10, 10), e -> true).stream().sorted(new Object() {
					Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
						return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
					}
				}.compareDistOf(x, y, z)).findFirst().orElse(null)) instanceof LivingEntity _livEnt81 && _livEnt81.hasEffect(HowToOwnADragonModMobEffects.IN_LOVE.get())) {
					if (entity instanceof Player _player) {
						ItemStack _stktoremove = new ItemStack(Blocks.ANDESITE);
						_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
					}
					if (((Entity) world.getEntitiesOfClass(GroncklePinkMaleEntity.class, AABB.ofSize(new Vec3(x, y, z), 10, 10, 10), e -> true).stream().sorted(new Object() {
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
				}
			}
		}
	}
}
