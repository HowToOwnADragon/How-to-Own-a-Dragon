package net.mcreator.howtoownadragon.procedures;

import javax.annotation.Nullable;
import net.mcreator.howtoownadragon.entity.GronckleFemaleEntity;
import net.mcreator.howtoownadragon.init.HowToOwnADragonModItems;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.TamableAnimal;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.ItemLike;
import net.minecraftforge.event.entity.player.PlayerInteractEvent.EntityInteract;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;

@EventBusSubscriber
public class PinkSaddleFemaleGronckleProcedure {
   @SubscribeEvent
   public static void onRightClickEntity(EntityInteract event) {
      if (event.getHand() == event.getEntity().m_7655_()) {
         execute(event, event.getTarget(), event.getEntity());
      }
   }

   public static void execute(Entity entity, Entity sourceentity) {
      execute((Event)null, entity, sourceentity);
   }

   private static void execute(@Nullable Event event, Entity entity, Entity sourceentity) {
      if (entity != null && sourceentity != null) {
         if (entity instanceof GronckleFemaleEntity && entity instanceof TamableAnimal) {
            TamableAnimal _tamEnt = (TamableAnimal)entity;
            if (_tamEnt.m_21824_()) {
               ItemStack var10000;
               if (sourceentity instanceof LivingEntity) {
                  LivingEntity _livEnt = (LivingEntity)sourceentity;
                  var10000 = _livEnt.m_21205_();
               } else {
                  var10000 = ItemStack.f_41583_;
               }

               LivingEntity _entity;
               ItemStack _setstack;
               Player _player;
               GronckleFemaleEntity animatable;
               if (var10000.m_41720_() == HowToOwnADragonModItems.GRONCKLE_SADDLE.get() && !entity.getPersistentData().m_128471_("groncklesaddle") && entity.getPersistentData().m_128461_("groncklecolor").equals("pink")) {
                  if (sourceentity instanceof LivingEntity) {
                     _entity = (LivingEntity)sourceentity;
                     _setstack = new ItemStack((ItemLike)HowToOwnADragonModItems.SADDLE_RACK.get());
                     _setstack.m_41764_(1);
                     _entity.m_21008_(InteractionHand.MAIN_HAND, _setstack);
                     if (_entity instanceof Player) {
                        _player = (Player)_entity;
                        _player.m_150109_().m_6596_();
                     }
                  }

                  if (entity instanceof GronckleFemaleEntity) {
                     animatable = (GronckleFemaleEntity)entity;
                     animatable.setTexture("groncklepinksaddle");
                  }

                  entity.getPersistentData().m_128379_("groncklesaddle", true);
               } else {
                  if (sourceentity instanceof LivingEntity) {
                     LivingEntity _livEnt = (LivingEntity)sourceentity;
                     var10000 = _livEnt.m_21205_();
                  } else {
                     var10000 = ItemStack.f_41583_;
                  }

                  if (var10000.m_41720_() == HowToOwnADragonModItems.SADDLE_RACK.get() && entity.getPersistentData().m_128471_("groncklesaddle") && entity.getPersistentData().m_128461_("groncklecolor").equals("pink")) {
                     if (sourceentity instanceof LivingEntity) {
                        _entity = (LivingEntity)sourceentity;
                        _setstack = new ItemStack((ItemLike)HowToOwnADragonModItems.GRONCKLE_SADDLE.get());
                        _setstack.m_41764_(1);
                        _entity.m_21008_(InteractionHand.MAIN_HAND, _setstack);
                        if (_entity instanceof Player) {
                           _player = (Player)_entity;
                           _player.m_150109_().m_6596_();
                        }
                     }

                     if (entity instanceof GronckleFemaleEntity) {
                        animatable = (GronckleFemaleEntity)entity;
                        animatable.setTexture("groncklepink");
                     }

                     entity.getPersistentData().m_128379_("groncklesaddle", false);
                  }
               }
            }
         }

      }
   }
}
