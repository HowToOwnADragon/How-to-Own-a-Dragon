package net.mcreator.howtoownadragon.block;

import java.util.Collections;
import java.util.List;
import net.mcreator.howtoownadragon.procedures.ReaperArrowTrapEntityWalksOnTheBlockProcedure;
import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour.Properties;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.storage.loot.LootContext.Builder;

public class ReaperArrowTrapBlock extends Block {
   public ReaperArrowTrapBlock() {
      super(Properties.m_60939_(Material.f_76320_).m_60918_(SoundType.f_56736_).m_60913_(1.0F, 10.0F));
   }

   public int m_7753_(BlockState state, BlockGetter worldIn, BlockPos pos) {
      return 15;
   }

   public List<ItemStack> m_7381_(BlockState state, Builder builder) {
      List<ItemStack> dropsOriginal = super.m_7381_(state, builder);
      return !dropsOriginal.isEmpty() ? dropsOriginal : Collections.singletonList(new ItemStack(this, 1));
   }

   public void m_141947_(Level world, BlockPos pos, BlockState blockstate, Entity entity) {
      super.m_141947_(world, pos, blockstate, entity);
      ReaperArrowTrapEntityWalksOnTheBlockProcedure.execute(entity);
   }
}
