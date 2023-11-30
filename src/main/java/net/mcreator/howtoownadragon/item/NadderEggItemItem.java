
package net.mcreator.howtoownadragon.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class NadderEggItemItem extends Item {
	public NadderEggItemItem() {
		super(new Item.Properties().stacksTo(1).rarity(Rarity.COMMON));
	}
}
