package net.mcreator.howtoownadragon.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.TamableAnimal;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.InteractionHand;

import net.mcreator.howtoownadragon.init.HowToOwnADragonModItems;
import net.mcreator.howtoownadragon.entity.NadderMaleEntity;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class StormflySaddleMaleNadderProcedure {
	@SubscribeEvent
	public static void onRightClickEntity(PlayerInteractEvent.EntityInteract event) {
		if (event.getHand() != event.getEntity().getUsedItemHand())
			return;
		execute(event, event.getTarget(), event.getEntity());
	}

	public static void execute(Entity entity, Entity sourceentity) {
		execute(null, entity, sourceentity);
	}

	private static void execute(@Nullable Event event, Entity entity, Entity sourceentity) {
		if (entity == null || sourceentity == null)
			return;
		if (entity instanceof NadderMaleEntity && (entity instanceof TamableAnimal _tamEnt ? _tamEnt.isTame() : false)) {
			if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == HowToOwnADragonModItems.NADDER_SADDLE.get() && entity.getPersistentData().getBoolean("naddersaddle") == false
					&& (entity.getPersistentData().getString("naddercolor")).equals("stormfly")) {
				if (sourceentity instanceof LivingEntity _entity) {
					ItemStack _setstack = new ItemStack(HowToOwnADragonModItems.SADDLE_RACK.get());
					_setstack.setCount(1);
					_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
					if (_entity instanceof Player _player)
						_player.getInventory().setChanged();
				}
				if (entity instanceof NadderMaleEntity animatable)
					animatable.setTexture("stormflysaddle");
				entity.getPersistentData().putBoolean("naddersaddle", true);
			} else if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == HowToOwnADragonModItems.SADDLE_RACK.get() && entity.getPersistentData().getBoolean("naddersaddle") == true
					&& (entity.getPersistentData().getString("naddercolor")).equals("stormfly")) {
				if (sourceentity instanceof LivingEntity _entity) {
					ItemStack _setstack = new ItemStack(HowToOwnADragonModItems.NADDER_SADDLE.get());
					_setstack.setCount(1);
					_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
					if (_entity instanceof Player _player)
						_player.getInventory().setChanged();
				}
				if (entity instanceof NadderMaleEntity animatable)
					animatable.setTexture("stormfly");
				entity.getPersistentData().putBoolean("naddersaddle", false);
			}
		}
	}
}
