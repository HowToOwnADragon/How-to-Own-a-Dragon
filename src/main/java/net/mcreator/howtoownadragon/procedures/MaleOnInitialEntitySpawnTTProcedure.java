package net.mcreator.howtoownadragon.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.EntityJoinLevelEvent;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;

import net.mcreator.howtoownadragon.entity.TTMaleEntity;
import net.mcreator.howtoownadragon.HowToOwnADragonMod;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class MaleOnInitialEntitySpawnTTProcedure {
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
		HowToOwnADragonMod.queueServerWork(1, () -> {
			if (entity instanceof TTMaleEntity) {
				NBTOnInitiallSpawnTTProcedure.execute(entity);
				if ((entity.getPersistentData().getString("ttcolor")).equals("green")) {
					if (entity instanceof TTMaleEntity animatable)
						animatable.setTexture("greentt");
				} else if ((entity.getPersistentData().getString("ttcolor")).equals("pink")) {
					if (entity instanceof TTMaleEntity animatable)
						animatable.setTexture("pinktt");
				} else if ((entity.getPersistentData().getString("ttcolor")).equals("turq")) {
					if (entity instanceof TTMaleEntity animatable)
						animatable.setTexture("turqtt");
				} else {
					RandomColorMaleTTProcedure.execute(world, x, y, z, entity);
				}
			}
		});
	}
}
