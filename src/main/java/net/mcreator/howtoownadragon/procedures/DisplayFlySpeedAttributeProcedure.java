package net.mcreator.howtoownadragon.procedures;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;

public class DisplayFlySpeedAttributeProcedure {
	public static String execute(Entity entity) {
		if (entity == null)
			return "";
		return "" + (entity instanceof Player _plr ? _plr.getAbilities().getFlyingSpeed() : 0);
	}
}
