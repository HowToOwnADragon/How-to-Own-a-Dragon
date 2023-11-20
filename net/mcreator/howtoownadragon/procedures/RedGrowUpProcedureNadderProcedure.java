package net.mcreator.howtoownadragon.procedures;

import java.util.Comparator;
import net.mcreator.howtoownadragon.entity.AdolescentNadderFemaleEntity;
import net.mcreator.howtoownadragon.entity.AdolescentNadderMaleEntity;
import net.mcreator.howtoownadragon.entity.BabyNadderFemaleEntity;
import net.mcreator.howtoownadragon.entity.BabyNadderMaleEntity;
import net.mcreator.howtoownadragon.entity.JuvenileNadderFemaleEntity;
import net.mcreator.howtoownadragon.entity.JuvenileNadderMaleEntity;
import net.mcreator.howtoownadragon.entity.NadderFemaleEntity;
import net.mcreator.howtoownadragon.entity.NadderMaleEntity;
import net.mcreator.howtoownadragon.init.HowToOwnADragonModEntities;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.chat.Component;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.SpawnGroupData;
import net.minecraft.world.entity.TamableAnimal;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.phys.Vec3;

public class RedGrowUpProcedureNadderProcedure {
   public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, Entity sourceentity) {
      if (entity != null && sourceentity != null) {
         ServerLevel _level;
         Mob _mobToSpawn;
         TamableAnimal _tamEnt;
         Entity var14;
         Player _player;
         LivingEntity var10000;
         Entity var17;
         LivingEntity var19;
         if (entity instanceof BabyNadderMaleEntity) {
            if (!entity.f_19853_.m_5776_()) {
               entity.m_146870_();
            }

            if (world instanceof ServerLevel) {
               _level = (ServerLevel)world;
               _level.m_8767_(ParticleTypes.f_123748_, x, y, z, 30, 3.0D, 3.0D, 3.0D, 0.5D);
            }

            if (world instanceof ServerLevel) {
               _level = (ServerLevel)world;
               Entity entityToSpawn = new JuvenileNadderMaleEntity((EntityType)HowToOwnADragonModEntities.JUVENILE_NADDER_MALE.get(), _level);
               entityToSpawn.m_7678_(x, y, z, 0.0F, 0.0F);
               entityToSpawn.m_5618_(0.0F);
               entityToSpawn.m_5616_(0.0F);
               entityToSpawn.m_20334_(0.0D, 0.0D, 0.0D);
               if (entityToSpawn instanceof Mob) {
                  _mobToSpawn = (Mob)entityToSpawn;
                  _mobToSpawn.m_6518_(_level, _level.m_6436_(entityToSpawn.m_20183_()), MobSpawnType.MOB_SUMMONED, (SpawnGroupData)null, (CompoundTag)null);
               }

               _level.m_7967_(entityToSpawn);
            }

            ((Entity)world.m_6443_(JuvenileNadderMaleEntity.class, AABB.m_165882_(new Vec3(x, y, z), 10.0D, 10.0D, 10.0D), (e) -> {
               return true;
            }).stream().sorted(((<undefinedtype>)(new Object() {
               Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                  return Comparator.comparingDouble((_entcnd) -> {
                     return _entcnd.m_20275_(_x, _y, _z);
                  });
               }
            })).compareDistOf(x, y, z)).findFirst().orElse((Object)null)).getPersistentData().m_128359_("naddercolor", "red");
            var14 = (Entity)world.m_6443_(JuvenileNadderMaleEntity.class, AABB.m_165882_(new Vec3(x, y, z), 10.0D, 10.0D, 10.0D), (e) -> {
               return true;
            }).stream().sorted(((<undefinedtype>)(new Object() {
               Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                  return Comparator.comparingDouble((_entcnd) -> {
                     return _entcnd.m_20275_(_x, _y, _z);
                  });
               }
            })).compareDistOf(x, y, z)).findFirst().orElse((Object)null);
            if (var14 instanceof JuvenileNadderMaleEntity) {
               JuvenileNadderMaleEntity animatable = (JuvenileNadderMaleEntity)var14;
               animatable.setTexture("rednadder");
            }

            var17 = (Entity)world.m_6443_(JuvenileNadderMaleEntity.class, AABB.m_165882_(new Vec3(x, y, z), 10.0D, 10.0D, 10.0D), (e) -> {
               return true;
            }).stream().sorted(((<undefinedtype>)(new Object() {
               Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                  return Comparator.comparingDouble((_entcnd) -> {
                     return _entcnd.m_20275_(_x, _y, _z);
                  });
               }
            })).compareDistOf(x, y, z)).findFirst().orElse((Object)null);
            if (var17 instanceof TamableAnimal) {
               _tamEnt = (TamableAnimal)var17;
               if (sourceentity instanceof Player) {
                  _player = (Player)sourceentity;
                  _tamEnt.m_21828_(_player);
               }
            }

            if (entity instanceof TamableAnimal) {
               _tamEnt = (TamableAnimal)entity;
               var10000 = _tamEnt.m_269323_();
            } else {
               var10000 = null;
            }

            var19 = var10000;
            if (var19 instanceof Player) {
               _player = (Player)var19;
               if (!_player.f_19853_.m_5776_()) {
                  _player.m_5661_(Component.m_237113_("Your " + entity.m_5446_().getString() + "has succesfully grown up!"), false);
               }
            }
         } else if (entity instanceof BabyNadderFemaleEntity) {
            if (!entity.f_19853_.m_5776_()) {
               entity.m_146870_();
            }

            if (world instanceof ServerLevel) {
               _level = (ServerLevel)world;
               _level.m_8767_(ParticleTypes.f_123748_, x, y, z, 30, 3.0D, 3.0D, 3.0D, 0.5D);
            }

            if (world instanceof ServerLevel) {
               _level = (ServerLevel)world;
               Entity entityToSpawn = new JuvenileNadderFemaleEntity((EntityType)HowToOwnADragonModEntities.JUVENILE_NADDER_FEMALE.get(), _level);
               entityToSpawn.m_7678_(x, y, z, 0.0F, 0.0F);
               entityToSpawn.m_5618_(0.0F);
               entityToSpawn.m_5616_(0.0F);
               entityToSpawn.m_20334_(0.0D, 0.0D, 0.0D);
               if (entityToSpawn instanceof Mob) {
                  _mobToSpawn = (Mob)entityToSpawn;
                  _mobToSpawn.m_6518_(_level, _level.m_6436_(entityToSpawn.m_20183_()), MobSpawnType.MOB_SUMMONED, (SpawnGroupData)null, (CompoundTag)null);
               }

               _level.m_7967_(entityToSpawn);
            }

            ((Entity)world.m_6443_(JuvenileNadderFemaleEntity.class, AABB.m_165882_(new Vec3(x, y, z), 10.0D, 10.0D, 10.0D), (e) -> {
               return true;
            }).stream().sorted(((<undefinedtype>)(new Object() {
               Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                  return Comparator.comparingDouble((_entcnd) -> {
                     return _entcnd.m_20275_(_x, _y, _z);
                  });
               }
            })).compareDistOf(x, y, z)).findFirst().orElse((Object)null)).getPersistentData().m_128359_("naddercolor", "red");
            var14 = (Entity)world.m_6443_(JuvenileNadderFemaleEntity.class, AABB.m_165882_(new Vec3(x, y, z), 10.0D, 10.0D, 10.0D), (e) -> {
               return true;
            }).stream().sorted(((<undefinedtype>)(new Object() {
               Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                  return Comparator.comparingDouble((_entcnd) -> {
                     return _entcnd.m_20275_(_x, _y, _z);
                  });
               }
            })).compareDistOf(x, y, z)).findFirst().orElse((Object)null);
            if (var14 instanceof JuvenileNadderFemaleEntity) {
               JuvenileNadderFemaleEntity animatable = (JuvenileNadderFemaleEntity)var14;
               animatable.setTexture("rednadder");
            }

            var17 = (Entity)world.m_6443_(JuvenileNadderFemaleEntity.class, AABB.m_165882_(new Vec3(x, y, z), 10.0D, 10.0D, 10.0D), (e) -> {
               return true;
            }).stream().sorted(((<undefinedtype>)(new Object() {
               Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                  return Comparator.comparingDouble((_entcnd) -> {
                     return _entcnd.m_20275_(_x, _y, _z);
                  });
               }
            })).compareDistOf(x, y, z)).findFirst().orElse((Object)null);
            if (var17 instanceof TamableAnimal) {
               _tamEnt = (TamableAnimal)var17;
               if (sourceentity instanceof Player) {
                  _player = (Player)sourceentity;
                  _tamEnt.m_21828_(_player);
               }
            }

            if (entity instanceof TamableAnimal) {
               _tamEnt = (TamableAnimal)entity;
               var10000 = _tamEnt.m_269323_();
            } else {
               var10000 = null;
            }

            var19 = var10000;
            if (var19 instanceof Player) {
               _player = (Player)var19;
               if (!_player.f_19853_.m_5776_()) {
                  _player.m_5661_(Component.m_237113_("Your " + entity.m_5446_().getString() + "has succesfully grown up!"), false);
               }
            }
         } else if (entity instanceof JuvenileNadderMaleEntity) {
            if (!entity.f_19853_.m_5776_()) {
               entity.m_146870_();
            }

            if (world instanceof ServerLevel) {
               _level = (ServerLevel)world;
               _level.m_8767_(ParticleTypes.f_123748_, x, y, z, 30, 3.0D, 3.0D, 3.0D, 0.5D);
            }

            if (world instanceof ServerLevel) {
               _level = (ServerLevel)world;
               Entity entityToSpawn = new AdolescentNadderMaleEntity((EntityType)HowToOwnADragonModEntities.ADOLESCENT_NADDER_MALE.get(), _level);
               entityToSpawn.m_7678_(x, y, z, 0.0F, 0.0F);
               entityToSpawn.m_5618_(0.0F);
               entityToSpawn.m_5616_(0.0F);
               entityToSpawn.m_20334_(0.0D, 0.0D, 0.0D);
               if (entityToSpawn instanceof Mob) {
                  _mobToSpawn = (Mob)entityToSpawn;
                  _mobToSpawn.m_6518_(_level, _level.m_6436_(entityToSpawn.m_20183_()), MobSpawnType.MOB_SUMMONED, (SpawnGroupData)null, (CompoundTag)null);
               }

               _level.m_7967_(entityToSpawn);
            }

            ((Entity)world.m_6443_(AdolescentNadderMaleEntity.class, AABB.m_165882_(new Vec3(x, y, z), 10.0D, 10.0D, 10.0D), (e) -> {
               return true;
            }).stream().sorted(((<undefinedtype>)(new Object() {
               Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                  return Comparator.comparingDouble((_entcnd) -> {
                     return _entcnd.m_20275_(_x, _y, _z);
                  });
               }
            })).compareDistOf(x, y, z)).findFirst().orElse((Object)null)).getPersistentData().m_128359_("naddercolor", "red");
            var14 = (Entity)world.m_6443_(AdolescentNadderMaleEntity.class, AABB.m_165882_(new Vec3(x, y, z), 10.0D, 10.0D, 10.0D), (e) -> {
               return true;
            }).stream().sorted(((<undefinedtype>)(new Object() {
               Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                  return Comparator.comparingDouble((_entcnd) -> {
                     return _entcnd.m_20275_(_x, _y, _z);
                  });
               }
            })).compareDistOf(x, y, z)).findFirst().orElse((Object)null);
            if (var14 instanceof AdolescentNadderMaleEntity) {
               AdolescentNadderMaleEntity animatable = (AdolescentNadderMaleEntity)var14;
               animatable.setTexture("rednadder");
            }

            var17 = (Entity)world.m_6443_(AdolescentNadderMaleEntity.class, AABB.m_165882_(new Vec3(x, y, z), 10.0D, 10.0D, 10.0D), (e) -> {
               return true;
            }).stream().sorted(((<undefinedtype>)(new Object() {
               Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                  return Comparator.comparingDouble((_entcnd) -> {
                     return _entcnd.m_20275_(_x, _y, _z);
                  });
               }
            })).compareDistOf(x, y, z)).findFirst().orElse((Object)null);
            if (var17 instanceof TamableAnimal) {
               _tamEnt = (TamableAnimal)var17;
               if (sourceentity instanceof Player) {
                  _player = (Player)sourceentity;
                  _tamEnt.m_21828_(_player);
               }
            }

            if (entity instanceof TamableAnimal) {
               _tamEnt = (TamableAnimal)entity;
               var10000 = _tamEnt.m_269323_();
            } else {
               var10000 = null;
            }

            var19 = var10000;
            if (var19 instanceof Player) {
               _player = (Player)var19;
               if (!_player.f_19853_.m_5776_()) {
                  _player.m_5661_(Component.m_237113_("Your " + entity.m_5446_().getString() + "has succesfully grown up!"), false);
               }
            }
         } else if (entity instanceof JuvenileNadderFemaleEntity) {
            if (!entity.f_19853_.m_5776_()) {
               entity.m_146870_();
            }

            if (world instanceof ServerLevel) {
               _level = (ServerLevel)world;
               _level.m_8767_(ParticleTypes.f_123748_, x, y, z, 30, 3.0D, 3.0D, 3.0D, 0.5D);
            }

            if (world instanceof ServerLevel) {
               _level = (ServerLevel)world;
               Entity entityToSpawn = new AdolescentNadderFemaleEntity((EntityType)HowToOwnADragonModEntities.ADOLESCENT_NADDER_FEMALE.get(), _level);
               entityToSpawn.m_7678_(x, y, z, 0.0F, 0.0F);
               entityToSpawn.m_5618_(0.0F);
               entityToSpawn.m_5616_(0.0F);
               entityToSpawn.m_20334_(0.0D, 0.0D, 0.0D);
               if (entityToSpawn instanceof Mob) {
                  _mobToSpawn = (Mob)entityToSpawn;
                  _mobToSpawn.m_6518_(_level, _level.m_6436_(entityToSpawn.m_20183_()), MobSpawnType.MOB_SUMMONED, (SpawnGroupData)null, (CompoundTag)null);
               }

               _level.m_7967_(entityToSpawn);
            }

            ((Entity)world.m_6443_(AdolescentNadderFemaleEntity.class, AABB.m_165882_(new Vec3(x, y, z), 10.0D, 10.0D, 10.0D), (e) -> {
               return true;
            }).stream().sorted(((<undefinedtype>)(new Object() {
               Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                  return Comparator.comparingDouble((_entcnd) -> {
                     return _entcnd.m_20275_(_x, _y, _z);
                  });
               }
            })).compareDistOf(x, y, z)).findFirst().orElse((Object)null)).getPersistentData().m_128359_("naddercolor", "red");
            var14 = (Entity)world.m_6443_(AdolescentNadderFemaleEntity.class, AABB.m_165882_(new Vec3(x, y, z), 10.0D, 10.0D, 10.0D), (e) -> {
               return true;
            }).stream().sorted(((<undefinedtype>)(new Object() {
               Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                  return Comparator.comparingDouble((_entcnd) -> {
                     return _entcnd.m_20275_(_x, _y, _z);
                  });
               }
            })).compareDistOf(x, y, z)).findFirst().orElse((Object)null);
            if (var14 instanceof AdolescentNadderFemaleEntity) {
               AdolescentNadderFemaleEntity animatable = (AdolescentNadderFemaleEntity)var14;
               animatable.setTexture("rednadder");
            }

            var17 = (Entity)world.m_6443_(AdolescentNadderFemaleEntity.class, AABB.m_165882_(new Vec3(x, y, z), 10.0D, 10.0D, 10.0D), (e) -> {
               return true;
            }).stream().sorted(((<undefinedtype>)(new Object() {
               Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                  return Comparator.comparingDouble((_entcnd) -> {
                     return _entcnd.m_20275_(_x, _y, _z);
                  });
               }
            })).compareDistOf(x, y, z)).findFirst().orElse((Object)null);
            if (var17 instanceof TamableAnimal) {
               _tamEnt = (TamableAnimal)var17;
               if (sourceentity instanceof Player) {
                  _player = (Player)sourceentity;
                  _tamEnt.m_21828_(_player);
               }
            }

            if (entity instanceof TamableAnimal) {
               _tamEnt = (TamableAnimal)entity;
               var10000 = _tamEnt.m_269323_();
            } else {
               var10000 = null;
            }

            var19 = var10000;
            if (var19 instanceof Player) {
               _player = (Player)var19;
               if (!_player.f_19853_.m_5776_()) {
                  _player.m_5661_(Component.m_237113_("Your " + entity.m_5446_().getString() + "has succesfully grown up!"), false);
               }
            }
         } else if (entity instanceof AdolescentNadderMaleEntity) {
            if (!entity.f_19853_.m_5776_()) {
               entity.m_146870_();
            }

            if (world instanceof ServerLevel) {
               _level = (ServerLevel)world;
               _level.m_8767_(ParticleTypes.f_123748_, x, y, z, 30, 3.0D, 3.0D, 3.0D, 0.5D);
            }

            if (world instanceof ServerLevel) {
               _level = (ServerLevel)world;
               Entity entityToSpawn = new NadderMaleEntity((EntityType)HowToOwnADragonModEntities.NADDER_MALE.get(), _level);
               entityToSpawn.m_7678_(x, y, z, 0.0F, 0.0F);
               entityToSpawn.m_5618_(0.0F);
               entityToSpawn.m_5616_(0.0F);
               entityToSpawn.m_20334_(0.0D, 0.0D, 0.0D);
               if (entityToSpawn instanceof Mob) {
                  _mobToSpawn = (Mob)entityToSpawn;
                  _mobToSpawn.m_6518_(_level, _level.m_6436_(entityToSpawn.m_20183_()), MobSpawnType.MOB_SUMMONED, (SpawnGroupData)null, (CompoundTag)null);
               }

               _level.m_7967_(entityToSpawn);
            }

            ((Entity)world.m_6443_(NadderMaleEntity.class, AABB.m_165882_(new Vec3(x, y, z), 10.0D, 10.0D, 10.0D), (e) -> {
               return true;
            }).stream().sorted(((<undefinedtype>)(new Object() {
               Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                  return Comparator.comparingDouble((_entcnd) -> {
                     return _entcnd.m_20275_(_x, _y, _z);
                  });
               }
            })).compareDistOf(x, y, z)).findFirst().orElse((Object)null)).getPersistentData().m_128359_("naddercolor", "red");
            var14 = (Entity)world.m_6443_(NadderMaleEntity.class, AABB.m_165882_(new Vec3(x, y, z), 10.0D, 10.0D, 10.0D), (e) -> {
               return true;
            }).stream().sorted(((<undefinedtype>)(new Object() {
               Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                  return Comparator.comparingDouble((_entcnd) -> {
                     return _entcnd.m_20275_(_x, _y, _z);
                  });
               }
            })).compareDistOf(x, y, z)).findFirst().orElse((Object)null);
            if (var14 instanceof NadderMaleEntity) {
               NadderMaleEntity animatable = (NadderMaleEntity)var14;
               animatable.setTexture("rednadder");
            }

            var17 = (Entity)world.m_6443_(NadderMaleEntity.class, AABB.m_165882_(new Vec3(x, y, z), 10.0D, 10.0D, 10.0D), (e) -> {
               return true;
            }).stream().sorted(((<undefinedtype>)(new Object() {
               Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                  return Comparator.comparingDouble((_entcnd) -> {
                     return _entcnd.m_20275_(_x, _y, _z);
                  });
               }
            })).compareDistOf(x, y, z)).findFirst().orElse((Object)null);
            if (var17 instanceof TamableAnimal) {
               _tamEnt = (TamableAnimal)var17;
               if (sourceentity instanceof Player) {
                  _player = (Player)sourceentity;
                  _tamEnt.m_21828_(_player);
               }
            }

            NBTDataGrowUpNadderMaleProcedure.execute(world, x, y, z);
            if (entity instanceof TamableAnimal) {
               _tamEnt = (TamableAnimal)entity;
               var10000 = _tamEnt.m_269323_();
            } else {
               var10000 = null;
            }

            var19 = var10000;
            if (var19 instanceof Player) {
               _player = (Player)var19;
               if (!_player.f_19853_.m_5776_()) {
                  _player.m_5661_(Component.m_237113_("Your " + entity.m_5446_().getString() + "has succesfully grown up!"), false);
               }
            }
         } else if (entity instanceof AdolescentNadderFemaleEntity) {
            if (!entity.f_19853_.m_5776_()) {
               entity.m_146870_();
            }

            if (world instanceof ServerLevel) {
               _level = (ServerLevel)world;
               _level.m_8767_(ParticleTypes.f_123748_, x, y, z, 30, 3.0D, 3.0D, 3.0D, 0.5D);
            }

            if (world instanceof ServerLevel) {
               _level = (ServerLevel)world;
               Entity entityToSpawn = new NadderFemaleEntity((EntityType)HowToOwnADragonModEntities.NADDER_FEMALE.get(), _level);
               entityToSpawn.m_7678_(x, y, z, 0.0F, 0.0F);
               entityToSpawn.m_5618_(0.0F);
               entityToSpawn.m_5616_(0.0F);
               entityToSpawn.m_20334_(0.0D, 0.0D, 0.0D);
               if (entityToSpawn instanceof Mob) {
                  _mobToSpawn = (Mob)entityToSpawn;
                  _mobToSpawn.m_6518_(_level, _level.m_6436_(entityToSpawn.m_20183_()), MobSpawnType.MOB_SUMMONED, (SpawnGroupData)null, (CompoundTag)null);
               }

               _level.m_7967_(entityToSpawn);
            }

            ((Entity)world.m_6443_(NadderFemaleEntity.class, AABB.m_165882_(new Vec3(x, y, z), 10.0D, 10.0D, 10.0D), (e) -> {
               return true;
            }).stream().sorted(((<undefinedtype>)(new Object() {
               Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                  return Comparator.comparingDouble((_entcnd) -> {
                     return _entcnd.m_20275_(_x, _y, _z);
                  });
               }
            })).compareDistOf(x, y, z)).findFirst().orElse((Object)null)).getPersistentData().m_128359_("naddercolor", "red");
            var14 = (Entity)world.m_6443_(NadderFemaleEntity.class, AABB.m_165882_(new Vec3(x, y, z), 10.0D, 10.0D, 10.0D), (e) -> {
               return true;
            }).stream().sorted(((<undefinedtype>)(new Object() {
               Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                  return Comparator.comparingDouble((_entcnd) -> {
                     return _entcnd.m_20275_(_x, _y, _z);
                  });
               }
            })).compareDistOf(x, y, z)).findFirst().orElse((Object)null);
            if (var14 instanceof NadderFemaleEntity) {
               NadderFemaleEntity animatable = (NadderFemaleEntity)var14;
               animatable.setTexture("rednadder");
            }

            var17 = (Entity)world.m_6443_(NadderFemaleEntity.class, AABB.m_165882_(new Vec3(x, y, z), 10.0D, 10.0D, 10.0D), (e) -> {
               return true;
            }).stream().sorted(((<undefinedtype>)(new Object() {
               Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                  return Comparator.comparingDouble((_entcnd) -> {
                     return _entcnd.m_20275_(_x, _y, _z);
                  });
               }
            })).compareDistOf(x, y, z)).findFirst().orElse((Object)null);
            if (var17 instanceof TamableAnimal) {
               _tamEnt = (TamableAnimal)var17;
               if (sourceentity instanceof Player) {
                  _player = (Player)sourceentity;
                  _tamEnt.m_21828_(_player);
               }
            }

            NBTDataGrowUpNadderFemaleProcedure.execute(world, x, y, z);
            if (entity instanceof TamableAnimal) {
               _tamEnt = (TamableAnimal)entity;
               var10000 = _tamEnt.m_269323_();
            } else {
               var10000 = null;
            }

            var19 = var10000;
            if (var19 instanceof Player) {
               _player = (Player)var19;
               if (!_player.f_19853_.m_5776_()) {
                  _player.m_5661_(Component.m_237113_("Your " + entity.m_5446_().getString() + "has succesfully grown up!"), false);
               }
            }
         }

      }
   }
}
