package net.mcreator.howtoownadragon.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

public class BabyColorSpawnTTProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		HowToOwnADragonMod.queueServerWork(2, () -> {
			if (entity instanceof BabyTTMaleEntity) {
				if ((entity.getPersistentData().getString("ttcolor")).equals("green")) {
					if (entity instanceof BabyTTMaleEntity animatable)
						animatable.setTexture("greentt");
				} else if ((entity.getPersistentData().getString("ttcolor")).equals("pink")) {
					if (entity instanceof BabyTTMaleEntity animatable)
						animatable.setTexture("pinktt");
				} else if ((entity.getPersistentData().getString("ttcolor")).equals("turq")) {
					if (entity instanceof BabyTTMaleEntity animatable)
						animatable.setTexture("turqtt");
				}
			} else if (entity instanceof BabyTTFemaleEntity) {
				if ((entity.getPersistentData().getString("ttcolor")).equals("green")) {
					if (entity instanceof BabyTTFemaleEntity animatable)
						animatable.setTexture("greentt");
				} else if ((entity.getPersistentData().getString("ttcolor")).equals("pink")) {
					if (entity instanceof BabyTTFemaleEntity animatable)
						animatable.setTexture("pinktt");
				} else if ((entity.getPersistentData().getString("ttcolor")).equals("turq")) {
					if (entity instanceof BabyTTFemaleEntity animatable)
						animatable.setTexture("turqtt");
				}
			}
		});
	}
}
