
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
import net.minecraft.world.item.BlockItem;

import net.mcreator.howtoownadragon.item.NightFuryScaleItem;
import net.mcreator.howtoownadragon.item.NightFuryArmorItem;
import net.mcreator.howtoownadragon.item.GronckleIronSwordItem;
import net.mcreator.howtoownadragon.item.GronckleIronShovelItem;
import net.mcreator.howtoownadragon.item.GronckleIronPickaxeItem;
import net.mcreator.howtoownadragon.item.GronckleIronItem;
import net.mcreator.howtoownadragon.item.GronckleIronAxeItem;
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

	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
