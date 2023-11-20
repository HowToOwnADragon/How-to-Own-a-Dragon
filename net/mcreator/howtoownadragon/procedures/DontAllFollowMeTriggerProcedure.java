package net.mcreator.howtoownadragon.procedures;

import java.util.Comparator;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.TamableAnimal;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.phys.Vec3;

public class DontAllFollowMeTriggerProcedure {
   public static boolean execute(LevelAccessor world, Entity entity) {
      if (entity == null) {
         return false;
      } else {
         if (!world.m_6443_(Player.class, AABB.m_165882_(new Vec3(entity.m_20185_(), entity.m_20186_(), entity.m_20189_()), 32.0D, 32.0D, 32.0D), (e) -> {
            return true;
         }).isEmpty()) {
            LivingEntity var10000;
            if (entity instanceof TamableAnimal) {
               TamableAnimal _tamEnt = (TamableAnimal)entity;
               var10000 = _tamEnt.m_269323_();
            } else {
               var10000 = null;
            }

            if (var10000 == (Entity)world.m_6443_(Player.class, AABB.m_165882_(new Vec3(entity.m_20185_(), entity.m_20186_(), entity.m_20189_()), 32.0D, 32.0D, 32.0D), (e) -> {
               return true;
            }).stream().sorted(((<undefinedtype>)(new Object() {
               Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                  return Comparator.comparingDouble((_entcnd) -> {
                     return _entcnd.m_20275_(_x, _y, _z);
                  });
               }
            })).compareDistOf(entity.m_20185_(), entity.m_20186_(), entity.m_20189_())).findFirst().orElse((Object)null) && !((Entity)world.m_6443_(Player.class, AABB.m_165882_(new Vec3(entity.m_20185_(), entity.m_20186_(), entity.m_20189_()), 32.0D, 32.0D, 32.0D), (e) -> {
               return true;
            }).stream().sorted(((<undefinedtype>)(new Object() {
               Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                  return Comparator.comparingDouble((_entcnd) -> {
                     return _entcnd.m_20275_(_x, _y, _z);
                  });
               }
            })).compareDistOf(entity.m_20185_(), entity.m_20186_(), entity.m_20189_())).findFirst().orElse((Object)null)).getPersistentData().m_128471_("FollowAll")) {
               return true;
            }

            if (!(entity instanceof TamableAnimal)) {
               return true;
            }

            TamableAnimal _tamEnt = (TamableAnimal)entity;
            if (!_tamEnt.m_21824_()) {
               return true;
            }
         }

         return false;
      }
   }
}
