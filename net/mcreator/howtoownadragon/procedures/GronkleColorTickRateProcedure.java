package net.mcreator.howtoownadragon.procedures;

import net.mcreator.howtoownadragon.HowToOwnADragonMod;
import net.mcreator.howtoownadragon.entity.BabyGronckleFemaleEntity;
import net.mcreator.howtoownadragon.entity.BabyGronckleMaleEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.level.LevelAccessor;

public class GronkleColorTickRateProcedure {
   public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
      if (entity != null) {
         entity.getPersistentData().m_128379_("groncklesaddle", false);
         entity.getPersistentData().m_128379_("groncklefeedcooldown", false);
         HowToOwnADragonMod.queueServerWork(2, () -> {
            if (entity instanceof BabyGronckleMaleEntity) {
               BabyGronckleMaleEntity animatable;
               if (entity.getPersistentData().m_128461_("groncklecolor").equals("pink")) {
                  if (entity instanceof BabyGronckleMaleEntity) {
                     animatable = (BabyGronckleMaleEntity)entity;
                     animatable.setTexture("babygroncklepink");
                  }

                  GronckleGrowingTickRateProcedure.execute(world, x, y, z, entity);
               } else if (entity.getPersistentData().m_128461_("groncklecolor").equals("meatlug")) {
                  if (entity instanceof BabyGronckleMaleEntity) {
                     animatable = (BabyGronckleMaleEntity)entity;
                     animatable.setTexture("babymeatlug");
                  }

                  GronckleGrowingTickRateProcedure.execute(world, x, y, z, entity);
               } else if (entity.getPersistentData().m_128461_("groncklecolor").equals("orangered")) {
                  if (entity instanceof BabyGronckleMaleEntity) {
                     animatable = (BabyGronckleMaleEntity)entity;
                     animatable.setTexture("babygronckleorange");
                  }

                  GronckleGrowingTickRateProcedure.execute(world, x, y, z, entity);
               } else if (entity.getPersistentData().m_128461_("groncklecolor").equals("blueyellow")) {
                  if (entity instanceof BabyGronckleMaleEntity) {
                     animatable = (BabyGronckleMaleEntity)entity;
                     animatable.setTexture("babygroncleblue");
                  }

                  GronckleGrowingTickRateProcedure.execute(world, x, y, z, entity);
               }
            } else if (entity instanceof BabyGronckleFemaleEntity) {
               BabyGronckleFemaleEntity animatablex;
               if (entity.getPersistentData().m_128461_("groncklecolor").equals("pink")) {
                  if (entity instanceof BabyGronckleFemaleEntity) {
                     animatablex = (BabyGronckleFemaleEntity)entity;
                     animatablex.setTexture("babygroncklepink");
                  }

                  GronckleGrowingTickRateProcedure.execute(world, x, y, z, entity);
               } else if (entity.getPersistentData().m_128461_("groncklecolor").equals("meatlug")) {
                  if (entity instanceof BabyGronckleFemaleEntity) {
                     animatablex = (BabyGronckleFemaleEntity)entity;
                     animatablex.setTexture("babymeatlug");
                  }

                  GronckleGrowingTickRateProcedure.execute(world, x, y, z, entity);
               } else if (entity.getPersistentData().m_128461_("groncklecolor").equals("orangered")) {
                  if (entity instanceof BabyGronckleFemaleEntity) {
                     animatablex = (BabyGronckleFemaleEntity)entity;
                     animatablex.setTexture("babygronckleorange");
                  }

                  GronckleGrowingTickRateProcedure.execute(world, x, y, z, entity);
               } else if (entity.getPersistentData().m_128461_("groncklecolor").equals("blueyellow")) {
                  if (entity instanceof BabyGronckleFemaleEntity) {
                     animatablex = (BabyGronckleFemaleEntity)entity;
                     animatablex.setTexture("babygroncleblue");
                  }

                  GronckleGrowingTickRateProcedure.execute(world, x, y, z, entity);
               }
            }

         });
      }
   }
}
