package net.mcreator.howtoownadragon.procedures;

import net.minecraft.world.entity.Entity;

public class GronckleOnInitialEntitySpawnProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		entity.getPersistentData().putDouble("GronckleAttack", 0);
	}
}
