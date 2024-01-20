package net.mcreator.howtoownadragon.procedures;

import net.minecraft.world.entity.Entity;

public class DragonSizeFactorProcedure {
	public static double execute(Entity entity) {
		if (entity == null)
			return 0;
		if (entity.getPersistentData().getDouble("Age") >= 0 && entity.getPersistentData().getDouble("Age") <= 640) {
			return entity.getPersistentData().getDouble("Age") / 800 + 0.2;
		}
		return 1;
	}
}
