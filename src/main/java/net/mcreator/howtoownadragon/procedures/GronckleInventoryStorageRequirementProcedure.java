package net.mcreator.howtoownadragon.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;

import net.mcreator.howtoownadragon.entity.MeatlugMaleEntity;

import java.util.Comparator;

public class GronckleInventoryStorageRequirementProcedure {
	public static boolean execute(LevelAccessor world, double x, double y, double z) {
		if (((Entity) world.getEntitiesOfClass(MeatlugMaleEntity.class, AABB.ofSize(new Vec3(x, y, z), 4, 4, 4), e -> true).stream().sorted(new Object() {
			Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
				return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
			}
		}.compareDistOf(x, y, z)).findFirst().orElse(null)).getPersistentData().getBoolean("GronckleInventory") == true) {
			return false;
		}
		return true;
	}
}