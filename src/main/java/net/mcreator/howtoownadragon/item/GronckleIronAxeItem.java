
package net.mcreator.howtoownadragon.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.AxeItem;

import net.mcreator.howtoownadragon.init.HowToOwnADragonModItems;

public class GronckleIronAxeItem extends AxeItem {
	public GronckleIronAxeItem() {
		super(new Tier() {
			public int getUses() {
				return 2000;
			}

			public float getSpeed() {
				return 10f;
			}

			public float getAttackDamageBonus() {
				return 8f;
			}

			public int getLevel() {
				return 3;
			}

			public int getEnchantmentValue() {
				return 16;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(HowToOwnADragonModItems.GRONCKLE_IRON.get()));
			}
		}, 1, -2.9f, new Item.Properties());
	}
}
