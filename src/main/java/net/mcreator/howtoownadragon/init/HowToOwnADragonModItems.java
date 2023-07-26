
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.howtoownadragon.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.ForgeSpawnEggItem;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.DoubleHighBlockItem;
import net.minecraft.world.item.BlockItem;

import net.mcreator.howtoownadragon.item.NightFuryScaleItem;
import net.mcreator.howtoownadragon.item.NightFuryArmorItem;
import net.mcreator.howtoownadragon.item.GronckleSpawningEggItem;
import net.mcreator.howtoownadragon.item.GronckleScaleItem;
import net.mcreator.howtoownadragon.item.GronckleIronSwordItem;
import net.mcreator.howtoownadragon.item.GronckleIronShovelItem;
import net.mcreator.howtoownadragon.item.GronckleIronPickaxeItem;
import net.mcreator.howtoownadragon.item.GronckleIronItem;
import net.mcreator.howtoownadragon.item.GronckleIronAxeItem;
import net.mcreator.howtoownadragon.item.DragonSymbolItem;
import net.mcreator.howtoownadragon.item.DragonProofMetalItem;
import net.mcreator.howtoownadragon.item.DragonEyeItem;
import net.mcreator.howtoownadragon.item.DeepIronIngotItem;
import net.mcreator.howtoownadragon.HowToOwnADragonMod;

public class HowToOwnADragonModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, HowToOwnADragonMod.MODID);
	public static final RegistryObject<Item> PORTAL_BLOCK = block(HowToOwnADragonModBlocks.PORTAL_BLOCK);
	public static final RegistryObject<Item> NIGHT_FURY_SPAWN_EGG = REGISTRY.register("night_fury_spawn_egg", () -> new ForgeSpawnEggItem(HowToOwnADragonModEntities.NIGHT_FURY, -16777216, -13421773, new Item.Properties()));
	public static final RegistryObject<Item> NIGHT_FURY_SCALE = REGISTRY.register("night_fury_scale", () -> new NightFuryScaleItem());
	public static final RegistryObject<Item> NIGHT_FURY_ARMOR_HELMET = REGISTRY.register("night_fury_armor_helmet", () -> new NightFuryArmorItem.Helmet());
	public static final RegistryObject<Item> NIGHT_FURY_ARMOR_CHESTPLATE = REGISTRY.register("night_fury_armor_chestplate", () -> new NightFuryArmorItem.Chestplate());
	public static final RegistryObject<Item> NIGHT_FURY_ARMOR_LEGGINGS = REGISTRY.register("night_fury_armor_leggings", () -> new NightFuryArmorItem.Leggings());
	public static final RegistryObject<Item> NIGHT_FURY_ARMOR_BOOTS = REGISTRY.register("night_fury_armor_boots", () -> new NightFuryArmorItem.Boots());
	public static final RegistryObject<Item> GRONCKLE_IRON = REGISTRY.register("gronckle_iron", () -> new GronckleIronItem());
	public static final RegistryObject<Item> GRONCKLE_IRON_SWORD = REGISTRY.register("gronckle_iron_sword", () -> new GronckleIronSwordItem());
	public static final RegistryObject<Item> GRONCKLE_IRON_PICKAXE = REGISTRY.register("gronckle_iron_pickaxe", () -> new GronckleIronPickaxeItem());
	public static final RegistryObject<Item> GRONCKLE_IRON_SHOVEL = REGISTRY.register("gronckle_iron_shovel", () -> new GronckleIronShovelItem());
	public static final RegistryObject<Item> GRONCKLE_IRON_AXE = REGISTRY.register("gronckle_iron_axe", () -> new GronckleIronAxeItem());
	public static final RegistryObject<Item> DARK_STONE = block(HowToOwnADragonModBlocks.DARK_STONE);
	public static final RegistryObject<Item> DEEP_IRON_BLOCK = block(HowToOwnADragonModBlocks.DEEP_IRON_BLOCK);
	public static final RegistryObject<Item> DEEP_IRON_ROD = block(HowToOwnADragonModBlocks.DEEP_IRON_ROD);
	public static final RegistryObject<Item> DEEP_IRON_STAIRS = block(HowToOwnADragonModBlocks.DEEP_IRON_STAIRS);
	public static final RegistryObject<Item> DEEP_IRON_SLAB = block(HowToOwnADragonModBlocks.DEEP_IRON_SLAB);
	public static final RegistryObject<Item> DEEP_IRON_DOOR = doubleBlock(HowToOwnADragonModBlocks.DEEP_IRON_DOOR);
	public static final RegistryObject<Item> DEEP_IRON_INGOT = REGISTRY.register("deep_iron_ingot", () -> new DeepIronIngotItem());
	public static final RegistryObject<Item> DRAGON_SYMBOL = REGISTRY.register("dragon_symbol", () -> new DragonSymbolItem());
	public static final RegistryObject<Item> GRONCKLE_SCALE = REGISTRY.register("gronckle_scale", () -> new GronckleScaleItem());
	public static final RegistryObject<Item> DEEP_IRON_WALL = block(HowToOwnADragonModBlocks.DEEP_IRON_WALL);
	public static final RegistryObject<Item> REAPER_PORTAL = block(HowToOwnADragonModBlocks.REAPER_PORTAL);
	public static final RegistryObject<Item> REAPER_BEAR_TRAP = block(HowToOwnADragonModBlocks.REAPER_BEAR_TRAP);
	public static final RegistryObject<Item> REAPER_ARROW_TRAP = block(HowToOwnADragonModBlocks.REAPER_ARROW_TRAP);
	public static final RegistryObject<Item> SLOWING_BLOCK = block(HowToOwnADragonModBlocks.SLOWING_BLOCK);
	public static final RegistryObject<Item> DRAGON_EYE = REGISTRY.register("dragon_eye", () -> new DragonEyeItem());
	public static final RegistryObject<Item> DRAGON_PROOF_METAL = REGISTRY.register("dragon_proof_metal", () -> new DragonProofMetalItem());
	public static final RegistryObject<Item> DRAGON_PROOF_METAL_BARS = block(HowToOwnADragonModBlocks.DRAGON_PROOF_METAL_BARS);
	public static final RegistryObject<Item> REAPER_SPIKE_TRAP = block(HowToOwnADragonModBlocks.REAPER_SPIKE_TRAP);
	public static final RegistryObject<Item> RUSTY_DRAGON_PROOF_METAL_BARS = block(HowToOwnADragonModBlocks.RUSTY_DRAGON_PROOF_METAL_BARS);
	public static final RegistryObject<Item> GRONCKLE_SPAWNING_EGG = REGISTRY.register("gronckle_spawning_egg", () -> new GronckleSpawningEggItem());
	public static final RegistryObject<Item> REAPER_SPAWN_BLOCK = block(HowToOwnADragonModBlocks.REAPER_SPAWN_BLOCK);
	public static final RegistryObject<Item> MEATLUGS_EGG = block(HowToOwnADragonModBlocks.MEATLUGS_EGG);
	public static final RegistryObject<Item> BLUE_YELLOW_GRONCKLE_EGG = block(HowToOwnADragonModBlocks.BLUE_YELLOW_GRONCKLE_EGG);
	public static final RegistryObject<Item> ORANGE_RED_GRONCKLE_EGG = block(HowToOwnADragonModBlocks.ORANGE_RED_GRONCKLE_EGG);
	public static final RegistryObject<Item> PINK_GRONCKLE_EGG = block(HowToOwnADragonModBlocks.PINK_GRONCKLE_EGG);
	public static final RegistryObject<Item> MEATLUG_MALE_SPAWN_EGG = REGISTRY.register("meatlug_male_spawn_egg", () -> new ForgeSpawnEggItem(HowToOwnADragonModEntities.MEATLUG_MALE, -6999808, -7986432, new Item.Properties()));
	public static final RegistryObject<Item> MEATLUG_FEMALE_SPAWN_EGG = REGISTRY.register("meatlug_female_spawn_egg", () -> new ForgeSpawnEggItem(HowToOwnADragonModEntities.MEATLUG_FEMALE, -6999808, -7986432, new Item.Properties()));
	public static final RegistryObject<Item> GRONCKLE_BLUE_YELLOW_MALE_SPAWN_EGG = REGISTRY.register("gronckle_blue_yellow_male_spawn_egg",
			() -> new ForgeSpawnEggItem(HowToOwnADragonModEntities.GRONCKLE_BLUE_YELLOW_MALE, -6999808, -7986432, new Item.Properties()));
	public static final RegistryObject<Item> GRONCKLE_BLUE_YELLOW_FEMALE_SPAWN_EGG = REGISTRY.register("gronckle_blue_yellow_female_spawn_egg",
			() -> new ForgeSpawnEggItem(HowToOwnADragonModEntities.GRONCKLE_BLUE_YELLOW_FEMALE, -6999808, -7986432, new Item.Properties()));
	public static final RegistryObject<Item> GRONCKLE_PINK_MALE_SPAWN_EGG = REGISTRY.register("gronckle_pink_male_spawn_egg", () -> new ForgeSpawnEggItem(HowToOwnADragonModEntities.GRONCKLE_PINK_MALE, -6999808, -7986432, new Item.Properties()));
	public static final RegistryObject<Item> GRONCKLE_PINK_FEMALE_SPAWN_EGG = REGISTRY.register("gronckle_pink_female_spawn_egg",
			() -> new ForgeSpawnEggItem(HowToOwnADragonModEntities.GRONCKLE_PINK_FEMALE, -6999808, -7986432, new Item.Properties()));
	public static final RegistryObject<Item> GRONCKLE_ORANGE_RED_MALE_SPAWN_EGG = REGISTRY.register("gronckle_orange_red_male_spawn_egg",
			() -> new ForgeSpawnEggItem(HowToOwnADragonModEntities.GRONCKLE_ORANGE_RED_MALE, -6999808, -7986432, new Item.Properties()));
	public static final RegistryObject<Item> GRONCKLE_ORANGE_RED_FEMALE_SPAWN_EGG = REGISTRY.register("gronckle_orange_red_female_spawn_egg",
			() -> new ForgeSpawnEggItem(HowToOwnADragonModEntities.GRONCKLE_ORANGE_RED_FEMALE, -6999808, -7986432, new Item.Properties()));
	public static final RegistryObject<Item> ADOLESCENT_MEATLUG_MALE_SPAWN_EGG = REGISTRY.register("adolescent_meatlug_male_spawn_egg",
			() -> new ForgeSpawnEggItem(HowToOwnADragonModEntities.ADOLESCENT_MEATLUG_MALE, -6999808, -7986432, new Item.Properties()));
	public static final RegistryObject<Item> ADOLESCENT_MEATLUG_FEMALE_SPAWN_EGG = REGISTRY.register("adolescent_meatlug_female_spawn_egg",
			() -> new ForgeSpawnEggItem(HowToOwnADragonModEntities.ADOLESCENT_MEATLUG_FEMALE, -6999808, -7986432, new Item.Properties()));
	public static final RegistryObject<Item> ADOLESCENT_GRONCKLE_BLUE_YELLOW_MALE_SPAWN_EGG = REGISTRY.register("adolescent_gronckle_blue_yellow_male_spawn_egg",
			() -> new ForgeSpawnEggItem(HowToOwnADragonModEntities.ADOLESCENT_GRONCKLE_BLUE_YELLOW_MALE, -6999808, -7986432, new Item.Properties()));
	public static final RegistryObject<Item> ADOLESCENT_GRONCKLE_BLUE_YELLOW_FEMALE_SPAWN_EGG = REGISTRY.register("adolescent_gronckle_blue_yellow_female_spawn_egg",
			() -> new ForgeSpawnEggItem(HowToOwnADragonModEntities.ADOLESCENT_GRONCKLE_BLUE_YELLOW_FEMALE, -6999808, -7986432, new Item.Properties()));
	public static final RegistryObject<Item> ADOLESCENT_GRONCKLE_PINK_MALE_SPAWN_EGG = REGISTRY.register("adolescent_gronckle_pink_male_spawn_egg",
			() -> new ForgeSpawnEggItem(HowToOwnADragonModEntities.ADOLESCENT_GRONCKLE_PINK_MALE, -6999808, -7986432, new Item.Properties()));
	public static final RegistryObject<Item> ADOLESCENT_GRONCKLE_PINK_FEMALE_SPAWN_EGG = REGISTRY.register("adolescent_gronckle_pink_female_spawn_egg",
			() -> new ForgeSpawnEggItem(HowToOwnADragonModEntities.ADOLESCENT_GRONCKLE_PINK_FEMALE, -6999808, -7986432, new Item.Properties()));
	public static final RegistryObject<Item> ADOLESCENT_GRONCKLE_ORANGE_RED_MALE_SPAWN_EGG = REGISTRY.register("adolescent_gronckle_orange_red_male_spawn_egg",
			() -> new ForgeSpawnEggItem(HowToOwnADragonModEntities.ADOLESCENT_GRONCKLE_ORANGE_RED_MALE, -6999808, -7986432, new Item.Properties()));
	public static final RegistryObject<Item> ADOLESCENT_GRONCKLE_ORANGE_RED_FEMALE_SPAWN_EGG = REGISTRY.register("adolescent_gronckle_orange_red_female_spawn_egg",
			() -> new ForgeSpawnEggItem(HowToOwnADragonModEntities.ADOLESCENT_GRONCKLE_ORANGE_RED_FEMALE, -6999808, -7986432, new Item.Properties()));
	public static final RegistryObject<Item> JUVENILE_MEATLUG_MALE_SPAWN_EGG = REGISTRY.register("juvenile_meatlug_male_spawn_egg",
			() -> new ForgeSpawnEggItem(HowToOwnADragonModEntities.JUVENILE_MEATLUG_MALE, -6999808, -7986432, new Item.Properties()));
	public static final RegistryObject<Item> JUVENILE_MEATLUG_FEMALE_SPAWN_EGG = REGISTRY.register("juvenile_meatlug_female_spawn_egg",
			() -> new ForgeSpawnEggItem(HowToOwnADragonModEntities.JUVENILE_MEATLUG_FEMALE, -6999808, -7986432, new Item.Properties()));
	public static final RegistryObject<Item> JUVENILE_GRONCKLE_BLUE_YELLOW_MALE_SPAWN_EGG = REGISTRY.register("juvenile_gronckle_blue_yellow_male_spawn_egg",
			() -> new ForgeSpawnEggItem(HowToOwnADragonModEntities.JUVENILE_GRONCKLE_BLUE_YELLOW_MALE, -6999808, -7986432, new Item.Properties()));
	public static final RegistryObject<Item> JUVENILE_GRONCKLE_BLUE_YELLOW_FEMALE_SPAWN_EGG = REGISTRY.register("juvenile_gronckle_blue_yellow_female_spawn_egg",
			() -> new ForgeSpawnEggItem(HowToOwnADragonModEntities.JUVENILE_GRONCKLE_BLUE_YELLOW_FEMALE, -6999808, -7986432, new Item.Properties()));
	public static final RegistryObject<Item> JUVENILE_GRONCKLE_PINK_MALE_SPAWN_EGG = REGISTRY.register("juvenile_gronckle_pink_male_spawn_egg",
			() -> new ForgeSpawnEggItem(HowToOwnADragonModEntities.JUVENILE_GRONCKLE_PINK_MALE, -6999808, -7986432, new Item.Properties()));
	public static final RegistryObject<Item> JUVENILE_GRONCKLE_PINK_FEMALE_SPAWN_EGG = REGISTRY.register("juvenile_gronckle_pink_female_spawn_egg",
			() -> new ForgeSpawnEggItem(HowToOwnADragonModEntities.JUVENILE_GRONCKLE_PINK_FEMALE, -6999808, -7986432, new Item.Properties()));
	public static final RegistryObject<Item> JUVENILE_GRONCKLE_ORANGE_RED_MALE_SPAWN_EGG = REGISTRY.register("juvenile_gronckle_orange_red_male_spawn_egg",
			() -> new ForgeSpawnEggItem(HowToOwnADragonModEntities.JUVENILE_GRONCKLE_ORANGE_RED_MALE, -6999808, -7986432, new Item.Properties()));
	public static final RegistryObject<Item> JUVENILE_GRONCKLE_ORANGE_RED_FEMALE_SPAWN_EGG = REGISTRY.register("juvenile_gronckle_orange_red_female_spawn_egg",
			() -> new ForgeSpawnEggItem(HowToOwnADragonModEntities.JUVENILE_GRONCKLE_ORANGE_RED_FEMALE, -6999808, -7986432, new Item.Properties()));
	public static final RegistryObject<Item> BABY_MEATLUG_MALE_SPAWN_EGG = REGISTRY.register("baby_meatlug_male_spawn_egg", () -> new ForgeSpawnEggItem(HowToOwnADragonModEntities.BABY_MEATLUG_MALE, -6999808, -7986432, new Item.Properties()));
	public static final RegistryObject<Item> BABY_MEATLUG_FEMALE_SPAWN_EGG = REGISTRY.register("baby_meatlug_female_spawn_egg", () -> new ForgeSpawnEggItem(HowToOwnADragonModEntities.BABY_MEATLUG_FEMALE, -6999808, -7986432, new Item.Properties()));
	public static final RegistryObject<Item> BABY_GRONCKLE_BLUE_YELLOW_MALE_SPAWN_EGG = REGISTRY.register("baby_gronckle_blue_yellow_male_spawn_egg",
			() -> new ForgeSpawnEggItem(HowToOwnADragonModEntities.BABY_GRONCKLE_BLUE_YELLOW_MALE, -6999808, -7986432, new Item.Properties()));
	public static final RegistryObject<Item> BABY_GRONCKLE_BLUE_YELLOW_FEMALE_SPAWN_EGG = REGISTRY.register("baby_gronckle_blue_yellow_female_spawn_egg",
			() -> new ForgeSpawnEggItem(HowToOwnADragonModEntities.BABY_GRONCKLE_BLUE_YELLOW_FEMALE, -6999808, -7986432, new Item.Properties()));
	public static final RegistryObject<Item> BABY_GRONCKLE_PINK_MALE_SPAWN_EGG = REGISTRY.register("baby_gronckle_pink_male_spawn_egg",
			() -> new ForgeSpawnEggItem(HowToOwnADragonModEntities.BABY_GRONCKLE_PINK_MALE, -6999808, -7986432, new Item.Properties()));
	public static final RegistryObject<Item> BABY_GRONCKLE_PINK_FEMALE_SPAWN_EGG = REGISTRY.register("baby_gronckle_pink_female_spawn_egg",
			() -> new ForgeSpawnEggItem(HowToOwnADragonModEntities.BABY_GRONCKLE_PINK_FEMALE, -6999808, -7986432, new Item.Properties()));
	public static final RegistryObject<Item> BABY_GRONCKLE_ORANGE_RED_MALE_SPAWN_EGG = REGISTRY.register("baby_gronckle_orange_red_male_spawn_egg",
			() -> new ForgeSpawnEggItem(HowToOwnADragonModEntities.BABY_GRONCKLE_ORANGE_RED_MALE, -6999808, -7986432, new Item.Properties()));
	public static final RegistryObject<Item> BABY_GRONCKLE_ORANGE_RED_FEMALE_SPAWN_EGG = REGISTRY.register("baby_gronckle_orange_red_female_spawn_egg",
			() -> new ForgeSpawnEggItem(HowToOwnADragonModEntities.BABY_GRONCKLE_ORANGE_RED_FEMALE, -6999808, -7986432, new Item.Properties()));
	public static final RegistryObject<Item> READY_TO_HATCH_MEATLUG_EGG = block(HowToOwnADragonModBlocks.READY_TO_HATCH_MEATLUG_EGG);
	public static final RegistryObject<Item> READY_TO_HATCH_BLUE_YELLOW_GRONCKLE_EGG = block(HowToOwnADragonModBlocks.READY_TO_HATCH_BLUE_YELLOW_GRONCKLE_EGG);
	public static final RegistryObject<Item> READY_TO_HATCH_ORANGE_RED_GRONCKLE_EGG = block(HowToOwnADragonModBlocks.READY_TO_HATCH_ORANGE_RED_GRONCKLE_EGG);
	public static final RegistryObject<Item> READY_TO_HATCH_PINK_GRONCKLE_EGG = block(HowToOwnADragonModBlocks.READY_TO_HATCH_PINK_GRONCKLE_EGG);
	public static final RegistryObject<Item> INCUBATOR = block(HowToOwnADragonModBlocks.INCUBATOR);
	public static final RegistryObject<Item> LIMESTONE = block(HowToOwnADragonModBlocks.LIMESTONE);

	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}

	private static RegistryObject<Item> doubleBlock(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new DoubleHighBlockItem(block.get(), new Item.Properties()));
	}
}
