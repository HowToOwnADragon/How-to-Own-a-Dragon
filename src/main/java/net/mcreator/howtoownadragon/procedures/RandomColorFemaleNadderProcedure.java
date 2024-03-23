package net.mcreator.howtoownadragon.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;

import net.mcreator.howtoownadragon.entity.NadderFemaleEntity;
import net.mcreator.howtoownadragon.HowToOwnADragonMod;

public class RandomColorFemaleNadderProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (!(entity.getPersistentData().getDouble("Age") >= 0)) {
			entity.getPersistentData().putDouble("Age", 640);
		}
		HowToOwnADragonMod.queueServerWork(1, () -> {
			NBTDataSpawnNadderProcedure.execute(world, x, y, z, entity);
			if (Mth.nextInt(RandomSource.create(), 1, 2) == 1) {
				if (entity instanceof NadderFemaleEntity animatable)
					animatable.setTexture("rednadder");
				entity.getPersistentData().putString("Color", "red");
			} else if (Mth.nextInt(RandomSource.create(), 1, 2) == 2) {
				if (entity instanceof NadderFemaleEntity animatable)
					animatable.setTexture("purplenadder");
				entity.getPersistentData().putString("Color", "purple");
			} else {
				RandomColorFemaleNadderProcedure.execute(world, x, y, z, entity);
			}
		});
	}
}
