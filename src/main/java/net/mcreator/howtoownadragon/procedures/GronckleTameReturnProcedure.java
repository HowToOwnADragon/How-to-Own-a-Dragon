package net.mcreator.howtoownadragon.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

public class GronckleTameReturnProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		if (entity.getPersistentData().getBoolean("isgronckletamed") == true) {
			return false;
		}
		return true;
	}
}
