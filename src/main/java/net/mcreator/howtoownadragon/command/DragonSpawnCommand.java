
package net.mcreator.howtoownadragon.command;

import org.checkerframework.checker.units.qual.s;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegisterCommandsEvent;
import net.minecraftforge.common.util.FakePlayerFactory;

import net.minecraft.world.level.Level;
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
import net.mcreator.howtoownadragon.procedures.GroncklePinkMaleGronckleSpawnDragonCommandProcedure;
import net.mcreator.howtoownadragon.procedures.GronckleOrangeRedMaleGronckleSpawnDragonCommandProcedure;
import net.mcreator.howtoownadragon.procedures.GronckleMeatlugMaleGronckleSpawnDragonCommandProcedure;
import net.mcreator.howtoownadragon.procedures.GronckleBlueYellowMaleGronckleSpawnDragonCommandProcedure;
import net.mcreator.howtoownadragon.procedures.GreenMaleSpawnDragonCommandTTProcedure;
import net.mcreator.howtoownadragon.procedures.GreenFemaleSpawnDragonCommandTTProcedure;
import net.mcreator.howtoownadragon.procedures.BlueYellowFemaleGronckleSpawnDragonCommandProcedure;

@Mod.EventBusSubscriber
public class DragonSpawnCommand {
	@SubscribeEvent
	public static void registerCommand(RegisterCommandsEvent event) {
		event.getDispatcher()
				.register(Commands.literal("dragonspawn").requires(s -> s.hasPermission(4)).then(Commands.literal("Gronckle").then(Commands.literal("male").then(Commands.literal("grown").then(Commands.literal("meatlug").executes(arguments -> {
					Level world = arguments.getSource().getUnsidedLevel();
					double x = arguments.getSource().getPosition().x();
					double y = arguments.getSource().getPosition().y();
					double z = arguments.getSource().getPosition().z();
					Entity entity = arguments.getSource().getEntity();
					if (entity == null && world instanceof ServerLevel _servLevel)
						entity = FakePlayerFactory.getMinecraft(_servLevel);
					Direction direction = Direction.DOWN;
					if (entity != null)
						direction = entity.getDirection();

					GronckleMeatlugMaleGronckleSpawnDragonCommandProcedure.execute(world, x, y, z);
					return 0;
				})).then(Commands.literal("pink").executes(arguments -> {
					Level world = arguments.getSource().getUnsidedLevel();
					double x = arguments.getSource().getPosition().x();
					double y = arguments.getSource().getPosition().y();
					double z = arguments.getSource().getPosition().z();
					Entity entity = arguments.getSource().getEntity();
					if (entity == null && world instanceof ServerLevel _servLevel)
						entity = FakePlayerFactory.getMinecraft(_servLevel);
					Direction direction = Direction.DOWN;
					if (entity != null)
						direction = entity.getDirection();

					GroncklePinkMaleGronckleSpawnDragonCommandProcedure.execute(world, x, y, z);
					return 0;
				})).then(Commands.literal("orangered").executes(arguments -> {
					Level world = arguments.getSource().getUnsidedLevel();
					double x = arguments.getSource().getPosition().x();
					double y = arguments.getSource().getPosition().y();
					double z = arguments.getSource().getPosition().z();
					Entity entity = arguments.getSource().getEntity();
					if (entity == null && world instanceof ServerLevel _servLevel)
						entity = FakePlayerFactory.getMinecraft(_servLevel);
					Direction direction = Direction.DOWN;
					if (entity != null)
						direction = entity.getDirection();

					GronckleOrangeRedMaleGronckleSpawnDragonCommandProcedure.execute(world, x, y, z);
					return 0;
				})).then(Commands.literal("blueyellow").executes(arguments -> {
					Level world = arguments.getSource().getUnsidedLevel();
					double x = arguments.getSource().getPosition().x();
					double y = arguments.getSource().getPosition().y();
					double z = arguments.getSource().getPosition().z();
					Entity entity = arguments.getSource().getEntity();
					if (entity == null && world instanceof ServerLevel _servLevel)
						entity = FakePlayerFactory.getMinecraft(_servLevel);
					Direction direction = Direction.DOWN;
					if (entity != null)
						direction = entity.getDirection();

					GronckleBlueYellowMaleGronckleSpawnDragonCommandProcedure.execute(world, x, y, z);
					return 0;
				})))).then(Commands.literal("female").then(Commands.literal("grown").then(Commands.literal("meatlug").executes(arguments -> {
					Level world = arguments.getSource().getUnsidedLevel();
					double x = arguments.getSource().getPosition().x();
					double y = arguments.getSource().getPosition().y();
					double z = arguments.getSource().getPosition().z();
					Entity entity = arguments.getSource().getEntity();
					if (entity == null && world instanceof ServerLevel _servLevel)
						entity = FakePlayerFactory.getMinecraft(_servLevel);
					Direction direction = Direction.DOWN;
					if (entity != null)
						direction = entity.getDirection();

					MeatlugFemaleGronckleSpawnDragonCommandProcedure.execute(world, x, y, z);
					return 0;
				})).then(Commands.literal("pink").executes(arguments -> {
					Level world = arguments.getSource().getUnsidedLevel();
					double x = arguments.getSource().getPosition().x();
					double y = arguments.getSource().getPosition().y();
					double z = arguments.getSource().getPosition().z();
					Entity entity = arguments.getSource().getEntity();
					if (entity == null && world instanceof ServerLevel _servLevel)
						entity = FakePlayerFactory.getMinecraft(_servLevel);
					Direction direction = Direction.DOWN;
					if (entity != null)
						direction = entity.getDirection();

					PinkFemaleGronckleSpawnDragonCommandProcedure.execute(world, x, y, z);
					return 0;
				})).then(Commands.literal("orangered").executes(arguments -> {
					Level world = arguments.getSource().getUnsidedLevel();
					double x = arguments.getSource().getPosition().x();
					double y = arguments.getSource().getPosition().y();
					double z = arguments.getSource().getPosition().z();
					Entity entity = arguments.getSource().getEntity();
					if (entity == null && world instanceof ServerLevel _servLevel)
						entity = FakePlayerFactory.getMinecraft(_servLevel);
					Direction direction = Direction.DOWN;
					if (entity != null)
						direction = entity.getDirection();

					OrangeRedFemaleGronckleSpawnDragonCommandProcedure.execute(world, x, y, z);
					return 0;
				})).then(Commands.literal("blueyellow").executes(arguments -> {
					Level world = arguments.getSource().getUnsidedLevel();
					double x = arguments.getSource().getPosition().x();
					double y = arguments.getSource().getPosition().y();
					double z = arguments.getSource().getPosition().z();
					Entity entity = arguments.getSource().getEntity();
					if (entity == null && world instanceof ServerLevel _servLevel)
						entity = FakePlayerFactory.getMinecraft(_servLevel);
					Direction direction = Direction.DOWN;
					if (entity != null)
						direction = entity.getDirection();

					BlueYellowFemaleGronckleSpawnDragonCommandProcedure.execute(world, x, y, z);
					return 0;
				}))))).then(Commands.literal("Deadly").then(Commands.literal("Nadder").then(Commands.literal("male").then(Commands.literal("grown").then(Commands.literal("stormfly").executes(arguments -> {
					Level world = arguments.getSource().getUnsidedLevel();
					double x = arguments.getSource().getPosition().x();
					double y = arguments.getSource().getPosition().y();
					double z = arguments.getSource().getPosition().z();
					Entity entity = arguments.getSource().getEntity();
					if (entity == null && world instanceof ServerLevel _servLevel)
						entity = FakePlayerFactory.getMinecraft(_servLevel);
					Direction direction = Direction.DOWN;
					if (entity != null)
						direction = entity.getDirection();

					StormflyMaleSpawnDragonCommandNadderProcedure.execute(world, x, y, z);
					return 0;
				})).then(Commands.literal("red").executes(arguments -> {
					Level world = arguments.getSource().getUnsidedLevel();
					double x = arguments.getSource().getPosition().x();
					double y = arguments.getSource().getPosition().y();
					double z = arguments.getSource().getPosition().z();
					Entity entity = arguments.getSource().getEntity();
					if (entity == null && world instanceof ServerLevel _servLevel)
						entity = FakePlayerFactory.getMinecraft(_servLevel);
					Direction direction = Direction.DOWN;
					if (entity != null)
						direction = entity.getDirection();

					RedMaleSpawnDragonCommandNadderProcedure.execute(world, x, y, z);
					return 0;
				})).then(Commands.literal("purple").executes(arguments -> {
					Level world = arguments.getSource().getUnsidedLevel();
					double x = arguments.getSource().getPosition().x();
					double y = arguments.getSource().getPosition().y();
					double z = arguments.getSource().getPosition().z();
					Entity entity = arguments.getSource().getEntity();
					if (entity == null && world instanceof ServerLevel _servLevel)
						entity = FakePlayerFactory.getMinecraft(_servLevel);
					Direction direction = Direction.DOWN;
					if (entity != null)
						direction = entity.getDirection();

					PurpleMaleSpawnDragonCommandNadderProcedure.execute(world, x, y, z);
					return 0;
				})))).then(Commands.literal("female").then(Commands.literal("grown").then(Commands.literal("stormfly").executes(arguments -> {
					Level world = arguments.getSource().getUnsidedLevel();
					double x = arguments.getSource().getPosition().x();
					double y = arguments.getSource().getPosition().y();
					double z = arguments.getSource().getPosition().z();
					Entity entity = arguments.getSource().getEntity();
					if (entity == null && world instanceof ServerLevel _servLevel)
						entity = FakePlayerFactory.getMinecraft(_servLevel);
					Direction direction = Direction.DOWN;
					if (entity != null)
						direction = entity.getDirection();

					StormflyFemaleSpawnDragonCommandNadderProcedure.execute(world, x, y, z);
					return 0;
				})).then(Commands.literal("red").executes(arguments -> {
					Level world = arguments.getSource().getUnsidedLevel();
					double x = arguments.getSource().getPosition().x();
					double y = arguments.getSource().getPosition().y();
					double z = arguments.getSource().getPosition().z();
					Entity entity = arguments.getSource().getEntity();
					if (entity == null && world instanceof ServerLevel _servLevel)
						entity = FakePlayerFactory.getMinecraft(_servLevel);
					Direction direction = Direction.DOWN;
					if (entity != null)
						direction = entity.getDirection();

					RedFemaleSpawnDragonCommandNadderProcedure.execute(world, x, y, z);
					return 0;
				})).then(Commands.literal("purple").executes(arguments -> {
					Level world = arguments.getSource().getUnsidedLevel();
					double x = arguments.getSource().getPosition().x();
					double y = arguments.getSource().getPosition().y();
					double z = arguments.getSource().getPosition().z();
					Entity entity = arguments.getSource().getEntity();
					if (entity == null && world instanceof ServerLevel _servLevel)
						entity = FakePlayerFactory.getMinecraft(_servLevel);
					Direction direction = Direction.DOWN;
					if (entity != null)
						direction = entity.getDirection();

					PurpleFemaleSpawnDragonCommandNadderProcedure.execute(world, x, y, z);
					return 0;
				})))))).then(Commands.literal("Terrible").then(Commands.literal("Terror").then(Commands.literal("male").then(Commands.literal("grown").then(Commands.literal("pink").executes(arguments -> {
					Level world = arguments.getSource().getUnsidedLevel();
					double x = arguments.getSource().getPosition().x();
					double y = arguments.getSource().getPosition().y();
					double z = arguments.getSource().getPosition().z();
					Entity entity = arguments.getSource().getEntity();
					if (entity == null && world instanceof ServerLevel _servLevel)
						entity = FakePlayerFactory.getMinecraft(_servLevel);
					Direction direction = Direction.DOWN;
					if (entity != null)
						direction = entity.getDirection();

					PinkMaleSpawnDragonCommandTTProcedure.execute(world, x, y, z);
					return 0;
				})).then(Commands.literal("green").executes(arguments -> {
					Level world = arguments.getSource().getUnsidedLevel();
					double x = arguments.getSource().getPosition().x();
					double y = arguments.getSource().getPosition().y();
					double z = arguments.getSource().getPosition().z();
					Entity entity = arguments.getSource().getEntity();
					if (entity == null && world instanceof ServerLevel _servLevel)
						entity = FakePlayerFactory.getMinecraft(_servLevel);
					Direction direction = Direction.DOWN;
					if (entity != null)
						direction = entity.getDirection();

					GreenMaleSpawnDragonCommandTTProcedure.execute(world, x, y, z);
					return 0;
				})).then(Commands.literal("turq").executes(arguments -> {
					Level world = arguments.getSource().getUnsidedLevel();
					double x = arguments.getSource().getPosition().x();
					double y = arguments.getSource().getPosition().y();
					double z = arguments.getSource().getPosition().z();
					Entity entity = arguments.getSource().getEntity();
					if (entity == null && world instanceof ServerLevel _servLevel)
						entity = FakePlayerFactory.getMinecraft(_servLevel);
					Direction direction = Direction.DOWN;
					if (entity != null)
						direction = entity.getDirection();

					TurqMaleSpawnDragonCommandTTProcedure.execute(world, x, y, z);
					return 0;
				})))).then(Commands.literal("female").then(Commands.literal("grown").then(Commands.literal("pink").executes(arguments -> {
					Level world = arguments.getSource().getUnsidedLevel();
					double x = arguments.getSource().getPosition().x();
					double y = arguments.getSource().getPosition().y();
					double z = arguments.getSource().getPosition().z();
					Entity entity = arguments.getSource().getEntity();
					if (entity == null && world instanceof ServerLevel _servLevel)
						entity = FakePlayerFactory.getMinecraft(_servLevel);
					Direction direction = Direction.DOWN;
					if (entity != null)
						direction = entity.getDirection();

					PinkFemaleSpawnDragonCommandTTProcedure.execute(world, x, y, z);
					return 0;
				})).then(Commands.literal("green").executes(arguments -> {
					Level world = arguments.getSource().getUnsidedLevel();
					double x = arguments.getSource().getPosition().x();
					double y = arguments.getSource().getPosition().y();
					double z = arguments.getSource().getPosition().z();
					Entity entity = arguments.getSource().getEntity();
					if (entity == null && world instanceof ServerLevel _servLevel)
						entity = FakePlayerFactory.getMinecraft(_servLevel);
					Direction direction = Direction.DOWN;
					if (entity != null)
						direction = entity.getDirection();

					GreenFemaleSpawnDragonCommandTTProcedure.execute(world, x, y, z);
					return 0;
				})).then(Commands.literal("turq").executes(arguments -> {
					Level world = arguments.getSource().getUnsidedLevel();
					double x = arguments.getSource().getPosition().x();
					double y = arguments.getSource().getPosition().y();
					double z = arguments.getSource().getPosition().z();
					Entity entity = arguments.getSource().getEntity();
					if (entity == null && world instanceof ServerLevel _servLevel)
						entity = FakePlayerFactory.getMinecraft(_servLevel);
					Direction direction = Direction.DOWN;
					if (entity != null)
						direction = entity.getDirection();

					TurqFemaleSpawnDragonCommandTTProcedure.execute(world, x, y, z);
					return 0;
				})))))));
	}
}
