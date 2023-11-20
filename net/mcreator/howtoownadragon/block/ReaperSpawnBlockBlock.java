package net.mcreator.howtoownadragon.block;

import java.util.Collections;
import java.util.List;
import net.mcreator.howtoownadragon.procedures.ReaperSpawnBlockUpdateTickProcedure;
import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.util.RandomSource;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour.Properties;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.storage.loot.LootContext.Builder;

public class ReaperSpawnBlockBlock extends Block {
   public ReaperSpawnBlockBlock() {
      super(Properties.m_60939_(Material.f_76320_).m_60918_(SoundType.f_56736_).m_60913_(1.0F, 10.0F));
   }

   public int m_7753_(BlockState state, BlockGetter worldIn, BlockPos pos) {
      return 15;
   }

   public List<ItemStack> m_7381_(BlockState state, Builder builder) {
      List<ItemStack> dropsOriginal = super.m_7381_(state, builder);
      return !dropsOriginal.isEmpty() ? dropsOriginal : Collections.singletonList(new ItemStack(this, 1));
   }

   public void m_213897_(BlockState blockstate, ServerLevel world, BlockPos pos, RandomSource random) {
      super.m_213897_(blockstate, world, pos, random);
      int x = pos.m_123341_();
      int y = pos.m_123342_();
      int z = pos.m_123343_();
      ReaperSpawnBlockUpdateTickProcedure.execute(world, (double)x, (double)y, (double)z);
   }

   public void m_6402_(Level world, BlockPos pos, BlockState blockstate, LivingEntity entity, ItemStack itemstack) {
      super.m_6402_(world, pos, blockstate, entity, itemstack);
      ReaperSpawnBlockUpdateTickProcedure.execute(world, (double)pos.m_123341_(), (double)pos.m_123342_(), (double)pos.m_123343_());
   }
}
