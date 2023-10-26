package net.mcreator.howtoownadragon.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

public class PinkIncubator1CallNBTDataProcedureTTProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		HowToOwnADragonMod.queueServerWork(1, () -> {
			if (((Entity) world.getEntitiesOfClass(BabyTTMaleEntity.class, AABB.ofSize(new Vec3(x, y, z), 10, 10, 10), e -> true).stream().sorted(new Object() {
				Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
					return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
				}
			}.compareDistOf(x, y, z)).findFirst().orElse(null)) instanceof BabyTTMaleEntity) {
				((Entity) world.getEntitiesOfClass(BabyTTMaleEntity.class, AABB.ofSize(new Vec3(x, y, z), 10, 10, 10), e -> true).stream().sorted(new Object() {
					Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
						return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
					}
				}.compareDistOf(x, y, z)).findFirst().orElse(null)).getPersistentData().putString("ttcolor", "pink");
			} else if (((Entity) world.getEntitiesOfClass(BabyTTFemaleEntity.class, AABB.ofSize(new Vec3(x, y, z), 10, 10, 10), e -> true).stream().sorted(new Object() {
				Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
					return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
				}
			}.compareDistOf(x, y, z)).findFirst().orElse(null)) instanceof BabyTTFemaleEntity) {
				((Entity) world.getEntitiesOfClass(BabyTTFemaleEntity.class, AABB.ofSize(new Vec3(x, y, z), 10, 10, 10), e -> true).stream().sorted(new Object() {
					Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
						return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
					}
				}.compareDistOf(x, y, z)).findFirst().orElse(null)).getPersistentData().putString("ttcolor", "pink");
			} else {
				PinkIncubator1CallNBTDataProcedureTTProcedure.execute(world, x, y, z);
			}
		});
	}
}
