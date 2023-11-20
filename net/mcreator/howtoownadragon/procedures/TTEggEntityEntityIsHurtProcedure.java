package net.mcreator.howtoownadragon.procedures;

import net.mcreator.howtoownadragon.HowToOwnADragonMod;
import net.mcreator.howtoownadragon.init.HowToOwnADragonModItems;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.LevelAccessor;

public class TTEggEntityEntityIsHurtProcedure {
   public static void execute(LevelAccessor world, Entity entity, Entity sourceentity) {
      if (entity != null && sourceentity != null) {
         ItemStack var10000;
         if (sourceentity instanceof LivingEntity) {
            LivingEntity _livEnt = (LivingEntity)sourceentity;
            var10000 = _livEnt.m_21205_();
         } else {
            var10000 = ItemStack.f_41583_;
         }

         if (var10000.m_41720_() == ItemStack.f_41583_.m_41720_()) {
            LivingEntity _entity;
            ItemStack _setstack;
            Player _player;
            if (entity.getPersistentData().m_128461_("ttcolor").equals("green")) {
               if (!entity.f_19853_.m_5776_()) {
                  entity.m_146870_();
               }

               if (sourceentity instanceof LivingEntity) {
                  _entity = (LivingEntity)sourceentity;
                  _setstack = new ItemStack((ItemLike)HowToOwnADragonModItems.TT_EGG_ITEM.get());
                  _setstack.m_41764_(1);
                  _entity.m_21008_(InteractionHand.MAIN_HAND, _setstack);
                  if (_entity instanceof Player) {
                     _player = (Player)_entity;
                     _player.m_150109_().m_6596_();
                  }
               }

               HowToOwnADragonMod.queueServerWork(1, () -> {
                  ItemStack var10000;
                  if (sourceentity instanceof LivingEntity) {
                     LivingEntity _livEnt = (LivingEntity)sourceentity;
                     var10000 = _livEnt.m_21205_();
                  } else {
                     var10000 = ItemStack.f_41583_;
                  }

                  var10000.m_41784_().m_128359_("ttcolor", "green");
               });
            } else if (entity.getPersistentData().m_128461_("ttcolor").equals("pink")) {
               if (!entity.f_19853_.m_5776_()) {
                  entity.m_146870_();
               }

               if (sourceentity instanceof LivingEntity) {
                  _entity = (LivingEntity)sourceentity;
                  _setstack = new ItemStack((ItemLike)HowToOwnADragonModItems.TT_EGG_ITEM.get());
                  _setstack.m_41764_(1);
                  _entity.m_21008_(InteractionHand.MAIN_HAND, _setstack);
                  if (_entity instanceof Player) {
                     _player = (Player)_entity;
                     _player.m_150109_().m_6596_();
                  }
               }

               HowToOwnADragonMod.queueServerWork(1, () -> {
                  ItemStack var10000;
                  if (sourceentity instanceof LivingEntity) {
                     LivingEntity _livEnt = (LivingEntity)sourceentity;
                     var10000 = _livEnt.m_21205_();
                  } else {
                     var10000 = ItemStack.f_41583_;
                  }

                  var10000.m_41784_().m_128359_("ttcolor", "pink");
               });
            } else if (entity.getPersistentData().m_128461_("ttcolor").equals("turq")) {
               if (!entity.f_19853_.m_5776_()) {
                  entity.m_146870_();
               }

               if (sourceentity instanceof LivingEntity) {
                  _entity = (LivingEntity)sourceentity;
                  _setstack = new ItemStack((ItemLike)HowToOwnADragonModItems.TT_EGG_ITEM.get());
                  _setstack.m_41764_(1);
                  _entity.m_21008_(InteractionHand.MAIN_HAND, _setstack);
                  if (_entity instanceof Player) {
                     _player = (Player)_entity;
                     _player.m_150109_().m_6596_();
                  }
               }

               HowToOwnADragonMod.queueServerWork(1, () -> {
                  ItemStack var10000;
                  if (sourceentity instanceof LivingEntity) {
                     LivingEntity _livEnt = (LivingEntity)sourceentity;
                     var10000 = _livEnt.m_21205_();
                  } else {
                     var10000 = ItemStack.f_41583_;
                  }

                  var10000.m_41784_().m_128359_("ttcolor", "turq");
               });
            }
         }

      }
   }
}
