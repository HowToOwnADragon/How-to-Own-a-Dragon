
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.howtoownadragon.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;

import net.minecraft.world.level.levelgen.feature.Feature;

import net.mcreator.howtoownadragon.world.features.EntranceInsideHiddenWorldFeature;
import net.mcreator.howtoownadragon.HowToOwnADragonMod;

@Mod.EventBusSubscriber
public class HowToOwnADragonModFeatures {
	public static final DeferredRegister<Feature<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.FEATURES, HowToOwnADragonMod.MODID);
	public static final RegistryObject<Feature<?>> ENTRANCE_INSIDE_HIDDEN_WORLD = REGISTRY.register("entrance_inside_hidden_world", EntranceInsideHiddenWorldFeature::new);
}
