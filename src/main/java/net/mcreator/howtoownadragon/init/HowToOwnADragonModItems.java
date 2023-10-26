
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.howtoownadragon.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.DoubleHighBlockItem;
import net.minecraft.world.item.BlockItem;

import net.mcreator.howtoownadragon.item.ValkasStaffItem;
import net.mcreator.howtoownadragon.item.SaddleRackItem;
import net.mcreator.howtoownadragon.item.NightFuryScaleItem;
import net.mcreator.howtoownadragon.item.NightFuryArmorItem;
import net.mcreator.howtoownadragon.item.LensDragonInfoItem;
import net.mcreator.howtoownadragon.item.GronckleSpawnEggItem;
import net.mcreator.howtoownadragon.item.GronckleScaleItem;
import net.mcreator.howtoownadragon.item.GronckleSaddleItem;
import net.mcreator.howtoownadragon.item.GronckleIronSwordItem;
import net.mcreator.howtoownadragon.item.GronckleIronShovelItem;
import net.mcreator.howtoownadragon.item.GronckleIronPickaxeItem;
import net.mcreator.howtoownadragon.item.GronckleIronItem;
import net.mcreator.howtoownadragon.item.GronckleIronHoeItem;
import net.mcreator.howtoownadragon.item.GronckleIronAxeItem;
import net.mcreator.howtoownadragon.item.GronckleEggItemItem;
import net.mcreator.howtoownadragon.item.GronckleAttackItem;
import net.mcreator.howtoownadragon.item.DragonSymbolItem;
import net.mcreator.howtoownadragon.item.DragonProofMetalItem;
import net.mcreator.howtoownadragon.item.DragonEyeItem;
import net.mcreator.howtoownadragon.item.DeepIronIngotItem;
import net.mcreator.howtoownadragon.HowToOwnADragonMod;

public class HowToOwnADragonModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, HowToOwnADragonMod.MODID);
	public static final RegistryObject<Item> PORTAL_BLOCK = block(HowToOwnADragonModBlocks.PORTAL_BLOCK);
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
	public static final RegistryObject<Item> REAPER_SPAWN_BLOCK = block(HowToOwnADragonModBlocks.REAPER_SPAWN_BLOCK);
	public static final RegistryObject<Item> LIMESTONE = block(HowToOwnADragonModBlocks.LIMESTONE);
	public static final RegistryObject<Item> LENS_DRAGON_INFO = REGISTRY.register("lens_dragon_info", () -> new LensDragonInfoItem());
	public static final RegistryObject<Item> GRONCKLE_ATTACK = REGISTRY.register("gronckle_attack", () -> new GronckleAttackItem());
	public static final RegistryObject<Item> GRONCKLE_SADDLE = REGISTRY.register("gronckle_saddle", () -> new GronckleSaddleItem());
	public static final RegistryObject<Item> SADDLE_RACK = REGISTRY.register("saddle_rack", () -> new SaddleRackItem());
	public static final RegistryObject<Item> PLAINS_GRASS_BLOCK = block(HowToOwnADragonModBlocks.PLAINS_GRASS_BLOCK);
	public static final RegistryObject<Item> GRONCKLE_IRON_HOE = REGISTRY.register("gronckle_iron_hoe", () -> new GronckleIronHoeItem());
	public static final RegistryObject<Item> INCUBATOR_1 = block(HowToOwnADragonModBlocks.INCUBATOR_1);
	public static final RegistryObject<Item> GRONCKLE_EGG_ITEM = REGISTRY.register("gronckle_egg_item", () -> new GronckleEggItemItem());
	public static final RegistryObject<Item> GRONCKLE_SPAWN_EGG = REGISTRY.register("gronckle_spawn_egg", () -> new GronckleSpawnEggItem());
	public static final RegistryObject<Item> VALKAS_STAFF = REGISTRY.register("valkas_staff", () -> new ValkasStaffItem());

	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}

	private static RegistryObject<Item> doubleBlock(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new DoubleHighBlockItem(block.get(), new Item.Properties()));
	}
}
