package net.mcreator.howtoownadragon.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

public class GrowingTickGronckleProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		NBTDataSpawnGronckleProcedure.execute(entity);
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
