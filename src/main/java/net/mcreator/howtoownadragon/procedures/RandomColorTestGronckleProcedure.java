package net.mcreator.howtoownadragon.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;

import net.mcreator.howtoownadragon.entity.TestGronckleEntity;
import net.mcreator.howtoownadragon.HowToOwnADragonMod;

public class RandomColorTestGronckleProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		HowToOwnADragonMod.queueServerWork(5, () -> {
			if (entity instanceof TestGronckleEntity) {
				if (!(entity.getPersistentData().getDouble("Age") >= 0)) {
					entity.getPersistentData().putDouble("Age", 800);
				}
				if (!((entity.getPersistentData().getString("Color")).equals("groncklepink") || (entity.getPersistentData().getString("Color")).equals("gronckleorangered")
						|| (entity.getPersistentData().getString("Color")).equals("gronckleblueyellow"))) {
					NBTDataSpawnGronckleProcedure.execute(world, x, y, z, entity);
					if (Mth.nextInt(RandomSource.create(), 1, 3) == 1) {
						entity.getPersistentData().putString("Color", "groncklepink");
						if ((entity.getPersistentData().getString("Color")).equals("groncklepink")) {
							entity.getPersistentData().putString("Texture", "groncklepink");
							if (entity instanceof TestGronckleEntity animatable)
								animatable.setTexture("groncklepink");
						}
					} else if (Mth.nextInt(RandomSource.create(), 1, 3) == 2) {
						entity.getPersistentData().putString("Color", "gronckleorangered");
						if ((entity.getPersistentData().getString("Color")).equals("gronckleorangered")) {
							entity.getPersistentData().putString("Texture", "gronckleorangered");
							if (entity instanceof TestGronckleEntity animatable)
								animatable.setTexture("gronckleorangered");
						}
					} else if (Mth.nextInt(RandomSource.create(), 1, 3) == 3) {
						entity.getPersistentData().putString("Color", "gronckleblueyellow");
						if ((entity.getPersistentData().getString("Color")).equals("gronckleblueyellow")) {
							entity.getPersistentData().putString("Texture", "gronckleblueyellow");
							if (entity instanceof TestGronckleEntity animatable)
								animatable.setTexture("gronckleblueyellow");
						}
					} else {
						RandomColorMaleGronckleProcedure.execute(world, x, y, z, entity);
					}
				}
			}
		});
	}
}
