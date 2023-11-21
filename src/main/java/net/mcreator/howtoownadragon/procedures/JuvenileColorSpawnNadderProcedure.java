package net.mcreator.howtoownadragon.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;

import net.mcreator.howtoownadragon.entity.JuvenileNadderMaleEntity;
import net.mcreator.howtoownadragon.entity.JuvenileNadderFemaleEntity;
import net.mcreator.howtoownadragon.HowToOwnADragonMod;

public class JuvenileColorSpawnNadderProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		HowToOwnADragonMod.queueServerWork(2, () -> {
			if (entity instanceof JuvenileNadderMaleEntity) {
				if ((entity.getPersistentData().getString("naddercolor")).equals("red")) {
					if (entity instanceof JuvenileNadderMaleEntity animatable)
						animatable.setTexture("rednadder");
					TameNonGrownNadderProcedure.execute(world, x, y, z, entity);
				} else if ((entity.getPersistentData().getString("naddercolor")).equals("purple")) {
					if (entity instanceof JuvenileNadderMaleEntity animatable)
						animatable.setTexture("purplenadder");
					TameNonGrownNadderProcedure.execute(world, x, y, z, entity);
				} else if ((entity.getPersistentData().getString("naddercolor")).equals("stormfly")) {
					if (entity instanceof JuvenileNadderMaleEntity animatable)
						animatable.setTexture("stormfly");
					TameNonGrownNadderProcedure.execute(world, x, y, z, entity);
				}
			} else if (entity instanceof JuvenileNadderFemaleEntity) {
				if ((entity.getPersistentData().getString("naddercolor")).equals("red")) {
					if (entity instanceof JuvenileNadderFemaleEntity animatable)
						animatable.setTexture("rednadder");
					TameNonGrownNadderProcedure.execute(world, x, y, z, entity);
				} else if ((entity.getPersistentData().getString("naddercolor")).equals("purple")) {
					if (entity instanceof JuvenileNadderFemaleEntity animatable)
						animatable.setTexture("purplenadder");
					TameNonGrownNadderProcedure.execute(world, x, y, z, entity);
				} else if ((entity.getPersistentData().getString("naddercolor")).equals("stormfly")) {
					if (entity instanceof JuvenileNadderFemaleEntity animatable)
						animatable.setTexture("stormfly");
					TameNonGrownNadderProcedure.execute(world, x, y, z, entity);
				}
			}
		});
	}
}
