package net.mcreator.howtoownadragon.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.network.chat.Component;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

import net.mcreator.howtoownadragon.entity.GronckleMaleEntity;

public class RandomColorMaleGronckleProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (world instanceof ServerLevel _level)
			_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(), "say test");
		if (Mth.nextInt(RandomSource.create(), 1, 3) == 1) {
			if (entity instanceof GronckleMaleEntity animatable)
				animatable.setTexture("groncklepink");
			entity.getPersistentData().putString("groncklecolor", "pink");
		} else if (Mth.nextInt(RandomSource.create(), 1, 3) == 2) {
			if (entity instanceof GronckleMaleEntity animatable)
				animatable.setTexture("gronckleorangered");
			entity.getPersistentData().putString("groncklecolor", "orangered");
		} else if (Mth.nextInt(RandomSource.create(), 1, 3) == 3) {
			if (entity instanceof GronckleMaleEntity animatable)
				animatable.setTexture("gronckleblueyellow");
			entity.getPersistentData().putString("groncklecolor", "blueyellow");
		} else {
			RandomColorMaleGronckleProcedure.execute(world, x, y, z, entity);
		}
	}
}
