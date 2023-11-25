package net.mcreator.howtoownadragon.procedures;

import net.minecraft.world.entity.Entity;

public class TTBreedReturnProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		if (entity.getPersistentData().getBoolean("isttbreed") == true) {
			return false;
		}
		return true;
	}
}
