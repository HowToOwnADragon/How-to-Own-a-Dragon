package net.mcreator.howtoownadragon.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;

import net.mcreator.howtoownadragon.HowToOwnADragonMod;

public class TextureFixNadderWaitProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		HowToOwnADragonMod.queueServerWork(200, () -> {
			entity.getPersistentData().putBoolean("loadednadder", false);
			TextureRenderDistanceFixNadderProcedure.execute(world, entity);
		});
	}
}
