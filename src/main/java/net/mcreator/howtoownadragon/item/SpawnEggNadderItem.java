
package net.mcreator.howtoownadragon.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class SpawnEggNadderItem extends Item {
	public SpawnEggNadderItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.UNCOMMON));
	}
}
