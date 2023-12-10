package net.mcreator.howtoownadragon.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.TickEvent;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class ATSecondPageCheckProcedure {
	@SubscribeEvent
	public static void onPlayerTick(TickEvent.PlayerTickEvent event) {
		if (event.phase == TickEvent.Phase.END) {
			execute(event, event.player.level, event.player.getX(), event.player.getY(), event.player.getZ(), event.player);
		}
	}

	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		execute(null, world, x, y, z, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (!(entity.getPersistentData().getBoolean("DarkForestCheck") == true) && world.getBiome(BlockPos.containing(x, y, z)).is(new ResourceLocation("dark_forest"))) {
			entity.getPersistentData().putBoolean("DarkForestCheck", true);
		} else {
			if (!(entity.getPersistentData().getBoolean("DeepColdOceanCheck") == true) && world.getBiome(BlockPos.containing(x, y, z)).is(new ResourceLocation("deep_cold_ocean"))) {
				entity.getPersistentData().putBoolean("DeepColdOceanCheck", true);
			} else {
				if (!(entity.getPersistentData().getBoolean("DeepDarkCheck") == true) && world.getBiome(BlockPos.containing(x, y, z)).is(new ResourceLocation("deep_dark"))) {
					entity.getPersistentData().putBoolean("DeepDarkCheck", true);
				} else {
					if (!(entity.getPersistentData().getBoolean("DeepFrozenOceanCheck") == true) && world.getBiome(BlockPos.containing(x, y, z)).is(new ResourceLocation("deep_frozen_ocean"))) {
						entity.getPersistentData().putBoolean("DeepFrozenOceanCheck", true);
					} else {
						if (!(entity.getPersistentData().getBoolean("DeepLukewarmOceanCheck") == true) && world.getBiome(BlockPos.containing(x, y, z)).is(new ResourceLocation("deep_lukewarm_ocean"))) {
							entity.getPersistentData().putBoolean("DeepLukewarmOceanCheck", true);
						} else {
							if (!(entity.getPersistentData().getBoolean("DeepOceanCheck") == true) && world.getBiome(BlockPos.containing(x, y, z)).is(new ResourceLocation("deep_ocean"))) {
								entity.getPersistentData().putBoolean("DeepOceanCheck", true);
							}
						}
					}
				}
			}
		}
	}
}
