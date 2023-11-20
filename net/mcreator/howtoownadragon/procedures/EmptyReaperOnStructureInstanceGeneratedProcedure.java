package net.mcreator.howtoownadragon.procedures;

import net.mcreator.howtoownadragon.init.HowToOwnADragonModBlocks;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.Block;

public class EmptyReaperOnStructureInstanceGeneratedProcedure {
   public static void execute(LevelAccessor world, double x, double y, double z) {
      world.m_7731_(BlockPos.m_274561_(x, y, z), ((Block)HowToOwnADragonModBlocks.REAPER_SPAWN_BLOCK.get()).m_49966_(), 3);
      world.m_186460_(BlockPos.m_274561_(x, y, z), world.m_8055_(BlockPos.m_274561_(x, y, z)).m_60734_(), 10);
   }
}
