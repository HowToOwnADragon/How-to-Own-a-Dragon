package net.mcreator.howtoownadragon.procedures;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.damagesource.DamageTypes;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.core.registries.Registries;

import net.mcreator.howtoownadragon.init.HowToOwnADragonModMobEffects;

public class ReaperSpikeTrapProcedureProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		boolean CooldownActive = false;
		if (!(entity instanceof LivingEntity _livEnt0 && _livEnt0.hasEffect(HowToOwnADragonModMobEffects.HIT_BY_ARROW.get()))) {
			{
				Entity _entToDamage = entity;
				_entToDamage.hurt(new DamageSource(_entToDamage.level.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MAGIC)), Mth.nextInt(RandomSource.create(), 2, 4));
			}
			if (entity instanceof LivingEntity _entity && !_entity.level.isClientSide())
				_entity.addEffect(new MobEffectInstance(HowToOwnADragonModMobEffects.HIT_BY_ARROW.get(), 30, 1, false, false));
		}
	}
}
