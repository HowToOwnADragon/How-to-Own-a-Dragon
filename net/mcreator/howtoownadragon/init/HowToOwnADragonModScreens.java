package net.mcreator.howtoownadragon.init;

import net.mcreator.howtoownadragon.client.gui.DragonEyeInputScreen;
import net.mcreator.howtoownadragon.client.gui.FemaleGronckleGUIScreen;
import net.mcreator.howtoownadragon.client.gui.FemaleNadderGUIScreen;
import net.mcreator.howtoownadragon.client.gui.FemaleTTGUIScreen;
import net.mcreator.howtoownadragon.client.gui.FoodPage1InfoGronckleScreen;
import net.mcreator.howtoownadragon.client.gui.GronckleIronGUIFemaleScreen;
import net.mcreator.howtoownadragon.client.gui.GronkleIronGUIMaleScreen;
import net.mcreator.howtoownadragon.client.gui.Incubator1GUIScreen;
import net.mcreator.howtoownadragon.client.gui.MainPageInfoGronckleScreen;
import net.mcreator.howtoownadragon.client.gui.MaleGronckleGUIScreen;
import net.mcreator.howtoownadragon.client.gui.MaleNadderGUIScreen;
import net.mcreator.howtoownadragon.client.gui.MaleTTGUIScreen;
import net.mcreator.howtoownadragon.client.gui.NotGrownFemaleGronckleGUIScreen;
import net.mcreator.howtoownadragon.client.gui.NotGrownFemaleNadderGUIScreen;
import net.mcreator.howtoownadragon.client.gui.NotGrownMaleGronckleGUIScreen;
import net.mcreator.howtoownadragon.client.gui.NotGrownMaleNadderGUIScreen;
import net.minecraft.client.gui.screens.MenuScreens;
import net.minecraft.world.inventory.MenuType;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

@EventBusSubscriber(
   bus = Bus.MOD,
   value = {Dist.CLIENT}
)
public class HowToOwnADragonModScreens {
   @SubscribeEvent
   public static void clientLoad(FMLClientSetupEvent event) {
      event.enqueueWork(() -> {
         MenuScreens.m_96206_((MenuType)HowToOwnADragonModMenus.DRAGON_EYE_INPUT.get(), DragonEyeInputScreen::new);
         MenuScreens.m_96206_((MenuType)HowToOwnADragonModMenus.INCUBATOR_1_GUI.get(), Incubator1GUIScreen::new);
         MenuScreens.m_96206_((MenuType)HowToOwnADragonModMenus.FEMALE_GRONCKLE_GUI.get(), FemaleGronckleGUIScreen::new);
         MenuScreens.m_96206_((MenuType)HowToOwnADragonModMenus.MALE_GRONCKLE_GUI.get(), MaleGronckleGUIScreen::new);
         MenuScreens.m_96206_((MenuType)HowToOwnADragonModMenus.GRONKLE_IRON_GUI_MALE.get(), GronkleIronGUIMaleScreen::new);
         MenuScreens.m_96206_((MenuType)HowToOwnADragonModMenus.GRONCKLE_IRON_GUI_FEMALE.get(), GronckleIronGUIFemaleScreen::new);
         MenuScreens.m_96206_((MenuType)HowToOwnADragonModMenus.MAIN_PAGE_INFO_GRONCKLE.get(), MainPageInfoGronckleScreen::new);
         MenuScreens.m_96206_((MenuType)HowToOwnADragonModMenus.NOT_GROWN_MALE_GRONCKLE_GUI.get(), NotGrownMaleGronckleGUIScreen::new);
         MenuScreens.m_96206_((MenuType)HowToOwnADragonModMenus.NOT_GROWN_FEMALE_GRONCKLE_GUI.get(), NotGrownFemaleGronckleGUIScreen::new);
         MenuScreens.m_96206_((MenuType)HowToOwnADragonModMenus.FOOD_PAGE_1_INFO_GRONCKLE.get(), FoodPage1InfoGronckleScreen::new);
         MenuScreens.m_96206_((MenuType)HowToOwnADragonModMenus.MALE_TTGUI.get(), MaleTTGUIScreen::new);
         MenuScreens.m_96206_((MenuType)HowToOwnADragonModMenus.FEMALE_TTGUI.get(), FemaleTTGUIScreen::new);
         MenuScreens.m_96206_((MenuType)HowToOwnADragonModMenus.FEMALE_NADDER_GUI.get(), FemaleNadderGUIScreen::new);
         MenuScreens.m_96206_((MenuType)HowToOwnADragonModMenus.MALE_NADDER_GUI.get(), MaleNadderGUIScreen::new);
         MenuScreens.m_96206_((MenuType)HowToOwnADragonModMenus.NOT_GROWN_FEMALE_NADDER_GUI.get(), NotGrownFemaleNadderGUIScreen::new);
         MenuScreens.m_96206_((MenuType)HowToOwnADragonModMenus.NOT_GROWN_MALE_NADDER_GUI.get(), NotGrownMaleNadderGUIScreen::new);
      });
   }
}
