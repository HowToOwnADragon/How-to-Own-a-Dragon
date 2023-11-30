package net.mcreator.howtoownadragon.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

public class GrowUpMessageNadderProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (Mth.nextInt(RandomSource.create(), 1, 4) == 1) {
			if ((entity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null) instanceof Player _player && !_player.level.isClientSide())
				_player.displayClientMessage(Component.literal(("Your " + entity.getDisplayName().getString() + " is ready to grow up! It requires some sustenance. It needs some Raw Mutton!")), false);
			entity.getPersistentData().putString("naddergrowup", "mutton");
		} else if (Mth.nextInt(RandomSource.create(), 1, 4) == 2) {
			if ((entity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null) instanceof Player _player && !_player.level.isClientSide())
				_player.displayClientMessage(Component.literal(("Your " + entity.getDisplayName().getString() + " is ready to grow up! It requires some sustenance. It needs some Raw Cod!")), false);
			entity.getPersistentData().putString("naddergrowup", "cod");
		} else if (Mth.nextInt(RandomSource.create(), 1, 4) == 3) {
			if ((entity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null) instanceof Player _player && !_player.level.isClientSide())
				_player.displayClientMessage(Component.literal(("Your " + entity.getDisplayName().getString() + " is ready to grow up! It requires some sustenance. It needs some Raw Salmon!")), false);
			entity.getPersistentData().putString("naddergrowup", "salmon");
		} else if (Mth.nextInt(RandomSource.create(), 1, 4) == 4) {
			if ((entity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null) instanceof Player _player && !_player.level.isClientSide())
				_player.displayClientMessage(Component.literal(("Your " + entity.getDisplayName().getString() + " is ready to grow up! It requires some sustenance. It needs some Cooked Chicken!")), false);
			entity.getPersistentData().putString("naddergrowup", "chicken");
		} else {
			GrowUpMessageNadderProcedure.execute(entity);
		}
	}
}
