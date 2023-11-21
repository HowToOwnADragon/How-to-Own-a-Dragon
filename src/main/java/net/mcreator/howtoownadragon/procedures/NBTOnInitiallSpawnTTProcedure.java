package net.mcreator.howtoownadragon.procedures;

import net.minecraft.world.entity.Entity;

public class NBTOnInitiallSpawnTTProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		entity.getPersistentData().putBoolean("ttfeedcooldown", false);
		entity.getPersistentData().putBoolean("ttinlove", false);
		entity.getPersistentData().putString("ttfoodcooldown", "false");
	}
}
