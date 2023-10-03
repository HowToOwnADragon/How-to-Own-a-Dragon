package net.mcreator.howtoownadragon.procedures;

import net.minecraft.world.entity.Entity;

public class NBTDataSpawnNadderProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		entity.getPersistentData().putBoolean("nadderfeedcooldown", false);
		entity.getPersistentData().putBoolean("naddersaddle", false);
	}
}
