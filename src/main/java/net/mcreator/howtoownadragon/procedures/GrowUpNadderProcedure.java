package net.mcreator.howtoownadragon.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.TamableAnimal;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.network.chat.Component;
import net.minecraft.core.particles.ParticleTypes;

import net.mcreator.howtoownadragon.init.HowToOwnADragonModEntities;
import net.mcreator.howtoownadragon.entity.NadderMaleEntity;
import net.mcreator.howtoownadragon.entity.NadderFemaleEntity;
import net.mcreator.howtoownadragon.entity.JuvenileNadderMaleEntity;
import net.mcreator.howtoownadragon.entity.JuvenileNadderFemaleEntity;
import net.mcreator.howtoownadragon.entity.BabyNadderMaleEntity;
import net.mcreator.howtoownadragon.entity.BabyNadderFemaleEntity;
import net.mcreator.howtoownadragon.entity.AdolescentNadderMaleEntity;
import net.mcreator.howtoownadragon.entity.AdolescentNadderFemaleEntity;
import net.mcreator.howtoownadragon.HowToOwnADragonMod;

import java.util.Comparator;

public class GrowUpNadderProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof BabyNadderMaleEntity) {
			if (world instanceof ServerLevel _level)
				_level.sendParticles(ParticleTypes.HAPPY_VILLAGER, x, y, z, 30, 3, 3, 3, 0.5);
			if (world instanceof ServerLevel _level) {
				Entity entityToSpawn = new JuvenileNadderMaleEntity(HowToOwnADragonModEntities.JUVENILE_NADDER_MALE.get(), _level);
				entityToSpawn.moveTo(x, y, z, 0, 0);
				entityToSpawn.setYBodyRot(0);
				entityToSpawn.setYHeadRot(0);
				entityToSpawn.setDeltaMovement(0, 0, 0);
				if (entityToSpawn instanceof Mob _mobToSpawn)
					_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
				_level.addFreshEntity(entityToSpawn);
			}
			HowToOwnADragonMod.queueServerWork(1, () -> {
				if (!world.getEntitiesOfClass(JuvenileNadderMaleEntity.class, AABB.ofSize(new Vec3(x, y, z), 10, 10, 10), e -> true).isEmpty()) {
					((Entity) world.getEntitiesOfClass(JuvenileNadderMaleEntity.class, AABB.ofSize(new Vec3(x, y, z), 10, 10, 10), e -> true).stream().sorted(new Object() {
						Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
							return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
						}
					}.compareDistOf(x, y, z)).findFirst().orElse(null)).getPersistentData().putString("naddercolor", (entity.getPersistentData().getString("naddercolor")));
					if (!entity.level.isClientSide())
						entity.discard();
					if ((entity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null) instanceof Player _player && !_player.level.isClientSide())
						_player.displayClientMessage(Component.literal(("Your " + entity.getDisplayName().getString() + " has succesfully grown up!")), false);
				}
			});
		} else if (entity instanceof BabyNadderFemaleEntity) {
			if (world instanceof ServerLevel _level)
				_level.sendParticles(ParticleTypes.HAPPY_VILLAGER, x, y, z, 30, 3, 3, 3, 0.5);
			if (world instanceof ServerLevel _level) {
				Entity entityToSpawn = new JuvenileNadderFemaleEntity(HowToOwnADragonModEntities.JUVENILE_NADDER_FEMALE.get(), _level);
				entityToSpawn.moveTo(x, y, z, 0, 0);
				entityToSpawn.setYBodyRot(0);
				entityToSpawn.setYHeadRot(0);
				entityToSpawn.setDeltaMovement(0, 0, 0);
				if (entityToSpawn instanceof Mob _mobToSpawn)
					_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
				_level.addFreshEntity(entityToSpawn);
			}
			HowToOwnADragonMod.queueServerWork(1, () -> {
				if (!world.getEntitiesOfClass(JuvenileNadderFemaleEntity.class, AABB.ofSize(new Vec3(x, y, z), 10, 10, 10), e -> true).isEmpty()) {
					((Entity) world.getEntitiesOfClass(JuvenileNadderFemaleEntity.class, AABB.ofSize(new Vec3(x, y, z), 10, 10, 10), e -> true).stream().sorted(new Object() {
						Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
							return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
						}
					}.compareDistOf(x, y, z)).findFirst().orElse(null)).getPersistentData().putString("naddercolor", (entity.getPersistentData().getString("naddercolor")));
					if (!entity.level.isClientSide())
						entity.discard();
					if ((entity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null) instanceof Player _player && !_player.level.isClientSide())
						_player.displayClientMessage(Component.literal(("Your " + entity.getDisplayName().getString() + " has succesfully grown up!")), false);
				}
			});
		} else if (entity instanceof JuvenileNadderMaleEntity) {
			if (world instanceof ServerLevel _level)
				_level.sendParticles(ParticleTypes.HAPPY_VILLAGER, x, y, z, 30, 3, 3, 3, 0.5);
			if (world instanceof ServerLevel _level) {
				Entity entityToSpawn = new AdolescentNadderMaleEntity(HowToOwnADragonModEntities.ADOLESCENT_NADDER_MALE.get(), _level);
				entityToSpawn.moveTo(x, y, z, 0, 0);
				entityToSpawn.setYBodyRot(0);
				entityToSpawn.setYHeadRot(0);
				entityToSpawn.setDeltaMovement(0, 0, 0);
				if (entityToSpawn instanceof Mob _mobToSpawn)
					_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
				_level.addFreshEntity(entityToSpawn);
			}
			HowToOwnADragonMod.queueServerWork(1, () -> {
				if (!world.getEntitiesOfClass(AdolescentNadderMaleEntity.class, AABB.ofSize(new Vec3(x, y, z), 10, 10, 10), e -> true).isEmpty()) {
					((Entity) world.getEntitiesOfClass(AdolescentNadderMaleEntity.class, AABB.ofSize(new Vec3(x, y, z), 10, 10, 10), e -> true).stream().sorted(new Object() {
						Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
							return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
						}
					}.compareDistOf(x, y, z)).findFirst().orElse(null)).getPersistentData().putString("naddercolor", (entity.getPersistentData().getString("naddercolor")));
					if (!entity.level.isClientSide())
						entity.discard();
					if ((entity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null) instanceof Player _player && !_player.level.isClientSide())
						_player.displayClientMessage(Component.literal(("Your " + entity.getDisplayName().getString() + " has succesfully grown up!")), false);
				}
			});
		} else if (entity instanceof JuvenileNadderFemaleEntity) {
			if (world instanceof ServerLevel _level)
				_level.sendParticles(ParticleTypes.HAPPY_VILLAGER, x, y, z, 30, 3, 3, 3, 0.5);
			if (world instanceof ServerLevel _level) {
				Entity entityToSpawn = new AdolescentNadderFemaleEntity(HowToOwnADragonModEntities.ADOLESCENT_NADDER_FEMALE.get(), _level);
				entityToSpawn.moveTo(x, y, z, 0, 0);
				entityToSpawn.setYBodyRot(0);
				entityToSpawn.setYHeadRot(0);
				entityToSpawn.setDeltaMovement(0, 0, 0);
				if (entityToSpawn instanceof Mob _mobToSpawn)
					_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
				_level.addFreshEntity(entityToSpawn);
			}
			HowToOwnADragonMod.queueServerWork(1, () -> {
				if (!world.getEntitiesOfClass(AdolescentNadderFemaleEntity.class, AABB.ofSize(new Vec3(x, y, z), 10, 10, 10), e -> true).isEmpty()) {
					((Entity) world.getEntitiesOfClass(AdolescentNadderFemaleEntity.class, AABB.ofSize(new Vec3(x, y, z), 10, 10, 10), e -> true).stream().sorted(new Object() {
						Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
							return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
						}
					}.compareDistOf(x, y, z)).findFirst().orElse(null)).getPersistentData().putString("naddercolor", (entity.getPersistentData().getString("naddercolor")));
					if (!entity.level.isClientSide())
						entity.discard();
					if ((entity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null) instanceof Player _player && !_player.level.isClientSide())
						_player.displayClientMessage(Component.literal(("Your " + entity.getDisplayName().getString() + " has succesfully grown up!")), false);
				}
			});
		} else if (entity instanceof AdolescentNadderMaleEntity) {
			if (world instanceof ServerLevel _level)
				_level.sendParticles(ParticleTypes.HAPPY_VILLAGER, x, y, z, 30, 3, 3, 3, 0.5);
			if (world instanceof ServerLevel _level) {
				Entity entityToSpawn = new NadderMaleEntity(HowToOwnADragonModEntities.NADDER_MALE.get(), _level);
				entityToSpawn.moveTo(x, y, z, 0, 0);
				entityToSpawn.setYBodyRot(0);
				entityToSpawn.setYHeadRot(0);
				entityToSpawn.setDeltaMovement(0, 0, 0);
				if (entityToSpawn instanceof Mob _mobToSpawn)
					_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
				_level.addFreshEntity(entityToSpawn);
			}
			HowToOwnADragonMod.queueServerWork(1, () -> {
				if (!world.getEntitiesOfClass(NadderMaleEntity.class, AABB.ofSize(new Vec3(x, y, z), 10, 10, 10), e -> true).isEmpty()) {
					((Entity) world.getEntitiesOfClass(NadderMaleEntity.class, AABB.ofSize(new Vec3(x, y, z), 10, 10, 10), e -> true).stream().sorted(new Object() {
						Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
							return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
						}
					}.compareDistOf(x, y, z)).findFirst().orElse(null)).getPersistentData().putString("naddercolor", (entity.getPersistentData().getString("naddercolor")));
					if (!entity.level.isClientSide())
						entity.discard();
					if ((entity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null) instanceof Player _player && !_player.level.isClientSide())
						_player.displayClientMessage(Component.literal(("Your " + entity.getDisplayName().getString() + " has succesfully grown up!")), false);
				}
			});
		} else if (entity instanceof AdolescentNadderFemaleEntity) {
			if (world instanceof ServerLevel _level)
				_level.sendParticles(ParticleTypes.HAPPY_VILLAGER, x, y, z, 30, 3, 3, 3, 0.5);
			if (world instanceof ServerLevel _level) {
				Entity entityToSpawn = new NadderFemaleEntity(HowToOwnADragonModEntities.NADDER_FEMALE.get(), _level);
				entityToSpawn.moveTo(x, y, z, 0, 0);
				entityToSpawn.setYBodyRot(0);
				entityToSpawn.setYHeadRot(0);
				entityToSpawn.setDeltaMovement(0, 0, 0);
				if (entityToSpawn instanceof Mob _mobToSpawn)
					_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
				_level.addFreshEntity(entityToSpawn);
			}
			HowToOwnADragonMod.queueServerWork(1, () -> {
				if (!world.getEntitiesOfClass(NadderFemaleEntity.class, AABB.ofSize(new Vec3(x, y, z), 10, 10, 10), e -> true).isEmpty()) {
					((Entity) world.getEntitiesOfClass(NadderFemaleEntity.class, AABB.ofSize(new Vec3(x, y, z), 10, 10, 10), e -> true).stream().sorted(new Object() {
						Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
							return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
						}
					}.compareDistOf(x, y, z)).findFirst().orElse(null)).getPersistentData().putString("naddercolor", (entity.getPersistentData().getString("naddercolor")));
					if (!entity.level.isClientSide())
						entity.discard();
					if ((entity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null) instanceof Player _player && !_player.level.isClientSide())
						_player.displayClientMessage(Component.literal(("Your " + entity.getDisplayName().getString() + " has succesfully grown up!")), false);
				}
			});
		}
	}
}
