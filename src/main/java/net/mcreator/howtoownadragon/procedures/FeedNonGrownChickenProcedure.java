package net.mcreator.howtoownadragon.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.TamableAnimal;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.InteractionHand;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.particles.ParticleTypes;

import net.mcreator.howtoownadragon.entity.BabyChickenEntity;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class FeedNonGrownChickenProcedure {
	@SubscribeEvent
	public static void onRightClickEntity(PlayerInteractEvent.EntityInteract event) {
		if (event.getHand() != event.getEntity().getUsedItemHand())
			return;
		execute(event, event.getLevel(), event.getPos().getX(), event.getPos().getY(), event.getPos().getZ(), event.getTarget(), event.getEntity());
	}

	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, Entity sourceentity) {
		execute(null, world, x, y, z, entity, sourceentity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z, Entity entity, Entity sourceentity) {
		if (entity == null || sourceentity == null)
			return;
		if (entity instanceof TamableAnimal _tamIsTamedBy && sourceentity instanceof LivingEntity _livEnt ? _tamIsTamedBy.isOwnedBy(_livEnt) : false) {
			if (entity instanceof BabyChickenEntity) {
				if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Items.WHEAT_SEEDS) {
					if (sourceentity instanceof LivingEntity _entity) {
						ItemStack _setstack = new ItemStack(Items.WHEAT_SEEDS);
						_setstack.setCount((int) ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getCount() - 1));
						_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
						if (_entity instanceof Player _player)
							_player.getInventory().setChanged();
					}
					if (world instanceof ServerLevel _level)
						_level.sendParticles(ParticleTypes.HEART, x, y, z, 30, 3, 3, 3, 0.5);
				} else if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Items.PUMPKIN_SEEDS) {
					if (sourceentity instanceof LivingEntity _entity) {
						ItemStack _setstack = new ItemStack(Items.PUMPKIN_SEEDS);
						_setstack.setCount((int) ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getCount() - 1));
						_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
						if (_entity instanceof Player _player)
							_player.getInventory().setChanged();
					}
					if (world instanceof ServerLevel _level)
						_level.sendParticles(ParticleTypes.HEART, x, y, z, 30, 3, 3, 3, 0.5);
				} else if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Items.MELON_SEEDS) {
					if (sourceentity instanceof LivingEntity _entity) {
						ItemStack _setstack = new ItemStack(Items.MELON_SEEDS);
						_setstack.setCount((int) ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getCount() - 1));
						_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
						if (_entity instanceof Player _player)
							_player.getInventory().setChanged();
					}
					if (world instanceof ServerLevel _level)
						_level.sendParticles(ParticleTypes.HEART, x, y, z, 30, 3, 3, 3, 0.5);
				} else if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Items.BEETROOT_SEEDS) {
					if (sourceentity instanceof LivingEntity _entity) {
						ItemStack _setstack = new ItemStack(Items.BEETROOT_SEEDS);
						_setstack.setCount((int) ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getCount() - 1));
						_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
						if (_entity instanceof Player _player)
							_player.getInventory().setChanged();
					}
					if (world instanceof ServerLevel _level)
						_level.sendParticles(ParticleTypes.HEART, x, y, z, 30, 3, 3, 3, 0.5);
				}
			}
		}
	}
}
