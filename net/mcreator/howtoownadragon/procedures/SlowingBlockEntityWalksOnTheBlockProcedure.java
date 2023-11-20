package net.mcreator.howtoownadragon.procedures;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;

public class SlowingBlockEntityWalksOnTheBlockProcedure {
   public static void execute(Entity entity) {
      if (entity != null) {
         if (entity instanceof LivingEntity) {
            LivingEntity _entity = (LivingEntity)entity;
            if (!_entity.f_19853_.m_5776_()) {
               _entity.m_7292_(new MobEffectInstance(MobEffects.f_19597_, 60, 0, false, false));
            }
         }

      }
   }
}
