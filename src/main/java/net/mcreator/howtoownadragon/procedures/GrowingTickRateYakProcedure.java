package net.mcreator.howtoownadragon.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;

import net.mcreator.howtoownadragon.entity.BabyYakEntity;
import net.mcreator.howtoownadragon.HowToOwnADragonMod;

public class GrowingTickRateYakProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		HowToOwnADragonMod.queueServerWork(1, () -> {
			if (entity instanceof BabyYakEntity) {
				HowToOwnADragonMod.queueServerWork(600, () -> {
					if (entity.isAlive()) {
						if (Mth.nextInt(RandomSource.create(), 1, 10) <= 2) {
							GrowUpBabyYakProcedure.execute(world, x, y, z, entity);
						} else {
							HowToOwnADragonMod.queueServerWork(600, () -> {
								if (entity.isAlive()) {
									if (Mth.nextInt(RandomSource.create(), 3, 10) <= 4) {
										GrowUpBabyYakProcedure.execute(world, x, y, z, entity);
									} else {
										HowToOwnADragonMod.queueServerWork(600, () -> {
											if (entity.isAlive()) {
												if (Mth.nextInt(RandomSource.create(), 5, 10) <= 6) {
													GrowUpBabyYakProcedure.execute(world, x, y, z, entity);
												} else {
													HowToOwnADragonMod.queueServerWork(600, () -> {
														if (entity.isAlive()) {
															if (Mth.nextInt(RandomSource.create(), 7, 10) <= 8) {
																GrowUpBabyYakProcedure.execute(world, x, y, z, entity);
															} else {
																HowToOwnADragonMod.queueServerWork(600, () -> {
																	if (entity.isAlive()) {
																		GrowUpBabyYakProcedure.execute(world, x, y, z, entity);
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
