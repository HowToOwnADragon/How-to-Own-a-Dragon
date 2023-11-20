package net.mcreator.howtoownadragon.procedures;

import java.util.Comparator;
import net.mcreator.howtoownadragon.entity.AdolescentTTFemaleEntity;
import net.mcreator.howtoownadragon.entity.AdolescentTTMaleEntity;
import net.mcreator.howtoownadragon.entity.BabyTTFemaleEntity;
import net.mcreator.howtoownadragon.entity.BabyTTMaleEntity;
import net.mcreator.howtoownadragon.entity.JuvenileTTFemaleEntity;
import net.mcreator.howtoownadragon.entity.JuvenileTTMaleEntity;
import net.mcreator.howtoownadragon.entity.TTFemaleEntity;
import net.mcreator.howtoownadragon.entity.TTMaleEntity;
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

public class GreenGrowUpProcedureTTProcedure {
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
         if (entity instanceof BabyTTMaleEntity) {
            if (!entity.f_19853_.m_5776_()) {
               entity.m_146870_();
            }

            if (world instanceof ServerLevel) {
               _level = (ServerLevel)world;
               _level.m_8767_(ParticleTypes.f_123748_, x, y, z, 30, 3.0D, 3.0D, 3.0D, 0.5D);
            }

            if (world instanceof ServerLevel) {
               _level = (ServerLevel)world;
               Entity entityToSpawn = new JuvenileTTMaleEntity((EntityType)HowToOwnADragonModEntities.JUVENILE_TT_MALE.get(), _level);
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

            ((Entity)world.m_6443_(JuvenileTTMaleEntity.class, AABB.m_165882_(new Vec3(x, y, z), 10.0D, 10.0D, 10.0D), (e) -> {
               return true;
            }).stream().sorted(((<undefinedtype>)(new Object() {
               Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                  return Comparator.comparingDouble((_entcnd) -> {
                     return _entcnd.m_20275_(_x, _y, _z);
                  });
               }
            })).compareDistOf(x, y, z)).findFirst().orElse((Object)null)).getPersistentData().m_128359_("ttcolor", "green");
            var14 = (Entity)world.m_6443_(JuvenileTTMaleEntity.class, AABB.m_165882_(new Vec3(x, y, z), 10.0D, 10.0D, 10.0D), (e) -> {
               return true;
            }).stream().sorted(((<undefinedtype>)(new Object() {
               Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                  return Comparator.comparingDouble((_entcnd) -> {
                     return _entcnd.m_20275_(_x, _y, _z);
                  });
               }
            })).compareDistOf(x, y, z)).findFirst().orElse((Object)null);
            if (var14 instanceof JuvenileTTMaleEntity) {
               JuvenileTTMaleEntity animatable = (JuvenileTTMaleEntity)var14;
               animatable.setTexture("greentt");
            }

            var17 = (Entity)world.m_6443_(JuvenileTTMaleEntity.class, AABB.m_165882_(new Vec3(x, y, z), 10.0D, 10.0D, 10.0D), (e) -> {
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
         } else if (entity instanceof BabyTTFemaleEntity) {
            if (!entity.f_19853_.m_5776_()) {
               entity.m_146870_();
            }

            if (world instanceof ServerLevel) {
               _level = (ServerLevel)world;
               _level.m_8767_(ParticleTypes.f_123748_, x, y, z, 30, 3.0D, 3.0D, 3.0D, 0.5D);
            }

            if (world instanceof ServerLevel) {
               _level = (ServerLevel)world;
               Entity entityToSpawn = new JuvenileTTFemaleEntity((EntityType)HowToOwnADragonModEntities.JUVENILE_TT_FEMALE.get(), _level);
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

            ((Entity)world.m_6443_(JuvenileTTFemaleEntity.class, AABB.m_165882_(new Vec3(x, y, z), 10.0D, 10.0D, 10.0D), (e) -> {
               return true;
            }).stream().sorted(((<undefinedtype>)(new Object() {
               Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                  return Comparator.comparingDouble((_entcnd) -> {
                     return _entcnd.m_20275_(_x, _y, _z);
                  });
               }
            })).compareDistOf(x, y, z)).findFirst().orElse((Object)null)).getPersistentData().m_128359_("ttcolor", "green");
            var14 = (Entity)world.m_6443_(JuvenileTTFemaleEntity.class, AABB.m_165882_(new Vec3(x, y, z), 10.0D, 10.0D, 10.0D), (e) -> {
               return true;
            }).stream().sorted(((<undefinedtype>)(new Object() {
               Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                  return Comparator.comparingDouble((_entcnd) -> {
                     return _entcnd.m_20275_(_x, _y, _z);
                  });
               }
            })).compareDistOf(x, y, z)).findFirst().orElse((Object)null);
            if (var14 instanceof JuvenileTTFemaleEntity) {
               JuvenileTTFemaleEntity animatable = (JuvenileTTFemaleEntity)var14;
               animatable.setTexture("greentt");
            }

            var17 = (Entity)world.m_6443_(JuvenileTTFemaleEntity.class, AABB.m_165882_(new Vec3(x, y, z), 10.0D, 10.0D, 10.0D), (e) -> {
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
         } else if (entity instanceof JuvenileTTMaleEntity) {
            if (!entity.f_19853_.m_5776_()) {
               entity.m_146870_();
            }

            if (world instanceof ServerLevel) {
               _level = (ServerLevel)world;
               _level.m_8767_(ParticleTypes.f_123748_, x, y, z, 30, 3.0D, 3.0D, 3.0D, 0.5D);
            }

            if (world instanceof ServerLevel) {
               _level = (ServerLevel)world;
               Entity entityToSpawn = new AdolescentTTMaleEntity((EntityType)HowToOwnADragonModEntities.ADOLESCENT_TT_MALE.get(), _level);
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

            ((Entity)world.m_6443_(AdolescentTTMaleEntity.class, AABB.m_165882_(new Vec3(x, y, z), 10.0D, 10.0D, 10.0D), (e) -> {
               return true;
            }).stream().sorted(((<undefinedtype>)(new Object() {
               Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                  return Comparator.comparingDouble((_entcnd) -> {
                     return _entcnd.m_20275_(_x, _y, _z);
                  });
               }
            })).compareDistOf(x, y, z)).findFirst().orElse((Object)null)).getPersistentData().m_128359_("ttcolor", "green");
            var14 = (Entity)world.m_6443_(AdolescentTTMaleEntity.class, AABB.m_165882_(new Vec3(x, y, z), 10.0D, 10.0D, 10.0D), (e) -> {
               return true;
            }).stream().sorted(((<undefinedtype>)(new Object() {
               Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                  return Comparator.comparingDouble((_entcnd) -> {
                     return _entcnd.m_20275_(_x, _y, _z);
                  });
               }
            })).compareDistOf(x, y, z)).findFirst().orElse((Object)null);
            if (var14 instanceof AdolescentTTMaleEntity) {
               AdolescentTTMaleEntity animatable = (AdolescentTTMaleEntity)var14;
               animatable.setTexture("greentt");
            }

            var17 = (Entity)world.m_6443_(AdolescentTTMaleEntity.class, AABB.m_165882_(new Vec3(x, y, z), 10.0D, 10.0D, 10.0D), (e) -> {
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
         } else if (entity instanceof JuvenileTTFemaleEntity) {
            if (!entity.f_19853_.m_5776_()) {
               entity.m_146870_();
            }

            if (world instanceof ServerLevel) {
               _level = (ServerLevel)world;
               _level.m_8767_(ParticleTypes.f_123748_, x, y, z, 30, 3.0D, 3.0D, 3.0D, 0.5D);
            }

            if (world instanceof ServerLevel) {
               _level = (ServerLevel)world;
               Entity entityToSpawn = new AdolescentTTFemaleEntity((EntityType)HowToOwnADragonModEntities.ADOLESCENT_TT_FEMALE.get(), _level);
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

            ((Entity)world.m_6443_(AdolescentTTFemaleEntity.class, AABB.m_165882_(new Vec3(x, y, z), 10.0D, 10.0D, 10.0D), (e) -> {
               return true;
            }).stream().sorted(((<undefinedtype>)(new Object() {
               Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                  return Comparator.comparingDouble((_entcnd) -> {
                     return _entcnd.m_20275_(_x, _y, _z);
                  });
               }
            })).compareDistOf(x, y, z)).findFirst().orElse((Object)null)).getPersistentData().m_128359_("ttcolor", "green");
            var14 = (Entity)world.m_6443_(AdolescentTTFemaleEntity.class, AABB.m_165882_(new Vec3(x, y, z), 10.0D, 10.0D, 10.0D), (e) -> {
               return true;
            }).stream().sorted(((<undefinedtype>)(new Object() {
               Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                  return Comparator.comparingDouble((_entcnd) -> {
                     return _entcnd.m_20275_(_x, _y, _z);
                  });
               }
            })).compareDistOf(x, y, z)).findFirst().orElse((Object)null);
            if (var14 instanceof AdolescentTTFemaleEntity) {
               AdolescentTTFemaleEntity animatable = (AdolescentTTFemaleEntity)var14;
               animatable.setTexture("greentt");
            }

            var17 = (Entity)world.m_6443_(AdolescentTTFemaleEntity.class, AABB.m_165882_(new Vec3(x, y, z), 10.0D, 10.0D, 10.0D), (e) -> {
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
         } else if (entity instanceof AdolescentTTMaleEntity) {
            if (!entity.f_19853_.m_5776_()) {
               entity.m_146870_();
            }

            if (world instanceof ServerLevel) {
               _level = (ServerLevel)world;
               _level.m_8767_(ParticleTypes.f_123748_, x, y, z, 30, 3.0D, 3.0D, 3.0D, 0.5D);
            }

            if (world instanceof ServerLevel) {
               _level = (ServerLevel)world;
               Entity entityToSpawn = new TTMaleEntity((EntityType)HowToOwnADragonModEntities.TT_MALE.get(), _level);
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

            ((Entity)world.m_6443_(TTMaleEntity.class, AABB.m_165882_(new Vec3(x, y, z), 10.0D, 10.0D, 10.0D), (e) -> {
               return true;
            }).stream().sorted(((<undefinedtype>)(new Object() {
               Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                  return Comparator.comparingDouble((_entcnd) -> {
                     return _entcnd.m_20275_(_x, _y, _z);
                  });
               }
            })).compareDistOf(x, y, z)).findFirst().orElse((Object)null)).getPersistentData().m_128359_("ttcolor", "green");
            var14 = (Entity)world.m_6443_(TTMaleEntity.class, AABB.m_165882_(new Vec3(x, y, z), 10.0D, 10.0D, 10.0D), (e) -> {
               return true;
            }).stream().sorted(((<undefinedtype>)(new Object() {
               Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                  return Comparator.comparingDouble((_entcnd) -> {
                     return _entcnd.m_20275_(_x, _y, _z);
                  });
               }
            })).compareDistOf(x, y, z)).findFirst().orElse((Object)null);
            if (var14 instanceof TTMaleEntity) {
               TTMaleEntity animatable = (TTMaleEntity)var14;
               animatable.setTexture("greentt");
            }

            var17 = (Entity)world.m_6443_(TTMaleEntity.class, AABB.m_165882_(new Vec3(x, y, z), 10.0D, 10.0D, 10.0D), (e) -> {
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
         } else if (entity instanceof AdolescentTTFemaleEntity) {
            if (!entity.f_19853_.m_5776_()) {
               entity.m_146870_();
            }

            if (world instanceof ServerLevel) {
               _level = (ServerLevel)world;
               _level.m_8767_(ParticleTypes.f_123748_, x, y, z, 30, 3.0D, 3.0D, 3.0D, 0.5D);
            }

            if (world instanceof ServerLevel) {
               _level = (ServerLevel)world;
               Entity entityToSpawn = new TTFemaleEntity((EntityType)HowToOwnADragonModEntities.TT_FEMALE.get(), _level);
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

            ((Entity)world.m_6443_(TTFemaleEntity.class, AABB.m_165882_(new Vec3(x, y, z), 10.0D, 10.0D, 10.0D), (e) -> {
               return true;
            }).stream().sorted(((<undefinedtype>)(new Object() {
               Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                  return Comparator.comparingDouble((_entcnd) -> {
                     return _entcnd.m_20275_(_x, _y, _z);
                  });
               }
            })).compareDistOf(x, y, z)).findFirst().orElse((Object)null)).getPersistentData().m_128359_("ttcolor", "green");
            var14 = (Entity)world.m_6443_(TTFemaleEntity.class, AABB.m_165882_(new Vec3(x, y, z), 10.0D, 10.0D, 10.0D), (e) -> {
               return true;
            }).stream().sorted(((<undefinedtype>)(new Object() {
               Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                  return Comparator.comparingDouble((_entcnd) -> {
                     return _entcnd.m_20275_(_x, _y, _z);
                  });
               }
            })).compareDistOf(x, y, z)).findFirst().orElse((Object)null);
            if (var14 instanceof TTFemaleEntity) {
               TTFemaleEntity animatable = (TTFemaleEntity)var14;
               animatable.setTexture("greentt");
            }

            var17 = (Entity)world.m_6443_(TTFemaleEntity.class, AABB.m_165882_(new Vec3(x, y, z), 10.0D, 10.0D, 10.0D), (e) -> {
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
         }

      }
   }
}
