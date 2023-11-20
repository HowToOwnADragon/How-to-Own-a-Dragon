package net.mcreator.howtoownadragon.world.inventory;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;
import net.mcreator.howtoownadragon.init.HowToOwnADragonModItems;
import net.mcreator.howtoownadragon.init.HowToOwnADragonModMenus;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.inventory.MenuType;
import net.minecraft.world.inventory.Slot;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraftforge.common.capabilities.ForgeCapabilities;
import net.minecraftforge.items.IItemHandler;
import net.minecraftforge.items.ItemStackHandler;
import net.minecraftforge.items.SlotItemHandler;

public class FemaleGronckleGUIMenu extends AbstractContainerMenu implements Supplier<Map<Integer, Slot>> {
   public static final HashMap<String, Object> guistate = new HashMap();
   public final Level world;
   public final Player entity;
   public int x;
   public int y;
   public int z;
   private IItemHandler internal;
   private final Map<Integer, Slot> customSlots = new HashMap();
   private boolean bound = false;

   public FemaleGronckleGUIMenu(int id, Inventory inv, FriendlyByteBuf extraData) {
      super((MenuType)HowToOwnADragonModMenus.FEMALE_GRONCKLE_GUI.get(), id);
      this.entity = inv.f_35978_;
      this.world = inv.f_35978_.f_19853_;
      this.internal = new ItemStackHandler(1);
      BlockPos pos = null;
      if (extraData != null) {
         pos = extraData.m_130135_();
         this.x = pos.m_123341_();
         this.y = pos.m_123342_();
         this.z = pos.m_123343_();
      }

      if (pos != null) {
         if (extraData.readableBytes() == 1) {
            byte hand = extraData.readByte();
            ItemStack itemstack;
            if (hand == 0) {
               itemstack = this.entity.m_21205_();
            } else {
               itemstack = this.entity.m_21206_();
            }

            itemstack.getCapability(ForgeCapabilities.ITEM_HANDLER, (Direction)null).ifPresent((capability) -> {
               this.internal = capability;
               this.bound = true;
            });
         } else if (extraData.readableBytes() > 1) {
            extraData.readByte();
            Entity entity = this.world.m_6815_(extraData.m_130242_());
            if (entity != null) {
               entity.getCapability(ForgeCapabilities.ITEM_HANDLER, (Direction)null).ifPresent((capability) -> {
                  this.internal = capability;
                  this.bound = true;
               });
            }
         } else {
            BlockEntity ent = inv.f_35978_ != null ? inv.f_35978_.f_19853_.m_7702_(pos) : null;
            if (ent != null) {
               ent.getCapability(ForgeCapabilities.ITEM_HANDLER, (Direction)null).ifPresent((capability) -> {
                  this.internal = capability;
                  this.bound = true;
               });
            }
         }
      }

      this.customSlots.put(0, this.m_38897_(new SlotItemHandler(this.internal, 0, 79, 40) {
         public boolean m_5857_(ItemStack stack) {
            return HowToOwnADragonModItems.SADDLE_RACK.get() == stack.m_41720_();
         }
      }));

      int si;
      for(si = 0; si < 3; ++si) {
         for(int sj = 0; sj < 9; ++sj) {
            this.m_38897_(new Slot(inv, sj + (si + 1) * 9, 8 + sj * 18, 84 + si * 18));
         }
      }

      for(si = 0; si < 9; ++si) {
         this.m_38897_(new Slot(inv, si, 8 + si * 18, 142));
      }

   }

   public boolean m_6875_(Player player) {
      return true;
   }

   public ItemStack m_7648_(Player playerIn, int index) {
      ItemStack itemstack = ItemStack.f_41583_;
      Slot slot = (Slot)this.f_38839_.get(index);
      if (slot != null && slot.m_6657_()) {
         ItemStack itemstack1 = slot.m_7993_();
         itemstack = itemstack1.m_41777_();
         if (index < 1) {
            if (!this.m_38903_(itemstack1, 1, this.f_38839_.size(), true)) {
               return ItemStack.f_41583_;
            }

            slot.m_40234_(itemstack1, itemstack);
         } else if (!this.m_38903_(itemstack1, 0, 1, false)) {
            if (index < 28) {
               if (!this.m_38903_(itemstack1, 28, this.f_38839_.size(), true)) {
                  return ItemStack.f_41583_;
               }
            } else if (!this.m_38903_(itemstack1, 1, 28, false)) {
               return ItemStack.f_41583_;
            }

            return ItemStack.f_41583_;
         }

         if (itemstack1.m_41613_() == 0) {
            slot.m_5852_(ItemStack.f_41583_);
         } else {
            slot.m_6654_();
         }

         if (itemstack1.m_41613_() == itemstack.m_41613_()) {
            return ItemStack.f_41583_;
         }

         slot.m_142406_(playerIn, itemstack1);
      }

      return itemstack;
   }

   protected boolean m_38903_(ItemStack p_38904_, int p_38905_, int p_38906_, boolean p_38907_) {
      boolean flag = false;
      int i = p_38905_;
      if (p_38907_) {
         i = p_38906_ - 1;
      }

      Slot slot1;
      ItemStack itemstack;
      if (p_38904_.m_41753_()) {
         while(!p_38904_.m_41619_()) {
            if (p_38907_) {
               if (i < p_38905_) {
                  break;
               }
            } else if (i >= p_38906_) {
               break;
            }

            slot1 = (Slot)this.f_38839_.get(i);
            itemstack = slot1.m_7993_();
            if (slot1.m_5857_(itemstack) && !itemstack.m_41619_() && ItemStack.m_150942_(p_38904_, itemstack)) {
               int j = itemstack.m_41613_() + p_38904_.m_41613_();
               int maxSize = Math.min(slot1.m_6641_(), p_38904_.m_41741_());
               if (j <= maxSize) {
                  p_38904_.m_41764_(0);
                  itemstack.m_41764_(j);
                  slot1.m_5852_(itemstack);
                  flag = true;
               } else if (itemstack.m_41613_() < maxSize) {
                  p_38904_.m_41774_(maxSize - itemstack.m_41613_());
                  itemstack.m_41764_(maxSize);
                  slot1.m_5852_(itemstack);
                  flag = true;
               }
            }

            if (p_38907_) {
               --i;
            } else {
               ++i;
            }
         }
      }

      if (!p_38904_.m_41619_()) {
         if (p_38907_) {
            i = p_38906_ - 1;
         } else {
            i = p_38905_;
         }

         while(true) {
            if (p_38907_) {
               if (i < p_38905_) {
                  break;
               }
            } else if (i >= p_38906_) {
               break;
            }

            slot1 = (Slot)this.f_38839_.get(i);
            itemstack = slot1.m_7993_();
            if (itemstack.m_41619_() && slot1.m_5857_(p_38904_)) {
               if (p_38904_.m_41613_() > slot1.m_6641_()) {
                  slot1.m_269060_(p_38904_.m_41620_(slot1.m_6641_()));
               } else {
                  slot1.m_269060_(p_38904_.m_41620_(p_38904_.m_41613_()));
               }

               slot1.m_6654_();
               flag = true;
               break;
            }

            if (p_38907_) {
               --i;
            } else {
               ++i;
            }
         }
      }

      return flag;
   }

   public void m_6877_(Player playerIn) {
      super.m_6877_(playerIn);
      if (!this.bound && playerIn instanceof ServerPlayer) {
         ServerPlayer serverPlayer = (ServerPlayer)playerIn;
         int j;
         if (serverPlayer.m_6084_() && !serverPlayer.m_9232_()) {
            for(j = 0; j < this.internal.getSlots(); ++j) {
               playerIn.m_150109_().m_150079_(this.internal.extractItem(j, this.internal.getStackInSlot(j).m_41613_(), false));
            }
         } else {
            for(j = 0; j < this.internal.getSlots(); ++j) {
               playerIn.m_36176_(this.internal.extractItem(j, this.internal.getStackInSlot(j).m_41613_(), false), false);
            }
         }
      }

   }

   public Map<Integer, Slot> get() {
      return this.customSlots;
   }
}
