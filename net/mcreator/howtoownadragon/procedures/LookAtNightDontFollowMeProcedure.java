package net.mcreator.howtoownadragon.procedures;

import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.TamableAnimal;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;

public class LookAtNightDontFollowMeProcedure {
   public static boolean execute(LevelAccessor world, Entity entity) {
      if (entity == null) {
         return false;
      } else {
         if (entity instanceof TamableAnimal) {
            TamableAnimal _tamEnt = (TamableAnimal)entity;
            if (_tamEnt.m_21824_()) {
               return false;
            }
         }

         if (!(world instanceof Level)) {
            return true;
         } else {
            Level _lvl1 = (Level)world;
            if (!_lvl1.m_46461_()) {
               return true;
            } else {
               return false;
            }
         }
      }
   }
}
