package net.mcreator.howtoownadragon.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;

import net.mcreator.howtoownadragon.entity.GronckleFemaleEntity;
import net.mcreator.howtoownadragon.HowToOwnADragonMod;

public class GronckleFemaleOnInitialEntitySpawnProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		HowToOwnADragonMod.queueServerWork(2, () -> {
			if (entity instanceof GronckleFemaleEntity) {
				NBTDataSpawnGronckleProcedure.execute(entity);
				if ((entity.getPersistentData().getString("groncklecolor")).equals("pink")) {
					if (!((entity instanceof GronckleFemaleEntity animatable ? animatable.getTexture() : "null").equals("groncklepink"))) {
						if (entity instanceof GronckleFemaleEntity animatable)
							animatable.setTexture("groncklepink");
					}
				} else if ((entity.getPersistentData().getString("groncklecolor")).equals("orangered")) {
					if (!((entity instanceof GronckleFemaleEntity animatable ? animatable.getTexture() : "null").equals("gronckleorangered"))) {
						if (entity instanceof GronckleFemaleEntity animatable)
							animatable.setTexture("gronckleorangered");
					}
				} else if ((entity.getPersistentData().getString("groncklecolor")).equals("blueyellow")) {
					if (!((entity instanceof GronckleFemaleEntity animatable ? animatable.getTexture() : "null").equals("gronckleblueyellow"))) {
						if (entity instanceof GronckleFemaleEntity animatable)
							animatable.setTexture("gronckleblueyellow");
					}
				} else if ((entity.getPersistentData().getString("groncklecolor")).equals("meatlug")) {
					if (!((entity instanceof GronckleFemaleEntity animatable ? animatable.getTexture() : "null").equals("meatlug"))) {
						if (entity instanceof GronckleFemaleEntity animatable)
							animatable.setTexture("meatlug");
					}
				} else {
					RandomColorFemaleGronckleProcedure.execute(entity);
				}
			}
		});
	}
}
