package net.mcreator.howtoownadragon.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.InteractionHand;

import net.mcreator.howtoownadragon.init.HowToOwnADragonModItems;
import net.mcreator.howtoownadragon.HowToOwnADragonMod;

public class TTEggEntityEntityIsHurtProcedure {
	public static void execute(LevelAccessor world, Entity entity, Entity sourceentity) {
		if (entity == null || sourceentity == null)
			return;
		if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == ItemStack.EMPTY.getItem()) {
			if ((entity.getPersistentData().getString("ttcolor")).equals("green")) {
				if (!entity.level.isClientSide())
					entity.discard();
				if (sourceentity instanceof LivingEntity _entity) {
					ItemStack _setstack = new ItemStack(HowToOwnADragonModItems.TT_EGG_ITEM.get());
					_setstack.setCount(1);
					_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
					if (_entity instanceof Player _player)
						_player.getInventory().setChanged();
				}
				HowToOwnADragonMod.queueServerWork(1, () -> {
					(sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getOrCreateTag().putString("ttcolor", "green");
				});
			} else if ((entity.getPersistentData().getString("ttcolor")).equals("pink")) {
				if (!entity.level.isClientSide())
					entity.discard();
				if (sourceentity instanceof LivingEntity _entity) {
					ItemStack _setstack = new ItemStack(HowToOwnADragonModItems.TT_EGG_ITEM.get());
					_setstack.setCount(1);
					_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
					if (_entity instanceof Player _player)
						_player.getInventory().setChanged();
				}
				HowToOwnADragonMod.queueServerWork(1, () -> {
					(sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getOrCreateTag().putString("ttcolor", "pink");
				});
			} else if ((entity.getPersistentData().getString("ttcolor")).equals("turq")) {
				if (!entity.level.isClientSide())
					entity.discard();
				if (sourceentity instanceof LivingEntity _entity) {
					ItemStack _setstack = new ItemStack(HowToOwnADragonModItems.TT_EGG_ITEM.get());
					_setstack.setCount(1);
					_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
					if (_entity instanceof Player _player)
						_player.getInventory().setChanged();
				}
				HowToOwnADragonMod.queueServerWork(1, () -> {
					(sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getOrCreateTag().putString("ttcolor", "turq");
				});
			} else {
				if (!entity.level.isClientSide())
					entity.discard();
				if (sourceentity instanceof LivingEntity _entity) {
					ItemStack _setstack = new ItemStack(HowToOwnADragonModItems.TT_EGG_ITEM.get());
					_setstack.setCount(1);
					_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
					if (_entity instanceof Player _player)
						_player.getInventory().setChanged();
				}
			}
		}
	}
}
