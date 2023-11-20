package net.mcreator.howtoownadragon;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.AbstractMap.SimpleEntry;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.function.BiConsumer;
import java.util.function.Function;
import java.util.function.Supplier;
import net.mcreator.howtoownadragon.init.HowToOwnADragonModBlockEntities;
import net.mcreator.howtoownadragon.init.HowToOwnADragonModBlocks;
import net.mcreator.howtoownadragon.init.HowToOwnADragonModEntities;
import net.mcreator.howtoownadragon.init.HowToOwnADragonModFeatures;
import net.mcreator.howtoownadragon.init.HowToOwnADragonModItems;
import net.mcreator.howtoownadragon.init.HowToOwnADragonModMenus;
import net.mcreator.howtoownadragon.init.HowToOwnADragonModMobEffects;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.TickEvent.Phase;
import net.minecraftforge.event.TickEvent.ServerTickEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.network.NetworkRegistry;
import net.minecraftforge.network.NetworkEvent.Context;
import net.minecraftforge.network.simple.SimpleChannel;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import software.bernie.geckolib.GeckoLib;

@Mod("how_to_own_a_dragon")
public class HowToOwnADragonMod {
   public static final Logger LOGGER = LogManager.getLogger(HowToOwnADragonMod.class);
   public static final String MODID = "how_to_own_a_dragon";
   private static final String PROTOCOL_VERSION = "1";
   public static final SimpleChannel PACKET_HANDLER = NetworkRegistry.newSimpleChannel(new ResourceLocation("how_to_own_a_dragon", "how_to_own_a_dragon"), () -> {
      return "1";
   }, "1"::equals, "1"::equals);
   private static int messageID = 0;
   private static final Collection<SimpleEntry<Runnable, Integer>> workQueue = new ConcurrentLinkedQueue();

   public HowToOwnADragonMod() {
      MinecraftForge.EVENT_BUS.register(this);
      IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
      HowToOwnADragonModBlocks.REGISTRY.register(bus);
      HowToOwnADragonModItems.REGISTRY.register(bus);
      HowToOwnADragonModEntities.REGISTRY.register(bus);
      HowToOwnADragonModBlockEntities.REGISTRY.register(bus);
      HowToOwnADragonModFeatures.REGISTRY.register(bus);
      HowToOwnADragonModMobEffects.REGISTRY.register(bus);
      HowToOwnADragonModMenus.REGISTRY.register(bus);
      GeckoLib.initialize();
   }

   public static <T> void addNetworkMessage(Class<T> messageType, BiConsumer<T, FriendlyByteBuf> encoder, Function<FriendlyByteBuf, T> decoder, BiConsumer<T, Supplier<Context>> messageConsumer) {
      PACKET_HANDLER.registerMessage(messageID, messageType, encoder, decoder, messageConsumer);
      ++messageID;
   }

   public static void queueServerWork(int tick, Runnable action) {
      workQueue.add(new SimpleEntry(action, tick));
   }

   @SubscribeEvent
   public void tick(ServerTickEvent event) {
      if (event.phase == Phase.END) {
         List<SimpleEntry<Runnable, Integer>> actions = new ArrayList();
         workQueue.forEach((work) -> {
            work.setValue((Integer)work.getValue() - 1);
            if ((Integer)work.getValue() == 0) {
               actions.add(work);
            }

         });
         actions.forEach((e) -> {
            ((Runnable)e.getKey()).run();
         });
         workQueue.removeAll(actions);
      }

   }
}
