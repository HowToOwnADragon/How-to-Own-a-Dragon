package net.mcreator.howtoownadragon.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;

import net.mcreator.howtoownadragon.entity.AdolescentGronckleMaleEntity;
import net.mcreator.howtoownadragon.entity.AdolescentGronckleFemaleEntity;
import net.mcreator.howtoownadragon.HowToOwnADragonMod;

public class AdolescentColorSpawnGronckleProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		HowToOwnADragonMod.queueServerWork(2, () -> {
			if (entity instanceof AdolescentGronckleMaleEntity) {
				if ((entity.getPersistentData().getString("groncklecolor")).equals("pink")) {
					if (entity instanceof AdolescentGronckleMaleEntity animatable)
						animatable.setTexture("adogroncklepink");
					TameNonGrownGronckleProcedure.execute(world, x, y, z, entity);
				} else if ((entity.getPersistentData().getString("groncklecolor")).equals("meatlug")) {
					if (entity instanceof AdolescentGronckleMaleEntity animatable)
						animatable.setTexture("adomeatlug");
					TameNonGrownGronckleProcedure.execute(world, x, y, z, entity);
				} else if ((entity.getPersistentData().getString("groncklecolor")).equals("orangered")) {
					if (entity instanceof AdolescentGronckleMaleEntity animatable)
						animatable.setTexture("adogronckleorangered");
					TameNonGrownGronckleProcedure.execute(world, x, y, z, entity);
				} else if ((entity.getPersistentData().getString("groncklecolor")).equals("blueyellow")) {
					if (entity instanceof AdolescentGronckleMaleEntity animatable)
						animatable.setTexture("adogronckleblueyellow");
					TameNonGrownGronckleProcedure.execute(world, x, y, z, entity);
				}
			} else if (entity instanceof AdolescentGronckleFemaleEntity) {
				if ((entity.getPersistentData().getString("groncklecolor")).equals("pink")) {
					if (entity instanceof AdolescentGronckleFemaleEntity animatable)
						animatable.setTexture("adogroncklepink");
					TameNonGrownGronckleProcedure.execute(world, x, y, z, entity);
				} else if ((entity.getPersistentData().getString("groncklecolor")).equals("meatlug")) {
					if (entity instanceof AdolescentGronckleFemaleEntity animatable)
						animatable.setTexture("adomeatlug");
					TameNonGrownGronckleProcedure.execute(world, x, y, z, entity);
				} else if ((entity.getPersistentData().getString("groncklecolor")).equals("orangered")) {
					if (entity instanceof AdolescentGronckleFemaleEntity animatable)
						animatable.setTexture("adogronckleorangered");
					TameNonGrownGronckleProcedure.execute(world, x, y, z, entity);
				} else if ((entity.getPersistentData().getString("groncklecolor")).equals("blueyellow")) {
					if (entity instanceof AdolescentGronckleFemaleEntity animatable)
						animatable.setTexture("adogronckleblueyellow");
					TameNonGrownGronckleProcedure.execute(world, x, y, z, entity);
				}
			}
		});
	}
}
