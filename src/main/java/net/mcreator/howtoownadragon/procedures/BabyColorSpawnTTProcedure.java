package net.mcreator.howtoownadragon.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.EntityJoinLevelEvent;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;

import net.mcreator.howtoownadragon.entity.BabyTTMaleEntity;
import net.mcreator.howtoownadragon.entity.BabyTTFemaleEntity;
import net.mcreator.howtoownadragon.HowToOwnADragonMod;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class BabyColorSpawnTTProcedure {
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
			if (entity instanceof BabyTTMaleEntity) {
				if ((entity.getPersistentData().getString("ttcolor")).equals("green")) {
					if (entity instanceof BabyTTMaleEntity animatable)
						animatable.setTexture("greentt");
					TameNonGrownTTProcedure.execute(world, x, y, z, entity);
				} else if ((entity.getPersistentData().getString("ttcolor")).equals("pink")) {
					if (entity instanceof BabyTTMaleEntity animatable)
						animatable.setTexture("pinktt");
					TameNonGrownTTProcedure.execute(world, x, y, z, entity);
				} else if ((entity.getPersistentData().getString("ttcolor")).equals("turq")) {
					if (entity instanceof BabyTTMaleEntity animatable)
						animatable.setTexture("turqtt");
					TameNonGrownTTProcedure.execute(world, x, y, z, entity);
				}
			} else if (entity instanceof BabyTTFemaleEntity) {
				if ((entity.getPersistentData().getString("ttcolor")).equals("green")) {
					if (entity instanceof BabyTTFemaleEntity animatable)
						animatable.setTexture("greentt");
					TameNonGrownTTProcedure.execute(world, x, y, z, entity);
				} else if ((entity.getPersistentData().getString("ttcolor")).equals("pink")) {
					if (entity instanceof BabyTTFemaleEntity animatable)
						animatable.setTexture("pinktt");
					TameNonGrownTTProcedure.execute(world, x, y, z, entity);
				} else if ((entity.getPersistentData().getString("ttcolor")).equals("turq")) {
					if (entity instanceof BabyTTFemaleEntity animatable)
						animatable.setTexture("turqtt");
					TameNonGrownTTProcedure.execute(world, x, y, z, entity);
				}
			}
		});
	}
}
