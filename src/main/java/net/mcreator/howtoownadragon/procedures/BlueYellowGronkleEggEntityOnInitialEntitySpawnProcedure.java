package net.mcreator.howtoownadragon.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.core.BlockPos;

import net.mcreator.howtoownadragon.init.HowToOwnADragonModBlocks;
import net.mcreator.howtoownadragon.HowToOwnADragonMod;

public class BlueYellowGronkleEggEntityOnInitialEntitySpawnProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		HowToOwnADragonMod.queueServerWork(2, () -> {
			if (!entity.level.isClientSide())
				entity.discard();
			world.setBlock(BlockPos.containing(x, y, z), HowToOwnADragonModBlocks.BLUE_YELLOW_GRONCKLE_EGG.get().defaultBlockState(), 3);
		});
	}
}
