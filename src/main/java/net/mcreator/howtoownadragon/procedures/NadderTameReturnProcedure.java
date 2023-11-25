package net.mcreator.howtoownadragon.procedures;

import net.minecraft.world.entity.Entity;

public class NadderTameReturnProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		if (entity.getPersistentData().getBoolean("isnaddertamed") == true) {
			return false;
		}
		return true;
	}
}
