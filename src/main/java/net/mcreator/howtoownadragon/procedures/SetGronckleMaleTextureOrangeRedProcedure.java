package net.mcreator.howtoownadragon.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.howtoownadragon.entity.GronckleMaleEntity;

public class SetGronckleMaleTextureOrangeRedProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof GronckleMaleEntity animatable)
			animatable.setTexture("gronckleorangered");
	}
}
