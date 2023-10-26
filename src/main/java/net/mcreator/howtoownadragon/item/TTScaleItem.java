
package net.mcreator.howtoownadragon.item;

import net.minecraft.world.entity.ai.attributes.Attributes;
import javax.annotation.Nullable;

public class TTScaleItem extends Item {
	public TTScaleItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}