package net.mcreator.howtoownadragon.procedures;

import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.TamableAnimal;

public class WildAIProcedure {
   public static boolean execute(Entity entity) {
      if (entity == null) {
         return false;
      } else {
         if (entity instanceof TamableAnimal) {
            TamableAnimal _tamEnt = (TamableAnimal)entity;
            if (_tamEnt.m_21824_()) {
               return false;
            }
         }

         return true;
      }
   }
}
