package net.mcreator.howtoownadragon.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

public class WildDayAIProcedure {
	public static boolean execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return false;
		if (!(entity instanceof TamableAnimal _tamEnt ? _tamEnt.isTame() : false)) {
			if (world instanceof Level _lvl1 && _lvl1.isDay()) {
				return true;
			}
		}
		return false;
	}
}
