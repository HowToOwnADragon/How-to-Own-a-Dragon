package net.mcreator.howtoownadragon.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;

import net.mcreator.howtoownadragon.entity.GronckleFemaleEntity;
import net.mcreator.howtoownadragon.HowToOwnADragonMod;

public class RandomColorFemaleGronckleProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (!(entity.getPersistentData().getDouble("Age") >= 0)) {
			entity.getPersistentData().putDouble("Age", 100);
		}
		HowToOwnADragonMod.queueServerWork(1, () -> {
			NBTDataSpawnGronckleProcedure.execute(world, x, y, z, entity);
			if (Mth.nextInt(RandomSource.create(), 1, 3) == 1) {
				entity.getPersistentData().putString("groncklecolor", "pink");
				if (entity instanceof GronckleFemaleEntity animatable)
					animatable.setTexture("groncklepink");
			} else if (Mth.nextInt(RandomSource.create(), 1, 3) == 2) {
				entity.getPersistentData().putString("groncklecolor", "orangered");
				if (entity instanceof GronckleFemaleEntity animatable)
					animatable.setTexture("gronckleorangered");
			} else if (Mth.nextInt(RandomSource.create(), 1, 3) == 3) {
				entity.getPersistentData().putString("groncklecolor", "blueyellow");
				if (entity instanceof GronckleFemaleEntity animatable)
					animatable.setTexture("gronckleblueyellow");
			} else {
				RandomColorFemaleGronckleProcedure.execute(world, x, y, z, entity);
			}
		});
	}
}
