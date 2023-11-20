package net.mcreator.howtoownadragon.item;

import net.mcreator.howtoownadragon.init.HowToOwnADragonModItems;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.Item.Properties;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.ItemLike;

public class GronckleIronPickaxeItem extends PickaxeItem {
   public GronckleIronPickaxeItem() {
      super(new Tier() {
         public int m_6609_() {
            return 2000;
         }

         public float m_6624_() {
            return 10.0F;
         }

         public float m_6631_() {
            return 2.0F;
         }

         public int m_6604_() {
            return 3;
         }

         public int m_6601_() {
            return 16;
         }

         public Ingredient m_6282_() {
            return Ingredient.m_43927_(new ItemStack[]{new ItemStack((ItemLike)HowToOwnADragonModItems.GRONCKLE_IRON.get())});
         }
      }, 1, -2.7F, new Properties());
   }
}
