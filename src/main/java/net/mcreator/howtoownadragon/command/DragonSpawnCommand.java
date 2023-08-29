
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
import net.mcreator.howtoownadragon.procedures.BabyOrangeRedMaleGronckleSpawnDragonCommandProcedure;
import net.mcreator.howtoownadragon.procedures.BabyMeatlugMaleGronckleSpawnDragonCommandProcedure;
import net.mcreator.howtoownadragon.procedures.BabyBlueYellowMaleGronckleSpawnDragonCommandProcedure;
import net.mcreator.howtoownadragon.procedures.AdolescentPinkMaleGronckleSpawnDragonCommandProcedure;
import net.mcreator.howtoownadragon.procedures.AdolescentOrangeRedMaleGronckleSpawnDragonCommandProcedure;
import net.mcreator.howtoownadragon.procedures.AdolescentMeatlugMaleGronckleSpawnDragonCommandProcedure;
import net.mcreator.howtoownadragon.procedures.AdolescentBlueYellowMaleGronckleSpawnDragonCommandProcedure;

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
				})).then(Commands.literal("meatlug").executes(arguments -> {
					ServerLevel world = arguments.getSource().getLevel();
					double x = arguments.getSource().getPosition().x();
					double y = arguments.getSource().getPosition().y();
					double z = arguments.getSource().getPosition().z();
					Entity entity = arguments.getSource().getEntity();
					if (entity == null)
						entity = FakePlayerFactory.getMinecraft(world);
					Direction direction = entity.getDirection();

					BabyMeatlugMaleGronckleSpawnDragonCommandProcedure.execute(world, x, y, z);
					return 0;
				})).then(Commands.literal("orangered").executes(arguments -> {
					ServerLevel world = arguments.getSource().getLevel();
					double x = arguments.getSource().getPosition().x();
					double y = arguments.getSource().getPosition().y();
					double z = arguments.getSource().getPosition().z();
					Entity entity = arguments.getSource().getEntity();
					if (entity == null)
						entity = FakePlayerFactory.getMinecraft(world);
					Direction direction = entity.getDirection();

					BabyOrangeRedMaleGronckleSpawnDragonCommandProcedure.execute(world, x, y, z);
					return 0;
				})).then(Commands.literal("blueyellow").executes(arguments -> {
					ServerLevel world = arguments.getSource().getLevel();
					double x = arguments.getSource().getPosition().x();
					double y = arguments.getSource().getPosition().y();
					double z = arguments.getSource().getPosition().z();
					Entity entity = arguments.getSource().getEntity();
					if (entity == null)
						entity = FakePlayerFactory.getMinecraft(world);
					Direction direction = entity.getDirection();

					BabyBlueYellowMaleGronckleSpawnDragonCommandProcedure.execute(world, x, y, z);
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
				})).then(Commands.literal("pink").executes(arguments -> {
					ServerLevel world = arguments.getSource().getLevel();
					double x = arguments.getSource().getPosition().x();
					double y = arguments.getSource().getPosition().y();
					double z = arguments.getSource().getPosition().z();
					Entity entity = arguments.getSource().getEntity();
					if (entity == null)
						entity = FakePlayerFactory.getMinecraft(world);
					Direction direction = entity.getDirection();

					AdolescentPinkMaleGronckleSpawnDragonCommandProcedure.execute(world, x, y, z);
					return 0;
				})).then(Commands.literal("orangered").executes(arguments -> {
					ServerLevel world = arguments.getSource().getLevel();
					double x = arguments.getSource().getPosition().x();
					double y = arguments.getSource().getPosition().y();
					double z = arguments.getSource().getPosition().z();
					Entity entity = arguments.getSource().getEntity();
					if (entity == null)
						entity = FakePlayerFactory.getMinecraft(world);
					Direction direction = entity.getDirection();

					AdolescentOrangeRedMaleGronckleSpawnDragonCommandProcedure.execute(world, x, y, z);
					return 0;
				})).then(Commands.literal("blueyellow").executes(arguments -> {
					ServerLevel world = arguments.getSource().getLevel();
					double x = arguments.getSource().getPosition().x();
					double y = arguments.getSource().getPosition().y();
					double z = arguments.getSource().getPosition().z();
					Entity entity = arguments.getSource().getEntity();
					if (entity == null)
						entity = FakePlayerFactory.getMinecraft(world);
					Direction direction = entity.getDirection();

					AdolescentBlueYellowMaleGronckleSpawnDragonCommandProcedure.execute(world, x, y, z);
					return 0;
				}))))));
	}
}
