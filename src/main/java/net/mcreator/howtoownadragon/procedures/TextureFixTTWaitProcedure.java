package net.mcreator.howtoownadragon.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;

import net.mcreator.howtoownadragon.HowToOwnADragonMod;

public class TextureFixTTWaitProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		HowToOwnADragonMod.queueServerWork(200, () -> {
			entity.getPersistentData().putBoolean("loadedtt", false);
			RenderDistanceFixTTProcedure.execute(world, x, y, z, entity);
		});
	}
}
