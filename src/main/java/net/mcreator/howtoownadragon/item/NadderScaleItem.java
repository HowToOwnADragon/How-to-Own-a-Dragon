
package net.mcreator.howtoownadragon.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class NadderScaleItem extends Item {
	public NadderScaleItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}
