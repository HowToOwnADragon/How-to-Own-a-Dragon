package net.mcreator.howtoownadragon.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

public class FemaleOnInitialEntitySpawnTTProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		NBTOnInitiallSpawnTTProcedure.execute(entity);
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
			FemaleOnInitialEntitySpawnTTProcedure.execute(world, x, y, z, entity);
		}
	}
}
