package net.mcreator.howtoownadragon.procedures;

import net.minecraft.network.chat.Component;
import net.minecraft.util.Mth;
import net.minecraft.util.RandomSource;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.TamableAnimal;
import net.minecraft.world.entity.player.Player;

public class GronckleGrowingUpMessageProcedure {
   public static void execute(Entity entity) {
      if (entity != null) {
         LivingEntity var10000;
         TamableAnimal _tamEnt;
         Player _player;
         LivingEntity var3;
         if (Mth.m_216271_(RandomSource.m_216327_(), 1, 10) == 1) {
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
                  _player.m_5661_(Component.m_237113_("Your " + entity.m_5446_().getString() + " is ready to grow up! It requires some sustenance. It needs some Stone!"), false);
               }
            }

            entity.getPersistentData().m_128359_("groncklegrowup", "stone");
         } else if (Mth.m_216271_(RandomSource.m_216327_(), 1, 10) == 2) {
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
                  _player.m_5661_(Component.m_237113_("Your " + entity.m_5446_().getString() + " is ready to grow up! It requires some sustenance. It needs some Cobblestone!"), false);
               }
            }

            entity.getPersistentData().m_128359_("groncklegrowup", "cobblestone");
         } else if (Mth.m_216271_(RandomSource.m_216327_(), 1, 10) == 3) {
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
                  _player.m_5661_(Component.m_237113_("Your " + entity.m_5446_().getString() + " is ready to grow up! It requires some sustenance. It needs some Deepslate!"), false);
               }
            }

            entity.getPersistentData().m_128359_("groncklegrowup", "deepslate");
         } else if (Mth.m_216271_(RandomSource.m_216327_(), 1, 10) == 4) {
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
                  _player.m_5661_(Component.m_237113_("Your " + entity.m_5446_().getString() + " is ready to grow up! It requires some sustenance. It needs some Cobbled Deepslate!"), false);
               }
            }

            entity.getPersistentData().m_128359_("groncklegrowup", "cobbleddeepslate");
         } else if (Mth.m_216271_(RandomSource.m_216327_(), 1, 10) == 5) {
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
                  _player.m_5661_(Component.m_237113_("Your " + entity.m_5446_().getString() + " is ready to grow up! It requires some sustenance. It needs some Andesite!"), false);
               }
            }

            entity.getPersistentData().m_128359_("groncklegrowup", "andesite");
         } else if (Mth.m_216271_(RandomSource.m_216327_(), 1, 10) == 6) {
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
                  _player.m_5661_(Component.m_237113_("Your " + entity.m_5446_().getString() + " is ready to grow up! It requires some sustenance. It needs some Diorite!"), false);
               }
            }

            entity.getPersistentData().m_128359_("groncklegrowup", "diorite");
         } else if (Mth.m_216271_(RandomSource.m_216327_(), 1, 10) == 7) {
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
                  _player.m_5661_(Component.m_237113_("Your " + entity.m_5446_().getString() + " is ready to grow up! It requires some sustenance. It needs some Granite!"), false);
               }
            }

            entity.getPersistentData().m_128359_("groncklegrowup", "granite");
         } else if (Mth.m_216271_(RandomSource.m_216327_(), 1, 10) == 8) {
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
                  _player.m_5661_(Component.m_237113_("Your " + entity.m_5446_().getString() + " is ready to grow up! It requires some sustenance. It needs some Lava!"), false);
               }
            }

            entity.getPersistentData().m_128359_("groncklegrowup", "lava");
         } else if (Mth.m_216271_(RandomSource.m_216327_(), 1, 10) == 9) {
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
                  _player.m_5661_(Component.m_237113_("Your " + entity.m_5446_().getString() + " is ready to grow up! It requires some sustenance. It needs some Iron!"), false);
               }
            }

            entity.getPersistentData().m_128359_("groncklegrowup", "iron");
         } else if (Mth.m_216271_(RandomSource.m_216327_(), 1, 10) == 10) {
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
                  _player.m_5661_(Component.m_237113_("Your " + entity.m_5446_().getString() + " is ready to grow up! It requires some sustenance. It needs some Sandstone!"), false);
               }
            }

            entity.getPersistentData().m_128359_("groncklegrowup", "sandstone");
         } else {
            execute(entity);
         }

      }
   }
}
