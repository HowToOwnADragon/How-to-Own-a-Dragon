package net.mcreator.howtoownadragon.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.EntityJoinLevelEvent;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.tags.TagKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;

import net.mcreator.howtoownadragon.entity.ChickenEntity;
import net.mcreator.howtoownadragon.entity.BabyChickenEntity;
import net.mcreator.howtoownadragon.HowToOwnADragonMod;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class RenderDistanceFixChickenProcedure {
	@SubscribeEvent
	public static void onEntitySpawned(EntityJoinLevelEvent event) {
		execute(event, event.getLevel(), event.getEntity().getX(), event.getEntity().getY(), event.getEntity().getZ(), event.getEntity());
	}

	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		execute(null, world, x, y, z, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		HowToOwnADragonMod.queueServerWork(3, () -> {
			if (!(entity.getPersistentData().getBoolean("loadedchicken") == true)) {
				entity.getPersistentData().putBoolean("loadedchicken", true);
				if (entity.getType().is(TagKey.create(Registries.ENTITY_TYPE, new ResourceLocation("how_to_own_a_dragon:chickens")))) {
					if (entity instanceof ChickenEntity) {
						if ((entity.getPersistentData().getString("chickencolor")).equals("brown")) {
							if (entity instanceof ChickenEntity animatable)
								animatable.setTexture("chickenbrown");
							TextureFixChickenWaitProcedure.execute(world, x, y, z, entity);
						} else if ((entity.getPersistentData().getString("chickencolor")).equals("lightbrown")) {
							if (entity instanceof ChickenEntity animatable)
								animatable.setTexture("chickenlightbrown");
							TextureFixChickenWaitProcedure.execute(world, x, y, z, entity);
						} else if ((entity.getPersistentData().getString("chickencolor")).equals("white")) {
							if (entity instanceof ChickenEntity animatable)
								animatable.setTexture("chickenwhite");
							TextureFixChickenWaitProcedure.execute(world, x, y, z, entity);
						} else {
							OnInitialEntitySpawnChickenProcedure.execute(world, x, y, z, entity);
							HowToOwnADragonMod.queueServerWork(200, () -> {
								entity.getPersistentData().putBoolean("loadedchicken", false);
								OnInitialEntitySpawnChickenProcedure.execute(world, x, y, z, entity);
							});
						}
					} else {
						if (entity instanceof BabyChickenEntity) {
							if ((entity.getPersistentData().getString("chickencolor")).equals("brown")) {
								if (entity instanceof BabyChickenEntity animatable)
									animatable.setTexture("chickenbrown");
								TextureFixChickenWaitProcedure.execute(world, x, y, z, entity);
							} else if ((entity.getPersistentData().getString("chickencolor")).equals("lightbrown")) {
								if (entity instanceof BabyChickenEntity animatable)
									animatable.setTexture("chickenlightbrown");
								TextureFixChickenWaitProcedure.execute(world, x, y, z, entity);
							} else if ((entity.getPersistentData().getString("chickencolor")).equals("white")) {
								if (entity instanceof BabyChickenEntity animatable)
									animatable.setTexture("chickenwhite");
								TextureFixChickenWaitProcedure.execute(world, x, y, z, entity);
							}
						}
					}
				}
			}
		});
	}
}
