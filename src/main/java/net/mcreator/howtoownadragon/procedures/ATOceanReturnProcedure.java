package net.mcreator.howtoownadragon.procedures;

import net.minecraft.world.entity.Entity;

public class ATOceanReturnProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		if (!(entity.getPersistentData().getBoolean("OceanCheck") == true)) {
			return true;
		}
		return false;
	}
}
