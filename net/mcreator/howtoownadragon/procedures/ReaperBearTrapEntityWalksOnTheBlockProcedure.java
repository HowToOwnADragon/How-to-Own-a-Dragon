package net.mcreator.howtoownadragon.procedures;

import net.minecraft.core.registries.Registries;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.damagesource.DamageTypes;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;

public class ReaperBearTrapEntityWalksOnTheBlockProcedure {
   public static void execute(Entity entity) {
      if (entity != null) {
         if (entity instanceof LivingEntity) {
            LivingEntity _livEnt0 = (LivingEntity)entity;
            if (_livEnt0.m_21023_(MobEffects.f_19597_)) {
               return;
            }
         }

         entity.m_6469_(new DamageSource(entity.f_19853_.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268515_)), 4.0F);
         if (entity instanceof LivingEntity) {
            LivingEntity _entity = (LivingEntity)entity;
            if (!_entity.f_19853_.m_5776_()) {
               _entity.m_7292_(new MobEffectInstance(MobEffects.f_19597_, 40, 5, false, false));
            }
         }

      }
   }
}
