package net.mcreator.howtoownadragon.procedures;

import net.minecraft.world.entity.Entity;

public class WarpedForestReturnProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		if (!(entity.getPersistentData().getBoolean("WarpedForestCheck") == true)) {
			return true;
		}
		return false;
	}
}
