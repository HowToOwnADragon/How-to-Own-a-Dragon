package net.mcreator.howtoownadragon.network;

import java.util.HashMap;
import java.util.function.Supplier;
import net.mcreator.howtoownadragon.HowToOwnADragonMod;
import net.mcreator.howtoownadragon.procedures.ButtonPressedGronckleIronGUIFemaleProcedure;
import net.mcreator.howtoownadragon.world.inventory.GronckleIronGUIFemaleMenu;
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
public class GronckleIronGUIFemaleButtonMessage {
   private final int buttonID;
   private final int x;
   private final int y;
   private final int z;

   public GronckleIronGUIFemaleButtonMessage(FriendlyByteBuf buffer) {
      this.buttonID = buffer.readInt();
      this.x = buffer.readInt();
      this.y = buffer.readInt();
      this.z = buffer.readInt();
   }

   public GronckleIronGUIFemaleButtonMessage(int buttonID, int x, int y, int z) {
      this.buttonID = buttonID;
      this.x = x;
      this.y = y;
      this.z = z;
   }

   public static void buffer(GronckleIronGUIFemaleButtonMessage message, FriendlyByteBuf buffer) {
      buffer.writeInt(message.buttonID);
      buffer.writeInt(message.x);
      buffer.writeInt(message.y);
      buffer.writeInt(message.z);
   }

   public static void handler(GronckleIronGUIFemaleButtonMessage message, Supplier<Context> contextSupplier) {
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
      HashMap guistate = GronckleIronGUIFemaleMenu.guistate;
      if (world.m_46805_(new BlockPos(x, y, z))) {
         if (buttonID == 0) {
            ButtonPressedGronckleIronGUIFemaleProcedure.execute(world, (double)x, (double)y, (double)z, entity);
         }

      }
   }

   @SubscribeEvent
   public static void registerMessage(FMLCommonSetupEvent event) {
      HowToOwnADragonMod.addNetworkMessage(GronckleIronGUIFemaleButtonMessage.class, GronckleIronGUIFemaleButtonMessage::buffer, GronckleIronGUIFemaleButtonMessage::new, GronckleIronGUIFemaleButtonMessage::handler);
   }
}
