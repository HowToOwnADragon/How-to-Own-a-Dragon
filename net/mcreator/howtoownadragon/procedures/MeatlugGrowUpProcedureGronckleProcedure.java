package net.mcreator.howtoownadragon.procedures;

import java.util.Comparator;
import net.mcreator.howtoownadragon.entity.AdolescentGronckleFemaleEntity;
import net.mcreator.howtoownadragon.entity.AdolescentGronckleMaleEntity;
import net.mcreator.howtoownadragon.entity.BabyGronckleFemaleEntity;
import net.mcreator.howtoownadragon.entity.BabyGronckleMaleEntity;
import net.mcreator.howtoownadragon.entity.GronckleFemaleEntity;
import net.mcreator.howtoownadragon.entity.GronckleMaleEntity;
import net.mcreator.howtoownadragon.entity.JuvenileGronckleFemaleEntity;
import net.mcreator.howtoownadragon.entity.JuvenileGronckleMaleEntity;
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

public class MeatlugGrowUpProcedureGronckleProcedure {
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
         if (entity instanceof BabyGronckleMaleEntity) {
            if (!entity.f_19853_.m_5776_()) {
               entity.m_146870_();
            }

            if (world instanceof ServerLevel) {
               _level = (ServerLevel)world;
               _level.m_8767_(ParticleTypes.f_123748_, x, y, z, 30, 3.0D, 3.0D, 3.0D, 0.5D);
            }

            if (world instanceof ServerLevel) {
               _level = (ServerLevel)world;
               Entity entityToSpawn = new JuvenileGronckleMaleEntity((EntityType)HowToOwnADragonModEntities.JUVENILE_GRONCKLE_MALE.get(), _level);
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

            ((Entity)world.m_6443_(JuvenileGronckleMaleEntity.class, AABB.m_165882_(new Vec3(x, y, z), 10.0D, 10.0D, 10.0D), (e) -> {
               return true;
            }).stream().sorted(((<undefinedtype>)(new Object() {
               Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                  return Comparator.comparingDouble((_entcnd) -> {
                     return _entcnd.m_20275_(_x, _y, _z);
                  });
               }
            })).compareDistOf(x, y, z)).findFirst().orElse((Object)null)).getPersistentData().m_128359_("groncklecolor", "meatlug");
            var14 = (Entity)world.m_6443_(JuvenileGronckleMaleEntity.class, AABB.m_165882_(new Vec3(x, y, z), 10.0D, 10.0D, 10.0D), (e) -> {
               return true;
            }).stream().sorted(((<undefinedtype>)(new Object() {
               Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                  return Comparator.comparingDouble((_entcnd) -> {
                     return _entcnd.m_20275_(_x, _y, _z);
                  });
               }
            })).compareDistOf(x, y, z)).findFirst().orElse((Object)null);
            if (var14 instanceof JuvenileGronckleMaleEntity) {
               JuvenileGronckleMaleEntity animatable = (JuvenileGronckleMaleEntity)var14;
               animatable.setTexture("juvimeatlug");
            }

            var17 = (Entity)world.m_6443_(JuvenileGronckleMaleEntity.class, AABB.m_165882_(new Vec3(x, y, z), 10.0D, 10.0D, 10.0D), (e) -> {
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
         } else if (entity instanceof BabyGronckleFemaleEntity) {
            if (!entity.f_19853_.m_5776_()) {
               entity.m_146870_();
            }

            if (world instanceof ServerLevel) {
               _level = (ServerLevel)world;
               _level.m_8767_(ParticleTypes.f_123748_, x, y, z, 30, 3.0D, 3.0D, 3.0D, 0.5D);
            }

            if (world instanceof ServerLevel) {
               _level = (ServerLevel)world;
               Entity entityToSpawn = new JuvenileGronckleFemaleEntity((EntityType)HowToOwnADragonModEntities.JUVENILE_GRONCKLE_FEMALE.get(), _level);
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

            ((Entity)world.m_6443_(JuvenileGronckleFemaleEntity.class, AABB.m_165882_(new Vec3(x, y, z), 10.0D, 10.0D, 10.0D), (e) -> {
               return true;
            }).stream().sorted(((<undefinedtype>)(new Object() {
               Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                  return Comparator.comparingDouble((_entcnd) -> {
                     return _entcnd.m_20275_(_x, _y, _z);
                  });
               }
            })).compareDistOf(x, y, z)).findFirst().orElse((Object)null)).getPersistentData().m_128359_("groncklecolor", "meatlug");
            var14 = (Entity)world.m_6443_(JuvenileGronckleFemaleEntity.class, AABB.m_165882_(new Vec3(x, y, z), 10.0D, 10.0D, 10.0D), (e) -> {
               return true;
            }).stream().sorted(((<undefinedtype>)(new Object() {
               Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                  return Comparator.comparingDouble((_entcnd) -> {
                     return _entcnd.m_20275_(_x, _y, _z);
                  });
               }
            })).compareDistOf(x, y, z)).findFirst().orElse((Object)null);
            if (var14 instanceof JuvenileGronckleFemaleEntity) {
               JuvenileGronckleFemaleEntity animatable = (JuvenileGronckleFemaleEntity)var14;
               animatable.setTexture("juvimeatlug");
            }

            var17 = (Entity)world.m_6443_(JuvenileGronckleFemaleEntity.class, AABB.m_165882_(new Vec3(x, y, z), 10.0D, 10.0D, 10.0D), (e) -> {
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
         } else if (entity instanceof JuvenileGronckleMaleEntity) {
            if (!entity.f_19853_.m_5776_()) {
               entity.m_146870_();
            }

            if (world instanceof ServerLevel) {
               _level = (ServerLevel)world;
               _level.m_8767_(ParticleTypes.f_123748_, x, y, z, 30, 3.0D, 3.0D, 3.0D, 0.5D);
            }

            if (world instanceof ServerLevel) {
               _level = (ServerLevel)world;
               Entity entityToSpawn = new AdolescentGronckleMaleEntity((EntityType)HowToOwnADragonModEntities.ADOLESCENT_GRONCKLE_MALE.get(), _level);
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

            ((Entity)world.m_6443_(AdolescentGronckleMaleEntity.class, AABB.m_165882_(new Vec3(x, y, z), 10.0D, 10.0D, 10.0D), (e) -> {
               return true;
            }).stream().sorted(((<undefinedtype>)(new Object() {
               Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                  return Comparator.comparingDouble((_entcnd) -> {
                     return _entcnd.m_20275_(_x, _y, _z);
                  });
               }
            })).compareDistOf(x, y, z)).findFirst().orElse((Object)null)).getPersistentData().m_128359_("groncklecolor", "meatlug");
            var14 = (Entity)world.m_6443_(AdolescentGronckleMaleEntity.class, AABB.m_165882_(new Vec3(x, y, z), 10.0D, 10.0D, 10.0D), (e) -> {
               return true;
            }).stream().sorted(((<undefinedtype>)(new Object() {
               Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                  return Comparator.comparingDouble((_entcnd) -> {
                     return _entcnd.m_20275_(_x, _y, _z);
                  });
               }
            })).compareDistOf(x, y, z)).findFirst().orElse((Object)null);
            if (var14 instanceof AdolescentGronckleMaleEntity) {
               AdolescentGronckleMaleEntity animatable = (AdolescentGronckleMaleEntity)var14;
               animatable.setTexture("adomeatlug");
            }

            var17 = (Entity)world.m_6443_(AdolescentGronckleMaleEntity.class, AABB.m_165882_(new Vec3(x, y, z), 10.0D, 10.0D, 10.0D), (e) -> {
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
         } else if (entity instanceof JuvenileGronckleFemaleEntity) {
            if (!entity.f_19853_.m_5776_()) {
               entity.m_146870_();
            }

            if (world instanceof ServerLevel) {
               _level = (ServerLevel)world;
               _level.m_8767_(ParticleTypes.f_123748_, x, y, z, 30, 3.0D, 3.0D, 3.0D, 0.5D);
            }

            if (world instanceof ServerLevel) {
               _level = (ServerLevel)world;
               Entity entityToSpawn = new AdolescentGronckleFemaleEntity((EntityType)HowToOwnADragonModEntities.ADOLESCENT_GRONCKLE_FEMALE.get(), _level);
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

            ((Entity)world.m_6443_(AdolescentGronckleFemaleEntity.class, AABB.m_165882_(new Vec3(x, y, z), 10.0D, 10.0D, 10.0D), (e) -> {
               return true;
            }).stream().sorted(((<undefinedtype>)(new Object() {
               Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                  return Comparator.comparingDouble((_entcnd) -> {
                     return _entcnd.m_20275_(_x, _y, _z);
                  });
               }
            })).compareDistOf(x, y, z)).findFirst().orElse((Object)null)).getPersistentData().m_128359_("groncklecolor", "meatlug");
            var14 = (Entity)world.m_6443_(AdolescentGronckleFemaleEntity.class, AABB.m_165882_(new Vec3(x, y, z), 10.0D, 10.0D, 10.0D), (e) -> {
               return true;
            }).stream().sorted(((<undefinedtype>)(new Object() {
               Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                  return Comparator.comparingDouble((_entcnd) -> {
                     return _entcnd.m_20275_(_x, _y, _z);
                  });
               }
            })).compareDistOf(x, y, z)).findFirst().orElse((Object)null);
            if (var14 instanceof AdolescentGronckleFemaleEntity) {
               AdolescentGronckleFemaleEntity animatable = (AdolescentGronckleFemaleEntity)var14;
               animatable.setTexture("adomeatlug");
            }

            var17 = (Entity)world.m_6443_(AdolescentGronckleFemaleEntity.class, AABB.m_165882_(new Vec3(x, y, z), 10.0D, 10.0D, 10.0D), (e) -> {
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
         } else if (entity instanceof AdolescentGronckleMaleEntity) {
            if (!entity.f_19853_.m_5776_()) {
               entity.m_146870_();
            }

            if (world instanceof ServerLevel) {
               _level = (ServerLevel)world;
               _level.m_8767_(ParticleTypes.f_123748_, x, y, z, 30, 3.0D, 3.0D, 3.0D, 0.5D);
            }

            if (world instanceof ServerLevel) {
               _level = (ServerLevel)world;
               Entity entityToSpawn = new GronckleMaleEntity((EntityType)HowToOwnADragonModEntities.GRONCKLE_MALE.get(), _level);
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

            ((Entity)world.m_6443_(GronckleMaleEntity.class, AABB.m_165882_(new Vec3(x, y, z), 10.0D, 10.0D, 10.0D), (e) -> {
               return true;
            }).stream().sorted(((<undefinedtype>)(new Object() {
               Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                  return Comparator.comparingDouble((_entcnd) -> {
                     return _entcnd.m_20275_(_x, _y, _z);
                  });
               }
            })).compareDistOf(x, y, z)).findFirst().orElse((Object)null)).getPersistentData().m_128359_("groncklecolor", "meatlug");
            var14 = (Entity)world.m_6443_(GronckleMaleEntity.class, AABB.m_165882_(new Vec3(x, y, z), 10.0D, 10.0D, 10.0D), (e) -> {
               return true;
            }).stream().sorted(((<undefinedtype>)(new Object() {
               Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                  return Comparator.comparingDouble((_entcnd) -> {
                     return _entcnd.m_20275_(_x, _y, _z);
                  });
               }
            })).compareDistOf(x, y, z)).findFirst().orElse((Object)null);
            if (var14 instanceof GronckleMaleEntity) {
               GronckleMaleEntity animatable = (GronckleMaleEntity)var14;
               animatable.setTexture("meatlug");
            }

            var17 = (Entity)world.m_6443_(GronckleMaleEntity.class, AABB.m_165882_(new Vec3(x, y, z), 10.0D, 10.0D, 10.0D), (e) -> {
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

            NBTDataGrowUpGronckleMaleProcedure.execute(world, x, y, z);
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
         } else if (entity instanceof AdolescentGronckleFemaleEntity) {
            if (!entity.f_19853_.m_5776_()) {
               entity.m_146870_();
            }

            if (world instanceof ServerLevel) {
               _level = (ServerLevel)world;
               _level.m_8767_(ParticleTypes.f_123748_, x, y, z, 30, 3.0D, 3.0D, 3.0D, 0.5D);
            }

            if (world instanceof ServerLevel) {
               _level = (ServerLevel)world;
               Entity entityToSpawn = new GronckleFemaleEntity((EntityType)HowToOwnADragonModEntities.GRONCKLE_FEMALE.get(), _level);
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

            ((Entity)world.m_6443_(GronckleFemaleEntity.class, AABB.m_165882_(new Vec3(x, y, z), 10.0D, 10.0D, 10.0D), (e) -> {
               return true;
            }).stream().sorted(((<undefinedtype>)(new Object() {
               Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                  return Comparator.comparingDouble((_entcnd) -> {
                     return _entcnd.m_20275_(_x, _y, _z);
                  });
               }
            })).compareDistOf(x, y, z)).findFirst().orElse((Object)null)).getPersistentData().m_128359_("groncklecolor", "meatlug");
            var14 = (Entity)world.m_6443_(GronckleFemaleEntity.class, AABB.m_165882_(new Vec3(x, y, z), 10.0D, 10.0D, 10.0D), (e) -> {
               return true;
            }).stream().sorted(((<undefinedtype>)(new Object() {
               Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                  return Comparator.comparingDouble((_entcnd) -> {
                     return _entcnd.m_20275_(_x, _y, _z);
                  });
               }
            })).compareDistOf(x, y, z)).findFirst().orElse((Object)null);
            if (var14 instanceof GronckleFemaleEntity) {
               GronckleFemaleEntity animatable = (GronckleFemaleEntity)var14;
               animatable.setTexture("meatlug");
            }

            var17 = (Entity)world.m_6443_(GronckleFemaleEntity.class, AABB.m_165882_(new Vec3(x, y, z), 10.0D, 10.0D, 10.0D), (e) -> {
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

            NBTDataGrowUpGronckleFemaleProcedure.execute(world, x, y, z);
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
