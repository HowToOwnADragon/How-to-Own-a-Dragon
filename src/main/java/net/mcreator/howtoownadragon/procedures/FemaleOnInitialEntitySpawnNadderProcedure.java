package net.mcreator.howtoownadragon.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;

import net.mcreator.howtoownadragon.entity.NadderFemaleEntity;
import net.mcreator.howtoownadragon.HowToOwnADragonMod;

public class FemaleOnInitialEntitySpawnNadderProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		NBTDataSpawnNadderProcedure.execute(entity);
		HowToOwnADragonMod.queueServerWork(1, () -> {
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
		});
	}
}
