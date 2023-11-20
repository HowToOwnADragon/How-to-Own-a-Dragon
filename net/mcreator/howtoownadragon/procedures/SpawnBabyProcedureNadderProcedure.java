package net.mcreator.howtoownadragon.procedures;

import java.util.Comparator;
import net.mcreator.howtoownadragon.entity.BabyNadderFemaleEntity;
import net.mcreator.howtoownadragon.entity.BabyNadderMaleEntity;
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

public class SpawnBabyProcedureNadderProcedure {
   public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
      if (entity != null) {
         ServerLevel _level;
         BabyNadderMaleEntity entityToSpawn;
         Mob _mobToSpawn;
         BabyNadderMaleEntity animatable;
         BabyNadderFemaleEntity animatable;
         Entity var13;
         BabyNadderFemaleEntity entityToSpawn;
         if (entity.getPersistentData().m_128461_("naddercolor").equals("stormfly")) {
            if (Mth.m_216271_(RandomSource.m_216327_(), 1, 2) == 1) {
               if (world instanceof ServerLevel) {
                  _level = (ServerLevel)world;
                  entityToSpawn = new BabyNadderMaleEntity((EntityType)HowToOwnADragonModEntities.BABY_NADDER_MALE.get(), _level);
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

               var13 = (Entity)world.m_6443_(BabyNadderMaleEntity.class, AABB.m_165882_(new Vec3(x, y, z), 4.0D, 4.0D, 4.0D), (e) -> {
                  return true;
               }).stream().sorted(((<undefinedtype>)(new Object() {
                  Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                     return Comparator.comparingDouble((_entcnd) -> {
                        return _entcnd.m_20275_(_x, _y, _z);
                     });
                  }
               })).compareDistOf(x, y, z)).findFirst().orElse((Object)null);
               if (var13 instanceof BabyNadderMaleEntity) {
                  animatable = (BabyNadderMaleEntity)var13;
                  animatable.setTexture("stormfly");
               }

               ((Entity)world.m_6443_(BabyNadderMaleEntity.class, AABB.m_165882_(new Vec3(x, y, z), 4.0D, 4.0D, 4.0D), (e) -> {
                  return true;
               }).stream().sorted(((<undefinedtype>)(new Object() {
                  Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                     return Comparator.comparingDouble((_entcnd) -> {
                        return _entcnd.m_20275_(_x, _y, _z);
                     });
                  }
               })).compareDistOf(x, y, z)).findFirst().orElse((Object)null)).getPersistentData().m_128359_("naddercolor", "stormfly");
            } else {
               if (world instanceof ServerLevel) {
                  _level = (ServerLevel)world;
                  entityToSpawn = new BabyNadderFemaleEntity((EntityType)HowToOwnADragonModEntities.BABY_NADDER_FEMALE.get(), _level);
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

               var13 = (Entity)world.m_6443_(BabyNadderFemaleEntity.class, AABB.m_165882_(new Vec3(x, y, z), 4.0D, 4.0D, 4.0D), (e) -> {
                  return true;
               }).stream().sorted(((<undefinedtype>)(new Object() {
                  Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                     return Comparator.comparingDouble((_entcnd) -> {
                        return _entcnd.m_20275_(_x, _y, _z);
                     });
                  }
               })).compareDistOf(x, y, z)).findFirst().orElse((Object)null);
               if (var13 instanceof BabyNadderFemaleEntity) {
                  animatable = (BabyNadderFemaleEntity)var13;
                  animatable.setTexture("stormfly");
               }

               ((Entity)world.m_6443_(BabyNadderFemaleEntity.class, AABB.m_165882_(new Vec3(x, y, z), 4.0D, 4.0D, 4.0D), (e) -> {
                  return true;
               }).stream().sorted(((<undefinedtype>)(new Object() {
                  Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                     return Comparator.comparingDouble((_entcnd) -> {
                        return _entcnd.m_20275_(_x, _y, _z);
                     });
                  }
               })).compareDistOf(x, y, z)).findFirst().orElse((Object)null)).getPersistentData().m_128359_("naddercolor", "stormfly");
            }
         } else if (entity.getPersistentData().m_128461_("naddercolor").equals("red")) {
            if (Mth.m_216271_(RandomSource.m_216327_(), 1, 2) == 1) {
               if (world instanceof ServerLevel) {
                  _level = (ServerLevel)world;
                  entityToSpawn = new BabyNadderMaleEntity((EntityType)HowToOwnADragonModEntities.BABY_NADDER_MALE.get(), _level);
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

               var13 = (Entity)world.m_6443_(BabyNadderMaleEntity.class, AABB.m_165882_(new Vec3(x, y, z), 4.0D, 4.0D, 4.0D), (e) -> {
                  return true;
               }).stream().sorted(((<undefinedtype>)(new Object() {
                  Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                     return Comparator.comparingDouble((_entcnd) -> {
                        return _entcnd.m_20275_(_x, _y, _z);
                     });
                  }
               })).compareDistOf(x, y, z)).findFirst().orElse((Object)null);
               if (var13 instanceof BabyNadderMaleEntity) {
                  animatable = (BabyNadderMaleEntity)var13;
                  animatable.setTexture("rednadder");
               }

               ((Entity)world.m_6443_(BabyNadderMaleEntity.class, AABB.m_165882_(new Vec3(x, y, z), 4.0D, 4.0D, 4.0D), (e) -> {
                  return true;
               }).stream().sorted(((<undefinedtype>)(new Object() {
                  Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                     return Comparator.comparingDouble((_entcnd) -> {
                        return _entcnd.m_20275_(_x, _y, _z);
                     });
                  }
               })).compareDistOf(x, y, z)).findFirst().orElse((Object)null)).getPersistentData().m_128359_("naddercolor", "red");
            } else {
               if (world instanceof ServerLevel) {
                  _level = (ServerLevel)world;
                  entityToSpawn = new BabyNadderFemaleEntity((EntityType)HowToOwnADragonModEntities.BABY_NADDER_FEMALE.get(), _level);
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

               var13 = (Entity)world.m_6443_(BabyNadderFemaleEntity.class, AABB.m_165882_(new Vec3(x, y, z), 4.0D, 4.0D, 4.0D), (e) -> {
                  return true;
               }).stream().sorted(((<undefinedtype>)(new Object() {
                  Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                     return Comparator.comparingDouble((_entcnd) -> {
                        return _entcnd.m_20275_(_x, _y, _z);
                     });
                  }
               })).compareDistOf(x, y, z)).findFirst().orElse((Object)null);
               if (var13 instanceof BabyNadderFemaleEntity) {
                  animatable = (BabyNadderFemaleEntity)var13;
                  animatable.setTexture("rednadder");
               }

               ((Entity)world.m_6443_(BabyNadderFemaleEntity.class, AABB.m_165882_(new Vec3(x, y, z), 4.0D, 4.0D, 4.0D), (e) -> {
                  return true;
               }).stream().sorted(((<undefinedtype>)(new Object() {
                  Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                     return Comparator.comparingDouble((_entcnd) -> {
                        return _entcnd.m_20275_(_x, _y, _z);
                     });
                  }
               })).compareDistOf(x, y, z)).findFirst().orElse((Object)null)).getPersistentData().m_128359_("naddercolor", "red");
            }
         } else if (entity.getPersistentData().m_128461_("naddercolor").equals("purple")) {
            if (Mth.m_216271_(RandomSource.m_216327_(), 1, 2) == 1) {
               if (world instanceof ServerLevel) {
                  _level = (ServerLevel)world;
                  entityToSpawn = new BabyNadderMaleEntity((EntityType)HowToOwnADragonModEntities.BABY_NADDER_MALE.get(), _level);
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

               var13 = (Entity)world.m_6443_(BabyNadderMaleEntity.class, AABB.m_165882_(new Vec3(x, y, z), 4.0D, 4.0D, 4.0D), (e) -> {
                  return true;
               }).stream().sorted(((<undefinedtype>)(new Object() {
                  Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                     return Comparator.comparingDouble((_entcnd) -> {
                        return _entcnd.m_20275_(_x, _y, _z);
                     });
                  }
               })).compareDistOf(x, y, z)).findFirst().orElse((Object)null);
               if (var13 instanceof BabyNadderMaleEntity) {
                  animatable = (BabyNadderMaleEntity)var13;
                  animatable.setTexture("purplenadder");
               }

               ((Entity)world.m_6443_(BabyNadderMaleEntity.class, AABB.m_165882_(new Vec3(x, y, z), 4.0D, 4.0D, 4.0D), (e) -> {
                  return true;
               }).stream().sorted(((<undefinedtype>)(new Object() {
                  Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                     return Comparator.comparingDouble((_entcnd) -> {
                        return _entcnd.m_20275_(_x, _y, _z);
                     });
                  }
               })).compareDistOf(x, y, z)).findFirst().orElse((Object)null)).getPersistentData().m_128359_("naddercolor", "purple");
            } else {
               if (world instanceof ServerLevel) {
                  _level = (ServerLevel)world;
                  entityToSpawn = new BabyNadderFemaleEntity((EntityType)HowToOwnADragonModEntities.BABY_NADDER_FEMALE.get(), _level);
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

               var13 = (Entity)world.m_6443_(BabyNadderFemaleEntity.class, AABB.m_165882_(new Vec3(x, y, z), 4.0D, 4.0D, 4.0D), (e) -> {
                  return true;
               }).stream().sorted(((<undefinedtype>)(new Object() {
                  Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                     return Comparator.comparingDouble((_entcnd) -> {
                        return _entcnd.m_20275_(_x, _y, _z);
                     });
                  }
               })).compareDistOf(x, y, z)).findFirst().orElse((Object)null);
               if (var13 instanceof BabyNadderFemaleEntity) {
                  animatable = (BabyNadderFemaleEntity)var13;
                  animatable.setTexture("purplenadder");
               }

               ((Entity)world.m_6443_(BabyNadderFemaleEntity.class, AABB.m_165882_(new Vec3(x, y, z), 4.0D, 4.0D, 4.0D), (e) -> {
                  return true;
               }).stream().sorted(((<undefinedtype>)(new Object() {
                  Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                     return Comparator.comparingDouble((_entcnd) -> {
                        return _entcnd.m_20275_(_x, _y, _z);
                     });
                  }
               })).compareDistOf(x, y, z)).findFirst().orElse((Object)null)).getPersistentData().m_128359_("naddercolor", "purple");
            }
         }

      }
   }
}
