package net.mcreator.howtoownadragon.procedures;

import java.util.Iterator;
import net.minecraft.commands.CommandSource;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.core.BlockPos;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.network.protocol.game.ClientboundGameEventPacket;
import net.minecraft.network.protocol.game.ClientboundLevelEventPacket;
import net.minecraft.network.protocol.game.ClientboundPlayerAbilitiesPacket;
import net.minecraft.network.protocol.game.ClientboundUpdateMobEffectPacket;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.phys.Vec3;

public class ReaperPortalEntityWalksOnTheBlockProcedure {
   public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
      if (entity != null) {
         ServerPlayer _player;
         ResourceKey destinationType;
         ServerLevel nextLevel;
         Iterator var11;
         MobEffectInstance _effectinstance;
         if (entity.f_19853_.m_46472_() == Level.f_46428_) {
            if (entity instanceof ServerPlayer) {
               _player = (ServerPlayer)entity;
               if (!_player.f_19853_.m_5776_()) {
                  destinationType = ResourceKey.m_135785_(Registries.f_256858_, new ResourceLocation("how_to_own_a_dragon:the_reaper"));
                  if (_player.f_19853_.m_46472_() == destinationType) {
                     return;
                  }

                  nextLevel = _player.f_8924_.m_129880_(destinationType);
                  if (nextLevel != null) {
                     _player.f_8906_.m_9829_(new ClientboundGameEventPacket(ClientboundGameEventPacket.f_132157_, 0.0F));
                     _player.m_8999_(nextLevel, _player.m_20185_(), _player.m_20186_(), _player.m_20189_(), _player.m_146908_(), _player.m_146909_());
                     _player.f_8906_.m_9829_(new ClientboundPlayerAbilitiesPacket(_player.m_150110_()));
                     var11 = _player.m_21220_().iterator();

                     while(var11.hasNext()) {
                        _effectinstance = (MobEffectInstance)var11.next();
                        _player.f_8906_.m_9829_(new ClientboundUpdateMobEffectPacket(_player.m_19879_(), _effectinstance));
                     }

                     _player.f_8906_.m_9829_(new ClientboundLevelEventPacket(1032, BlockPos.f_121853_, 0, false));
                  }
               }
            }
         } else if (entity.f_19853_.m_46472_() == ResourceKey.m_135785_(Registries.f_256858_, new ResourceLocation("how_to_own_a_dragon:the_reaper"))) {
            if (entity instanceof LivingEntity) {
               LivingEntity _entity = (LivingEntity)entity;
               if (!_entity.f_19853_.m_5776_()) {
                  _entity.m_7292_(new MobEffectInstance(MobEffects.f_19610_, 10, 1, false, false));
               }
            }

            if (world instanceof ServerLevel) {
               ServerLevel _level = (ServerLevel)world;
               _level.m_7654_().m_129892_().m_230957_((new CommandSourceStack(CommandSource.f_80164_, new Vec3(x, y, z), Vec2.f_82462_, _level, 4, "", Component.m_237113_(""), _level.m_7654_(), (Entity)null)).m_81324_(), "tp @p ~-9.5 67 ~-2.5");
            }

            if (entity instanceof ServerPlayer) {
               _player = (ServerPlayer)entity;
               if (!_player.f_19853_.m_5776_()) {
                  destinationType = Level.f_46428_;
                  if (_player.f_19853_.m_46472_() == destinationType) {
                     return;
                  }

                  nextLevel = _player.f_8924_.m_129880_(destinationType);
                  if (nextLevel != null) {
                     _player.f_8906_.m_9829_(new ClientboundGameEventPacket(ClientboundGameEventPacket.f_132157_, 0.0F));
                     _player.m_8999_(nextLevel, _player.m_20185_(), _player.m_20186_(), _player.m_20189_(), _player.m_146908_(), _player.m_146909_());
                     _player.f_8906_.m_9829_(new ClientboundPlayerAbilitiesPacket(_player.m_150110_()));
                     var11 = _player.m_21220_().iterator();

                     while(var11.hasNext()) {
                        _effectinstance = (MobEffectInstance)var11.next();
                        _player.f_8906_.m_9829_(new ClientboundUpdateMobEffectPacket(_player.m_19879_(), _effectinstance));
                     }

                     _player.f_8906_.m_9829_(new ClientboundLevelEventPacket(1032, BlockPos.f_121853_, 0, false));
                  }
               }
            }
         }

      }
   }
}
