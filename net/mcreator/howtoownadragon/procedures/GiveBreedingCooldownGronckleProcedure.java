package net.mcreator.howtoownadragon.procedures;

import java.util.Comparator;
import net.mcreator.howtoownadragon.entity.GronckleFemaleEntity;
import net.mcreator.howtoownadragon.init.HowToOwnADragonModMobEffects;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.phys.Vec3;

public class GiveBreedingCooldownGronckleProcedure {
   public static void execute(LevelAccessor world, double x, double y, double z) {
      Entity var8 = (Entity)world.m_6443_(GronckleFemaleEntity.class, AABB.m_165882_(new Vec3(x, y, z), 10.0D, 10.0D, 10.0D), (e) -> {
         return true;
      }).stream().sorted(((<undefinedtype>)(new Object() {
         Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
            return Comparator.comparingDouble((_entcnd) -> {
               return _entcnd.m_20275_(_x, _y, _z);
            });
         }
      })).compareDistOf(x, y, z)).findFirst().orElse((Object)null);
      if (var8 instanceof LivingEntity) {
         LivingEntity _entity = (LivingEntity)var8;
         if (!_entity.f_19853_.m_5776_()) {
            _entity.m_7292_(new MobEffectInstance((MobEffect)HowToOwnADragonModMobEffects.BREEDING_COOLDOWN.get(), 600, 1, false, false));
         }
      }

   }
}
