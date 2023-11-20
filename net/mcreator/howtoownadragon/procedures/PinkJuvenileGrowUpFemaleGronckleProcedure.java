package net.mcreator.howtoownadragon.procedures;

import javax.annotation.Nullable;
import net.mcreator.howtoownadragon.entity.JuvenileGronckleFemaleEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.level.LevelAccessor;
import net.minecraftforge.event.entity.player.PlayerInteractEvent.EntityInteract;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;

@EventBusSubscriber
public class PinkJuvenileGrowUpFemaleGronckleProcedure {
   @SubscribeEvent
   public static void onRightClickEntity(EntityInteract event) {
      if (event.getHand() == event.getEntity().m_7655_()) {
         execute(event, event.getLevel(), (double)event.getPos().m_123341_(), (double)event.getPos().m_123342_(), (double)event.getPos().m_123343_(), event.getTarget(), event.getEntity());
      }
   }

   public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, Entity sourceentity) {
      execute((Event)null, world, x, y, z, entity, sourceentity);
   }

   private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z, Entity entity, Entity sourceentity) {
      if (entity != null && sourceentity != null) {
         if (entity.getPersistentData().m_128461_("groncklecolor").equals("pink") && entity instanceof JuvenileGronckleFemaleEntity) {
            PinkItemNeededForGrowUpGronckleProcedure.execute(world, x, y, z, entity, sourceentity);
         }

      }
   }
}
