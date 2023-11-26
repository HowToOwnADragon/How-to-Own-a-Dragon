package net.mcreator.howtoownadragon.procedures;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.TamableAnimal;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.network.chat.Component;

public class GrowUpMessageGronckleProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (Mth.nextInt(RandomSource.create(), 1, 10) == 1) {
			if ((entity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null) instanceof Player _player && !_player.level.isClientSide())
				_player.displayClientMessage(Component.literal(("Your " + entity.getDisplayName().getString() + " is ready to grow up! It requires some sustenance. It needs some Stone!")), false);
			entity.getPersistentData().putString("groncklegrowup", "stone");
		} else if (Mth.nextInt(RandomSource.create(), 1, 10) == 2) {
			if ((entity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null) instanceof Player _player && !_player.level.isClientSide())
				_player.displayClientMessage(Component.literal(("Your " + entity.getDisplayName().getString() + " is ready to grow up! It requires some sustenance. It needs some Cobblestone!")), false);
			entity.getPersistentData().putString("groncklegrowup", "cobblestone");
		} else if (Mth.nextInt(RandomSource.create(), 1, 10) == 3) {
			if ((entity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null) instanceof Player _player && !_player.level.isClientSide())
				_player.displayClientMessage(Component.literal(("Your " + entity.getDisplayName().getString() + " is ready to grow up! It requires some sustenance. It needs some Deepslate!")), false);
			entity.getPersistentData().putString("groncklegrowup", "deepslate");
		} else if (Mth.nextInt(RandomSource.create(), 1, 10) == 4) {
			if ((entity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null) instanceof Player _player && !_player.level.isClientSide())
				_player.displayClientMessage(Component.literal(("Your " + entity.getDisplayName().getString() + " is ready to grow up! It requires some sustenance. It needs some Cobbled Deepslate!")), false);
			entity.getPersistentData().putString("groncklegrowup", "cobbleddeepslate");
		} else if (Mth.nextInt(RandomSource.create(), 1, 10) == 5) {
			if ((entity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null) instanceof Player _player && !_player.level.isClientSide())
				_player.displayClientMessage(Component.literal(("Your " + entity.getDisplayName().getString() + " is ready to grow up! It requires some sustenance. It needs some Andesite!")), false);
			entity.getPersistentData().putString("groncklegrowup", "andesite");
		} else if (Mth.nextInt(RandomSource.create(), 1, 10) == 6) {
			if ((entity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null) instanceof Player _player && !_player.level.isClientSide())
				_player.displayClientMessage(Component.literal(("Your " + entity.getDisplayName().getString() + " is ready to grow up! It requires some sustenance. It needs some Diorite!")), false);
			entity.getPersistentData().putString("groncklegrowup", "diorite");
		} else if (Mth.nextInt(RandomSource.create(), 1, 10) == 7) {
			if ((entity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null) instanceof Player _player && !_player.level.isClientSide())
				_player.displayClientMessage(Component.literal(("Your " + entity.getDisplayName().getString() + " is ready to grow up! It requires some sustenance. It needs some Granite!")), false);
			entity.getPersistentData().putString("groncklegrowup", "granite");
		} else if (Mth.nextInt(RandomSource.create(), 1, 10) == 8) {
			if ((entity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null) instanceof Player _player && !_player.level.isClientSide())
				_player.displayClientMessage(Component.literal(("Your " + entity.getDisplayName().getString() + " is ready to grow up! It requires some sustenance. It needs some Lava!")), false);
			entity.getPersistentData().putString("groncklegrowup", "lava");
		} else if (Mth.nextInt(RandomSource.create(), 1, 10) == 9) {
			if ((entity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null) instanceof Player _player && !_player.level.isClientSide())
				_player.displayClientMessage(Component.literal(("Your " + entity.getDisplayName().getString() + " is ready to grow up! It requires some sustenance. It needs some Iron!")), false);
			entity.getPersistentData().putString("groncklegrowup", "iron");
		} else if (Mth.nextInt(RandomSource.create(), 1, 10) == 10) {
			if ((entity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null) instanceof Player _player && !_player.level.isClientSide())
				_player.displayClientMessage(Component.literal(("Your " + entity.getDisplayName().getString() + " is ready to grow up! It requires some sustenance. It needs some Sandstone!")), false);
			entity.getPersistentData().putString("groncklegrowup", "sandstone");
		} else {
			GrowUpMessageGronckleProcedure.execute(entity);
		}
	}
}
