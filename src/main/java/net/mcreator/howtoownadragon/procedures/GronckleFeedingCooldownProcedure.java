package net.mcreator.howtoownadragon.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.tags.TagKey;
import net.minecraft.tags.ItemTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class GronckleFeedingCooldownProcedure {
	@SubscribeEvent
	public static void onRightClickEntity(PlayerInteractEvent.EntityInteract event) {
		if (event.getHand() != event.getEntity().getUsedItemHand())
			return;
		execute(event, event.getLevel(), event.getTarget(), event.getEntity());
	}

	public static void execute(LevelAccessor world, Entity entity, Entity sourceentity) {
		execute(null, world, entity, sourceentity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, Entity entity, Entity sourceentity) {
		if (entity == null || sourceentity == null)
			return;
		if (entity.getPersistentData().getBoolean("groncklefeedcooldown") == false) {
			if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).is(ItemTags.create(new ResourceLocation("how_to_own_a_dragon:gronckle_feed_items")))
					&& entity.getType().is(TagKey.create(Registries.ENTITY_TYPE, new ResourceLocation("how_to_own_a_dragon:gronckles")))) {
				entity.getPersistentData().putBoolean("groncklefeedcooldown", true);
				GronckleFeedingCooldown2Procedure.execute(world, entity);
			}
		}
	}
}
