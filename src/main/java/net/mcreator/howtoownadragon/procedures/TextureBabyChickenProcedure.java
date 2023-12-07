package net.mcreator.howtoownadragon.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;

import net.mcreator.howtoownadragon.entity.BabyChickenEntity;
import net.mcreator.howtoownadragon.HowToOwnADragonMod;

public class TextureBabyChickenProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		HowToOwnADragonMod.queueServerWork(3, () -> {
			GrowingTickRateChickenProcedure.execute(world, x, y, z, entity);
			if (entity instanceof BabyChickenEntity) {
				if ((entity.getPersistentData().getString("chickencolor")).equals("brown")) {
					if (entity instanceof BabyChickenEntity animatable)
						animatable.setTexture("chickenbrown");
				} else if ((entity.getPersistentData().getString("chickencolor")).equals("lightbrown")) {
					if (entity instanceof BabyChickenEntity animatable)
						animatable.setTexture("chickenlightbrown");
				} else if ((entity.getPersistentData().getString("chickencolor")).equals("white")) {
					if (entity instanceof BabyChickenEntity animatable)
						animatable.setTexture("chickenwhite");
				} else {
					RandomTextureBabyChickenProcedure.execute(world, x, y, z, entity);
				}
			}
		});
	}
}
