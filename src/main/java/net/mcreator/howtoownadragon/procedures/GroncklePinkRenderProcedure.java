package net.mcreator.howtoownadragon.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.Entity;

import net.mcreator.howtoownadragon.init.HowToOwnADragonModEntities;
import net.mcreator.howtoownadragon.entity.GroncklePinkMaleEntity;

public class GroncklePinkRenderProcedure {
	public static Entity execute(LevelAccessor world) {
		return world instanceof Level _level ? new GroncklePinkMaleEntity(HowToOwnADragonModEntities.GRONCKLE_PINK_MALE.get(), _level) : null;
	}
}
