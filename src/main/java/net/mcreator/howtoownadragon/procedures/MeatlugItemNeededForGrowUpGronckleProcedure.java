package net.mcreator.howtoownadragon.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

public class MeatlugItemNeededForGrowUpGronckleProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, Entity sourceentity) {
		if (entity == null || sourceentity == null)
			return;
		if ((entity.getPersistentData().getString("groncklegrowup")).equals("stone")) {
			if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Blocks.STONE.asItem()) {
				if (sourceentity instanceof Player _player) {
					ItemStack _stktoremove = new ItemStack(Blocks.STONE);
					_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
				}
				MeatlugGrowUpProcedureGronckleProcedure.execute(world, x, y, z, entity, sourceentity);
			}
		} else if ((entity.getPersistentData().getString("groncklegrowup")).equals("cobblestone")) {
			if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Blocks.COBBLESTONE.asItem()) {
				if (sourceentity instanceof Player _player) {
					ItemStack _stktoremove = new ItemStack(Blocks.COBBLESTONE);
					_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
				}
				MeatlugGrowUpProcedureGronckleProcedure.execute(world, x, y, z, entity, sourceentity);
			}
		} else if ((entity.getPersistentData().getString("groncklegrowup")).equals("deepslate")) {
			if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Blocks.DEEPSLATE.asItem()) {
				if (sourceentity instanceof Player _player) {
					ItemStack _stktoremove = new ItemStack(Blocks.DEEPSLATE);
					_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
				}
				MeatlugGrowUpProcedureGronckleProcedure.execute(world, x, y, z, entity, sourceentity);
			}
		} else if ((entity.getPersistentData().getString("groncklegrowup")).equals("cobbleddeepslate")) {
			if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Blocks.COBBLED_DEEPSLATE.asItem()) {
				if (sourceentity instanceof Player _player) {
					ItemStack _stktoremove = new ItemStack(Blocks.COBBLED_DEEPSLATE);
					_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
				}
				MeatlugGrowUpProcedureGronckleProcedure.execute(world, x, y, z, entity, sourceentity);
			}
		} else if ((entity.getPersistentData().getString("groncklegrowup")).equals("andesite")) {
			if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Blocks.ANDESITE.asItem()) {
				if (sourceentity instanceof Player _player) {
					ItemStack _stktoremove = new ItemStack(Blocks.ANDESITE);
					_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
				}
				MeatlugGrowUpProcedureGronckleProcedure.execute(world, x, y, z, entity, sourceentity);
			}
		} else if ((entity.getPersistentData().getString("groncklegrowup")).equals("diorite")) {
			if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Blocks.DIORITE.asItem()) {
				if (sourceentity instanceof Player _player) {
					ItemStack _stktoremove = new ItemStack(Blocks.DIORITE);
					_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
				}
				MeatlugGrowUpProcedureGronckleProcedure.execute(world, x, y, z, entity, sourceentity);
			}
		} else if ((entity.getPersistentData().getString("groncklegrowup")).equals("granite")) {
			if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Blocks.GRANITE.asItem()) {
				if (sourceentity instanceof Player _player) {
					ItemStack _stktoremove = new ItemStack(Blocks.GRANITE);
					_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
				}
				MeatlugGrowUpProcedureGronckleProcedure.execute(world, x, y, z, entity, sourceentity);
			}
		} else if ((entity.getPersistentData().getString("groncklegrowup")).equals("lava")) {
			if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Items.LAVA_BUCKET) {
				if (sourceentity instanceof Player _player) {
					ItemStack _stktoremove = new ItemStack(Items.LAVA_BUCKET);
					_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
				}
				MeatlugGrowUpProcedureGronckleProcedure.execute(world, x, y, z, entity, sourceentity);
			}
		} else if ((entity.getPersistentData().getString("groncklegrowup")).equals("iron")) {
			if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Items.IRON_INGOT) {
				if (sourceentity instanceof Player _player) {
					ItemStack _stktoremove = new ItemStack(Items.IRON_INGOT);
					_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
				}
				MeatlugGrowUpProcedureGronckleProcedure.execute(world, x, y, z, entity, sourceentity);
			}
		} else if ((entity.getPersistentData().getString("groncklegrowup")).equals("sandstone")) {
			if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Blocks.SANDSTONE.asItem()) {
				if (sourceentity instanceof Player _player) {
					ItemStack _stktoremove = new ItemStack(Blocks.SANDSTONE);
					_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
				}
				MeatlugGrowUpProcedureGronckleProcedure.execute(world, x, y, z, entity, sourceentity);
			}
		}
	}
}
