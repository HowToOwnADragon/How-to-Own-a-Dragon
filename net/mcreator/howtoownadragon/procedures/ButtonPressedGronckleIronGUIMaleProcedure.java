package net.mcreator.howtoownadragon.procedures;

import java.util.Comparator;
import java.util.Map;
import java.util.function.Supplier;
import net.mcreator.howtoownadragon.entity.GronckleMaleEntity;
import net.mcreator.howtoownadragon.init.HowToOwnADragonModBlocks;
import net.mcreator.howtoownadragon.init.HowToOwnADragonModItems;
import net.mcreator.howtoownadragon.init.HowToOwnADragonModMobEffects;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.inventory.Slot;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.phys.Vec3;

public class ButtonPressedGronckleIronGUIMaleProcedure {
   public static void execute(LevelAccessor world, double x, double y, double z, final Entity entity) {
      if (entity != null) {
         Entity var9 = (Entity)world.m_6443_(GronckleMaleEntity.class, AABB.m_165882_(new Vec3(x, y, z), 4.0D, 4.0D, 4.0D), (e) -> {
            return true;
         }).stream().sorted(((<undefinedtype>)(new Object() {
            Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
               return Comparator.comparingDouble((_entcnd) -> {
                  return _entcnd.m_20275_(_x, _y, _z);
               });
            }
         })).compareDistOf(x, y, z)).findFirst().orElse((Object)null);
         if (var9 instanceof LivingEntity) {
            LivingEntity _livEnt1 = (LivingEntity)var9;
            if (_livEnt1.m_21023_((MobEffect)HowToOwnADragonModMobEffects.GRONCKLE_IRON_COOLDOWN.get())) {
               return;
            }
         }

         if (((<undefinedtype>)(new Object() {
            public int getAmount(int sltid) {
               if (entity instanceof ServerPlayer) {
                  ServerPlayer _player = (ServerPlayer)entity;
                  AbstractContainerMenu var5 = _player.f_36096_;
                  if (var5 instanceof Supplier) {
                     Supplier _current = (Supplier)var5;
                     Object var6 = _current.get();
                     if (var6 instanceof Map) {
                        Map _slots = (Map)var6;
                        ItemStack stack = ((Slot)_slots.get(sltid)).m_7993_();
                        if (stack != null) {
                           return stack.m_41613_();
                        }
                     }
                  }
               }

               return 0;
            }
         })).getAmount(0) >= 3 && ((<undefinedtype>)(new Object() {
            public int getAmount(int sltid) {
               if (entity instanceof ServerPlayer) {
                  ServerPlayer _player = (ServerPlayer)entity;
                  AbstractContainerMenu var5 = _player.f_36096_;
                  if (var5 instanceof Supplier) {
                     Supplier _current = (Supplier)var5;
                     Object var6 = _current.get();
                     if (var6 instanceof Map) {
                        Map _slots = (Map)var6;
                        ItemStack stack = ((Slot)_slots.get(sltid)).m_7993_();
                        if (stack != null) {
                           return stack.m_41613_();
                        }
                     }
                  }
               }

               return 0;
            }
         })).getAmount(1) >= 2 && ((<undefinedtype>)(new Object() {
            public int getAmount(int sltid) {
               if (entity instanceof ServerPlayer) {
                  ServerPlayer _player = (ServerPlayer)entity;
                  AbstractContainerMenu var5 = _player.f_36096_;
                  if (var5 instanceof Supplier) {
                     Supplier _current = (Supplier)var5;
                     Object var6 = _current.get();
                     if (var6 instanceof Map) {
                        Map _slots = (Map)var6;
                        ItemStack stack = ((Slot)_slots.get(sltid)).m_7993_();
                        if (stack != null) {
                           return stack.m_41613_();
                        }
                     }
                  }
               }

               return 0;
            }
         })).getAmount(2) >= 1) {
            ItemStack var10000;
            AbstractContainerMenu var18;
            Object var23;
            label87: {
               if (entity instanceof ServerPlayer) {
                  ServerPlayer _plrSlotItem = (ServerPlayer)entity;
                  var18 = _plrSlotItem.f_36096_;
                  if (var18 instanceof Supplier) {
                     Supplier _splr = (Supplier)var18;
                     var23 = _splr.get();
                     if (var23 instanceof Map) {
                        Map _slt = (Map)var23;
                        var10000 = ((Slot)_slt.get(0)).m_7993_();
                        break label87;
                     }
                  }
               }

               var10000 = ItemStack.f_41583_;
            }

            if (var10000.m_41720_() == ((Block)HowToOwnADragonModBlocks.LIMESTONE.get()).m_5456_()) {
               label80: {
                  if (entity instanceof ServerPlayer) {
                     ServerPlayer _plrSlotItem = (ServerPlayer)entity;
                     var18 = _plrSlotItem.f_36096_;
                     if (var18 instanceof Supplier) {
                        Supplier _splr = (Supplier)var18;
                        var23 = _splr.get();
                        if (var23 instanceof Map) {
                           Map _slt = (Map)var23;
                           var10000 = ((Slot)_slt.get(1)).m_7993_();
                           break label80;
                        }
                     }
                  }

                  var10000 = ItemStack.f_41583_;
               }

               if (var10000.m_41720_() == Blocks.f_50062_.m_5456_()) {
                  label73: {
                     if (entity instanceof ServerPlayer) {
                        ServerPlayer _plrSlotItem = (ServerPlayer)entity;
                        var18 = _plrSlotItem.f_36096_;
                        if (var18 instanceof Supplier) {
                           Supplier _splr = (Supplier)var18;
                           var23 = _splr.get();
                           if (var23 instanceof Map) {
                              Map _slt = (Map)var23;
                              var10000 = ((Slot)_slt.get(2)).m_7993_();
                              break label73;
                           }
                        }
                     }

                     var10000 = ItemStack.f_41583_;
                  }

                  if (var10000.m_41720_() == Items.f_151050_) {
                     Supplier _current;
                     Map _slots;
                     AbstractContainerMenu var21;
                     ServerPlayer _player;
                     Object var26;
                     if (entity instanceof ServerPlayer) {
                        _player = (ServerPlayer)entity;
                        var21 = _player.f_36096_;
                        if (var21 instanceof Supplier) {
                           _current = (Supplier)var21;
                           var26 = _current.get();
                           if (var26 instanceof Map) {
                              _slots = (Map)var26;
                              ((Slot)_slots.get(0)).m_6201_(3);
                              _player.f_36096_.m_38946_();
                           }
                        }
                     }

                     if (entity instanceof ServerPlayer) {
                        _player = (ServerPlayer)entity;
                        var21 = _player.f_36096_;
                        if (var21 instanceof Supplier) {
                           _current = (Supplier)var21;
                           var26 = _current.get();
                           if (var26 instanceof Map) {
                              _slots = (Map)var26;
                              ((Slot)_slots.get(1)).m_6201_(2);
                              _player.f_36096_.m_38946_();
                           }
                        }
                     }

                     if (entity instanceof ServerPlayer) {
                        _player = (ServerPlayer)entity;
                        var21 = _player.f_36096_;
                        if (var21 instanceof Supplier) {
                           _current = (Supplier)var21;
                           var26 = _current.get();
                           if (var26 instanceof Map) {
                              _slots = (Map)var26;
                              ((Slot)_slots.get(2)).m_6201_(1);
                              _player.f_36096_.m_38946_();
                           }
                        }
                     }

                     if (entity instanceof ServerPlayer) {
                        _player = (ServerPlayer)entity;
                        var21 = _player.f_36096_;
                        if (var21 instanceof Supplier) {
                           _current = (Supplier)var21;
                           var26 = _current.get();
                           if (var26 instanceof Map) {
                              _slots = (Map)var26;
                              ItemStack _setstack = new ItemStack((ItemLike)HowToOwnADragonModItems.GRONCKLE_IRON.get());
                              _setstack.m_41764_(((<undefinedtype>)(new Object() {
                                 public int getAmount(int sltid) {
                                    if (entity instanceof ServerPlayer) {
                                       ServerPlayer _player = (ServerPlayer)entity;
                                       AbstractContainerMenu var5 = _player.f_36096_;
                                       if (var5 instanceof Supplier) {
                                          Supplier _current = (Supplier)var5;
                                          Object var6 = _current.get();
                                          if (var6 instanceof Map) {
                                             Map _slots = (Map)var6;
                                             ItemStack stack = ((Slot)_slots.get(sltid)).m_7993_();
                                             if (stack != null) {
                                                return stack.m_41613_();
                                             }
                                          }
                                       }
                                    }

                                    return 0;
                                 }
                              })).getAmount(3) + 1);
                              ((Slot)_slots.get(3)).m_5852_(_setstack);
                              _player.f_36096_.m_38946_();
                           }
                        }
                     }

                     Entity var25 = (Entity)world.m_6443_(GronckleMaleEntity.class, AABB.m_165882_(new Vec3(x, y, z), 4.0D, 4.0D, 4.0D), (e) -> {
                        return true;
                     }).stream().sorted(((<undefinedtype>)(new Object() {
                        Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                           return Comparator.comparingDouble((_entcnd) -> {
                              return _entcnd.m_20275_(_x, _y, _z);
                           });
                        }
                     })).compareDistOf(x, y, z)).findFirst().orElse((Object)null);
                     if (var25 instanceof LivingEntity) {
                        LivingEntity _entity = (LivingEntity)var25;
                        if (!_entity.f_19853_.m_5776_()) {
                           _entity.m_7292_(new MobEffectInstance((MobEffect)HowToOwnADragonModMobEffects.GRONCKLE_IRON_COOLDOWN.get(), 600, 1, false, false));
                        }
                     }
                  }
               }
            }
         }

      }
   }
}
