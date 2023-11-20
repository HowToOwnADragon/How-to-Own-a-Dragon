package net.mcreator.howtoownadragon.procedures;

import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.TamableAnimal;
import net.minecraft.world.phys.Vec3;

public class NadderFlyingTickUpdateProcedure {
   public static void execute(Entity entity) {
      if (entity != null) {
         if (entity instanceof TamableAnimal) {
            TamableAnimal _tamEnt = (TamableAnimal)entity;
            if (_tamEnt.m_21824_()) {
               if (entity.m_20160_()) {
                  if (entity.getPersistentData().m_128459_("VerticalMovement") == 1.0D) {
                     entity.m_20256_(new Vec3(entity.m_20184_().m_7096_(), 0.2D, entity.m_20184_().m_7094_()));
                  } else if (entity.getPersistentData().m_128459_("VerticalMovement") == -1.0D) {
                     entity.m_20256_(new Vec3(entity.m_20184_().m_7096_(), -0.2D, entity.m_20184_().m_7094_()));
                  }
               } else {
                  entity.m_20256_(new Vec3(entity.m_20184_().m_7096_(), -0.1D, entity.m_20184_().m_7094_()));
               }
            }
         }

      }
   }
}
