package net.mcreator.howtoownadragon.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.EntityJoinLevelEvent;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;

import net.mcreator.howtoownadragon.entity.GronckleFemaleEntity;
import net.mcreator.howtoownadragon.HowToOwnADragonMod;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class GronckleFemaleOnInitialEntitySpawnProcedure {
	@SubscribeEvent
	public static void onEntitySpawned(EntityJoinLevelEvent event) {
		execute(event, event.getLevel(), event.getEntity());
	}

	public static void execute(LevelAccessor world, Entity entity) {
		execute(null, world, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		HowToOwnADragonMod.queueServerWork(1, () -> {
			if (entity instanceof GronckleFemaleEntity) {
				NBTDataSpawnGronckleProcedure.execute(entity);
				if ((entity.getPersistentData().getString("groncklecolor")).equals("pink")) {
					if (entity instanceof GronckleFemaleEntity animatable)
						animatable.setTexture("groncklepink");
				} else if ((entity.getPersistentData().getString("groncklecolor")).equals("orangered")) {
					if (entity instanceof GronckleFemaleEntity animatable)
						animatable.setTexture("gronckleorangered");
				} else if ((entity.getPersistentData().getString("groncklecolor")).equals("blueyellow")) {
					if (entity instanceof GronckleFemaleEntity animatable)
						animatable.setTexture("gronckleblueyellow");
				} else if ((entity.getPersistentData().getString("groncklecolor")).equals("meatlug")) {
					if (entity instanceof GronckleFemaleEntity animatable)
						animatable.setTexture("meatlug");
				} else {
					RandomColorFemaleGronckleProcedure.execute(entity);
				}
			}
		});
	}
}
