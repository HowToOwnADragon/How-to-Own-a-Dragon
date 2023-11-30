package net.mcreator.howtoownadragon.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.network.chat.Component;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

import net.mcreator.howtoownadragon.entity.SheepEntity;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class ShearingSheepProcedure {
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
		if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Items.SHEARS && entity instanceof SheepEntity && entity.getPersistentData().getBoolean("sheared") == false) {
			entity.getPersistentData().putBoolean("sheared", true);
			if (entity instanceof SheepEntity animatable)
				animatable.setTexture("sheepsheared");
			GrowWoolProcedure.execute(world, entity);
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
