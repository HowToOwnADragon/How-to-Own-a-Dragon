package net.mcreator.howtoownadragon.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.entity.Entity;

public class ChickenFallProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		entity.setDeltaMovement(new Vec3((entity.getDeltaMovement().x()), (-0.025), (entity.getDeltaMovement().z())));
	}
}
