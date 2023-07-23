package net.mcreator.howtoownadragon.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.core.BlockPos;

import net.mcreator.howtoownadragon.init.HowToOwnADragonModMobEffects;
import net.mcreator.howtoownadragon.init.HowToOwnADragonModBlocks;
import net.mcreator.howtoownadragon.entity.MeatlugEntity;
import net.mcreator.howtoownadragon.HowToOwnADragonMod;

import javax.annotation.Nullable;

import java.util.Comparator;

@Mod.EventBusSubscriber
public class MeatlugAndMeatlugProcedure {
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
		HowToOwnADragonMod.queueServerWork(50, () -> {
			if (entity instanceof MeatlugEntity && (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Blocks.STONE.asItem()) {
				if (entity instanceof LivingEntity _livEnt3 && _livEnt3.hasEffect(HowToOwnADragonModMobEffects.IN_LOVE.get())
						&& ((Entity) world.getEntitiesOfClass(MeatlugEntity.class, AABB.ofSize(new Vec3(x, y, z), 10, 10, 10), e -> true).stream().sorted(new Object() {
							Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
								return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
							}
						}.compareDistOf(x, y, z)).findFirst().orElse(null)) instanceof LivingEntity _livEnt5 && _livEnt5.hasEffect(HowToOwnADragonModMobEffects.IN_LOVE.get())) {
					world.setBlock(BlockPos.containing(x, y, z), HowToOwnADragonModBlocks.MEATLUGS_EGG.get().defaultBlockState(), 3);
					if (((Entity) world.getEntitiesOfClass(MeatlugEntity.class, AABB.ofSize(new Vec3(x, y, z), 10, 10, 10), e -> true).stream().sorted(new Object() {
						Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
							return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
						}
					}.compareDistOf(x, y, z)).findFirst().orElse(null)) instanceof LivingEntity _entity)
						_entity.removeEffect(HowToOwnADragonModMobEffects.IN_LOVE.get());
					if (entity instanceof LivingEntity _entity)
						_entity.removeEffect(HowToOwnADragonModMobEffects.IN_LOVE.get());
				}
			}
		});
	}
}
