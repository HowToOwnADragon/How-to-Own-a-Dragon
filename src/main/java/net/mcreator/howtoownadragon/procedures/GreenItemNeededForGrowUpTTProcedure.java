package net.mcreator.howtoownadragon.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

public class GreenItemNeededForGrowUpTTProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, Entity sourceentity) {
		if (entity == null || sourceentity == null)
			return;
		if ((entity.getPersistentData().getString("ttgrowup")).equals("bread") && (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Items.BREAD) {
			if (sourceentity instanceof Player _player) {
				ItemStack _stktoremove = new ItemStack(Items.BREAD);
				_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
			}
			GreenGrowUpProcedureTTProcedure.execute(world, x, y, z, entity, sourceentity);
		} else if ((entity.getPersistentData().getString("ttgrowup")).equals("cod") && (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Items.COD) {
			if (sourceentity instanceof Player _player) {
				ItemStack _stktoremove = new ItemStack(Items.COD);
				_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
			}
			GreenGrowUpProcedureTTProcedure.execute(world, x, y, z, entity, sourceentity);
		} else if ((entity.getPersistentData().getString("ttgrowup")).equals("salmon") && (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Items.SALMON) {
			if (sourceentity instanceof Player _player) {
				ItemStack _stktoremove = new ItemStack(Items.SALMON);
				_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
			}
			GreenGrowUpProcedureTTProcedure.execute(world, x, y, z, entity, sourceentity);
		} else if ((entity.getPersistentData().getString("ttgrowup")).equals("chicken") && (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Items.COOKED_CHICKEN) {
			if (sourceentity instanceof Player _player) {
				ItemStack _stktoremove = new ItemStack(Items.COOKED_CHICKEN);
				_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
			}
			GreenGrowUpProcedureTTProcedure.execute(world, x, y, z, entity, sourceentity);
		}
	}
}
