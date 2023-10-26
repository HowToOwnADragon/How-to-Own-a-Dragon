package net.mcreator.howtoownadragon.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class GronckleBreedingCooldownProcedure {
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
			if (entity.getType().is(TagKey.create(Registries.ENTITY_TYPE, new ResourceLocation("how_to_own_a_dragon:gronckle_full_grown")))) {
				if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Blocks.STONE.asItem()) {
					if (sourceentity instanceof LivingEntity _entity) {
						ItemStack _setstack = new ItemStack(Blocks.STONE);
						_setstack.setCount((int) ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getCount() - 1));
						_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
						if (_entity instanceof Player _player)
							_player.getInventory().setChanged();
					}
					if (world instanceof ServerLevel _level)
						_level.sendParticles(ParticleTypes.HEART, x, y, z, 30, 3, 3, 3, 0.5);
					entity.getPersistentData().putBoolean("gronckleinlove", true);
				} else if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Blocks.SANDSTONE.asItem()) {
					if (sourceentity instanceof LivingEntity _entity) {
						ItemStack _setstack = new ItemStack(Blocks.SANDSTONE);
						_setstack.setCount((int) ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getCount() - 1));
						_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
						if (_entity instanceof Player _player)
							_player.getInventory().setChanged();
					}
					if (world instanceof ServerLevel _level)
						_level.sendParticles(ParticleTypes.HEART, x, y, z, 30, 3, 3, 3, 0.5);
					entity.getPersistentData().putBoolean("gronckleinlove", true);
				} else if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Blocks.COBBLESTONE.asItem()) {
					if (sourceentity instanceof LivingEntity _entity) {
						ItemStack _setstack = new ItemStack(Blocks.COBBLESTONE);
						_setstack.setCount((int) ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getCount() - 1));
						_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
						if (_entity instanceof Player _player)
							_player.getInventory().setChanged();
					}
					if (world instanceof ServerLevel _level)
						_level.sendParticles(ParticleTypes.HEART, x, y, z, 30, 3, 3, 3, 0.5);
					entity.getPersistentData().putBoolean("gronckleinlove", true);
				} else if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Blocks.DEEPSLATE.asItem()) {
					if (sourceentity instanceof LivingEntity _entity) {
						ItemStack _setstack = new ItemStack(Blocks.DEEPSLATE);
						_setstack.setCount((int) ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getCount() - 1));
						_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
						if (_entity instanceof Player _player)
							_player.getInventory().setChanged();
					}
					if (world instanceof ServerLevel _level)
						_level.sendParticles(ParticleTypes.HEART, x, y, z, 30, 3, 3, 3, 0.5);
					entity.getPersistentData().putBoolean("gronckleinlove", true);
				} else if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Blocks.COBBLED_DEEPSLATE.asItem()) {
					if (sourceentity instanceof LivingEntity _entity) {
						ItemStack _setstack = new ItemStack(Blocks.COBBLED_DEEPSLATE);
						_setstack.setCount((int) ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getCount() - 1));
						_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
						if (_entity instanceof Player _player)
							_player.getInventory().setChanged();
					}
					if (world instanceof ServerLevel _level)
						_level.sendParticles(ParticleTypes.HEART, x, y, z, 30, 3, 3, 3, 0.5);
					entity.getPersistentData().putBoolean("gronckleinlove", true);
				} else if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Blocks.DIORITE.asItem()) {
					if (sourceentity instanceof LivingEntity _entity) {
						ItemStack _setstack = new ItemStack(Blocks.DIORITE);
						_setstack.setCount((int) ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getCount() - 1));
						_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
						if (_entity instanceof Player _player)
							_player.getInventory().setChanged();
					}
					if (world instanceof ServerLevel _level)
						_level.sendParticles(ParticleTypes.HEART, x, y, z, 30, 3, 3, 3, 0.5);
					entity.getPersistentData().putBoolean("gronckleinlove", true);
				} else if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Blocks.GRANITE.asItem()) {
					if (sourceentity instanceof LivingEntity _entity) {
						ItemStack _setstack = new ItemStack(Blocks.GRANITE);
						_setstack.setCount((int) ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getCount() - 1));
						_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
						if (_entity instanceof Player _player)
							_player.getInventory().setChanged();
					}
					if (world instanceof ServerLevel _level)
						_level.sendParticles(ParticleTypes.HEART, x, y, z, 30, 3, 3, 3, 0.5);
					entity.getPersistentData().putBoolean("gronckleinlove", true);
				} else if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Blocks.ANDESITE.asItem()) {
					if (sourceentity instanceof LivingEntity _entity) {
						ItemStack _setstack = new ItemStack(Blocks.ANDESITE);
						_setstack.setCount((int) ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getCount() - 1));
						_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
						if (_entity instanceof Player _player)
							_player.getInventory().setChanged();
					}
					if (world instanceof ServerLevel _level)
						_level.sendParticles(ParticleTypes.HEART, x, y, z, 30, 3, 3, 3, 0.5);
					entity.getPersistentData().putBoolean("gronckleinlove", true);
				}
			}
		}
	}
}
