package net.mcreator.howtoownadragon.network;

import java.util.HashMap;
import java.util.function.Supplier;
import net.mcreator.howtoownadragon.HowToOwnADragonMod;
import net.mcreator.howtoownadragon.procedures.Incubator1HatchButtonProcedure;
import net.mcreator.howtoownadragon.world.inventory.Incubator1GUIMenu;
import net.minecraft.core.BlockPos;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.network.NetworkEvent.Context;

@EventBusSubscriber(
   bus = Bus.MOD
)
public class Incubator1GUIButtonMessage {
   private final int buttonID;
   private final int x;
   private final int y;
   private final int z;

   public Incubator1GUIButtonMessage(FriendlyByteBuf buffer) {
      this.buttonID = buffer.readInt();
      this.x = buffer.readInt();
      this.y = buffer.readInt();
      this.z = buffer.readInt();
   }

   public Incubator1GUIButtonMessage(int buttonID, int x, int y, int z) {
      this.buttonID = buttonID;
      this.x = x;
      this.y = y;
      this.z = z;
   }

   public static void buffer(Incubator1GUIButtonMessage message, FriendlyByteBuf buffer) {
      buffer.writeInt(message.buttonID);
      buffer.writeInt(message.x);
      buffer.writeInt(message.y);
      buffer.writeInt(message.z);
   }

   public static void handler(Incubator1GUIButtonMessage message, Supplier<Context> contextSupplier) {
      Context context = (Context)contextSupplier.get();
      context.enqueueWork(() -> {
         Player entity = context.getSender();
         int buttonID = message.buttonID;
         int x = message.x;
         int y = message.y;
         int z = message.z;
         handleButtonAction(entity, buttonID, x, y, z);
      });
      context.setPacketHandled(true);
   }

   public static void handleButtonAction(Player entity, int buttonID, int x, int y, int z) {
      Level world = entity.f_19853_;
      HashMap guistate = Incubator1GUIMenu.guistate;
      if (world.m_46805_(new BlockPos(x, y, z))) {
         if (buttonID == 0) {
            Incubator1HatchButtonProcedure.execute(world, (double)x, (double)y, (double)z);
         }

      }
   }

   @SubscribeEvent
   public static void registerMessage(FMLCommonSetupEvent event) {
      HowToOwnADragonMod.addNetworkMessage(Incubator1GUIButtonMessage.class, Incubator1GUIButtonMessage::buffer, Incubator1GUIButtonMessage::new, Incubator1GUIButtonMessage::handler);
   }
}
