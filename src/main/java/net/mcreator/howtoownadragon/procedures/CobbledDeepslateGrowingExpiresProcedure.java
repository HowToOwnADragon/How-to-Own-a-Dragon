package net.mcreator.howtoownadragon.procedures;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.TamableAnimal;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.network.chat.Component;

import net.mcreator.howtoownadragon.init.HowToOwnADragonModMobEffects;

public class CobbledDeepslateGrowingExpiresProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if ((entity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null) instanceof Player _player && !_player.level.isClientSide())
			_player.displayClientMessage(Component.literal("Don't forget your dragon, he needs some Cobbled Deepslate!"), false);
		if (entity instanceof LivingEntity _entity && !_entity.level.isClientSide())
			_entity.addEffect(new MobEffectInstance(HowToOwnADragonModMobEffects.COBBLED_DEEPSLATE_GROWING.get(), 6000, 1, false, false));
	}
}
