package net.mcreator.howtoownadragon.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.network.chat.Component;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

public class WoolDropSheepKillProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (entity.getPersistentData().getBoolean("sheared") == false) {
			if ((entity.getPersistentData().getString("sheepcolor")).equals("white")) {
				if (world instanceof ServerLevel _level)
					_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
							"/loot spawn ~ ~ ~ loot how_to_own_a_dragon:white_wool_drop");
			} else if ((entity.getPersistentData().getString("sheepcolor")).equals("black")) {
				if (world instanceof ServerLevel _level)
					_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
							"/loot spawn ~ ~ ~ loot how_to_own_a_dragon:black_wool_drop");
			} else if ((entity.getPersistentData().getString("sheepcolor")).equals("grey")) {
				if (world instanceof ServerLevel _level)
					_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
							"/loot spawn ~ ~ ~ loot how_to_own_a_dragon:grey_wool_drop");
			} else if ((entity.getPersistentData().getString("sheepcolor")).equals("lightgrey")) {
				if (world instanceof ServerLevel _level)
					_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
							"/loot spawn ~ ~ ~ loot how_to_own_a_dragon:light_grey_wool_drop");
			} else if ((entity.getPersistentData().getString("sheepcolor")).equals("brown")) {
				if (world instanceof ServerLevel _level)
					_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
							"/loot spawn ~ ~ ~ loot how_to_own_a_dragon:brown_wool_drop");
			} else if ((entity.getPersistentData().getString("sheepcolor")).equals("red")) {
				if (world instanceof ServerLevel _level)
					_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
							"/loot spawn ~ ~ ~ loot how_to_own_a_dragon:red_wool_drop");
			} else if ((entity.getPersistentData().getString("sheepcolor")).equals("orange")) {
				if (world instanceof ServerLevel _level)
					_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
							"/loot spawn ~ ~ ~ loot how_to_own_a_dragon:orange_wool_drop");
			} else if ((entity.getPersistentData().getString("sheepcolor")).equals("yellow")) {
				if (world instanceof ServerLevel _level)
					_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
							"/loot spawn ~ ~ ~ loot how_to_own_a_dragon:yellow_wool_drop");
			} else if ((entity.getPersistentData().getString("sheepcolor")).equals("green")) {
				if (world instanceof ServerLevel _level)
					_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
							"/loot spawn ~ ~ ~ loot how_to_own_a_dragon:green_wool_drop");
			} else if ((entity.getPersistentData().getString("sheepcolor")).equals("lime")) {
				if (world instanceof ServerLevel _level)
					_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
							"/loot spawn ~ ~ ~ loot how_to_own_a_dragon:lime_wool_drop");
			} else if ((entity.getPersistentData().getString("sheepcolor")).equals("cyan")) {
				if (world instanceof ServerLevel _level)
					_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
							"/loot spawn ~ ~ ~ loot how_to_own_a_dragon:cyan_wool_drop");
			} else if ((entity.getPersistentData().getString("sheepcolor")).equals("blue")) {
				if (world instanceof ServerLevel _level)
					_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
							"/loot spawn ~ ~ ~ loot how_to_own_a_dragon:blue_wool_drop");
			} else if ((entity.getPersistentData().getString("sheepcolor")).equals("lightblue")) {
				if (world instanceof ServerLevel _level)
					_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
							"/loot spawn ~ ~ ~ loot how_to_own_a_dragon:light_blue_wool_drop");
			} else if ((entity.getPersistentData().getString("sheepcolor")).equals("purple")) {
				if (world instanceof ServerLevel _level)
					_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
							"/loot spawn ~ ~ ~ loot how_to_own_a_dragon:purple_wool_drop");
			} else if ((entity.getPersistentData().getString("sheepcolor")).equals("magenta")) {
				if (world instanceof ServerLevel _level)
					_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
							"/loot spawn ~ ~ ~ loot how_to_own_a_dragon:magenta_wool_drop");
			} else if ((entity.getPersistentData().getString("sheepcolor")).equals("pink")) {
				if (world instanceof ServerLevel _level)
					_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
							"/loot spawn ~ ~ ~ loot how_to_own_a_dragon:pink_wool_drop");
			}
		}
	}
}
