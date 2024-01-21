package net.mcreator.howtoownadragon.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.server.level.ServerLevel;

import net.mcreator.howtoownadragon.init.HowToOwnADragonModEntities;
import net.mcreator.howtoownadragon.entity.GronckleMaleEntity;
import net.mcreator.howtoownadragon.entity.GronckleFemaleEntity;
import net.mcreator.howtoownadragon.HowToOwnADragonMod;

import java.util.stream.Collectors;
import java.util.List;
import java.util.Comparator;

public class SpawnBabyGronckleProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (Mth.nextInt(RandomSource.create(), 0, 2) <= 1) {
			if (world instanceof ServerLevel _level) {
				Entity entityToSpawn = new GronckleFemaleEntity(HowToOwnADragonModEntities.GRONCKLE_FEMALE.get(), _level);
				entityToSpawn.moveTo(x, (y + 1), z, 0, 0);
				entityToSpawn.setYBodyRot(0);
				entityToSpawn.setYHeadRot(0);
				entityToSpawn.setDeltaMovement(0, 0, 0);
				if (entityToSpawn instanceof Mob _mobToSpawn)
					_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
				_level.addFreshEntity(entityToSpawn);
			}
			HowToOwnADragonMod.queueServerWork(1, () -> {
				{
					final Vec3 _center = new Vec3(x, y, z);
					List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(4 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center)))
							.collect(Collectors.toList());
					for (Entity entityiterator : _entfound) {
						if (entityiterator instanceof GronckleFemaleEntity && entityiterator.getPersistentData().getDouble("Age") <= 639) {
							entityiterator.getPersistentData().putDouble("Age", 100);
						}
					}
				}
			});
		} else if (Mth.nextInt(RandomSource.create(), 0, 2) > 1) {
			if (world instanceof ServerLevel _level) {
				Entity entityToSpawn = new GronckleMaleEntity(HowToOwnADragonModEntities.GRONCKLE_MALE.get(), _level);
				entityToSpawn.moveTo(x, (y + 1), z, 0, 0);
				entityToSpawn.setYBodyRot(0);
				entityToSpawn.setYHeadRot(0);
				entityToSpawn.setDeltaMovement(0, 0, 0);
				if (entityToSpawn instanceof Mob _mobToSpawn)
					_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
				_level.addFreshEntity(entityToSpawn);
			}
			HowToOwnADragonMod.queueServerWork(1, () -> {
				{
					final Vec3 _center = new Vec3(x, y, z);
					List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(4 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center)))
							.collect(Collectors.toList());
					for (Entity entityiterator : _entfound) {
						if (entityiterator instanceof GronckleMaleEntity && entityiterator.getPersistentData().getDouble("Age") <= 639) {
							entityiterator.getPersistentData().putDouble("Age", 100);
						}
					}
				}
			});
		} else {
			SpawnBabyGronckleProcedure.execute(world, x, y, z);
		}
	}
}
