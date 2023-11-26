package net.mcreator.howtoownadragon.procedures;

import net.minecraft.world.entity.Entity;

public class YakOnInitialEntitySpawnProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		entity.getPersistentData().putBoolean("yakinlove", false);
	}
}
