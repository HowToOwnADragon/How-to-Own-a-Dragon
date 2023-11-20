package net.mcreator.howtoownadragon.procedures;

import java.util.Comparator;
import net.mcreator.howtoownadragon.HowToOwnADragonMod;
import net.mcreator.howtoownadragon.entity.BabyTTFemaleEntity;
import net.mcreator.howtoownadragon.entity.BabyTTMaleEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.phys.Vec3;

public class PinkIncubator1CallNBTDataProcedureTTProcedure {
   public static void execute(LevelAccessor world, double x, double y, double z) {
      HowToOwnADragonMod.queueServerWork(1, () -> {
         if ((Entity)world.m_6443_(BabyTTMaleEntity.class, AABB.m_165882_(new Vec3(x, y, z), 10.0D, 10.0D, 10.0D), (e) -> {
            return true;
         }).stream().sorted(((<undefinedtype>)(new Object() {
            Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
               return Comparator.comparingDouble((_entcnd) -> {
                  return _entcnd.m_20275_(_x, _y, _z);
               });
            }
         })).compareDistOf(x, y, z)).findFirst().orElse((Object)null) instanceof BabyTTMaleEntity) {
            ((Entity)world.m_6443_(BabyTTMaleEntity.class, AABB.m_165882_(new Vec3(x, y, z), 10.0D, 10.0D, 10.0D), (e) -> {
               return true;
            }).stream().sorted(((<undefinedtype>)(new Object() {
               Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                  return Comparator.comparingDouble((_entcnd) -> {
                     return _entcnd.m_20275_(_x, _y, _z);
                  });
               }
            })).compareDistOf(x, y, z)).findFirst().orElse((Object)null)).getPersistentData().m_128359_("ttcolor", "pink");
         } else if ((Entity)world.m_6443_(BabyTTFemaleEntity.class, AABB.m_165882_(new Vec3(x, y, z), 10.0D, 10.0D, 10.0D), (e) -> {
            return true;
         }).stream().sorted(((<undefinedtype>)(new Object() {
            Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
               return Comparator.comparingDouble((_entcnd) -> {
                  return _entcnd.m_20275_(_x, _y, _z);
               });
            }
         })).compareDistOf(x, y, z)).findFirst().orElse((Object)null) instanceof BabyTTFemaleEntity) {
            ((Entity)world.m_6443_(BabyTTFemaleEntity.class, AABB.m_165882_(new Vec3(x, y, z), 10.0D, 10.0D, 10.0D), (e) -> {
               return true;
            }).stream().sorted(((<undefinedtype>)(new Object() {
               Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                  return Comparator.comparingDouble((_entcnd) -> {
                     return _entcnd.m_20275_(_x, _y, _z);
                  });
               }
            })).compareDistOf(x, y, z)).findFirst().orElse((Object)null)).getPersistentData().m_128359_("ttcolor", "pink");
         } else {
            execute(world, x, y, z);
         }

      });
   }
}
