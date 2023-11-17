package net.mcreator.howtoownadragon.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.network.chat.Component;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

public class SheepEntityDiesProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (entity.getPersistentData().getBoolean("sheared") == true) {
			if (world instanceof ServerLevel _level)
				_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
						"/loot spawn ~ ~ ~ loot how_to_own_a_dragon:sheared_sheep_dies");
		} else {
			if ((entity.getPersistentData().getString("sheepcolor")).equals("white")) {
				if (world instanceof ServerLevel _level)
					_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
							"/loot spawn ~ ~ ~ loot how_to_own_a_dragon:white_sheep_dies");
			} else if ((entity.getPersistentData().getString("sheepcolor")).equals("black")) {
				if (world instanceof ServerLevel _level)
					_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
							"/loot spawn ~ ~ ~ loot how_to_own_a_dragon:entities/black_sheep_dies");
			} else if ((entity.getPersistentData().getString("sheepcolor")).equals("grey")) {
				if (world instanceof ServerLevel _level)
					_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
							"/loot spawn ~ ~ ~ loot how_to_own_a_dragon:grey_sheep_dies");
			} else if ((entity.getPersistentData().getString("sheepcolor")).equals("lightgrey")) {
				if (world instanceof ServerLevel _level)
					_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
							"/loot spawn ~ ~ ~ loot how_to_own_a_dragon:light_grey_sheep_dies");
			} else if ((entity.getPersistentData().getString("sheepcolor")).equals("brown")) {
				if (world instanceof ServerLevel _level)
					_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
							"/loot spawn ~ ~ ~ loot how_to_own_a_dragon:brown_sheep_dies");
			} else if ((entity.getPersistentData().getString("sheepcolor")).equals("red")) {
				if (world instanceof ServerLevel _level)
					_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
							"/loot spawn ~ ~ ~ loot how_to_own_a_dragon:red_sheep_dies");
			} else if ((entity.getPersistentData().getString("sheepcolor")).equals("orange")) {
				if (world instanceof ServerLevel _level)
					_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
							"/loot spawn ~ ~ ~ loot how_to_own_a_dragon:orange_sheep_dies");
			} else if ((entity.getPersistentData().getString("sheepcolor")).equals("yellow")) {
				if (world instanceof ServerLevel _level)
					_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
							"/loot spawn ~ ~ ~ loot how_to_own_a_dragon:yellow_sheep_dies");
			} else if ((entity.getPersistentData().getString("sheepcolor")).equals("green")) {
				if (world instanceof ServerLevel _level)
					_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
							"/loot spawn ~ ~ ~ loot how_to_own_a_dragon:green_sheep_dies");
			} else if ((entity.getPersistentData().getString("sheepcolor")).equals("lime")) {
				if (world instanceof ServerLevel _level)
					_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
							"/loot spawn ~ ~ ~ loot how_to_own_a_dragon:lime_sheep_dies");
			} else if ((entity.getPersistentData().getString("sheepcolor")).equals("cyan")) {
				if (world instanceof ServerLevel _level)
					_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
							"/loot spawn ~ ~ ~ loot how_to_own_a_dragon:cyan_sheep_dies");
			} else if ((entity.getPersistentData().getString("sheepcolor")).equals("blue")) {
				if (world instanceof ServerLevel _level)
					_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
							"/loot spawn ~ ~ ~ loot how_to_own_a_dragon:blue_sheep_dies");
			} else if ((entity.getPersistentData().getString("sheepcolor")).equals("lightblue")) {
				if (world instanceof ServerLevel _level)
					_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
							"/loot spawn ~ ~ ~ loot how_to_own_a_dragon:light_blue_sheep_dies");
			} else if ((entity.getPersistentData().getString("sheepcolor")).equals("purple")) {
				if (world instanceof ServerLevel _level)
					_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
							"/loot spawn ~ ~ ~ loot how_to_own_a_dragon:purple_sheep_dies");
			} else if ((entity.getPersistentData().getString("sheepcolor")).equals("magenta")) {
				if (world instanceof ServerLevel _level)
					_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
							"/loot spawn ~ ~ ~ loot how_to_own_a_dragon:magenta_sheep_dies");
			} else if ((entity.getPersistentData().getString("sheepcolor")).equals("pink")) {
				if (world instanceof ServerLevel _level)
					_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
							"/loot spawn ~ ~ ~ loot how_to_own_a_dragon:pink_sheep_dies");
			}
		}
	}
}
