package net.mcreator.howtoownadragon.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;

import net.mcreator.howtoownadragon.entity.ChickenEntity;
import net.mcreator.howtoownadragon.HowToOwnADragonMod;

public class TextureChickenProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		HowToOwnADragonMod.queueServerWork(1, () -> {
			entity.getPersistentData().putBoolean("chickeninlove", false);
			if ((entity.getPersistentData().getString("chickencolor")).equals("brown")) {
				if (entity instanceof ChickenEntity animatable)
					animatable.setTexture("chickenbrown");
			} else if ((entity.getPersistentData().getString("chickencolor")).equals("lightbrown")) {
				if (entity instanceof ChickenEntity animatable)
					animatable.setTexture("chickenlightbrown");
			} else if ((entity.getPersistentData().getString("chickencolor")).equals("white")) {
				if (entity instanceof ChickenEntity animatable)
					animatable.setTexture("chickenwhite");
			} else {
				OnInitialEntitySpawnChickenProcedure.execute(world, entity);
			}
		});
	}
}
