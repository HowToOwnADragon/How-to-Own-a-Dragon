package net.mcreator.howtoownadragon.procedures;

import java.util.Iterator;
import net.minecraft.core.BlockPos;
import net.minecraft.network.protocol.game.ClientboundGameEventPacket;
import net.minecraft.network.protocol.game.ClientboundLevelEventPacket;
import net.minecraft.network.protocol.game.ClientboundPlayerAbilitiesPacket;
import net.minecraft.network.protocol.game.ClientboundUpdateMobEffectPacket;
import net.minecraft.resources.ResourceKey;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.level.Level;

public class TpToVanillaOverworldProcedure {
   public static void execute(Entity entity) {
      if (entity != null) {
         if (entity instanceof ServerPlayer) {
            ServerPlayer _player = (ServerPlayer)entity;
            if (!_player.f_19853_.m_5776_()) {
               ResourceKey<Level> destinationType = Level.f_46428_;
               if (_player.f_19853_.m_46472_() == destinationType) {
                  return;
               }

               ServerLevel nextLevel = _player.f_8924_.m_129880_(destinationType);
               if (nextLevel != null) {
                  _player.f_8906_.m_9829_(new ClientboundGameEventPacket(ClientboundGameEventPacket.f_132157_, 0.0F));
                  _player.m_8999_(nextLevel, _player.m_20185_(), _player.m_20186_(), _player.m_20189_(), _player.m_146908_(), _player.m_146909_());
                  _player.f_8906_.m_9829_(new ClientboundPlayerAbilitiesPacket(_player.m_150110_()));
                  Iterator var4 = _player.m_21220_().iterator();

                  while(var4.hasNext()) {
                     MobEffectInstance _effectinstance = (MobEffectInstance)var4.next();
                     _player.f_8906_.m_9829_(new ClientboundUpdateMobEffectPacket(_player.m_19879_(), _effectinstance));
                  }

                  _player.f_8906_.m_9829_(new ClientboundLevelEventPacket(1032, BlockPos.f_121853_, 0, false));
               }
            }
         }

      }
   }
}
