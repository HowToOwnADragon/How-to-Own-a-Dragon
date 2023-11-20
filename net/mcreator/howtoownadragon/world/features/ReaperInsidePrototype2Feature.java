package net.mcreator.howtoownadragon.world.features;

import java.util.Set;
import net.minecraft.core.BlockPos;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Mirror;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.world.level.levelgen.Heightmap.Types;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.FeaturePlaceContext;
import net.minecraft.world.level.levelgen.feature.configurations.NoneFeatureConfiguration;
import net.minecraft.world.level.levelgen.structure.templatesystem.BlockIgnoreProcessor;
import net.minecraft.world.level.levelgen.structure.templatesystem.StructurePlaceSettings;
import net.minecraft.world.level.levelgen.structure.templatesystem.StructureTemplate;

public class ReaperInsidePrototype2Feature extends Feature<NoneFeatureConfiguration> {
   private final Set<ResourceKey<Level>> generate_dimensions;
   private StructureTemplate template;

   public ReaperInsidePrototype2Feature() {
      super(NoneFeatureConfiguration.f_67815_);
      this.generate_dimensions = Set.of(ResourceKey.m_135785_(Registries.f_256858_, new ResourceLocation("how_to_own_a_dragon:the_reaper")));
      this.template = null;
   }

   public boolean m_142674_(FeaturePlaceContext<NoneFeatureConfiguration> context) {
      if (!this.generate_dimensions.contains(context.m_159774_().m_6018_().m_46472_())) {
         return false;
      } else {
         if (this.template == null) {
            this.template = context.m_159774_().m_6018_().m_215082_().m_230359_(new ResourceLocation("how_to_own_a_dragon", "reaper_inside_prototype_5"));
         }

         if (this.template == null) {
            return false;
         } else {
            boolean anyPlaced = false;
            if (context.m_225041_().m_188503_(1000000) + 1 <= 1) {
               int count = context.m_225041_().m_188503_(1) + 1;

               for(int a = 0; a < count; ++a) {
                  int i = context.m_159777_().m_123341_() + context.m_225041_().m_188503_(16);
                  int k = context.m_159777_().m_123343_() + context.m_225041_().m_188503_(16);
                  int j = context.m_159774_().m_6924_(Types.OCEAN_FLOOR_WG, i, k) - 1;
                  BlockPos spawnTo = new BlockPos(i + 0, j + 0, k + 0);
                  if (this.template.m_230328_(context.m_159774_(), spawnTo, spawnTo, (new StructurePlaceSettings()).m_74377_(Mirror.NONE).m_74379_(Rotation.NONE).m_230324_(context.m_225041_()).m_74383_(BlockIgnoreProcessor.f_74046_).m_74392_(false), context.m_225041_(), 2)) {
                     anyPlaced = true;
                  }
               }
            }

            return anyPlaced;
         }
      }
   }
}
