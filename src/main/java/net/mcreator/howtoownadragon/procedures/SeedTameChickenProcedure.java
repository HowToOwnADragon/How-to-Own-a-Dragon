package net.mcreator.howtoownadragon.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.GameType;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.TamableAnimal;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.InteractionHand;
import net.minecraft.tags.TagKey;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.client.Minecraft;

import net.mcreator.howtoownadragon.HowToOwnADragonMod;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class SeedTameChickenProcedure {
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
		HowToOwnADragonMod.queueServerWork(1, () -> {
			if (entity.getType().is(TagKey.create(Registries.ENTITY_TYPE, new ResourceLocation("how_to_own_a_dragon:chickens")))) {
				if (!(entity instanceof TamableAnimal _tamEnt ? _tamEnt.isTame() : false)) {
					if (new Object() {
						public boolean checkGamemode(Entity _ent) {
							if (_ent instanceof ServerPlayer _serverPlayer) {
								return _serverPlayer.gameMode.getGameModeForPlayer() == GameType.SURVIVAL;
							} else if (_ent.level.isClientSide() && _ent instanceof Player _player) {
								return Minecraft.getInstance().getConnection().getPlayerInfo(_player.getGameProfile().getId()) != null
										&& Minecraft.getInstance().getConnection().getPlayerInfo(_player.getGameProfile().getId()).getGameMode() == GameType.SURVIVAL;
							}
							return false;
						}
					}.checkGamemode(sourceentity)) {
						if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Items.WHEAT_SEEDS) {
							if (Math.random() < 0.7) {
								if (sourceentity instanceof LivingEntity _entity) {
									ItemStack _setstack = new ItemStack(Items.WHEAT_SEEDS);
									_setstack.setCount((int) ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getCount() - 1));
									_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
									if (_entity instanceof Player _player)
										_player.getInventory().setChanged();
								}
								if (world instanceof ServerLevel _level)
									_level.sendParticles(ParticleTypes.SQUID_INK, x, y, z, 30, 3, 3, 3, 1);
							}
							if (Math.random() >= 0.7) {
								if (sourceentity instanceof LivingEntity _entity) {
									ItemStack _setstack = new ItemStack(Items.WHEAT_SEEDS);
									_setstack.setCount((int) ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getCount() - 1));
									_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
									if (_entity instanceof Player _player)
										_player.getInventory().setChanged();
								}
								if (world instanceof ServerLevel _level)
									_level.sendParticles(ParticleTypes.HEART, x, y, z, 30, 3, 3, 3, 1);
								if (entity instanceof TamableAnimal _toTame && sourceentity instanceof Player _owner)
									_toTame.tame(_owner);
							}
						}
					}
					if (!(entity instanceof TamableAnimal _tamEnt ? _tamEnt.isTame() : false) && new Object() {
						public boolean checkGamemode(Entity _ent) {
							if (_ent instanceof ServerPlayer _serverPlayer) {
								return _serverPlayer.gameMode.getGameModeForPlayer() == GameType.CREATIVE;
							} else if (_ent.level.isClientSide() && _ent instanceof Player _player) {
								return Minecraft.getInstance().getConnection().getPlayerInfo(_player.getGameProfile().getId()) != null
										&& Minecraft.getInstance().getConnection().getPlayerInfo(_player.getGameProfile().getId()).getGameMode() == GameType.CREATIVE;
							}
							return false;
						}
					}.checkGamemode(sourceentity)) {
						if (world instanceof ServerLevel _level)
							_level.sendParticles(ParticleTypes.HEART, x, y, z, 30, 3, 3, 3, 1);
						if (entity instanceof TamableAnimal _toTame && sourceentity instanceof Player _owner)
							_toTame.tame(_owner);
					}
				}
			}
		});
	}
}
