
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.howtoownadragon.init;

import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.gui.screens.MenuScreens;

import net.mcreator.howtoownadragon.client.gui.MeatlugMaleGronckleIronGUIScreen;
import net.mcreator.howtoownadragon.client.gui.MaleMeatlugGUIScreen;
import net.mcreator.howtoownadragon.client.gui.InformationGronckleScreen;
import net.mcreator.howtoownadragon.client.gui.Incubator1GUIScreen;
import net.mcreator.howtoownadragon.client.gui.DragonEyeInputScreen;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class HowToOwnADragonModScreens {
	@SubscribeEvent
	public static void clientLoad(FMLClientSetupEvent event) {
		event.enqueueWork(() -> {
			MenuScreens.register(HowToOwnADragonModMenus.DRAGON_EYE_INPUT.get(), DragonEyeInputScreen::new);
			MenuScreens.register(HowToOwnADragonModMenus.INFORMATION_GRONCKLE.get(), InformationGronckleScreen::new);
			MenuScreens.register(HowToOwnADragonModMenus.MALE_MEATLUG_GUI.get(), MaleMeatlugGUIScreen::new);
			MenuScreens.register(HowToOwnADragonModMenus.MEATLUG_MALE_GRONCKLE_IRON_GUI.get(), MeatlugMaleGronckleIronGUIScreen::new);
			MenuScreens.register(HowToOwnADragonModMenus.INCUBATOR_1_GUI.get(), Incubator1GUIScreen::new);
		});
	}
}
