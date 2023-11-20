package net.mcreator.howtoownadragon.network;

import java.util.function.Supplier;
import net.mcreator.howtoownadragon.HowToOwnADragonMod;
import net.mcreator.howtoownadragon.procedures.AllFollowMeOnKeyPressedProcedure;
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
public class AllFollowMeMessage {
   int type;
   int pressedms;

   public AllFollowMeMessage(int type, int pressedms) {
      this.type = type;
      this.pressedms = pressedms;
   }

   public AllFollowMeMessage(FriendlyByteBuf buffer) {
      this.type = buffer.readInt();
      this.pressedms = buffer.readInt();
   }

   public static void buffer(AllFollowMeMessage message, FriendlyByteBuf buffer) {
      buffer.writeInt(message.type);
      buffer.writeInt(message.pressedms);
   }

   public static void handler(AllFollowMeMessage message, Supplier<Context> contextSupplier) {
      Context context = (Context)contextSupplier.get();
      context.enqueueWork(() -> {
         pressAction(context.getSender(), message.type, message.pressedms);
      });
      context.setPacketHandled(true);
   }

   public static void pressAction(Player entity, int type, int pressedms) {
      Level world = entity.f_19853_;
      double x = entity.m_20185_();
      double y = entity.m_20186_();
      double z = entity.m_20189_();
      if (world.m_46805_(entity.m_20183_())) {
         if (type == 0) {
            AllFollowMeOnKeyPressedProcedure.execute(entity);
         }

      }
   }

   @SubscribeEvent
   public static void registerMessage(FMLCommonSetupEvent event) {
      HowToOwnADragonMod.addNetworkMessage(AllFollowMeMessage.class, AllFollowMeMessage::buffer, AllFollowMeMessage::new, AllFollowMeMessage::handler);
   }
}
