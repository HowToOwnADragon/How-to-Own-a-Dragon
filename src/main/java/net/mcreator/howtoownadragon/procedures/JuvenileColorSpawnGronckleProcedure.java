package net.mcreator.howtoownadragon.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

public class JuvenileColorSpawnGronckleProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		HowToOwnADragonMod.queueServerWork(2, () -> {
			if (entity instanceof JuvenileGronckleMaleEntity) {
				if ((entity.getPersistentData().getString("groncklecolor")).equals("pink")) {
					if (entity instanceof JuvenileGronckleMaleEntity animatable)
						animatable.setTexture("juvigroncklepink");
				} else if ((entity.getPersistentData().getString("groncklecolor")).equals("meatlug")) {
					if (entity instanceof JuvenileGronckleMaleEntity animatable)
						animatable.setTexture("juvimeatlug");
				} else if ((entity.getPersistentData().getString("groncklecolor")).equals("orangered")) {
					if (entity instanceof JuvenileGronckleMaleEntity animatable)
						animatable.setTexture("juvigronckleorangered");
				} else if ((entity.getPersistentData().getString("groncklecolor")).equals("blueyellow")) {
					if (entity instanceof JuvenileGronckleMaleEntity animatable)
						animatable.setTexture("juvigronckleblueyellow");
				}
			} else if (entity instanceof JuvenileGronckleFemaleEntity) {
				if ((entity.getPersistentData().getString("groncklecolor")).equals("pink")) {
					if (entity instanceof JuvenileGronckleFemaleEntity animatable)
						animatable.setTexture("juvigroncklepink");
				} else if ((entity.getPersistentData().getString("groncklecolor")).equals("meatlug")) {
					if (entity instanceof JuvenileGronckleFemaleEntity animatable)
						animatable.setTexture("juvimeatlug");
				} else if ((entity.getPersistentData().getString("groncklecolor")).equals("orangered")) {
					if (entity instanceof JuvenileGronckleFemaleEntity animatable)
						animatable.setTexture("juvigronckleorangered");
				} else if ((entity.getPersistentData().getString("groncklecolor")).equals("blueyellow")) {
					if (entity instanceof JuvenileGronckleFemaleEntity animatable)
						animatable.setTexture("juvigronckleblueyellow");
				}
			}
		});
	}
}
