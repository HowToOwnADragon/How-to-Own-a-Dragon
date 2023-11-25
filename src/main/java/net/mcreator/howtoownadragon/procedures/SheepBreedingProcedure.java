package net.mcreator.howtoownadragon.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.InteractionHand;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.network.chat.Component;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

import net.mcreator.howtoownadragon.init.HowToOwnADragonModMobEffects;
import net.mcreator.howtoownadragon.entity.SheepEntity;
import net.mcreator.howtoownadragon.HowToOwnADragonMod;

import javax.annotation.Nullable;

import java.util.stream.Collectors;
import java.util.List;
import java.util.Comparator;

@Mod.EventBusSubscriber
public class SheepBreedingProcedure {
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
		{
			final Vec3 _center = new Vec3(x, y, z);
			List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(4 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).collect(Collectors.toList());
			for (Entity entityiterator : _entfound) {
				if (!(entityiterator == entity) && entityiterator instanceof SheepEntity && entity instanceof SheepEntity) {
					if (entityiterator.getPersistentData().getBoolean("sheepinlove") == true && !(entity instanceof LivingEntity _livEnt4 && _livEnt4.hasEffect(HowToOwnADragonModMobEffects.BREEDING_COOLDOWN.get()))
							&& !(entityiterator instanceof LivingEntity _livEnt5 && _livEnt5.hasEffect(HowToOwnADragonModMobEffects.BREEDING_COOLDOWN.get()))) {
						entityiterator.getPersistentData().putBoolean("sheepinlove", false);
						if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Items.WHEAT) {
							if (sourceentity instanceof LivingEntity _entity) {
								ItemStack _setstack = new ItemStack(Items.WHEAT);
								_setstack.setCount((int) ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getCount() - 1));
								_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
								if (_entity instanceof Player _player)
									_player.getInventory().setChanged();
							}
							if (entity instanceof LivingEntity _entity && !_entity.level.isClientSide())
								_entity.addEffect(new MobEffectInstance(HowToOwnADragonModMobEffects.BREEDING_COOLDOWN.get(), 600, 1, false, false));
							if (entityiterator instanceof LivingEntity _entity && !_entity.level.isClientSide())
								_entity.addEffect(new MobEffectInstance(HowToOwnADragonModMobEffects.BREEDING_COOLDOWN.get(), 600, 1, false, false));
							if (world instanceof ServerLevel _level)
								_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
										"/execute at @e[type=how_to_own_a_dragon:sheep, sort= nearest, limit= 1] run summon how_to_own_a_dragon:baby_sheep ~ ~ ~");
							if ((entity.getPersistentData().getString("sheepcolor")).equals("black") && (entityiterator.getPersistentData().getString("sheepcolor")).equals("black")) {
								HowToOwnADragonMod.queueServerWork(1, () -> {
									entity.getPersistentData().putString("sheepcolor", "black");
								});
							} else {
								HowToOwnADragonMod.queueServerWork(1, () -> {
									entity.getPersistentData().putString("sheepcolor", "white");
								});
							}
						}
					}
				}
			}
		}
	}
}
