package net.mcreator.howtoownadragon.init;

import net.mcreator.howtoownadragon.world.features.EmptyReaperFeature;
import net.mcreator.howtoownadragon.world.features.EntranceinhwFeature;
import net.mcreator.howtoownadragon.world.features.ReaperInsidePrototype2Feature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

@EventBusSubscriber
public class HowToOwnADragonModFeatures {
   public static final DeferredRegister<Feature<?>> REGISTRY;
   public static final RegistryObject<Feature<?>> ENTRANCEINHW;
   public static final RegistryObject<Feature<?>> REAPER_INSIDE_PROTOTYPE_2;
   public static final RegistryObject<Feature<?>> EMPTY_REAPER;

   static {
      REGISTRY = DeferredRegister.create(ForgeRegistries.FEATURES, "how_to_own_a_dragon");
      ENTRANCEINHW = REGISTRY.register("entranceinhw", EntranceinhwFeature::new);
      REAPER_INSIDE_PROTOTYPE_2 = REGISTRY.register("reaper_inside_prototype_2", ReaperInsidePrototype2Feature::new);
      EMPTY_REAPER = REGISTRY.register("empty_reaper", EmptyReaperFeature::new);
   }
}
