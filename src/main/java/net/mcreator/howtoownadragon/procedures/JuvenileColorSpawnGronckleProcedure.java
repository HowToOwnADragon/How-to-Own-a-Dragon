package net.mcreator.howtoownadragon.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.EntityJoinLevelEvent;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;

import net.mcreator.howtoownadragon.entity.JuvenileGronckleMaleEntity;
import net.mcreator.howtoownadragon.entity.JuvenileGronckleFemaleEntity;
import net.mcreator.howtoownadragon.HowToOwnADragonMod;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class JuvenileColorSpawnGronckleProcedure {
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
			if (entity instanceof JuvenileGronckleMaleEntity) {
				if ((entity.getPersistentData().getString("groncklecolor")).equals("pink")) {
					if (entity instanceof JuvenileGronckleMaleEntity animatable)
						animatable.setTexture("juvigroncklepink");
					TameNonGrownGronckleProcedure.execute(world, x, y, z, entity);
				} else if ((entity.getPersistentData().getString("groncklecolor")).equals("meatlug")) {
					if (entity instanceof JuvenileGronckleMaleEntity animatable)
						animatable.setTexture("juvimeatlug");
					TameNonGrownGronckleProcedure.execute(world, x, y, z, entity);
				} else if ((entity.getPersistentData().getString("groncklecolor")).equals("orangered")) {
					if (entity instanceof JuvenileGronckleMaleEntity animatable)
						animatable.setTexture("juvigronckleorangered");
					TameNonGrownGronckleProcedure.execute(world, x, y, z, entity);
				} else if ((entity.getPersistentData().getString("groncklecolor")).equals("blueyellow")) {
					if (entity instanceof JuvenileGronckleMaleEntity animatable)
						animatable.setTexture("juvigronckleblueyellow");
					TameNonGrownGronckleProcedure.execute(world, x, y, z, entity);
				}
			} else if (entity instanceof JuvenileGronckleFemaleEntity) {
				if ((entity.getPersistentData().getString("groncklecolor")).equals("pink")) {
					if (entity instanceof JuvenileGronckleFemaleEntity animatable)
						animatable.setTexture("juvigroncklepink");
					TameNonGrownGronckleProcedure.execute(world, x, y, z, entity);
				} else if ((entity.getPersistentData().getString("groncklecolor")).equals("meatlug")) {
					if (entity instanceof JuvenileGronckleFemaleEntity animatable)
						animatable.setTexture("juvimeatlug");
					TameNonGrownGronckleProcedure.execute(world, x, y, z, entity);
				} else if ((entity.getPersistentData().getString("groncklecolor")).equals("orangered")) {
					if (entity instanceof JuvenileGronckleFemaleEntity animatable)
						animatable.setTexture("juvigronckleorangered");
					TameNonGrownGronckleProcedure.execute(world, x, y, z, entity);
				} else if ((entity.getPersistentData().getString("groncklecolor")).equals("blueyellow")) {
					if (entity instanceof JuvenileGronckleFemaleEntity animatable)
						animatable.setTexture("juvigronckleblueyellow");
					TameNonGrownGronckleProcedure.execute(world, x, y, z, entity);
				}
			}
		});
	}
}
