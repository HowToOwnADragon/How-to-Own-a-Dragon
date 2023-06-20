
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.howtoownadragon.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.howtoownadragon.block.PortalBlockBlock;
import net.mcreator.howtoownadragon.HowToOwnADragonMod;

public class HowToOwnADragonModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, HowToOwnADragonMod.MODID);
	public static final RegistryObject<Block> PORTAL_BLOCK = REGISTRY.register("portal_block", () -> new PortalBlockBlock());
}
