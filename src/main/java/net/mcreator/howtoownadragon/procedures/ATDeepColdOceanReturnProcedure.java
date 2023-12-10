package net.mcreator.howtoownadragon.procedures;

import net.minecraft.world.entity.Entity;

public class ATDeepColdOceanReturnProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		if (!(entity.getPersistentData().getBoolean("DeepColdOceanCheck") == true)) {
			return true;
		}
		return false;
	}
}
