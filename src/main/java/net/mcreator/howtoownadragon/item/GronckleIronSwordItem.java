
package net.mcreator.howtoownadragon.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.mcreator.howtoownadragon.init.HowToOwnADragonModItems;

public class GronckleIronSwordItem extends SwordItem {
	public GronckleIronSwordItem() {
		super(new Tier() {
			public int getUses() {
				return 2000;
			}

			public float getSpeed() {
				return 10f;
			}

			public float getAttackDamageBonus() {
				return 5f;
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
		}, 3, -2.4f, new Item.Properties());
	}
}
