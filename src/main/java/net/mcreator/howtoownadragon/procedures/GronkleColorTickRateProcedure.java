package net.mcreator.howtoownadragon.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;

import net.mcreator.howtoownadragon.entity.BabyGronckleMaleEntity;
import net.mcreator.howtoownadragon.entity.BabyGronckleFemaleEntity;

public class GronkleColorTickRateProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		entity.getPersistentData().putBoolean("groncklesaddle", false);
		entity.getPersistentData().putBoolean("groncklefeedcooldown", false);
		if (entity instanceof BabyGronckleMaleEntity) {
			if ((entity.getPersistentData().getString("groncklecolor")).equals("pink")) {
				GronckleGrowingTickRateProcedure.execute(world, x, y, z, entity);
			} else if ((entity.getPersistentData().getString("groncklecolor")).equals("meatlug")) {
				if (entity instanceof BabyGronckleMaleEntity animatable)
					animatable.setTexture("babymeatlug");
				GronckleGrowingTickRateProcedure.execute(world, x, y, z, entity);
			} else if ((entity.getPersistentData().getString("groncklecolor")).equals("orangered")) {
				if (entity instanceof BabyGronckleMaleEntity animatable)
					animatable.setTexture("babygronckleorange");
				GronckleGrowingTickRateProcedure.execute(world, x, y, z, entity);
			} else if ((entity.getPersistentData().getString("groncklecolor")).equals("blueyellow")) {
				if (entity instanceof BabyGronckleMaleEntity animatable)
					animatable.setTexture("babygroncleblue");
				GronckleGrowingTickRateProcedure.execute(world, x, y, z, entity);
			}
		} else if (entity instanceof BabyGronckleFemaleEntity) {
			if ((entity.getPersistentData().getString("groncklecolor")).equals("pink")) {
				GronckleGrowingTickRateProcedure.execute(world, x, y, z, entity);
			} else if ((entity.getPersistentData().getString("groncklecolor")).equals("meatlug")) {
				if (entity instanceof BabyGronckleFemaleEntity animatable)
					animatable.setTexture("babymeatlug");
				GronckleGrowingTickRateProcedure.execute(world, x, y, z, entity);
			} else if ((entity.getPersistentData().getString("groncklecolor")).equals("orangered")) {
				if (entity instanceof BabyGronckleFemaleEntity animatable)
					animatable.setTexture("babygronckleorange");
				GronckleGrowingTickRateProcedure.execute(world, x, y, z, entity);
			} else if ((entity.getPersistentData().getString("groncklecolor")).equals("blueyellow")) {
				if (entity instanceof BabyGronckleFemaleEntity animatable)
					animatable.setTexture("babygroncleblue");
				GronckleGrowingTickRateProcedure.execute(world, x, y, z, entity);
			}
		}
	}
}
