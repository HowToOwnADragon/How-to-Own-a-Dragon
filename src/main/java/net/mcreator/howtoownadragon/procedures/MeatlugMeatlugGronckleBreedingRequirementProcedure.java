package net.mcreator.howtoownadragon.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.InteractionHand;

public class MeatlugMeatlugGronckleBreedingRequirementProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity sourceentity) {
		if (sourceentity == null)
			return;
		if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Blocks.STONE.asItem()) {
			if (sourceentity instanceof LivingEntity _entity) {
				ItemStack _setstack = new ItemStack(Blocks.STONE);
				_setstack.setCount((int) ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getCount() - 1));
				_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
				if (_entity instanceof Player _player)
					_player.getInventory().setChanged();
			}
			MeatlugAndMeatlugEggGronckleProcedure.execute(world, x, y, z);
		} else if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Blocks.SANDSTONE.asItem()) {
			if (sourceentity instanceof LivingEntity _entity) {
				ItemStack _setstack = new ItemStack(Blocks.SANDSTONE);
				_setstack.setCount((int) ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getCount() - 1));
				_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
				if (_entity instanceof Player _player)
					_player.getInventory().setChanged();
			}
			MeatlugAndMeatlugEggGronckleProcedure.execute(world, x, y, z);
		} else if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Blocks.COBBLESTONE.asItem()) {
			if (sourceentity instanceof LivingEntity _entity) {
				ItemStack _setstack = new ItemStack(Blocks.COBBLESTONE);
				_setstack.setCount((int) ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getCount() - 1));
				_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
				if (_entity instanceof Player _player)
					_player.getInventory().setChanged();
			}
			MeatlugAndMeatlugEggGronckleProcedure.execute(world, x, y, z);
		} else if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Blocks.DEEPSLATE.asItem()) {
			if (sourceentity instanceof LivingEntity _entity) {
				ItemStack _setstack = new ItemStack(Blocks.DEEPSLATE);
				_setstack.setCount((int) ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getCount() - 1));
				_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
				if (_entity instanceof Player _player)
					_player.getInventory().setChanged();
			}
			MeatlugAndMeatlugEggGronckleProcedure.execute(world, x, y, z);
		} else if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Blocks.COBBLED_DEEPSLATE.asItem()) {
			if (sourceentity instanceof LivingEntity _entity) {
				ItemStack _setstack = new ItemStack(Blocks.COBBLED_DEEPSLATE);
				_setstack.setCount((int) ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getCount() - 1));
				_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
				if (_entity instanceof Player _player)
					_player.getInventory().setChanged();
			}
			MeatlugAndMeatlugEggGronckleProcedure.execute(world, x, y, z);
		} else if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Blocks.DIORITE.asItem()) {
			if (sourceentity instanceof LivingEntity _entity) {
				ItemStack _setstack = new ItemStack(Blocks.DIORITE);
				_setstack.setCount((int) ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getCount() - 1));
				_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
				if (_entity instanceof Player _player)
					_player.getInventory().setChanged();
			}
			MeatlugAndMeatlugEggGronckleProcedure.execute(world, x, y, z);
		} else if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Blocks.GRANITE.asItem()) {
			if (sourceentity instanceof LivingEntity _entity) {
				ItemStack _setstack = new ItemStack(Blocks.GRANITE);
				_setstack.setCount((int) ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getCount() - 1));
				_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
				if (_entity instanceof Player _player)
					_player.getInventory().setChanged();
			}
			MeatlugAndMeatlugEggGronckleProcedure.execute(world, x, y, z);
		} else if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Blocks.ANDESITE.asItem()) {
			if (sourceentity instanceof LivingEntity _entity) {
				ItemStack _setstack = new ItemStack(Blocks.ANDESITE);
				_setstack.setCount((int) ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getCount() - 1));
				_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
				if (_entity instanceof Player _player)
					_player.getInventory().setChanged();
			}
			MeatlugAndMeatlugEggGronckleProcedure.execute(world, x, y, z);
		}
	}
}
