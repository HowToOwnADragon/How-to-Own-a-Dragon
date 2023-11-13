package net.mcreator.howtoownadragon.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.howtoownadragon.entity.ChickenEntity;

public class TextureChickenProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
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
			OnInitialEntitySpawnChickenProcedure.execute(entity);
		}
	}
}
