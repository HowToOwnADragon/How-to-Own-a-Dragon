package net.mcreator.howtoownadragon.procedures;

import net.minecraft.world.entity.Entity;

public class DragonSizeFactorProcedure {
	public static double execute(Entity entity) {
		if (entity == null)
			return 0;
		if (entity.getPersistentData().getDouble("Age") >= 0) {
			return entity.getPersistentData().getDouble("Age") / 6000;
		}
		return 1;
	}
}
