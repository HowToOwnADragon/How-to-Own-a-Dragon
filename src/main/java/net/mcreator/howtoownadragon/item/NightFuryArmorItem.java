
package net.mcreator.howtoownadragon.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.Entity;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundEvent;

import net.mcreator.howtoownadragon.init.HowToOwnADragonModItems;

public abstract class NightFuryArmorItem extends ArmorItem {
	public NightFuryArmorItem(ArmorItem.Type type, Item.Properties properties) {
		super(new ArmorMaterial() {
			@Override
			public int getDurabilityForType(ArmorItem.Type type) {
				return new int[]{13, 15, 16, 11}[type.getSlot().getIndex()] * 37;
			}

			@Override
			public int getDefenseForType(ArmorItem.Type type) {
				return new int[]{2, 6, 8, 3}[type.getSlot().getIndex()];
			}

			@Override
			public int getEnchantmentValue() {
				return 9;
			}

			@Override
			public SoundEvent getEquipSound() {
				return SoundEvents.EMPTY;
			}

			@Override
			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(HowToOwnADragonModItems.NIGHT_FURY_SCALE.get()));
			}

			@Override
			public String getName() {
				return "night_fury_armor";
			}

			@Override
			public float getToughness() {
				return 3f;
			}

			@Override
			public float getKnockbackResistance() {
				return 0.1f;
			}
		}, type, properties);
	}

	public static class Helmet extends NightFuryArmorItem {
		public Helmet() {
			super(ArmorItem.Type.HELMET, new Item.Properties().fireResistant());
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "how_to_own_a_dragon:textures/models/armor/nightfury_layer_1_layer_1.png";
		}
	}

	public static class Chestplate extends NightFuryArmorItem {
		public Chestplate() {
			super(ArmorItem.Type.CHESTPLATE, new Item.Properties().fireResistant());
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "how_to_own_a_dragon:textures/models/armor/nightfury_layer_1_layer_1.png";
		}
	}

	public static class Leggings extends NightFuryArmorItem {
		public Leggings() {
			super(ArmorItem.Type.LEGGINGS, new Item.Properties().fireResistant());
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "how_to_own_a_dragon:textures/models/armor/nightfury_layer_1_layer_2.png";
		}
	}

	public static class Boots extends NightFuryArmorItem {
		public Boots() {
			super(ArmorItem.Type.BOOTS, new Item.Properties().fireResistant());
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "how_to_own_a_dragon:textures/models/armor/nightfury_layer_1_layer_1.png";
		}
	}
}
