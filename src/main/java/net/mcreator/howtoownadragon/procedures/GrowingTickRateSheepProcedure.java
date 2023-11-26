package net.mcreator.howtoownadragon.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;

import net.mcreator.howtoownadragon.entity.BabySheepEntity;
import net.mcreator.howtoownadragon.HowToOwnADragonMod;

public class GrowingTickRateSheepProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		HowToOwnADragonMod.queueServerWork(1, () -> {
			if (entity instanceof BabySheepEntity) {
				HowToOwnADragonMod.queueServerWork(600, () -> {
					if (entity.isAlive()) {
						if (Mth.nextInt(RandomSource.create(), 1, 10) <= 2) {
							GrowUpBabySheepProcedure.execute(world, x, y, z, entity);
						} else {
							HowToOwnADragonMod.queueServerWork(600, () -> {
								if (entity.isAlive()) {
									if (Mth.nextInt(RandomSource.create(), 3, 10) <= 4) {
										GrowUpBabySheepProcedure.execute(world, x, y, z, entity);
									} else {
										HowToOwnADragonMod.queueServerWork(600, () -> {
											if (entity.isAlive()) {
												if (Mth.nextInt(RandomSource.create(), 5, 10) <= 6) {
													GrowUpBabySheepProcedure.execute(world, x, y, z, entity);
												} else {
													HowToOwnADragonMod.queueServerWork(600, () -> {
														if (entity.isAlive()) {
															if (Mth.nextInt(RandomSource.create(), 7, 10) <= 8) {
																GrowUpBabySheepProcedure.execute(world, x, y, z, entity);
															} else {
																HowToOwnADragonMod.queueServerWork(600, () -> {
																	if (entity.isAlive()) {
																		GrowUpBabySheepProcedure.execute(world, x, y, z, entity);
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
