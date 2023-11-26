
package net.mcreator.howtoownadragon.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;

public class CookedYakMeatItem extends Item {
	public CookedYakMeatItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON).food((new FoodProperties.Builder()).nutrition(8).saturationMod(0.3f).meat().build()));
	}
}
