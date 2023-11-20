package net.mcreator.howtoownadragon.init;

import net.mcreator.howtoownadragon.HowToOwnADragonMod;
import net.mcreator.howtoownadragon.network.AllFollowMeMessage;
import net.mcreator.howtoownadragon.network.FlyDownMessage;
import net.mcreator.howtoownadragon.network.FlyUpMessage;
import net.mcreator.howtoownadragon.network.UseAbilityMessage;
import net.minecraft.client.KeyMapping;
import net.minecraft.client.Minecraft;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.RegisterKeyMappingsEvent;
import net.minecraftforge.event.TickEvent.ClientTickEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;

@EventBusSubscriber(
   bus = Bus.MOD,
   value = {Dist.CLIENT}
)
public class HowToOwnADragonModKeyMappings {
   public static final KeyMapping FLY_UP = new KeyMapping("key.how_to_own_a_dragon.fly_up", 32, "key.categories.htoad") {
      private boolean isDownOld = false;

      public void m_7249_(boolean isDown) {
         super.m_7249_(isDown);
         if (this.isDownOld != isDown && isDown) {
            HowToOwnADragonMod.PACKET_HANDLER.sendToServer(new FlyUpMessage(0, 0));
            FlyUpMessage.pressAction(Minecraft.m_91087_().f_91074_, 0, 0);
            HowToOwnADragonModKeyMappings.FLY_UP_LASTPRESS = System.currentTimeMillis();
         } else if (this.isDownOld != isDown && !isDown) {
            int dt = (int)(System.currentTimeMillis() - HowToOwnADragonModKeyMappings.FLY_UP_LASTPRESS);
            HowToOwnADragonMod.PACKET_HANDLER.sendToServer(new FlyUpMessage(1, dt));
            FlyUpMessage.pressAction(Minecraft.m_91087_().f_91074_, 1, dt);
         }

         this.isDownOld = isDown;
      }
   };
   public static final KeyMapping FLY_DOWN = new KeyMapping("key.how_to_own_a_dragon.fly_down", 341, "key.categories.htoad") {
      private boolean isDownOld = false;

      public void m_7249_(boolean isDown) {
         super.m_7249_(isDown);
         if (this.isDownOld != isDown && isDown) {
            HowToOwnADragonMod.PACKET_HANDLER.sendToServer(new FlyDownMessage(0, 0));
            FlyDownMessage.pressAction(Minecraft.m_91087_().f_91074_, 0, 0);
            HowToOwnADragonModKeyMappings.FLY_DOWN_LASTPRESS = System.currentTimeMillis();
         } else if (this.isDownOld != isDown && !isDown) {
            int dt = (int)(System.currentTimeMillis() - HowToOwnADragonModKeyMappings.FLY_DOWN_LASTPRESS);
            HowToOwnADragonMod.PACKET_HANDLER.sendToServer(new FlyDownMessage(1, dt));
            FlyDownMessage.pressAction(Minecraft.m_91087_().f_91074_, 1, dt);
         }

         this.isDownOld = isDown;
      }
   };
   public static final KeyMapping ALL_FOLLOW_ME = new KeyMapping("key.how_to_own_a_dragon.all_follow_me", 71, "key.categories.htoad") {
      private boolean isDownOld = false;

      public void m_7249_(boolean isDown) {
         super.m_7249_(isDown);
         if (this.isDownOld != isDown && isDown) {
            HowToOwnADragonMod.PACKET_HANDLER.sendToServer(new AllFollowMeMessage(0, 0));
            AllFollowMeMessage.pressAction(Minecraft.m_91087_().f_91074_, 0, 0);
         }

         this.isDownOld = isDown;
      }
   };
   public static final KeyMapping USE_ABILITY = new KeyMapping("key.how_to_own_a_dragon.use_ability", 82, "key.categories.htoad") {
      private boolean isDownOld = false;

      public void m_7249_(boolean isDown) {
         super.m_7249_(isDown);
         if (this.isDownOld != isDown && isDown) {
            HowToOwnADragonMod.PACKET_HANDLER.sendToServer(new UseAbilityMessage(0, 0));
            UseAbilityMessage.pressAction(Minecraft.m_91087_().f_91074_, 0, 0);
         }

         this.isDownOld = isDown;
      }
   };
   private static long FLY_UP_LASTPRESS = 0L;
   private static long FLY_DOWN_LASTPRESS = 0L;

   @SubscribeEvent
   public static void registerKeyMappings(RegisterKeyMappingsEvent event) {
      event.register(FLY_UP);
      event.register(FLY_DOWN);
      event.register(ALL_FOLLOW_ME);
      event.register(USE_ABILITY);
   }

   @EventBusSubscriber({Dist.CLIENT})
   public static class KeyEventListener {
      @SubscribeEvent
      public static void onClientTick(ClientTickEvent event) {
         if (Minecraft.m_91087_().f_91080_ == null) {
            HowToOwnADragonModKeyMappings.FLY_UP.m_90859_();
            HowToOwnADragonModKeyMappings.FLY_DOWN.m_90859_();
            HowToOwnADragonModKeyMappings.ALL_FOLLOW_ME.m_90859_();
            HowToOwnADragonModKeyMappings.USE_ABILITY.m_90859_();
         }

      }
   }
}
