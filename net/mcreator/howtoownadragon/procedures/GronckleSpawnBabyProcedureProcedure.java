package net.mcreator.howtoownadragon.procedures;

import java.util.Comparator;
import net.mcreator.howtoownadragon.entity.BabyGronckleFemaleEntity;
import net.mcreator.howtoownadragon.entity.BabyGronckleMaleEntity;
import net.mcreator.howtoownadragon.init.HowToOwnADragonModEntities;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.util.Mth;
import net.minecraft.util.RandomSource;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.SpawnGroupData;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.phys.Vec3;

public class GronckleSpawnBabyProcedureProcedure {
   public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
      if (entity != null) {
         ServerLevel _level;
         BabyGronckleFemaleEntity entityToSpawn;
         Mob _mobToSpawn;
         BabyGronckleFemaleEntity animatable;
         BabyGronckleMaleEntity animatable;
         Entity var13;
         BabyGronckleMaleEntity entityToSpawn;
         if (entity.getPersistentData().m_128461_("groncklecolor").equals("pink")) {
            if (Mth.m_216271_(RandomSource.m_216327_(), 1, 2) == 1) {
               if (world instanceof ServerLevel) {
                  _level = (ServerLevel)world;
                  entityToSpawn = new BabyGronckleFemaleEntity((EntityType)HowToOwnADragonModEntities.BABY_GRONCKLE_FEMALE.get(), _level);
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

               var13 = (Entity)world.m_6443_(BabyGronckleFemaleEntity.class, AABB.m_165882_(new Vec3(x, y, z), 4.0D, 4.0D, 4.0D), (e) -> {
                  return true;
               }).stream().sorted(((<undefinedtype>)(new Object() {
                  Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                     return Comparator.comparingDouble((_entcnd) -> {
                        return _entcnd.m_20275_(_x, _y, _z);
                     });
                  }
               })).compareDistOf(x, y, z)).findFirst().orElse((Object)null);
               if (var13 instanceof BabyGronckleFemaleEntity) {
                  animatable = (BabyGronckleFemaleEntity)var13;
                  animatable.setTexture("babygroncklepink");
               }

               ((Entity)world.m_6443_(BabyGronckleFemaleEntity.class, AABB.m_165882_(new Vec3(x, y, z), 4.0D, 4.0D, 4.0D), (e) -> {
                  return true;
               }).stream().sorted(((<undefinedtype>)(new Object() {
                  Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                     return Comparator.comparingDouble((_entcnd) -> {
                        return _entcnd.m_20275_(_x, _y, _z);
                     });
                  }
               })).compareDistOf(x, y, z)).findFirst().orElse((Object)null)).getPersistentData().m_128359_("groncklecolor", "pink");
            } else {
               if (world instanceof ServerLevel) {
                  _level = (ServerLevel)world;
                  entityToSpawn = new BabyGronckleMaleEntity((EntityType)HowToOwnADragonModEntities.BABY_GRONCKLE_MALE.get(), _level);
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

               var13 = (Entity)world.m_6443_(BabyGronckleMaleEntity.class, AABB.m_165882_(new Vec3(x, y, z), 4.0D, 4.0D, 4.0D), (e) -> {
                  return true;
               }).stream().sorted(((<undefinedtype>)(new Object() {
                  Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                     return Comparator.comparingDouble((_entcnd) -> {
                        return _entcnd.m_20275_(_x, _y, _z);
                     });
                  }
               })).compareDistOf(x, y, z)).findFirst().orElse((Object)null);
               if (var13 instanceof BabyGronckleMaleEntity) {
                  animatable = (BabyGronckleMaleEntity)var13;
                  animatable.setTexture("babygroncklepink");
               }

               ((Entity)world.m_6443_(BabyGronckleFemaleEntity.class, AABB.m_165882_(new Vec3(x, y, z), 4.0D, 4.0D, 4.0D), (e) -> {
                  return true;
               }).stream().sorted(((<undefinedtype>)(new Object() {
                  Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                     return Comparator.comparingDouble((_entcnd) -> {
                        return _entcnd.m_20275_(_x, _y, _z);
                     });
                  }
               })).compareDistOf(x, y, z)).findFirst().orElse((Object)null)).getPersistentData().m_128359_("groncklecolor", "pink");
            }
         } else if (entity.getPersistentData().m_128461_("groncklecolor").equals("blueyellow")) {
            if (Mth.m_216271_(RandomSource.m_216327_(), 1, 2) == 1) {
               if (world instanceof ServerLevel) {
                  _level = (ServerLevel)world;
                  entityToSpawn = new BabyGronckleFemaleEntity((EntityType)HowToOwnADragonModEntities.BABY_GRONCKLE_FEMALE.get(), _level);
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

               var13 = (Entity)world.m_6443_(BabyGronckleFemaleEntity.class, AABB.m_165882_(new Vec3(x, y, z), 4.0D, 4.0D, 4.0D), (e) -> {
                  return true;
               }).stream().sorted(((<undefinedtype>)(new Object() {
                  Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                     return Comparator.comparingDouble((_entcnd) -> {
                        return _entcnd.m_20275_(_x, _y, _z);
                     });
                  }
               })).compareDistOf(x, y, z)).findFirst().orElse((Object)null);
               if (var13 instanceof BabyGronckleFemaleEntity) {
                  animatable = (BabyGronckleFemaleEntity)var13;
                  animatable.setTexture("babygroncleblue");
               }

               ((Entity)world.m_6443_(BabyGronckleFemaleEntity.class, AABB.m_165882_(new Vec3(x, y, z), 4.0D, 4.0D, 4.0D), (e) -> {
                  return true;
               }).stream().sorted(((<undefinedtype>)(new Object() {
                  Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                     return Comparator.comparingDouble((_entcnd) -> {
                        return _entcnd.m_20275_(_x, _y, _z);
                     });
                  }
               })).compareDistOf(x, y, z)).findFirst().orElse((Object)null)).getPersistentData().m_128359_("groncklecolor", "blueyellow");
            } else {
               if (world instanceof ServerLevel) {
                  _level = (ServerLevel)world;
                  entityToSpawn = new BabyGronckleMaleEntity((EntityType)HowToOwnADragonModEntities.BABY_GRONCKLE_MALE.get(), _level);
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

               var13 = (Entity)world.m_6443_(BabyGronckleMaleEntity.class, AABB.m_165882_(new Vec3(x, y, z), 4.0D, 4.0D, 4.0D), (e) -> {
                  return true;
               }).stream().sorted(((<undefinedtype>)(new Object() {
                  Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                     return Comparator.comparingDouble((_entcnd) -> {
                        return _entcnd.m_20275_(_x, _y, _z);
                     });
                  }
               })).compareDistOf(x, y, z)).findFirst().orElse((Object)null);
               if (var13 instanceof BabyGronckleMaleEntity) {
                  animatable = (BabyGronckleMaleEntity)var13;
                  animatable.setTexture("babygroncleblue");
               }

               ((Entity)world.m_6443_(BabyGronckleFemaleEntity.class, AABB.m_165882_(new Vec3(x, y, z), 4.0D, 4.0D, 4.0D), (e) -> {
                  return true;
               }).stream().sorted(((<undefinedtype>)(new Object() {
                  Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                     return Comparator.comparingDouble((_entcnd) -> {
                        return _entcnd.m_20275_(_x, _y, _z);
                     });
                  }
               })).compareDistOf(x, y, z)).findFirst().orElse((Object)null)).getPersistentData().m_128359_("groncklecolor", "blueyellow");
            }
         } else if (entity.getPersistentData().m_128461_("groncklecolor").equals("orangered")) {
            if (Mth.m_216271_(RandomSource.m_216327_(), 1, 2) == 1) {
               if (world instanceof ServerLevel) {
                  _level = (ServerLevel)world;
                  entityToSpawn = new BabyGronckleFemaleEntity((EntityType)HowToOwnADragonModEntities.BABY_GRONCKLE_FEMALE.get(), _level);
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

               var13 = (Entity)world.m_6443_(BabyGronckleFemaleEntity.class, AABB.m_165882_(new Vec3(x, y, z), 4.0D, 4.0D, 4.0D), (e) -> {
                  return true;
               }).stream().sorted(((<undefinedtype>)(new Object() {
                  Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                     return Comparator.comparingDouble((_entcnd) -> {
                        return _entcnd.m_20275_(_x, _y, _z);
                     });
                  }
               })).compareDistOf(x, y, z)).findFirst().orElse((Object)null);
               if (var13 instanceof BabyGronckleFemaleEntity) {
                  animatable = (BabyGronckleFemaleEntity)var13;
                  animatable.setTexture("babygronckleorange");
               }

               ((Entity)world.m_6443_(BabyGronckleFemaleEntity.class, AABB.m_165882_(new Vec3(x, y, z), 4.0D, 4.0D, 4.0D), (e) -> {
                  return true;
               }).stream().sorted(((<undefinedtype>)(new Object() {
                  Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                     return Comparator.comparingDouble((_entcnd) -> {
                        return _entcnd.m_20275_(_x, _y, _z);
                     });
                  }
               })).compareDistOf(x, y, z)).findFirst().orElse((Object)null)).getPersistentData().m_128359_("groncklecolor", "orangered");
            } else {
               if (world instanceof ServerLevel) {
                  _level = (ServerLevel)world;
                  entityToSpawn = new BabyGronckleMaleEntity((EntityType)HowToOwnADragonModEntities.BABY_GRONCKLE_MALE.get(), _level);
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

               var13 = (Entity)world.m_6443_(BabyGronckleMaleEntity.class, AABB.m_165882_(new Vec3(x, y, z), 4.0D, 4.0D, 4.0D), (e) -> {
                  return true;
               }).stream().sorted(((<undefinedtype>)(new Object() {
                  Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                     return Comparator.comparingDouble((_entcnd) -> {
                        return _entcnd.m_20275_(_x, _y, _z);
                     });
                  }
               })).compareDistOf(x, y, z)).findFirst().orElse((Object)null);
               if (var13 instanceof BabyGronckleMaleEntity) {
                  animatable = (BabyGronckleMaleEntity)var13;
                  animatable.setTexture("babygronckleorange");
               }

               ((Entity)world.m_6443_(BabyGronckleFemaleEntity.class, AABB.m_165882_(new Vec3(x, y, z), 4.0D, 4.0D, 4.0D), (e) -> {
                  return true;
               }).stream().sorted(((<undefinedtype>)(new Object() {
                  Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                     return Comparator.comparingDouble((_entcnd) -> {
                        return _entcnd.m_20275_(_x, _y, _z);
                     });
                  }
               })).compareDistOf(x, y, z)).findFirst().orElse((Object)null)).getPersistentData().m_128359_("groncklecolor", "orangered");
            }
         } else if (entity.getPersistentData().m_128461_("groncklecolor").equals("meatlug")) {
            if (Mth.m_216271_(RandomSource.m_216327_(), 1, 2) == 1) {
               if (world instanceof ServerLevel) {
                  _level = (ServerLevel)world;
                  entityToSpawn = new BabyGronckleFemaleEntity((EntityType)HowToOwnADragonModEntities.BABY_GRONCKLE_FEMALE.get(), _level);
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

               var13 = (Entity)world.m_6443_(BabyGronckleFemaleEntity.class, AABB.m_165882_(new Vec3(x, y, z), 4.0D, 4.0D, 4.0D), (e) -> {
                  return true;
               }).stream().sorted(((<undefinedtype>)(new Object() {
                  Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                     return Comparator.comparingDouble((_entcnd) -> {
                        return _entcnd.m_20275_(_x, _y, _z);
                     });
                  }
               })).compareDistOf(x, y, z)).findFirst().orElse((Object)null);
               if (var13 instanceof BabyGronckleFemaleEntity) {
                  animatable = (BabyGronckleFemaleEntity)var13;
                  animatable.setTexture("babymeatlug");
               }

               ((Entity)world.m_6443_(BabyGronckleFemaleEntity.class, AABB.m_165882_(new Vec3(x, y, z), 4.0D, 4.0D, 4.0D), (e) -> {
                  return true;
               }).stream().sorted(((<undefinedtype>)(new Object() {
                  Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                     return Comparator.comparingDouble((_entcnd) -> {
                        return _entcnd.m_20275_(_x, _y, _z);
                     });
                  }
               })).compareDistOf(x, y, z)).findFirst().orElse((Object)null)).getPersistentData().m_128359_("groncklecolor", "meatlug");
            } else {
               if (world instanceof ServerLevel) {
                  _level = (ServerLevel)world;
                  entityToSpawn = new BabyGronckleMaleEntity((EntityType)HowToOwnADragonModEntities.BABY_GRONCKLE_MALE.get(), _level);
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

               var13 = (Entity)world.m_6443_(BabyGronckleMaleEntity.class, AABB.m_165882_(new Vec3(x, y, z), 4.0D, 4.0D, 4.0D), (e) -> {
                  return true;
               }).stream().sorted(((<undefinedtype>)(new Object() {
                  Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                     return Comparator.comparingDouble((_entcnd) -> {
                        return _entcnd.m_20275_(_x, _y, _z);
                     });
                  }
               })).compareDistOf(x, y, z)).findFirst().orElse((Object)null);
               if (var13 instanceof BabyGronckleMaleEntity) {
                  animatable = (BabyGronckleMaleEntity)var13;
                  animatable.setTexture("babymeatlug");
               }

               ((Entity)world.m_6443_(BabyGronckleFemaleEntity.class, AABB.m_165882_(new Vec3(x, y, z), 4.0D, 4.0D, 4.0D), (e) -> {
                  return true;
               }).stream().sorted(((<undefinedtype>)(new Object() {
                  Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                     return Comparator.comparingDouble((_entcnd) -> {
                        return _entcnd.m_20275_(_x, _y, _z);
                     });
                  }
               })).compareDistOf(x, y, z)).findFirst().orElse((Object)null)).getPersistentData().m_128359_("groncklecolor", "meatlug");
            }
         }

      }
   }
}
