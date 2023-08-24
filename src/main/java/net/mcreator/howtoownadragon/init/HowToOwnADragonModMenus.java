
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.howtoownadragon.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.extensions.IForgeMenuType;

import net.minecraft.world.inventory.MenuType;

import net.mcreator.howtoownadragon.world.inventory.MaleGronckleGUIMenu;
import net.mcreator.howtoownadragon.world.inventory.InformationGronckleMenu;
import net.mcreator.howtoownadragon.world.inventory.Incubator1GUIMenu;
import net.mcreator.howtoownadragon.world.inventory.GronckleMaleGronckleIronGUIMenu;
import net.mcreator.howtoownadragon.world.inventory.FemaleGronckleGUIMenu;
import net.mcreator.howtoownadragon.world.inventory.DragonEyeInputMenu;
import net.mcreator.howtoownadragon.HowToOwnADragonMod;

public class HowToOwnADragonModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.MENU_TYPES, HowToOwnADragonMod.MODID);
	public static final RegistryObject<MenuType<DragonEyeInputMenu>> DRAGON_EYE_INPUT = REGISTRY.register("dragon_eye_input", () -> IForgeMenuType.create(DragonEyeInputMenu::new));
	public static final RegistryObject<MenuType<InformationGronckleMenu>> INFORMATION_GRONCKLE = REGISTRY.register("information_gronckle", () -> IForgeMenuType.create(InformationGronckleMenu::new));
	public static final RegistryObject<MenuType<Incubator1GUIMenu>> INCUBATOR_1_GUI = REGISTRY.register("incubator_1_gui", () -> IForgeMenuType.create(Incubator1GUIMenu::new));
	public static final RegistryObject<MenuType<FemaleGronckleGUIMenu>> FEMALE_GRONCKLE_GUI = REGISTRY.register("female_gronckle_gui", () -> IForgeMenuType.create(FemaleGronckleGUIMenu::new));
	public static final RegistryObject<MenuType<MaleGronckleGUIMenu>> MALE_GRONCKLE_GUI = REGISTRY.register("male_gronckle_gui", () -> IForgeMenuType.create(MaleGronckleGUIMenu::new));
	public static final RegistryObject<MenuType<GronckleMaleGronckleIronGUIMenu>> GRONCKLE_MALE_GRONCKLE_IRON_GUI = REGISTRY.register("gronckle_male_gronckle_iron_gui", () -> IForgeMenuType.create(GronckleMaleGronckleIronGUIMenu::new));
}
