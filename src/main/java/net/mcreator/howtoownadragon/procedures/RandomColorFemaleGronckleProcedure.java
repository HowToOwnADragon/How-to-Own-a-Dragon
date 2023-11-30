package net.mcreator.howtoownadragon.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

public class RandomColorFemaleGronckleProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (Mth.nextInt(RandomSource.create(), 1, 3) == 1) {
			if (entity instanceof GronckleFemaleEntity animatable)
				animatable.setTexture("groncklepink");
			entity.getPersistentData().putString("groncklecolor", "pink");
		} else if (Mth.nextInt(RandomSource.create(), 1, 3) == 2) {
			if (entity instanceof GronckleFemaleEntity animatable)
				animatable.setTexture("gronckleorangered");
			entity.getPersistentData().putString("groncklecolor", "orangered");
		} else if (Mth.nextInt(RandomSource.create(), 1, 3) == 3) {
			if (entity instanceof GronckleFemaleEntity animatable)
				animatable.setTexture("gronckleblueyellow");
			entity.getPersistentData().putString("groncklecolor", "blueyellow");
		} else {
			RandomColorFemaleGronckleProcedure.execute(entity);
		}
	}
}
