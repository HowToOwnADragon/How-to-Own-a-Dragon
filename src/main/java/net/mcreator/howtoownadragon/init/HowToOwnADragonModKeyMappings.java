
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.howtoownadragon.init;

import org.lwjgl.glfw.GLFW;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.client.event.RegisterKeyMappingsEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.Minecraft;
import net.minecraft.client.KeyMapping;

import net.mcreator.howtoownadragon.network.FlyUpMessage;
import net.mcreator.howtoownadragon.network.FlyDownMessage;
import net.mcreator.howtoownadragon.HowToOwnADragonMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class HowToOwnADragonModKeyMappings {
	public static final KeyMapping FLY_UP = new KeyMapping("key.how_to_own_a_dragon.fly_up", GLFW.GLFW_KEY_SPACE, "key.categories.htoad") {
		private boolean isDownOld = false;

		@Override
		public void setDown(boolean isDown) {
			super.setDown(isDown);
			if (isDownOld != isDown && isDown) {
				HowToOwnADragonMod.PACKET_HANDLER.sendToServer(new FlyUpMessage(0, 0));
				FlyUpMessage.pressAction(Minecraft.getInstance().player, 0, 0);
				FLY_UP_LASTPRESS = System.currentTimeMillis();
			} else if (isDownOld != isDown && !isDown) {
				int dt = (int) (System.currentTimeMillis() - FLY_UP_LASTPRESS);
				HowToOwnADragonMod.PACKET_HANDLER.sendToServer(new FlyUpMessage(1, dt));
				FlyUpMessage.pressAction(Minecraft.getInstance().player, 1, dt);
			}
			isDownOld = isDown;
		}
	};
	public static final KeyMapping FLY_DOWN = new KeyMapping("key.how_to_own_a_dragon.fly_down", GLFW.GLFW_KEY_LEFT_CONTROL, "key.categories.htoad") {
		private boolean isDownOld = false;

		@Override
		public void setDown(boolean isDown) {
			super.setDown(isDown);
			if (isDownOld != isDown && isDown) {
				HowToOwnADragonMod.PACKET_HANDLER.sendToServer(new FlyDownMessage(0, 0));
				FlyDownMessage.pressAction(Minecraft.getInstance().player, 0, 0);
				FLY_DOWN_LASTPRESS = System.currentTimeMillis();
			} else if (isDownOld != isDown && !isDown) {
				int dt = (int) (System.currentTimeMillis() - FLY_DOWN_LASTPRESS);
				HowToOwnADragonMod.PACKET_HANDLER.sendToServer(new FlyDownMessage(1, dt));
				FlyDownMessage.pressAction(Minecraft.getInstance().player, 1, dt);
			}
			isDownOld = isDown;
		}
	};
	private static long FLY_UP_LASTPRESS = 0;
	private static long FLY_DOWN_LASTPRESS = 0;

	@SubscribeEvent
	public static void registerKeyMappings(RegisterKeyMappingsEvent event) {
		event.register(FLY_UP);
		event.register(FLY_DOWN);
	}

	@Mod.EventBusSubscriber({Dist.CLIENT})
	public static class KeyEventListener {
		@SubscribeEvent
		public static void onClientTick(TickEvent.ClientTickEvent event) {
			if (Minecraft.getInstance().screen == null) {
				FLY_UP.consumeClick();
				FLY_DOWN.consumeClick();
			}
		}
	}
}
