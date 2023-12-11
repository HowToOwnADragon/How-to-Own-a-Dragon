package net.mcreator.howtoownadragon.procedures;

import net.minecraft.world.entity.Entity;

public class ATOldGrowthSpruceTaigaReturnProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		if (!(entity.getPersistentData().getBoolean("OldGrowthSpruceTaigaCheck") == true)) {
			return true;
		}
		return false;
	}
}
