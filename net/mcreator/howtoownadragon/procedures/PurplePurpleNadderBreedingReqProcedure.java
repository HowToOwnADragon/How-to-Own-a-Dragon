package net.mcreator.howtoownadragon.procedures;

import net.minecraft.world.InteractionHand;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.LevelAccessor;

public class PurplePurpleNadderBreedingReqProcedure {
   public static void execute(LevelAccessor world, double x, double y, double z, Entity sourceentity) {
      if (sourceentity != null) {
         ItemStack var10000;
         if (sourceentity instanceof LivingEntity) {
            LivingEntity _livEnt = (LivingEntity)sourceentity;
            var10000 = _livEnt.m_21205_();
         } else {
            var10000 = ItemStack.f_41583_;
         }

         LivingEntity _entity;
         ItemStack _setstack;
         LivingEntity _livEnt;
         Player _player;
         ItemStack var10001;
         if (var10000.m_41720_() == Items.f_42658_) {
            if (sourceentity instanceof LivingEntity) {
               _entity = (LivingEntity)sourceentity;
               _setstack = new ItemStack(Items.f_42658_);
               if (sourceentity instanceof LivingEntity) {
                  _livEnt = (LivingEntity)sourceentity;
                  var10001 = _livEnt.m_21205_();
               } else {
                  var10001 = ItemStack.f_41583_;
               }

               _setstack.m_41764_(var10001.m_41613_() - 1);
               _entity.m_21008_(InteractionHand.MAIN_HAND, _setstack);
               if (_entity instanceof Player) {
                  _player = (Player)_entity;
                  _player.m_150109_().m_6596_();
               }
            }

            PurpleAndPurpleEggNadderProcedure.execute(world, x, y, z);
         } else {
            if (sourceentity instanceof LivingEntity) {
               LivingEntity _livEnt = (LivingEntity)sourceentity;
               var10000 = _livEnt.m_21205_();
            } else {
               var10000 = ItemStack.f_41583_;
            }

            if (var10000.m_41720_() == Items.f_42526_) {
               if (sourceentity instanceof LivingEntity) {
                  _entity = (LivingEntity)sourceentity;
                  _setstack = new ItemStack(Items.f_42526_);
                  if (sourceentity instanceof LivingEntity) {
                     _livEnt = (LivingEntity)sourceentity;
                     var10001 = _livEnt.m_21205_();
                  } else {
                     var10001 = ItemStack.f_41583_;
                  }

                  _setstack.m_41764_(var10001.m_41613_() - 1);
                  _entity.m_21008_(InteractionHand.MAIN_HAND, _setstack);
                  if (_entity instanceof Player) {
                     _player = (Player)_entity;
                     _player.m_150109_().m_6596_();
                  }
               }

               PurpleAndPurpleEggNadderProcedure.execute(world, x, y, z);
            } else {
               if (sourceentity instanceof LivingEntity) {
                  LivingEntity _livEnt = (LivingEntity)sourceentity;
                  var10000 = _livEnt.m_21205_();
               } else {
                  var10000 = ItemStack.f_41583_;
               }

               if (var10000.m_41720_() == Items.f_42527_) {
                  if (sourceentity instanceof LivingEntity) {
                     _entity = (LivingEntity)sourceentity;
                     _setstack = new ItemStack(Items.f_42527_);
                     if (sourceentity instanceof LivingEntity) {
                        _livEnt = (LivingEntity)sourceentity;
                        var10001 = _livEnt.m_21205_();
                     } else {
                        var10001 = ItemStack.f_41583_;
                     }

                     _setstack.m_41764_(var10001.m_41613_() - 1);
                     _entity.m_21008_(InteractionHand.MAIN_HAND, _setstack);
                     if (_entity instanceof Player) {
                        _player = (Player)_entity;
                        _player.m_150109_().m_6596_();
                     }
                  }

                  PurpleAndPurpleEggNadderProcedure.execute(world, x, y, z);
               } else {
                  if (sourceentity instanceof LivingEntity) {
                     LivingEntity _livEnt = (LivingEntity)sourceentity;
                     var10000 = _livEnt.m_21205_();
                  } else {
                     var10000 = ItemStack.f_41583_;
                  }

                  if (var10000.m_41720_() == Items.f_42582_) {
                     if (sourceentity instanceof LivingEntity) {
                        _entity = (LivingEntity)sourceentity;
                        _setstack = new ItemStack(Items.f_42582_);
                        if (sourceentity instanceof LivingEntity) {
                           _livEnt = (LivingEntity)sourceentity;
                           var10001 = _livEnt.m_21205_();
                        } else {
                           var10001 = ItemStack.f_41583_;
                        }

                        _setstack.m_41764_(var10001.m_41613_() - 1);
                        _entity.m_21008_(InteractionHand.MAIN_HAND, _setstack);
                        if (_entity instanceof Player) {
                           _player = (Player)_entity;
                           _player.m_150109_().m_6596_();
                        }
                     }

                     PurpleAndPurpleEggNadderProcedure.execute(world, x, y, z);
                  }
               }
            }
         }

      }
   }
}
