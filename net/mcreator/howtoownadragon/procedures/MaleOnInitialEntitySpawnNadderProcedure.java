package net.mcreator.howtoownadragon.procedures;

import net.mcreator.howtoownadragon.entity.NadderMaleEntity;
import net.minecraft.util.Mth;
import net.minecraft.util.RandomSource;
import net.minecraft.world.entity.Entity;

public class MaleOnInitialEntitySpawnNadderProcedure {
   public static void execute(Entity entity) {
      if (entity != null) {
         NBTDataSpawnNadderProcedure.execute(entity);
         NadderMaleEntity animatable;
         if (Mth.m_216271_(RandomSource.m_216327_(), 1, 2) == 1) {
            if (entity instanceof NadderMaleEntity) {
               animatable = (NadderMaleEntity)entity;
               animatable.setTexture("rednadder");
            }

            entity.getPersistentData().m_128359_("naddercolor", "red");
         } else if (Mth.m_216271_(RandomSource.m_216327_(), 1, 2) == 2) {
            if (entity instanceof NadderMaleEntity) {
               animatable = (NadderMaleEntity)entity;
               animatable.setTexture("purplenadder");
            }

            entity.getPersistentData().m_128359_("naddercolor", "purple");
         } else {
            execute(entity);
         }

      }
   }
}
