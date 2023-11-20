package net.mcreator.howtoownadragon.command;

import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import net.mcreator.howtoownadragon.procedures.AdoPurpleFemaleSpawnDragonCommandNadderProcedure;
import net.mcreator.howtoownadragon.procedures.AdoPurpleMaleSpawnDragonCommandNadderProcedure;
import net.mcreator.howtoownadragon.procedures.AdoRedFemaleSpawnDragonCommandNadderProcedure;
import net.mcreator.howtoownadragon.procedures.AdoRedMaleSpawnDragonCommandNadderProcedure;
import net.mcreator.howtoownadragon.procedures.AdoStormflyFemaleSpawnDragonCommandNadderProcedure;
import net.mcreator.howtoownadragon.procedures.AdoStormflyMaleSpawnDragonCommandNadderProcedure;
import net.mcreator.howtoownadragon.procedures.AdolescentBlueYellowFemaleGronckleSpawnDragonCommandProcedure;
import net.mcreator.howtoownadragon.procedures.AdolescentBlueYellowMaleGronckleSpawnDragonCommandProcedure;
import net.mcreator.howtoownadragon.procedures.AdolescentGreenFemaleSpawnDragonCommandTTProcedure;
import net.mcreator.howtoownadragon.procedures.AdolescentGreenMaleSpawnDragonCommandTTProcedure;
import net.mcreator.howtoownadragon.procedures.AdolescentMeatlugFemaleGronckleSpawnDragonCommandProcedure;
import net.mcreator.howtoownadragon.procedures.AdolescentMeatlugMaleGronckleSpawnDragonCommandProcedure;
import net.mcreator.howtoownadragon.procedures.AdolescentOrangeRedFemaleGronckleSpawnDragonCommandProcedure;
import net.mcreator.howtoownadragon.procedures.AdolescentOrangeRedMaleGronckleSpawnDragonCommandProcedure;
import net.mcreator.howtoownadragon.procedures.AdolescentPinkFemaleGronckleSpawnDragonCommandProcedure;
import net.mcreator.howtoownadragon.procedures.AdolescentPinkFemaleSpawnDragonCommandTTProcedure;
import net.mcreator.howtoownadragon.procedures.AdolescentPinkMaleGronckleSpawnDragonCommandProcedure;
import net.mcreator.howtoownadragon.procedures.AdolescentPinkMaleSpawnDragonCommandTTProcedure;
import net.mcreator.howtoownadragon.procedures.AdolescentTurqFemaleSpawnDragonCommandTTProcedure;
import net.mcreator.howtoownadragon.procedures.AdolescentTurqMaleSpawnDragonCommandTTProcedure;
import net.mcreator.howtoownadragon.procedures.BabyBlueYellowFemaleGronckleSpawnDragonCommandProcedure;
import net.mcreator.howtoownadragon.procedures.BabyBlueYellowMaleGronckleSpawnDragonCommandProcedure;
import net.mcreator.howtoownadragon.procedures.BabyGreenFemaleSpawnDragonCommandTTProcedure;
import net.mcreator.howtoownadragon.procedures.BabyGreenMaleSpawnDragonCommandTTProcedure;
import net.mcreator.howtoownadragon.procedures.BabyMeatlugFemaleGronckleSpawnDragonCommandProcedure;
import net.mcreator.howtoownadragon.procedures.BabyMeatlugMaleGronckleSpawnDragonCommandProcedure;
import net.mcreator.howtoownadragon.procedures.BabyOrangeRedFemaleGronckleSpawnDragonCommandProcedure;
import net.mcreator.howtoownadragon.procedures.BabyOrangeRedMaleGronckleSpawnDragonCommandProcedure;
import net.mcreator.howtoownadragon.procedures.BabyPinkFemaleGronckleSpawnDragonCommandProcedure;
import net.mcreator.howtoownadragon.procedures.BabyPinkFemaleSpawnDragonCommandTTProcedure;
import net.mcreator.howtoownadragon.procedures.BabyPinkMaleGronckleSpawnDragonCommandProcedure;
import net.mcreator.howtoownadragon.procedures.BabyPinkMaleSpawnDragonCommandTTProcedure;
import net.mcreator.howtoownadragon.procedures.BabyPurpleFemaleSpawnDragonCommandNadderProcedure;
import net.mcreator.howtoownadragon.procedures.BabyPurpleMaleSpawnDragonCommandNadderProcedure;
import net.mcreator.howtoownadragon.procedures.BabyRedFemaleSpawnDragonCommandNadderProcedure;
import net.mcreator.howtoownadragon.procedures.BabyRedMaleSpawnDragonCommandNadderProcedure;
import net.mcreator.howtoownadragon.procedures.BabyStormflyFemaleSpawnDragonCommandNadderProcedure;
import net.mcreator.howtoownadragon.procedures.BabyStormflyMaleSpawnDragonCommandNadderProcedure;
import net.mcreator.howtoownadragon.procedures.BabyTurqFemaleSpawnDragonCommandTTProcedure;
import net.mcreator.howtoownadragon.procedures.BabyTurqMaleSpawnDragonCommandTTProcedure;
import net.mcreator.howtoownadragon.procedures.BlueYellowFemaleGronckleSpawnDragonCommandProcedure;
import net.mcreator.howtoownadragon.procedures.GreenFemaleSpawnDragonCommandTTProcedure;
import net.mcreator.howtoownadragon.procedures.GreenMaleSpawnDragonCommandTTProcedure;
import net.mcreator.howtoownadragon.procedures.GronckleBlueYellowMaleGronckleSpawnDragonCommandProcedure;
import net.mcreator.howtoownadragon.procedures.GronckleMeatlugMaleGronckleSpawnDragonCommandProcedure;
import net.mcreator.howtoownadragon.procedures.GronckleOrangeRedMaleGronckleSpawnDragonCommandProcedure;
import net.mcreator.howtoownadragon.procedures.GroncklePinkMaleGronckleSpawnDragonCommandProcedure;
import net.mcreator.howtoownadragon.procedures.JuvenileBlueYellowFemaleGronckleSpawnDragonCommandProcedure;
import net.mcreator.howtoownadragon.procedures.JuvenileGreenFemaleSpawnDragonCommandTTProcedure;
import net.mcreator.howtoownadragon.procedures.JuvenileGreenMaleSpawnDragonCommandTTProcedure;
import net.mcreator.howtoownadragon.procedures.JuvenileGronckleBlueYellowMaleGronckleSpawnDragonCommandProcedure;
import net.mcreator.howtoownadragon.procedures.JuvenileGronckleOrangeRedMaleGronckleSpawnDragonCommandProcedure;
import net.mcreator.howtoownadragon.procedures.JuvenileGroncklePinkMaleGronckleSpawnDragonCommandProcedure;
import net.mcreator.howtoownadragon.procedures.JuvenileMeatlugFemaleGronckleSpawnDragonCommandProcedure;
import net.mcreator.howtoownadragon.procedures.JuvenileMeatlugMaleGronckleSpawnDragonCommandProcedure;
import net.mcreator.howtoownadragon.procedures.JuvenilePinkFemaleGronckleSpawnDragonCommandProcedure;
import net.mcreator.howtoownadragon.procedures.JuvenilePinkFemaleSpawnDragonCommandTTProcedure;
import net.mcreator.howtoownadragon.procedures.JuvenilePinkMaleSpawnDragonCommandTTProcedure;
import net.mcreator.howtoownadragon.procedures.JuvenileTurqFemaleSpawnDragonCommandTTProcedure;
import net.mcreator.howtoownadragon.procedures.JuvenileTurqMaleSpawnDragonCommandTTProcedure;
import net.mcreator.howtoownadragon.procedures.JuviPurpleFemaleSpawnDragonCommandNadderProcedure;
import net.mcreator.howtoownadragon.procedures.JuviPurpleMaleSpawnDragonCommandNadderProcedure;
import net.mcreator.howtoownadragon.procedures.JuviRedFemaleSpawnDragonCommandNadderProcedure;
import net.mcreator.howtoownadragon.procedures.JuviRedMaleSpawnDragonCommandNadderProcedure;
import net.mcreator.howtoownadragon.procedures.JuviStormflyFemaleSpawnDragonCommandNadderProcedure;
import net.mcreator.howtoownadragon.procedures.JuviStormflyMaleSpawnDragonCommandNadderProcedure;
import net.mcreator.howtoownadragon.procedures.MeatlugFemaleGronckleSpawnDragonCommandProcedure;
import net.mcreator.howtoownadragon.procedures.OrangeRedFemaleGronckleSpawnDragonCommandProcedure;
import net.mcreator.howtoownadragon.procedures.PinkFemaleGronckleSpawnDragonCommandProcedure;
import net.mcreator.howtoownadragon.procedures.PinkFemaleSpawnDragonCommandTTProcedure;
import net.mcreator.howtoownadragon.procedures.PinkMaleSpawnDragonCommandTTProcedure;
import net.mcreator.howtoownadragon.procedures.PurpleFemaleSpawnDragonCommandNadderProcedure;
import net.mcreator.howtoownadragon.procedures.PurpleMaleSpawnDragonCommandNadderProcedure;
import net.mcreator.howtoownadragon.procedures.RedFemaleSpawnDragonCommandNadderProcedure;
import net.mcreator.howtoownadragon.procedures.RedMaleSpawnDragonCommandNadderProcedure;
import net.mcreator.howtoownadragon.procedures.StormflyFemaleSpawnDragonCommandNadderProcedure;
import net.mcreator.howtoownadragon.procedures.StormflyMaleSpawnDragonCommandNadderProcedure;
import net.mcreator.howtoownadragon.procedures.TurqFemaleSpawnDragonCommandTTProcedure;
import net.mcreator.howtoownadragon.procedures.TurqMaleSpawnDragonCommandTTProcedure;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.Commands;
import net.minecraft.core.Direction;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.entity.Entity;
import net.minecraftforge.common.util.FakePlayerFactory;
import net.minecraftforge.event.RegisterCommandsEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;

@EventBusSubscriber
public class DragonSpawnCommand {
   @SubscribeEvent
   public static void registerCommand(RegisterCommandsEvent event) {
      event.getDispatcher().register((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)Commands.m_82127_("spawndragon").requires((s) -> {
         return s.m_6761_(4);
      })).then(((LiteralArgumentBuilder)Commands.m_82127_("Gronckle").then(((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)Commands.m_82127_("male").then(((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)Commands.m_82127_("baby").then(Commands.m_82127_("pink").executes((arguments) -> {
         ServerLevel world = ((CommandSourceStack)arguments.getSource()).m_81372_();
         double x = ((CommandSourceStack)arguments.getSource()).m_81371_().m_7096_();
         double y = ((CommandSourceStack)arguments.getSource()).m_81371_().m_7098_();
         double z = ((CommandSourceStack)arguments.getSource()).m_81371_().m_7094_();
         Entity entity = ((CommandSourceStack)arguments.getSource()).m_81373_();
         if (entity == null) {
            entity = FakePlayerFactory.getMinecraft(world);
         }

         Direction direction = ((Entity)entity).m_6350_();
         BabyPinkMaleGronckleSpawnDragonCommandProcedure.execute(world, x, y, z);
         return 0;
      }))).then(Commands.m_82127_("meatlug").executes((arguments) -> {
         ServerLevel world = ((CommandSourceStack)arguments.getSource()).m_81372_();
         double x = ((CommandSourceStack)arguments.getSource()).m_81371_().m_7096_();
         double y = ((CommandSourceStack)arguments.getSource()).m_81371_().m_7098_();
         double z = ((CommandSourceStack)arguments.getSource()).m_81371_().m_7094_();
         Entity entity = ((CommandSourceStack)arguments.getSource()).m_81373_();
         if (entity == null) {
            entity = FakePlayerFactory.getMinecraft(world);
         }

         Direction direction = ((Entity)entity).m_6350_();
         BabyMeatlugMaleGronckleSpawnDragonCommandProcedure.execute(world, x, y, z);
         return 0;
      }))).then(Commands.m_82127_("orangered").executes((arguments) -> {
         ServerLevel world = ((CommandSourceStack)arguments.getSource()).m_81372_();
         double x = ((CommandSourceStack)arguments.getSource()).m_81371_().m_7096_();
         double y = ((CommandSourceStack)arguments.getSource()).m_81371_().m_7098_();
         double z = ((CommandSourceStack)arguments.getSource()).m_81371_().m_7094_();
         Entity entity = ((CommandSourceStack)arguments.getSource()).m_81373_();
         if (entity == null) {
            entity = FakePlayerFactory.getMinecraft(world);
         }

         Direction direction = ((Entity)entity).m_6350_();
         BabyOrangeRedMaleGronckleSpawnDragonCommandProcedure.execute(world, x, y, z);
         return 0;
      }))).then(Commands.m_82127_("blueyellow").executes((arguments) -> {
         ServerLevel world = ((CommandSourceStack)arguments.getSource()).m_81372_();
         double x = ((CommandSourceStack)arguments.getSource()).m_81371_().m_7096_();
         double y = ((CommandSourceStack)arguments.getSource()).m_81371_().m_7098_();
         double z = ((CommandSourceStack)arguments.getSource()).m_81371_().m_7094_();
         Entity entity = ((CommandSourceStack)arguments.getSource()).m_81373_();
         if (entity == null) {
            entity = FakePlayerFactory.getMinecraft(world);
         }

         Direction direction = ((Entity)entity).m_6350_();
         BabyBlueYellowMaleGronckleSpawnDragonCommandProcedure.execute(world, x, y, z);
         return 0;
      })))).then(((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)Commands.m_82127_("juvenile").then(Commands.m_82127_("pink").executes((arguments) -> {
         ServerLevel world = ((CommandSourceStack)arguments.getSource()).m_81372_();
         double x = ((CommandSourceStack)arguments.getSource()).m_81371_().m_7096_();
         double y = ((CommandSourceStack)arguments.getSource()).m_81371_().m_7098_();
         double z = ((CommandSourceStack)arguments.getSource()).m_81371_().m_7094_();
         Entity entity = ((CommandSourceStack)arguments.getSource()).m_81373_();
         if (entity == null) {
            entity = FakePlayerFactory.getMinecraft(world);
         }

         Direction direction = ((Entity)entity).m_6350_();
         JuvenileGroncklePinkMaleGronckleSpawnDragonCommandProcedure.execute(world, x, y, z);
         return 0;
      }))).then(Commands.m_82127_("meatlug").executes((arguments) -> {
         ServerLevel world = ((CommandSourceStack)arguments.getSource()).m_81372_();
         double x = ((CommandSourceStack)arguments.getSource()).m_81371_().m_7096_();
         double y = ((CommandSourceStack)arguments.getSource()).m_81371_().m_7098_();
         double z = ((CommandSourceStack)arguments.getSource()).m_81371_().m_7094_();
         Entity entity = ((CommandSourceStack)arguments.getSource()).m_81373_();
         if (entity == null) {
            entity = FakePlayerFactory.getMinecraft(world);
         }

         Direction direction = ((Entity)entity).m_6350_();
         JuvenileMeatlugMaleGronckleSpawnDragonCommandProcedure.execute(world, x, y, z);
         return 0;
      }))).then(Commands.m_82127_("orangered").executes((arguments) -> {
         ServerLevel world = ((CommandSourceStack)arguments.getSource()).m_81372_();
         double x = ((CommandSourceStack)arguments.getSource()).m_81371_().m_7096_();
         double y = ((CommandSourceStack)arguments.getSource()).m_81371_().m_7098_();
         double z = ((CommandSourceStack)arguments.getSource()).m_81371_().m_7094_();
         Entity entity = ((CommandSourceStack)arguments.getSource()).m_81373_();
         if (entity == null) {
            entity = FakePlayerFactory.getMinecraft(world);
         }

         Direction direction = ((Entity)entity).m_6350_();
         JuvenileGronckleOrangeRedMaleGronckleSpawnDragonCommandProcedure.execute(world, x, y, z);
         return 0;
      }))).then(Commands.m_82127_("blueyellow").executes((arguments) -> {
         ServerLevel world = ((CommandSourceStack)arguments.getSource()).m_81372_();
         double x = ((CommandSourceStack)arguments.getSource()).m_81371_().m_7096_();
         double y = ((CommandSourceStack)arguments.getSource()).m_81371_().m_7098_();
         double z = ((CommandSourceStack)arguments.getSource()).m_81371_().m_7094_();
         Entity entity = ((CommandSourceStack)arguments.getSource()).m_81373_();
         if (entity == null) {
            entity = FakePlayerFactory.getMinecraft(world);
         }

         Direction direction = ((Entity)entity).m_6350_();
         JuvenileGronckleBlueYellowMaleGronckleSpawnDragonCommandProcedure.execute(world, x, y, z);
         return 0;
      })))).then(((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)Commands.m_82127_("adolescent").then(Commands.m_82127_("meatlug").executes((arguments) -> {
         ServerLevel world = ((CommandSourceStack)arguments.getSource()).m_81372_();
         double x = ((CommandSourceStack)arguments.getSource()).m_81371_().m_7096_();
         double y = ((CommandSourceStack)arguments.getSource()).m_81371_().m_7098_();
         double z = ((CommandSourceStack)arguments.getSource()).m_81371_().m_7094_();
         Entity entity = ((CommandSourceStack)arguments.getSource()).m_81373_();
         if (entity == null) {
            entity = FakePlayerFactory.getMinecraft(world);
         }

         Direction direction = ((Entity)entity).m_6350_();
         AdolescentMeatlugMaleGronckleSpawnDragonCommandProcedure.execute(world, x, y, z);
         return 0;
      }))).then(Commands.m_82127_("pink").executes((arguments) -> {
         ServerLevel world = ((CommandSourceStack)arguments.getSource()).m_81372_();
         double x = ((CommandSourceStack)arguments.getSource()).m_81371_().m_7096_();
         double y = ((CommandSourceStack)arguments.getSource()).m_81371_().m_7098_();
         double z = ((CommandSourceStack)arguments.getSource()).m_81371_().m_7094_();
         Entity entity = ((CommandSourceStack)arguments.getSource()).m_81373_();
         if (entity == null) {
            entity = FakePlayerFactory.getMinecraft(world);
         }

         Direction direction = ((Entity)entity).m_6350_();
         AdolescentPinkMaleGronckleSpawnDragonCommandProcedure.execute(world, x, y, z);
         return 0;
      }))).then(Commands.m_82127_("orangered").executes((arguments) -> {
         ServerLevel world = ((CommandSourceStack)arguments.getSource()).m_81372_();
         double x = ((CommandSourceStack)arguments.getSource()).m_81371_().m_7096_();
         double y = ((CommandSourceStack)arguments.getSource()).m_81371_().m_7098_();
         double z = ((CommandSourceStack)arguments.getSource()).m_81371_().m_7094_();
         Entity entity = ((CommandSourceStack)arguments.getSource()).m_81373_();
         if (entity == null) {
            entity = FakePlayerFactory.getMinecraft(world);
         }

         Direction direction = ((Entity)entity).m_6350_();
         AdolescentOrangeRedMaleGronckleSpawnDragonCommandProcedure.execute(world, x, y, z);
         return 0;
      }))).then(Commands.m_82127_("blueyellow").executes((arguments) -> {
         ServerLevel world = ((CommandSourceStack)arguments.getSource()).m_81372_();
         double x = ((CommandSourceStack)arguments.getSource()).m_81371_().m_7096_();
         double y = ((CommandSourceStack)arguments.getSource()).m_81371_().m_7098_();
         double z = ((CommandSourceStack)arguments.getSource()).m_81371_().m_7094_();
         Entity entity = ((CommandSourceStack)arguments.getSource()).m_81373_();
         if (entity == null) {
            entity = FakePlayerFactory.getMinecraft(world);
         }

         Direction direction = ((Entity)entity).m_6350_();
         AdolescentBlueYellowMaleGronckleSpawnDragonCommandProcedure.execute(world, x, y, z);
         return 0;
      })))).then(((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)Commands.m_82127_("grown").then(Commands.m_82127_("meatlug").executes((arguments) -> {
         ServerLevel world = ((CommandSourceStack)arguments.getSource()).m_81372_();
         double x = ((CommandSourceStack)arguments.getSource()).m_81371_().m_7096_();
         double y = ((CommandSourceStack)arguments.getSource()).m_81371_().m_7098_();
         double z = ((CommandSourceStack)arguments.getSource()).m_81371_().m_7094_();
         Entity entity = ((CommandSourceStack)arguments.getSource()).m_81373_();
         if (entity == null) {
            entity = FakePlayerFactory.getMinecraft(world);
         }

         Direction direction = ((Entity)entity).m_6350_();
         GronckleMeatlugMaleGronckleSpawnDragonCommandProcedure.execute(world, x, y, z);
         return 0;
      }))).then(Commands.m_82127_("pink").executes((arguments) -> {
         ServerLevel world = ((CommandSourceStack)arguments.getSource()).m_81372_();
         double x = ((CommandSourceStack)arguments.getSource()).m_81371_().m_7096_();
         double y = ((CommandSourceStack)arguments.getSource()).m_81371_().m_7098_();
         double z = ((CommandSourceStack)arguments.getSource()).m_81371_().m_7094_();
         Entity entity = ((CommandSourceStack)arguments.getSource()).m_81373_();
         if (entity == null) {
            entity = FakePlayerFactory.getMinecraft(world);
         }

         Direction direction = ((Entity)entity).m_6350_();
         GroncklePinkMaleGronckleSpawnDragonCommandProcedure.execute(world, x, y, z);
         return 0;
      }))).then(Commands.m_82127_("orangered").executes((arguments) -> {
         ServerLevel world = ((CommandSourceStack)arguments.getSource()).m_81372_();
         double x = ((CommandSourceStack)arguments.getSource()).m_81371_().m_7096_();
         double y = ((CommandSourceStack)arguments.getSource()).m_81371_().m_7098_();
         double z = ((CommandSourceStack)arguments.getSource()).m_81371_().m_7094_();
         Entity entity = ((CommandSourceStack)arguments.getSource()).m_81373_();
         if (entity == null) {
            entity = FakePlayerFactory.getMinecraft(world);
         }

         Direction direction = ((Entity)entity).m_6350_();
         GronckleOrangeRedMaleGronckleSpawnDragonCommandProcedure.execute(world, x, y, z);
         return 0;
      }))).then(Commands.m_82127_("blueyellow").executes((arguments) -> {
         ServerLevel world = ((CommandSourceStack)arguments.getSource()).m_81372_();
         double x = ((CommandSourceStack)arguments.getSource()).m_81371_().m_7096_();
         double y = ((CommandSourceStack)arguments.getSource()).m_81371_().m_7098_();
         double z = ((CommandSourceStack)arguments.getSource()).m_81371_().m_7094_();
         Entity entity = ((CommandSourceStack)arguments.getSource()).m_81373_();
         if (entity == null) {
            entity = FakePlayerFactory.getMinecraft(world);
         }

         Direction direction = ((Entity)entity).m_6350_();
         GronckleBlueYellowMaleGronckleSpawnDragonCommandProcedure.execute(world, x, y, z);
         return 0;
      }))))).then(((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)Commands.m_82127_("female").then(((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)Commands.m_82127_("baby").then(Commands.m_82127_("pink").executes((arguments) -> {
         ServerLevel world = ((CommandSourceStack)arguments.getSource()).m_81372_();
         double x = ((CommandSourceStack)arguments.getSource()).m_81371_().m_7096_();
         double y = ((CommandSourceStack)arguments.getSource()).m_81371_().m_7098_();
         double z = ((CommandSourceStack)arguments.getSource()).m_81371_().m_7094_();
         Entity entity = ((CommandSourceStack)arguments.getSource()).m_81373_();
         if (entity == null) {
            entity = FakePlayerFactory.getMinecraft(world);
         }

         Direction direction = ((Entity)entity).m_6350_();
         BabyPinkFemaleGronckleSpawnDragonCommandProcedure.execute(world, x, y, z);
         return 0;
      }))).then(Commands.m_82127_("meatlug").executes((arguments) -> {
         ServerLevel world = ((CommandSourceStack)arguments.getSource()).m_81372_();
         double x = ((CommandSourceStack)arguments.getSource()).m_81371_().m_7096_();
         double y = ((CommandSourceStack)arguments.getSource()).m_81371_().m_7098_();
         double z = ((CommandSourceStack)arguments.getSource()).m_81371_().m_7094_();
         Entity entity = ((CommandSourceStack)arguments.getSource()).m_81373_();
         if (entity == null) {
            entity = FakePlayerFactory.getMinecraft(world);
         }

         Direction direction = ((Entity)entity).m_6350_();
         BabyMeatlugFemaleGronckleSpawnDragonCommandProcedure.execute(world, x, y, z);
         return 0;
      }))).then(Commands.m_82127_("orangered").executes((arguments) -> {
         ServerLevel world = ((CommandSourceStack)arguments.getSource()).m_81372_();
         double x = ((CommandSourceStack)arguments.getSource()).m_81371_().m_7096_();
         double y = ((CommandSourceStack)arguments.getSource()).m_81371_().m_7098_();
         double z = ((CommandSourceStack)arguments.getSource()).m_81371_().m_7094_();
         Entity entity = ((CommandSourceStack)arguments.getSource()).m_81373_();
         if (entity == null) {
            entity = FakePlayerFactory.getMinecraft(world);
         }

         Direction direction = ((Entity)entity).m_6350_();
         BabyOrangeRedFemaleGronckleSpawnDragonCommandProcedure.execute(world, x, y, z);
         return 0;
      }))).then(Commands.m_82127_("blueyellow").executes((arguments) -> {
         ServerLevel world = ((CommandSourceStack)arguments.getSource()).m_81372_();
         double x = ((CommandSourceStack)arguments.getSource()).m_81371_().m_7096_();
         double y = ((CommandSourceStack)arguments.getSource()).m_81371_().m_7098_();
         double z = ((CommandSourceStack)arguments.getSource()).m_81371_().m_7094_();
         Entity entity = ((CommandSourceStack)arguments.getSource()).m_81373_();
         if (entity == null) {
            entity = FakePlayerFactory.getMinecraft(world);
         }

         Direction direction = ((Entity)entity).m_6350_();
         BabyBlueYellowFemaleGronckleSpawnDragonCommandProcedure.execute(world, x, y, z);
         return 0;
      })))).then(((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)Commands.m_82127_("juvenile").then(Commands.m_82127_("pink").executes((arguments) -> {
         ServerLevel world = ((CommandSourceStack)arguments.getSource()).m_81372_();
         double x = ((CommandSourceStack)arguments.getSource()).m_81371_().m_7096_();
         double y = ((CommandSourceStack)arguments.getSource()).m_81371_().m_7098_();
         double z = ((CommandSourceStack)arguments.getSource()).m_81371_().m_7094_();
         Entity entity = ((CommandSourceStack)arguments.getSource()).m_81373_();
         if (entity == null) {
            entity = FakePlayerFactory.getMinecraft(world);
         }

         Direction direction = ((Entity)entity).m_6350_();
         JuvenilePinkFemaleGronckleSpawnDragonCommandProcedure.execute(world, x, y, z);
         return 0;
      }))).then(Commands.m_82127_("meatlug").executes((arguments) -> {
         ServerLevel world = ((CommandSourceStack)arguments.getSource()).m_81372_();
         double x = ((CommandSourceStack)arguments.getSource()).m_81371_().m_7096_();
         double y = ((CommandSourceStack)arguments.getSource()).m_81371_().m_7098_();
         double z = ((CommandSourceStack)arguments.getSource()).m_81371_().m_7094_();
         Entity entity = ((CommandSourceStack)arguments.getSource()).m_81373_();
         if (entity == null) {
            entity = FakePlayerFactory.getMinecraft(world);
         }

         Direction direction = ((Entity)entity).m_6350_();
         JuvenileMeatlugFemaleGronckleSpawnDragonCommandProcedure.execute(world, x, y, z);
         return 0;
      }))).then(Commands.m_82127_("orangered").executes((arguments) -> {
         ServerLevel world = ((CommandSourceStack)arguments.getSource()).m_81372_();
         double x = ((CommandSourceStack)arguments.getSource()).m_81371_().m_7096_();
         double y = ((CommandSourceStack)arguments.getSource()).m_81371_().m_7098_();
         double z = ((CommandSourceStack)arguments.getSource()).m_81371_().m_7094_();
         Entity entity = ((CommandSourceStack)arguments.getSource()).m_81373_();
         if (entity == null) {
            entity = FakePlayerFactory.getMinecraft(world);
         }

         Direction direction = ((Entity)entity).m_6350_();
         JuvenileBlueYellowFemaleGronckleSpawnDragonCommandProcedure.execute(world, x, y, z);
         return 0;
      }))).then(Commands.m_82127_("blueyellow").executes((arguments) -> {
         ServerLevel world = ((CommandSourceStack)arguments.getSource()).m_81372_();
         double x = ((CommandSourceStack)arguments.getSource()).m_81371_().m_7096_();
         double y = ((CommandSourceStack)arguments.getSource()).m_81371_().m_7098_();
         double z = ((CommandSourceStack)arguments.getSource()).m_81371_().m_7094_();
         Entity entity = ((CommandSourceStack)arguments.getSource()).m_81373_();
         if (entity == null) {
            entity = FakePlayerFactory.getMinecraft(world);
         }

         Direction direction = ((Entity)entity).m_6350_();
         JuvenileBlueYellowFemaleGronckleSpawnDragonCommandProcedure.execute(world, x, y, z);
         return 0;
      })))).then(((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)Commands.m_82127_("adolescent").then(Commands.m_82127_("meatlug").executes((arguments) -> {
         ServerLevel world = ((CommandSourceStack)arguments.getSource()).m_81372_();
         double x = ((CommandSourceStack)arguments.getSource()).m_81371_().m_7096_();
         double y = ((CommandSourceStack)arguments.getSource()).m_81371_().m_7098_();
         double z = ((CommandSourceStack)arguments.getSource()).m_81371_().m_7094_();
         Entity entity = ((CommandSourceStack)arguments.getSource()).m_81373_();
         if (entity == null) {
            entity = FakePlayerFactory.getMinecraft(world);
         }

         Direction direction = ((Entity)entity).m_6350_();
         AdolescentMeatlugFemaleGronckleSpawnDragonCommandProcedure.execute(world, x, y, z);
         return 0;
      }))).then(Commands.m_82127_("pink").executes((arguments) -> {
         ServerLevel world = ((CommandSourceStack)arguments.getSource()).m_81372_();
         double x = ((CommandSourceStack)arguments.getSource()).m_81371_().m_7096_();
         double y = ((CommandSourceStack)arguments.getSource()).m_81371_().m_7098_();
         double z = ((CommandSourceStack)arguments.getSource()).m_81371_().m_7094_();
         Entity entity = ((CommandSourceStack)arguments.getSource()).m_81373_();
         if (entity == null) {
            entity = FakePlayerFactory.getMinecraft(world);
         }

         Direction direction = ((Entity)entity).m_6350_();
         AdolescentPinkFemaleGronckleSpawnDragonCommandProcedure.execute(world, x, y, z);
         return 0;
      }))).then(Commands.m_82127_("orangered").executes((arguments) -> {
         ServerLevel world = ((CommandSourceStack)arguments.getSource()).m_81372_();
         double x = ((CommandSourceStack)arguments.getSource()).m_81371_().m_7096_();
         double y = ((CommandSourceStack)arguments.getSource()).m_81371_().m_7098_();
         double z = ((CommandSourceStack)arguments.getSource()).m_81371_().m_7094_();
         Entity entity = ((CommandSourceStack)arguments.getSource()).m_81373_();
         if (entity == null) {
            entity = FakePlayerFactory.getMinecraft(world);
         }

         Direction direction = ((Entity)entity).m_6350_();
         AdolescentOrangeRedFemaleGronckleSpawnDragonCommandProcedure.execute(world, x, y, z);
         return 0;
      }))).then(Commands.m_82127_("blueyellow").executes((arguments) -> {
         ServerLevel world = ((CommandSourceStack)arguments.getSource()).m_81372_();
         double x = ((CommandSourceStack)arguments.getSource()).m_81371_().m_7096_();
         double y = ((CommandSourceStack)arguments.getSource()).m_81371_().m_7098_();
         double z = ((CommandSourceStack)arguments.getSource()).m_81371_().m_7094_();
         Entity entity = ((CommandSourceStack)arguments.getSource()).m_81373_();
         if (entity == null) {
            entity = FakePlayerFactory.getMinecraft(world);
         }

         Direction direction = ((Entity)entity).m_6350_();
         AdolescentBlueYellowFemaleGronckleSpawnDragonCommandProcedure.execute(world, x, y, z);
         return 0;
      })))).then(((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)Commands.m_82127_("grown").then(Commands.m_82127_("meatlug").executes((arguments) -> {
         ServerLevel world = ((CommandSourceStack)arguments.getSource()).m_81372_();
         double x = ((CommandSourceStack)arguments.getSource()).m_81371_().m_7096_();
         double y = ((CommandSourceStack)arguments.getSource()).m_81371_().m_7098_();
         double z = ((CommandSourceStack)arguments.getSource()).m_81371_().m_7094_();
         Entity entity = ((CommandSourceStack)arguments.getSource()).m_81373_();
         if (entity == null) {
            entity = FakePlayerFactory.getMinecraft(world);
         }

         Direction direction = ((Entity)entity).m_6350_();
         MeatlugFemaleGronckleSpawnDragonCommandProcedure.execute(world, x, y, z);
         return 0;
      }))).then(Commands.m_82127_("pink").executes((arguments) -> {
         ServerLevel world = ((CommandSourceStack)arguments.getSource()).m_81372_();
         double x = ((CommandSourceStack)arguments.getSource()).m_81371_().m_7096_();
         double y = ((CommandSourceStack)arguments.getSource()).m_81371_().m_7098_();
         double z = ((CommandSourceStack)arguments.getSource()).m_81371_().m_7094_();
         Entity entity = ((CommandSourceStack)arguments.getSource()).m_81373_();
         if (entity == null) {
            entity = FakePlayerFactory.getMinecraft(world);
         }

         Direction direction = ((Entity)entity).m_6350_();
         PinkFemaleGronckleSpawnDragonCommandProcedure.execute(world, x, y, z);
         return 0;
      }))).then(Commands.m_82127_("orangered").executes((arguments) -> {
         ServerLevel world = ((CommandSourceStack)arguments.getSource()).m_81372_();
         double x = ((CommandSourceStack)arguments.getSource()).m_81371_().m_7096_();
         double y = ((CommandSourceStack)arguments.getSource()).m_81371_().m_7098_();
         double z = ((CommandSourceStack)arguments.getSource()).m_81371_().m_7094_();
         Entity entity = ((CommandSourceStack)arguments.getSource()).m_81373_();
         if (entity == null) {
            entity = FakePlayerFactory.getMinecraft(world);
         }

         Direction direction = ((Entity)entity).m_6350_();
         OrangeRedFemaleGronckleSpawnDragonCommandProcedure.execute(world, x, y, z);
         return 0;
      }))).then(Commands.m_82127_("blueyellow").executes((arguments) -> {
         ServerLevel world = ((CommandSourceStack)arguments.getSource()).m_81372_();
         double x = ((CommandSourceStack)arguments.getSource()).m_81371_().m_7096_();
         double y = ((CommandSourceStack)arguments.getSource()).m_81371_().m_7098_();
         double z = ((CommandSourceStack)arguments.getSource()).m_81371_().m_7094_();
         Entity entity = ((CommandSourceStack)arguments.getSource()).m_81373_();
         if (entity == null) {
            entity = FakePlayerFactory.getMinecraft(world);
         }

         Direction direction = ((Entity)entity).m_6350_();
         BlueYellowFemaleGronckleSpawnDragonCommandProcedure.execute(world, x, y, z);
         return 0;
      })))))).then(Commands.m_82127_("Terrible").then(((LiteralArgumentBuilder)Commands.m_82127_("Terror").then(((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)Commands.m_82127_("male").then(((LiteralArgumentBuilder)((LiteralArgumentBuilder)Commands.m_82127_("baby").then(Commands.m_82127_("pink").executes((arguments) -> {
         ServerLevel world = ((CommandSourceStack)arguments.getSource()).m_81372_();
         double x = ((CommandSourceStack)arguments.getSource()).m_81371_().m_7096_();
         double y = ((CommandSourceStack)arguments.getSource()).m_81371_().m_7098_();
         double z = ((CommandSourceStack)arguments.getSource()).m_81371_().m_7094_();
         Entity entity = ((CommandSourceStack)arguments.getSource()).m_81373_();
         if (entity == null) {
            entity = FakePlayerFactory.getMinecraft(world);
         }

         Direction direction = ((Entity)entity).m_6350_();
         BabyPinkMaleSpawnDragonCommandTTProcedure.execute(world, x, y, z);
         return 0;
      }))).then(Commands.m_82127_("green").executes((arguments) -> {
         ServerLevel world = ((CommandSourceStack)arguments.getSource()).m_81372_();
         double x = ((CommandSourceStack)arguments.getSource()).m_81371_().m_7096_();
         double y = ((CommandSourceStack)arguments.getSource()).m_81371_().m_7098_();
         double z = ((CommandSourceStack)arguments.getSource()).m_81371_().m_7094_();
         Entity entity = ((CommandSourceStack)arguments.getSource()).m_81373_();
         if (entity == null) {
            entity = FakePlayerFactory.getMinecraft(world);
         }

         Direction direction = ((Entity)entity).m_6350_();
         BabyGreenMaleSpawnDragonCommandTTProcedure.execute(world, x, y, z);
         return 0;
      }))).then(Commands.m_82127_("turq").executes((arguments) -> {
         ServerLevel world = ((CommandSourceStack)arguments.getSource()).m_81372_();
         double x = ((CommandSourceStack)arguments.getSource()).m_81371_().m_7096_();
         double y = ((CommandSourceStack)arguments.getSource()).m_81371_().m_7098_();
         double z = ((CommandSourceStack)arguments.getSource()).m_81371_().m_7094_();
         Entity entity = ((CommandSourceStack)arguments.getSource()).m_81373_();
         if (entity == null) {
            entity = FakePlayerFactory.getMinecraft(world);
         }

         Direction direction = ((Entity)entity).m_6350_();
         BabyTurqMaleSpawnDragonCommandTTProcedure.execute(world, x, y, z);
         return 0;
      })))).then(((LiteralArgumentBuilder)((LiteralArgumentBuilder)Commands.m_82127_("juvenile").then(Commands.m_82127_("pink").executes((arguments) -> {
         ServerLevel world = ((CommandSourceStack)arguments.getSource()).m_81372_();
         double x = ((CommandSourceStack)arguments.getSource()).m_81371_().m_7096_();
         double y = ((CommandSourceStack)arguments.getSource()).m_81371_().m_7098_();
         double z = ((CommandSourceStack)arguments.getSource()).m_81371_().m_7094_();
         Entity entity = ((CommandSourceStack)arguments.getSource()).m_81373_();
         if (entity == null) {
            entity = FakePlayerFactory.getMinecraft(world);
         }

         Direction direction = ((Entity)entity).m_6350_();
         JuvenilePinkMaleSpawnDragonCommandTTProcedure.execute(world, x, y, z);
         return 0;
      }))).then(Commands.m_82127_("green").executes((arguments) -> {
         ServerLevel world = ((CommandSourceStack)arguments.getSource()).m_81372_();
         double x = ((CommandSourceStack)arguments.getSource()).m_81371_().m_7096_();
         double y = ((CommandSourceStack)arguments.getSource()).m_81371_().m_7098_();
         double z = ((CommandSourceStack)arguments.getSource()).m_81371_().m_7094_();
         Entity entity = ((CommandSourceStack)arguments.getSource()).m_81373_();
         if (entity == null) {
            entity = FakePlayerFactory.getMinecraft(world);
         }

         Direction direction = ((Entity)entity).m_6350_();
         JuvenileGreenMaleSpawnDragonCommandTTProcedure.execute(world, x, y, z);
         return 0;
      }))).then(Commands.m_82127_("turq").executes((arguments) -> {
         ServerLevel world = ((CommandSourceStack)arguments.getSource()).m_81372_();
         double x = ((CommandSourceStack)arguments.getSource()).m_81371_().m_7096_();
         double y = ((CommandSourceStack)arguments.getSource()).m_81371_().m_7098_();
         double z = ((CommandSourceStack)arguments.getSource()).m_81371_().m_7094_();
         Entity entity = ((CommandSourceStack)arguments.getSource()).m_81373_();
         if (entity == null) {
            entity = FakePlayerFactory.getMinecraft(world);
         }

         Direction direction = ((Entity)entity).m_6350_();
         JuvenileTurqMaleSpawnDragonCommandTTProcedure.execute(world, x, y, z);
         return 0;
      })))).then(((LiteralArgumentBuilder)((LiteralArgumentBuilder)Commands.m_82127_("adolescent").then(Commands.m_82127_("pink").executes((arguments) -> {
         ServerLevel world = ((CommandSourceStack)arguments.getSource()).m_81372_();
         double x = ((CommandSourceStack)arguments.getSource()).m_81371_().m_7096_();
         double y = ((CommandSourceStack)arguments.getSource()).m_81371_().m_7098_();
         double z = ((CommandSourceStack)arguments.getSource()).m_81371_().m_7094_();
         Entity entity = ((CommandSourceStack)arguments.getSource()).m_81373_();
         if (entity == null) {
            entity = FakePlayerFactory.getMinecraft(world);
         }

         Direction direction = ((Entity)entity).m_6350_();
         AdolescentPinkMaleSpawnDragonCommandTTProcedure.execute(world, x, y, z);
         return 0;
      }))).then(Commands.m_82127_("green").executes((arguments) -> {
         ServerLevel world = ((CommandSourceStack)arguments.getSource()).m_81372_();
         double x = ((CommandSourceStack)arguments.getSource()).m_81371_().m_7096_();
         double y = ((CommandSourceStack)arguments.getSource()).m_81371_().m_7098_();
         double z = ((CommandSourceStack)arguments.getSource()).m_81371_().m_7094_();
         Entity entity = ((CommandSourceStack)arguments.getSource()).m_81373_();
         if (entity == null) {
            entity = FakePlayerFactory.getMinecraft(world);
         }

         Direction direction = ((Entity)entity).m_6350_();
         AdolescentGreenMaleSpawnDragonCommandTTProcedure.execute(world, x, y, z);
         return 0;
      }))).then(Commands.m_82127_("turq").executes((arguments) -> {
         ServerLevel world = ((CommandSourceStack)arguments.getSource()).m_81372_();
         double x = ((CommandSourceStack)arguments.getSource()).m_81371_().m_7096_();
         double y = ((CommandSourceStack)arguments.getSource()).m_81371_().m_7098_();
         double z = ((CommandSourceStack)arguments.getSource()).m_81371_().m_7094_();
         Entity entity = ((CommandSourceStack)arguments.getSource()).m_81373_();
         if (entity == null) {
            entity = FakePlayerFactory.getMinecraft(world);
         }

         Direction direction = ((Entity)entity).m_6350_();
         AdolescentTurqMaleSpawnDragonCommandTTProcedure.execute(world, x, y, z);
         return 0;
      })))).then(((LiteralArgumentBuilder)((LiteralArgumentBuilder)Commands.m_82127_("grown").then(Commands.m_82127_("pink").executes((arguments) -> {
         ServerLevel world = ((CommandSourceStack)arguments.getSource()).m_81372_();
         double x = ((CommandSourceStack)arguments.getSource()).m_81371_().m_7096_();
         double y = ((CommandSourceStack)arguments.getSource()).m_81371_().m_7098_();
         double z = ((CommandSourceStack)arguments.getSource()).m_81371_().m_7094_();
         Entity entity = ((CommandSourceStack)arguments.getSource()).m_81373_();
         if (entity == null) {
            entity = FakePlayerFactory.getMinecraft(world);
         }

         Direction direction = ((Entity)entity).m_6350_();
         PinkMaleSpawnDragonCommandTTProcedure.execute(world, x, y, z);
         return 0;
      }))).then(Commands.m_82127_("green").executes((arguments) -> {
         ServerLevel world = ((CommandSourceStack)arguments.getSource()).m_81372_();
         double x = ((CommandSourceStack)arguments.getSource()).m_81371_().m_7096_();
         double y = ((CommandSourceStack)arguments.getSource()).m_81371_().m_7098_();
         double z = ((CommandSourceStack)arguments.getSource()).m_81371_().m_7094_();
         Entity entity = ((CommandSourceStack)arguments.getSource()).m_81373_();
         if (entity == null) {
            entity = FakePlayerFactory.getMinecraft(world);
         }

         Direction direction = ((Entity)entity).m_6350_();
         GreenMaleSpawnDragonCommandTTProcedure.execute(world, x, y, z);
         return 0;
      }))).then(Commands.m_82127_("turq").executes((arguments) -> {
         ServerLevel world = ((CommandSourceStack)arguments.getSource()).m_81372_();
         double x = ((CommandSourceStack)arguments.getSource()).m_81371_().m_7096_();
         double y = ((CommandSourceStack)arguments.getSource()).m_81371_().m_7098_();
         double z = ((CommandSourceStack)arguments.getSource()).m_81371_().m_7094_();
         Entity entity = ((CommandSourceStack)arguments.getSource()).m_81373_();
         if (entity == null) {
            entity = FakePlayerFactory.getMinecraft(world);
         }

         Direction direction = ((Entity)entity).m_6350_();
         TurqMaleSpawnDragonCommandTTProcedure.execute(world, x, y, z);
         return 0;
      }))))).then(((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)Commands.m_82127_("female").then(((LiteralArgumentBuilder)((LiteralArgumentBuilder)Commands.m_82127_("baby").then(Commands.m_82127_("pink").executes((arguments) -> {
         ServerLevel world = ((CommandSourceStack)arguments.getSource()).m_81372_();
         double x = ((CommandSourceStack)arguments.getSource()).m_81371_().m_7096_();
         double y = ((CommandSourceStack)arguments.getSource()).m_81371_().m_7098_();
         double z = ((CommandSourceStack)arguments.getSource()).m_81371_().m_7094_();
         Entity entity = ((CommandSourceStack)arguments.getSource()).m_81373_();
         if (entity == null) {
            entity = FakePlayerFactory.getMinecraft(world);
         }

         Direction direction = ((Entity)entity).m_6350_();
         BabyPinkFemaleSpawnDragonCommandTTProcedure.execute(world, x, y, z);
         return 0;
      }))).then(Commands.m_82127_("green").executes((arguments) -> {
         ServerLevel world = ((CommandSourceStack)arguments.getSource()).m_81372_();
         double x = ((CommandSourceStack)arguments.getSource()).m_81371_().m_7096_();
         double y = ((CommandSourceStack)arguments.getSource()).m_81371_().m_7098_();
         double z = ((CommandSourceStack)arguments.getSource()).m_81371_().m_7094_();
         Entity entity = ((CommandSourceStack)arguments.getSource()).m_81373_();
         if (entity == null) {
            entity = FakePlayerFactory.getMinecraft(world);
         }

         Direction direction = ((Entity)entity).m_6350_();
         BabyGreenFemaleSpawnDragonCommandTTProcedure.execute(world, x, y, z);
         return 0;
      }))).then(Commands.m_82127_("turq").executes((arguments) -> {
         ServerLevel world = ((CommandSourceStack)arguments.getSource()).m_81372_();
         double x = ((CommandSourceStack)arguments.getSource()).m_81371_().m_7096_();
         double y = ((CommandSourceStack)arguments.getSource()).m_81371_().m_7098_();
         double z = ((CommandSourceStack)arguments.getSource()).m_81371_().m_7094_();
         Entity entity = ((CommandSourceStack)arguments.getSource()).m_81373_();
         if (entity == null) {
            entity = FakePlayerFactory.getMinecraft(world);
         }

         Direction direction = ((Entity)entity).m_6350_();
         BabyTurqFemaleSpawnDragonCommandTTProcedure.execute(world, x, y, z);
         return 0;
      })))).then(((LiteralArgumentBuilder)((LiteralArgumentBuilder)Commands.m_82127_("juvenile").then(Commands.m_82127_("pink").executes((arguments) -> {
         ServerLevel world = ((CommandSourceStack)arguments.getSource()).m_81372_();
         double x = ((CommandSourceStack)arguments.getSource()).m_81371_().m_7096_();
         double y = ((CommandSourceStack)arguments.getSource()).m_81371_().m_7098_();
         double z = ((CommandSourceStack)arguments.getSource()).m_81371_().m_7094_();
         Entity entity = ((CommandSourceStack)arguments.getSource()).m_81373_();
         if (entity == null) {
            entity = FakePlayerFactory.getMinecraft(world);
         }

         Direction direction = ((Entity)entity).m_6350_();
         JuvenilePinkFemaleSpawnDragonCommandTTProcedure.execute(world, x, y, z);
         return 0;
      }))).then(Commands.m_82127_("green").executes((arguments) -> {
         ServerLevel world = ((CommandSourceStack)arguments.getSource()).m_81372_();
         double x = ((CommandSourceStack)arguments.getSource()).m_81371_().m_7096_();
         double y = ((CommandSourceStack)arguments.getSource()).m_81371_().m_7098_();
         double z = ((CommandSourceStack)arguments.getSource()).m_81371_().m_7094_();
         Entity entity = ((CommandSourceStack)arguments.getSource()).m_81373_();
         if (entity == null) {
            entity = FakePlayerFactory.getMinecraft(world);
         }

         Direction direction = ((Entity)entity).m_6350_();
         JuvenileGreenFemaleSpawnDragonCommandTTProcedure.execute(world, x, y, z);
         return 0;
      }))).then(Commands.m_82127_("turq").executes((arguments) -> {
         ServerLevel world = ((CommandSourceStack)arguments.getSource()).m_81372_();
         double x = ((CommandSourceStack)arguments.getSource()).m_81371_().m_7096_();
         double y = ((CommandSourceStack)arguments.getSource()).m_81371_().m_7098_();
         double z = ((CommandSourceStack)arguments.getSource()).m_81371_().m_7094_();
         Entity entity = ((CommandSourceStack)arguments.getSource()).m_81373_();
         if (entity == null) {
            entity = FakePlayerFactory.getMinecraft(world);
         }

         Direction direction = ((Entity)entity).m_6350_();
         JuvenileTurqFemaleSpawnDragonCommandTTProcedure.execute(world, x, y, z);
         return 0;
      })))).then(((LiteralArgumentBuilder)((LiteralArgumentBuilder)Commands.m_82127_("adolescent").then(Commands.m_82127_("pink").executes((arguments) -> {
         ServerLevel world = ((CommandSourceStack)arguments.getSource()).m_81372_();
         double x = ((CommandSourceStack)arguments.getSource()).m_81371_().m_7096_();
         double y = ((CommandSourceStack)arguments.getSource()).m_81371_().m_7098_();
         double z = ((CommandSourceStack)arguments.getSource()).m_81371_().m_7094_();
         Entity entity = ((CommandSourceStack)arguments.getSource()).m_81373_();
         if (entity == null) {
            entity = FakePlayerFactory.getMinecraft(world);
         }

         Direction direction = ((Entity)entity).m_6350_();
         AdolescentPinkFemaleSpawnDragonCommandTTProcedure.execute(world, x, y, z);
         return 0;
      }))).then(Commands.m_82127_("green").executes((arguments) -> {
         ServerLevel world = ((CommandSourceStack)arguments.getSource()).m_81372_();
         double x = ((CommandSourceStack)arguments.getSource()).m_81371_().m_7096_();
         double y = ((CommandSourceStack)arguments.getSource()).m_81371_().m_7098_();
         double z = ((CommandSourceStack)arguments.getSource()).m_81371_().m_7094_();
         Entity entity = ((CommandSourceStack)arguments.getSource()).m_81373_();
         if (entity == null) {
            entity = FakePlayerFactory.getMinecraft(world);
         }

         Direction direction = ((Entity)entity).m_6350_();
         AdolescentGreenFemaleSpawnDragonCommandTTProcedure.execute(world, x, y, z);
         return 0;
      }))).then(Commands.m_82127_("turq").executes((arguments) -> {
         ServerLevel world = ((CommandSourceStack)arguments.getSource()).m_81372_();
         double x = ((CommandSourceStack)arguments.getSource()).m_81371_().m_7096_();
         double y = ((CommandSourceStack)arguments.getSource()).m_81371_().m_7098_();
         double z = ((CommandSourceStack)arguments.getSource()).m_81371_().m_7094_();
         Entity entity = ((CommandSourceStack)arguments.getSource()).m_81373_();
         if (entity == null) {
            entity = FakePlayerFactory.getMinecraft(world);
         }

         Direction direction = ((Entity)entity).m_6350_();
         AdolescentTurqFemaleSpawnDragonCommandTTProcedure.execute(world, x, y, z);
         return 0;
      })))).then(((LiteralArgumentBuilder)((LiteralArgumentBuilder)Commands.m_82127_("grown").then(Commands.m_82127_("pink").executes((arguments) -> {
         ServerLevel world = ((CommandSourceStack)arguments.getSource()).m_81372_();
         double x = ((CommandSourceStack)arguments.getSource()).m_81371_().m_7096_();
         double y = ((CommandSourceStack)arguments.getSource()).m_81371_().m_7098_();
         double z = ((CommandSourceStack)arguments.getSource()).m_81371_().m_7094_();
         Entity entity = ((CommandSourceStack)arguments.getSource()).m_81373_();
         if (entity == null) {
            entity = FakePlayerFactory.getMinecraft(world);
         }

         Direction direction = ((Entity)entity).m_6350_();
         PinkFemaleSpawnDragonCommandTTProcedure.execute(world, x, y, z);
         return 0;
      }))).then(Commands.m_82127_("green").executes((arguments) -> {
         ServerLevel world = ((CommandSourceStack)arguments.getSource()).m_81372_();
         double x = ((CommandSourceStack)arguments.getSource()).m_81371_().m_7096_();
         double y = ((CommandSourceStack)arguments.getSource()).m_81371_().m_7098_();
         double z = ((CommandSourceStack)arguments.getSource()).m_81371_().m_7094_();
         Entity entity = ((CommandSourceStack)arguments.getSource()).m_81373_();
         if (entity == null) {
            entity = FakePlayerFactory.getMinecraft(world);
         }

         Direction direction = ((Entity)entity).m_6350_();
         GreenFemaleSpawnDragonCommandTTProcedure.execute(world, x, y, z);
         return 0;
      }))).then(Commands.m_82127_("turq").executes((arguments) -> {
         ServerLevel world = ((CommandSourceStack)arguments.getSource()).m_81372_();
         double x = ((CommandSourceStack)arguments.getSource()).m_81371_().m_7096_();
         double y = ((CommandSourceStack)arguments.getSource()).m_81371_().m_7098_();
         double z = ((CommandSourceStack)arguments.getSource()).m_81371_().m_7094_();
         Entity entity = ((CommandSourceStack)arguments.getSource()).m_81373_();
         if (entity == null) {
            entity = FakePlayerFactory.getMinecraft(world);
         }

         Direction direction = ((Entity)entity).m_6350_();
         TurqFemaleSpawnDragonCommandTTProcedure.execute(world, x, y, z);
         return 0;
      }))))))).then(Commands.m_82127_("Deadly").then(((LiteralArgumentBuilder)Commands.m_82127_("Nadder").then(((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)Commands.m_82127_("male").then(((LiteralArgumentBuilder)((LiteralArgumentBuilder)Commands.m_82127_("baby").then(Commands.m_82127_("stormfly").executes((arguments) -> {
         ServerLevel world = ((CommandSourceStack)arguments.getSource()).m_81372_();
         double x = ((CommandSourceStack)arguments.getSource()).m_81371_().m_7096_();
         double y = ((CommandSourceStack)arguments.getSource()).m_81371_().m_7098_();
         double z = ((CommandSourceStack)arguments.getSource()).m_81371_().m_7094_();
         Entity entity = ((CommandSourceStack)arguments.getSource()).m_81373_();
         if (entity == null) {
            entity = FakePlayerFactory.getMinecraft(world);
         }

         Direction direction = ((Entity)entity).m_6350_();
         BabyStormflyMaleSpawnDragonCommandNadderProcedure.execute(world, x, y, z);
         return 0;
      }))).then(Commands.m_82127_("red").executes((arguments) -> {
         ServerLevel world = ((CommandSourceStack)arguments.getSource()).m_81372_();
         double x = ((CommandSourceStack)arguments.getSource()).m_81371_().m_7096_();
         double y = ((CommandSourceStack)arguments.getSource()).m_81371_().m_7098_();
         double z = ((CommandSourceStack)arguments.getSource()).m_81371_().m_7094_();
         Entity entity = ((CommandSourceStack)arguments.getSource()).m_81373_();
         if (entity == null) {
            entity = FakePlayerFactory.getMinecraft(world);
         }

         Direction direction = ((Entity)entity).m_6350_();
         BabyRedMaleSpawnDragonCommandNadderProcedure.execute(world, x, y, z);
         return 0;
      }))).then(Commands.m_82127_("purple").executes((arguments) -> {
         ServerLevel world = ((CommandSourceStack)arguments.getSource()).m_81372_();
         double x = ((CommandSourceStack)arguments.getSource()).m_81371_().m_7096_();
         double y = ((CommandSourceStack)arguments.getSource()).m_81371_().m_7098_();
         double z = ((CommandSourceStack)arguments.getSource()).m_81371_().m_7094_();
         Entity entity = ((CommandSourceStack)arguments.getSource()).m_81373_();
         if (entity == null) {
            entity = FakePlayerFactory.getMinecraft(world);
         }

         Direction direction = ((Entity)entity).m_6350_();
         BabyPurpleMaleSpawnDragonCommandNadderProcedure.execute(world, x, y, z);
         return 0;
      })))).then(((LiteralArgumentBuilder)((LiteralArgumentBuilder)Commands.m_82127_("juvenile").then(Commands.m_82127_("stormfly").executes((arguments) -> {
         ServerLevel world = ((CommandSourceStack)arguments.getSource()).m_81372_();
         double x = ((CommandSourceStack)arguments.getSource()).m_81371_().m_7096_();
         double y = ((CommandSourceStack)arguments.getSource()).m_81371_().m_7098_();
         double z = ((CommandSourceStack)arguments.getSource()).m_81371_().m_7094_();
         Entity entity = ((CommandSourceStack)arguments.getSource()).m_81373_();
         if (entity == null) {
            entity = FakePlayerFactory.getMinecraft(world);
         }

         Direction direction = ((Entity)entity).m_6350_();
         JuviStormflyMaleSpawnDragonCommandNadderProcedure.execute(world, x, y, z);
         return 0;
      }))).then(Commands.m_82127_("red").executes((arguments) -> {
         ServerLevel world = ((CommandSourceStack)arguments.getSource()).m_81372_();
         double x = ((CommandSourceStack)arguments.getSource()).m_81371_().m_7096_();
         double y = ((CommandSourceStack)arguments.getSource()).m_81371_().m_7098_();
         double z = ((CommandSourceStack)arguments.getSource()).m_81371_().m_7094_();
         Entity entity = ((CommandSourceStack)arguments.getSource()).m_81373_();
         if (entity == null) {
            entity = FakePlayerFactory.getMinecraft(world);
         }

         Direction direction = ((Entity)entity).m_6350_();
         JuviRedMaleSpawnDragonCommandNadderProcedure.execute(world, x, y, z);
         return 0;
      }))).then(Commands.m_82127_("purple").executes((arguments) -> {
         ServerLevel world = ((CommandSourceStack)arguments.getSource()).m_81372_();
         double x = ((CommandSourceStack)arguments.getSource()).m_81371_().m_7096_();
         double y = ((CommandSourceStack)arguments.getSource()).m_81371_().m_7098_();
         double z = ((CommandSourceStack)arguments.getSource()).m_81371_().m_7094_();
         Entity entity = ((CommandSourceStack)arguments.getSource()).m_81373_();
         if (entity == null) {
            entity = FakePlayerFactory.getMinecraft(world);
         }

         Direction direction = ((Entity)entity).m_6350_();
         JuviPurpleMaleSpawnDragonCommandNadderProcedure.execute(world, x, y, z);
         return 0;
      })))).then(((LiteralArgumentBuilder)((LiteralArgumentBuilder)Commands.m_82127_("adolescent").then(Commands.m_82127_("stormfly").executes((arguments) -> {
         ServerLevel world = ((CommandSourceStack)arguments.getSource()).m_81372_();
         double x = ((CommandSourceStack)arguments.getSource()).m_81371_().m_7096_();
         double y = ((CommandSourceStack)arguments.getSource()).m_81371_().m_7098_();
         double z = ((CommandSourceStack)arguments.getSource()).m_81371_().m_7094_();
         Entity entity = ((CommandSourceStack)arguments.getSource()).m_81373_();
         if (entity == null) {
            entity = FakePlayerFactory.getMinecraft(world);
         }

         Direction direction = ((Entity)entity).m_6350_();
         AdoStormflyMaleSpawnDragonCommandNadderProcedure.execute(world, x, y, z);
         return 0;
      }))).then(Commands.m_82127_("red").executes((arguments) -> {
         ServerLevel world = ((CommandSourceStack)arguments.getSource()).m_81372_();
         double x = ((CommandSourceStack)arguments.getSource()).m_81371_().m_7096_();
         double y = ((CommandSourceStack)arguments.getSource()).m_81371_().m_7098_();
         double z = ((CommandSourceStack)arguments.getSource()).m_81371_().m_7094_();
         Entity entity = ((CommandSourceStack)arguments.getSource()).m_81373_();
         if (entity == null) {
            entity = FakePlayerFactory.getMinecraft(world);
         }

         Direction direction = ((Entity)entity).m_6350_();
         AdoRedMaleSpawnDragonCommandNadderProcedure.execute(world, x, y, z);
         return 0;
      }))).then(Commands.m_82127_("purple").executes((arguments) -> {
         ServerLevel world = ((CommandSourceStack)arguments.getSource()).m_81372_();
         double x = ((CommandSourceStack)arguments.getSource()).m_81371_().m_7096_();
         double y = ((CommandSourceStack)arguments.getSource()).m_81371_().m_7098_();
         double z = ((CommandSourceStack)arguments.getSource()).m_81371_().m_7094_();
         Entity entity = ((CommandSourceStack)arguments.getSource()).m_81373_();
         if (entity == null) {
            entity = FakePlayerFactory.getMinecraft(world);
         }

         Direction direction = ((Entity)entity).m_6350_();
         AdoPurpleMaleSpawnDragonCommandNadderProcedure.execute(world, x, y, z);
         return 0;
      })))).then(((LiteralArgumentBuilder)((LiteralArgumentBuilder)Commands.m_82127_("grown").then(Commands.m_82127_("stormfly").executes((arguments) -> {
         ServerLevel world = ((CommandSourceStack)arguments.getSource()).m_81372_();
         double x = ((CommandSourceStack)arguments.getSource()).m_81371_().m_7096_();
         double y = ((CommandSourceStack)arguments.getSource()).m_81371_().m_7098_();
         double z = ((CommandSourceStack)arguments.getSource()).m_81371_().m_7094_();
         Entity entity = ((CommandSourceStack)arguments.getSource()).m_81373_();
         if (entity == null) {
            entity = FakePlayerFactory.getMinecraft(world);
         }

         Direction direction = ((Entity)entity).m_6350_();
         StormflyMaleSpawnDragonCommandNadderProcedure.execute(world, x, y, z);
         return 0;
      }))).then(Commands.m_82127_("red").executes((arguments) -> {
         ServerLevel world = ((CommandSourceStack)arguments.getSource()).m_81372_();
         double x = ((CommandSourceStack)arguments.getSource()).m_81371_().m_7096_();
         double y = ((CommandSourceStack)arguments.getSource()).m_81371_().m_7098_();
         double z = ((CommandSourceStack)arguments.getSource()).m_81371_().m_7094_();
         Entity entity = ((CommandSourceStack)arguments.getSource()).m_81373_();
         if (entity == null) {
            entity = FakePlayerFactory.getMinecraft(world);
         }

         Direction direction = ((Entity)entity).m_6350_();
         RedMaleSpawnDragonCommandNadderProcedure.execute(world, x, y, z);
         return 0;
      }))).then(Commands.m_82127_("purple").executes((arguments) -> {
         ServerLevel world = ((CommandSourceStack)arguments.getSource()).m_81372_();
         double x = ((CommandSourceStack)arguments.getSource()).m_81371_().m_7096_();
         double y = ((CommandSourceStack)arguments.getSource()).m_81371_().m_7098_();
         double z = ((CommandSourceStack)arguments.getSource()).m_81371_().m_7094_();
         Entity entity = ((CommandSourceStack)arguments.getSource()).m_81373_();
         if (entity == null) {
            entity = FakePlayerFactory.getMinecraft(world);
         }

         Direction direction = ((Entity)entity).m_6350_();
         PurpleMaleSpawnDragonCommandNadderProcedure.execute(world, x, y, z);
         return 0;
      }))))).then(((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)Commands.m_82127_("female").then(((LiteralArgumentBuilder)((LiteralArgumentBuilder)Commands.m_82127_("baby").then(Commands.m_82127_("stormfly").executes((arguments) -> {
         ServerLevel world = ((CommandSourceStack)arguments.getSource()).m_81372_();
         double x = ((CommandSourceStack)arguments.getSource()).m_81371_().m_7096_();
         double y = ((CommandSourceStack)arguments.getSource()).m_81371_().m_7098_();
         double z = ((CommandSourceStack)arguments.getSource()).m_81371_().m_7094_();
         Entity entity = ((CommandSourceStack)arguments.getSource()).m_81373_();
         if (entity == null) {
            entity = FakePlayerFactory.getMinecraft(world);
         }

         Direction direction = ((Entity)entity).m_6350_();
         BabyStormflyFemaleSpawnDragonCommandNadderProcedure.execute(world, x, y, z);
         return 0;
      }))).then(Commands.m_82127_("red").executes((arguments) -> {
         ServerLevel world = ((CommandSourceStack)arguments.getSource()).m_81372_();
         double x = ((CommandSourceStack)arguments.getSource()).m_81371_().m_7096_();
         double y = ((CommandSourceStack)arguments.getSource()).m_81371_().m_7098_();
         double z = ((CommandSourceStack)arguments.getSource()).m_81371_().m_7094_();
         Entity entity = ((CommandSourceStack)arguments.getSource()).m_81373_();
         if (entity == null) {
            entity = FakePlayerFactory.getMinecraft(world);
         }

         Direction direction = ((Entity)entity).m_6350_();
         BabyRedFemaleSpawnDragonCommandNadderProcedure.execute(world, x, y, z);
         return 0;
      }))).then(Commands.m_82127_("purple").executes((arguments) -> {
         ServerLevel world = ((CommandSourceStack)arguments.getSource()).m_81372_();
         double x = ((CommandSourceStack)arguments.getSource()).m_81371_().m_7096_();
         double y = ((CommandSourceStack)arguments.getSource()).m_81371_().m_7098_();
         double z = ((CommandSourceStack)arguments.getSource()).m_81371_().m_7094_();
         Entity entity = ((CommandSourceStack)arguments.getSource()).m_81373_();
         if (entity == null) {
            entity = FakePlayerFactory.getMinecraft(world);
         }

         Direction direction = ((Entity)entity).m_6350_();
         BabyPurpleFemaleSpawnDragonCommandNadderProcedure.execute(world, x, y, z);
         return 0;
      })))).then(((LiteralArgumentBuilder)((LiteralArgumentBuilder)Commands.m_82127_("juvenile").then(Commands.m_82127_("stormfly").executes((arguments) -> {
         ServerLevel world = ((CommandSourceStack)arguments.getSource()).m_81372_();
         double x = ((CommandSourceStack)arguments.getSource()).m_81371_().m_7096_();
         double y = ((CommandSourceStack)arguments.getSource()).m_81371_().m_7098_();
         double z = ((CommandSourceStack)arguments.getSource()).m_81371_().m_7094_();
         Entity entity = ((CommandSourceStack)arguments.getSource()).m_81373_();
         if (entity == null) {
            entity = FakePlayerFactory.getMinecraft(world);
         }

         Direction direction = ((Entity)entity).m_6350_();
         JuviStormflyFemaleSpawnDragonCommandNadderProcedure.execute(world, x, y, z);
         return 0;
      }))).then(Commands.m_82127_("red").executes((arguments) -> {
         ServerLevel world = ((CommandSourceStack)arguments.getSource()).m_81372_();
         double x = ((CommandSourceStack)arguments.getSource()).m_81371_().m_7096_();
         double y = ((CommandSourceStack)arguments.getSource()).m_81371_().m_7098_();
         double z = ((CommandSourceStack)arguments.getSource()).m_81371_().m_7094_();
         Entity entity = ((CommandSourceStack)arguments.getSource()).m_81373_();
         if (entity == null) {
            entity = FakePlayerFactory.getMinecraft(world);
         }

         Direction direction = ((Entity)entity).m_6350_();
         JuviRedFemaleSpawnDragonCommandNadderProcedure.execute(world, x, y, z);
         return 0;
      }))).then(Commands.m_82127_("purple").executes((arguments) -> {
         ServerLevel world = ((CommandSourceStack)arguments.getSource()).m_81372_();
         double x = ((CommandSourceStack)arguments.getSource()).m_81371_().m_7096_();
         double y = ((CommandSourceStack)arguments.getSource()).m_81371_().m_7098_();
         double z = ((CommandSourceStack)arguments.getSource()).m_81371_().m_7094_();
         Entity entity = ((CommandSourceStack)arguments.getSource()).m_81373_();
         if (entity == null) {
            entity = FakePlayerFactory.getMinecraft(world);
         }

         Direction direction = ((Entity)entity).m_6350_();
         JuviPurpleFemaleSpawnDragonCommandNadderProcedure.execute(world, x, y, z);
         return 0;
      })))).then(((LiteralArgumentBuilder)((LiteralArgumentBuilder)Commands.m_82127_("adolescent").then(Commands.m_82127_("stormfly").executes((arguments) -> {
         ServerLevel world = ((CommandSourceStack)arguments.getSource()).m_81372_();
         double x = ((CommandSourceStack)arguments.getSource()).m_81371_().m_7096_();
         double y = ((CommandSourceStack)arguments.getSource()).m_81371_().m_7098_();
         double z = ((CommandSourceStack)arguments.getSource()).m_81371_().m_7094_();
         Entity entity = ((CommandSourceStack)arguments.getSource()).m_81373_();
         if (entity == null) {
            entity = FakePlayerFactory.getMinecraft(world);
         }

         Direction direction = ((Entity)entity).m_6350_();
         AdoStormflyFemaleSpawnDragonCommandNadderProcedure.execute(world, x, y, z);
         return 0;
      }))).then(Commands.m_82127_("red").executes((arguments) -> {
         ServerLevel world = ((CommandSourceStack)arguments.getSource()).m_81372_();
         double x = ((CommandSourceStack)arguments.getSource()).m_81371_().m_7096_();
         double y = ((CommandSourceStack)arguments.getSource()).m_81371_().m_7098_();
         double z = ((CommandSourceStack)arguments.getSource()).m_81371_().m_7094_();
         Entity entity = ((CommandSourceStack)arguments.getSource()).m_81373_();
         if (entity == null) {
            entity = FakePlayerFactory.getMinecraft(world);
         }

         Direction direction = ((Entity)entity).m_6350_();
         AdoRedFemaleSpawnDragonCommandNadderProcedure.execute(world, x, y, z);
         return 0;
      }))).then(Commands.m_82127_("purple").executes((arguments) -> {
         ServerLevel world = ((CommandSourceStack)arguments.getSource()).m_81372_();
         double x = ((CommandSourceStack)arguments.getSource()).m_81371_().m_7096_();
         double y = ((CommandSourceStack)arguments.getSource()).m_81371_().m_7098_();
         double z = ((CommandSourceStack)arguments.getSource()).m_81371_().m_7094_();
         Entity entity = ((CommandSourceStack)arguments.getSource()).m_81373_();
         if (entity == null) {
            entity = FakePlayerFactory.getMinecraft(world);
         }

         Direction direction = ((Entity)entity).m_6350_();
         AdoPurpleFemaleSpawnDragonCommandNadderProcedure.execute(world, x, y, z);
         return 0;
      })))).then(((LiteralArgumentBuilder)((LiteralArgumentBuilder)Commands.m_82127_("grown").then(Commands.m_82127_("stormfly").executes((arguments) -> {
         ServerLevel world = ((CommandSourceStack)arguments.getSource()).m_81372_();
         double x = ((CommandSourceStack)arguments.getSource()).m_81371_().m_7096_();
         double y = ((CommandSourceStack)arguments.getSource()).m_81371_().m_7098_();
         double z = ((CommandSourceStack)arguments.getSource()).m_81371_().m_7094_();
         Entity entity = ((CommandSourceStack)arguments.getSource()).m_81373_();
         if (entity == null) {
            entity = FakePlayerFactory.getMinecraft(world);
         }

         Direction direction = ((Entity)entity).m_6350_();
         StormflyFemaleSpawnDragonCommandNadderProcedure.execute(world, x, y, z);
         return 0;
      }))).then(Commands.m_82127_("red").executes((arguments) -> {
         ServerLevel world = ((CommandSourceStack)arguments.getSource()).m_81372_();
         double x = ((CommandSourceStack)arguments.getSource()).m_81371_().m_7096_();
         double y = ((CommandSourceStack)arguments.getSource()).m_81371_().m_7098_();
         double z = ((CommandSourceStack)arguments.getSource()).m_81371_().m_7094_();
         Entity entity = ((CommandSourceStack)arguments.getSource()).m_81373_();
         if (entity == null) {
            entity = FakePlayerFactory.getMinecraft(world);
         }

         Direction direction = ((Entity)entity).m_6350_();
         RedFemaleSpawnDragonCommandNadderProcedure.execute(world, x, y, z);
         return 0;
      }))).then(Commands.m_82127_("purple").executes((arguments) -> {
         ServerLevel world = ((CommandSourceStack)arguments.getSource()).m_81372_();
         double x = ((CommandSourceStack)arguments.getSource()).m_81371_().m_7096_();
         double y = ((CommandSourceStack)arguments.getSource()).m_81371_().m_7098_();
         double z = ((CommandSourceStack)arguments.getSource()).m_81371_().m_7094_();
         Entity entity = ((CommandSourceStack)arguments.getSource()).m_81373_();
         if (entity == null) {
            entity = FakePlayerFactory.getMinecraft(world);
         }

         Direction direction = ((Entity)entity).m_6350_();
         PurpleFemaleSpawnDragonCommandNadderProcedure.execute(world, x, y, z);
         return 0;
      })))))));
   }
}
