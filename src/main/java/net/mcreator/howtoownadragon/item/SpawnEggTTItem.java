
package net.mcreator.howtoownadragon.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class SpawnEggTTItem extends Item {
	public SpawnEggTTItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.UNCOMMON));
	}
}
