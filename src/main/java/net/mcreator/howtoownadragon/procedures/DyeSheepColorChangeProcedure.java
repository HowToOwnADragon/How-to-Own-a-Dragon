package net.mcreator.howtoownadragon.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;

import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

import net.mcreator.howtoownadragon.entity.SheepEntity;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class DyeSheepColorChangeProcedure {
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
		if (entity instanceof SheepEntity && entity.getPersistentData().getBoolean("sheared") == false) {
			if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Items.WHITE_DYE) {
				entity.getPersistentData().putString("sheepcolor", "white");
				if (entity instanceof SheepEntity animatable)
					animatable.setTexture("sheep");
			} else if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Items.BLACK_DYE) {
				entity.getPersistentData().putString("sheepcolor", "black");
				if (entity instanceof SheepEntity animatable)
					animatable.setTexture("sheepblack");
			} else if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Items.GRAY_DYE) {
				entity.getPersistentData().putString("sheepcolor", "grey");
				if (entity instanceof SheepEntity animatable)
					animatable.setTexture("sheepgrey");
			} else if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Items.LIGHT_GRAY_DYE) {
				entity.getPersistentData().putString("sheepcolor", "lightgrey");
				if (entity instanceof SheepEntity animatable)
					animatable.setTexture("sheeplightgrey");
			} else if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Items.BROWN_DYE) {
				entity.getPersistentData().putString("sheepcolor", "brown");
				if (entity instanceof SheepEntity animatable)
					animatable.setTexture("sheepbrown");
			} else if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Items.RED_DYE) {
				entity.getPersistentData().putString("sheepcolor", "red");
				if (entity instanceof SheepEntity animatable)
					animatable.setTexture("sheepred");
			} else if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Items.ORANGE_DYE) {
				entity.getPersistentData().putString("sheepcolor", "orange");
				if (entity instanceof SheepEntity animatable)
					animatable.setTexture("sheeporange");
			} else if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Items.YELLOW_DYE) {
				entity.getPersistentData().putString("sheepcolor", "yellow");
				if (entity instanceof SheepEntity animatable)
					animatable.setTexture("sheepyellow");
			} else if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Items.GREEN_DYE) {
				entity.getPersistentData().putString("sheepcolor", "green");
				if (entity instanceof SheepEntity animatable)
					animatable.setTexture("sheepgreen");
			} else if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Items.LIME_DYE) {
				entity.getPersistentData().putString("sheepcolor", "lime");
				if (entity instanceof SheepEntity animatable)
					animatable.setTexture("sheeplime");
			} else if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Items.CYAN_DYE) {
				entity.getPersistentData().putString("sheepcolor", "cyan");
				if (entity instanceof SheepEntity animatable)
					animatable.setTexture("sheepcyan");
			} else if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Items.BLUE_DYE) {
				entity.getPersistentData().putString("sheepcolor", "blue");
				if (entity instanceof SheepEntity animatable)
					animatable.setTexture("sheepblue");
			} else if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Items.LIGHT_BLUE_DYE) {
				entity.getPersistentData().putString("sheepcolor", "lightblue");
				if (entity instanceof SheepEntity animatable)
					animatable.setTexture("sheeplightblue");
			} else if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Items.PURPLE_DYE) {
				entity.getPersistentData().putString("sheepcolor", "purple");
				if (entity instanceof SheepEntity animatable)
					animatable.setTexture("sheeppurple");
			} else if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Items.MAGENTA_DYE) {
				entity.getPersistentData().putString("sheepcolor", "magenta");
				if (entity instanceof SheepEntity animatable)
					animatable.setTexture("sheepmagenta");
			} else if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Items.PINK_DYE) {
				entity.getPersistentData().putString("sheepcolor", "pink");
				if (entity instanceof SheepEntity animatable)
					animatable.setTexture("sheeppink");
			}
		}
	}
}
