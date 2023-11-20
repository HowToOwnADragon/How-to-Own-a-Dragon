package net.mcreator.howtoownadragon.procedures;

import net.mcreator.howtoownadragon.entity.GronckleMaleEntity;
import net.minecraft.util.Mth;
import net.minecraft.util.RandomSource;
import net.minecraft.world.entity.Entity;

public class GronckleMaleOnInitialEntitySpawnProcedure {
   public static void execute(Entity entity) {
      if (entity != null) {
         NBTDataSpawnGronckleProcedure.execute(entity);
         GronckleMaleEntity animatable;
         if (Mth.m_216271_(RandomSource.m_216327_(), 1, 3) == 1) {
            if (entity instanceof GronckleMaleEntity) {
               animatable = (GronckleMaleEntity)entity;
               animatable.setTexture("groncklepink");
            }

            entity.getPersistentData().m_128359_("groncklecolor", "pink");
         } else if (Mth.m_216271_(RandomSource.m_216327_(), 1, 3) == 2) {
            if (entity instanceof GronckleMaleEntity) {
               animatable = (GronckleMaleEntity)entity;
               animatable.setTexture("gronckleorangered");
            }

            entity.getPersistentData().m_128359_("groncklecolor", "orangered");
         } else if (Mth.m_216271_(RandomSource.m_216327_(), 1, 3) == 3) {
            if (entity instanceof GronckleMaleEntity) {
               animatable = (GronckleMaleEntity)entity;
               animatable.setTexture("gronckleblueyellow");
            }

            entity.getPersistentData().m_128359_("groncklecolor", "blueyellow");
         } else {
            execute(entity);
         }

      }
   }
}
