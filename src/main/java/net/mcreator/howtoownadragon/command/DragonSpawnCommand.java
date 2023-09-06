
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

import net.mcreator.howtoownadragon.procedures.PinkFemaleGronckleSpawnDragonCommandProcedure;
import net.mcreator.howtoownadragon.procedures.OrangeRedFemaleGronckleSpawnDragonCommandProcedure;
import net.mcreator.howtoownadragon.procedures.MeatlugFemaleGronckleSpawnDragonCommandProcedure;
import net.mcreator.howtoownadragon.procedures.JuvenilePinkFemaleGronckleSpawnDragonCommandProcedure;
import net.mcreator.howtoownadragon.procedures.JuvenileMeatlugMaleGronckleSpawnDragonCommandProcedure;
import net.mcreator.howtoownadragon.procedures.JuvenileMeatlugFemaleGronckleSpawnDragonCommandProcedure;
import net.mcreator.howtoownadragon.procedures.JuvenileGroncklePinkMaleGronckleSpawnDragonCommandProcedure;
import net.mcreator.howtoownadragon.procedures.JuvenileGronckleOrangeRedMaleGronckleSpawnDragonCommandProcedure;
import net.mcreator.howtoownadragon.procedures.JuvenileGronckleBlueYellowMaleGronckleSpawnDragonCommandProcedure;
import net.mcreator.howtoownadragon.procedures.JuvenileBlueYellowFemaleGronckleSpawnDragonCommandProcedure;
import net.mcreator.howtoownadragon.procedures.GroncklePinkMaleGronckleSpawnDragonCommandProcedure;
import net.mcreator.howtoownadragon.procedures.GronckleOrangeRedMaleGronckleSpawnDragonCommandProcedure;
import net.mcreator.howtoownadragon.procedures.GronckleMeatlugMaleGronckleSpawnDragonCommandProcedure;
import net.mcreator.howtoownadragon.procedures.GronckleBlueYellowMaleGronckleSpawnDragonCommandProcedure;
import net.mcreator.howtoownadragon.procedures.BlueYellowFemaleGronckleSpawnDragonCommandProcedure;
import net.mcreator.howtoownadragon.procedures.BabyPinkMaleGronckleSpawnDragonCommandProcedure;
import net.mcreator.howtoownadragon.procedures.BabyPinkFemaleGronckleSpawnDragonCommandProcedure;
import net.mcreator.howtoownadragon.procedures.BabyOrangeRedMaleGronckleSpawnDragonCommandProcedure;
import net.mcreator.howtoownadragon.procedures.BabyOrangeRedFemaleGronckleSpawnDragonCommandProcedure;
import net.mcreator.howtoownadragon.procedures.BabyMeatlugMaleGronckleSpawnDragonCommandProcedure;
import net.mcreator.howtoownadragon.procedures.BabyMeatlugFemaleGronckleSpawnDragonCommandProcedure;
import net.mcreator.howtoownadragon.procedures.BabyBlueYellowMaleGronckleSpawnDragonCommandProcedure;
import net.mcreator.howtoownadragon.procedures.BabyBlueYellowFemaleGronckleSpawnDragonCommandProcedure;
import net.mcreator.howtoownadragon.procedures.AdolescentPinkMaleGronckleSpawnDragonCommandProcedure;
import net.mcreator.howtoownadragon.procedures.AdolescentPinkFemaleGronckleSpawnDragonCommandProcedure;
import net.mcreator.howtoownadragon.procedures.AdolescentOrangeRedMaleGronckleSpawnDragonCommandProcedure;
import net.mcreator.howtoownadragon.procedures.AdolescentOrangeRedFemaleGronckleSpawnDragonCommandProcedure;
import net.mcreator.howtoownadragon.procedures.AdolescentMeatlugMaleGronckleSpawnDragonCommandProcedure;
import net.mcreator.howtoownadragon.procedures.AdolescentMeatlugFemaleGronckleSpawnDragonCommandProcedure;
import net.mcreator.howtoownadragon.procedures.AdolescentBlueYellowMaleGronckleSpawnDragonCommandProcedure;
import net.mcreator.howtoownadragon.procedures.AdolescentBlueYellowFemaleGronckleSpawnDragonCommandProcedure;

@Mod.EventBusSubscriber
public class DragonSpawnCommand {
	@SubscribeEvent
	public static void registerCommand(RegisterCommandsEvent event) {
		event.getDispatcher()
				.register(Commands.literal("spawndragon").requires(s -> s.hasPermission(4)).then(Commands.literal("gronckle").then(Commands.literal("male").then(Commands.literal("baby").then(Commands.literal("pink").executes(arguments -> {
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
				}))).then(Commands.literal("juvenile").then(Commands.literal("pink").executes(arguments -> {
					ServerLevel world = arguments.getSource().getLevel();
					double x = arguments.getSource().getPosition().x();
					double y = arguments.getSource().getPosition().y();
					double z = arguments.getSource().getPosition().z();
					Entity entity = arguments.getSource().getEntity();
					if (entity == null)
						entity = FakePlayerFactory.getMinecraft(world);
					Direction direction = entity.getDirection();

					JuvenileGroncklePinkMaleGronckleSpawnDragonCommandProcedure.execute(world, x, y, z);
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

					JuvenileMeatlugMaleGronckleSpawnDragonCommandProcedure.execute(world, x, y, z);
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

					JuvenileGronckleOrangeRedMaleGronckleSpawnDragonCommandProcedure.execute(world, x, y, z);
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

					JuvenileGronckleBlueYellowMaleGronckleSpawnDragonCommandProcedure.execute(world, x, y, z);
					return 0;
				}))).then(Commands.literal("adolescent").then(Commands.literal("meatlug").executes(arguments -> {
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
				}))).then(Commands.literal("grown").then(Commands.literal("meatlug").executes(arguments -> {
					ServerLevel world = arguments.getSource().getLevel();
					double x = arguments.getSource().getPosition().x();
					double y = arguments.getSource().getPosition().y();
					double z = arguments.getSource().getPosition().z();
					Entity entity = arguments.getSource().getEntity();
					if (entity == null)
						entity = FakePlayerFactory.getMinecraft(world);
					Direction direction = entity.getDirection();

					GronckleMeatlugMaleGronckleSpawnDragonCommandProcedure.execute(world, x, y, z);
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

					GroncklePinkMaleGronckleSpawnDragonCommandProcedure.execute(world, x, y, z);
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

					GronckleOrangeRedMaleGronckleSpawnDragonCommandProcedure.execute(world, x, y, z);
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

					GronckleBlueYellowMaleGronckleSpawnDragonCommandProcedure.execute(world, x, y, z);
					return 0;
				})))).then(Commands.literal("female").then(Commands.literal("baby").then(Commands.literal("pink").executes(arguments -> {
					ServerLevel world = arguments.getSource().getLevel();
					double x = arguments.getSource().getPosition().x();
					double y = arguments.getSource().getPosition().y();
					double z = arguments.getSource().getPosition().z();
					Entity entity = arguments.getSource().getEntity();
					if (entity == null)
						entity = FakePlayerFactory.getMinecraft(world);
					Direction direction = entity.getDirection();

					BabyPinkFemaleGronckleSpawnDragonCommandProcedure.execute(world, x, y, z);
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

					BabyMeatlugFemaleGronckleSpawnDragonCommandProcedure.execute(world, x, y, z);
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

					BabyOrangeRedFemaleGronckleSpawnDragonCommandProcedure.execute(world, x, y, z);
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

					BabyBlueYellowFemaleGronckleSpawnDragonCommandProcedure.execute(world, x, y, z);
					return 0;
				}))).then(Commands.literal("juvenile").then(Commands.literal("pink").executes(arguments -> {
					ServerLevel world = arguments.getSource().getLevel();
					double x = arguments.getSource().getPosition().x();
					double y = arguments.getSource().getPosition().y();
					double z = arguments.getSource().getPosition().z();
					Entity entity = arguments.getSource().getEntity();
					if (entity == null)
						entity = FakePlayerFactory.getMinecraft(world);
					Direction direction = entity.getDirection();

					JuvenilePinkFemaleGronckleSpawnDragonCommandProcedure.execute(world, x, y, z);
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

					JuvenileMeatlugFemaleGronckleSpawnDragonCommandProcedure.execute(world, x, y, z);
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

					JuvenileBlueYellowFemaleGronckleSpawnDragonCommandProcedure.execute(world, x, y, z);
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

					JuvenileBlueYellowFemaleGronckleSpawnDragonCommandProcedure.execute(world, x, y, z);
					return 0;
				}))).then(Commands.literal("adolescent").then(Commands.literal("meatlug").executes(arguments -> {
					ServerLevel world = arguments.getSource().getLevel();
					double x = arguments.getSource().getPosition().x();
					double y = arguments.getSource().getPosition().y();
					double z = arguments.getSource().getPosition().z();
					Entity entity = arguments.getSource().getEntity();
					if (entity == null)
						entity = FakePlayerFactory.getMinecraft(world);
					Direction direction = entity.getDirection();

					AdolescentMeatlugFemaleGronckleSpawnDragonCommandProcedure.execute(world, x, y, z);
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

					AdolescentPinkFemaleGronckleSpawnDragonCommandProcedure.execute(world, x, y, z);
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

					AdolescentOrangeRedFemaleGronckleSpawnDragonCommandProcedure.execute(world, x, y, z);
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

					AdolescentBlueYellowFemaleGronckleSpawnDragonCommandProcedure.execute(world, x, y, z);
					return 0;
				}))).then(Commands.literal("grown").then(Commands.literal("meatlug").executes(arguments -> {
					ServerLevel world = arguments.getSource().getLevel();
					double x = arguments.getSource().getPosition().x();
					double y = arguments.getSource().getPosition().y();
					double z = arguments.getSource().getPosition().z();
					Entity entity = arguments.getSource().getEntity();
					if (entity == null)
						entity = FakePlayerFactory.getMinecraft(world);
					Direction direction = entity.getDirection();

					MeatlugFemaleGronckleSpawnDragonCommandProcedure.execute(world, x, y, z);
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

					PinkFemaleGronckleSpawnDragonCommandProcedure.execute(world, x, y, z);
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

					OrangeRedFemaleGronckleSpawnDragonCommandProcedure.execute(world, x, y, z);
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

					BlueYellowFemaleGronckleSpawnDragonCommandProcedure.execute(world, x, y, z);
					return 0;
				}))))));
	}
}
