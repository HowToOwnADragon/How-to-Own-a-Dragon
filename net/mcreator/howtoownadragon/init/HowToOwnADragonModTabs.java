package net.mcreator.howtoownadragon.init;

import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.event.CreativeModeTabEvent.BuildContents;
import net.minecraftforge.event.CreativeModeTabEvent.Register;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;

@EventBusSubscriber(
   bus = Bus.MOD
)
public class HowToOwnADragonModTabs {
   @SubscribeEvent
   public static void buildTabContentsVanilla(BuildContents tabData) {
      if (tabData.getTab() == CreativeModeTabs.f_256731_) {
      }

      if (tabData.getTab() == CreativeModeTabs.f_256869_) {
      }

   }

   @SubscribeEvent
   public static void buildTabContentsModded(Register event) {
      event.registerCreativeModeTab(new ResourceLocation("how_to_own_a_dragon", "items"), (builder) -> {
         builder.m_257941_(Component.m_237115_("item_group.how_to_own_a_dragon.items")).m_257737_(() -> {
            return new ItemStack((ItemLike)HowToOwnADragonModItems.NIGHT_FURY_SCALE.get());
         }).m_257501_((parameters, tabData) -> {
            tabData.m_246326_((ItemLike)HowToOwnADragonModItems.GRONCKLE_IRON.get());
            tabData.m_246326_(((Block)HowToOwnADragonModBlocks.DARK_STONE.get()).m_5456_());
            tabData.m_246326_(((Block)HowToOwnADragonModBlocks.DEEP_IRON_BLOCK.get()).m_5456_());
            tabData.m_246326_(((Block)HowToOwnADragonModBlocks.DEEP_IRON_ROD.get()).m_5456_());
            tabData.m_246326_(((Block)HowToOwnADragonModBlocks.DEEP_IRON_STAIRS.get()).m_5456_());
            tabData.m_246326_(((Block)HowToOwnADragonModBlocks.DEEP_IRON_SLAB.get()).m_5456_());
            tabData.m_246326_(((Block)HowToOwnADragonModBlocks.DEEP_IRON_DOOR.get()).m_5456_());
            tabData.m_246326_((ItemLike)HowToOwnADragonModItems.DEEP_IRON_INGOT.get());
            tabData.m_246326_(((Block)HowToOwnADragonModBlocks.DEEP_IRON_WALL.get()).m_5456_());
            tabData.m_246326_(((Block)HowToOwnADragonModBlocks.SLOWING_BLOCK.get()).m_5456_());
            tabData.m_246326_((ItemLike)HowToOwnADragonModItems.DRAGON_EYE.get());
            tabData.m_246326_((ItemLike)HowToOwnADragonModItems.DRAGON_PROOF_METAL.get());
            tabData.m_246326_(((Block)HowToOwnADragonModBlocks.DRAGON_PROOF_METAL_BARS.get()).m_5456_());
            tabData.m_246326_(((Block)HowToOwnADragonModBlocks.LIMESTONE.get()).m_5456_());
            tabData.m_246326_((ItemLike)HowToOwnADragonModItems.GRONCKLE_SADDLE.get());
            tabData.m_246326_((ItemLike)HowToOwnADragonModItems.SADDLE_RACK.get());
            tabData.m_246326_(((Block)HowToOwnADragonModBlocks.PLAINS_GRASS_BLOCK.get()).m_5456_());
            tabData.m_246326_(((Block)HowToOwnADragonModBlocks.INCUBATOR_1.get()).m_5456_());
            tabData.m_246326_((ItemLike)HowToOwnADragonModItems.NADDER_SPINE.get());
            tabData.m_246326_((ItemLike)HowToOwnADragonModItems.NADDER_ARROW.get());
            tabData.m_246326_((ItemLike)HowToOwnADragonModItems.NADDER_SADDLE.get());
         });
      });
      event.registerCreativeModeTab(new ResourceLocation("how_to_own_a_dragon", "dragons"), (builder) -> {
         builder.m_257941_(Component.m_237115_("item_group.how_to_own_a_dragon.dragons")).m_257737_(() -> {
            return new ItemStack(Items.f_42560_);
         }).m_257501_((parameters, tabData) -> {
            tabData.m_246326_((ItemLike)HowToOwnADragonModItems.GRONCKLE_SCALE.get());
            tabData.m_246326_((ItemLike)HowToOwnADragonModItems.GRONCKLE_SPAWN_EGG.get());
            tabData.m_246326_((ItemLike)HowToOwnADragonModItems.SPAWN_EGG_TT.get());
            tabData.m_246326_((ItemLike)HowToOwnADragonModItems.TT_SCALE.get());
            tabData.m_246326_((ItemLike)HowToOwnADragonModItems.SPAWN_EGG_NADDER.get());
            tabData.m_246326_((ItemLike)HowToOwnADragonModItems.NADDER_SCALE.get());
         });
      });
      event.registerCreativeModeTab(new ResourceLocation("how_to_own_a_dragon", "tools"), (builder) -> {
         builder.m_257941_(Component.m_237115_("item_group.how_to_own_a_dragon.tools")).m_257737_(() -> {
            return new ItemStack((ItemLike)HowToOwnADragonModItems.GRONCKLE_IRON_SWORD.get());
         }).m_257501_((parameters, tabData) -> {
            tabData.m_246326_((ItemLike)HowToOwnADragonModItems.GRONCKLE_IRON_SWORD.get());
            tabData.m_246326_((ItemLike)HowToOwnADragonModItems.GRONCKLE_IRON_PICKAXE.get());
            tabData.m_246326_((ItemLike)HowToOwnADragonModItems.GRONCKLE_IRON_SHOVEL.get());
            tabData.m_246326_((ItemLike)HowToOwnADragonModItems.GRONCKLE_IRON_AXE.get());
            tabData.m_246326_((ItemLike)HowToOwnADragonModItems.GRONCKLE_IRON_HOE.get());
            tabData.m_246326_((ItemLike)HowToOwnADragonModItems.VALKAS_STAFF.get());
         });
      });
      event.registerCreativeModeTab(new ResourceLocation("how_to_own_a_dragon", "lenses"), (builder) -> {
         builder.m_257941_(Component.m_237115_("item_group.how_to_own_a_dragon.lenses")).m_257737_(() -> {
            return new ItemStack((ItemLike)HowToOwnADragonModItems.LENS_DRAGON_INFO.get());
         }).m_257501_((parameters, tabData) -> {
            tabData.m_246326_((ItemLike)HowToOwnADragonModItems.LENS_DRAGON_INFO.get());
         });
      });
   }
}
