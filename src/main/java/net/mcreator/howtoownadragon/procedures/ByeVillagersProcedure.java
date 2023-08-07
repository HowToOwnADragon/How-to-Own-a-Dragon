package net.mcreator.howtoownadragon.procedures;

import net.minecraft.world.entity.npc.Villager;
import net.minecraft.world.entity.Entity;

public class ByeVillagersProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof Villager) {
			if (!entity.level.isClientSide())
				entity.discard();
		}
	}
}
