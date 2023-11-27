package net.mcreator.howtoownadragon.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.living.LivingEvent;

import net.minecraft.world.entity.Entity;
import net.minecraft.tags.TagKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;

import net.mcreator.howtoownadragon.entity.ChickenEntity;
import net.mcreator.howtoownadragon.entity.BabyChickenEntity;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class RenderDistanceFixChickenProcedure {
	@SubscribeEvent
	public static void onEntityTick(LivingEvent.LivingTickEvent event) {
		execute(event, event.getEntity());
	}

	public static void execute(Entity entity) {
		execute(null, entity);
	}

	private static void execute(@Nullable Event event, Entity entity) {
		if (entity == null)
			return;
		if (entity.getType().is(TagKey.create(Registries.ENTITY_TYPE, new ResourceLocation("how_to_own_a_dragon:chickens")))) {
			if (entity instanceof ChickenEntity) {
				if ((entity.getPersistentData().getString("chickencolor")).equals("brown")) {
					if (entity instanceof ChickenEntity animatable)
						animatable.setTexture("chickenbrown");
				} else if ((entity.getPersistentData().getString("chickencolor")).equals("lightbrown")) {
					if (entity instanceof ChickenEntity animatable)
						animatable.setTexture("chickenlightbrown");
				} else if ((entity.getPersistentData().getString("chickencolor")).equals("white")) {
					if (entity instanceof ChickenEntity animatable)
						animatable.setTexture("chickenwhite");
				}
			} else {
				if (entity instanceof BabyChickenEntity) {
					if ((entity.getPersistentData().getString("chickencolor")).equals("brown")) {
						if (entity instanceof BabyChickenEntity animatable)
							animatable.setTexture("chickenbrown");
					} else if ((entity.getPersistentData().getString("chickencolor")).equals("lightbrown")) {
						if (entity instanceof BabyChickenEntity animatable)
							animatable.setTexture("chickenlightbrown");
					} else if ((entity.getPersistentData().getString("chickencolor")).equals("white")) {
						if (entity instanceof BabyChickenEntity animatable)
							animatable.setTexture("chickenwhite");
					}
				}
			}
		}
	}
}
