package net.mcreator.howtoownadragon.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class ItemCheckForGrowUpGronckleProcedure {
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
		if ((entity.getPersistentData().getString("groncklegrowup")).equals("stone") && (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Blocks.STONE.asItem()) {
			GrowUpGronckleProcedure.execute(world, x, y, z, entity);
		} else if ((entity.getPersistentData().getString("groncklegrowup")).equals("cobblestone") && (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Blocks.COBBLESTONE.asItem()) {
			GrowUpGronckleProcedure.execute(world, x, y, z, entity);
		} else if ((entity.getPersistentData().getString("groncklegrowup")).equals("deepslate") && (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Blocks.DEEPSLATE.asItem()) {
			GrowUpGronckleProcedure.execute(world, x, y, z, entity);
		} else if ((entity.getPersistentData().getString("groncklegrowup")).equals("cobbleddeepslate") && (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Blocks.COBBLED_DEEPSLATE.asItem()) {
			GrowUpGronckleProcedure.execute(world, x, y, z, entity);
		} else if ((entity.getPersistentData().getString("groncklegrowup")).equals("andesite") && (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Blocks.ANDESITE.asItem()) {
			GrowUpGronckleProcedure.execute(world, x, y, z, entity);
		} else if ((entity.getPersistentData().getString("groncklegrowup")).equals("diorite") && (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Blocks.DIORITE.asItem()) {
			GrowUpGronckleProcedure.execute(world, x, y, z, entity);
		} else if ((entity.getPersistentData().getString("groncklegrowup")).equals("granite") && (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Blocks.GRANITE.asItem()) {
			GrowUpGronckleProcedure.execute(world, x, y, z, entity);
		} else if ((entity.getPersistentData().getString("groncklegrowup")).equals("lava") && (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Items.LAVA_BUCKET) {
			GrowUpGronckleProcedure.execute(world, x, y, z, entity);
		} else if ((entity.getPersistentData().getString("groncklegrowup")).equals("iron") && (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Items.IRON_INGOT) {
			GrowUpGronckleProcedure.execute(world, x, y, z, entity);
		} else if ((entity.getPersistentData().getString("groncklegrowup")).equals("sandstone") && (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Blocks.SANDSTONE.asItem()) {
			GrowUpGronckleProcedure.execute(world, x, y, z, entity);
		}
	}
}
