package net.mcreator.howtoownadragon.network;

import java.util.Objects;
import java.util.function.Supplier;
import net.mcreator.howtoownadragon.HowToOwnADragonMod;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.ServerLevelAccessor;
import net.minecraft.world.level.saveddata.SavedData;
import net.minecraftforge.event.entity.player.PlayerEvent.PlayerChangedDimensionEvent;
import net.minecraftforge.event.entity.player.PlayerEvent.PlayerLoggedInEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.network.PacketDistributor;
import net.minecraftforge.network.NetworkEvent.Context;
import net.minecraftforge.network.simple.SimpleChannel;

@EventBusSubscriber(
   bus = Bus.MOD
)
public class HowToOwnADragonModVariables {
   @SubscribeEvent
   public static void init(FMLCommonSetupEvent event) {
      HowToOwnADragonMod.addNetworkMessage(HowToOwnADragonModVariables.SavedDataSyncMessage.class, HowToOwnADragonModVariables.SavedDataSyncMessage::buffer, HowToOwnADragonModVariables.SavedDataSyncMessage::new, HowToOwnADragonModVariables.SavedDataSyncMessage::handler);
   }

   public static class SavedDataSyncMessage {
      public int type;
      public SavedData data;

      public SavedDataSyncMessage(FriendlyByteBuf buffer) {
         this.type = buffer.readInt();
         this.data = (SavedData)(this.type == 0 ? new HowToOwnADragonModVariables.MapVariables() : new HowToOwnADragonModVariables.WorldVariables());
         SavedData var4 = this.data;
         if (var4 instanceof HowToOwnADragonModVariables.MapVariables) {
            HowToOwnADragonModVariables.MapVariables _mapvars = (HowToOwnADragonModVariables.MapVariables)var4;
            _mapvars.read(buffer.m_130260_());
         } else {
            var4 = this.data;
            if (var4 instanceof HowToOwnADragonModVariables.WorldVariables) {
               HowToOwnADragonModVariables.WorldVariables _worldvars = (HowToOwnADragonModVariables.WorldVariables)var4;
               _worldvars.read(buffer.m_130260_());
            }
         }

      }

      public SavedDataSyncMessage(int type, SavedData data) {
         this.type = type;
         this.data = data;
      }

      public static void buffer(HowToOwnADragonModVariables.SavedDataSyncMessage message, FriendlyByteBuf buffer) {
         buffer.writeInt(message.type);
         buffer.m_130079_(message.data.m_7176_(new CompoundTag()));
      }

      public static void handler(HowToOwnADragonModVariables.SavedDataSyncMessage message, Supplier<Context> contextSupplier) {
         Context context = (Context)contextSupplier.get();
         context.enqueueWork(() -> {
            if (!context.getDirection().getReceptionSide().isServer()) {
               if (message.type == 0) {
                  HowToOwnADragonModVariables.MapVariables.clientSide = (HowToOwnADragonModVariables.MapVariables)message.data;
               } else {
                  HowToOwnADragonModVariables.WorldVariables.clientSide = (HowToOwnADragonModVariables.WorldVariables)message.data;
               }
            }

         });
         context.setPacketHandled(true);
      }
   }

   public static class MapVariables extends SavedData {
      public static final String DATA_NAME = "how_to_own_a_dragon_mapvars";
      static HowToOwnADragonModVariables.MapVariables clientSide = new HowToOwnADragonModVariables.MapVariables();

      public static HowToOwnADragonModVariables.MapVariables load(CompoundTag tag) {
         HowToOwnADragonModVariables.MapVariables data = new HowToOwnADragonModVariables.MapVariables();
         data.read(tag);
         return data;
      }

      public void read(CompoundTag nbt) {
      }

      public CompoundTag m_7176_(CompoundTag nbt) {
         return nbt;
      }

      public void syncData(LevelAccessor world) {
         this.m_77762_();
         if (world instanceof Level && !world.m_5776_()) {
            HowToOwnADragonMod.PACKET_HANDLER.send(PacketDistributor.ALL.noArg(), new HowToOwnADragonModVariables.SavedDataSyncMessage(0, this));
         }

      }

      public static HowToOwnADragonModVariables.MapVariables get(LevelAccessor world) {
         if (world instanceof ServerLevelAccessor) {
            ServerLevelAccessor serverLevelAcc = (ServerLevelAccessor)world;
            return (HowToOwnADragonModVariables.MapVariables)serverLevelAcc.m_6018_().m_7654_().m_129880_(Level.f_46428_).m_8895_().m_164861_((e) -> {
               return load(e);
            }, HowToOwnADragonModVariables.MapVariables::new, "how_to_own_a_dragon_mapvars");
         } else {
            return clientSide;
         }
      }
   }

   public static class WorldVariables extends SavedData {
      public static final String DATA_NAME = "how_to_own_a_dragon_worldvars";
      public boolean HasplayerenteredHWbefore = false;
      public double SpawnReaper1 = 0.0D;
      public ItemStack GUIslot0;
      static HowToOwnADragonModVariables.WorldVariables clientSide = new HowToOwnADragonModVariables.WorldVariables();

      public WorldVariables() {
         this.GUIslot0 = ItemStack.f_41583_;
      }

      public static HowToOwnADragonModVariables.WorldVariables load(CompoundTag tag) {
         HowToOwnADragonModVariables.WorldVariables data = new HowToOwnADragonModVariables.WorldVariables();
         data.read(tag);
         return data;
      }

      public void read(CompoundTag nbt) {
         this.HasplayerenteredHWbefore = nbt.m_128471_("HasplayerenteredHWbefore");
         this.SpawnReaper1 = nbt.m_128459_("SpawnReaper1");
         this.GUIslot0 = ItemStack.m_41712_(nbt.m_128469_("GUIslot0"));
      }

      public CompoundTag m_7176_(CompoundTag nbt) {
         nbt.m_128379_("HasplayerenteredHWbefore", this.HasplayerenteredHWbefore);
         nbt.m_128347_("SpawnReaper1", this.SpawnReaper1);
         nbt.m_128365_("GUIslot0", this.GUIslot0.m_41739_(new CompoundTag()));
         return nbt;
      }

      public void syncData(LevelAccessor world) {
         this.m_77762_();
         if (world instanceof Level) {
            Level level = (Level)world;
            if (!level.m_5776_()) {
               SimpleChannel var10000 = HowToOwnADragonMod.PACKET_HANDLER;
               PacketDistributor var10001 = PacketDistributor.DIMENSION;
               Objects.requireNonNull(level);
               var10000.send(var10001.with(level::m_46472_), new HowToOwnADragonModVariables.SavedDataSyncMessage(1, this));
            }
         }

      }

      public static HowToOwnADragonModVariables.WorldVariables get(LevelAccessor world) {
         if (world instanceof ServerLevel) {
            ServerLevel level = (ServerLevel)world;
            return (HowToOwnADragonModVariables.WorldVariables)level.m_8895_().m_164861_((e) -> {
               return load(e);
            }, HowToOwnADragonModVariables.WorldVariables::new, "how_to_own_a_dragon_worldvars");
         } else {
            return clientSide;
         }
      }
   }

   @EventBusSubscriber
   public static class EventBusVariableHandlers {
      @SubscribeEvent
      public static void onPlayerLoggedIn(PlayerLoggedInEvent event) {
         if (!event.getEntity().f_19853_.m_5776_()) {
            SavedData mapdata = HowToOwnADragonModVariables.MapVariables.get(event.getEntity().f_19853_);
            SavedData worlddata = HowToOwnADragonModVariables.WorldVariables.get(event.getEntity().f_19853_);
            if (mapdata != null) {
               HowToOwnADragonMod.PACKET_HANDLER.send(PacketDistributor.PLAYER.with(() -> {
                  return (ServerPlayer)event.getEntity();
               }), new HowToOwnADragonModVariables.SavedDataSyncMessage(0, mapdata));
            }

            if (worlddata != null) {
               HowToOwnADragonMod.PACKET_HANDLER.send(PacketDistributor.PLAYER.with(() -> {
                  return (ServerPlayer)event.getEntity();
               }), new HowToOwnADragonModVariables.SavedDataSyncMessage(1, worlddata));
            }
         }

      }

      @SubscribeEvent
      public static void onPlayerChangedDimension(PlayerChangedDimensionEvent event) {
         if (!event.getEntity().f_19853_.m_5776_()) {
            SavedData worlddata = HowToOwnADragonModVariables.WorldVariables.get(event.getEntity().f_19853_);
            if (worlddata != null) {
               HowToOwnADragonMod.PACKET_HANDLER.send(PacketDistributor.PLAYER.with(() -> {
                  return (ServerPlayer)event.getEntity();
               }), new HowToOwnADragonModVariables.SavedDataSyncMessage(1, worlddata));
            }
         }

      }
   }
}
