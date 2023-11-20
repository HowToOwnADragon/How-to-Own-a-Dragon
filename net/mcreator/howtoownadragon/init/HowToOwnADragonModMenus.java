package net.mcreator.howtoownadragon.init;

import net.mcreator.howtoownadragon.world.inventory.DragonEyeInputMenu;
import net.mcreator.howtoownadragon.world.inventory.FemaleGronckleGUIMenu;
import net.mcreator.howtoownadragon.world.inventory.FemaleNadderGUIMenu;
import net.mcreator.howtoownadragon.world.inventory.FemaleTTGUIMenu;
import net.mcreator.howtoownadragon.world.inventory.FoodPage1InfoGronckleMenu;
import net.mcreator.howtoownadragon.world.inventory.GronckleIronGUIFemaleMenu;
import net.mcreator.howtoownadragon.world.inventory.GronkleIronGUIMaleMenu;
import net.mcreator.howtoownadragon.world.inventory.Incubator1GUIMenu;
import net.mcreator.howtoownadragon.world.inventory.MainPageInfoGronckleMenu;
import net.mcreator.howtoownadragon.world.inventory.MaleGronckleGUIMenu;
import net.mcreator.howtoownadragon.world.inventory.MaleNadderGUIMenu;
import net.mcreator.howtoownadragon.world.inventory.MaleTTGUIMenu;
import net.mcreator.howtoownadragon.world.inventory.NotGrownFemaleGronckleGUIMenu;
import net.mcreator.howtoownadragon.world.inventory.NotGrownFemaleNadderGUIMenu;
import net.mcreator.howtoownadragon.world.inventory.NotGrownMaleGronckleGUIMenu;
import net.mcreator.howtoownadragon.world.inventory.NotGrownMaleNadderGUIMenu;
import net.minecraft.world.inventory.MenuType;
import net.minecraftforge.common.extensions.IForgeMenuType;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class HowToOwnADragonModMenus {
   public static final DeferredRegister<MenuType<?>> REGISTRY;
   public static final RegistryObject<MenuType<DragonEyeInputMenu>> DRAGON_EYE_INPUT;
   public static final RegistryObject<MenuType<Incubator1GUIMenu>> INCUBATOR_1_GUI;
   public static final RegistryObject<MenuType<FemaleGronckleGUIMenu>> FEMALE_GRONCKLE_GUI;
   public static final RegistryObject<MenuType<MaleGronckleGUIMenu>> MALE_GRONCKLE_GUI;
   public static final RegistryObject<MenuType<GronkleIronGUIMaleMenu>> GRONKLE_IRON_GUI_MALE;
   public static final RegistryObject<MenuType<GronckleIronGUIFemaleMenu>> GRONCKLE_IRON_GUI_FEMALE;
   public static final RegistryObject<MenuType<MainPageInfoGronckleMenu>> MAIN_PAGE_INFO_GRONCKLE;
   public static final RegistryObject<MenuType<NotGrownMaleGronckleGUIMenu>> NOT_GROWN_MALE_GRONCKLE_GUI;
   public static final RegistryObject<MenuType<NotGrownFemaleGronckleGUIMenu>> NOT_GROWN_FEMALE_GRONCKLE_GUI;
   public static final RegistryObject<MenuType<FoodPage1InfoGronckleMenu>> FOOD_PAGE_1_INFO_GRONCKLE;
   public static final RegistryObject<MenuType<MaleTTGUIMenu>> MALE_TTGUI;
   public static final RegistryObject<MenuType<FemaleTTGUIMenu>> FEMALE_TTGUI;
   public static final RegistryObject<MenuType<FemaleNadderGUIMenu>> FEMALE_NADDER_GUI;
   public static final RegistryObject<MenuType<MaleNadderGUIMenu>> MALE_NADDER_GUI;
   public static final RegistryObject<MenuType<NotGrownFemaleNadderGUIMenu>> NOT_GROWN_FEMALE_NADDER_GUI;
   public static final RegistryObject<MenuType<NotGrownMaleNadderGUIMenu>> NOT_GROWN_MALE_NADDER_GUI;

   static {
      REGISTRY = DeferredRegister.create(ForgeRegistries.MENU_TYPES, "how_to_own_a_dragon");
      DRAGON_EYE_INPUT = REGISTRY.register("dragon_eye_input", () -> {
         return IForgeMenuType.create(DragonEyeInputMenu::new);
      });
      INCUBATOR_1_GUI = REGISTRY.register("incubator_1_gui", () -> {
         return IForgeMenuType.create(Incubator1GUIMenu::new);
      });
      FEMALE_GRONCKLE_GUI = REGISTRY.register("female_gronckle_gui", () -> {
         return IForgeMenuType.create(FemaleGronckleGUIMenu::new);
      });
      MALE_GRONCKLE_GUI = REGISTRY.register("male_gronckle_gui", () -> {
         return IForgeMenuType.create(MaleGronckleGUIMenu::new);
      });
      GRONKLE_IRON_GUI_MALE = REGISTRY.register("gronkle_iron_gui_male", () -> {
         return IForgeMenuType.create(GronkleIronGUIMaleMenu::new);
      });
      GRONCKLE_IRON_GUI_FEMALE = REGISTRY.register("gronckle_iron_gui_female", () -> {
         return IForgeMenuType.create(GronckleIronGUIFemaleMenu::new);
      });
      MAIN_PAGE_INFO_GRONCKLE = REGISTRY.register("main_page_info_gronckle", () -> {
         return IForgeMenuType.create(MainPageInfoGronckleMenu::new);
      });
      NOT_GROWN_MALE_GRONCKLE_GUI = REGISTRY.register("not_grown_male_gronckle_gui", () -> {
         return IForgeMenuType.create(NotGrownMaleGronckleGUIMenu::new);
      });
      NOT_GROWN_FEMALE_GRONCKLE_GUI = REGISTRY.register("not_grown_female_gronckle_gui", () -> {
         return IForgeMenuType.create(NotGrownFemaleGronckleGUIMenu::new);
      });
      FOOD_PAGE_1_INFO_GRONCKLE = REGISTRY.register("food_page_1_info_gronckle", () -> {
         return IForgeMenuType.create(FoodPage1InfoGronckleMenu::new);
      });
      MALE_TTGUI = REGISTRY.register("male_ttgui", () -> {
         return IForgeMenuType.create(MaleTTGUIMenu::new);
      });
      FEMALE_TTGUI = REGISTRY.register("female_ttgui", () -> {
         return IForgeMenuType.create(FemaleTTGUIMenu::new);
      });
      FEMALE_NADDER_GUI = REGISTRY.register("female_nadder_gui", () -> {
         return IForgeMenuType.create(FemaleNadderGUIMenu::new);
      });
      MALE_NADDER_GUI = REGISTRY.register("male_nadder_gui", () -> {
         return IForgeMenuType.create(MaleNadderGUIMenu::new);
      });
      NOT_GROWN_FEMALE_NADDER_GUI = REGISTRY.register("not_grown_female_nadder_gui", () -> {
         return IForgeMenuType.create(NotGrownFemaleNadderGUIMenu::new);
      });
      NOT_GROWN_MALE_NADDER_GUI = REGISTRY.register("not_grown_male_nadder_gui", () -> {
         return IForgeMenuType.create(NotGrownMaleNadderGUIMenu::new);
      });
   }
}
