package net.mcreator.howtoownadragon.procedures;

import java.util.Iterator;
import javax.annotation.Nullable;
import net.mcreator.howtoownadragon.HowToOwnADragonMod;
import net.minecraft.advancements.Advancement;
import net.minecraft.advancements.AdvancementProgress;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.level.LevelAccessor;
import net.minecraftforge.event.entity.player.PlayerEvent.PlayerLoggedInEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;

@EventBusSubscriber
public class GrantWelcomeProcedure {
   @SubscribeEvent
   public static void onPlayerLoggedIn(PlayerLoggedInEvent event) {
      execute(event, event.getEntity().f_19853_, event.getEntity());
   }

   public static void execute(LevelAccessor world, Entity entity) {
      execute((Event)null, world, entity);
   }

   private static void execute(@Nullable Event event, LevelAccessor world, Entity entity) {
      if (entity != null) {
         HowToOwnADragonMod.queueServerWork(10, () -> {
            if (entity instanceof ServerPlayer) {
               ServerPlayer _player = (ServerPlayer)entity;
               Advancement _adv = _player.f_8924_.m_129889_().m_136041_(new ResourceLocation("how_to_own_a_dragon:welcome_to_the_world"));
               AdvancementProgress _ap = _player.m_8960_().m_135996_(_adv);
               if (!_ap.m_8193_()) {
                  Iterator var4 = _ap.m_8219_().iterator();

                  while(var4.hasNext()) {
                     String criteria = (String)var4.next();
                     _player.m_8960_().m_135988_(_adv, criteria);
                  }
               }
            }

         });
      }
   }
}
