package net.mcreator.howtoownadragon.procedures;

import net.minecraft.world.InteractionHand;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.Blocks;

public class OrangeRedOrangeRedGronckleBreedingRequirementProcedure {
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
         ItemStack var10001;
         LivingEntity _livEnt;
         Player _player;
         if (var10000.m_41720_() == Blocks.f_50069_.m_5456_()) {
            if (sourceentity instanceof LivingEntity) {
               _entity = (LivingEntity)sourceentity;
               _setstack = new ItemStack(Blocks.f_50069_);
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

            OrangeRedAndOrangeRedEggGronckleProcedure.execute(world, x, y, z);
         } else {
            if (sourceentity instanceof LivingEntity) {
               LivingEntity _livEnt = (LivingEntity)sourceentity;
               var10000 = _livEnt.m_21205_();
            } else {
               var10000 = ItemStack.f_41583_;
            }

            if (var10000.m_41720_() == Blocks.f_50062_.m_5456_()) {
               if (sourceentity instanceof LivingEntity) {
                  _entity = (LivingEntity)sourceentity;
                  _setstack = new ItemStack(Blocks.f_50062_);
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

               OrangeRedAndOrangeRedEggGronckleProcedure.execute(world, x, y, z);
            } else {
               if (sourceentity instanceof LivingEntity) {
                  LivingEntity _livEnt = (LivingEntity)sourceentity;
                  var10000 = _livEnt.m_21205_();
               } else {
                  var10000 = ItemStack.f_41583_;
               }

               if (var10000.m_41720_() == Blocks.f_50652_.m_5456_()) {
                  if (sourceentity instanceof LivingEntity) {
                     _entity = (LivingEntity)sourceentity;
                     _setstack = new ItemStack(Blocks.f_50652_);
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

                  OrangeRedAndOrangeRedEggGronckleProcedure.execute(world, x, y, z);
               } else {
                  if (sourceentity instanceof LivingEntity) {
                     LivingEntity _livEnt = (LivingEntity)sourceentity;
                     var10000 = _livEnt.m_21205_();
                  } else {
                     var10000 = ItemStack.f_41583_;
                  }

                  if (var10000.m_41720_() == Blocks.f_152550_.m_5456_()) {
                     if (sourceentity instanceof LivingEntity) {
                        _entity = (LivingEntity)sourceentity;
                        _setstack = new ItemStack(Blocks.f_152550_);
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

                     OrangeRedAndOrangeRedEggGronckleProcedure.execute(world, x, y, z);
                  } else {
                     if (sourceentity instanceof LivingEntity) {
                        LivingEntity _livEnt = (LivingEntity)sourceentity;
                        var10000 = _livEnt.m_21205_();
                     } else {
                        var10000 = ItemStack.f_41583_;
                     }

                     if (var10000.m_41720_() == Blocks.f_152551_.m_5456_()) {
                        if (sourceentity instanceof LivingEntity) {
                           _entity = (LivingEntity)sourceentity;
                           _setstack = new ItemStack(Blocks.f_152551_);
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

                        OrangeRedAndOrangeRedEggGronckleProcedure.execute(world, x, y, z);
                     } else {
                        if (sourceentity instanceof LivingEntity) {
                           LivingEntity _livEnt = (LivingEntity)sourceentity;
                           var10000 = _livEnt.m_21205_();
                        } else {
                           var10000 = ItemStack.f_41583_;
                        }

                        if (var10000.m_41720_() == Blocks.f_50228_.m_5456_()) {
                           if (sourceentity instanceof LivingEntity) {
                              _entity = (LivingEntity)sourceentity;
                              _setstack = new ItemStack(Blocks.f_50228_);
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

                           OrangeRedAndOrangeRedEggGronckleProcedure.execute(world, x, y, z);
                        } else {
                           if (sourceentity instanceof LivingEntity) {
                              LivingEntity _livEnt = (LivingEntity)sourceentity;
                              var10000 = _livEnt.m_21205_();
                           } else {
                              var10000 = ItemStack.f_41583_;
                           }

                           if (var10000.m_41720_() == Blocks.f_50122_.m_5456_()) {
                              if (sourceentity instanceof LivingEntity) {
                                 _entity = (LivingEntity)sourceentity;
                                 _setstack = new ItemStack(Blocks.f_50122_);
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

                              OrangeRedAndOrangeRedEggGronckleProcedure.execute(world, x, y, z);
                           } else {
                              if (sourceentity instanceof LivingEntity) {
                                 LivingEntity _livEnt = (LivingEntity)sourceentity;
                                 var10000 = _livEnt.m_21205_();
                              } else {
                                 var10000 = ItemStack.f_41583_;
                              }

                              if (var10000.m_41720_() == Blocks.f_50334_.m_5456_()) {
                                 if (sourceentity instanceof LivingEntity) {
                                    _entity = (LivingEntity)sourceentity;
                                    _setstack = new ItemStack(Blocks.f_50334_);
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

                                 OrangeRedAndOrangeRedEggGronckleProcedure.execute(world, x, y, z);
                              }
                           }
                        }
                     }
                  }
               }
            }
         }

      }
   }
}
