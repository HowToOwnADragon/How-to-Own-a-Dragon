package net.mcreator.howtoownadragon.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;

import net.mcreator.howtoownadragon.entity.TTMaleEntity;
import net.mcreator.howtoownadragon.HowToOwnADragonMod;

public class MaleOnInitialEntitySpawnTTProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		HowToOwnADragonMod.queueServerWork(1, () -> {
			if (entity instanceof TTMaleEntity) {
				NBTOnInitiallSpawnTTProcedure.execute(entity);
				if ((entity.getPersistentData().getString("ttcolor")).equals("green")) {
					if (!((entity instanceof TTMaleEntity animatable ? animatable.getTexture() : "null").equals("greentt"))) {
						if (entity instanceof TTMaleEntity animatable)
							animatable.setTexture("greentt");
					}
				} else if ((entity.getPersistentData().getString("ttcolor")).equals("pink")) {
					if (!((entity instanceof TTMaleEntity animatable ? animatable.getTexture() : "null").equals("pinktt"))) {
						if (entity instanceof TTMaleEntity animatable)
							animatable.setTexture("pinktt");
					}
				} else if ((entity.getPersistentData().getString("ttcolor")).equals("turq")) {
					if (!((entity instanceof TTMaleEntity animatable ? animatable.getTexture() : "null").equals("turqtt"))) {
						if (entity instanceof TTMaleEntity animatable)
							animatable.setTexture("turqtt");
					}
				} else {
					RandomColorMaleTTProcedure.execute(world, x, y, z, entity);
				}
			}
		});
	}
}
