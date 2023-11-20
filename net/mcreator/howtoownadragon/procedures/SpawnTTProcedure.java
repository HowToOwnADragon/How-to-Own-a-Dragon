package net.mcreator.howtoownadragon.procedures;

import net.mcreator.howtoownadragon.entity.TTFemaleEntity;
import net.mcreator.howtoownadragon.entity.TTMaleEntity;
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

public class SpawnTTProcedure {
   public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
      if (entity != null) {
         ServerLevel _level;
         Mob _mobToSpawn;
         if (Mth.m_216271_(RandomSource.m_216327_(), 0, 2) <= 1) {
            if (world instanceof ServerLevel) {
               _level = (ServerLevel)world;
               Entity entityToSpawn = new TTFemaleEntity((EntityType)HowToOwnADragonModEntities.TT_FEMALE.get(), _level);
               entityToSpawn.m_7678_(x, y + 1.0D, z, 0.0F, 0.0F);
               entityToSpawn.m_5618_(0.0F);
               entityToSpawn.m_5616_(0.0F);
               entityToSpawn.m_20334_(0.0D, 0.0D, 0.0D);
               if (entityToSpawn instanceof Mob) {
                  _mobToSpawn = (Mob)entityToSpawn;
                  _mobToSpawn.m_6518_(_level, _level.m_6436_(entityToSpawn.m_20183_()), MobSpawnType.MOB_SUMMONED, (SpawnGroupData)null, (CompoundTag)null);
               }

               _level.m_7967_(entityToSpawn);
            }
         } else if (Mth.m_216271_(RandomSource.m_216327_(), 0, 2) > 1) {
            if (world instanceof ServerLevel) {
               _level = (ServerLevel)world;
               Entity entityToSpawn = new TTMaleEntity((EntityType)HowToOwnADragonModEntities.TT_MALE.get(), _level);
               entityToSpawn.m_7678_(x, y + 1.0D, z, 0.0F, 0.0F);
               entityToSpawn.m_5618_(0.0F);
               entityToSpawn.m_5616_(0.0F);
               entityToSpawn.m_20334_(0.0D, 0.0D, 0.0D);
               if (entityToSpawn instanceof Mob) {
                  _mobToSpawn = (Mob)entityToSpawn;
                  _mobToSpawn.m_6518_(_level, _level.m_6436_(entityToSpawn.m_20183_()), MobSpawnType.MOB_SUMMONED, (SpawnGroupData)null, (CompoundTag)null);
               }

               _level.m_7967_(entityToSpawn);
            }
         } else {
            execute(world, x, y, z, entity);
         }

      }
   }
}
