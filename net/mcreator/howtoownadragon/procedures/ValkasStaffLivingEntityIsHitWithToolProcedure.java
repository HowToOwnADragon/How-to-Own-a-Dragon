package net.mcreator.howtoownadragon.procedures;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.TamableAnimal;
import net.minecraft.world.entity.player.Player;

public class ValkasStaffLivingEntityIsHitWithToolProcedure {
   public static void execute(Entity entity, Entity sourceentity) {
      if (entity != null && sourceentity != null) {
         if (entity instanceof TamableAnimal) {
            TamableAnimal _tamIsTamedBy = (TamableAnimal)entity;
            if (sourceentity instanceof LivingEntity) {
               LivingEntity _livEnt = (LivingEntity)sourceentity;
               if (_tamIsTamedBy.m_21830_(_livEnt) && entity.m_6095_().m_204039_(TagKey.m_203882_(Registries.f_256939_, new ResourceLocation("how_to_own_a_dragon:grown_dragon")))) {
                  Player _player;
                  LivingEntity _entity;
                  if (entity.getPersistentData().m_128471_("FollowPlayer")) {
                     entity.getPersistentData().m_128379_("FollowPlayer", false);
                     if (sourceentity instanceof Player) {
                        _player = (Player)sourceentity;
                        if (!_player.f_19853_.m_5776_()) {
                           _player.m_5661_(Component.m_237113_("Order \"Stop Following\""), true);
                        }
                     }

                     if (entity instanceof LivingEntity) {
                        _entity = (LivingEntity)entity;
                        if (!_entity.f_19853_.m_5776_()) {
                           _entity.m_7292_(new MobEffectInstance(MobEffects.f_19601_, 1, 1, false, false));
                        }
                     }
                  } else {
                     entity.getPersistentData().m_128379_("FollowPlayer", true);
                     if (sourceentity instanceof Player) {
                        _player = (Player)sourceentity;
                        if (!_player.f_19853_.m_5776_()) {
                           _player.m_5661_(Component.m_237113_("Order \"Follow Me\""), true);
                        }
                     }

                     if (entity instanceof LivingEntity) {
                        _entity = (LivingEntity)entity;
                        if (!_entity.f_19853_.m_5776_()) {
                           _entity.m_7292_(new MobEffectInstance(MobEffects.f_19601_, 1, 1, false, false));
                        }
                     }
                  }
               }
            }
         }

      }
   }
}
