package net.mcreator.howtoownadragon.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

public class GrowingTickTTProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		HowToOwnADragonMod.queueServerWork(600, () -> {
			if (entity.isAlive()) {
				if (Mth.nextInt(RandomSource.create(), 1, 10) <= 2) {
				} else {
					HowToOwnADragonMod.queueServerWork(600, () -> {
						if (entity.isAlive()) {
							if (Mth.nextInt(RandomSource.create(), 3, 10) <= 4) {
							} else {
								HowToOwnADragonMod.queueServerWork(600, () -> {
									if (entity.isAlive()) {
										if (Mth.nextInt(RandomSource.create(), 5, 10) <= 6) {
										} else {
											HowToOwnADragonMod.queueServerWork(600, () -> {
												if (entity.isAlive()) {
													if (Mth.nextInt(RandomSource.create(), 7, 10) <= 8) {
													} else {
														HowToOwnADragonMod.queueServerWork(600, () -> {
															if (entity.isAlive()) {
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
