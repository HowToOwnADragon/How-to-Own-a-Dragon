
package net.mcreator.howtoownadragon.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class NadderSpineItem extends Item {
	public NadderSpineItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}
