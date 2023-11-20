package net.mcreator.howtoownadragon.item;

import io.netty.buffer.Unpooled;
import java.util.List;
import javax.annotation.Nullable;
import net.mcreator.howtoownadragon.item.inventory.DragonEyeInventoryCapability;
import net.mcreator.howtoownadragon.procedures.DragonEyeItemInHandTickProcedure;
import net.mcreator.howtoownadragon.world.inventory.DragonEyeInputMenu;
import net.minecraft.core.Direction;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.network.chat.Component;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.MenuProvider;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Item.Properties;
import net.minecraft.world.level.Level;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.common.capabilities.ForgeCapabilities;
import net.minecraftforge.common.capabilities.ICapabilityProvider;
import net.minecraftforge.items.ItemStackHandler;
import net.minecraftforge.network.NetworkHooks;

public class DragonEyeItem extends Item {
   public DragonEyeItem() {
      super((new Properties()).m_41487_(1).m_41486_().m_41497_(Rarity.UNCOMMON));
   }

   @OnlyIn(Dist.CLIENT)
   public boolean m_5812_(ItemStack itemstack) {
      return true;
   }

   public void m_7373_(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
      super.m_7373_(itemstack, world, list, flag);
      list.add(Component.m_237113_("§8§o§kddd§r§8§oWhat could this be used for?§r§8§o§kddd"));
   }

   public InteractionResultHolder<ItemStack> m_7203_(Level world, final Player entity, final InteractionHand hand) {
      InteractionResultHolder<ItemStack> ar = super.m_7203_(world, entity, hand);
      ItemStack itemstack = (ItemStack)ar.m_19095_();
      double x = entity.m_20185_();
      double y = entity.m_20186_();
      double z = entity.m_20189_();
      if (entity instanceof ServerPlayer) {
         ServerPlayer serverPlayer = (ServerPlayer)entity;
         NetworkHooks.openScreen(serverPlayer, new MenuProvider() {
            public Component m_5446_() {
               return Component.m_237113_("§oDragon Eye");
            }

            public AbstractContainerMenu m_7208_(int id, Inventory inventory, Player player) {
               FriendlyByteBuf packetBuffer = new FriendlyByteBuf(Unpooled.buffer());
               packetBuffer.m_130064_(entity.m_20183_());
               packetBuffer.writeByte(hand == InteractionHand.MAIN_HAND ? 0 : 1);
               return new DragonEyeInputMenu(id, inventory, packetBuffer);
            }
         }, (buf) -> {
            buf.m_130064_(entity.m_20183_());
            buf.writeByte(hand == InteractionHand.MAIN_HAND ? 0 : 1);
         });
      }

      return ar;
   }

   public void m_6883_(ItemStack itemstack, Level world, Entity entity, int slot, boolean selected) {
      super.m_6883_(itemstack, world, entity, slot, selected);
      if (selected) {
         DragonEyeItemInHandTickProcedure.execute(entity);
      }

   }

   public ICapabilityProvider initCapabilities(ItemStack stack, @Nullable CompoundTag compound) {
      return new DragonEyeInventoryCapability();
   }

   public CompoundTag getShareTag(ItemStack stack) {
      CompoundTag nbt = super.getShareTag(stack);
      if (nbt != null) {
         stack.getCapability(ForgeCapabilities.ITEM_HANDLER, (Direction)null).ifPresent((capability) -> {
            nbt.m_128365_("Inventory", ((ItemStackHandler)capability).serializeNBT());
         });
      }

      return nbt;
   }

   public void readShareTag(ItemStack stack, @Nullable CompoundTag nbt) {
      super.readShareTag(stack, nbt);
      if (nbt != null) {
         stack.getCapability(ForgeCapabilities.ITEM_HANDLER, (Direction)null).ifPresent((capability) -> {
            ((ItemStackHandler)capability).deserializeNBT((CompoundTag)nbt.m_128423_("Inventory"));
         });
      }

   }
}
