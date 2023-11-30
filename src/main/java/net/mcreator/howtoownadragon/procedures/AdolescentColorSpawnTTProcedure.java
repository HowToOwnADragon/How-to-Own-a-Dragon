package net.mcreator.howtoownadragon.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

public class AdolescentColorSpawnTTProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		HowToOwnADragonMod.queueServerWork(2, () -> {
			if (entity instanceof AdolescentTTMaleEntity) {
				if ((entity.getPersistentData().getString("ttcolor")).equals("green")) {
					if (entity instanceof AdolescentTTMaleEntity animatable)
						animatable.setTexture("greentt");
				} else if ((entity.getPersistentData().getString("ttcolor")).equals("pink")) {
					if (entity instanceof AdolescentTTMaleEntity animatable)
						animatable.setTexture("pinktt");
				} else if ((entity.getPersistentData().getString("ttcolor")).equals("turq")) {
					if (entity instanceof AdolescentTTMaleEntity animatable)
						animatable.setTexture("turqtt");
				}
			} else if (entity instanceof AdolescentTTFemaleEntity) {
				if ((entity.getPersistentData().getString("ttcolor")).equals("green")) {
					if (entity instanceof AdolescentTTFemaleEntity animatable)
						animatable.setTexture("greentt");
				} else if ((entity.getPersistentData().getString("ttcolor")).equals("pink")) {
					if (entity instanceof AdolescentTTFemaleEntity animatable)
						animatable.setTexture("pinktt");
				} else if ((entity.getPersistentData().getString("ttcolor")).equals("turq")) {
					if (entity instanceof AdolescentTTFemaleEntity animatable)
						animatable.setTexture("turqtt");
				}
			}
		});
	}
}
