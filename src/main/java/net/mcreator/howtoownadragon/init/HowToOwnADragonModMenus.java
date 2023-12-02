
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.howtoownadragon.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.extensions.IForgeMenuType;

import net.minecraft.world.inventory.MenuType;

import net.mcreator.howtoownadragon.world.inventory.VanillaTabGroupsGUIMenu;
import net.mcreator.howtoownadragon.world.inventory.ProgressiveAchievementsMenu;
import net.mcreator.howtoownadragon.world.inventory.NothingsHereMenu;
import net.mcreator.howtoownadragon.world.inventory.NotGrownMaleNadderGUIMenu;
import net.mcreator.howtoownadragon.world.inventory.NotGrownMaleGronckleGUIMenu;
import net.mcreator.howtoownadragon.world.inventory.NotGrownFemaleNadderGUIMenu;
import net.mcreator.howtoownadragon.world.inventory.NotGrownFemaleGronckleGUIMenu;
import net.mcreator.howtoownadragon.world.inventory.NetherTabGroupGUIMenu;
import net.mcreator.howtoownadragon.world.inventory.NetherBiomesGUIMenu;
import net.mcreator.howtoownadragon.world.inventory.NOTFINISHEDMenu;
import net.mcreator.howtoownadragon.world.inventory.MaleTTGUIMenu;
import net.mcreator.howtoownadragon.world.inventory.MaleNadderGUIMenu;
import net.mcreator.howtoownadragon.world.inventory.MaleGronckleGUIMenu;
import net.mcreator.howtoownadragon.world.inventory.MainPageInfoGronckleMenu;
import net.mcreator.howtoownadragon.world.inventory.MHThirdPageGUIMenu;
import net.mcreator.howtoownadragon.world.inventory.MHSixthPageGUIMenu;
import net.mcreator.howtoownadragon.world.inventory.MHSecondPageGUIMenu;
import net.mcreator.howtoownadragon.world.inventory.MHFourthPageGUIMenu;
import net.mcreator.howtoownadragon.world.inventory.MHFirstPageGUIMenu;
import net.mcreator.howtoownadragon.world.inventory.MHFifthPageGUIMenu;
import net.mcreator.howtoownadragon.world.inventory.LoveIsInTheAirMenu;
import net.mcreator.howtoownadragon.world.inventory.Incubator1GUIMenu;
import net.mcreator.howtoownadragon.world.inventory.HusbandryTabGroupGUIMenu;
import net.mcreator.howtoownadragon.world.inventory.HTOADAdvancementsMenu;
import net.mcreator.howtoownadragon.world.inventory.GronkleIronGUIMaleMenu;
import net.mcreator.howtoownadragon.world.inventory.GronckleIronGUIFemaleMenu;
import net.mcreator.howtoownadragon.world.inventory.GottaCatchEmAllMenu;
import net.mcreator.howtoownadragon.world.inventory.GenericOrAdvancedConfigMenu;
import net.mcreator.howtoownadragon.world.inventory.FoodPage1InfoGronckleMenu;
import net.mcreator.howtoownadragon.world.inventory.FemaleTTGUIMenu;
import net.mcreator.howtoownadragon.world.inventory.FemaleNadderGUIMenu;
import net.mcreator.howtoownadragon.world.inventory.FemaleGronckleGUIMenu;
import net.mcreator.howtoownadragon.world.inventory.DragonEyeInputMenu;
import net.mcreator.howtoownadragon.world.inventory.CongratsGUIMenu;
import net.mcreator.howtoownadragon.world.inventory.AdventureTabGroupGUIMenu;
import net.mcreator.howtoownadragon.world.inventory.ATThirdPageGUIMenu;
import net.mcreator.howtoownadragon.world.inventory.ATSixthPageGUIMenu;
import net.mcreator.howtoownadragon.world.inventory.ATSecondPageGUIMenu;
import net.mcreator.howtoownadragon.world.inventory.ATFourthPageGUIMenu;
import net.mcreator.howtoownadragon.world.inventory.ATFirstPageGUIMenu;
import net.mcreator.howtoownadragon.world.inventory.ATFifthPageGUIMenu;
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
	public static final RegistryObject<MenuType<NotGrownMaleGronckleGUIMenu>> NOT_GROWN_MALE_GRONCKLE_GUI = REGISTRY.register("not_grown_male_gronckle_gui", () -> IForgeMenuType.create(NotGrownMaleGronckleGUIMenu::new));
	public static final RegistryObject<MenuType<NotGrownFemaleGronckleGUIMenu>> NOT_GROWN_FEMALE_GRONCKLE_GUI = REGISTRY.register("not_grown_female_gronckle_gui", () -> IForgeMenuType.create(NotGrownFemaleGronckleGUIMenu::new));
	public static final RegistryObject<MenuType<FoodPage1InfoGronckleMenu>> FOOD_PAGE_1_INFO_GRONCKLE = REGISTRY.register("food_page_1_info_gronckle", () -> IForgeMenuType.create(FoodPage1InfoGronckleMenu::new));
	public static final RegistryObject<MenuType<MaleTTGUIMenu>> MALE_TTGUI = REGISTRY.register("male_ttgui", () -> IForgeMenuType.create(MaleTTGUIMenu::new));
	public static final RegistryObject<MenuType<FemaleTTGUIMenu>> FEMALE_TTGUI = REGISTRY.register("female_ttgui", () -> IForgeMenuType.create(FemaleTTGUIMenu::new));
	public static final RegistryObject<MenuType<FemaleNadderGUIMenu>> FEMALE_NADDER_GUI = REGISTRY.register("female_nadder_gui", () -> IForgeMenuType.create(FemaleNadderGUIMenu::new));
	public static final RegistryObject<MenuType<MaleNadderGUIMenu>> MALE_NADDER_GUI = REGISTRY.register("male_nadder_gui", () -> IForgeMenuType.create(MaleNadderGUIMenu::new));
	public static final RegistryObject<MenuType<NotGrownFemaleNadderGUIMenu>> NOT_GROWN_FEMALE_NADDER_GUI = REGISTRY.register("not_grown_female_nadder_gui", () -> IForgeMenuType.create(NotGrownFemaleNadderGUIMenu::new));
	public static final RegistryObject<MenuType<NotGrownMaleNadderGUIMenu>> NOT_GROWN_MALE_NADDER_GUI = REGISTRY.register("not_grown_male_nadder_gui", () -> IForgeMenuType.create(NotGrownMaleNadderGUIMenu::new));
	public static final RegistryObject<MenuType<GenericOrAdvancedConfigMenu>> GENERIC_OR_ADVANCED_CONFIG = REGISTRY.register("generic_or_advanced_config", () -> IForgeMenuType.create(GenericOrAdvancedConfigMenu::new));
	public static final RegistryObject<MenuType<ProgressiveAchievementsMenu>> PROGRESSIVE_ACHIEVEMENTS = REGISTRY.register("progressive_achievements", () -> IForgeMenuType.create(ProgressiveAchievementsMenu::new));
	public static final RegistryObject<MenuType<HTOADAdvancementsMenu>> HTOAD_ADVANCEMENTS = REGISTRY.register("htoad_advancements", () -> IForgeMenuType.create(HTOADAdvancementsMenu::new));
	public static final RegistryObject<MenuType<GottaCatchEmAllMenu>> GOTTA_CATCH_EM_ALL = REGISTRY.register("gotta_catch_em_all", () -> IForgeMenuType.create(GottaCatchEmAllMenu::new));
	public static final RegistryObject<MenuType<CongratsGUIMenu>> CONGRATS_GUI = REGISTRY.register("congrats_gui", () -> IForgeMenuType.create(CongratsGUIMenu::new));
	public static final RegistryObject<MenuType<LoveIsInTheAirMenu>> LOVE_IS_IN_THE_AIR = REGISTRY.register("love_is_in_the_air", () -> IForgeMenuType.create(LoveIsInTheAirMenu::new));
	public static final RegistryObject<MenuType<VanillaTabGroupsGUIMenu>> VANILLA_TAB_GROUPS_GUI = REGISTRY.register("vanilla_tab_groups_gui", () -> IForgeMenuType.create(VanillaTabGroupsGUIMenu::new));
	public static final RegistryObject<MenuType<NothingsHereMenu>> NOTHINGS_HERE = REGISTRY.register("nothings_here", () -> IForgeMenuType.create(NothingsHereMenu::new));
	public static final RegistryObject<MenuType<HusbandryTabGroupGUIMenu>> HUSBANDRY_TAB_GROUP_GUI = REGISTRY.register("husbandry_tab_group_gui", () -> IForgeMenuType.create(HusbandryTabGroupGUIMenu::new));
	public static final RegistryObject<MenuType<AdventureTabGroupGUIMenu>> ADVENTURE_TAB_GROUP_GUI = REGISTRY.register("adventure_tab_group_gui", () -> IForgeMenuType.create(AdventureTabGroupGUIMenu::new));
	public static final RegistryObject<MenuType<NetherTabGroupGUIMenu>> NETHER_TAB_GROUP_GUI = REGISTRY.register("nether_tab_group_gui", () -> IForgeMenuType.create(NetherTabGroupGUIMenu::new));
	public static final RegistryObject<MenuType<NOTFINISHEDMenu>> NOTFINISHED = REGISTRY.register("notfinished", () -> IForgeMenuType.create(NOTFINISHEDMenu::new));
	public static final RegistryObject<MenuType<NetherBiomesGUIMenu>> NETHER_BIOMES_GUI = REGISTRY.register("nether_biomes_gui", () -> IForgeMenuType.create(NetherBiomesGUIMenu::new));
	public static final RegistryObject<MenuType<MHFirstPageGUIMenu>> MH_FIRST_PAGE_GUI = REGISTRY.register("mh_first_page_gui", () -> IForgeMenuType.create(MHFirstPageGUIMenu::new));
	public static final RegistryObject<MenuType<MHSecondPageGUIMenu>> MH_SECOND_PAGE_GUI = REGISTRY.register("mh_second_page_gui", () -> IForgeMenuType.create(MHSecondPageGUIMenu::new));
	public static final RegistryObject<MenuType<MHThirdPageGUIMenu>> MH_THIRD_PAGE_GUI = REGISTRY.register("mh_third_page_gui", () -> IForgeMenuType.create(MHThirdPageGUIMenu::new));
	public static final RegistryObject<MenuType<MHFourthPageGUIMenu>> MH_FOURTH_PAGE_GUI = REGISTRY.register("mh_fourth_page_gui", () -> IForgeMenuType.create(MHFourthPageGUIMenu::new));
	public static final RegistryObject<MenuType<MHFifthPageGUIMenu>> MH_FIFTH_PAGE_GUI = REGISTRY.register("mh_fifth_page_gui", () -> IForgeMenuType.create(MHFifthPageGUIMenu::new));
	public static final RegistryObject<MenuType<MHSixthPageGUIMenu>> MH_SIXTH_PAGE_GUI = REGISTRY.register("mh_sixth_page_gui", () -> IForgeMenuType.create(MHSixthPageGUIMenu::new));
	public static final RegistryObject<MenuType<ATFirstPageGUIMenu>> AT_FIRST_PAGE_GUI = REGISTRY.register("at_first_page_gui", () -> IForgeMenuType.create(ATFirstPageGUIMenu::new));
	public static final RegistryObject<MenuType<ATSecondPageGUIMenu>> AT_SECOND_PAGE_GUI = REGISTRY.register("at_second_page_gui", () -> IForgeMenuType.create(ATSecondPageGUIMenu::new));
	public static final RegistryObject<MenuType<ATThirdPageGUIMenu>> AT_THIRD_PAGE_GUI = REGISTRY.register("at_third_page_gui", () -> IForgeMenuType.create(ATThirdPageGUIMenu::new));
	public static final RegistryObject<MenuType<ATFourthPageGUIMenu>> AT_FOURTH_PAGE_GUI = REGISTRY.register("at_fourth_page_gui", () -> IForgeMenuType.create(ATFourthPageGUIMenu::new));
	public static final RegistryObject<MenuType<ATFifthPageGUIMenu>> AT_FIFTH_PAGE_GUI = REGISTRY.register("at_fifth_page_gui", () -> IForgeMenuType.create(ATFifthPageGUIMenu::new));
	public static final RegistryObject<MenuType<ATSixthPageGUIMenu>> AT_SIXTH_PAGE_GUI = REGISTRY.register("at_sixth_page_gui", () -> IForgeMenuType.create(ATSixthPageGUIMenu::new));
}
