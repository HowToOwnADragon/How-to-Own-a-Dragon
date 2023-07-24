package net.mcreator.howtoownadragon.procedures;

import net.minecraft.world.level.LevelAccessor;

import net.mcreator.howtoownadragon.network.HowToOwnADragonModVariables;

public class TimerShowProcedure {
	public static String execute(LevelAccessor world) {
		return new java.text.DecimalFormat("##").format(HowToOwnADragonModVariables.MapVariables.get(world).TimerLeft) + "";
	}
}
