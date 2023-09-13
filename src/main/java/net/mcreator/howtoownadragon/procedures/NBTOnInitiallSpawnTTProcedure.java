package net.mcreator.howtoownadragon.procedures;

import net.minecraft.world.entity.Entity;

public class NBTOnInitiallSpawnTTProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		entity.getPersistentData().putBoolean("ttfeedcooldown", false);
	}
}
