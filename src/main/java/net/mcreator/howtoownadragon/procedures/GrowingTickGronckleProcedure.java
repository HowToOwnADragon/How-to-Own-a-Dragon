package net.mcreator.howtoownadragon.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;

import net.mcreator.howtoownadragon.HowToOwnADragonMod;

public class GrowingTickGronckleProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		NBTDataSpawnGronckleProcedure.execute(world, x, y, z, entity);
		HowToOwnADragonMod.queueServerWork(600, () -> {
			if (entity.isAlive()) {
				if (Mth.nextInt(RandomSource.create(), 1, 10) <= 2) {
					GrowUpMessageGronckleProcedure.execute(entity);
				} else {
					HowToOwnADragonMod.queueServerWork(600, () -> {
						if (entity.isAlive()) {
							if (Mth.nextInt(RandomSource.create(), 3, 10) <= 4) {
								GrowUpMessageGronckleProcedure.execute(entity);
							} else {
								HowToOwnADragonMod.queueServerWork(600, () -> {
									if (entity.isAlive()) {
										if (Mth.nextInt(RandomSource.create(), 5, 10) <= 6) {
											GrowUpMessageGronckleProcedure.execute(entity);
										} else {
											HowToOwnADragonMod.queueServerWork(600, () -> {
												if (entity.isAlive()) {
													if (Mth.nextInt(RandomSource.create(), 7, 10) <= 8) {
														GrowUpMessageGronckleProcedure.execute(entity);
													} else {
														HowToOwnADragonMod.queueServerWork(600, () -> {
															if (entity.isAlive()) {
																GrowUpMessageGronckleProcedure.execute(entity);
															}
														});
													}
												}
											});
										}
									}
								});
							}
						}
					});
				}
			}
		});
	}
}
