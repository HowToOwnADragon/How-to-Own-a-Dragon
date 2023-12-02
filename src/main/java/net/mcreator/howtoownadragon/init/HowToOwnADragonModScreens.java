
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.howtoownadragon.init;

import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.gui.screens.MenuScreens;

import net.mcreator.howtoownadragon.client.gui.VanillaTabGroupsGUIScreen;
import net.mcreator.howtoownadragon.client.gui.ProgressiveAchievementsScreen;
import net.mcreator.howtoownadragon.client.gui.NothingsHereScreen;
import net.mcreator.howtoownadragon.client.gui.NotGrownMaleNadderGUIScreen;
import net.mcreator.howtoownadragon.client.gui.NotGrownMaleGronckleGUIScreen;
import net.mcreator.howtoownadragon.client.gui.NotGrownFemaleNadderGUIScreen;
import net.mcreator.howtoownadragon.client.gui.NotGrownFemaleGronckleGUIScreen;
import net.mcreator.howtoownadragon.client.gui.NetherTabGroupGUIScreen;
import net.mcreator.howtoownadragon.client.gui.NetherBiomesGUIScreen;
import net.mcreator.howtoownadragon.client.gui.NOTFINISHEDScreen;
import net.mcreator.howtoownadragon.client.gui.MaleTTGUIScreen;
import net.mcreator.howtoownadragon.client.gui.MaleNadderGUIScreen;
import net.mcreator.howtoownadragon.client.gui.MaleGronckleGUIScreen;
import net.mcreator.howtoownadragon.client.gui.MainPageInfoGronckleScreen;
import net.mcreator.howtoownadragon.client.gui.MHThirdPageGUIScreen;
import net.mcreator.howtoownadragon.client.gui.MHSixthPageGUIScreen;
import net.mcreator.howtoownadragon.client.gui.MHSecondPageGUIScreen;
import net.mcreator.howtoownadragon.client.gui.MHFourthPageGUIScreen;
import net.mcreator.howtoownadragon.client.gui.MHFirstPageGUIScreen;
import net.mcreator.howtoownadragon.client.gui.MHFifthPageGUIScreen;
import net.mcreator.howtoownadragon.client.gui.LoveIsInTheAirScreen;
import net.mcreator.howtoownadragon.client.gui.Incubator1GUIScreen;
import net.mcreator.howtoownadragon.client.gui.HusbandryTabGroupGUIScreen;
import net.mcreator.howtoownadragon.client.gui.HTOADAdvancementsScreen;
import net.mcreator.howtoownadragon.client.gui.GronkleIronGUIMaleScreen;
import net.mcreator.howtoownadragon.client.gui.GronckleIronGUIFemaleScreen;
import net.mcreator.howtoownadragon.client.gui.GottaCatchEmAllScreen;
import net.mcreator.howtoownadragon.client.gui.GenericOrAdvancedConfigScreen;
import net.mcreator.howtoownadragon.client.gui.FoodPage1InfoGronckleScreen;
import net.mcreator.howtoownadragon.client.gui.FemaleTTGUIScreen;
import net.mcreator.howtoownadragon.client.gui.FemaleNadderGUIScreen;
import net.mcreator.howtoownadragon.client.gui.FemaleGronckleGUIScreen;
import net.mcreator.howtoownadragon.client.gui.DragonEyeInputScreen;
import net.mcreator.howtoownadragon.client.gui.CongratsGUIScreen;
import net.mcreator.howtoownadragon.client.gui.AdventureTabGroupGUIScreen;
import net.mcreator.howtoownadragon.client.gui.ATThirdPageGUIScreen;
import net.mcreator.howtoownadragon.client.gui.ATSixthPageGUIScreen;
import net.mcreator.howtoownadragon.client.gui.ATSeventhPageGUIScreen;
import net.mcreator.howtoownadragon.client.gui.ATSecondPageGUIScreen;
import net.mcreator.howtoownadragon.client.gui.ATNinthPageGUIScreen;
import net.mcreator.howtoownadragon.client.gui.ATFourthPageGUIScreen;
import net.mcreator.howtoownadragon.client.gui.ATFirstPageGUIScreen;
import net.mcreator.howtoownadragon.client.gui.ATFifthPageGUIScreen;
import net.mcreator.howtoownadragon.client.gui.ATEighthPageGUIScreen;

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
			MenuScreens.register(HowToOwnADragonModMenus.NOT_GROWN_MALE_GRONCKLE_GUI.get(), NotGrownMaleGronckleGUIScreen::new);
			MenuScreens.register(HowToOwnADragonModMenus.NOT_GROWN_FEMALE_GRONCKLE_GUI.get(), NotGrownFemaleGronckleGUIScreen::new);
			MenuScreens.register(HowToOwnADragonModMenus.FOOD_PAGE_1_INFO_GRONCKLE.get(), FoodPage1InfoGronckleScreen::new);
			MenuScreens.register(HowToOwnADragonModMenus.MALE_TTGUI.get(), MaleTTGUIScreen::new);
			MenuScreens.register(HowToOwnADragonModMenus.FEMALE_TTGUI.get(), FemaleTTGUIScreen::new);
			MenuScreens.register(HowToOwnADragonModMenus.FEMALE_NADDER_GUI.get(), FemaleNadderGUIScreen::new);
			MenuScreens.register(HowToOwnADragonModMenus.MALE_NADDER_GUI.get(), MaleNadderGUIScreen::new);
			MenuScreens.register(HowToOwnADragonModMenus.NOT_GROWN_FEMALE_NADDER_GUI.get(), NotGrownFemaleNadderGUIScreen::new);
			MenuScreens.register(HowToOwnADragonModMenus.NOT_GROWN_MALE_NADDER_GUI.get(), NotGrownMaleNadderGUIScreen::new);
			MenuScreens.register(HowToOwnADragonModMenus.GENERIC_OR_ADVANCED_CONFIG.get(), GenericOrAdvancedConfigScreen::new);
			MenuScreens.register(HowToOwnADragonModMenus.PROGRESSIVE_ACHIEVEMENTS.get(), ProgressiveAchievementsScreen::new);
			MenuScreens.register(HowToOwnADragonModMenus.HTOAD_ADVANCEMENTS.get(), HTOADAdvancementsScreen::new);
			MenuScreens.register(HowToOwnADragonModMenus.GOTTA_CATCH_EM_ALL.get(), GottaCatchEmAllScreen::new);
			MenuScreens.register(HowToOwnADragonModMenus.CONGRATS_GUI.get(), CongratsGUIScreen::new);
			MenuScreens.register(HowToOwnADragonModMenus.LOVE_IS_IN_THE_AIR.get(), LoveIsInTheAirScreen::new);
			MenuScreens.register(HowToOwnADragonModMenus.VANILLA_TAB_GROUPS_GUI.get(), VanillaTabGroupsGUIScreen::new);
			MenuScreens.register(HowToOwnADragonModMenus.NOTHINGS_HERE.get(), NothingsHereScreen::new);
			MenuScreens.register(HowToOwnADragonModMenus.HUSBANDRY_TAB_GROUP_GUI.get(), HusbandryTabGroupGUIScreen::new);
			MenuScreens.register(HowToOwnADragonModMenus.ADVENTURE_TAB_GROUP_GUI.get(), AdventureTabGroupGUIScreen::new);
			MenuScreens.register(HowToOwnADragonModMenus.NETHER_TAB_GROUP_GUI.get(), NetherTabGroupGUIScreen::new);
			MenuScreens.register(HowToOwnADragonModMenus.NOTFINISHED.get(), NOTFINISHEDScreen::new);
			MenuScreens.register(HowToOwnADragonModMenus.NETHER_BIOMES_GUI.get(), NetherBiomesGUIScreen::new);
			MenuScreens.register(HowToOwnADragonModMenus.MH_FIRST_PAGE_GUI.get(), MHFirstPageGUIScreen::new);
			MenuScreens.register(HowToOwnADragonModMenus.MH_SECOND_PAGE_GUI.get(), MHSecondPageGUIScreen::new);
			MenuScreens.register(HowToOwnADragonModMenus.MH_THIRD_PAGE_GUI.get(), MHThirdPageGUIScreen::new);
			MenuScreens.register(HowToOwnADragonModMenus.MH_FOURTH_PAGE_GUI.get(), MHFourthPageGUIScreen::new);
			MenuScreens.register(HowToOwnADragonModMenus.MH_FIFTH_PAGE_GUI.get(), MHFifthPageGUIScreen::new);
			MenuScreens.register(HowToOwnADragonModMenus.MH_SIXTH_PAGE_GUI.get(), MHSixthPageGUIScreen::new);
			MenuScreens.register(HowToOwnADragonModMenus.AT_FIRST_PAGE_GUI.get(), ATFirstPageGUIScreen::new);
			MenuScreens.register(HowToOwnADragonModMenus.AT_SECOND_PAGE_GUI.get(), ATSecondPageGUIScreen::new);
			MenuScreens.register(HowToOwnADragonModMenus.AT_THIRD_PAGE_GUI.get(), ATThirdPageGUIScreen::new);
			MenuScreens.register(HowToOwnADragonModMenus.AT_FOURTH_PAGE_GUI.get(), ATFourthPageGUIScreen::new);
			MenuScreens.register(HowToOwnADragonModMenus.AT_FIFTH_PAGE_GUI.get(), ATFifthPageGUIScreen::new);
			MenuScreens.register(HowToOwnADragonModMenus.AT_SIXTH_PAGE_GUI.get(), ATSixthPageGUIScreen::new);
			MenuScreens.register(HowToOwnADragonModMenus.AT_SEVENTH_PAGE_GUI.get(), ATSeventhPageGUIScreen::new);
			MenuScreens.register(HowToOwnADragonModMenus.AT_EIGHTH_PAGE_GUI.get(), ATEighthPageGUIScreen::new);
			MenuScreens.register(HowToOwnADragonModMenus.AT_NINTH_PAGE_GUI.get(), ATNinthPageGUIScreen::new);
		});
	}
}
