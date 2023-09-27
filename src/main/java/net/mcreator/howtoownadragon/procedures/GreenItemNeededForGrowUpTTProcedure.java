package net.mcreator.howtoownadragon.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.InteractionHand;

public class GreenItemNeededForGrowUpTTProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, Entity sourceentity) {
		if (entity == null || sourceentity == null)
			return;
		if ((entity.getPersistentData().getString("ttgrowup")).equals("bread") && (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Items.BREAD) {
			if (sourceentity instanceof LivingEntity _entity) {
				ItemStack _setstack = new ItemStack(Items.BREAD);
				_setstack.setCount((int) ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getCount() - 1));
				_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
				if (_entity instanceof Player _player)
					_player.getInventory().setChanged();
			}
			GreenGrowUpProcedureTTProcedure.execute(world, x, y, z, entity, sourceentity);
		} else if ((entity.getPersistentData().getString("ttgrowup")).equals("cod") && (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Items.COD) {
			if (sourceentity instanceof LivingEntity _entity) {
				ItemStack _setstack = new ItemStack(Items.COD);
				_setstack.setCount((int) ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getCount() - 1));
				_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
				if (_entity instanceof Player _player)
					_player.getInventory().setChanged();
			}
			GreenGrowUpProcedureTTProcedure.execute(world, x, y, z, entity, sourceentity);
		} else if ((entity.getPersistentData().getString("ttgrowup")).equals("salmon") && (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Items.SALMON) {
			if (sourceentity instanceof LivingEntity _entity) {
				ItemStack _setstack = new ItemStack(Items.SALMON);
				_setstack.setCount((int) ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getCount() - 1));
				_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
				if (_entity instanceof Player _player)
					_player.getInventory().setChanged();
			}
			GreenGrowUpProcedureTTProcedure.execute(world, x, y, z, entity, sourceentity);
		} else if ((entity.getPersistentData().getString("ttgrowup")).equals("chicken") && (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Items.COOKED_CHICKEN) {
			if (sourceentity instanceof LivingEntity _entity) {
				ItemStack _setstack = new ItemStack(Items.COOKED_CHICKEN);
				_setstack.setCount((int) ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getCount() - 1));
				_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
				if (_entity instanceof Player _player)
					_player.getInventory().setChanged();
			}
			GreenGrowUpProcedureTTProcedure.execute(world, x, y, z, entity, sourceentity);
		}
	}
}
