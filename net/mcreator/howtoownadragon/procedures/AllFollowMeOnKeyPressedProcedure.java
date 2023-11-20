package net.mcreator.howtoownadragon.procedures;

import net.minecraft.network.chat.Component;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.player.Player;

public class AllFollowMeOnKeyPressedProcedure {
   public static void execute(Entity entity) {
      if (entity != null) {
         Player _player;
         if (entity.getPersistentData().m_128471_("FollowAll")) {
            entity.getPersistentData().m_128379_("FollowAll", false);
            if (entity instanceof Player) {
               _player = (Player)entity;
               if (!_player.f_19853_.m_5776_()) {
                  _player.m_5661_(Component.m_237113_("Whistle \"Stop All\""), true);
               }
            }
         } else {
            entity.getPersistentData().m_128379_("FollowAll", true);
            if (entity instanceof Player) {
               _player = (Player)entity;
               if (!_player.f_19853_.m_5776_()) {
                  _player.m_5661_(Component.m_237113_("Whistle \"Follow All\""), true);
               }
            }
         }

      }
   }
}
