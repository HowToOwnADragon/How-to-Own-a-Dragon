
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

import net.mcreator.howtoownadragon.procedures.TurqMaleSpawnDragonCommandTTProcedure;
import net.mcreator.howtoownadragon.procedures.TurqFemaleSpawnDragonCommandTTProcedure;
import net.mcreator.howtoownadragon.procedures.StormflyMaleSpawnDragonCommandNadderProcedure;
import net.mcreator.howtoownadragon.procedures.StormflyFemaleSpawnDragonCommandNadderProcedure;
import net.mcreator.howtoownadragon.procedures.RedMaleSpawnDragonCommandNadderProcedure;
import net.mcreator.howtoownadragon.procedures.RedFemaleSpawnDragonCommandNadderProcedure;
import net.mcreator.howtoownadragon.procedures.PurpleMaleSpawnDragonCommandNadderProcedure;
import net.mcreator.howtoownadragon.procedures.PurpleFemaleSpawnDragonCommandNadderProcedure;
import net.mcreator.howtoownadragon.procedures.PinkMaleSpawnDragonCommandTTProcedure;
import net.mcreator.howtoownadragon.procedures.PinkFemaleSpawnDragonCommandTTProcedure;
import net.mcreator.howtoownadragon.procedures.PinkFemaleGronckleSpawnDragonCommandProcedure;
import net.mcreator.howtoownadragon.procedures.OrangeRedFemaleGronckleSpawnDragonCommandProcedure;
import net.mcreator.howtoownadragon.procedures.MeatlugFemaleGronckleSpawnDragonCommandProcedure;
import net.mcreator.howtoownadragon.procedures.JuviStormflyMaleSpawnDragonCommandNadderProcedure;
import net.mcreator.howtoownadragon.procedures.JuviStormflyFemaleSpawnDragonCommandNadderProcedure;
import net.mcreator.howtoownadragon.procedures.JuviRedMaleSpawnDragonCommandNadderProcedure;
import net.mcreator.howtoownadragon.procedures.JuviRedFemaleSpawnDragonCommandNadderProcedure;
import net.mcreator.howtoownadragon.procedures.JuviPurpleMaleSpawnDragonCommandNadderProcedure;
import net.mcreator.howtoownadragon.procedures.JuviPurpleFemaleSpawnDragonCommandNadderProcedure;
import net.mcreator.howtoownadragon.procedures.JuvenileTurqMaleSpawnDragonCommandTTProcedure;
import net.mcreator.howtoownadragon.procedures.JuvenileTurqFemaleSpawnDragonCommandTTProcedure;
import net.mcreator.howtoownadragon.procedures.JuvenilePinkMaleSpawnDragonCommandTTProcedure;
import net.mcreator.howtoownadragon.procedures.JuvenilePinkFemaleSpawnDragonCommandTTProcedure;
import net.mcreator.howtoownadragon.procedures.JuvenilePinkFemaleGronckleSpawnDragonCommandProcedure;
import net.mcreator.howtoownadragon.procedures.JuvenileMeatlugMaleGronckleSpawnDragonCommandProcedure;
import net.mcreator.howtoownadragon.procedures.JuvenileMeatlugFemaleGronckleSpawnDragonCommandProcedure;
import net.mcreator.howtoownadragon.procedures.JuvenileGroncklePinkMaleGronckleSpawnDragonCommandProcedure;
import net.mcreator.howtoownadragon.procedures.JuvenileGronckleOrangeRedMaleGronckleSpawnDragonCommandProcedure;
import net.mcreator.howtoownadragon.procedures.JuvenileGronckleBlueYellowMaleGronckleSpawnDragonCommandProcedure;
import net.mcreator.howtoownadragon.procedures.JuvenileGreenMaleSpawnDragonCommandTTProcedure;
import net.mcreator.howtoownadragon.procedures.JuvenileGreenFemaleSpawnDragonCommandTTProcedure;
import net.mcreator.howtoownadragon.procedures.JuvenileBlueYellowFemaleGronckleSpawnDragonCommandProcedure;
import net.mcreator.howtoownadragon.procedures.GroncklePinkMaleGronckleSpawnDragonCommandProcedure;
import net.mcreator.howtoownadragon.procedures.GronckleOrangeRedMaleGronckleSpawnDragonCommandProcedure;
import net.mcreator.howtoownadragon.procedures.GronckleMeatlugMaleGronckleSpawnDragonCommandProcedure;
import net.mcreator.howtoownadragon.procedures.GronckleBlueYellowMaleGronckleSpawnDragonCommandProcedure;
import net.mcreator.howtoownadragon.procedures.GreenMaleSpawnDragonCommandTTProcedure;
import net.mcreator.howtoownadragon.procedures.GreenFemaleSpawnDragonCommandTTProcedure;
import net.mcreator.howtoownadragon.procedures.BlueYellowFemaleGronckleSpawnDragonCommandProcedure;
import net.mcreator.howtoownadragon.procedures.BabyTurqMaleSpawnDragonCommandTTProcedure;
import net.mcreator.howtoownadragon.procedures.BabyTurqFemaleSpawnDragonCommandTTProcedure;
import net.mcreator.howtoownadragon.procedures.BabyStormflyMaleSpawnDragonCommandNadderProcedure;
import net.mcreator.howtoownadragon.procedures.BabyStormflyFemaleSpawnDragonCommandNadderProcedure;
import net.mcreator.howtoownadragon.procedures.BabyRedMaleSpawnDragonCommandNadderProcedure;
import net.mcreator.howtoownadragon.procedures.BabyRedFemaleSpawnDragonCommandNadderProcedure;
import net.mcreator.howtoownadragon.procedures.BabyPurpleMaleSpawnDragonCommandNadderProcedure;
import net.mcreator.howtoownadragon.procedures.BabyPurpleFemaleSpawnDragonCommandNadderProcedure;
import net.mcreator.howtoownadragon.procedures.BabyPinkMaleSpawnDragonCommandTTProcedure;
import net.mcreator.howtoownadragon.procedures.BabyPinkMaleGronckleSpawnDragonCommandProcedure;
import net.mcreator.howtoownadragon.procedures.BabyPinkFemaleSpawnDragonCommandTTProcedure;
import net.mcreator.howtoownadragon.procedures.BabyPinkFemaleGronckleSpawnDragonCommandProcedure;
import net.mcreator.howtoownadragon.procedures.BabyOrangeRedMaleGronckleSpawnDragonCommandProcedure;
import net.mcreator.howtoownadragon.procedures.BabyOrangeRedFemaleGronckleSpawnDragonCommandProcedure;
import net.mcreator.howtoownadragon.procedures.BabyMeatlugMaleGronckleSpawnDragonCommandProcedure;
import net.mcreator.howtoownadragon.procedures.BabyMeatlugFemaleGronckleSpawnDragonCommandProcedure;
import net.mcreator.howtoownadragon.procedures.BabyGreenMaleSpawnDragonCommandTTProcedure;
import net.mcreator.howtoownadragon.procedures.BabyGreenFemaleSpawnDragonCommandTTProcedure;
import net.mcreator.howtoownadragon.procedures.BabyBlueYellowMaleGronckleSpawnDragonCommandProcedure;
import net.mcreator.howtoownadragon.procedures.BabyBlueYellowFemaleGronckleSpawnDragonCommandProcedure;
import net.mcreator.howtoownadragon.procedures.AdolescentTurqMaleSpawnDragonCommandTTProcedure;
import net.mcreator.howtoownadragon.procedures.AdolescentTurqFemaleSpawnDragonCommandTTProcedure;
import net.mcreator.howtoownadragon.procedures.AdolescentPinkMaleSpawnDragonCommandTTProcedure;
import net.mcreator.howtoownadragon.procedures.AdolescentPinkMaleGronckleSpawnDragonCommandProcedure;
import net.mcreator.howtoownadragon.procedures.AdolescentPinkFemaleSpawnDragonCommandTTProcedure;
import net.mcreator.howtoownadragon.procedures.AdolescentPinkFemaleGronckleSpawnDragonCommandProcedure;
import net.mcreator.howtoownadragon.procedures.AdolescentOrangeRedMaleGronckleSpawnDragonCommandProcedure;
import net.mcreator.howtoownadragon.procedures.AdolescentOrangeRedFemaleGronckleSpawnDragonCommandProcedure;
import net.mcreator.howtoownadragon.procedures.AdolescentMeatlugMaleGronckleSpawnDragonCommandProcedure;
import net.mcreator.howtoownadragon.procedures.AdolescentMeatlugFemaleGronckleSpawnDragonCommandProcedure;
import net.mcreator.howtoownadragon.procedures.AdolescentGreenMaleSpawnDragonCommandTTProcedure;
import net.mcreator.howtoownadragon.procedures.AdolescentGreenFemaleSpawnDragonCommandTTProcedure;
import net.mcreator.howtoownadragon.procedures.AdolescentBlueYellowMaleGronckleSpawnDragonCommandProcedure;
import net.mcreator.howtoownadragon.procedures.AdolescentBlueYellowFemaleGronckleSpawnDragonCommandProcedure;
import net.mcreator.howtoownadragon.procedures.AdoStormflyMaleSpawnDragonCommandNadderProcedure;
import net.mcreator.howtoownadragon.procedures.AdoStormflyFemaleSpawnDragonCommandNadderProcedure;
import net.mcreator.howtoownadragon.procedures.AdoRedMaleSpawnDragonCommandNadderProcedure;
import net.mcreator.howtoownadragon.procedures.AdoRedFemaleSpawnDragonCommandNadderProcedure;
import net.mcreator.howtoownadragon.procedures.AdoPurpleMaleSpawnDragonCommandNadderProcedure;
import net.mcreator.howtoownadragon.procedures.AdoPurpleFemaleSpawnDragonCommandNadderProcedure;

@Mod.EventBusSubscriber
public class DragonSpawnCommand {
	@SubscribeEvent
	public static void registerCommand(RegisterCommandsEvent event) {
		event.getDispatcher()
				.register(Commands.literal("spawndragon").requires(s -> s.hasPermission(4)).then(Commands.literal("Gronckle").then(Commands.literal("male").then(Commands.literal("baby").then(Commands.literal("pink").executes(arguments -> {
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
				}))))).then(Commands.literal("Terrible").then(Commands.literal("Terror").then(Commands.literal("male").then(Commands.literal("baby").then(Commands.literal("pink").executes(arguments -> {
					ServerLevel world = arguments.getSource().getLevel();
					double x = arguments.getSource().getPosition().x();
					double y = arguments.getSource().getPosition().y();
					double z = arguments.getSource().getPosition().z();
					Entity entity = arguments.getSource().getEntity();
					if (entity == null)
						entity = FakePlayerFactory.getMinecraft(world);
					Direction direction = entity.getDirection();

					BabyPinkMaleSpawnDragonCommandTTProcedure.execute(world, x, y, z);
					return 0;
				})).then(Commands.literal("green").executes(arguments -> {
					ServerLevel world = arguments.getSource().getLevel();
					double x = arguments.getSource().getPosition().x();
					double y = arguments.getSource().getPosition().y();
					double z = arguments.getSource().getPosition().z();
					Entity entity = arguments.getSource().getEntity();
					if (entity == null)
						entity = FakePlayerFactory.getMinecraft(world);
					Direction direction = entity.getDirection();

					BabyGreenMaleSpawnDragonCommandTTProcedure.execute(world, x, y, z);
					return 0;
				})).then(Commands.literal("turq").executes(arguments -> {
					ServerLevel world = arguments.getSource().getLevel();
					double x = arguments.getSource().getPosition().x();
					double y = arguments.getSource().getPosition().y();
					double z = arguments.getSource().getPosition().z();
					Entity entity = arguments.getSource().getEntity();
					if (entity == null)
						entity = FakePlayerFactory.getMinecraft(world);
					Direction direction = entity.getDirection();

					BabyTurqMaleSpawnDragonCommandTTProcedure.execute(world, x, y, z);
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

					JuvenilePinkMaleSpawnDragonCommandTTProcedure.execute(world, x, y, z);
					return 0;
				})).then(Commands.literal("green").executes(arguments -> {
					ServerLevel world = arguments.getSource().getLevel();
					double x = arguments.getSource().getPosition().x();
					double y = arguments.getSource().getPosition().y();
					double z = arguments.getSource().getPosition().z();
					Entity entity = arguments.getSource().getEntity();
					if (entity == null)
						entity = FakePlayerFactory.getMinecraft(world);
					Direction direction = entity.getDirection();

					JuvenileGreenMaleSpawnDragonCommandTTProcedure.execute(world, x, y, z);
					return 0;
				})).then(Commands.literal("turq").executes(arguments -> {
					ServerLevel world = arguments.getSource().getLevel();
					double x = arguments.getSource().getPosition().x();
					double y = arguments.getSource().getPosition().y();
					double z = arguments.getSource().getPosition().z();
					Entity entity = arguments.getSource().getEntity();
					if (entity == null)
						entity = FakePlayerFactory.getMinecraft(world);
					Direction direction = entity.getDirection();

					JuvenileTurqMaleSpawnDragonCommandTTProcedure.execute(world, x, y, z);
					return 0;
				}))).then(Commands.literal("adolescent").then(Commands.literal("pink").executes(arguments -> {
					ServerLevel world = arguments.getSource().getLevel();
					double x = arguments.getSource().getPosition().x();
					double y = arguments.getSource().getPosition().y();
					double z = arguments.getSource().getPosition().z();
					Entity entity = arguments.getSource().getEntity();
					if (entity == null)
						entity = FakePlayerFactory.getMinecraft(world);
					Direction direction = entity.getDirection();

					AdolescentPinkMaleSpawnDragonCommandTTProcedure.execute(world, x, y, z);
					return 0;
				})).then(Commands.literal("green").executes(arguments -> {
					ServerLevel world = arguments.getSource().getLevel();
					double x = arguments.getSource().getPosition().x();
					double y = arguments.getSource().getPosition().y();
					double z = arguments.getSource().getPosition().z();
					Entity entity = arguments.getSource().getEntity();
					if (entity == null)
						entity = FakePlayerFactory.getMinecraft(world);
					Direction direction = entity.getDirection();

					AdolescentGreenMaleSpawnDragonCommandTTProcedure.execute(world, x, y, z);
					return 0;
				})).then(Commands.literal("turq").executes(arguments -> {
					ServerLevel world = arguments.getSource().getLevel();
					double x = arguments.getSource().getPosition().x();
					double y = arguments.getSource().getPosition().y();
					double z = arguments.getSource().getPosition().z();
					Entity entity = arguments.getSource().getEntity();
					if (entity == null)
						entity = FakePlayerFactory.getMinecraft(world);
					Direction direction = entity.getDirection();

					AdolescentTurqMaleSpawnDragonCommandTTProcedure.execute(world, x, y, z);
					return 0;
				}))).then(Commands.literal("grown").then(Commands.literal("pink").executes(arguments -> {
					ServerLevel world = arguments.getSource().getLevel();
					double x = arguments.getSource().getPosition().x();
					double y = arguments.getSource().getPosition().y();
					double z = arguments.getSource().getPosition().z();
					Entity entity = arguments.getSource().getEntity();
					if (entity == null)
						entity = FakePlayerFactory.getMinecraft(world);
					Direction direction = entity.getDirection();

					PinkMaleSpawnDragonCommandTTProcedure.execute(world, x, y, z);
					return 0;
				})).then(Commands.literal("green").executes(arguments -> {
					ServerLevel world = arguments.getSource().getLevel();
					double x = arguments.getSource().getPosition().x();
					double y = arguments.getSource().getPosition().y();
					double z = arguments.getSource().getPosition().z();
					Entity entity = arguments.getSource().getEntity();
					if (entity == null)
						entity = FakePlayerFactory.getMinecraft(world);
					Direction direction = entity.getDirection();

					GreenMaleSpawnDragonCommandTTProcedure.execute(world, x, y, z);
					return 0;
				})).then(Commands.literal("turq").executes(arguments -> {
					ServerLevel world = arguments.getSource().getLevel();
					double x = arguments.getSource().getPosition().x();
					double y = arguments.getSource().getPosition().y();
					double z = arguments.getSource().getPosition().z();
					Entity entity = arguments.getSource().getEntity();
					if (entity == null)
						entity = FakePlayerFactory.getMinecraft(world);
					Direction direction = entity.getDirection();

					TurqMaleSpawnDragonCommandTTProcedure.execute(world, x, y, z);
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

					BabyPinkFemaleSpawnDragonCommandTTProcedure.execute(world, x, y, z);
					return 0;
				})).then(Commands.literal("green").executes(arguments -> {
					ServerLevel world = arguments.getSource().getLevel();
					double x = arguments.getSource().getPosition().x();
					double y = arguments.getSource().getPosition().y();
					double z = arguments.getSource().getPosition().z();
					Entity entity = arguments.getSource().getEntity();
					if (entity == null)
						entity = FakePlayerFactory.getMinecraft(world);
					Direction direction = entity.getDirection();

					BabyGreenFemaleSpawnDragonCommandTTProcedure.execute(world, x, y, z);
					return 0;
				})).then(Commands.literal("turq").executes(arguments -> {
					ServerLevel world = arguments.getSource().getLevel();
					double x = arguments.getSource().getPosition().x();
					double y = arguments.getSource().getPosition().y();
					double z = arguments.getSource().getPosition().z();
					Entity entity = arguments.getSource().getEntity();
					if (entity == null)
						entity = FakePlayerFactory.getMinecraft(world);
					Direction direction = entity.getDirection();

					BabyTurqFemaleSpawnDragonCommandTTProcedure.execute(world, x, y, z);
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

					JuvenilePinkFemaleSpawnDragonCommandTTProcedure.execute(world, x, y, z);
					return 0;
				})).then(Commands.literal("green").executes(arguments -> {
					ServerLevel world = arguments.getSource().getLevel();
					double x = arguments.getSource().getPosition().x();
					double y = arguments.getSource().getPosition().y();
					double z = arguments.getSource().getPosition().z();
					Entity entity = arguments.getSource().getEntity();
					if (entity == null)
						entity = FakePlayerFactory.getMinecraft(world);
					Direction direction = entity.getDirection();

					JuvenileGreenFemaleSpawnDragonCommandTTProcedure.execute(world, x, y, z);
					return 0;
				})).then(Commands.literal("turq").executes(arguments -> {
					ServerLevel world = arguments.getSource().getLevel();
					double x = arguments.getSource().getPosition().x();
					double y = arguments.getSource().getPosition().y();
					double z = arguments.getSource().getPosition().z();
					Entity entity = arguments.getSource().getEntity();
					if (entity == null)
						entity = FakePlayerFactory.getMinecraft(world);
					Direction direction = entity.getDirection();

					JuvenileTurqFemaleSpawnDragonCommandTTProcedure.execute(world, x, y, z);
					return 0;
				}))).then(Commands.literal("adolescent").then(Commands.literal("pink").executes(arguments -> {
					ServerLevel world = arguments.getSource().getLevel();
					double x = arguments.getSource().getPosition().x();
					double y = arguments.getSource().getPosition().y();
					double z = arguments.getSource().getPosition().z();
					Entity entity = arguments.getSource().getEntity();
					if (entity == null)
						entity = FakePlayerFactory.getMinecraft(world);
					Direction direction = entity.getDirection();

					AdolescentPinkFemaleSpawnDragonCommandTTProcedure.execute(world, x, y, z);
					return 0;
				})).then(Commands.literal("green").executes(arguments -> {
					ServerLevel world = arguments.getSource().getLevel();
					double x = arguments.getSource().getPosition().x();
					double y = arguments.getSource().getPosition().y();
					double z = arguments.getSource().getPosition().z();
					Entity entity = arguments.getSource().getEntity();
					if (entity == null)
						entity = FakePlayerFactory.getMinecraft(world);
					Direction direction = entity.getDirection();

					AdolescentGreenFemaleSpawnDragonCommandTTProcedure.execute(world, x, y, z);
					return 0;
				})).then(Commands.literal("turq").executes(arguments -> {
					ServerLevel world = arguments.getSource().getLevel();
					double x = arguments.getSource().getPosition().x();
					double y = arguments.getSource().getPosition().y();
					double z = arguments.getSource().getPosition().z();
					Entity entity = arguments.getSource().getEntity();
					if (entity == null)
						entity = FakePlayerFactory.getMinecraft(world);
					Direction direction = entity.getDirection();

					AdolescentTurqFemaleSpawnDragonCommandTTProcedure.execute(world, x, y, z);
					return 0;
				}))).then(Commands.literal("grown").then(Commands.literal("pink").executes(arguments -> {
					ServerLevel world = arguments.getSource().getLevel();
					double x = arguments.getSource().getPosition().x();
					double y = arguments.getSource().getPosition().y();
					double z = arguments.getSource().getPosition().z();
					Entity entity = arguments.getSource().getEntity();
					if (entity == null)
						entity = FakePlayerFactory.getMinecraft(world);
					Direction direction = entity.getDirection();

					PinkFemaleSpawnDragonCommandTTProcedure.execute(world, x, y, z);
					return 0;
				})).then(Commands.literal("green").executes(arguments -> {
					ServerLevel world = arguments.getSource().getLevel();
					double x = arguments.getSource().getPosition().x();
					double y = arguments.getSource().getPosition().y();
					double z = arguments.getSource().getPosition().z();
					Entity entity = arguments.getSource().getEntity();
					if (entity == null)
						entity = FakePlayerFactory.getMinecraft(world);
					Direction direction = entity.getDirection();

					GreenFemaleSpawnDragonCommandTTProcedure.execute(world, x, y, z);
					return 0;
				})).then(Commands.literal("turq").executes(arguments -> {
					ServerLevel world = arguments.getSource().getLevel();
					double x = arguments.getSource().getPosition().x();
					double y = arguments.getSource().getPosition().y();
					double z = arguments.getSource().getPosition().z();
					Entity entity = arguments.getSource().getEntity();
					if (entity == null)
						entity = FakePlayerFactory.getMinecraft(world);
					Direction direction = entity.getDirection();

					TurqFemaleSpawnDragonCommandTTProcedure.execute(world, x, y, z);
					return 0;
				})))))).then(Commands.literal("Deadly").then(Commands.literal("Nadder").then(Commands.literal("male").then(Commands.literal("baby").then(Commands.literal("stormfly").executes(arguments -> {
					ServerLevel world = arguments.getSource().getLevel();
					double x = arguments.getSource().getPosition().x();
					double y = arguments.getSource().getPosition().y();
					double z = arguments.getSource().getPosition().z();
					Entity entity = arguments.getSource().getEntity();
					if (entity == null)
						entity = FakePlayerFactory.getMinecraft(world);
					Direction direction = entity.getDirection();

					BabyStormflyMaleSpawnDragonCommandNadderProcedure.execute(world, x, y, z);
					return 0;
				})).then(Commands.literal("red").executes(arguments -> {
					ServerLevel world = arguments.getSource().getLevel();
					double x = arguments.getSource().getPosition().x();
					double y = arguments.getSource().getPosition().y();
					double z = arguments.getSource().getPosition().z();
					Entity entity = arguments.getSource().getEntity();
					if (entity == null)
						entity = FakePlayerFactory.getMinecraft(world);
					Direction direction = entity.getDirection();

					BabyRedMaleSpawnDragonCommandNadderProcedure.execute(world, x, y, z);
					return 0;
				})).then(Commands.literal("purple").executes(arguments -> {
					ServerLevel world = arguments.getSource().getLevel();
					double x = arguments.getSource().getPosition().x();
					double y = arguments.getSource().getPosition().y();
					double z = arguments.getSource().getPosition().z();
					Entity entity = arguments.getSource().getEntity();
					if (entity == null)
						entity = FakePlayerFactory.getMinecraft(world);
					Direction direction = entity.getDirection();

					BabyPurpleMaleSpawnDragonCommandNadderProcedure.execute(world, x, y, z);
					return 0;
				}))).then(Commands.literal("juvenile").then(Commands.literal("stormfly").executes(arguments -> {
					ServerLevel world = arguments.getSource().getLevel();
					double x = arguments.getSource().getPosition().x();
					double y = arguments.getSource().getPosition().y();
					double z = arguments.getSource().getPosition().z();
					Entity entity = arguments.getSource().getEntity();
					if (entity == null)
						entity = FakePlayerFactory.getMinecraft(world);
					Direction direction = entity.getDirection();

					JuviStormflyMaleSpawnDragonCommandNadderProcedure.execute(world, x, y, z);
					return 0;
				})).then(Commands.literal("red").executes(arguments -> {
					ServerLevel world = arguments.getSource().getLevel();
					double x = arguments.getSource().getPosition().x();
					double y = arguments.getSource().getPosition().y();
					double z = arguments.getSource().getPosition().z();
					Entity entity = arguments.getSource().getEntity();
					if (entity == null)
						entity = FakePlayerFactory.getMinecraft(world);
					Direction direction = entity.getDirection();

					JuviRedMaleSpawnDragonCommandNadderProcedure.execute(world, x, y, z);
					return 0;
				})).then(Commands.literal("purple").executes(arguments -> {
					ServerLevel world = arguments.getSource().getLevel();
					double x = arguments.getSource().getPosition().x();
					double y = arguments.getSource().getPosition().y();
					double z = arguments.getSource().getPosition().z();
					Entity entity = arguments.getSource().getEntity();
					if (entity == null)
						entity = FakePlayerFactory.getMinecraft(world);
					Direction direction = entity.getDirection();

					JuviPurpleMaleSpawnDragonCommandNadderProcedure.execute(world, x, y, z);
					return 0;
				}))).then(Commands.literal("adolescent").then(Commands.literal("stormfly").executes(arguments -> {
					ServerLevel world = arguments.getSource().getLevel();
					double x = arguments.getSource().getPosition().x();
					double y = arguments.getSource().getPosition().y();
					double z = arguments.getSource().getPosition().z();
					Entity entity = arguments.getSource().getEntity();
					if (entity == null)
						entity = FakePlayerFactory.getMinecraft(world);
					Direction direction = entity.getDirection();

					AdoStormflyMaleSpawnDragonCommandNadderProcedure.execute(world, x, y, z);
					return 0;
				})).then(Commands.literal("red").executes(arguments -> {
					ServerLevel world = arguments.getSource().getLevel();
					double x = arguments.getSource().getPosition().x();
					double y = arguments.getSource().getPosition().y();
					double z = arguments.getSource().getPosition().z();
					Entity entity = arguments.getSource().getEntity();
					if (entity == null)
						entity = FakePlayerFactory.getMinecraft(world);
					Direction direction = entity.getDirection();

					AdoRedMaleSpawnDragonCommandNadderProcedure.execute(world, x, y, z);
					return 0;
				})).then(Commands.literal("purple").executes(arguments -> {
					ServerLevel world = arguments.getSource().getLevel();
					double x = arguments.getSource().getPosition().x();
					double y = arguments.getSource().getPosition().y();
					double z = arguments.getSource().getPosition().z();
					Entity entity = arguments.getSource().getEntity();
					if (entity == null)
						entity = FakePlayerFactory.getMinecraft(world);
					Direction direction = entity.getDirection();

					AdoPurpleMaleSpawnDragonCommandNadderProcedure.execute(world, x, y, z);
					return 0;
				}))).then(Commands.literal("grown").then(Commands.literal("stormfly").executes(arguments -> {
					ServerLevel world = arguments.getSource().getLevel();
					double x = arguments.getSource().getPosition().x();
					double y = arguments.getSource().getPosition().y();
					double z = arguments.getSource().getPosition().z();
					Entity entity = arguments.getSource().getEntity();
					if (entity == null)
						entity = FakePlayerFactory.getMinecraft(world);
					Direction direction = entity.getDirection();

					StormflyMaleSpawnDragonCommandNadderProcedure.execute(world, x, y, z);
					return 0;
				})).then(Commands.literal("red").executes(arguments -> {
					ServerLevel world = arguments.getSource().getLevel();
					double x = arguments.getSource().getPosition().x();
					double y = arguments.getSource().getPosition().y();
					double z = arguments.getSource().getPosition().z();
					Entity entity = arguments.getSource().getEntity();
					if (entity == null)
						entity = FakePlayerFactory.getMinecraft(world);
					Direction direction = entity.getDirection();

					RedMaleSpawnDragonCommandNadderProcedure.execute(world, x, y, z);
					return 0;
				})).then(Commands.literal("purple").executes(arguments -> {
					ServerLevel world = arguments.getSource().getLevel();
					double x = arguments.getSource().getPosition().x();
					double y = arguments.getSource().getPosition().y();
					double z = arguments.getSource().getPosition().z();
					Entity entity = arguments.getSource().getEntity();
					if (entity == null)
						entity = FakePlayerFactory.getMinecraft(world);
					Direction direction = entity.getDirection();

					PurpleMaleSpawnDragonCommandNadderProcedure.execute(world, x, y, z);
					return 0;
				})))).then(Commands.literal("female").then(Commands.literal("baby").then(Commands.literal("stormfly").executes(arguments -> {
					ServerLevel world = arguments.getSource().getLevel();
					double x = arguments.getSource().getPosition().x();
					double y = arguments.getSource().getPosition().y();
					double z = arguments.getSource().getPosition().z();
					Entity entity = arguments.getSource().getEntity();
					if (entity == null)
						entity = FakePlayerFactory.getMinecraft(world);
					Direction direction = entity.getDirection();

					BabyStormflyFemaleSpawnDragonCommandNadderProcedure.execute(world, x, y, z);
					return 0;
				})).then(Commands.literal("red").executes(arguments -> {
					ServerLevel world = arguments.getSource().getLevel();
					double x = arguments.getSource().getPosition().x();
					double y = arguments.getSource().getPosition().y();
					double z = arguments.getSource().getPosition().z();
					Entity entity = arguments.getSource().getEntity();
					if (entity == null)
						entity = FakePlayerFactory.getMinecraft(world);
					Direction direction = entity.getDirection();

					BabyRedFemaleSpawnDragonCommandNadderProcedure.execute(world, x, y, z);
					return 0;
				})).then(Commands.literal("purple").executes(arguments -> {
					ServerLevel world = arguments.getSource().getLevel();
					double x = arguments.getSource().getPosition().x();
					double y = arguments.getSource().getPosition().y();
					double z = arguments.getSource().getPosition().z();
					Entity entity = arguments.getSource().getEntity();
					if (entity == null)
						entity = FakePlayerFactory.getMinecraft(world);
					Direction direction = entity.getDirection();

					BabyPurpleFemaleSpawnDragonCommandNadderProcedure.execute(world, x, y, z);
					return 0;
				}))).then(Commands.literal("juvenile").then(Commands.literal("stormfly").executes(arguments -> {
					ServerLevel world = arguments.getSource().getLevel();
					double x = arguments.getSource().getPosition().x();
					double y = arguments.getSource().getPosition().y();
					double z = arguments.getSource().getPosition().z();
					Entity entity = arguments.getSource().getEntity();
					if (entity == null)
						entity = FakePlayerFactory.getMinecraft(world);
					Direction direction = entity.getDirection();

					JuviStormflyFemaleSpawnDragonCommandNadderProcedure.execute(world, x, y, z);
					return 0;
				})).then(Commands.literal("red").executes(arguments -> {
					ServerLevel world = arguments.getSource().getLevel();
					double x = arguments.getSource().getPosition().x();
					double y = arguments.getSource().getPosition().y();
					double z = arguments.getSource().getPosition().z();
					Entity entity = arguments.getSource().getEntity();
					if (entity == null)
						entity = FakePlayerFactory.getMinecraft(world);
					Direction direction = entity.getDirection();

					JuviRedFemaleSpawnDragonCommandNadderProcedure.execute(world, x, y, z);
					return 0;
				})).then(Commands.literal("purple").executes(arguments -> {
					ServerLevel world = arguments.getSource().getLevel();
					double x = arguments.getSource().getPosition().x();
					double y = arguments.getSource().getPosition().y();
					double z = arguments.getSource().getPosition().z();
					Entity entity = arguments.getSource().getEntity();
					if (entity == null)
						entity = FakePlayerFactory.getMinecraft(world);
					Direction direction = entity.getDirection();

					JuviPurpleFemaleSpawnDragonCommandNadderProcedure.execute(world, x, y, z);
					return 0;
				}))).then(Commands.literal("adolescent").then(Commands.literal("stormfly").executes(arguments -> {
					ServerLevel world = arguments.getSource().getLevel();
					double x = arguments.getSource().getPosition().x();
					double y = arguments.getSource().getPosition().y();
					double z = arguments.getSource().getPosition().z();
					Entity entity = arguments.getSource().getEntity();
					if (entity == null)
						entity = FakePlayerFactory.getMinecraft(world);
					Direction direction = entity.getDirection();

					AdoStormflyFemaleSpawnDragonCommandNadderProcedure.execute(world, x, y, z);
					return 0;
				})).then(Commands.literal("red").executes(arguments -> {
					ServerLevel world = arguments.getSource().getLevel();
					double x = arguments.getSource().getPosition().x();
					double y = arguments.getSource().getPosition().y();
					double z = arguments.getSource().getPosition().z();
					Entity entity = arguments.getSource().getEntity();
					if (entity == null)
						entity = FakePlayerFactory.getMinecraft(world);
					Direction direction = entity.getDirection();

					AdoRedFemaleSpawnDragonCommandNadderProcedure.execute(world, x, y, z);
					return 0;
				})).then(Commands.literal("purple").executes(arguments -> {
					ServerLevel world = arguments.getSource().getLevel();
					double x = arguments.getSource().getPosition().x();
					double y = arguments.getSource().getPosition().y();
					double z = arguments.getSource().getPosition().z();
					Entity entity = arguments.getSource().getEntity();
					if (entity == null)
						entity = FakePlayerFactory.getMinecraft(world);
					Direction direction = entity.getDirection();

					AdoPurpleFemaleSpawnDragonCommandNadderProcedure.execute(world, x, y, z);
					return 0;
				}))).then(Commands.literal("grown").then(Commands.literal("stormfly").executes(arguments -> {
					ServerLevel world = arguments.getSource().getLevel();
					double x = arguments.getSource().getPosition().x();
					double y = arguments.getSource().getPosition().y();
					double z = arguments.getSource().getPosition().z();
					Entity entity = arguments.getSource().getEntity();
					if (entity == null)
						entity = FakePlayerFactory.getMinecraft(world);
					Direction direction = entity.getDirection();

					StormflyFemaleSpawnDragonCommandNadderProcedure.execute(world, x, y, z);
					return 0;
				})).then(Commands.literal("red").executes(arguments -> {
					ServerLevel world = arguments.getSource().getLevel();
					double x = arguments.getSource().getPosition().x();
					double y = arguments.getSource().getPosition().y();
					double z = arguments.getSource().getPosition().z();
					Entity entity = arguments.getSource().getEntity();
					if (entity == null)
						entity = FakePlayerFactory.getMinecraft(world);
					Direction direction = entity.getDirection();

					RedFemaleSpawnDragonCommandNadderProcedure.execute(world, x, y, z);
					return 0;
				})).then(Commands.literal("purple").executes(arguments -> {
					ServerLevel world = arguments.getSource().getLevel();
					double x = arguments.getSource().getPosition().x();
					double y = arguments.getSource().getPosition().y();
					double z = arguments.getSource().getPosition().z();
					Entity entity = arguments.getSource().getEntity();
					if (entity == null)
						entity = FakePlayerFactory.getMinecraft(world);
					Direction direction = entity.getDirection();

					PurpleFemaleSpawnDragonCommandNadderProcedure.execute(world, x, y, z);
					return 0;
				})))))));
	}
}
