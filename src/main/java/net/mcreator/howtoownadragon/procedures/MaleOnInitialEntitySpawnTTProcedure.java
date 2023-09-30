package net.mcreator.howtoownadragon.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;

import net.mcreator.howtoownadragon.entity.TTMaleEntity;

public class MaleOnInitialEntitySpawnTTProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		NBTOnInitiallSpawnTTProcedure.execute(entity);
		if (Mth.nextInt(RandomSource.create(), 1, 3) == 1) {
			if (entity instanceof TTMaleEntity animatable)
				animatable.setTexture("greentt");
			entity.getPersistentData().putString("ttcolor", "green");
		} else if (Mth.nextInt(RandomSource.create(), 1, 3) == 2) {
			if (entity instanceof TTMaleEntity animatable)
				animatable.setTexture("pinktt");
			entity.getPersistentData().putString("ttcolor", "pink");
		} else if (Mth.nextInt(RandomSource.create(), 1, 3) == 3) {
			if (entity instanceof TTMaleEntity animatable)
				animatable.setTexture("turqtt");
			entity.getPersistentData().putString("ttcolor", "turq");
		} else {
			MaleOnInitialEntitySpawnTTProcedure.execute(world, x, y, z, entity);
		}
	}
}