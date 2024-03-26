
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.howtoownadragon.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.CreativeModeTabEvent;

import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class HowToOwnADragonModTabs {
	@SubscribeEvent
	public static void buildTabContentsVanilla(CreativeModeTabEvent.BuildContents tabData) {

		if (tabData.getTab() == CreativeModeTabs.SPAWN_EGGS) {
			tabData.accept(HowToOwnADragonModItems.YAK_SPAWN_EGG.get());
		}
	}

	@SubscribeEvent
	public static void buildTabContentsModded(CreativeModeTabEvent.Register event) {
		event.registerCreativeModeTab(new ResourceLocation("how_to_own_a_dragon", "items"),
				builder -> builder.title(Component.translatable("item_group.how_to_own_a_dragon.items")).icon(() -> new ItemStack(HowToOwnADragonModItems.NIGHT_FURY_SCALE.get())).displayItems((parameters, tabData) -> {
					tabData.accept(HowToOwnADragonModItems.GRONCKLE_IRON.get());
					tabData.accept(HowToOwnADragonModBlocks.DARK_STONE.get().asItem());
					tabData.accept(HowToOwnADragonModBlocks.DEEP_IRON_BLOCK.get().asItem());
					tabData.accept(HowToOwnADragonModBlocks.DEEP_IRON_ROD.get().asItem());
					tabData.accept(HowToOwnADragonModBlocks.DEEP_IRON_STAIRS.get().asItem());
					tabData.accept(HowToOwnADragonModBlocks.DEEP_IRON_SLAB.get().asItem());
					tabData.accept(HowToOwnADragonModBlocks.DEEP_IRON_DOOR.get().asItem());
					tabData.accept(HowToOwnADragonModItems.DEEP_IRON_INGOT.get());
					tabData.accept(HowToOwnADragonModBlocks.DEEP_IRON_WALL.get().asItem());
					tabData.accept(HowToOwnADragonModBlocks.SLOWING_BLOCK.get().asItem());
					tabData.accept(HowToOwnADragonModItems.DRAGON_EYE.get());
					tabData.accept(HowToOwnADragonModItems.DRAGON_PROOF_METAL.get());
					tabData.accept(HowToOwnADragonModBlocks.DRAGON_PROOF_METAL_BARS.get().asItem());
					tabData.accept(HowToOwnADragonModBlocks.LIMESTONE.get().asItem());
					tabData.accept(HowToOwnADragonModItems.GRONCKLE_SADDLE.get());
					tabData.accept(HowToOwnADragonModItems.SADDLE_RACK.get());
					tabData.accept(HowToOwnADragonModBlocks.PLAINS_GRASS_BLOCK.get().asItem());
					tabData.accept(HowToOwnADragonModBlocks.INCUBATOR_1.get().asItem());
					tabData.accept(HowToOwnADragonModItems.NADDER_SPINE.get());
					tabData.accept(HowToOwnADragonModItems.NADDER_ARROW.get());
					tabData.accept(HowToOwnADragonModItems.NADDER_SADDLE.get());
					tabData.accept(HowToOwnADragonModItems.RAW_YAK_MEAT.get());
					tabData.accept(HowToOwnADragonModItems.COOKED_YAK_MEAT.get());
					tabData.accept(HowToOwnADragonModItems.YAK_MILK.get());
					tabData.accept(HowToOwnADragonModItems.YAK_NOG_BOWL.get());
				})

		);
		event.registerCreativeModeTab(new ResourceLocation("how_to_own_a_dragon", "dragons"),
				builder -> builder.title(Component.translatable("item_group.how_to_own_a_dragon.dragons")).icon(() -> new ItemStack(Items.ENDERMAN_SPAWN_EGG)).displayItems((parameters, tabData) -> {
					tabData.accept(HowToOwnADragonModItems.GRONCKLE_SCALE.get());
					tabData.accept(HowToOwnADragonModItems.GRONCKLE_SPAWN_EGG.get());
					tabData.accept(HowToOwnADragonModItems.TEST_GRONCKLE_SPAWN_EGG.get());
					tabData.accept(HowToOwnADragonModItems.SPAWN_EGG_TT.get());
					tabData.accept(HowToOwnADragonModItems.TT_SCALE.get());
					tabData.accept(HowToOwnADragonModItems.SPAWN_EGG_NADDER.get());
					tabData.accept(HowToOwnADragonModItems.NADDER_SCALE.get());
				})

		);
		event.registerCreativeModeTab(new ResourceLocation("how_to_own_a_dragon", "tools"),
				builder -> builder.title(Component.translatable("item_group.how_to_own_a_dragon.tools")).icon(() -> new ItemStack(HowToOwnADragonModItems.GRONCKLE_IRON_SWORD.get())).displayItems((parameters, tabData) -> {
					tabData.accept(HowToOwnADragonModItems.GRONCKLE_IRON_SWORD.get());
					tabData.accept(HowToOwnADragonModItems.GRONCKLE_IRON_PICKAXE.get());
					tabData.accept(HowToOwnADragonModItems.GRONCKLE_IRON_SHOVEL.get());
					tabData.accept(HowToOwnADragonModItems.GRONCKLE_IRON_AXE.get());
					tabData.accept(HowToOwnADragonModItems.GRONCKLE_IRON_HOE.get());
					tabData.accept(HowToOwnADragonModItems.VALKAS_STAFF.get());
				})

		);
		event.registerCreativeModeTab(new ResourceLocation("how_to_own_a_dragon", "lenses"),
				builder -> builder.title(Component.translatable("item_group.how_to_own_a_dragon.lenses")).icon(() -> new ItemStack(HowToOwnADragonModItems.LENS_DRAGON_INFO.get())).displayItems((parameters, tabData) -> {
					tabData.accept(HowToOwnADragonModItems.LENS_DRAGON_INFO.get());
				})

		);
	}
}
