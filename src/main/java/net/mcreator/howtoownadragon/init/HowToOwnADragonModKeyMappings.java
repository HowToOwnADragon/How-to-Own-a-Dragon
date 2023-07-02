
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

import net.mcreator.howtoownadragon.network.OpenGronckleGUIMessage;
import net.mcreator.howtoownadragon.HowToOwnADragonMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class HowToOwnADragonModKeyMappings {
	public static final KeyMapping OPEN_GRONCKLE_GUI = new KeyMapping("key.how_to_own_a_dragon.open_gronckle_gui", GLFW.GLFW_KEY_E, "key.categories.misc") {
		private boolean isDownOld = false;

		@Override
		public void setDown(boolean isDown) {
			super.setDown(isDown);
			if (isDownOld != isDown && isDown) {
				HowToOwnADragonMod.PACKET_HANDLER.sendToServer(new OpenGronckleGUIMessage(0, 0));
				OpenGronckleGUIMessage.pressAction(Minecraft.getInstance().player, 0, 0);
			}
			isDownOld = isDown;
		}
	};

	@SubscribeEvent
	public static void registerKeyMappings(RegisterKeyMappingsEvent event) {
		event.register(OPEN_GRONCKLE_GUI);
	}

	@Mod.EventBusSubscriber({Dist.CLIENT})
	public static class KeyEventListener {
		@SubscribeEvent
		public static void onClientTick(TickEvent.ClientTickEvent event) {
			if (Minecraft.getInstance().screen == null) {
				OPEN_GRONCKLE_GUI.consumeClick();
			}
		}
	}
}
