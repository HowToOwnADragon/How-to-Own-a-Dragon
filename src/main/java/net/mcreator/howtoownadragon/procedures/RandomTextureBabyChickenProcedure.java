package net.mcreator.howtoownadragon.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;

import net.mcreator.howtoownadragon.entity.BabyChickenEntity;

public class RandomTextureBabyChickenProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (Mth.nextInt(RandomSource.create(), 1, 3) == 1) {
			entity.getPersistentData().putString("chickencolor", "brown");
			if (entity instanceof BabyChickenEntity animatable)
				animatable.setTexture("chickenbrown");
		} else if (Mth.nextInt(RandomSource.create(), 1, 3) == 2) {
			entity.getPersistentData().putString("chickencolor", "lightbrown");
			if (entity instanceof BabyChickenEntity animatable)
				animatable.setTexture("chickenlightbrown");
		} else if (Mth.nextInt(RandomSource.create(), 1, 3) == 3) {
			entity.getPersistentData().putString("chickencolor", "white");
			if (entity instanceof BabyChickenEntity animatable)
				animatable.setTexture("chickenwhite");
		} else {
			RandomTextureBabyChickenProcedure.execute(world, x, y, z, entity);
		}
	}
}
