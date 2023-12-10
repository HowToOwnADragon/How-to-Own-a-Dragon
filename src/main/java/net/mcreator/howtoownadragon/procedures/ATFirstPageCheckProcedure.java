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
public class ATFirstPageCheckProcedure {
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
		if (!(entity.getPersistentData().getBoolean("BadlandsCheck") == true) && world.getBiome(BlockPos.containing(x, y, z)).is(new ResourceLocation("badlands"))) {
			entity.getPersistentData().putBoolean("BadlandsCheck", true);
		} else {
			if (!(entity.getPersistentData().getBoolean("BambooJungleCheck") == true) && world.getBiome(BlockPos.containing(x, y, z)).is(new ResourceLocation("bamboo_jungle"))) {
				entity.getPersistentData().putBoolean("BambooJungleCheck", true);
			} else {
				if (!(entity.getPersistentData().getBoolean("BeachCheck") == true) && world.getBiome(BlockPos.containing(x, y, z)).is(new ResourceLocation("beach"))) {
					entity.getPersistentData().putBoolean("BeachCheck", true);
				} else {
					if (!(entity.getPersistentData().getBoolean("BirchForestCheck") == true) && world.getBiome(BlockPos.containing(x, y, z)).is(new ResourceLocation("birch_forest"))) {
						entity.getPersistentData().putBoolean("BirchForestCheck", true);
					} else {
						if (!(entity.getPersistentData().getBoolean("ColdOceanCheck") == true) && world.getBiome(BlockPos.containing(x, y, z)).is(new ResourceLocation("cold_ocean"))) {
							entity.getPersistentData().putBoolean("ColdOceanCheck", true);
						}
					}
				}
			}
		}
	}
}
