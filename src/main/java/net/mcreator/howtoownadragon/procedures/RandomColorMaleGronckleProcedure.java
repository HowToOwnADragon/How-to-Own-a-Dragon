package net.mcreator.howtoownadragon.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;

import net.mcreator.howtoownadragon.entity.GronckleMaleEntity;
import net.mcreator.howtoownadragon.HowToOwnADragonMod;

public class RandomColorMaleGronckleProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof GronckleMaleEntity) {
			if (!(entity.getPersistentData().getDouble("Age") >= 0)) {
				entity.getPersistentData().putDouble("Age", 800);
			}
			if (!((entity.getPersistentData().getString("Color")).equals("groncklepink") || (entity.getPersistentData().getString("Color")).equals("gronckleorangered")
					|| (entity.getPersistentData().getString("Color")).equals("gronckleblueyellow"))) {
				HowToOwnADragonMod.queueServerWork(1, () -> {
					NBTDataSpawnGronckleProcedure.execute(world, x, y, z, entity);
					if (Mth.nextInt(RandomSource.create(), 1, 3) == 1) {
						entity.getPersistentData().putString("Color", "groncklepink");
						if ((entity.getPersistentData().getString("Color")).equals("groncklepink")) {
							entity.getPersistentData().putString("Texture", "groncklepink");
							if (entity instanceof GronckleMaleEntity animatable)
								animatable.setTexture("groncklepink");
						}
					} else if (Mth.nextInt(RandomSource.create(), 1, 3) == 2) {
						entity.getPersistentData().putString("Color", "gronckleorangered");
						if ((entity.getPersistentData().getString("Color")).equals("gronckleorangered")) {
							entity.getPersistentData().putString("Texture", "gronckleorangered");
							if (entity instanceof GronckleMaleEntity animatable)
								animatable.setTexture("gronckleorangered");
						}
					} else if (Mth.nextInt(RandomSource.create(), 1, 3) == 3) {
						entity.getPersistentData().putString("Color", "gronckleblueyellow");
						if ((entity.getPersistentData().getString("Color")).equals("gronckleblueyellow")) {
							entity.getPersistentData().putString("Texture", "gronckleblueyellow");
							if (entity instanceof GronckleMaleEntity animatable)
								animatable.setTexture("gronckleblueyellow");
						}
					} else {
						RandomColorMaleGronckleProcedure.execute(world, x, y, z, entity);
					}
				});
			}
		}
	}
}
