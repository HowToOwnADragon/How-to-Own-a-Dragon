
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.howtoownadragon.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.extensions.IForgeMenuType;

import net.minecraft.world.inventory.MenuType;

import net.mcreator.howtoownadragon.world.inventory.PinkMaleGronckleIronGUIMenu;
import net.mcreator.howtoownadragon.world.inventory.PinkFemaleGronckleIronGUIMenu;
import net.mcreator.howtoownadragon.world.inventory.OrangeRedMaleGronckleIronGUIMenu;
import net.mcreator.howtoownadragon.world.inventory.OrangeRedFemaleGronckleIronGUIMenu;
import net.mcreator.howtoownadragon.world.inventory.NotGrownMaleMeatlugGUIMenu;
import net.mcreator.howtoownadragon.world.inventory.NotGrownMaleGroncklePinkGUIMenu;
import net.mcreator.howtoownadragon.world.inventory.NotGrownMaleGronckleOrangeRedGUIMenu;
import net.mcreator.howtoownadragon.world.inventory.NotGrownMaleGronckleBlueYellowGUIMenu;
import net.mcreator.howtoownadragon.world.inventory.NotGrownFemaleMeatlugGUIMenu;
import net.mcreator.howtoownadragon.world.inventory.NotGrownFemaleGroncklePinkGUIMenu;
import net.mcreator.howtoownadragon.world.inventory.NotGrownFemaleGronckleOrangeRedGUIMenu;
import net.mcreator.howtoownadragon.world.inventory.NotGrownFemaleGronckleBlueYellowGUIMenu;
import net.mcreator.howtoownadragon.world.inventory.MeatlugMaleGronckleIronGUIMenu;
import net.mcreator.howtoownadragon.world.inventory.MeatlugFemaleGronckleIronGUIMenu;
import net.mcreator.howtoownadragon.world.inventory.MaleMeatlugGUIMenu;
import net.mcreator.howtoownadragon.world.inventory.MaleGroncklePinkGUIMenu;
import net.mcreator.howtoownadragon.world.inventory.MaleGronckleOrangeRedGUIMenu;
import net.mcreator.howtoownadragon.world.inventory.MaleGronckleBlueYellowGUIMenu;
import net.mcreator.howtoownadragon.world.inventory.InformationGronckleMenu;
import net.mcreator.howtoownadragon.world.inventory.IncubatorGUIMenu;
import net.mcreator.howtoownadragon.world.inventory.FemaleMeatlugGUIMenu;
import net.mcreator.howtoownadragon.world.inventory.FemaleGroncklePinkGUIMenu;
import net.mcreator.howtoownadragon.world.inventory.FemaleGronckleOrangeRedGUIMenu;
import net.mcreator.howtoownadragon.world.inventory.FemaleGronckleBlueYellowGUIMenu;
import net.mcreator.howtoownadragon.world.inventory.DragonEyeInputMenu;
import net.mcreator.howtoownadragon.world.inventory.BlueYellowMaleGronckleIronGUIMenu;
import net.mcreator.howtoownadragon.world.inventory.BlueYellowFemaleGronckleIronGUIMenu;
import net.mcreator.howtoownadragon.HowToOwnADragonMod;

public class HowToOwnADragonModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.MENU_TYPES, HowToOwnADragonMod.MODID);
	public static final RegistryObject<MenuType<IncubatorGUIMenu>> INCUBATOR_GUI = REGISTRY.register("incubator_gui", () -> IForgeMenuType.create(IncubatorGUIMenu::new));
	public static final RegistryObject<MenuType<DragonEyeInputMenu>> DRAGON_EYE_INPUT = REGISTRY.register("dragon_eye_input", () -> IForgeMenuType.create(DragonEyeInputMenu::new));
	public static final RegistryObject<MenuType<InformationGronckleMenu>> INFORMATION_GRONCKLE = REGISTRY.register("information_gronckle", () -> IForgeMenuType.create(InformationGronckleMenu::new));
	public static final RegistryObject<MenuType<MaleMeatlugGUIMenu>> MALE_MEATLUG_GUI = REGISTRY.register("male_meatlug_gui", () -> IForgeMenuType.create(MaleMeatlugGUIMenu::new));
	public static final RegistryObject<MenuType<MeatlugMaleGronckleIronGUIMenu>> MEATLUG_MALE_GRONCKLE_IRON_GUI = REGISTRY.register("meatlug_male_gronckle_iron_gui", () -> IForgeMenuType.create(MeatlugMaleGronckleIronGUIMenu::new));
	public static final RegistryObject<MenuType<PinkMaleGronckleIronGUIMenu>> PINK_MALE_GRONCKLE_IRON_GUI = REGISTRY.register("pink_male_gronckle_iron_gui", () -> IForgeMenuType.create(PinkMaleGronckleIronGUIMenu::new));
	public static final RegistryObject<MenuType<OrangeRedMaleGronckleIronGUIMenu>> ORANGE_RED_MALE_GRONCKLE_IRON_GUI = REGISTRY.register("orange_red_male_gronckle_iron_gui", () -> IForgeMenuType.create(OrangeRedMaleGronckleIronGUIMenu::new));
	public static final RegistryObject<MenuType<BlueYellowMaleGronckleIronGUIMenu>> BLUE_YELLOW_MALE_GRONCKLE_IRON_GUI = REGISTRY.register("blue_yellow_male_gronckle_iron_gui", () -> IForgeMenuType.create(BlueYellowMaleGronckleIronGUIMenu::new));
	public static final RegistryObject<MenuType<MeatlugFemaleGronckleIronGUIMenu>> MEATLUG_FEMALE_GRONCKLE_IRON_GUI = REGISTRY.register("meatlug_female_gronckle_iron_gui", () -> IForgeMenuType.create(MeatlugFemaleGronckleIronGUIMenu::new));
	public static final RegistryObject<MenuType<PinkFemaleGronckleIronGUIMenu>> PINK_FEMALE_GRONCKLE_IRON_GUI = REGISTRY.register("pink_female_gronckle_iron_gui", () -> IForgeMenuType.create(PinkFemaleGronckleIronGUIMenu::new));
	public static final RegistryObject<MenuType<OrangeRedFemaleGronckleIronGUIMenu>> ORANGE_RED_FEMALE_GRONCKLE_IRON_GUI = REGISTRY.register("orange_red_female_gronckle_iron_gui", () -> IForgeMenuType.create(OrangeRedFemaleGronckleIronGUIMenu::new));
	public static final RegistryObject<MenuType<BlueYellowFemaleGronckleIronGUIMenu>> BLUE_YELLOW_FEMALE_GRONCKLE_IRON_GUI = REGISTRY.register("blue_yellow_female_gronckle_iron_gui",
			() -> IForgeMenuType.create(BlueYellowFemaleGronckleIronGUIMenu::new));
	public static final RegistryObject<MenuType<MaleGroncklePinkGUIMenu>> MALE_GRONCKLE_PINK_GUI = REGISTRY.register("male_gronckle_pink_gui", () -> IForgeMenuType.create(MaleGroncklePinkGUIMenu::new));
	public static final RegistryObject<MenuType<MaleGronckleOrangeRedGUIMenu>> MALE_GRONCKLE_ORANGE_RED_GUI = REGISTRY.register("male_gronckle_orange_red_gui", () -> IForgeMenuType.create(MaleGronckleOrangeRedGUIMenu::new));
	public static final RegistryObject<MenuType<MaleGronckleBlueYellowGUIMenu>> MALE_GRONCKLE_BLUE_YELLOW_GUI = REGISTRY.register("male_gronckle_blue_yellow_gui", () -> IForgeMenuType.create(MaleGronckleBlueYellowGUIMenu::new));
	public static final RegistryObject<MenuType<FemaleMeatlugGUIMenu>> FEMALE_MEATLUG_GUI = REGISTRY.register("female_meatlug_gui", () -> IForgeMenuType.create(FemaleMeatlugGUIMenu::new));
	public static final RegistryObject<MenuType<FemaleGroncklePinkGUIMenu>> FEMALE_GRONCKLE_PINK_GUI = REGISTRY.register("female_gronckle_pink_gui", () -> IForgeMenuType.create(FemaleGroncklePinkGUIMenu::new));
	public static final RegistryObject<MenuType<FemaleGronckleOrangeRedGUIMenu>> FEMALE_GRONCKLE_ORANGE_RED_GUI = REGISTRY.register("female_gronckle_orange_red_gui", () -> IForgeMenuType.create(FemaleGronckleOrangeRedGUIMenu::new));
	public static final RegistryObject<MenuType<FemaleGronckleBlueYellowGUIMenu>> FEMALE_GRONCKLE_BLUE_YELLOW_GUI = REGISTRY.register("female_gronckle_blue_yellow_gui", () -> IForgeMenuType.create(FemaleGronckleBlueYellowGUIMenu::new));
	public static final RegistryObject<MenuType<NotGrownMaleMeatlugGUIMenu>> NOT_GROWN_MALE_MEATLUG_GUI = REGISTRY.register("not_grown_male_meatlug_gui", () -> IForgeMenuType.create(NotGrownMaleMeatlugGUIMenu::new));
	public static final RegistryObject<MenuType<NotGrownMaleGroncklePinkGUIMenu>> NOT_GROWN_MALE_GRONCKLE_PINK_GUI = REGISTRY.register("not_grown_male_gronckle_pink_gui", () -> IForgeMenuType.create(NotGrownMaleGroncklePinkGUIMenu::new));
	public static final RegistryObject<MenuType<NotGrownMaleGronckleOrangeRedGUIMenu>> NOT_GROWN_MALE_GRONCKLE_ORANGE_RED_GUI = REGISTRY.register("not_grown_male_gronckle_orange_red_gui",
			() -> IForgeMenuType.create(NotGrownMaleGronckleOrangeRedGUIMenu::new));
	public static final RegistryObject<MenuType<NotGrownMaleGronckleBlueYellowGUIMenu>> NOT_GROWN_MALE_GRONCKLE_BLUE_YELLOW_GUI = REGISTRY.register("not_grown_male_gronckle_blue_yellow_gui",
			() -> IForgeMenuType.create(NotGrownMaleGronckleBlueYellowGUIMenu::new));
	public static final RegistryObject<MenuType<NotGrownFemaleMeatlugGUIMenu>> NOT_GROWN_FEMALE_MEATLUG_GUI = REGISTRY.register("not_grown_female_meatlug_gui", () -> IForgeMenuType.create(NotGrownFemaleMeatlugGUIMenu::new));
	public static final RegistryObject<MenuType<NotGrownFemaleGroncklePinkGUIMenu>> NOT_GROWN_FEMALE_GRONCKLE_PINK_GUI = REGISTRY.register("not_grown_female_gronckle_pink_gui", () -> IForgeMenuType.create(NotGrownFemaleGroncklePinkGUIMenu::new));
	public static final RegistryObject<MenuType<NotGrownFemaleGronckleOrangeRedGUIMenu>> NOT_GROWN_FEMALE_GRONCKLE_ORANGE_RED_GUI = REGISTRY.register("not_grown_female_gronckle_orange_red_gui",
			() -> IForgeMenuType.create(NotGrownFemaleGronckleOrangeRedGUIMenu::new));
	public static final RegistryObject<MenuType<NotGrownFemaleGronckleBlueYellowGUIMenu>> NOT_GROWN_FEMALE_GRONCKLE_BLUE_YELLOW_GUI = REGISTRY.register("not_grown_female_gronckle_blue_yellow_gui",
			() -> IForgeMenuType.create(NotGrownFemaleGronckleBlueYellowGUIMenu::new));
}
