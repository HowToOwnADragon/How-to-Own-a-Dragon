
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.howtoownadragon.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.howtoownadragon.block.PortalBlockBlock;
import net.mcreator.howtoownadragon.block.DeepIronRodBlock;
import net.mcreator.howtoownadragon.block.DeepIronBlockBlock;
import net.mcreator.howtoownadragon.block.DarkStoneBlock;
import net.mcreator.howtoownadragon.HowToOwnADragonMod;

public class HowToOwnADragonModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, HowToOwnADragonMod.MODID);
	public static final RegistryObject<Block> PORTAL_BLOCK = REGISTRY.register("portal_block", () -> new PortalBlockBlock());
	public static final RegistryObject<Block> DARK_STONE = REGISTRY.register("dark_stone", () -> new DarkStoneBlock());
	public static final RegistryObject<Block> DEEP_IRON_BLOCK = REGISTRY.register("deep_iron_block", () -> new DeepIronBlockBlock());
	public static final RegistryObject<Block> DEEP_IRON_ROD = REGISTRY.register("deep_iron_rod", () -> new DeepIronRodBlock());
}
