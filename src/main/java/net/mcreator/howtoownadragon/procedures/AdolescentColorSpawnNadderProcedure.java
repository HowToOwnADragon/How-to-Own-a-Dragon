package net.mcreator.howtoownadragon.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

public class AdolescentColorSpawnNadderProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		HowToOwnADragonMod.queueServerWork(2, () -> {
			if (entity instanceof AdolescentNadderMaleEntity) {
				if ((entity.getPersistentData().getString("naddercolor")).equals("red")) {
					if (entity instanceof AdolescentNadderMaleEntity animatable)
						animatable.setTexture("rednadder");
					TameNonGrownNadderProcedure.execute(world, x, y, z, entity);
				} else if ((entity.getPersistentData().getString("naddercolor")).equals("purple")) {
					if (entity instanceof AdolescentNadderMaleEntity animatable)
						animatable.setTexture("purplenadder");
					TameNonGrownNadderProcedure.execute(world, x, y, z, entity);
				} else if ((entity.getPersistentData().getString("naddercolor")).equals("stormfly")) {
					if (entity instanceof AdolescentNadderMaleEntity animatable)
						animatable.setTexture("stormfly");
					TameNonGrownNadderProcedure.execute(world, x, y, z, entity);
				}
			} else if (entity instanceof AdolescentNadderFemaleEntity) {
				if ((entity.getPersistentData().getString("naddercolor")).equals("red")) {
					if (entity instanceof AdolescentNadderFemaleEntity animatable)
						animatable.setTexture("rednadder");
					TameNonGrownNadderProcedure.execute(world, x, y, z, entity);
				} else if ((entity.getPersistentData().getString("naddercolor")).equals("purple")) {
					if (entity instanceof AdolescentNadderFemaleEntity animatable)
						animatable.setTexture("purplenadder");
					TameNonGrownNadderProcedure.execute(world, x, y, z, entity);
				} else if ((entity.getPersistentData().getString("naddercolor")).equals("stormfly")) {
					if (entity instanceof AdolescentNadderFemaleEntity animatable)
						animatable.setTexture("stormfly");
					TameNonGrownNadderProcedure.execute(world, x, y, z, entity);
				}
			}
		});
	}
}
