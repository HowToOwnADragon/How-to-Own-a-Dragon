package net.mcreator.howtoownadragon.procedures;

import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;

import net.mcreator.howtoownadragon.entity.GronckleMaleEntity;

public class GronckleMaleOnInitialEntitySpawnProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (!((entity.getPersistentData().getString("groncklecolor")).equals("meatlug") || (entity.getPersistentData().getString("groncklecolor")).equals("pink") || (entity.getPersistentData().getString("groncklecolor")).equals("orangered")
				|| (entity.getPersistentData().getString("groncklecolor")).equals("blueyellow"))) {
			if (Mth.nextInt(RandomSource.create(), 1, 3) == 1) {
				if (entity instanceof GronckleMaleEntity animatable)
					animatable.setTexture("groncklepink");
				entity.getPersistentData().putString("groncklecolor", "pink");
				NBTDataSpawnGronckleProcedure.execute(entity);
			} else if (Mth.nextInt(RandomSource.create(), 1, 3) == 2) {
				if (entity instanceof GronckleMaleEntity animatable)
					animatable.setTexture("gronckleorangered");
				entity.getPersistentData().putString("groncklecolor", "orangered");
				NBTDataSpawnGronckleProcedure.execute(entity);
			} else if (Mth.nextInt(RandomSource.create(), 1, 3) == 3) {
				if (entity instanceof GronckleMaleEntity animatable)
					animatable.setTexture("gronckleblueyellow");
				entity.getPersistentData().putString("groncklecolor", "blueyellow");
				NBTDataSpawnGronckleProcedure.execute(entity);
			} else {
				GronckleMaleOnInitialEntitySpawnProcedure.execute(entity);
			}
		}
	}
}
