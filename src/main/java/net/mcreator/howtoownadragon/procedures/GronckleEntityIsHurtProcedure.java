package net.mcreator.howtoownadragon.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.InteractionHand;

import net.mcreator.howtoownadragon.init.HowToOwnADragonModItems;
import net.mcreator.howtoownadragon.HowToOwnADragonMod;

public class GronckleEntityIsHurtProcedure {
	public static void execute(LevelAccessor world, Entity entity, Entity sourceentity) {
		if (entity == null || sourceentity == null)
			return;
		if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == ItemStack.EMPTY.getItem()) {
			if ((entity.getPersistentData().getString("groncklecolor")).equals("pink")) {
				if (!entity.level.isClientSide())
					entity.discard();
				if (sourceentity instanceof LivingEntity _entity) {
					ItemStack _setstack = new ItemStack(HowToOwnADragonModItems.GRONCKLE_EGG_ITEM.get());
					_setstack.setCount(1);
					_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
					if (_entity instanceof Player _player)
						_player.getInventory().setChanged();
				}
				HowToOwnADragonMod.queueServerWork(1, () -> {
					(sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getOrCreateTag().putString("groncklecolor", "pink");
				});
			} else if ((entity.getPersistentData().getString("groncklecolor")).equals("orangered")) {
				if (!entity.level.isClientSide())
					entity.discard();
				if (sourceentity instanceof LivingEntity _entity) {
					ItemStack _setstack = new ItemStack(HowToOwnADragonModItems.GRONCKLE_EGG_ITEM.get());
					_setstack.setCount(1);
					_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
					if (_entity instanceof Player _player)
						_player.getInventory().setChanged();
				}
				HowToOwnADragonMod.queueServerWork(1, () -> {
					(sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getOrCreateTag().putString("groncklecolor", "orangered");
				});
			} else if ((entity.getPersistentData().getString("groncklecolor")).equals("blueyellow")) {
				if (!entity.level.isClientSide())
					entity.discard();
				if (sourceentity instanceof LivingEntity _entity) {
					ItemStack _setstack = new ItemStack(HowToOwnADragonModItems.GRONCKLE_EGG_ITEM.get());
					_setstack.setCount(1);
					_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
					if (_entity instanceof Player _player)
						_player.getInventory().setChanged();
				}
				HowToOwnADragonMod.queueServerWork(1, () -> {
					(sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getOrCreateTag().putString("groncklecolor", "blueyellow");
				});
			} else if ((entity.getPersistentData().getString("groncklecolor")).equals("meatlug")) {
				if (!entity.level.isClientSide())
					entity.discard();
				if (sourceentity instanceof LivingEntity _entity) {
					ItemStack _setstack = new ItemStack(HowToOwnADragonModItems.GRONCKLE_EGG_ITEM.get());
					_setstack.setCount(1);
					_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
					if (_entity instanceof Player _player)
						_player.getInventory().setChanged();
				}
				HowToOwnADragonMod.queueServerWork(1, () -> {
					(sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getOrCreateTag().putString("groncklecolor", "meatlug");
				});
			}
		}
	}
}
