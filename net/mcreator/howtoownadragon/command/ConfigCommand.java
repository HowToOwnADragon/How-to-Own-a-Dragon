package net.mcreator.howtoownadragon.command;

import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import net.minecraft.commands.Commands;
import net.minecraftforge.event.RegisterCommandsEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;

@EventBusSubscriber
public class ConfigCommand {
   @SubscribeEvent
   public static void registerCommand(RegisterCommandsEvent event) {
      event.getDispatcher().register((LiteralArgumentBuilder)Commands.m_82127_("config").requires((s) -> {
         return s.m_6761_(4);
      }));
   }
}
