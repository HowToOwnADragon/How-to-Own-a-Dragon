package net.mcreator.howtoownadragon.procedures;

import net.mcreator.howtoownadragon.HowToOwnADragonMod;
import net.mcreator.howtoownadragon.entity.BabyNadderFemaleEntity;
import net.mcreator.howtoownadragon.entity.BabyNadderMaleEntity;
import net.mcreator.howtoownadragon.entity.BabyTTFemaleEntity;
import net.mcreator.howtoownadragon.entity.BabyTTMaleEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.level.LevelAccessor;

public class ColorTickRateNadderProcedure {
   public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
      if (entity != null) {
         HowToOwnADragonMod.queueServerWork(2, () -> {
            if (entity instanceof BabyNadderMaleEntity) {
               BabyTTMaleEntity animatable;
               if (entity.getPersistentData().m_128461_("naddercolor").equals("stormfly")) {
                  if (entity instanceof BabyTTMaleEntity) {
                     animatable = (BabyTTMaleEntity)entity;
                     animatable.setTexture("stormfly");
                  }

                  GrowingTickRateNadderProcedure.execute(world, x, y, z, entity);
               } else if (entity.getPersistentData().m_128461_("naddercolor").equals("red")) {
                  if (entity instanceof BabyTTMaleEntity) {
                     animatable = (BabyTTMaleEntity)entity;
                     animatable.setTexture("rednadder");
                  }

                  GrowingTickRateNadderProcedure.execute(world, x, y, z, entity);
               } else if (entity.getPersistentData().m_128461_("naddercolor").equals("purple")) {
                  if (entity instanceof BabyTTMaleEntity) {
                     animatable = (BabyTTMaleEntity)entity;
                     animatable.setTexture("purplenadder");
                  }

                  GrowingTickRateNadderProcedure.execute(world, x, y, z, entity);
               }
            } else if (entity instanceof BabyNadderFemaleEntity) {
               BabyTTFemaleEntity animatablex;
               if (entity.getPersistentData().m_128461_("naddercolor").equals("stormfly")) {
                  if (entity instanceof BabyTTFemaleEntity) {
                     animatablex = (BabyTTFemaleEntity)entity;
                     animatablex.setTexture("stormfly");
                  }

                  GrowingTickRateNadderProcedure.execute(world, x, y, z, entity);
               } else if (entity.getPersistentData().m_128461_("naddercolor").equals("red")) {
                  if (entity instanceof BabyTTFemaleEntity) {
                     animatablex = (BabyTTFemaleEntity)entity;
                     animatablex.setTexture("rednadder");
                  }

                  GrowingTickRateNadderProcedure.execute(world, x, y, z, entity);
               } else if (entity.getPersistentData().m_128461_("naddercolor").equals("purple")) {
                  if (entity instanceof BabyTTFemaleEntity) {
                     animatablex = (BabyTTFemaleEntity)entity;
                     animatablex.setTexture("purplenadder");
                  }

                  GrowingTickRateNadderProcedure.execute(world, x, y, z, entity);
               }
            } else {
               GrowingTickRateNadderProcedure.execute(world, x, y, z, entity);
            }

         });
      }
   }
}
