package net.mcreator.howtoownadragon.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;

import net.mcreator.howtoownadragon.HowToOwnADragonMod;

public class RandomColorFemaleGronckleProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		entity.getPersistentData().putBoolean("loadedgronckle", false);
		if (Mth.nextInt(RandomSource.create(), 1, 3) == 1) {
			entity.getPersistentData().putString("groncklecolor", "pink");
			HowToOwnADragonMod.queueServerWork(3, () -> {
				TextureRenderDistanceFixGronckleProcedure.execute(world, x, y, z, entity);
			});
		} else if (Mth.nextInt(RandomSource.create(), 1, 3) == 2) {
			entity.getPersistentData().putString("groncklecolor", "orangered");
			HowToOwnADragonMod.queueServerWork(3, () -> {
				TextureRenderDistanceFixGronckleProcedure.execute(world, x, y, z, entity);
			});
		} else if (Mth.nextInt(RandomSource.create(), 1, 3) == 3) {
			entity.getPersistentData().putString("groncklecolor", "blueyellow");
			HowToOwnADragonMod.queueServerWork(3, () -> {
				TextureRenderDistanceFixGronckleProcedure.execute(world, x, y, z, entity);
			});
		} else {
			RandomColorFemaleGronckleProcedure.execute(world, x, y, z, entity);
		}
	}
}
