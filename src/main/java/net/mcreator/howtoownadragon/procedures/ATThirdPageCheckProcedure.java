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
public class ATThirdPageCheckProcedure {
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
		if (!(entity.getPersistentData().getBoolean("DesertCheck") == true) && world.getBiome(BlockPos.containing(x, y, z)).is(new ResourceLocation("desert"))) {
			entity.getPersistentData().putBoolean("DesertCheck", true);
		} else {
			if (!(entity.getPersistentData().getBoolean("DripstoneCavesCheck") == true) && world.getBiome(BlockPos.containing(x, y, z)).is(new ResourceLocation("dripstone_caves"))) {
				entity.getPersistentData().putBoolean("DripstoneCavesCheck", true);
			} else {
				if (!(entity.getPersistentData().getBoolean("ErodedBadlandsCheck") == true) && world.getBiome(BlockPos.containing(x, y, z)).is(new ResourceLocation("eroded_badlands"))) {
					entity.getPersistentData().putBoolean("ErodedBadlandsCheck", true);
				} else {
					if (!(entity.getPersistentData().getBoolean("FlowerForestCheck") == true) && world.getBiome(BlockPos.containing(x, y, z)).is(new ResourceLocation("flower_forest"))) {
						entity.getPersistentData().putBoolean("FlowerForestCheck", true);
					} else {
						if (!(entity.getPersistentData().getBoolean("ForestCheck") == true) && world.getBiome(BlockPos.containing(x, y, z)).is(new ResourceLocation("forest"))) {
							entity.getPersistentData().putBoolean("ForestCheck", true);
						} else {
							if (!(entity.getPersistentData().getBoolean("FrozenOceanCheck") == true) && world.getBiome(BlockPos.containing(x, y, z)).is(new ResourceLocation("frozen_ocean"))) {
								entity.getPersistentData().putBoolean("FrozenOceanCheck", true);
							}
						}
					}
				}
			}
		}
	}
}
