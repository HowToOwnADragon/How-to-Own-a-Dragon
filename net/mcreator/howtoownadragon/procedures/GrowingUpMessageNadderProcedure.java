package net.mcreator.howtoownadragon.procedures;

import net.minecraft.network.chat.Component;
import net.minecraft.util.Mth;
import net.minecraft.util.RandomSource;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.TamableAnimal;
import net.minecraft.world.entity.player.Player;

public class GrowingUpMessageNadderProcedure {
   public static void execute(Entity entity) {
      if (entity != null) {
         LivingEntity var10000;
         TamableAnimal _tamEnt;
         Player _player;
         LivingEntity var3;
         if (Mth.m_216271_(RandomSource.m_216327_(), 1, 4) == 1) {
            if (entity instanceof TamableAnimal) {
               _tamEnt = (TamableAnimal)entity;
               var10000 = _tamEnt.m_269323_();
            } else {
               var10000 = null;
            }

            var3 = var10000;
            if (var3 instanceof Player) {
               _player = (Player)var3;
               if (!_player.f_19853_.m_5776_()) {
                  _player.m_5661_(Component.m_237113_("Your " + entity.m_5446_().getString() + " is ready to grow up! It requires some sustenance. It needs some Raw Mutton!"), false);
               }
            }

            entity.getPersistentData().m_128359_("naddergrowup", "mutton");
         } else if (Mth.m_216271_(RandomSource.m_216327_(), 1, 4) == 2) {
            if (entity instanceof TamableAnimal) {
               _tamEnt = (TamableAnimal)entity;
               var10000 = _tamEnt.m_269323_();
            } else {
               var10000 = null;
            }

            var3 = var10000;
            if (var3 instanceof Player) {
               _player = (Player)var3;
               if (!_player.f_19853_.m_5776_()) {
                  _player.m_5661_(Component.m_237113_("Your " + entity.m_5446_().getString() + " is ready to grow up! It requires some sustenance. It needs some Raw Cod!"), false);
               }
            }

            entity.getPersistentData().m_128359_("naddergrowup", "cod");
         } else if (Mth.m_216271_(RandomSource.m_216327_(), 1, 4) == 3) {
            if (entity instanceof TamableAnimal) {
               _tamEnt = (TamableAnimal)entity;
               var10000 = _tamEnt.m_269323_();
            } else {
               var10000 = null;
            }

            var3 = var10000;
            if (var3 instanceof Player) {
               _player = (Player)var3;
               if (!_player.f_19853_.m_5776_()) {
                  _player.m_5661_(Component.m_237113_("Your " + entity.m_5446_().getString() + " is ready to grow up! It requires some sustenance. It needs some Raw Salmon!"), false);
               }
            }

            entity.getPersistentData().m_128359_("naddergrowup", "salmon");
         } else if (Mth.m_216271_(RandomSource.m_216327_(), 1, 4) == 4) {
            if (entity instanceof TamableAnimal) {
               _tamEnt = (TamableAnimal)entity;
               var10000 = _tamEnt.m_269323_();
            } else {
               var10000 = null;
            }

            var3 = var10000;
            if (var3 instanceof Player) {
               _player = (Player)var3;
               if (!_player.f_19853_.m_5776_()) {
                  _player.m_5661_(Component.m_237113_("Your " + entity.m_5446_().getString() + " is ready to grow up! It requires some sustenance. It needs some Cooked Chicken!"), false);
               }
            }

            entity.getPersistentData().m_128359_("naddergrowup", "chicken");
         } else {
            execute(entity);
         }

      }
   }
}
