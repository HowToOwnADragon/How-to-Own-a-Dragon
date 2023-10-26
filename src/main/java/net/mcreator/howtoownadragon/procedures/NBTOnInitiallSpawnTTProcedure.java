package net.mcreator.howtoownadragon.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

public class NBTOnInitiallSpawnTTProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		entity.getPersistentData().putBoolean("ttfeedcooldown", false);
		entity.getPersistentData().putString("ttfoodcooldown", "false");
	}
}
