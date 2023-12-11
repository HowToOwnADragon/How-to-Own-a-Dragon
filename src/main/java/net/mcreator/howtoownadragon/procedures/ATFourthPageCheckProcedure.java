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
public class ATFourthPageCheckProcedure {
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
		if (!(entity.getPersistentData().getBoolean("FrozenPeaksCheck") == true) && world.getBiome(BlockPos.containing(x, y, z)).is(new ResourceLocation("frozen_peaks"))) {
			entity.getPersistentData().putBoolean("FrozenPeaksCheck", true);
		} else {
			if (!(entity.getPersistentData().getBoolean("FrozenRiverCheck") == true) && world.getBiome(BlockPos.containing(x, y, z)).is(new ResourceLocation("frozen_river"))) {
				entity.getPersistentData().putBoolean("FrozenRiverCheck", true);
			} else {
				if (!(entity.getPersistentData().getBoolean("GroveCheck") == true) && world.getBiome(BlockPos.containing(x, y, z)).is(new ResourceLocation("grove"))) {
					entity.getPersistentData().putBoolean("GroveCheck", true);
				} else {
					if (!(entity.getPersistentData().getBoolean("IceSpikesCheck") == true) && world.getBiome(BlockPos.containing(x, y, z)).is(new ResourceLocation("ice_spikes"))) {
						entity.getPersistentData().putBoolean("IceSpikesCheck", true);
					} else {
						if (!(entity.getPersistentData().getBoolean("JaggedPeaksCheck") == true) && world.getBiome(BlockPos.containing(x, y, z)).is(new ResourceLocation("jagged_peaks"))) {
							entity.getPersistentData().putBoolean("JaggedPeaksCheck", true);
						} else {
							if (!(entity.getPersistentData().getBoolean("JungleCheck") == true) && world.getBiome(BlockPos.containing(x, y, z)).is(new ResourceLocation("jungle"))) {
								entity.getPersistentData().putBoolean("JungleCheck", true);
							}
						}
					}
				}
			}
		}
	}
}
