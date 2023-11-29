package net.mcreator.howtoownadragon.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;

import net.mcreator.howtoownadragon.entity.JuvenileNadderMaleEntity;
import net.mcreator.howtoownadragon.entity.JuvenileNadderFemaleEntity;
import net.mcreator.howtoownadragon.HowToOwnADragonMod;

public class JuvenileColorSpawnTTProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		HowToOwnADragonMod.queueServerWork(2, () -> {
			if (entity instanceof JuvenileNadderMaleEntity) {
				if ((entity.getPersistentData().getString("ttcolor")).equals("green")) {
					if (entity instanceof JuvenileNadderMaleEntity animatable)
						animatable.setTexture("greentt");
					TameNonGrownTTProcedure.execute(world, x, y, z, entity);
				} else if ((entity.getPersistentData().getString("ttcolor")).equals("pink")) {
					if (entity instanceof JuvenileNadderMaleEntity animatable)
						animatable.setTexture("pinktt");
					TameNonGrownTTProcedure.execute(world, x, y, z, entity);
				} else if ((entity.getPersistentData().getString("ttcolor")).equals("turq")) {
					if (entity instanceof JuvenileNadderMaleEntity animatable)
						animatable.setTexture("turqtt");
					TameNonGrownTTProcedure.execute(world, x, y, z, entity);
				}
			} else if (entity instanceof JuvenileNadderFemaleEntity) {
				if ((entity.getPersistentData().getString("ttcolor")).equals("green")) {
					if (entity instanceof JuvenileNadderFemaleEntity animatable)
						animatable.setTexture("greentt");
					TameNonGrownTTProcedure.execute(world, x, y, z, entity);
				} else if ((entity.getPersistentData().getString("ttcolor")).equals("pink")) {
					if (entity instanceof JuvenileNadderFemaleEntity animatable)
						animatable.setTexture("pinktt");
					TameNonGrownTTProcedure.execute(world, x, y, z, entity);
				} else if ((entity.getPersistentData().getString("ttcolor")).equals("turq")) {
					if (entity instanceof JuvenileNadderFemaleEntity animatable)
						animatable.setTexture("turqtt");
					TameNonGrownTTProcedure.execute(world, x, y, z, entity);
				}
			}
		});
	}
}
