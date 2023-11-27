package net.mcreator.howtoownadragon.procedures;

import net.minecraft.world.entity.Entity;

public class NetherWastesReturnProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		if (!(entity.getPersistentData().getBoolean("NetherWastesCheck") == true)) {
			return true;
		}
		return false;
	}
}
