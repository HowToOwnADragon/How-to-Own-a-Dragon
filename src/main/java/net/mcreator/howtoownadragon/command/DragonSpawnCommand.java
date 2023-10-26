
package net.mcreator.howtoownadragon.command;

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
				}))).then(Commands.literal("juvenile").then(Commands.literal("pink")).then(Commands.literal("meatlug")).then(Commands.literal("orangered")).then(Commands.literal("blueyellow")))
						.then(Commands.literal("adolescent").then(Commands.literal("meatlug").executes(arguments -> {
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
						}))).then(Commands.literal("grown").then(Commands.literal("meatlug")).then(Commands.literal("pink")).then(Commands.literal("orangered")).then(Commands.literal("blueyellow"))))
						.then(Commands.literal("female").then(Commands.literal("baby").then(Commands.literal("pink")).then(Commands.literal("meatlug")).then(Commands.literal("orangered")).then(Commands.literal("blueyellow")))
								.then(Commands.literal("juvenile").then(Commands.literal("pink")).then(Commands.literal("meatlug")).then(Commands.literal("orangered")).then(Commands.literal("blueyellow")))
								.then(Commands.literal("adolescent").then(Commands.literal("meatlug")).then(Commands.literal("pink")).then(Commands.literal("orangered")).then(Commands.literal("blueyellow")))
								.then(Commands.literal("grown").then(Commands.literal("meatlug")).then(Commands.literal("pink")).then(Commands.literal("orangered")).then(Commands.literal("blueyellow")))))
						.then(Commands.literal("Terrible")
								.then(Commands.literal("Terror")
										.then(Commands.literal("male").then(Commands.literal("baby").then(Commands.literal("pink")).then(Commands.literal("green")).then(Commands.literal("turq")))
												.then(Commands.literal("juvenile").then(Commands.literal("pink")).then(Commands.literal("green")).then(Commands.literal("turq")))
												.then(Commands.literal("adolescent").then(Commands.literal("pink")).then(Commands.literal("green")).then(Commands.literal("turq")))
												.then(Commands.literal("grown").then(Commands.literal("pink")).then(Commands.literal("green")).then(Commands.literal("turq"))))
										.then(Commands.literal("female").then(Commands.literal("baby").then(Commands.literal("pink")).then(Commands.literal("green")).then(Commands.literal("turq")))
												.then(Commands.literal("juvenile").then(Commands.literal("pink")).then(Commands.literal("green")).then(Commands.literal("turq")))
												.then(Commands.literal("adolescent").then(Commands.literal("pink")).then(Commands.literal("green")).then(Commands.literal("turq")))
												.then(Commands.literal("grown").then(Commands.literal("pink")).then(Commands.literal("green")).then(Commands.literal("turq"))))))
						.then(Commands.literal("Deadly")
								.then(Commands.literal("Nadder")
										.then(Commands.literal("male").then(Commands.literal("baby").then(Commands.literal("stormfly")).then(Commands.literal("red")).then(Commands.literal("purple")))
												.then(Commands.literal("juvenile").then(Commands.literal("stormfly")).then(Commands.literal("red")).then(Commands.literal("purple")))
												.then(Commands.literal("adolescent").then(Commands.literal("stormfly")).then(Commands.literal("red")).then(Commands.literal("purple")))
												.then(Commands.literal("grown").then(Commands.literal("stormfly")).then(Commands.literal("red")).then(Commands.literal("purple"))))
										.then(Commands.literal("female").then(Commands.literal("baby").then(Commands.literal("stormfly")).then(Commands.literal("red")).then(Commands.literal("purple")))
												.then(Commands.literal("juvenile").then(Commands.literal("stormfly")).then(Commands.literal("red")).then(Commands.literal("purple")))
												.then(Commands.literal("adolescent").then(Commands.literal("stormfly")).then(Commands.literal("red")).then(Commands.literal("purple")))
												.then(Commands.literal("grown").then(Commands.literal("stormfly")).then(Commands.literal("red")).then(Commands.literal("purple")))))));
	}

}
