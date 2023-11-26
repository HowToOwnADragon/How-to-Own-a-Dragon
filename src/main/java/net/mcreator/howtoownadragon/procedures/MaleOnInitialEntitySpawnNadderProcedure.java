package net.mcreator.howtoownadragon.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;

import net.mcreator.howtoownadragon.entity.NadderMaleEntity;
import net.mcreator.howtoownadragon.HowToOwnADragonMod;

public class MaleOnInitialEntitySpawnNadderProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		NBTDataSpawnNadderProcedure.execute(entity);
		HowToOwnADragonMod.queueServerWork(1, () -> {
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
		});
	}
}
