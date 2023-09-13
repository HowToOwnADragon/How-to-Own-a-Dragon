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
import net.minecraft.tags.TagKey;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;
import net.minecraft.core.particles.ParticleTypes;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class FeedNonGrownTTProcedure {
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
		if (entity.getPersistentData().getBoolean("ttfeedcooldown") == false) {
			if (entity instanceof TamableAnimal _tamIsTamedBy && sourceentity instanceof LivingEntity _livEnt ? _tamIsTamedBy.isOwnedBy(_livEnt) : false) {
				if (entity.getType().is(TagKey.create(Registries.ENTITY_TYPE, new ResourceLocation("how_to_own_a_dragon:tt_not_grown")))) {
					if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Items.BREAD) {
						if (sourceentity instanceof Player _player) {
							ItemStack _stktoremove = new ItemStack(Items.BREAD);
							_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
						}
						if (world instanceof ServerLevel _level)
							_level.sendParticles(ParticleTypes.HEART, x, y, z, 30, 3, 3, 3, 0.5);
					} else if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Items.COD) {
						if (sourceentity instanceof Player _player) {
							ItemStack _stktoremove = new ItemStack(Items.COD);
							_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
						}
						if (world instanceof ServerLevel _level)
							_level.sendParticles(ParticleTypes.HEART, x, y, z, 30, 3, 3, 3, 0.5);
					} else if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Items.SALMON) {
						if (sourceentity instanceof Player _player) {
							ItemStack _stktoremove = new ItemStack(Items.SALMON);
							_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
						}
						if (world instanceof ServerLevel _level)
							_level.sendParticles(ParticleTypes.HEART, x, y, z, 30, 3, 3, 3, 0.5);
					} else if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Items.COOKED_CHICKEN) {
						if (sourceentity instanceof Player _player) {
							ItemStack _stktoremove = new ItemStack(Items.COOKED_CHICKEN);
							_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
						}
						if (world instanceof ServerLevel _level)
							_level.sendParticles(ParticleTypes.HEART, x, y, z, 30, 3, 3, 3, 0.5);
					}
				}
			}
		}
	}
}
