package net.mcreator.howtoownadragon.item;

import net.mcreator.howtoownadragon.procedures.ValkasStaffLivingEntityIsHitWithToolProcedure;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.Item.Properties;
import net.minecraft.world.item.crafting.Ingredient;

public class ValkasStaffItem extends SwordItem {
   public ValkasStaffItem() {
      super(new Tier() {
         public int m_6609_() {
            return 3000;
         }

         public float m_6624_() {
            return 0.0F;
         }

         public float m_6631_() {
            return -2.0F;
         }

         public int m_6604_() {
            return 0;
         }

         public int m_6601_() {
            return 0;
         }

         public Ingredient m_6282_() {
            return Ingredient.m_151265_();
         }
      }, 3, -3.0F, new Properties());
   }

   public boolean m_7579_(ItemStack itemstack, LivingEntity entity, LivingEntity sourceentity) {
      boolean retval = super.m_7579_(itemstack, entity, sourceentity);
      ValkasStaffLivingEntityIsHitWithToolProcedure.execute(entity, sourceentity);
      return retval;
   }
}
