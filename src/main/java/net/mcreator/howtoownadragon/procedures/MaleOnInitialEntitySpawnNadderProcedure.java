package net.mcreator.howtoownadragon.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.howtoownadragon.entity.NadderMaleEntity;

public class MaleOnInitialEntitySpawnNadderProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		NBTDataSpawnNadderProcedure.execute(entity);
		if ((entity.getPersistentData().getString("naddercolor")).equals("red")) {
			if (entity instanceof NadderMaleEntity animatable)
				animatable.setTexture("rednadder");
		} else if ((entity.getPersistentData().getString("naddercolor")).equals("purple")) {
			if (entity instanceof NadderMaleEntity animatable)
				animatable.setTexture("purplenadder");
		} else if ((entity.getPersistentData().getString("naddercolor")).equals("stormfly")) {
			if (entity instanceof NadderMaleEntity animatable)
				animatable.setTexture("stormfly");
		} else {
			RandomColorMaleNadderProcedure.execute(entity);
		}
	}
}
