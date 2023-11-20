package net.mcreator.howtoownadragon.procedures;

import javax.annotation.Nullable;
import net.mcreator.howtoownadragon.init.HowToOwnADragonModItems;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.LevelAccessor;
import net.minecraftforge.event.entity.player.PlayerInteractEvent.RightClickItem;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;

@EventBusSubscriber
public class SpawnProcedureTTProcedure {
   @SubscribeEvent
   public static void onRightClickItem(RightClickItem event) {
      if (event.getHand() == event.getEntity().m_7655_()) {
         execute(event, event.getLevel(), (double)event.getPos().m_123341_(), (double)event.getPos().m_123342_(), (double)event.getPos().m_123343_(), event.getEntity());
      }
   }

   public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
      execute((Event)null, world, x, y, z, entity);
   }

   private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z, Entity entity) {
      if (entity != null) {
         ItemStack var10000;
         if (entity instanceof LivingEntity) {
            LivingEntity _livEnt = (LivingEntity)entity;
            var10000 = _livEnt.m_21205_();
         } else {
            var10000 = ItemStack.f_41583_;
         }

         if (var10000.m_41720_() == HowToOwnADragonModItems.SPAWN_EGG_TT.get()) {
            if (entity instanceof LivingEntity) {
               LivingEntity _entity = (LivingEntity)entity;
               ItemStack _setstack = new ItemStack((ItemLike)HowToOwnADragonModItems.SPAWN_EGG_TT.get());
               ItemStack var10001;
               if (entity instanceof LivingEntity) {
                  LivingEntity _livEnt = (LivingEntity)entity;
                  var10001 = _livEnt.m_21205_();
               } else {
                  var10001 = ItemStack.f_41583_;
               }

               _setstack.m_41764_(var10001.m_41613_() - 1);
               _entity.m_21008_(InteractionHand.MAIN_HAND, _setstack);
               if (_entity instanceof Player) {
                  Player _player = (Player)_entity;
                  _player.m_150109_().m_6596_();
               }
            }

            SpawnTTProcedure.execute(world, x, y, z, entity);
         }

      }
   }
}
