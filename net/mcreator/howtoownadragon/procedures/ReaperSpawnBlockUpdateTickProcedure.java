package net.mcreator.howtoownadragon.procedures;

import net.minecraft.core.BlockPos;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.Mirror;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.world.level.levelgen.structure.templatesystem.StructurePlaceSettings;
import net.minecraft.world.level.levelgen.structure.templatesystem.StructureTemplate;

public class ReaperSpawnBlockUpdateTickProcedure {
   public static void execute(LevelAccessor world, double x, double y, double z) {
      if (world instanceof ServerLevel) {
         ServerLevel _serverworld = (ServerLevel)world;
         StructureTemplate template = _serverworld.m_215082_().m_230359_(new ResourceLocation("how_to_own_a_dragon", "reaper_ship_in_ow_v8"));
         if (template != null) {
            template.m_230328_(_serverworld, BlockPos.m_274561_(x, 57.0D, z), BlockPos.m_274561_(x, 57.0D, z), (new StructurePlaceSettings()).m_74379_(Rotation.NONE).m_74377_(Mirror.NONE).m_74392_(false), _serverworld.f_46441_, 3);
         }
      }

      world.m_7731_(BlockPos.m_274561_(x, y, z), Blocks.f_50016_.m_49966_(), 3);
   }
}
