package net.mcreator.howtoownadragon.procedures;

import java.util.concurrent.atomic.AtomicReference;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraftforge.common.capabilities.ForgeCapabilities;
import net.minecraftforge.items.IItemHandlerModifiable;

public class NadderIncubator1TickProcedure {
   public static void execute(LevelAccessor world, double x, double y, double z) {
      BlockEntity _ent;
      boolean _slotid;
      ItemStack _setstack;
      boolean _amount;
      if (((<undefinedtype>)(new Object() {
         public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
            AtomicReference<ItemStack> _retval = new AtomicReference(ItemStack.f_41583_);
            BlockEntity _ent = world.m_7702_(pos);
            if (_ent != null) {
               _ent.getCapability(ForgeCapabilities.ITEM_HANDLER, (Direction)null).ifPresent((capability) -> {
                  _retval.set(capability.getStackInSlot(slotid).m_41777_());
               });
            }

            return (ItemStack)_retval.get();
         }
      })).getItemStack(world, BlockPos.m_274561_(x, y, z), 0).m_41784_().m_128461_("naddercolor").equals("stormfly")) {
         _ent = world.m_7702_(BlockPos.m_274561_(x, y, z));
         if (_ent != null) {
            _slotid = true;
            _setstack = ((<undefinedtype>)(new Object() {
               public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
                  AtomicReference<ItemStack> _retval = new AtomicReference(ItemStack.f_41583_);
                  BlockEntity _ent = world.m_7702_(pos);
                  if (_ent != null) {
                     _ent.getCapability(ForgeCapabilities.ITEM_HANDLER, (Direction)null).ifPresent((capability) -> {
                        _retval.set(capability.getStackInSlot(slotid).m_41777_());
                     });
                  }

                  return (ItemStack)_retval.get();
               }
            })).getItemStack(world, BlockPos.m_274561_(x, y, z), 0);
            _setstack.m_41764_(1);
            _ent.getCapability(ForgeCapabilities.ITEM_HANDLER, (Direction)null).ifPresent((capability) -> {
               if (capability instanceof IItemHandlerModifiable) {
                  ((IItemHandlerModifiable)capability).setStackInSlot(2, _setstack);
               }

            });
         }

         _ent = world.m_7702_(BlockPos.m_274561_(x, y, z));
         if (_ent != null) {
            _slotid = false;
            _amount = true;
            _ent.getCapability(ForgeCapabilities.ITEM_HANDLER, (Direction)null).ifPresent((capability) -> {
               if (capability instanceof IItemHandlerModifiable) {
                  ItemStack _stk = capability.getStackInSlot(0).m_41777_();
                  _stk.m_41774_(1);
                  ((IItemHandlerModifiable)capability).setStackInSlot(0, _stk);
               }

            });
         }
      } else if (((<undefinedtype>)(new Object() {
         public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
            AtomicReference<ItemStack> _retval = new AtomicReference(ItemStack.f_41583_);
            BlockEntity _ent = world.m_7702_(pos);
            if (_ent != null) {
               _ent.getCapability(ForgeCapabilities.ITEM_HANDLER, (Direction)null).ifPresent((capability) -> {
                  _retval.set(capability.getStackInSlot(slotid).m_41777_());
               });
            }

            return (ItemStack)_retval.get();
         }
      })).getItemStack(world, BlockPos.m_274561_(x, y, z), 0).m_41784_().m_128461_("naddercolor").equals("red")) {
         _ent = world.m_7702_(BlockPos.m_274561_(x, y, z));
         if (_ent != null) {
            _slotid = true;
            _setstack = ((<undefinedtype>)(new Object() {
               public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
                  AtomicReference<ItemStack> _retval = new AtomicReference(ItemStack.f_41583_);
                  BlockEntity _ent = world.m_7702_(pos);
                  if (_ent != null) {
                     _ent.getCapability(ForgeCapabilities.ITEM_HANDLER, (Direction)null).ifPresent((capability) -> {
                        _retval.set(capability.getStackInSlot(slotid).m_41777_());
                     });
                  }

                  return (ItemStack)_retval.get();
               }
            })).getItemStack(world, BlockPos.m_274561_(x, y, z), 0);
            _setstack.m_41764_(1);
            _ent.getCapability(ForgeCapabilities.ITEM_HANDLER, (Direction)null).ifPresent((capability) -> {
               if (capability instanceof IItemHandlerModifiable) {
                  ((IItemHandlerModifiable)capability).setStackInSlot(2, _setstack);
               }

            });
         }

         _ent = world.m_7702_(BlockPos.m_274561_(x, y, z));
         if (_ent != null) {
            _slotid = false;
            _amount = true;
            _ent.getCapability(ForgeCapabilities.ITEM_HANDLER, (Direction)null).ifPresent((capability) -> {
               if (capability instanceof IItemHandlerModifiable) {
                  ItemStack _stk = capability.getStackInSlot(0).m_41777_();
                  _stk.m_41774_(1);
                  ((IItemHandlerModifiable)capability).setStackInSlot(0, _stk);
               }

            });
         }
      } else if (((<undefinedtype>)(new Object() {
         public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
            AtomicReference<ItemStack> _retval = new AtomicReference(ItemStack.f_41583_);
            BlockEntity _ent = world.m_7702_(pos);
            if (_ent != null) {
               _ent.getCapability(ForgeCapabilities.ITEM_HANDLER, (Direction)null).ifPresent((capability) -> {
                  _retval.set(capability.getStackInSlot(slotid).m_41777_());
               });
            }

            return (ItemStack)_retval.get();
         }
      })).getItemStack(world, BlockPos.m_274561_(x, y, z), 0).m_41784_().m_128461_("naddercolor").equals("purple")) {
         _ent = world.m_7702_(BlockPos.m_274561_(x, y, z));
         if (_ent != null) {
            _slotid = true;
            _setstack = ((<undefinedtype>)(new Object() {
               public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
                  AtomicReference<ItemStack> _retval = new AtomicReference(ItemStack.f_41583_);
                  BlockEntity _ent = world.m_7702_(pos);
                  if (_ent != null) {
                     _ent.getCapability(ForgeCapabilities.ITEM_HANDLER, (Direction)null).ifPresent((capability) -> {
                        _retval.set(capability.getStackInSlot(slotid).m_41777_());
                     });
                  }

                  return (ItemStack)_retval.get();
               }
            })).getItemStack(world, BlockPos.m_274561_(x, y, z), 0);
            _setstack.m_41764_(1);
            _ent.getCapability(ForgeCapabilities.ITEM_HANDLER, (Direction)null).ifPresent((capability) -> {
               if (capability instanceof IItemHandlerModifiable) {
                  ((IItemHandlerModifiable)capability).setStackInSlot(2, _setstack);
               }

            });
         }

         _ent = world.m_7702_(BlockPos.m_274561_(x, y, z));
         if (_ent != null) {
            _slotid = false;
            _amount = true;
            _ent.getCapability(ForgeCapabilities.ITEM_HANDLER, (Direction)null).ifPresent((capability) -> {
               if (capability instanceof IItemHandlerModifiable) {
                  ItemStack _stk = capability.getStackInSlot(0).m_41777_();
                  _stk.m_41774_(1);
                  ((IItemHandlerModifiable)capability).setStackInSlot(0, _stk);
               }

            });
         }
      }

   }
}
