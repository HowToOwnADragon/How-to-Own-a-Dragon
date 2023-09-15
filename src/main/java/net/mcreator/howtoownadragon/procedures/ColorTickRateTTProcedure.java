package net.mcreator.howtoownadragon.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;

import net.mcreator.howtoownadragon.entity.BabyTTMaleEntity;
import net.mcreator.howtoownadragon.entity.BabyTTFemaleEntity;
import net.mcreator.howtoownadragon.entity.BabyGronckleMaleEntity;
import net.mcreator.howtoownadragon.entity.BabyGronckleFemaleEntity;

public class ColorTickRateTTProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof BabyTTMaleEntity) {
			if ((entity.getPersistentData().getString("ttcolor")).equals("pink")) {
				if (entity instanceof BabyGronckleMaleEntity animatable)
					animatable.setTexture("pinktt");
				GrowingTickRateTTProcedure.execute(world, x, y, z, entity);
			} else if ((entity.getPersistentData().getString("ttcolor")).equals("green")) {
				if (entity instanceof BabyGronckleMaleEntity animatable)
					animatable.setTexture("greentt");
				GrowingTickRateTTProcedure.execute(world, x, y, z, entity);
			} else if ((entity.getPersistentData().getString("ttcolor")).equals("turq")) {
				if (entity instanceof BabyGronckleMaleEntity animatable)
					animatable.setTexture("turqtt");
				GrowingTickRateTTProcedure.execute(world, x, y, z, entity);
			}
		} else if (entity instanceof BabyTTFemaleEntity) {
			if ((entity.getPersistentData().getString("ttcolor")).equals("pink")) {
				if (entity instanceof BabyGronckleFemaleEntity animatable)
					animatable.setTexture("pinktt");
				GrowingTickRateTTProcedure.execute(world, x, y, z, entity);
			} else if ((entity.getPersistentData().getString("ttcolor")).equals("green")) {
				if (entity instanceof BabyGronckleFemaleEntity animatable)
					animatable.setTexture("greentt");
				GrowingTickRateTTProcedure.execute(world, x, y, z, entity);
			} else if ((entity.getPersistentData().getString("ttcolor")).equals("turq")) {
				if (entity instanceof BabyGronckleFemaleEntity animatable)
					animatable.setTexture("turqtt");
				GrowingTickRateTTProcedure.execute(world, x, y, z, entity);
			}
		}
	}
}
