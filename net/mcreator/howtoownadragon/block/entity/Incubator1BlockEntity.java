package net.mcreator.howtoownadragon.block.entity;

import io.netty.buffer.Unpooled;
import java.util.Iterator;
import java.util.stream.IntStream;
import javax.annotation.Nullable;
import net.mcreator.howtoownadragon.init.HowToOwnADragonModBlockEntities;
import net.mcreator.howtoownadragon.world.inventory.Incubator1GUIMenu;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.core.NonNullList;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.network.chat.Component;
import net.minecraft.network.protocol.game.ClientboundBlockEntityDataPacket;
import net.minecraft.world.ContainerHelper;
import net.minecraft.world.WorldlyContainer;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.entity.RandomizableContainerBlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.common.capabilities.ForgeCapabilities;
import net.minecraftforge.common.util.LazyOptional;
import net.minecraftforge.items.IItemHandler;
import net.minecraftforge.items.wrapper.SidedInvWrapper;

public class Incubator1BlockEntity extends RandomizableContainerBlockEntity implements WorldlyContainer {
   private NonNullList<ItemStack> stacks;
   private final LazyOptional<? extends IItemHandler>[] handlers;

   public Incubator1BlockEntity(BlockPos position, BlockState state) {
      super((BlockEntityType)HowToOwnADragonModBlockEntities.INCUBATOR_1.get(), position, state);
      this.stacks = NonNullList.m_122780_(3, ItemStack.f_41583_);
      this.handlers = SidedInvWrapper.create(this, Direction.values());
   }

   public void m_142466_(CompoundTag compound) {
      super.m_142466_(compound);
      if (!this.m_59631_(compound)) {
         this.stacks = NonNullList.m_122780_(this.m_6643_(), ItemStack.f_41583_);
      }

      ContainerHelper.m_18980_(compound, this.stacks);
   }

   public void m_183515_(CompoundTag compound) {
      super.m_183515_(compound);
      if (!this.m_59634_(compound)) {
         ContainerHelper.m_18973_(compound, this.stacks);
      }

   }

   public ClientboundBlockEntityDataPacket getUpdatePacket() {
      return ClientboundBlockEntityDataPacket.m_195640_(this);
   }

   public CompoundTag m_5995_() {
      return this.m_187480_();
   }

   public int m_6643_() {
      return this.stacks.size();
   }

   public boolean m_7983_() {
      Iterator var1 = this.stacks.iterator();

      ItemStack itemstack;
      do {
         if (!var1.hasNext()) {
            return true;
         }

         itemstack = (ItemStack)var1.next();
      } while(itemstack.m_41619_());

      return false;
   }

   public Component m_6820_() {
      return Component.m_237113_("incubator_1");
   }

   public int m_6893_() {
      return 1;
   }

   public AbstractContainerMenu m_6555_(int id, Inventory inventory) {
      return new Incubator1GUIMenu(id, inventory, (new FriendlyByteBuf(Unpooled.buffer())).m_130064_(this.f_58858_));
   }

   public Component m_5446_() {
      return Component.m_237113_("Incubator");
   }

   protected NonNullList<ItemStack> m_7086_() {
      return this.stacks;
   }

   protected void m_6520_(NonNullList<ItemStack> stacks) {
      this.stacks = stacks;
   }

   public boolean m_7013_(int index, ItemStack stack) {
      return index != 2;
   }

   public int[] m_7071_(Direction side) {
      return IntStream.range(0, this.m_6643_()).toArray();
   }

   public boolean m_7155_(int index, ItemStack stack, @Nullable Direction direction) {
      return this.m_7013_(index, stack);
   }

   public boolean m_7157_(int index, ItemStack stack, Direction direction) {
      if (index == 0) {
         return false;
      } else {
         return index != 1;
      }
   }

   public <T> LazyOptional<T> getCapability(Capability<T> capability, @Nullable Direction facing) {
      return !this.f_58859_ && facing != null && capability == ForgeCapabilities.ITEM_HANDLER ? this.handlers[facing.ordinal()].cast() : super.getCapability(capability, facing);
   }

   public void m_7651_() {
      super.m_7651_();
      LazyOptional[] var1 = this.handlers;
      int var2 = var1.length;

      for(int var3 = 0; var3 < var2; ++var3) {
         LazyOptional<? extends IItemHandler> handler = var1[var3];
         handler.invalidate();
      }

   }
}
