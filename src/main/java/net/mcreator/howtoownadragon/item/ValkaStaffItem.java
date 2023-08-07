
package net.mcreator.howtoownadragon.item;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.item.ShearsItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.LivingEntity;

import net.mcreator.howtoownadragon.procedures.ValkaStaffLivingEntityIsHitWithToolProcedure;

public class ValkaStaffItem extends ShearsItem {
	public ValkaStaffItem() {
		super(new Item.Properties().durability(3000));
	}

	@Override
	public int getEnchantmentValue() {
		return 2;
	}

	@Override
	public float getDestroySpeed(ItemStack stack, BlockState blockstate) {
		return 4f;
	}

	@Override
	public boolean hurtEnemy(ItemStack itemstack, LivingEntity entity, LivingEntity sourceentity) {
		boolean retval = super.hurtEnemy(itemstack, entity, sourceentity);
		ValkaStaffLivingEntityIsHitWithToolProcedure.execute(entity, sourceentity);
		return retval;
	}
}
