package net.mcreator.howtoownadragon.procedures;

import net.minecraft.world.level.LevelAccessor;

import net.mcreator.howtoownadragon.network.HowToOwnADragonModVariables;

public class IncubatorRequirementProcedure {
	public static String execute(LevelAccessor world) {
		return HowToOwnADragonModVariables.WorldVariables.get(world).IncubatorRequirement;
	}
}
