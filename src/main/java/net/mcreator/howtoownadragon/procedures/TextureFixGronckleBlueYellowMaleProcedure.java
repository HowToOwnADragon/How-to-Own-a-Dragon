package net.mcreator.howtoownadragon.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;

import net.mcreator.howtoownadragon.entity.GronckleFemaleEntity;
import net.mcreator.howtoownadragon.HowToOwnADragonMod;

public class TextureFixGronckleBlueYellowMaleProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (!(entity.getPersistentData().getBoolean("groncklesaddle") == true)) {
			if (entity instanceof GronckleFemaleEntity animatable)
				animatable.setTexture("gronckleblueyellow");
			HowToOwnADragonMod.queueServerWork(20, () -> {
				TextureFixGronckleBlueYellowMaleProcedure.execute(world, x, y, z, entity);
			});
		}
	}
}
