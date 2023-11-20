package net.mcreator.howtoownadragon.procedures;

import java.util.Comparator;
import javax.annotation.Nullable;
import net.mcreator.howtoownadragon.entity.NadderFemaleEntity;
import net.mcreator.howtoownadragon.entity.NadderMaleEntity;
import net.mcreator.howtoownadragon.init.HowToOwnADragonModMobEffects;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.TamableAnimal;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.phys.Vec3;
import net.minecraftforge.event.entity.player.PlayerInteractEvent.EntityInteract;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;

@EventBusSubscriber
public class RedRedBreedingFemaleNadderProcedure {
   @SubscribeEvent
   public static void onRightClickEntity(EntityInteract event) {
      if (event.getHand() == event.getEntity().m_7655_()) {
         execute(event, event.getLevel(), (double)event.getPos().m_123341_(), (double)event.getPos().m_123342_(), (double)event.getPos().m_123343_(), event.getTarget(), event.getEntity());
      }
   }

   public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, Entity sourceentity) {
      execute((Event)null, world, x, y, z, entity, sourceentity);
   }

   private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z, Entity entity, Entity sourceentity) {
      if (entity != null && sourceentity != null) {
         if (entity instanceof TamableAnimal) {
            TamableAnimal _tamIsTamedBy = (TamableAnimal)entity;
            if (sourceentity instanceof LivingEntity) {
               LivingEntity _livEnt = (LivingEntity)sourceentity;
               if (_tamIsTamedBy.m_21830_(_livEnt) && entity instanceof NadderFemaleEntity && !world.m_6443_(NadderMaleEntity.class, AABB.m_165882_(new Vec3(x, y, z), 4.0D, 4.0D, 4.0D), (e) -> {
                  return true;
               }).isEmpty()) {
                  if (entity instanceof LivingEntity) {
                     LivingEntity _livEnt3 = (LivingEntity)entity;
                     if (_livEnt3.m_21023_((MobEffect)HowToOwnADragonModMobEffects.BREEDING_COOLDOWN.get())) {
                        return;
                     }
                  }

                  if (((Entity)world.m_6443_(NadderMaleEntity.class, AABB.m_165882_(new Vec3(x, y, z), 10.0D, 10.0D, 10.0D), (e) -> {
                     return true;
                  }).stream().sorted(((<undefinedtype>)(new Object() {
                     Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                        return Comparator.comparingDouble((_entcnd) -> {
                           return _entcnd.m_20275_(_x, _y, _z);
                        });
                     }
                  })).compareDistOf(x, y, z)).findFirst().orElse((Object)null)).getPersistentData().m_128471_("nadderinlove") && ((Entity)world.m_6443_(NadderMaleEntity.class, AABB.m_165882_(new Vec3(x, y, z), 10.0D, 10.0D, 10.0D), (e) -> {
                     return true;
                  }).stream().sorted(((<undefinedtype>)(new Object() {
                     Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                        return Comparator.comparingDouble((_entcnd) -> {
                           return _entcnd.m_20275_(_x, _y, _z);
                        });
                     }
                  })).compareDistOf(x, y, z)).findFirst().orElse((Object)null)).getPersistentData().m_128461_("naddercolor").equals("red") && entity.getPersistentData().m_128461_("naddercolor").equals("red")) {
                     ((Entity)world.m_6443_(NadderMaleEntity.class, AABB.m_165882_(new Vec3(x, y, z), 10.0D, 10.0D, 10.0D), (e) -> {
                        return true;
                     }).stream().sorted(((<undefinedtype>)(new Object() {
                        Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                           return Comparator.comparingDouble((_entcnd) -> {
                              return _entcnd.m_20275_(_x, _y, _z);
                           });
                        }
                     })).compareDistOf(x, y, z)).findFirst().orElse((Object)null)).getPersistentData().m_128379_("nadderinlove", false);
                     RedRedNadderBreedingReqProcedure.execute(world, x, y, z, sourceentity);
                  }
               }
            }
         }

      }
   }
}
