package net.mcreator.howtoownadragon.procedures;

import net.minecraftforge.common.ForgeMod;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.network.chat.Component;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

import net.mcreator.howtoownadragon.init.HowToOwnADragonModAttributes;
import net.mcreator.howtoownadragon.entity.GronckleMaleEntity;
import net.mcreator.howtoownadragon.entity.GronckleFemaleEntity;

public class GronckleStatsOnSpawnProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (!(entity.getPersistentData().getBoolean("GronckleSetAttribute") == true)) {
			if (entity instanceof GronckleMaleEntity && entity instanceof GronckleFemaleEntity) {
				((LivingEntity) entity).getAttribute(net.minecraft.world.entity.ai.attributes.Attributes.MAX_HEALTH).setBaseValue(20);
				((LivingEntity) entity).getAttribute(net.minecraft.world.entity.ai.attributes.Attributes.ARMOR).setBaseValue(40);
				((LivingEntity) entity).getAttribute(net.minecraft.world.entity.ai.attributes.Attributes.MOVEMENT_SPEED).setBaseValue(4);
				((LivingEntity) entity).getAttribute(net.minecraft.world.entity.ai.attributes.Attributes.FLYING_SPEED).setBaseValue(4);
				((LivingEntity) entity).getAttribute(ForgeMod.SWIM_SPEED.get()).setBaseValue(2);
				((LivingEntity) entity).getAttribute(HowToOwnADragonModAttributes.GRONCKLEDAMAGE.get()).setBaseValue(5);
				((LivingEntity) entity).getAttribute(HowToOwnADragonModAttributes.GRONCKLEIRONCOOLDOWN.get()).setBaseValue(600);
				if (world instanceof ServerLevel _level)
					_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
							"say it works");
				entity.getPersistentData().putBoolean("GronckleSetAttribute", true);
			}
		}
	}
}
