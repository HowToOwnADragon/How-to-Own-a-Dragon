package net.mcreator.howtoownadragon.world.features;

import java.util.Set;
import net.mcreator.howtoownadragon.procedures.EmptyReaperOnStructureInstanceGeneratedProcedure;
import net.minecraft.core.BlockPos;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.WorldGenLevel;
import net.minecraft.world.level.block.Mirror;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.world.level.levelgen.Heightmap.Types;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.FeaturePlaceContext;
import net.minecraft.world.level.levelgen.feature.configurations.NoneFeatureConfiguration;
import net.minecraft.world.level.levelgen.structure.templatesystem.BlockIgnoreProcessor;
import net.minecraft.world.level.levelgen.structure.templatesystem.StructurePlaceSettings;
import net.minecraft.world.level.levelgen.structure.templatesystem.StructureTemplate;

public class EmptyReaperFeature extends Feature<NoneFeatureConfiguration> {
   private final Set<ResourceKey<Level>> generate_dimensions;
   private StructureTemplate template;

   public EmptyReaperFeature() {
      super(NoneFeatureConfiguration.f_67815_);
      this.generate_dimensions = Set.of(Level.f_46428_);
      this.template = null;
   }

   public boolean m_142674_(FeaturePlaceContext<NoneFeatureConfiguration> context) {
      if (!this.generate_dimensions.contains(context.m_159774_().m_6018_().m_46472_())) {
         return false;
      } else {
         if (this.template == null) {
            this.template = context.m_159774_().m_6018_().m_215082_().m_230359_(new ResourceLocation("how_to_own_a_dragon", "empty_reaper"));
         }

         if (this.template == null) {
            return false;
         } else {
            boolean anyPlaced = false;
            if (context.m_225041_().m_188503_(1000000) + 1 <= 100) {
               int count = context.m_225041_().m_188503_(1) + 1;

               for(int a = 0; a < count; ++a) {
                  int i = context.m_159777_().m_123341_() + context.m_225041_().m_188503_(16);
                  int k = context.m_159777_().m_123343_() + context.m_225041_().m_188503_(16);
                  int j = context.m_159774_().m_6924_(Types.WORLD_SURFACE_WG, i, k) - 1;
                  BlockPos spawnTo = new BlockPos(i + 0, j + 0, k + 0);
                  WorldGenLevel world = context.m_159774_();
                  int x = spawnTo.m_123341_();
                  int y = spawnTo.m_123342_();
                  int z = spawnTo.m_123343_();
                  if (this.template.m_230328_(context.m_159774_(), spawnTo, spawnTo, (new StructurePlaceSettings()).m_74377_(Mirror.values()[context.m_225041_().m_188503_(2)]).m_74379_(Rotation.values()[context.m_225041_().m_188503_(3)]).m_230324_(context.m_225041_()).m_74383_(BlockIgnoreProcessor.f_74046_).m_74392_(false), context.m_225041_(), 2)) {
                     EmptyReaperOnStructureInstanceGeneratedProcedure.execute(world, (double)x, (double)y, (double)z);
                     anyPlaced = true;
                  }
               }
            }

            return anyPlaced;
         }
      }
   }
}
