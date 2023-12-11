package net.mcreator.howtoownadragon.procedures;

import net.minecraft.world.entity.Entity;

public class ATLukewarmOceanReturnProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		if (!(entity.getPersistentData().getBoolean("LukewarmOceanCheck") == true)) {
			return true;
		}
		return false;
	}
}
