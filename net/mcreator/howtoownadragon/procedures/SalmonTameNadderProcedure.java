package net.mcreator.howtoownadragon.procedures;

import javax.annotation.Nullable;
import net.mcreator.howtoownadragon.HowToOwnADragonMod;
import net.minecraft.client.Minecraft;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.tags.TagKey;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.TamableAnimal;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.GameType;
import net.minecraft.world.level.LevelAccessor;
import net.minecraftforge.event.entity.player.PlayerInteractEvent.EntityInteract;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;

@EventBusSubscriber
public class SalmonTameNadderProcedure {
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
         HowToOwnADragonMod.queueServerWork(1, () -> {
            if (entity.m_6095_().m_204039_(TagKey.m_203882_(Registries.f_256939_, new ResourceLocation("how_to_own_a_dragon:nadder")))) {
               if (entity instanceof TamableAnimal) {
                  TamableAnimal _tamEnt = (TamableAnimal)entity;
                  if (_tamEnt.m_21824_()) {
                     return;
                  }
               }

               if (((<undefinedtype>)(new Object() {
                  public boolean checkGamemode(Entity _ent) {
                     if (_ent instanceof ServerPlayer) {
                        ServerPlayer _serverPlayer = (ServerPlayer)_ent;
                        return _serverPlayer.f_8941_.m_9290_() == GameType.SURVIVAL;
                     } else if (_ent.f_19853_.m_5776_() && _ent instanceof Player) {
                        Player _player = (Player)_ent;
                        return Minecraft.m_91087_().m_91403_().m_104949_(_player.m_36316_().getId()) != null && Minecraft.m_91087_().m_91403_().m_104949_(_player.m_36316_().getId()).m_105325_() == GameType.SURVIVAL;
                     } else {
                        return false;
                     }
                  }
               })).checkGamemode(sourceentity)) {
                  ItemStack var10000;
                  if (sourceentity instanceof LivingEntity) {
                     LivingEntity _livEntx = (LivingEntity)sourceentity;
                     var10000 = _livEntx.m_21205_();
                  } else {
                     var10000 = ItemStack.f_41583_;
                  }

                  if (var10000.m_41720_() == Items.f_42527_) {
                     LivingEntity _entity;
                     ItemStack _setstack;
                     LivingEntity _livEnt;
                     ServerLevel _levelx;
                     ItemStack var10001;
                     Player _player;
                     if (Math.random() < 0.7D) {
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
                           _levelx = (ServerLevel)world;
                           _levelx.m_8767_(ParticleTypes.f_123765_, x, y, z, 30, 3.0D, 3.0D, 3.0D, 1.0D);
                        }
                     }

                     if (Math.random() >= 0.7D) {
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
                           _levelx = (ServerLevel)world;
                           _levelx.m_8767_(ParticleTypes.f_123750_, x, y, z, 30, 3.0D, 3.0D, 3.0D, 1.0D);
                        }

                        if (entity instanceof TamableAnimal) {
                           TamableAnimal _toTamex = (TamableAnimal)entity;
                           if (sourceentity instanceof Player) {
                              Player _ownerx = (Player)sourceentity;
                              _toTamex.m_21828_(_ownerx);
                           }
                        }
                     }
                  }
               }

               if (((<undefinedtype>)(new Object() {
                  public boolean checkGamemode(Entity _ent) {
                     if (_ent instanceof ServerPlayer) {
                        ServerPlayer _serverPlayer = (ServerPlayer)_ent;
                        return _serverPlayer.f_8941_.m_9290_() == GameType.CREATIVE;
                     } else if (_ent.f_19853_.m_5776_() && _ent instanceof Player) {
                        Player _player = (Player)_ent;
                        return Minecraft.m_91087_().m_91403_().m_104949_(_player.m_36316_().getId()) != null && Minecraft.m_91087_().m_91403_().m_104949_(_player.m_36316_().getId()).m_105325_() == GameType.CREATIVE;
                     } else {
                        return false;
                     }
                  }
               })).checkGamemode(sourceentity)) {
                  if (entity instanceof TamableAnimal) {
                     TamableAnimal _toTame = (TamableAnimal)entity;
                     if (sourceentity instanceof Player) {
                        Player _owner = (Player)sourceentity;
                        _toTame.m_21828_(_owner);
                     }
                  }

                  if (world instanceof ServerLevel) {
                     ServerLevel _level = (ServerLevel)world;
                     _level.m_8767_(ParticleTypes.f_123750_, x, y, z, 30, 3.0D, 3.0D, 3.0D, 1.0D);
                  }
               }
            }

         });
      }
   }
}
