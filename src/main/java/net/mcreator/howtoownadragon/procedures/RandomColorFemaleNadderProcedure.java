package net.mcreator.howtoownadragon.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

public class RandomColorFemaleNadderProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (Mth.nextInt(RandomSource.create(), 1, 2) == 1) {
			if (entity instanceof NadderFemaleEntity animatable)
				animatable.setTexture("rednadder");
			entity.getPersistentData().putString("naddercolor", "red");
		} else if (Mth.nextInt(RandomSource.create(), 1, 2) == 2) {
			if (entity instanceof NadderFemaleEntity animatable)
				animatable.setTexture("purplenadder");
			entity.getPersistentData().putString("naddercolor", "purple");
		} else {
			RandomColorFemaleNadderProcedure.execute(entity);
		}
	}
}
