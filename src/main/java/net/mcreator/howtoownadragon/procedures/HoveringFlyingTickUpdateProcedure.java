package net.mcreator.howtoownadragon.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.entity.Entity;

public class HoveringFlyingTickUpdateProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity.getPersistentData().getDouble("VerticalMovement") == 1) {
			entity.setDeltaMovement(new Vec3((entity.getDeltaMovement().x()), 0.2, (entity.getDeltaMovement().z())));
		} else if (entity.getPersistentData().getDouble("VerticalMovement") == -1) {
			entity.setDeltaMovement(new Vec3((entity.getDeltaMovement().x()), (-0.2), (entity.getDeltaMovement().z())));
		} else {
			entity.setDeltaMovement(new Vec3((entity.getDeltaMovement().x()), (-0.1), (entity.getDeltaMovement().z())));
		}
	}
}