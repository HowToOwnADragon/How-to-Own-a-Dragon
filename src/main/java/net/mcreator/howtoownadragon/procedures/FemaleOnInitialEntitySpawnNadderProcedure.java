package net.mcreator.howtoownadragon.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.EntityJoinLevelEvent;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;

import net.mcreator.howtoownadragon.entity.NadderFemaleEntity;
import net.mcreator.howtoownadragon.HowToOwnADragonMod;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class FemaleOnInitialEntitySpawnNadderProcedure {
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
			if (entity instanceof NadderFemaleEntity) {
				NBTDataSpawnNadderProcedure.execute(entity);
				if ((entity.getPersistentData().getString("naddercolor")).equals("red")) {
					if (entity instanceof NadderFemaleEntity animatable)
						animatable.setTexture("rednadder");
				} else if ((entity.getPersistentData().getString("naddercolor")).equals("purple")) {
					if (entity instanceof NadderFemaleEntity animatable)
						animatable.setTexture("purplenadder");
				} else if ((entity.getPersistentData().getString("naddercolor")).equals("stormfly")) {
					if (entity instanceof NadderFemaleEntity animatable)
						animatable.setTexture("stormfly");
				} else {
					RandomColorFemaleNadderProcedure.execute(entity);
				}
			}
		});
	}
}
