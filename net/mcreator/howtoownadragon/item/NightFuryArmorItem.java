package net.mcreator.howtoownadragon.item;

import net.mcreator.howtoownadragon.init.HowToOwnADragonModItems;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.ArmorItem.Type;
import net.minecraft.world.item.Item.Properties;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.ItemLike;

public abstract class NightFuryArmorItem extends ArmorItem {
   public NightFuryArmorItem(Type type, Properties properties) {
      super(new ArmorMaterial() {
         public int m_266425_(Type type) {
            return (new int[]{13, 15, 16, 11})[type.m_266308_().m_20749_()] * 37;
         }

         public int m_7366_(Type type) {
            return (new int[]{2, 6, 8, 3})[type.m_266308_().m_20749_()];
         }

         public int m_6646_() {
            return 9;
         }

         public SoundEvent m_7344_() {
            return SoundEvents.f_271165_;
         }

         public Ingredient m_6230_() {
            return Ingredient.m_43927_(new ItemStack[]{new ItemStack((ItemLike)HowToOwnADragonModItems.NIGHT_FURY_SCALE.get())});
         }

         public String m_6082_() {
            return "night_fury_armor";
         }

         public float m_6651_() {
            return 3.0F;
         }

         public float m_6649_() {
            return 0.1F;
         }
      }, type, properties);
   }

   public static class Boots extends NightFuryArmorItem {
      public Boots() {
         super(Type.BOOTS, (new Properties()).m_41486_());
      }

      public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
         return "how_to_own_a_dragon:textures/models/armor/nightfury_layer_1_layer_1.png";
      }
   }

   public static class Leggings extends NightFuryArmorItem {
      public Leggings() {
         super(Type.LEGGINGS, (new Properties()).m_41486_());
      }

      public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
         return "how_to_own_a_dragon:textures/models/armor/nightfury_layer_1_layer_2.png";
      }
   }

   public static class Chestplate extends NightFuryArmorItem {
      public Chestplate() {
         super(Type.CHESTPLATE, (new Properties()).m_41486_());
      }

      public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
         return "how_to_own_a_dragon:textures/models/armor/nightfury_layer_1_layer_1.png";
      }
   }

   public static class Helmet extends NightFuryArmorItem {
      public Helmet() {
         super(Type.HELMET, (new Properties()).m_41486_());
      }

      public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
         return "how_to_own_a_dragon:textures/models/armor/nightfury_layer_1_layer_1.png";
      }
   }
}
