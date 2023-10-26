package net.mcreator.howtoownadragon.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

public class GrowingTickRateTTProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		HowToOwnADragonMod.queueServerWork(2, () -> {
			if (entity instanceof TamableAnimal _toTame && ((Entity) world.getEntitiesOfClass(Player.class, AABB.ofSize(new Vec3(x, y, z), 4, 4, 4), e -> true).stream().sorted(new Object() {
				Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
					return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
				}
			}.compareDistOf(x, y, z)).findFirst().orElse(null)) instanceof Player _owner)
				_toTame.tame(_owner);
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
		});
	}
}
