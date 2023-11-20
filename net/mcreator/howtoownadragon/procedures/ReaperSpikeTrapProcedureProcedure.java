package net.mcreator.howtoownadragon.procedures;

import net.mcreator.howtoownadragon.init.HowToOwnADragonModMobEffects;
import net.minecraft.core.registries.Registries;
import net.minecraft.util.Mth;
import net.minecraft.util.RandomSource;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.damagesource.DamageTypes;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;

public class ReaperSpikeTrapProcedureProcedure {
   public static void execute(Entity entity) {
      if (entity != null) {
         boolean CooldownActive = false;
         if (entity instanceof LivingEntity) {
            LivingEntity _livEnt0 = (LivingEntity)entity;
            if (_livEnt0.m_21023_((MobEffect)HowToOwnADragonModMobEffects.HIT_BY_ARROW.get())) {
               return;
            }
         }

         entity.m_6469_(new DamageSource(entity.f_19853_.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268515_)), (float)Mth.m_216271_(RandomSource.m_216327_(), 2, 4));
         if (entity instanceof LivingEntity) {
            LivingEntity _entity = (LivingEntity)entity;
            if (!_entity.f_19853_.m_5776_()) {
               _entity.m_7292_(new MobEffectInstance((MobEffect)HowToOwnADragonModMobEffects.HIT_BY_ARROW.get(), 30, 1, false, false));
            }
         }

      }
   }
}
