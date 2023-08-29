
package net.mcreator.howtoownadragon.command;

import org.checkerframework.checker.units.qual.s;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegisterCommandsEvent;
import net.minecraftforge.common.util.FakePlayerFactory;

import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.Direction;
import net.minecraft.commands.Commands;

import net.mcreator.howtoownadragon.procedures.BabyPinkMaleGronckleSpawnDragonCommandProcedure;
import net.mcreator.howtoownadragon.procedures.AdolescentMeatlugMaleGronckleSpawnDragonCommandProcedure;

@Mod.EventBusSubscriber
public class DragonSpawnCommand {
	@SubscribeEvent
	public static void registerCommand(RegisterCommandsEvent event) {
		event.getDispatcher()
				.register(Commands.literal("spawndragon").requires(s -> s.hasPermission(4)).then(Commands.literal("gronckle").then(Commands.literal("baby").then(Commands.literal("male").then(Commands.literal("pink").executes(arguments -> {
					ServerLevel world = arguments.getSource().getLevel();
					double x = arguments.getSource().getPosition().x();
					double y = arguments.getSource().getPosition().y();
					double z = arguments.getSource().getPosition().z();
					Entity entity = arguments.getSource().getEntity();
					if (entity == null)
						entity = FakePlayerFactory.getMinecraft(world);
					Direction direction = entity.getDirection();

					BabyPinkMaleGronckleSpawnDragonCommandProcedure.execute(world, x, y, z);
					return 0;
				})))).then(Commands.literal("adolescent").then(Commands.literal("male").then(Commands.literal("meatlug").executes(arguments -> {
					ServerLevel world = arguments.getSource().getLevel();
					double x = arguments.getSource().getPosition().x();
					double y = arguments.getSource().getPosition().y();
					double z = arguments.getSource().getPosition().z();
					Entity entity = arguments.getSource().getEntity();
					if (entity == null)
						entity = FakePlayerFactory.getMinecraft(world);
					Direction direction = entity.getDirection();

					AdolescentMeatlugMaleGronckleSpawnDragonCommandProcedure.execute(world, x, y, z);
					return 0;
				}))))));
	}
}
