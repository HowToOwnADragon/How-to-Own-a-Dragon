
package net.mcreator.howtoownadragon.item;

import net.minecraft.world.entity.ai.attributes.Attributes;
import javax.annotation.Nullable;

public class TTEggItemItem extends Item {
	public TTEggItemItem() {
		super(new Item.Properties().stacksTo(1).rarity(Rarity.COMMON));
	}
}