package net.mcreator.howtoownadragon.procedures;

import java.util.concurrent.atomic.AtomicReference;
import net.mcreator.howtoownadragon.init.HowToOwnADragonModItems;
import net.minecraft.core.Direction;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.common.capabilities.ForgeCapabilities;

public class DragonEyeItemInHandTickProcedure {
   public static void execute(Entity entity) {
      if (entity != null) {
         Object var10000 = new Object() {
            public ItemStack getItemStack(int sltid, ItemStack _isc) {
               AtomicReference<ItemStack> _retval = new AtomicReference(ItemStack.f_41583_);
               _isc.getCapability(ForgeCapabilities.ITEM_HANDLER, (Direction)null).ifPresent((capability) -> {
                  _retval.set(capability.getStackInSlot(sltid).m_41777_());
               });
               return (ItemStack)_retval.get();
            }
         };
         ItemStack var10002;
         if (entity instanceof LivingEntity) {
            LivingEntity _livEnt = (LivingEntity)entity;
            var10002 = _livEnt.m_21205_();
         } else {
            var10002 = ItemStack.f_41583_;
         }

         LivingEntity _livEnt;
         ItemStack var3;
         if (((<undefinedtype>)var10000).getItemStack(0, var10002).m_41720_() == HowToOwnADragonModItems.LENS_DRAGON_INFO.get()) {
            if (entity instanceof LivingEntity) {
               _livEnt = (LivingEntity)entity;
               var3 = _livEnt.m_21205_();
            } else {
               var3 = ItemStack.f_41583_;
            }

            var3.m_41784_().m_128347_("Lens", 0.0D);
         } else {
            if (entity instanceof LivingEntity) {
               _livEnt = (LivingEntity)entity;
               var3 = _livEnt.m_21205_();
            } else {
               var3 = ItemStack.f_41583_;
            }

            var3.m_41784_().m_128347_("Lens", -1.0D);
         }

      }
   }
}
