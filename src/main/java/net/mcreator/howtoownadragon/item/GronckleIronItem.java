
package net.mcreator.howtoownadragon.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class GronckleIronItem extends Item {
	public GronckleIronItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}