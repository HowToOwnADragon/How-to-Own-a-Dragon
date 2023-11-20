package net.mcreator.howtoownadragon.block;

import java.util.Collections;
import java.util.List;
import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.LightningRodBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour.Properties;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.storage.loot.LootContext.Builder;

public class DeepIronRodBlock extends LightningRodBlock {
   public DeepIronRodBlock() {
      super(Properties.m_60939_(Material.f_76279_).m_60918_(SoundType.f_56743_).m_60913_(1.0F, 10.0F).m_60999_().m_60955_().m_60924_((bs, br, bp) -> {
         return false;
      }).m_60988_());
   }

   public int m_7753_(BlockState state, BlockGetter worldIn, BlockPos pos) {
      return 0;
   }

   public boolean canHarvestBlock(BlockState state, BlockGetter world, BlockPos pos, Player player) {
      Item var6 = player.m_150109_().m_36056_().m_41720_();
      if (var6 instanceof PickaxeItem) {
         PickaxeItem tieredItem = (PickaxeItem)var6;
         return tieredItem.m_43314_().m_6604_() >= 2;
      } else {
         return false;
      }
   }

   public List<ItemStack> m_7381_(BlockState state, Builder builder) {
      List<ItemStack> dropsOriginal = super.m_7381_(state, builder);
      return !dropsOriginal.isEmpty() ? dropsOriginal : Collections.singletonList(new ItemStack(this, 1));
   }
}
