package net.mcreator.howtoownadragon.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import net.mcreator.howtoownadragon.init.HowToOwnADragonModBlocks;

public class EmptyReaperOnStructureInstanceGeneratedProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		world.setBlock(BlockPos.containing(x, y, z), HowToOwnADragonModBlocks.REAPER_SPAWN_BLOCK.get().defaultBlockState(), 3);
		world.scheduleTick(BlockPos.containing(x, y, z), world.getBlockState(BlockPos.containing(x, y, z)).getBlock(), 10);
	}
}
