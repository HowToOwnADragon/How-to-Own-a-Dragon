package net.mcreator.howtoownadragon.procedures;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.TamableAnimal;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.network.chat.Component;

public class GronckleGrowingUpMessageProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (Mth.nextInt(RandomSource.create(), 1, 10) == 1) {
			if ((entity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null) instanceof Player _player && !_player.level.isClientSide())
				_player.displayClientMessage(Component.literal(("Your " + entity.getDisplayName().getString() + " is ready to grow up! It requires some sustenance. It needs some Stone!")), false);
		} else if (Mth.nextInt(RandomSource.create(), 1, 10) == 2) {
			if ((entity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null) instanceof Player _player && !_player.level.isClientSide())
				_player.displayClientMessage(Component.literal(("Your " + entity.getDisplayName().getString() + " is ready to grow up! It requires some sustenance. It needs some Cobblestone!")), false);
		} else if (Mth.nextInt(RandomSource.create(), 1, 10) == 3) {
			if ((entity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null) instanceof Player _player && !_player.level.isClientSide())
				_player.displayClientMessage(Component.literal(("Your " + entity.getDisplayName().getString() + " is ready to grow up! It requires some sustenance. It needs some Deepslate!")), false);
		} else if (Mth.nextInt(RandomSource.create(), 1, 10) == 4) {
			if ((entity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null) instanceof Player _player && !_player.level.isClientSide())
				_player.displayClientMessage(Component.literal(("Your " + entity.getDisplayName().getString() + " is ready to grow up! It requires some sustenance. It needs some Cobbled Deepslate!")), false);
		} else if (Mth.nextInt(RandomSource.create(), 1, 10) == 5) {
			if ((entity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null) instanceof Player _player && !_player.level.isClientSide())
				_player.displayClientMessage(Component.literal(("Your " + entity.getDisplayName().getString() + " is ready to grow up! It requires some sustenance. It needs some Andesite!")), false);
		} else if (Mth.nextInt(RandomSource.create(), 1, 10) == 6) {
			if ((entity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null) instanceof Player _player && !_player.level.isClientSide())
				_player.displayClientMessage(Component.literal(("Your " + entity.getDisplayName().getString() + " is ready to grow up! It requires some sustenance. It needs some Diorite!")), false);
		} else if (Mth.nextInt(RandomSource.create(), 1, 10) == 7) {
			if ((entity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null) instanceof Player _player && !_player.level.isClientSide())
				_player.displayClientMessage(Component.literal(("Your " + entity.getDisplayName().getString() + " is ready to grow up! It requires some sustenance. It needs some Granite!")), false);
		} else if (Mth.nextInt(RandomSource.create(), 1, 10) == 8) {
			if ((entity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null) instanceof Player _player && !_player.level.isClientSide())
				_player.displayClientMessage(Component.literal(("Your " + entity.getDisplayName().getString() + " is ready to grow up! It requires some sustenance. It needs some Lava!")), false);
		} else if (Mth.nextInt(RandomSource.create(), 1, 10) == 9) {
			if ((entity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null) instanceof Player _player && !_player.level.isClientSide())
				_player.displayClientMessage(Component.literal(("Your " + entity.getDisplayName().getString() + " is ready to grow up! It requires some sustenance. It needs some Iron!")), false);
		} else if (Mth.nextInt(RandomSource.create(), 1, 10) == 10) {
			if ((entity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null) instanceof Player _player && !_player.level.isClientSide())
				_player.displayClientMessage(Component.literal(("Your " + entity.getDisplayName().getString() + " is ready to grow up! It requires some sustenance. It needs some Sandstone!")), false);
		}
	}
}
