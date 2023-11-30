package net.mcreator.howtoownadragon.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

public class AdolescentColorSpawnGronckleProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		HowToOwnADragonMod.queueServerWork(2, () -> {
			if (entity instanceof AdolescentGronckleMaleEntity) {
				if ((entity.getPersistentData().getString("groncklecolor")).equals("pink")) {
					if (entity instanceof AdolescentGronckleMaleEntity animatable)
						animatable.setTexture("adogroncklepink");
				} else if ((entity.getPersistentData().getString("groncklecolor")).equals("meatlug")) {
					if (entity instanceof AdolescentGronckleMaleEntity animatable)
						animatable.setTexture("adomeatlug");
				} else if ((entity.getPersistentData().getString("groncklecolor")).equals("orangered")) {
					if (entity instanceof AdolescentGronckleMaleEntity animatable)
						animatable.setTexture("adogronckleorangered");
				} else if ((entity.getPersistentData().getString("groncklecolor")).equals("blueyellow")) {
					if (entity instanceof AdolescentGronckleMaleEntity animatable)
						animatable.setTexture("adogronckleblueyellow");
				}
			} else if (entity instanceof AdolescentGronckleFemaleEntity) {
				if ((entity.getPersistentData().getString("groncklecolor")).equals("pink")) {
					if (entity instanceof AdolescentGronckleFemaleEntity animatable)
						animatable.setTexture("adogroncklepink");
				} else if ((entity.getPersistentData().getString("groncklecolor")).equals("meatlug")) {
					if (entity instanceof AdolescentGronckleFemaleEntity animatable)
						animatable.setTexture("adomeatlug");
				} else if ((entity.getPersistentData().getString("groncklecolor")).equals("orangered")) {
					if (entity instanceof AdolescentGronckleFemaleEntity animatable)
						animatable.setTexture("adogronckleorangered");
				} else if ((entity.getPersistentData().getString("groncklecolor")).equals("blueyellow")) {
					if (entity instanceof AdolescentGronckleFemaleEntity animatable)
						animatable.setTexture("adogronckleblueyellow");
				}
			}
		});
	}
}
