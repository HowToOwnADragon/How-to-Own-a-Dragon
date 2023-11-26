package net.mcreator.howtoownadragon.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;

import net.mcreator.howtoownadragon.entity.ChickenEntity;

public class OnInitialEntitySpawnChickenProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if (Mth.nextInt(RandomSource.create(), 1, 3) == 1) {
			if (entity instanceof ChickenEntity animatable)
				animatable.setTexture("chickenbrown");
			entity.getPersistentData().putString("chickencolor", "brown");
		} else if (Mth.nextInt(RandomSource.create(), 1, 3) == 2) {
			if (entity instanceof ChickenEntity animatable)
				animatable.setTexture("chickenlightbrown");
			entity.getPersistentData().putString("chickencolor", "lightbrown");
		} else if (Mth.nextInt(RandomSource.create(), 1, 3) == 3) {
			if (entity instanceof ChickenEntity animatable)
				animatable.setTexture("chickenwhite");
			entity.getPersistentData().putString("chickencolor", "white");
		} else {
			OnInitialEntitySpawnChickenProcedure.execute(world, entity);
		}
	}
}
