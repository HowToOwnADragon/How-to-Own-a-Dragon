package net.mcreator.howtoownadragon.procedures;

import javax.annotation.Nullable;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.tags.TagKey;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.TamableAnimal;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.LevelAccessor;
import net.minecraftforge.event.entity.player.PlayerInteractEvent.EntityInteract;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;

@EventBusSubscriber
public class InLoveBreedingTTProcedure {
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
         if (entity instanceof TamableAnimal) {
            TamableAnimal _tamIsTamedBy = (TamableAnimal)entity;
            if (sourceentity instanceof LivingEntity) {
               LivingEntity _livEnt = (LivingEntity)sourceentity;
               if (_tamIsTamedBy.m_21830_(_livEnt) && entity.m_6095_().m_204039_(TagKey.m_203882_(Registries.f_256939_, new ResourceLocation("how_to_own_a_dragon:tt_full_grown")))) {
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
                  ServerLevel _level;
                  Player _player;
                  if (var10000.m_41720_() == Items.f_42406_) {
                     if (sourceentity instanceof LivingEntity) {
                        _entity = (LivingEntity)sourceentity;
                        _setstack = new ItemStack(Items.f_42406_);
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

                     if (world instanceof ServerLevel) {
                        _level = (ServerLevel)world;
                        _level.m_8767_(ParticleTypes.f_123750_, x, y, z, 30, 3.0D, 3.0D, 3.0D, 0.5D);
                     }

                     entity.getPersistentData().m_128379_("ttinlove", true);
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

                        if (world instanceof ServerLevel) {
                           _level = (ServerLevel)world;
                           _level.m_8767_(ParticleTypes.f_123750_, x, y, z, 30, 3.0D, 3.0D, 3.0D, 0.5D);
                        }

                        entity.getPersistentData().m_128379_("ttinlove", true);
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

                           if (world instanceof ServerLevel) {
                              _level = (ServerLevel)world;
                              _level.m_8767_(ParticleTypes.f_123750_, x, y, z, 30, 3.0D, 3.0D, 3.0D, 0.5D);
                           }

                           entity.getPersistentData().m_128379_("ttinlove", true);
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

                              if (world instanceof ServerLevel) {
                                 _level = (ServerLevel)world;
                                 _level.m_8767_(ParticleTypes.f_123750_, x, y, z, 30, 3.0D, 3.0D, 3.0D, 0.5D);
                              }

                              entity.getPersistentData().m_128379_("ttinlove", true);
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
