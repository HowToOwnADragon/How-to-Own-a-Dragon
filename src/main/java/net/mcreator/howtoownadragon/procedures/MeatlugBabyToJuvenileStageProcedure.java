package net.mcreator.howtoownadragon.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.TamableAnimal;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.server.level.ServerLevel;

import net.mcreator.howtoownadragon.init.HowToOwnADragonModEntities;
import net.mcreator.howtoownadragon.entity.JuvenileMeatlugEntity;
import net.mcreator.howtoownadragon.HowToOwnADragonMod;

public class MeatlugBabyToJuvenileStageProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, Entity sourceentity) {
		if (entity == null || sourceentity == null)
			return;
		if (entity instanceof TamableAnimal _toTame && sourceentity instanceof Player _owner)
			_toTame.tame(_owner);
		HowToOwnADragonMod.queueServerWork(10000, () -> {
			if (Mth.nextInt(RandomSource.create(), 1, 10) <= 2) {
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new JuvenileMeatlugEntity(HowToOwnADragonModEntities.JUVENILE_MEATLUG.get(), _level);
					entityToSpawn.moveTo(x, y, z, 0, 0);
					entityToSpawn.setYBodyRot(0);
					entityToSpawn.setYHeadRot(0);
					entityToSpawn.setDeltaMovement(0, 0, 0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
					_level.addFreshEntity(entityToSpawn);
				}
				if (!entity.level.isClientSide())
					entity.discard();
			} else {
				HowToOwnADragonMod.queueServerWork(10000, () -> {
					if (Mth.nextInt(RandomSource.create(), 3, 10) <= 4) {
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = new JuvenileMeatlugEntity(HowToOwnADragonModEntities.JUVENILE_MEATLUG.get(), _level);
							entityToSpawn.moveTo(x, y, z, 0, 0);
							entityToSpawn.setYBodyRot(0);
							entityToSpawn.setYHeadRot(0);
							entityToSpawn.setDeltaMovement(0, 0, 0);
							if (entityToSpawn instanceof Mob _mobToSpawn)
								_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
							_level.addFreshEntity(entityToSpawn);
						}
						if (!entity.level.isClientSide())
							entity.discard();
					} else {
						HowToOwnADragonMod.queueServerWork(10000, () -> {
							if (Mth.nextInt(RandomSource.create(), 5, 10) <= 6) {
								if (world instanceof ServerLevel _level) {
									Entity entityToSpawn = new JuvenileMeatlugEntity(HowToOwnADragonModEntities.JUVENILE_MEATLUG.get(), _level);
									entityToSpawn.moveTo(x, y, z, 0, 0);
									entityToSpawn.setYBodyRot(0);
									entityToSpawn.setYHeadRot(0);
									entityToSpawn.setDeltaMovement(0, 0, 0);
									if (entityToSpawn instanceof Mob _mobToSpawn)
										_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
									_level.addFreshEntity(entityToSpawn);
								}
								if (!entity.level.isClientSide())
									entity.discard();
							} else {
								HowToOwnADragonMod.queueServerWork(10000, () -> {
									if (Mth.nextInt(RandomSource.create(), 7, 10) <= 8) {
										if (world instanceof ServerLevel _level) {
											Entity entityToSpawn = new JuvenileMeatlugEntity(HowToOwnADragonModEntities.JUVENILE_MEATLUG.get(), _level);
											entityToSpawn.moveTo(x, y, z, 0, 0);
											entityToSpawn.setYBodyRot(0);
											entityToSpawn.setYHeadRot(0);
											entityToSpawn.setDeltaMovement(0, 0, 0);
											if (entityToSpawn instanceof Mob _mobToSpawn)
												_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
											_level.addFreshEntity(entityToSpawn);
										}
										if (!entity.level.isClientSide())
											entity.discard();
									} else {
										HowToOwnADragonMod.queueServerWork(10000, () -> {
											if (world instanceof ServerLevel _level) {
												Entity entityToSpawn = new JuvenileMeatlugEntity(HowToOwnADragonModEntities.JUVENILE_MEATLUG.get(), _level);
												entityToSpawn.moveTo(x, y, z, 0, 0);
												entityToSpawn.setYBodyRot(0);
												entityToSpawn.setYHeadRot(0);
												entityToSpawn.setDeltaMovement(0, 0, 0);
												if (entityToSpawn instanceof Mob _mobToSpawn)
													_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
												_level.addFreshEntity(entityToSpawn);
											}
											if (!entity.level.isClientSide())
												entity.discard();
										});
									}
								});
							}
						});
					}
				});
			}
		});
	}
}
