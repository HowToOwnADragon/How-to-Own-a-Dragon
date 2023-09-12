package net.mcreator.howtoownadragon.procedures;

import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;

import net.mcreator.howtoownadragon.entity.TTFemaleEntity;

public class FemaleOnInitialEntitySpawnTTProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		entity.getPersistentData().putBoolean("ttfeedcooldown", false);
		if (Mth.nextInt(RandomSource.create(), 1, 3) == 1) {
			if (entity instanceof TTFemaleEntity animatable)
				animatable.setTexture("greentt");
			entity.getPersistentData().putString("ttcolor", "green");
		} else if (Mth.nextInt(RandomSource.create(), 1, 3) == 2) {
			if (entity instanceof TTFemaleEntity animatable)
				animatable.setTexture("pinktt");
			entity.getPersistentData().putString("ttcolor", "pink");
		} else if (Mth.nextInt(RandomSource.create(), 1, 3) == 3) {
			if (entity instanceof TTFemaleEntity animatable)
				animatable.setTexture("turqtt");
			entity.getPersistentData().putString("ttcolor", "turq");
		} else {
			FemaleOnInitialEntitySpawnTTProcedure.execute(entity);
		}
	}
}
