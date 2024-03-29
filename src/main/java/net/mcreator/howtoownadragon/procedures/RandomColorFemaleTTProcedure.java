package net.mcreator.howtoownadragon.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;

import net.mcreator.howtoownadragon.entity.TTFemaleEntity;
import net.mcreator.howtoownadragon.HowToOwnADragonMod;

public class RandomColorFemaleTTProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (!(entity.getPersistentData().getDouble("Age") >= 0)) {
			entity.getPersistentData().putDouble("Age", 640);
		}
		HowToOwnADragonMod.queueServerWork(1, () -> {
			NBTDataSpawnTTProcedure.execute(world, x, y, z, entity);
			if (Mth.nextInt(RandomSource.create(), 1, 3) == 1) {
				if (entity instanceof TTFemaleEntity animatable)
					animatable.setTexture("greentt");
				entity.getPersistentData().putString("Color", "green");
			} else if (Mth.nextInt(RandomSource.create(), 1, 3) == 2) {
				if (entity instanceof TTFemaleEntity animatable)
					animatable.setTexture("pinktt");
				entity.getPersistentData().putString("Color", "pink");
			} else if (Mth.nextInt(RandomSource.create(), 1, 3) == 3) {
				if (entity instanceof TTFemaleEntity animatable)
					animatable.setTexture("turqtt");
				entity.getPersistentData().putString("Color", "turq");
			}
		});
	}
}
