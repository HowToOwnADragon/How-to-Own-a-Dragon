package net.mcreator.howtoownadragon.procedures;

import net.minecraft.world.entity.Entity;

public class ATPlainsReturnProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		if (!(entity.getPersistentData().getBoolean("PlainsCheck") == true)) {
			return true;
		}
		return false;
	}
}
