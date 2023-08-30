package net.mcreator.howtoownadragon.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;

import net.mcreator.howtoownadragon.HowToOwnADragonMod;

public class GronckleFeedingCooldown2Procedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if (Mth.nextInt(RandomSource.create(), 1, 4) == 1) {
			HowToOwnADragonMod.queueServerWork(40, () -> {
				entity.getPersistentData().putBoolean("groncklefeedcooldown", false);
			});
		} else if (Mth.nextInt(RandomSource.create(), 1, 4) == 2) {
			HowToOwnADragonMod.queueServerWork(60, () -> {
				entity.getPersistentData().putBoolean("groncklefeedcooldown", false);
			});
		} else if (Mth.nextInt(RandomSource.create(), 1, 4) == 3) {
			HowToOwnADragonMod.queueServerWork(80, () -> {
				entity.getPersistentData().putBoolean("groncklefeedcooldown", false);
			});
		} else if (Mth.nextInt(RandomSource.create(), 1, 4) == 4) {
			HowToOwnADragonMod.queueServerWork(100, () -> {
				entity.getPersistentData().putBoolean("groncklefeedcooldown", false);
			});
		} else {
			GronckleFeedingCooldown2Procedure.execute(world, entity);
		}
	}
}
