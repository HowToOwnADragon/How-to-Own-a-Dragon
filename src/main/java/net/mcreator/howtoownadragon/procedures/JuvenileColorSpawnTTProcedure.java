package net.mcreator.howtoownadragon.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;

import net.mcreator.howtoownadragon.entity.JuvenileTTMaleEntity;
import net.mcreator.howtoownadragon.entity.JuvenileTTFemaleEntity;
import net.mcreator.howtoownadragon.HowToOwnADragonMod;

public class JuvenileColorSpawnTTProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		HowToOwnADragonMod.queueServerWork(2, () -> {
			if (entity instanceof JuvenileTTMaleEntity) {
				TameNonGrownTTProcedure.execute(world, x, y, z, entity);
			} else if (entity instanceof JuvenileTTFemaleEntity) {
				TameNonGrownTTProcedure.execute(world, x, y, z, entity);
			}
		});
	}
}
