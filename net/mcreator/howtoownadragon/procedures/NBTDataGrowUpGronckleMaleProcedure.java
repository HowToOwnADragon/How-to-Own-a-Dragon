package net.mcreator.howtoownadragon.procedures;

import java.util.Comparator;
import net.mcreator.howtoownadragon.entity.GronckleMaleEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.phys.Vec3;

public class NBTDataGrowUpGronckleMaleProcedure {
   public static void execute(LevelAccessor world, double x, double y, double z) {
      ((Entity)world.m_6443_(GronckleMaleEntity.class, AABB.m_165882_(new Vec3(x, y, z), 10.0D, 10.0D, 10.0D), (e) -> {
         return true;
      }).stream().sorted(((<undefinedtype>)(new Object() {
         Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
            return Comparator.comparingDouble((_entcnd) -> {
               return _entcnd.m_20275_(_x, _y, _z);
            });
         }
      })).compareDistOf(x, y, z)).findFirst().orElse((Object)null)).getPersistentData().m_128379_("groncklefeedcooldown", false);
      ((Entity)world.m_6443_(GronckleMaleEntity.class, AABB.m_165882_(new Vec3(x, y, z), 10.0D, 10.0D, 10.0D), (e) -> {
         return true;
      }).stream().sorted(((<undefinedtype>)(new Object() {
         Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
            return Comparator.comparingDouble((_entcnd) -> {
               return _entcnd.m_20275_(_x, _y, _z);
            });
         }
      })).compareDistOf(x, y, z)).findFirst().orElse((Object)null)).getPersistentData().m_128379_("groncklesaddle", false);
   }
}
