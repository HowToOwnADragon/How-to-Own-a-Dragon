
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
import net.mcreator.howtoownadragon.world.inventory.MeatlugMaleGronckleIronGUIMenu;
import net.mcreator.howtoownadragon.world.inventory.MeatlugFemaleGronckleIronGUIMenu;
import net.mcreator.howtoownadragon.world.inventory.MaleMeatlugGUIMenu;
import net.mcreator.howtoownadragon.world.inventory.InformationGronckleMenu;
import net.mcreator.howtoownadragon.world.inventory.IncubatorGUIMenu;
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
}
