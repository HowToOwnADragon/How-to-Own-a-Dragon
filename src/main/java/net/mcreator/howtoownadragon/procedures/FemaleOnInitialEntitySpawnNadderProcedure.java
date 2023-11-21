package net.mcreator.howtoownadragon.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.howtoownadragon.entity.NadderFemaleEntity;

public class FemaleOnInitialEntitySpawnNadderProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		NBTDataSpawnNadderProcedure.execute(entity);
		if ((entity.getPersistentData().getString("naddercolor")).equals("red")) {
			if (entity instanceof NadderFemaleEntity animatable)
				animatable.setTexture("rednadder");
		} else if ((entity.getPersistentData().getString("naddercolor")).equals("purple")) {
			if (entity instanceof NadderFemaleEntity animatable)
				animatable.setTexture("purplenadder");
		} else if ((entity.getPersistentData().getString("naddercolor")).equals("stormfly")) {
			if (entity instanceof NadderFemaleEntity animatable)
				animatable.setTexture("stormfly");
		} else {
			RandomColorFemaleNadderProcedure.execute(entity);
		}
	}
}
