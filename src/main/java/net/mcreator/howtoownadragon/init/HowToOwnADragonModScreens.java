
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.howtoownadragon.init;

import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.gui.screens.MenuScreens;

import net.mcreator.howtoownadragon.client.gui.PinkMaleGronckleIronGUIScreen;
import net.mcreator.howtoownadragon.client.gui.PinkFemaleGronckleIronGUIScreen;
import net.mcreator.howtoownadragon.client.gui.OrangeRedMaleGronckleIronGUIScreen;
import net.mcreator.howtoownadragon.client.gui.OrangeRedFemaleGronckleIronGUIScreen;
import net.mcreator.howtoownadragon.client.gui.MeatlugMaleGronckleIronGUIScreen;
import net.mcreator.howtoownadragon.client.gui.MeatlugFemaleGronckleIronGUIScreen;
import net.mcreator.howtoownadragon.client.gui.MaleMeatlugGUIScreen;
import net.mcreator.howtoownadragon.client.gui.InformationGronckleScreen;
import net.mcreator.howtoownadragon.client.gui.IncubatorGUIScreen;
import net.mcreator.howtoownadragon.client.gui.DragonEyeInputScreen;
import net.mcreator.howtoownadragon.client.gui.BlueYellowMaleGronckleIronGUIScreen;
import net.mcreator.howtoownadragon.client.gui.BlueYellowFemaleGronckleIronGUIScreen;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class HowToOwnADragonModScreens {
	@SubscribeEvent
	public static void clientLoad(FMLClientSetupEvent event) {
		event.enqueueWork(() -> {
			MenuScreens.register(HowToOwnADragonModMenus.INCUBATOR_GUI.get(), IncubatorGUIScreen::new);
			MenuScreens.register(HowToOwnADragonModMenus.DRAGON_EYE_INPUT.get(), DragonEyeInputScreen::new);
			MenuScreens.register(HowToOwnADragonModMenus.INFORMATION_GRONCKLE.get(), InformationGronckleScreen::new);
			MenuScreens.register(HowToOwnADragonModMenus.MALE_MEATLUG_GUI.get(), MaleMeatlugGUIScreen::new);
			MenuScreens.register(HowToOwnADragonModMenus.MEATLUG_MALE_GRONCKLE_IRON_GUI.get(), MeatlugMaleGronckleIronGUIScreen::new);
			MenuScreens.register(HowToOwnADragonModMenus.PINK_MALE_GRONCKLE_IRON_GUI.get(), PinkMaleGronckleIronGUIScreen::new);
			MenuScreens.register(HowToOwnADragonModMenus.ORANGE_RED_MALE_GRONCKLE_IRON_GUI.get(), OrangeRedMaleGronckleIronGUIScreen::new);
			MenuScreens.register(HowToOwnADragonModMenus.BLUE_YELLOW_MALE_GRONCKLE_IRON_GUI.get(), BlueYellowMaleGronckleIronGUIScreen::new);
			MenuScreens.register(HowToOwnADragonModMenus.MEATLUG_FEMALE_GRONCKLE_IRON_GUI.get(), MeatlugFemaleGronckleIronGUIScreen::new);
			MenuScreens.register(HowToOwnADragonModMenus.PINK_FEMALE_GRONCKLE_IRON_GUI.get(), PinkFemaleGronckleIronGUIScreen::new);
			MenuScreens.register(HowToOwnADragonModMenus.ORANGE_RED_FEMALE_GRONCKLE_IRON_GUI.get(), OrangeRedFemaleGronckleIronGUIScreen::new);
			MenuScreens.register(HowToOwnADragonModMenus.BLUE_YELLOW_FEMALE_GRONCKLE_IRON_GUI.get(), BlueYellowFemaleGronckleIronGUIScreen::new);
		});
	}
}
