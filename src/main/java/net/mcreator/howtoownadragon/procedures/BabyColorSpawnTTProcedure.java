package net.mcreator.howtoownadragon.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;

import net.mcreator.howtoownadragon.entity.BabyTTMaleEntity;
import net.mcreator.howtoownadragon.entity.BabyTTFemaleEntity;
import net.mcreator.howtoownadragon.HowToOwnADragonMod;

public class BabyColorSpawnTTProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		HowToOwnADragonMod.queueServerWork(2, () -> {
			if (entity instanceof BabyTTMaleEntity) {
				if ((entity.getPersistentData().getString("ttcolor")).equals("green")) {
					if (entity instanceof BabyTTMaleEntity animatable)
						animatable.setTexture("greentt");
					TameNonGrownTTProcedure.execute(world, x, y, z, entity);
				} else if ((entity.getPersistentData().getString("ttcolor")).equals("pink")) {
					if (entity instanceof BabyTTMaleEntity animatable)
						animatable.setTexture("pinktt");
					TameNonGrownTTProcedure.execute(world, x, y, z, entity);
				} else if ((entity.getPersistentData().getString("ttcolor")).equals("turq")) {
					if (entity instanceof BabyTTMaleEntity animatable)
						animatable.setTexture("turqtt");
					TameNonGrownTTProcedure.execute(world, x, y, z, entity);
				}
			} else if (entity instanceof BabyTTFemaleEntity) {
				if ((entity.getPersistentData().getString("ttcolor")).equals("green")) {
					if (entity instanceof BabyTTFemaleEntity animatable)
						animatable.setTexture("greentt");
					TameNonGrownTTProcedure.execute(world, x, y, z, entity);
				} else if ((entity.getPersistentData().getString("ttcolor")).equals("pink")) {
					if (entity instanceof BabyTTFemaleEntity animatable)
						animatable.setTexture("pinktt");
					TameNonGrownTTProcedure.execute(world, x, y, z, entity);
				} else if ((entity.getPersistentData().getString("ttcolor")).equals("turq")) {
					if (entity instanceof BabyTTFemaleEntity animatable)
						animatable.setTexture("turqtt");
					TameNonGrownTTProcedure.execute(world, x, y, z, entity);
				}
			}
		});
	}
}
