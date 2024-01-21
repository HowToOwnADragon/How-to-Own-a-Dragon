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
import net.mcreator.howtoownadragon.entity.GronckleMaleEntity;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class SaddleMaleGronckleProcedure {
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
		if (entity instanceof GronckleMaleEntity && (entity instanceof TamableAnimal _tamEnt ? _tamEnt.isTame() : false)) {
			if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == HowToOwnADragonModItems.GRONCKLE_SADDLE.get() && entity.getPersistentData().getBoolean("Saddle") == false) {
				if (sourceentity instanceof LivingEntity _entity) {
					ItemStack _setstack = new ItemStack(HowToOwnADragonModItems.SADDLE_RACK.get());
					_setstack.setCount(1);
					_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
					if (_entity instanceof Player _player)
						_player.getInventory().setChanged();
				}
				entity.getPersistentData().putBoolean("Saddle", true);
				if ((entity.getPersistentData().getString("Color")).equals("blueyellow")) {
					if (entity instanceof GronckleMaleEntity animatable)
						animatable.setTexture("gronckleblueyellowsaddle");
				} else if ((entity.getPersistentData().getString("Color")).equals("meatlug")) {
					if (entity instanceof GronckleMaleEntity animatable)
						animatable.setTexture("meatlugsaddle");
				} else if ((entity.getPersistentData().getString("Color")).equals("orangered")) {
					if (entity instanceof GronckleMaleEntity animatable)
						animatable.setTexture("gronckleorangeredsaddle");
				} else if ((entity.getPersistentData().getString("Color")).equals("pink")) {
					if (entity instanceof GronckleMaleEntity animatable)
						animatable.setTexture("groncklepinksaddle");
				}
			} else if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == HowToOwnADragonModItems.SADDLE_RACK.get() && entity.getPersistentData().getBoolean("Saddle") == true) {
				if (sourceentity instanceof LivingEntity _entity) {
					ItemStack _setstack = new ItemStack(HowToOwnADragonModItems.GRONCKLE_SADDLE.get());
					_setstack.setCount(1);
					_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
					if (_entity instanceof Player _player)
						_player.getInventory().setChanged();
				}
				entity.getPersistentData().putBoolean("Saddle", false);
				if ((entity.getPersistentData().getString("Color")).equals("blueyellow")) {
					if (entity instanceof GronckleMaleEntity animatable)
						animatable.setTexture("gronckleblueyellow");
				} else if ((entity.getPersistentData().getString("Color")).equals("meatlug")) {
					if (entity instanceof GronckleMaleEntity animatable)
						animatable.setTexture("meatlug");
				} else if ((entity.getPersistentData().getString("Color")).equals("orangered")) {
					if (entity instanceof GronckleMaleEntity animatable)
						animatable.setTexture("gronckleorangered");
				} else if ((entity.getPersistentData().getString("Color")).equals("pink")) {
					if (entity instanceof GronckleMaleEntity animatable)
						animatable.setTexture("groncklepink");
				}
			}
		}
	}
}
