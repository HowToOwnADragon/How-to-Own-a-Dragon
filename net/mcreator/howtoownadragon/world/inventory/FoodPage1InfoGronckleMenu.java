package net.mcreator.howtoownadragon.world.inventory;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;
import net.mcreator.howtoownadragon.init.HowToOwnADragonModMenus;
import net.minecraft.core.BlockPos;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.inventory.MenuType;
import net.minecraft.world.inventory.Slot;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraftforge.items.IItemHandler;
import net.minecraftforge.items.ItemStackHandler;

public class FoodPage1InfoGronckleMenu extends AbstractContainerMenu implements Supplier<Map<Integer, Slot>> {
   public static final HashMap<String, Object> guistate = new HashMap();
   public final Level world;
   public final Player entity;
   public int x;
   public int y;
   public int z;
   private IItemHandler internal;
   private final Map<Integer, Slot> customSlots = new HashMap();
   private boolean bound = false;

   public FoodPage1InfoGronckleMenu(int id, Inventory inv, FriendlyByteBuf extraData) {
      super((MenuType)HowToOwnADragonModMenus.FOOD_PAGE_1_INFO_GRONCKLE.get(), id);
      this.entity = inv.f_35978_;
      this.world = inv.f_35978_.f_19853_;
      this.internal = new ItemStackHandler(0);
      BlockPos pos = null;
      if (extraData != null) {
         pos = extraData.m_130135_();
         this.x = pos.m_123341_();
         this.y = pos.m_123342_();
         this.z = pos.m_123343_();
      }

   }

   public boolean m_6875_(Player player) {
      return true;
   }

   public ItemStack m_7648_(Player playerIn, int index) {
      return ItemStack.f_41583_;
   }

   public Map<Integer, Slot> get() {
      return this.customSlots;
   }
}
