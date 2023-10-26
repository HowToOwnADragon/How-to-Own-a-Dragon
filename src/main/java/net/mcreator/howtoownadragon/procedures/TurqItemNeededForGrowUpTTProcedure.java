package net.mcreator.howtoownadragon.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

public class TurqItemNeededForGrowUpTTProcedure {
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
			TurqGrowUpProcedureTTProcedure.execute(world, x, y, z, entity, sourceentity);
		} else if ((entity.getPersistentData().getString("ttgrowup")).equals("cod") && (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Items.COD) {
			if (sourceentity instanceof LivingEntity _entity) {
				ItemStack _setstack = new ItemStack(Items.COD);
				_setstack.setCount((int) ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getCount() - 1));
				_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
				if (_entity instanceof Player _player)
					_player.getInventory().setChanged();
			}
			TurqGrowUpProcedureTTProcedure.execute(world, x, y, z, entity, sourceentity);
		} else if ((entity.getPersistentData().getString("ttgrowup")).equals("salmon") && (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Items.SALMON) {
			if (sourceentity instanceof LivingEntity _entity) {
				ItemStack _setstack = new ItemStack(Items.SALMON);
				_setstack.setCount((int) ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getCount() - 1));
				_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
				if (_entity instanceof Player _player)
					_player.getInventory().setChanged();
			}
			TurqGrowUpProcedureTTProcedure.execute(world, x, y, z, entity, sourceentity);
		} else if ((entity.getPersistentData().getString("ttgrowup")).equals("chicken") && (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Items.COOKED_CHICKEN) {
			if (sourceentity instanceof LivingEntity _entity) {
				ItemStack _setstack = new ItemStack(Items.COOKED_CHICKEN);
				_setstack.setCount((int) ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getCount() - 1));
				_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
				if (_entity instanceof Player _player)
					_player.getInventory().setChanged();
			}
			TurqGrowUpProcedureTTProcedure.execute(world, x, y, z, entity, sourceentity);
		}
	}
}
