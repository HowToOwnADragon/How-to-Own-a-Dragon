
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.howtoownadragon.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.CreativeModeTabEvent;

import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class HowToOwnADragonModTabs {
	@SubscribeEvent
	public static void buildTabContentsModded(CreativeModeTabEvent.Register event) {
		event.registerCreativeModeTab(new ResourceLocation("how_to_own_a_dragon", "dragons"),
				builder -> builder.title(Component.translatable("item_group.how_to_own_a_dragon.dragons")).icon(() -> new ItemStack(Items.ENDERMAN_SPAWN_EGG)).displayItems((parameters, tabData) -> {
					tabData.accept(HowToOwnADragonModItems.NIGHT_FURY_SPAWN_EGG.get());
				})

		);
	}
}
