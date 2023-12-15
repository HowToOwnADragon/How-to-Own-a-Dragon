package net.mcreator.howtoownadragon.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.howtoownadragon.entity.GronckleFemaleEntity;

public class SetGronckleFemaleTexturePinkProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof GronckleFemaleEntity animatable)
			animatable.setTexture("groncklepink");
	}
}
