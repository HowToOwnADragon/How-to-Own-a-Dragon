package net.mcreator.howtoownadragon.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.server.level.ServerLevel;

import net.mcreator.howtoownadragon.init.HowToOwnADragonModEntities;
import net.mcreator.howtoownadragon.entity.TTMaleEntity;
import net.mcreator.howtoownadragon.entity.TTFemaleEntity;

public class SpawnTTProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (Mth.nextInt(RandomSource.create(), 0, 2) <= 1) {
			if (world instanceof ServerLevel _level) {
				Entity entityToSpawn = new TTFemaleEntity(HowToOwnADragonModEntities.TT_FEMALE.get(), _level);
				entityToSpawn.moveTo(x, (y + 1), z, 0, 0);
				entityToSpawn.setYBodyRot(0);
				entityToSpawn.setYHeadRot(0);
				entityToSpawn.setDeltaMovement(0, 0, 0);
				if (entityToSpawn instanceof Mob _mobToSpawn)
					_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
				_level.addFreshEntity(entityToSpawn);
			}
		} else if (Mth.nextInt(RandomSource.create(), 0, 2) > 1) {
			if (world instanceof ServerLevel _level) {
				Entity entityToSpawn = new TTMaleEntity(HowToOwnADragonModEntities.TT_MALE.get(), _level);
				entityToSpawn.moveTo(x, (y + 1), z, 0, 0);
				entityToSpawn.setYBodyRot(0);
				entityToSpawn.setYHeadRot(0);
				entityToSpawn.setDeltaMovement(0, 0, 0);
				if (entityToSpawn instanceof Mob _mobToSpawn)
					_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
				_level.addFreshEntity(entityToSpawn);
			}
		} else {
			SpawnTTProcedure.execute(world, x, y, z);
		}
	}
}
