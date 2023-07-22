package net.mcreator.howtoownadragon.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.particles.ParticleTypes;

import net.mcreator.howtoownadragon.init.HowToOwnADragonModMobEffects;
import net.mcreator.howtoownadragon.init.HowToOwnADragonModEntities;
import net.mcreator.howtoownadragon.entity.MeatlugEntity;
import net.mcreator.howtoownadragon.entity.GroncklePinkEntity;
import net.mcreator.howtoownadragon.entity.GronckleOrangeRedEntity;
import net.mcreator.howtoownadragon.entity.GronckleBlueYellowEntity;
import net.mcreator.howtoownadragon.entity.AdolescentMeatlugEntity;
import net.mcreator.howtoownadragon.entity.AdolescentGronckleBlueYellowEntity;
import net.mcreator.howtoownadragon.entity.AdolecsentGroncklePinkEntity;
import net.mcreator.howtoownadragon.entity.AdolecsentGronckleOrangeRedEntity;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class AdolescentCobblestoneGrowupProcedure {
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
		if (entity instanceof LivingEntity _livEnt0 && _livEnt0.hasEffect(HowToOwnADragonModMobEffects.COBBLESTONE_GROWING.get()) && entity instanceof AdolescentMeatlugEntity) {
			if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Blocks.COBBLESTONE.asItem()) {
				if (sourceentity instanceof Player _player) {
					ItemStack _stktoremove = new ItemStack(Blocks.COBBLESTONE);
					_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
				}
				if (world instanceof ServerLevel _level)
					_level.sendParticles(ParticleTypes.HAPPY_VILLAGER, x, y, z, 30, 1, 1, 1, 0.5);
				if (!entity.level.isClientSide())
					entity.discard();
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new MeatlugEntity(HowToOwnADragonModEntities.MEATLUG.get(), _level);
					entityToSpawn.moveTo(x, y, z, 0, 0);
					entityToSpawn.setYBodyRot(0);
					entityToSpawn.setYHeadRot(0);
					entityToSpawn.setDeltaMovement(0, 0, 0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
					_level.addFreshEntity(entityToSpawn);
				}
				TameGrownUpWhenSpawnedProcedure.execute(world, x, y, z);
			}
		} else if (entity instanceof LivingEntity _livEnt8 && _livEnt8.hasEffect(HowToOwnADragonModMobEffects.COBBLESTONE_GROWING.get()) && entity instanceof AdolecsentGroncklePinkEntity) {
			if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Blocks.COBBLESTONE.asItem()) {
				if (sourceentity instanceof Player _player) {
					ItemStack _stktoremove = new ItemStack(Blocks.COBBLESTONE);
					_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
				}
				if (world instanceof ServerLevel _level)
					_level.sendParticles(ParticleTypes.HAPPY_VILLAGER, x, y, z, 30, 1, 1, 1, 0.5);
				if (!entity.level.isClientSide())
					entity.discard();
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new GroncklePinkEntity(HowToOwnADragonModEntities.GRONCKLE_PINK.get(), _level);
					entityToSpawn.moveTo(x, y, z, 0, 0);
					entityToSpawn.setYBodyRot(0);
					entityToSpawn.setYHeadRot(0);
					entityToSpawn.setDeltaMovement(0, 0, 0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
					_level.addFreshEntity(entityToSpawn);
				}
				TameGrownUpWhenSpawnedProcedure.execute(world, x, y, z);
			}
		} else if (entity instanceof LivingEntity _livEnt16 && _livEnt16.hasEffect(HowToOwnADragonModMobEffects.COBBLESTONE_GROWING.get()) && entity instanceof AdolecsentGronckleOrangeRedEntity) {
			if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Blocks.COBBLESTONE.asItem()) {
				if (sourceentity instanceof Player _player) {
					ItemStack _stktoremove = new ItemStack(Blocks.COBBLESTONE);
					_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
				}
				if (world instanceof ServerLevel _level)
					_level.sendParticles(ParticleTypes.HAPPY_VILLAGER, x, y, z, 30, 1, 1, 1, 0.5);
				if (!entity.level.isClientSide())
					entity.discard();
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new GronckleOrangeRedEntity(HowToOwnADragonModEntities.GRONCKLE_ORANGE_RED.get(), _level);
					entityToSpawn.moveTo(x, y, z, 0, 0);
					entityToSpawn.setYBodyRot(0);
					entityToSpawn.setYHeadRot(0);
					entityToSpawn.setDeltaMovement(0, 0, 0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
					_level.addFreshEntity(entityToSpawn);
				}
				TameGrownUpWhenSpawnedProcedure.execute(world, x, y, z);
			}
		} else if (entity instanceof LivingEntity _livEnt24 && _livEnt24.hasEffect(HowToOwnADragonModMobEffects.COBBLESTONE_GROWING.get()) && entity instanceof AdolescentGronckleBlueYellowEntity) {
			if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Blocks.COBBLESTONE.asItem()) {
				if (sourceentity instanceof Player _player) {
					ItemStack _stktoremove = new ItemStack(Blocks.COBBLESTONE);
					_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
				}
				if (world instanceof ServerLevel _level)
					_level.sendParticles(ParticleTypes.HAPPY_VILLAGER, x, y, z, 30, 1, 1, 1, 0.5);
				if (!entity.level.isClientSide())
					entity.discard();
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new GronckleBlueYellowEntity(HowToOwnADragonModEntities.GRONCKLE_BLUE_YELLOW.get(), _level);
					entityToSpawn.moveTo(x, y, z, 0, 0);
					entityToSpawn.setYBodyRot(0);
					entityToSpawn.setYHeadRot(0);
					entityToSpawn.setDeltaMovement(0, 0, 0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
					_level.addFreshEntity(entityToSpawn);
				}
				TameGrownUpWhenSpawnedProcedure.execute(world, x, y, z);
			}
		}
	}
}
