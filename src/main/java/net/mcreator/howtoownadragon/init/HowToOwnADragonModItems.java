
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
	public static final RegistryObject<Item> CUSTOM_BLACKSTONE = block(HowToOwnADragonModBlocks.CUSTOM_BLACKSTONE);

	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
