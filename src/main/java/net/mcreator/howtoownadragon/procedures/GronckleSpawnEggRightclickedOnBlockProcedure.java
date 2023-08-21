package net.mcreator.howtoownadragon.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.server.level.ServerLevel;

import net.mcreator.howtoownadragon.init.HowToOwnADragonModEntities;
import net.mcreator.howtoownadragon.entity.MeatlugMaleEntity;
import net.mcreator.howtoownadragon.entity.MeatlugFemaleEntity;
import net.mcreator.howtoownadragon.entity.GroncklePinkMaleEntity;
import net.mcreator.howtoownadragon.entity.GroncklePinkFemaleEntity;
import net.mcreator.howtoownadragon.entity.GronckleOrangeRedMaleEntity;
import net.mcreator.howtoownadragon.entity.GronckleOrangeRedFemaleEntity;
import net.mcreator.howtoownadragon.entity.GronckleBlueYellowMaleEntity;
import net.mcreator.howtoownadragon.entity.GronckleBlueYellowFemaleEntity;

public class GronckleSpawnEggRightclickedOnBlockProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (Mth.nextInt(RandomSource.create(), 1, 14) == 1) {
			if (world instanceof ServerLevel _level) {
				Entity entityToSpawn = new MeatlugMaleEntity(HowToOwnADragonModEntities.MEATLUG_MALE.get(), _level);
				entityToSpawn.moveTo(x, (y + 1), z, 0, 0);
				entityToSpawn.setYBodyRot(0);
				entityToSpawn.setYHeadRot(0);
				entityToSpawn.setDeltaMovement(0, 0, 0);
				if (entityToSpawn instanceof Mob _mobToSpawn)
					_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
				_level.addFreshEntity(entityToSpawn);
			}
		} else if (Mth.nextInt(RandomSource.create(), 2, 14) == 2) {
			if (world instanceof ServerLevel _level) {
				Entity entityToSpawn = new MeatlugFemaleEntity(HowToOwnADragonModEntities.MEATLUG_FEMALE.get(), _level);
				entityToSpawn.moveTo(x, (y + 1), z, 0, 0);
				entityToSpawn.setYBodyRot(0);
				entityToSpawn.setYHeadRot(0);
				entityToSpawn.setDeltaMovement(0, 0, 0);
				if (entityToSpawn instanceof Mob _mobToSpawn)
					_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
				_level.addFreshEntity(entityToSpawn);
			}
		} else if (Mth.nextInt(RandomSource.create(), 3, 14) == 3 || Mth.nextInt(RandomSource.create(), 4, 14) == 4) {
			if (world instanceof ServerLevel _level) {
				Entity entityToSpawn = new GroncklePinkMaleEntity(HowToOwnADragonModEntities.GRONCKLE_PINK_MALE.get(), _level);
				entityToSpawn.moveTo(x, (y + 1), z, 0, 0);
				entityToSpawn.setYBodyRot(0);
				entityToSpawn.setYHeadRot(0);
				entityToSpawn.setDeltaMovement(0, 0, 0);
				if (entityToSpawn instanceof Mob _mobToSpawn)
					_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
				_level.addFreshEntity(entityToSpawn);
			}
		} else if (Mth.nextInt(RandomSource.create(), 5, 14) == 5 || Mth.nextInt(RandomSource.create(), 6, 14) == 6) {
			if (world instanceof ServerLevel _level) {
				Entity entityToSpawn = new GroncklePinkFemaleEntity(HowToOwnADragonModEntities.GRONCKLE_PINK_FEMALE.get(), _level);
				entityToSpawn.moveTo(x, (y + 1), z, 0, 0);
				entityToSpawn.setYBodyRot(0);
				entityToSpawn.setYHeadRot(0);
				entityToSpawn.setDeltaMovement(0, 0, 0);
				if (entityToSpawn instanceof Mob _mobToSpawn)
					_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
				_level.addFreshEntity(entityToSpawn);
			}
		} else if (Mth.nextInt(RandomSource.create(), 7, 14) == 7 || Mth.nextInt(RandomSource.create(), 8, 14) == 8) {
			if (world instanceof ServerLevel _level) {
				Entity entityToSpawn = new GronckleBlueYellowMaleEntity(HowToOwnADragonModEntities.GRONCKLE_BLUE_YELLOW_MALE.get(), _level);
				entityToSpawn.moveTo(x, (y + 1), z, 0, 0);
				entityToSpawn.setYBodyRot(0);
				entityToSpawn.setYHeadRot(0);
				entityToSpawn.setDeltaMovement(0, 0, 0);
				if (entityToSpawn instanceof Mob _mobToSpawn)
					_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
				_level.addFreshEntity(entityToSpawn);
			}
		} else if (Mth.nextInt(RandomSource.create(), 9, 14) == 9 || Mth.nextInt(RandomSource.create(), 10, 14) == 10) {
			if (world instanceof ServerLevel _level) {
				Entity entityToSpawn = new GronckleBlueYellowFemaleEntity(HowToOwnADragonModEntities.GRONCKLE_BLUE_YELLOW_FEMALE.get(), _level);
				entityToSpawn.moveTo(x, (y + 1), z, 0, 0);
				entityToSpawn.setYBodyRot(0);
				entityToSpawn.setYHeadRot(0);
				entityToSpawn.setDeltaMovement(0, 0, 0);
				if (entityToSpawn instanceof Mob _mobToSpawn)
					_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
				_level.addFreshEntity(entityToSpawn);
			}
		} else if (Mth.nextInt(RandomSource.create(), 11, 14) == 11 || Mth.nextInt(RandomSource.create(), 12, 14) == 12) {
			if (world instanceof ServerLevel _level) {
				Entity entityToSpawn = new GronckleOrangeRedFemaleEntity(HowToOwnADragonModEntities.GRONCKLE_ORANGE_RED_FEMALE.get(), _level);
				entityToSpawn.moveTo(x, (y + 1), z, 0, 0);
				entityToSpawn.setYBodyRot(0);
				entityToSpawn.setYHeadRot(0);
				entityToSpawn.setDeltaMovement(0, 0, 0);
				if (entityToSpawn instanceof Mob _mobToSpawn)
					_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
				_level.addFreshEntity(entityToSpawn);
			}
		} else if (Mth.nextInt(RandomSource.create(), 13, 14) == 13 || Mth.nextInt(RandomSource.create(), 14, 14) == 14) {
			if (world instanceof ServerLevel _level) {
				Entity entityToSpawn = new GronckleOrangeRedMaleEntity(HowToOwnADragonModEntities.GRONCKLE_ORANGE_RED_MALE.get(), _level);
				entityToSpawn.moveTo(x, (y + 1), z, 0, 0);
				entityToSpawn.setYBodyRot(0);
				entityToSpawn.setYHeadRot(0);
				entityToSpawn.setDeltaMovement(0, 0, 0);
				if (entityToSpawn instanceof Mob _mobToSpawn)
					_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
				_level.addFreshEntity(entityToSpawn);
			}
		}
	}
}
