package net.mcreator.howtoownadragon.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;

import net.mcreator.howtoownadragon.entity.SheepEntity;

public class OnInitialEntitySpawnBabySheepProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if (Mth.nextInt(RandomSource.create(), 1, 20) == 1) {
			if (entity instanceof SheepEntity animatable)
				animatable.setTexture("sheepblack");
			entity.getPersistentData().putString("sheepcolor", "black");
		} else if (Mth.nextInt(RandomSource.create(), 1, 20) >= 2) {
			if (entity instanceof SheepEntity animatable)
				animatable.setTexture("sheep");
			entity.getPersistentData().putString("sheepcolor", "white");
		} else {
			OnInitialEntitySpawnSheepProcedure.execute(world, entity);
		}
	}
}
