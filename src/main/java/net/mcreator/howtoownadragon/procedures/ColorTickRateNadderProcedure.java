package net.mcreator.howtoownadragon.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;

import net.mcreator.howtoownadragon.entity.BabyTTMaleEntity;
import net.mcreator.howtoownadragon.entity.BabyTTFemaleEntity;
import net.mcreator.howtoownadragon.entity.BabyNadderMaleEntity;
import net.mcreator.howtoownadragon.entity.BabyNadderFemaleEntity;
import net.mcreator.howtoownadragon.HowToOwnADragonMod;

public class ColorTickRateNadderProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		HowToOwnADragonMod.queueServerWork(2, () -> {
			if (entity instanceof BabyNadderMaleEntity) {
				if ((entity.getPersistentData().getString("naddercolor")).equals("stormfly")) {
					if (entity instanceof BabyTTMaleEntity animatable)
						animatable.setTexture("stormfly");
					GrowingTickRateNadderProcedure.execute(world, x, y, z, entity);
				} else if ((entity.getPersistentData().getString("naddercolor")).equals("red")) {
					if (entity instanceof BabyTTMaleEntity animatable)
						animatable.setTexture("rednadder");
					GrowingTickRateNadderProcedure.execute(world, x, y, z, entity);
				} else if ((entity.getPersistentData().getString("naddercolor")).equals("purple")) {
					if (entity instanceof BabyTTMaleEntity animatable)
						animatable.setTexture("purplenadder");
					GrowingTickRateNadderProcedure.execute(world, x, y, z, entity);
				}
			} else if (entity instanceof BabyNadderFemaleEntity) {
				if ((entity.getPersistentData().getString("naddercolor")).equals("stormfly")) {
					if (entity instanceof BabyTTFemaleEntity animatable)
						animatable.setTexture("stormfly");
					GrowingTickRateNadderProcedure.execute(world, x, y, z, entity);
				} else if ((entity.getPersistentData().getString("naddercolor")).equals("red")) {
					if (entity instanceof BabyTTFemaleEntity animatable)
						animatable.setTexture("rednadder");
					GrowingTickRateNadderProcedure.execute(world, x, y, z, entity);
				} else if ((entity.getPersistentData().getString("naddercolor")).equals("purple")) {
					if (entity instanceof BabyTTFemaleEntity animatable)
						animatable.setTexture("purplenadder");
					GrowingTickRateNadderProcedure.execute(world, x, y, z, entity);
				}
			} else {
				GrowingTickRateNadderProcedure.execute(world, x, y, z, entity);
			}
		});
	}
}
