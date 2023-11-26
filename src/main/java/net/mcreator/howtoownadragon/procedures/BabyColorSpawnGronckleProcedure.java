package net.mcreator.howtoownadragon.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.EntityJoinLevelEvent;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;

import net.mcreator.howtoownadragon.entity.BabyGronckleMaleEntity;
import net.mcreator.howtoownadragon.entity.BabyGronckleFemaleEntity;
import net.mcreator.howtoownadragon.HowToOwnADragonMod;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class BabyColorSpawnGronckleProcedure {
	@SubscribeEvent
	public static void onEntitySpawned(EntityJoinLevelEvent event) {
		execute(event, event.getLevel(), event.getEntity().getX(), event.getEntity().getY(), event.getEntity().getZ(), event.getEntity());
	}

	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		execute(null, world, x, y, z, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		HowToOwnADragonMod.queueServerWork(2, () -> {
			if (entity instanceof BabyGronckleMaleEntity) {
				if ((entity.getPersistentData().getString("groncklecolor")).equals("pink")) {
					if (entity instanceof BabyGronckleMaleEntity animatable)
						animatable.setTexture("babygroncklepink");
					TameNonGrownGronckleProcedure.execute(world, x, y, z, entity);
				} else if ((entity.getPersistentData().getString("groncklecolor")).equals("meatlug")) {
					if (entity instanceof BabyGronckleMaleEntity animatable)
						animatable.setTexture("babymeatlug");
					TameNonGrownGronckleProcedure.execute(world, x, y, z, entity);
				} else if ((entity.getPersistentData().getString("groncklecolor")).equals("orangered")) {
					if (entity instanceof BabyGronckleMaleEntity animatable)
						animatable.setTexture("babygronckleorange");
					TameNonGrownGronckleProcedure.execute(world, x, y, z, entity);
				} else if ((entity.getPersistentData().getString("groncklecolor")).equals("blueyellow")) {
					if (entity instanceof BabyGronckleMaleEntity animatable)
						animatable.setTexture("babygroncleblue");
					TameNonGrownGronckleProcedure.execute(world, x, y, z, entity);
				}
			} else if (entity instanceof BabyGronckleFemaleEntity) {
				if ((entity.getPersistentData().getString("groncklecolor")).equals("pink")) {
					if (entity instanceof BabyGronckleFemaleEntity animatable)
						animatable.setTexture("babygroncklepink");
					TameNonGrownGronckleProcedure.execute(world, x, y, z, entity);
				} else if ((entity.getPersistentData().getString("groncklecolor")).equals("meatlug")) {
					if (entity instanceof BabyGronckleFemaleEntity animatable)
						animatable.setTexture("babymeatlug");
					TameNonGrownGronckleProcedure.execute(world, x, y, z, entity);
				} else if ((entity.getPersistentData().getString("groncklecolor")).equals("orangered")) {
					if (entity instanceof BabyGronckleFemaleEntity animatable)
						animatable.setTexture("babygronckleorange");
					TameNonGrownGronckleProcedure.execute(world, x, y, z, entity);
				} else if ((entity.getPersistentData().getString("groncklecolor")).equals("blueyellow")) {
					if (entity instanceof BabyGronckleFemaleEntity animatable)
						animatable.setTexture("babygroncleblue");
					TameNonGrownGronckleProcedure.execute(world, x, y, z, entity);
				}
			}
		});
	}
}
