package net.mcreator.howtoownadragon.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;

import net.mcreator.howtoownadragon.entity.BabyChickenEntity;
import net.mcreator.howtoownadragon.HowToOwnADragonMod;

public class GrowingTickRateChickenProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		HowToOwnADragonMod.queueServerWork(1, () -> {
			if (entity instanceof BabyChickenEntity) {
				HowToOwnADragonMod.queueServerWork(600, () -> {
					if (entity.isAlive()) {
						if (Mth.nextInt(RandomSource.create(), 1, 10) <= 2) {
							GrowUpBabyChickenProcedure.execute(world, x, y, z, entity);
						} else {
							HowToOwnADragonMod.queueServerWork(600, () -> {
								if (entity.isAlive()) {
									if (Mth.nextInt(RandomSource.create(), 3, 10) <= 4) {
										GrowUpBabyChickenProcedure.execute(world, x, y, z, entity);
									} else {
										HowToOwnADragonMod.queueServerWork(600, () -> {
											if (entity.isAlive()) {
												if (Mth.nextInt(RandomSource.create(), 5, 10) <= 6) {
													GrowUpBabyChickenProcedure.execute(world, x, y, z, entity);
												} else {
													HowToOwnADragonMod.queueServerWork(600, () -> {
														if (entity.isAlive()) {
															if (Mth.nextInt(RandomSource.create(), 7, 10) <= 8) {
																GrowUpBabyChickenProcedure.execute(world, x, y, z, entity);
															} else {
																HowToOwnADragonMod.queueServerWork(600, () -> {
																	if (entity.isAlive()) {
																		GrowUpBabyChickenProcedure.execute(world, x, y, z, entity);
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
		});
	}
}
