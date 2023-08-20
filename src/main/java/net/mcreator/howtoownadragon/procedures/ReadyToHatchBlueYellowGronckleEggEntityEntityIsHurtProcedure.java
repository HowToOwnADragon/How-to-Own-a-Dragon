package net.mcreator.howtoownadragon.procedures;

import net.minecraftforge.items.ItemHandlerHelper;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;

import net.mcreator.howtoownadragon.init.HowToOwnADragonModItems;

public class ReadyToHatchBlueYellowGronckleEggEntityEntityIsHurtProcedure {
	public static void execute(Entity entity, Entity sourceentity) {
		if (entity == null || sourceentity == null)
			return;
		if (!entity.level.isClientSide())
			entity.discard();
		if (sourceentity instanceof Player _player) {
			ItemStack _setstack = new ItemStack(HowToOwnADragonModItems.READY_TO_HATCH_BLUE_YELLOW_GRONCKLE_EGG_ITEM.get());
			_setstack.setCount(1);
			ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
		}
	}
}
