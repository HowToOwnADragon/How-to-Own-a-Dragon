package net.mcreator.howtoownadragon.procedures;

import net.minecraft.world.entity.Entity;

public class NBTDataSpawnGronckleProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		entity.getPersistentData().putBoolean("groncklefeedcooldown", false);
		entity.getPersistentData().putBoolean("gronckleattackcooldown", false);
		entity.getPersistentData().putBoolean("groncklebreedingcooldown", false);
		entity.getPersistentData().putBoolean("gronckleironcooldown", false);
	}
}
