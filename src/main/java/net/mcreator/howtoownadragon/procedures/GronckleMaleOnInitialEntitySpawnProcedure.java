package net.mcreator.howtoownadragon.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.network.chat.Component;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

import net.mcreator.howtoownadragon.entity.GronckleMaleEntity;
import net.mcreator.howtoownadragon.HowToOwnADragonMod;

public class GronckleMaleOnInitialEntitySpawnProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		HowToOwnADragonMod.queueServerWork(1, () -> {
			if (world instanceof ServerLevel _level)
				_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(), "say test2");
			NBTDataSpawnGronckleProcedure.execute(entity);
			if ((entity.getPersistentData().getString("groncklecolor")).equals("pink")) {
				if (entity instanceof GronckleMaleEntity animatable)
					animatable.setTexture("groncklepink");
			} else if ((entity.getPersistentData().getString("groncklecolor")).equals("orangered")) {
				if (entity instanceof GronckleMaleEntity animatable)
					animatable.setTexture("gronckleorangered");
			} else if ((entity.getPersistentData().getString("groncklecolor")).equals("blueyellow")) {
				if (entity instanceof GronckleMaleEntity animatable)
					animatable.setTexture("gronckleblueyellow");
			} else if ((entity.getPersistentData().getString("groncklecolor")).equals("meatlug")) {
				if (entity instanceof GronckleMaleEntity animatable)
					animatable.setTexture("meatlug");
			} else {
				RandomColorMaleGronckleProcedure.execute(world, x, y, z, entity);
			}
		});
	}
}
