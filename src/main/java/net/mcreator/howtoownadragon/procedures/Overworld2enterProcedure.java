package net.mcreator.howtoownadragon.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.player.PlayerEvent;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class Overworld2enterProcedure {
	@SubscribeEvent
	public static void onPlayerLoggedIn(PlayerEvent.PlayerLoggedInEvent event) {
		execute(event);
	}

	public static void execute() {
		execute(null);
	}

	private static void execute(@Nullable Event event) {
	}
}
