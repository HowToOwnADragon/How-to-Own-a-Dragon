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
public class ATFifthPageCheckProcedure {
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
		if (!(entity.getPersistentData().getBoolean("LukewarmOceanCheck") == true) && world.getBiome(BlockPos.containing(x, y, z)).is(new ResourceLocation("lukewarm_ocean"))) {
			entity.getPersistentData().putBoolean("LukewarmOceanCheck", true);
		} else {
			if (!(entity.getPersistentData().getBoolean("LushCavesCheck") == true) && world.getBiome(BlockPos.containing(x, y, z)).is(new ResourceLocation("lush_caves"))) {
				entity.getPersistentData().putBoolean("LushCavesCheck", true);
			} else {
				if (!(entity.getPersistentData().getBoolean("MangroveSwampCheck") == true) && world.getBiome(BlockPos.containing(x, y, z)).is(new ResourceLocation("mangrove_swamp"))) {
					entity.getPersistentData().putBoolean("MangroveSwampCheck", true);
				} else {
					if (!(entity.getPersistentData().getBoolean("MeadowCheck") == true) && world.getBiome(BlockPos.containing(x, y, z)).is(new ResourceLocation("meadow"))) {
						entity.getPersistentData().putBoolean("MeadowCheck", true);
					} else {
						if (!(entity.getPersistentData().getBoolean("MushroomFieldsCheck") == true) && world.getBiome(BlockPos.containing(x, y, z)).is(new ResourceLocation("mushroom_fields"))) {
							entity.getPersistentData().putBoolean("MushroomFieldsCheck", true);
						} else {
							if (!(entity.getPersistentData().getBoolean("OceanCheck") == true) && world.getBiome(BlockPos.containing(x, y, z)).is(new ResourceLocation("jungle"))) {
								entity.getPersistentData().putBoolean("OceanCheck", true);
							}
						}
					}
				}
			}
		}
	}
}
