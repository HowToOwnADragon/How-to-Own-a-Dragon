package net.mcreator.howtoownadragon.procedures;

import net.minecraft.world.level.LevelAccessor;

import net.mcreator.howtoownadragon.network.HowToOwnADragonModVariables;

public class Incubator1RequirementProcedure {
	public static String execute(LevelAccessor world) {
		return HowToOwnADragonModVariables.WorldVariables.get(world).IncubatorRequirement;
	}
}
