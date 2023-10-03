package net.mcreator.howtoownadragon.procedures;

import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;

import net.mcreator.howtoownadragon.entity.NadderMaleEntity;

public class MaleOnInitialEntitySpawnNadderProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		NBTDataSpawnNadderProcedure.execute(entity);
		if (Mth.nextInt(RandomSource.create(), 1, 2) == 1) {
			if (entity instanceof NadderMaleEntity animatable)
				animatable.setTexture("rednadder");
			entity.getPersistentData().putString("naddercolor", "red");
		} else if (Mth.nextInt(RandomSource.create(), 1, 2) == 2) {
			if (entity instanceof NadderMaleEntity animatable)
				animatable.setTexture("purplenadder");
			entity.getPersistentData().putString("naddercolor", "purple");
		} else {
			MaleOnInitialEntitySpawnNadderProcedure.execute(entity);
		}
	}
}
