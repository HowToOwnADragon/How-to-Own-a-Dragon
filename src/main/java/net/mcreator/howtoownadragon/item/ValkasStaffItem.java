
package net.mcreator.howtoownadragon.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.LivingEntity;

import net.mcreator.howtoownadragon.procedures.ValkasStaffLivingEntityIsHitWithToolProcedure;

public class ValkasStaffItem extends SwordItem {
	public ValkasStaffItem() {
		super(new Tier() {
			public int getUses() {
				return 3000;
			}

			public float getSpeed() {
				return 0f;
			}

			public float getAttackDamageBonus() {
				return -2f;
			}

			public int getLevel() {
				return 0;
			}

			public int getEnchantmentValue() {
				return 0;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of();
			}
		}, 3, -3f, new Item.Properties());
	}

	@Override
	public boolean hurtEnemy(ItemStack itemstack, LivingEntity entity, LivingEntity sourceentity) {
		boolean retval = super.hurtEnemy(itemstack, entity, sourceentity);
		ValkasStaffLivingEntityIsHitWithToolProcedure.execute(entity, sourceentity);
		return retval;
	}
}
