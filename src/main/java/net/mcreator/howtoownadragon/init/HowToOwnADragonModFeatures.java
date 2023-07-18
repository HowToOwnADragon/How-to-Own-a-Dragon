
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.howtoownadragon.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;

import net.minecraft.world.level.levelgen.feature.Feature;

import net.mcreator.howtoownadragon.world.features.ReaperInsidePrototype2Feature;
import net.mcreator.howtoownadragon.world.features.EntranceinhwFeature;
import net.mcreator.howtoownadragon.world.features.EmptyReaperFeature;
import net.mcreator.howtoownadragon.HowToOwnADragonMod;

@Mod.EventBusSubscriber
public class HowToOwnADragonModFeatures {
	public static final DeferredRegister<Feature<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.FEATURES, HowToOwnADragonMod.MODID);
	public static final RegistryObject<Feature<?>> ENTRANCEINHW = REGISTRY.register("entranceinhw", EntranceinhwFeature::new);
	public static final RegistryObject<Feature<?>> REAPER_INSIDE_PROTOTYPE_2 = REGISTRY.register("reaper_inside_prototype_2", ReaperInsidePrototype2Feature::new);
	public static final RegistryObject<Feature<?>> EMPTY_REAPER = REGISTRY.register("empty_reaper", EmptyReaperFeature::new);
}
