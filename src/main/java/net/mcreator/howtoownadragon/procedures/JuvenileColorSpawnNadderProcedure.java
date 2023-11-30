package net.mcreator.howtoownadragon.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

public class JuvenileColorSpawnNadderProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		HowToOwnADragonMod.queueServerWork(2, () -> {
			if (entity instanceof JuvenileNadderMaleEntity) {
				if ((entity.getPersistentData().getString("naddercolor")).equals("red")) {
					if (entity instanceof JuvenileNadderMaleEntity animatable)
						animatable.setTexture("rednadder");
				} else if ((entity.getPersistentData().getString("naddercolor")).equals("purple")) {
					if (entity instanceof JuvenileNadderMaleEntity animatable)
						animatable.setTexture("purplenadder");
				} else if ((entity.getPersistentData().getString("naddercolor")).equals("stormfly")) {
					if (entity instanceof JuvenileNadderMaleEntity animatable)
						animatable.setTexture("stormfly");
				}
			} else if (entity instanceof JuvenileNadderFemaleEntity) {
				if ((entity.getPersistentData().getString("naddercolor")).equals("red")) {
					if (entity instanceof JuvenileNadderFemaleEntity animatable)
						animatable.setTexture("rednadder");
				} else if ((entity.getPersistentData().getString("naddercolor")).equals("purple")) {
					if (entity instanceof JuvenileNadderFemaleEntity animatable)
						animatable.setTexture("purplenadder");
				} else if ((entity.getPersistentData().getString("naddercolor")).equals("stormfly")) {
					if (entity instanceof JuvenileNadderFemaleEntity animatable)
						animatable.setTexture("stormfly");
				}
			}
		});
	}
}
