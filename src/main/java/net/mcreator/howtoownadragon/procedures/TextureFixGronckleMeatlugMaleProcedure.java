package net.mcreator.howtoownadragon.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;

import net.mcreator.howtoownadragon.entity.GronckleMaleEntity;
import net.mcreator.howtoownadragon.HowToOwnADragonMod;

public class TextureFixGronckleMeatlugMaleProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if (!(entity.getPersistentData().getBoolean("Saddle") == true)) {
			if (entity instanceof GronckleMaleEntity animatable)
				animatable.setTexture("meatlug");
			HowToOwnADragonMod.queueServerWork(20, () -> {
				TextureFixGronckleMeatlugMaleProcedure.execute(world, entity);
			});
		}
	}
}
