package net.mcreator.howtoownadragon.procedures;

import net.mcreator.howtoownadragon.HowToOwnADragonMod;
import net.mcreator.howtoownadragon.entity.BabyTTFemaleEntity;
import net.mcreator.howtoownadragon.entity.BabyTTMaleEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.level.LevelAccessor;

public class ColorTickRateTTProcedure {
   public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
      if (entity != null) {
         HowToOwnADragonMod.queueServerWork(2, () -> {
            if (entity instanceof BabyTTMaleEntity) {
               BabyTTMaleEntity animatable;
               if (entity.getPersistentData().m_128461_("ttcolor").equals("pink")) {
                  if (entity instanceof BabyTTMaleEntity) {
                     animatable = (BabyTTMaleEntity)entity;
                     animatable.setTexture("pinktt");
                  }

                  GrowingTickRateTTProcedure.execute(world, x, y, z, entity);
               } else if (entity.getPersistentData().m_128461_("ttcolor").equals("green")) {
                  if (entity instanceof BabyTTMaleEntity) {
                     animatable = (BabyTTMaleEntity)entity;
                     animatable.setTexture("greentt");
                  }

                  GrowingTickRateTTProcedure.execute(world, x, y, z, entity);
               } else if (entity.getPersistentData().m_128461_("ttcolor").equals("turq")) {
                  if (entity instanceof BabyTTMaleEntity) {
                     animatable = (BabyTTMaleEntity)entity;
                     animatable.setTexture("turqtt");
                  }

                  GrowingTickRateTTProcedure.execute(world, x, y, z, entity);
               }
            } else if (entity instanceof BabyTTFemaleEntity) {
               BabyTTFemaleEntity animatablex;
               if (entity.getPersistentData().m_128461_("ttcolor").equals("pink")) {
                  if (entity instanceof BabyTTFemaleEntity) {
                     animatablex = (BabyTTFemaleEntity)entity;
                     animatablex.setTexture("pinktt");
                  }

                  GrowingTickRateTTProcedure.execute(world, x, y, z, entity);
               } else if (entity.getPersistentData().m_128461_("ttcolor").equals("green")) {
                  if (entity instanceof BabyTTFemaleEntity) {
                     animatablex = (BabyTTFemaleEntity)entity;
                     animatablex.setTexture("greentt");
                  }

                  GrowingTickRateTTProcedure.execute(world, x, y, z, entity);
               } else if (entity.getPersistentData().m_128461_("ttcolor").equals("turq")) {
                  if (entity instanceof BabyTTFemaleEntity) {
                     animatablex = (BabyTTFemaleEntity)entity;
                     animatablex.setTexture("turqtt");
                  }

                  GrowingTickRateTTProcedure.execute(world, x, y, z, entity);
               }
            } else {
               GrowingTickRateTTProcedure.execute(world, x, y, z, entity);
            }

         });
      }
   }
}
