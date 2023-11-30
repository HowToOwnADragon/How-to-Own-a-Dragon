package net.mcreator.howtoownadragon.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

public class BabyColorSpawnGronckleProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		HowToOwnADragonMod.queueServerWork(2, () -> {
			if (entity instanceof BabyGronckleMaleEntity) {
				if ((entity.getPersistentData().getString("groncklecolor")).equals("pink")) {
					if (entity instanceof BabyGronckleMaleEntity animatable)
						animatable.setTexture("babygroncklepink");
				} else if ((entity.getPersistentData().getString("groncklecolor")).equals("meatlug")) {
					if (entity instanceof BabyGronckleMaleEntity animatable)
						animatable.setTexture("babymeatlug");
				} else if ((entity.getPersistentData().getString("groncklecolor")).equals("orangered")) {
					if (entity instanceof BabyGronckleMaleEntity animatable)
						animatable.setTexture("babygronckleorange");
				} else if ((entity.getPersistentData().getString("groncklecolor")).equals("blueyellow")) {
					if (entity instanceof BabyGronckleMaleEntity animatable)
						animatable.setTexture("babygroncleblue");
				}
			} else if (entity instanceof BabyGronckleFemaleEntity) {
				if ((entity.getPersistentData().getString("groncklecolor")).equals("pink")) {
					if (entity instanceof BabyGronckleFemaleEntity animatable)
						animatable.setTexture("babygroncklepink");
				} else if ((entity.getPersistentData().getString("groncklecolor")).equals("meatlug")) {
					if (entity instanceof BabyGronckleFemaleEntity animatable)
						animatable.setTexture("babymeatlug");
				} else if ((entity.getPersistentData().getString("groncklecolor")).equals("orangered")) {
					if (entity instanceof BabyGronckleFemaleEntity animatable)
						animatable.setTexture("babygronckleorange");
				} else if ((entity.getPersistentData().getString("groncklecolor")).equals("blueyellow")) {
					if (entity instanceof BabyGronckleFemaleEntity animatable)
						animatable.setTexture("babygroncleblue");
				}
			}
		});
	}
}
