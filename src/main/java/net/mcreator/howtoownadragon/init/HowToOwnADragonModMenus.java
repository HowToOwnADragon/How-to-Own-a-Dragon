
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.howtoownadragon.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.extensions.IForgeMenuType;

import net.minecraft.world.inventory.MenuType;

import net.mcreator.howtoownadragon.world.inventory.NotGrownMaleGronckleGUIMenu;
import net.mcreator.howtoownadragon.world.inventory.NotGrownFemaleGronckleGUIMenu;
import net.mcreator.howtoownadragon.world.inventory.MaleGronckleGUIMenu;
import net.mcreator.howtoownadragon.world.inventory.MainPageInfoGronckleMenu;
import net.mcreator.howtoownadragon.world.inventory.Incubator1GUIMenu;
import net.mcreator.howtoownadragon.world.inventory.GronkleIronGUIMaleMenu;
import net.mcreator.howtoownadragon.world.inventory.GronckleIronGUIFemaleMenu;
import net.mcreator.howtoownadragon.world.inventory.FoodPageInfoGronckleMenu;
import net.mcreator.howtoownadragon.world.inventory.FemaleGronckleGUIMenu;
import net.mcreator.howtoownadragon.world.inventory.DragonEyeInputMenu;
import net.mcreator.howtoownadragon.HowToOwnADragonMod;

public class HowToOwnADragonModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.MENU_TYPES, HowToOwnADragonMod.MODID);
	public static final RegistryObject<MenuType<DragonEyeInputMenu>> DRAGON_EYE_INPUT = REGISTRY.register("dragon_eye_input", () -> IForgeMenuType.create(DragonEyeInputMenu::new));
	public static final RegistryObject<MenuType<Incubator1GUIMenu>> INCUBATOR_1_GUI = REGISTRY.register("incubator_1_gui", () -> IForgeMenuType.create(Incubator1GUIMenu::new));
	public static final RegistryObject<MenuType<FemaleGronckleGUIMenu>> FEMALE_GRONCKLE_GUI = REGISTRY.register("female_gronckle_gui", () -> IForgeMenuType.create(FemaleGronckleGUIMenu::new));
	public static final RegistryObject<MenuType<MaleGronckleGUIMenu>> MALE_GRONCKLE_GUI = REGISTRY.register("male_gronckle_gui", () -> IForgeMenuType.create(MaleGronckleGUIMenu::new));
	public static final RegistryObject<MenuType<GronkleIronGUIMaleMenu>> GRONKLE_IRON_GUI_MALE = REGISTRY.register("gronkle_iron_gui_male", () -> IForgeMenuType.create(GronkleIronGUIMaleMenu::new));
	public static final RegistryObject<MenuType<GronckleIronGUIFemaleMenu>> GRONCKLE_IRON_GUI_FEMALE = REGISTRY.register("gronckle_iron_gui_female", () -> IForgeMenuType.create(GronckleIronGUIFemaleMenu::new));
	public static final RegistryObject<MenuType<MainPageInfoGronckleMenu>> MAIN_PAGE_INFO_GRONCKLE = REGISTRY.register("main_page_info_gronckle", () -> IForgeMenuType.create(MainPageInfoGronckleMenu::new));
	public static final RegistryObject<MenuType<FoodPageInfoGronckleMenu>> FOOD_PAGE_INFO_GRONCKLE = REGISTRY.register("food_page_info_gronckle", () -> IForgeMenuType.create(FoodPageInfoGronckleMenu::new));
	public static final RegistryObject<MenuType<NotGrownMaleGronckleGUIMenu>> NOT_GROWN_MALE_GRONCKLE_GUI = REGISTRY.register("not_grown_male_gronckle_gui", () -> IForgeMenuType.create(NotGrownMaleGronckleGUIMenu::new));
	public static final RegistryObject<MenuType<NotGrownFemaleGronckleGUIMenu>> NOT_GROWN_FEMALE_GRONCKLE_GUI = REGISTRY.register("not_grown_female_gronckle_gui", () -> IForgeMenuType.create(NotGrownFemaleGronckleGUIMenu::new));
}
