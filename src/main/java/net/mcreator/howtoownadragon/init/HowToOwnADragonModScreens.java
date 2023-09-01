
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.howtoownadragon.init;

import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.gui.screens.MenuScreens;

import net.mcreator.howtoownadragon.client.gui.MaleGronckleGUIScreen;
import net.mcreator.howtoownadragon.client.gui.MainPageInfoGronckleScreen;
import net.mcreator.howtoownadragon.client.gui.Incubator1GUIScreen;
import net.mcreator.howtoownadragon.client.gui.GronkleIronGUIMaleScreen;
import net.mcreator.howtoownadragon.client.gui.GronckleIronGUIFemaleScreen;
import net.mcreator.howtoownadragon.client.gui.FoodPageInfoGronckleScreen;
import net.mcreator.howtoownadragon.client.gui.FemaleGronckleGUIScreen;
import net.mcreator.howtoownadragon.client.gui.DragonEyeInputScreen;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class HowToOwnADragonModScreens {
	@SubscribeEvent
	public static void clientLoad(FMLClientSetupEvent event) {
		event.enqueueWork(() -> {
			MenuScreens.register(HowToOwnADragonModMenus.DRAGON_EYE_INPUT.get(), DragonEyeInputScreen::new);
			MenuScreens.register(HowToOwnADragonModMenus.INCUBATOR_1_GUI.get(), Incubator1GUIScreen::new);
			MenuScreens.register(HowToOwnADragonModMenus.FEMALE_GRONCKLE_GUI.get(), FemaleGronckleGUIScreen::new);
			MenuScreens.register(HowToOwnADragonModMenus.MALE_GRONCKLE_GUI.get(), MaleGronckleGUIScreen::new);
			MenuScreens.register(HowToOwnADragonModMenus.GRONKLE_IRON_GUI_MALE.get(), GronkleIronGUIMaleScreen::new);
			MenuScreens.register(HowToOwnADragonModMenus.GRONCKLE_IRON_GUI_FEMALE.get(), GronckleIronGUIFemaleScreen::new);
			MenuScreens.register(HowToOwnADragonModMenus.MAIN_PAGE_INFO_GRONCKLE.get(), MainPageInfoGronckleScreen::new);
			MenuScreens.register(HowToOwnADragonModMenus.FOOD_PAGE_INFO_GRONCKLE.get(), FoodPageInfoGronckleScreen::new);
		});
	}
}
