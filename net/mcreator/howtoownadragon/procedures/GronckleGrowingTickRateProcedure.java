package net.mcreator.howtoownadragon.procedures;

import java.util.Comparator;
import net.mcreator.howtoownadragon.HowToOwnADragonMod;
import net.minecraft.util.Mth;
import net.minecraft.util.RandomSource;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.TamableAnimal;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.phys.Vec3;

public class GronckleGrowingTickRateProcedure {
   public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
      if (entity != null) {
         entity.getPersistentData().m_128379_("groncklesaddle", false);
         entity.getPersistentData().m_128379_("groncklefeedcooldown", false);
         HowToOwnADragonMod.queueServerWork(2, () -> {
            if (entity instanceof TamableAnimal) {
               TamableAnimal _toTame = (TamableAnimal)entity;
               Entity patt1263$temp = (Entity)world.m_6443_(Player.class, AABB.m_165882_(new Vec3(x, y, z), 4.0D, 4.0D, 4.0D), (e) -> {
                  return true;
               }).stream().sorted(((<undefinedtype>)(new Object() {
                  Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                     return Comparator.comparingDouble((_entcnd) -> {
                        return _entcnd.m_20275_(_x, _y, _z);
                     });
                  }
               })).compareDistOf(x, y, z)).findFirst().orElse((Object)null);
               if (patt1263$temp instanceof Player) {
                  Player _owner = (Player)patt1263$temp;
                  _toTame.m_21828_(_owner);
               }
            }

            HowToOwnADragonMod.queueServerWork(600, () -> {
               if (entity.m_6084_()) {
                  if (Mth.m_216271_(RandomSource.m_216327_(), 1, 10) <= 2) {
                     GronckleGrowingUpMessageProcedure.execute(entity);
                  } else {
                     HowToOwnADragonMod.queueServerWork(600, () -> {
                        if (entity.m_6084_()) {
                           if (Mth.m_216271_(RandomSource.m_216327_(), 3, 10) <= 4) {
                              GronckleGrowingUpMessageProcedure.execute(entity);
                           } else {
                              HowToOwnADragonMod.queueServerWork(600, () -> {
                                 if (entity.m_6084_()) {
                                    if (Mth.m_216271_(RandomSource.m_216327_(), 5, 10) <= 6) {
                                       GronckleGrowingUpMessageProcedure.execute(entity);
                                    } else {
                                       HowToOwnADragonMod.queueServerWork(600, () -> {
                                          if (entity.m_6084_()) {
                                             if (Mth.m_216271_(RandomSource.m_216327_(), 7, 10) <= 8) {
                                                GronckleGrowingUpMessageProcedure.execute(entity);
                                             } else {
                                                HowToOwnADragonMod.queueServerWork(600, () -> {
                                                   if (entity.m_6084_()) {
                                                      GronckleGrowingUpMessageProcedure.execute(entity);
                                                   }

                                                });
                                             }
                                          }

                                       });
                                    }
                                 }

                              });
                           }
                        }

                     });
                  }
               }

            });
         });
      }
   }
}
