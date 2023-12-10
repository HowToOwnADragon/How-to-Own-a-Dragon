package net.mcreator.howtoownadragon.procedures;

import net.minecraft.world.entity.Entity;

public class ATErodedBadlandsReturnProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		if (!(entity.getPersistentData().getBoolean("ErodedBadlandsCheck") == true)) {
			return true;
		}
		return false;
	}
}
