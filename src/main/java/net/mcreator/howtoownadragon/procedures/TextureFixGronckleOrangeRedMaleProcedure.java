package net.mcreator.howtoownadragon.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;

import net.mcreator.howtoownadragon.entity.GronckleMaleEntity;
import net.mcreator.howtoownadragon.HowToOwnADragonMod;

public class TextureFixGronckleOrangeRedMaleProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if (!(entity.getPersistentData().getBoolean("Saddle") == true)) {
			if (entity instanceof GronckleMaleEntity animatable)
				animatable.setTexture("gronckleorangered");
			HowToOwnADragonMod.queueServerWork(20, () -> {
				TextureFixGronckleOrangeRedMaleProcedure.execute(world, entity);
			});
		}
	}
}
