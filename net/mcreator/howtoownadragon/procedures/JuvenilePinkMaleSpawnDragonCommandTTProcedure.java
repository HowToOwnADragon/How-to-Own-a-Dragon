package net.mcreator.howtoownadragon.procedures;

import java.util.Comparator;
import net.mcreator.howtoownadragon.entity.JuvenileTTMaleEntity;
import net.mcreator.howtoownadragon.init.HowToOwnADragonModEntities;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.SpawnGroupData;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.phys.Vec3;

public class JuvenilePinkMaleSpawnDragonCommandTTProcedure {
   public static void execute(LevelAccessor world, double x, double y, double z) {
      if (world instanceof ServerLevel) {
         ServerLevel _level = (ServerLevel)world;
         Entity entityToSpawn = new JuvenileTTMaleEntity((EntityType)HowToOwnADragonModEntities.JUVENILE_TT_MALE.get(), _level);
         entityToSpawn.m_7678_(x, y, z, 0.0F, 0.0F);
         entityToSpawn.m_5618_(0.0F);
         entityToSpawn.m_5616_(0.0F);
         entityToSpawn.m_20334_(0.0D, 0.0D, 0.0D);
         if (entityToSpawn instanceof Mob) {
            Mob _mobToSpawn = (Mob)entityToSpawn;
            _mobToSpawn.m_6518_(_level, _level.m_6436_(entityToSpawn.m_20183_()), MobSpawnType.MOB_SUMMONED, (SpawnGroupData)null, (CompoundTag)null);
         }

         _level.m_7967_(entityToSpawn);
      }

      Entity var11 = (Entity)world.m_6443_(JuvenileTTMaleEntity.class, AABB.m_165882_(new Vec3(x, y, z), 10.0D, 10.0D, 10.0D), (e) -> {
         return true;
      }).stream().sorted(((<undefinedtype>)(new Object() {
         Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
            return Comparator.comparingDouble((_entcnd) -> {
               return _entcnd.m_20275_(_x, _y, _z);
            });
         }
      })).compareDistOf(x, y, z)).findFirst().orElse((Object)null);
      if (var11 instanceof JuvenileTTMaleEntity) {
         JuvenileTTMaleEntity animatable = (JuvenileTTMaleEntity)var11;
         animatable.setTexture("pinktt");
      }

      ((Entity)world.m_6443_(JuvenileTTMaleEntity.class, AABB.m_165882_(new Vec3(x, y, z), 10.0D, 10.0D, 10.0D), (e) -> {
         return true;
      }).stream().sorted(((<undefinedtype>)(new Object() {
         Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
            return Comparator.comparingDouble((_entcnd) -> {
               return _entcnd.m_20275_(_x, _y, _z);
            });
         }
      })).compareDistOf(x, y, z)).findFirst().orElse((Object)null)).getPersistentData().m_128359_("ttcolor", "pink");
   }
}
