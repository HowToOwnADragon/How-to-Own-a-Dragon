package net.mcreator.howtoownadragon.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;

import net.mcreator.howtoownadragon.entity.BabyNadderMaleEntity;
import net.mcreator.howtoownadragon.entity.BabyNadderFemaleEntity;
import net.mcreator.howtoownadragon.HowToOwnADragonMod;

public class BabyColorSpawnNadderProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		HowToOwnADragonMod.queueServerWork(2, () -> {
			if (entity instanceof BabyNadderMaleEntity) {
				if ((entity.getPersistentData().getString("naddercolor")).equals("red")) {
					if (entity instanceof BabyNadderMaleEntity animatable)
						animatable.setTexture("rednadder");
					TameNonGrownNadderProcedure.execute(world, x, y, z, entity);
				} else if ((entity.getPersistentData().getString("naddercolor")).equals("purple")) {
					if (entity instanceof BabyNadderMaleEntity animatable)
						animatable.setTexture("purplenadder");
					TameNonGrownNadderProcedure.execute(world, x, y, z, entity);
				} else if ((entity.getPersistentData().getString("naddercolor")).equals("stormfly")) {
					if (entity instanceof BabyNadderMaleEntity animatable)
						animatable.setTexture("stormfly");
					TameNonGrownNadderProcedure.execute(world, x, y, z, entity);
				}
			} else if (entity instanceof BabyNadderFemaleEntity) {
				if ((entity.getPersistentData().getString("naddercolor")).equals("red")) {
					if (entity instanceof BabyNadderFemaleEntity animatable)
						animatable.setTexture("rednadder");
					TameNonGrownNadderProcedure.execute(world, x, y, z, entity);
				} else if ((entity.getPersistentData().getString("naddercolor")).equals("purple")) {
					if (entity instanceof BabyNadderFemaleEntity animatable)
						animatable.setTexture("purplenadder");
					TameNonGrownNadderProcedure.execute(world, x, y, z, entity);
				} else if ((entity.getPersistentData().getString("naddercolor")).equals("stormfly")) {
					if (entity instanceof BabyNadderFemaleEntity animatable)
						animatable.setTexture("stormfly");
					TameNonGrownNadderProcedure.execute(world, x, y, z, entity);
				}
			}
		});
	}
}
