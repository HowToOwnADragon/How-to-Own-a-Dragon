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
public class ATSixthPageCheckProcedure {
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
		if (!(entity.getPersistentData().getBoolean("OldGrowthBirchForestCheck") == true) && world.getBiome(BlockPos.containing(x, y, z)).is(new ResourceLocation("old_growth_birch_forest"))) {
			entity.getPersistentData().putBoolean("OldGrowthBirchForestCheck", true);
		} else {
			if (!(entity.getPersistentData().getBoolean("OldGrowthPineTaigaCheck") == true) && world.getBiome(BlockPos.containing(x, y, z)).is(new ResourceLocation("old_growth_pine_taiga"))) {
				entity.getPersistentData().putBoolean("OldGrowthPineTaigaCheck", true);
			} else {
				if (!(entity.getPersistentData().getBoolean("OldGrowthSpruceTaigaCheck") == true) && world.getBiome(BlockPos.containing(x, y, z)).is(new ResourceLocation("old_growth_spruce_taiga"))) {
					entity.getPersistentData().putBoolean("OldGrowthSpruceTaigaCheck", true);
				} else {
					if (!(entity.getPersistentData().getBoolean("PlainsCheck") == true) && world.getBiome(BlockPos.containing(x, y, z)).is(new ResourceLocation("plains"))) {
						entity.getPersistentData().putBoolean("PlainsCheck", true);
					} else {
						if (!(entity.getPersistentData().getBoolean("RiverCheck") == true) && world.getBiome(BlockPos.containing(x, y, z)).is(new ResourceLocation("river"))) {
							entity.getPersistentData().putBoolean("RiverCheck", true);
						} else {
							if (!(entity.getPersistentData().getBoolean("SavannaCheck") == true) && world.getBiome(BlockPos.containing(x, y, z)).is(new ResourceLocation("savanna"))) {
								entity.getPersistentData().putBoolean("SavannaCheck", true);
							}
						}
					}
				}
			}
		}
	}
}
