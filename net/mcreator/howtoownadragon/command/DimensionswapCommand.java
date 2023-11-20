package net.mcreator.howtoownadragon.command;

import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import net.mcreator.howtoownadragon.procedures.TpToEndProcedure;
import net.mcreator.howtoownadragon.procedures.TpToHwProcedure;
import net.mcreator.howtoownadragon.procedures.TpToNetherProcedure;
import net.mcreator.howtoownadragon.procedures.TpToOverworld2Procedure;
import net.mcreator.howtoownadragon.procedures.TpToVanillaOverworldProcedure;
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
public class DimensionswapCommand {
   @SubscribeEvent
   public static void registerCommand(RegisterCommandsEvent event) {
      event.getDispatcher().register((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)Commands.m_82127_("dimensionswap").requires((s) -> {
         return s.m_6761_(4);
      })).then(Commands.m_82127_("Overworld").executes((arguments) -> {
         ServerLevel world = ((CommandSourceStack)arguments.getSource()).m_81372_();
         double x = ((CommandSourceStack)arguments.getSource()).m_81371_().m_7096_();
         double y = ((CommandSourceStack)arguments.getSource()).m_81371_().m_7098_();
         double z = ((CommandSourceStack)arguments.getSource()).m_81371_().m_7094_();
         Entity entity = ((CommandSourceStack)arguments.getSource()).m_81373_();
         if (entity == null) {
            entity = FakePlayerFactory.getMinecraft(world);
         }

         Direction direction = ((Entity)entity).m_6350_();
         TpToVanillaOverworldProcedure.execute((Entity)entity);
         return 0;
      }))).then(Commands.m_82127_("Overworld2").executes((arguments) -> {
         ServerLevel world = ((CommandSourceStack)arguments.getSource()).m_81372_();
         double x = ((CommandSourceStack)arguments.getSource()).m_81371_().m_7096_();
         double y = ((CommandSourceStack)arguments.getSource()).m_81371_().m_7098_();
         double z = ((CommandSourceStack)arguments.getSource()).m_81371_().m_7094_();
         Entity entity = ((CommandSourceStack)arguments.getSource()).m_81373_();
         if (entity == null) {
            entity = FakePlayerFactory.getMinecraft(world);
         }

         Direction direction = ((Entity)entity).m_6350_();
         TpToOverworld2Procedure.execute((Entity)entity);
         return 0;
      }))).then(Commands.m_82127_("Nether").executes((arguments) -> {
         ServerLevel world = ((CommandSourceStack)arguments.getSource()).m_81372_();
         double x = ((CommandSourceStack)arguments.getSource()).m_81371_().m_7096_();
         double y = ((CommandSourceStack)arguments.getSource()).m_81371_().m_7098_();
         double z = ((CommandSourceStack)arguments.getSource()).m_81371_().m_7094_();
         Entity entity = ((CommandSourceStack)arguments.getSource()).m_81373_();
         if (entity == null) {
            entity = FakePlayerFactory.getMinecraft(world);
         }

         Direction direction = ((Entity)entity).m_6350_();
         TpToNetherProcedure.execute((Entity)entity);
         return 0;
      }))).then(Commands.m_82127_("End").executes((arguments) -> {
         ServerLevel world = ((CommandSourceStack)arguments.getSource()).m_81372_();
         double x = ((CommandSourceStack)arguments.getSource()).m_81371_().m_7096_();
         double y = ((CommandSourceStack)arguments.getSource()).m_81371_().m_7098_();
         double z = ((CommandSourceStack)arguments.getSource()).m_81371_().m_7094_();
         Entity entity = ((CommandSourceStack)arguments.getSource()).m_81373_();
         if (entity == null) {
            entity = FakePlayerFactory.getMinecraft(world);
         }

         Direction direction = ((Entity)entity).m_6350_();
         TpToEndProcedure.execute((Entity)entity);
         return 0;
      }))).then(Commands.m_82127_("Hidden_World").executes((arguments) -> {
         ServerLevel world = ((CommandSourceStack)arguments.getSource()).m_81372_();
         double x = ((CommandSourceStack)arguments.getSource()).m_81371_().m_7096_();
         double y = ((CommandSourceStack)arguments.getSource()).m_81371_().m_7098_();
         double z = ((CommandSourceStack)arguments.getSource()).m_81371_().m_7094_();
         Entity entity = ((CommandSourceStack)arguments.getSource()).m_81373_();
         if (entity == null) {
            entity = FakePlayerFactory.getMinecraft(world);
         }

         Direction direction = ((Entity)entity).m_6350_();
         TpToHwProcedure.execute((Entity)entity);
         return 0;
      })));
   }
}
