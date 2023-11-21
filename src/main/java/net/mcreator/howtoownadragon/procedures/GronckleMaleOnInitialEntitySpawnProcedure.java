package net.mcreator.howtoownadragon.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;

import net.mcreator.howtoownadragon.entity.GronckleMaleEntity;
import net.mcreator.howtoownadragon.HowToOwnADragonMod;

public class GronckleMaleOnInitialEntitySpawnProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		NBTDataSpawnGronckleProcedure.execute(entity);
		HowToOwnADragonMod.queueServerWork(1, () -> {
			if ((entity.getPersistentData().getString("groncklecolor")).equals("pink")) {
				if (entity instanceof GronckleMaleEntity animatable)
					animatable.setTexture("groncklepink");
			} else if ((entity.getPersistentData().getString("groncklecolor")).equals("orangered")) {
				if (entity instanceof GronckleMaleEntity animatable)
					animatable.setTexture("gronckleorangered");
			} else if ((entity.getPersistentData().getString("groncklecolor")).equals("blueyellow")) {
				if (entity instanceof GronckleMaleEntity animatable)
					animatable.setTexture("gronckleblueyellow");
			} else if ((entity.getPersistentData().getString("groncklecolor")).equals("meatlug")) {
				if (entity instanceof GronckleMaleEntity animatable)
					animatable.setTexture("meatlug");
			} else {
				RandomColorMaleGronckleProcedure.execute(entity);
			}
		});
	}
}
