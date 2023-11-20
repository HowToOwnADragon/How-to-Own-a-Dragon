package net.mcreator.howtoownadragon.block;

import net.mcreator.howtoownadragon.procedures.SlowingBlockEntityWalksOnTheBlockProcedure;
import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour.Properties;
import net.minecraft.world.level.material.Material;

public class SlowingBlockBlock extends Block {
   public SlowingBlockBlock() {
      super(Properties.m_60939_(Material.f_76320_).m_60918_(SoundType.f_56736_).m_60913_(1.0F, 10.0F).m_222994_());
   }

   public int m_7753_(BlockState state, BlockGetter worldIn, BlockPos pos) {
      return 15;
   }

   public void m_141947_(Level world, BlockPos pos, BlockState blockstate, Entity entity) {
      super.m_141947_(world, pos, blockstate, entity);
      SlowingBlockEntityWalksOnTheBlockProcedure.execute(entity);
   }
}
