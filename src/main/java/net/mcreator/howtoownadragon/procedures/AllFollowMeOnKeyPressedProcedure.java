package net.mcreator.howtoownadragon.procedures;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.Component;

public class AllFollowMeOnKeyPressedProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity.getPersistentData().getBoolean("FollowAll")) {
			entity.getPersistentData().putBoolean("FollowAll", false);
			if (entity instanceof Player _player && !_player.level.isClientSide())
				_player.displayClientMessage(Component.literal("Not Following"), true);
		} else {
			entity.getPersistentData().putBoolean("FollowAll", true);
			if (entity instanceof Player _player && !_player.level.isClientSide())
				_player.displayClientMessage(Component.literal("Following"), true);
		}
	}
}
