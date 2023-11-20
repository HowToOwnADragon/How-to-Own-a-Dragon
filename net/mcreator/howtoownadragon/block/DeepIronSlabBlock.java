package net.mcreator.howtoownadragon.block;

import java.util.Collections;
import java.util.List;
import net.minecraft.core.BlockPos;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.SlabBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour.Properties;
import net.minecraft.world.level.block.state.properties.SlabType;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.storage.loot.LootContext.Builder;

public class DeepIronSlabBlock extends SlabBlock {
   public DeepIronSlabBlock() {
      super(Properties.m_60939_(Material.f_76279_).m_60918_(SoundType.f_56743_).m_60913_(1.0F, 10.0F).m_60988_());
   }

   public int m_7753_(BlockState state, BlockGetter worldIn, BlockPos pos) {
      return 0;
   }

   public List<ItemStack> m_7381_(BlockState state, Builder builder) {
      List<ItemStack> dropsOriginal = super.m_7381_(state, builder);
      return !dropsOriginal.isEmpty() ? dropsOriginal : Collections.singletonList(new ItemStack(this, state.m_61143_(f_56353_) == SlabType.DOUBLE ? 2 : 1));
   }
}
