package net.mcreator.howtoownadragon.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.TamableAnimal;
import net.minecraft.world.entity.Entity;

import net.mcreator.howtoownadragon.HowToOwnADragonMod;

import java.util.Comparator;

public class AutoTameChickenProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		HowToOwnADragonMod.queueServerWork(2, () -> {
			if (!world.getEntitiesOfClass(Player.class, AABB.ofSize(new Vec3(x, y, z), 4, 4, 4), e -> true).isEmpty()) {
				if (entity instanceof TamableAnimal _toTame && ((Entity) world.getEntitiesOfClass(Player.class, AABB.ofSize(new Vec3(x, y, z), 4, 4, 4), e -> true).stream().sorted(new Object() {
					Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
						return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
					}
				}.compareDistOf(x, y, z)).findFirst().orElse(null)) instanceof Player _owner)
					_toTame.tame(_owner);
				GrowingTickRateChickenProcedure.execute(world, x, y, z, entity);
			} else {
				GrowingTickRateChickenProcedure.execute(world, x, y, z, entity);
			}
		});
	}
}
