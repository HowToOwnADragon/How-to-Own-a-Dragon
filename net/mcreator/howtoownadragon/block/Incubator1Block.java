package net.mcreator.howtoownadragon.block;

import io.netty.buffer.Unpooled;
import java.util.Collections;
import java.util.List;
import net.mcreator.howtoownadragon.block.entity.Incubator1BlockEntity;
import net.mcreator.howtoownadragon.procedures.Incubator1TickProcedure;
import net.mcreator.howtoownadragon.world.inventory.Incubator1GUIMenu;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.network.chat.Component;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.util.RandomSource;
import net.minecraft.world.Containers;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.MenuProvider;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.EntityBlock;
import net.minecraft.world.level.block.HorizontalDirectionalBlock;
import net.minecraft.world.level.block.Mirror;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour.Properties;
import net.minecraft.world.level.block.state.StateDefinition.Builder;
import net.minecraft.world.level.block.state.properties.DirectionProperty;
import net.minecraft.world.level.block.state.properties.Property;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.PushReaction;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;
import net.minecraftforge.network.NetworkHooks;

public class Incubator1Block extends Block implements EntityBlock {
   public static final DirectionProperty FACING;

   public Incubator1Block() {
      super(Properties.m_60939_(Material.f_76278_).m_60918_(SoundType.f_56742_).m_60913_(1.0F, 10.0F).m_60999_().m_60955_().m_60924_((bs, br, bp) -> {
         return false;
      }));
      this.m_49959_((BlockState)((BlockState)this.f_49792_.m_61090_()).m_61124_(FACING, Direction.NORTH));
   }

   public boolean m_7420_(BlockState state, BlockGetter reader, BlockPos pos) {
      return true;
   }

   public int m_7753_(BlockState state, BlockGetter worldIn, BlockPos pos) {
      return 0;
   }

   public VoxelShape m_5909_(BlockState state, BlockGetter world, BlockPos pos, CollisionContext context) {
      return Shapes.m_83040_();
   }

   public VoxelShape m_5940_(BlockState state, BlockGetter world, BlockPos pos, CollisionContext context) {
      VoxelShape var10000;
      switch((Direction)state.m_61143_(FACING)) {
      case NORTH:
         var10000 = m_49796_(0.0D, 0.0D, 0.0D, 16.0D, 3.0D, 16.0D);
         break;
      case EAST:
         var10000 = m_49796_(0.0D, 0.0D, 0.0D, 16.0D, 3.0D, 16.0D);
         break;
      case WEST:
         var10000 = m_49796_(0.0D, 0.0D, 0.0D, 16.0D, 3.0D, 16.0D);
         break;
      default:
         var10000 = m_49796_(0.0D, 0.0D, 0.0D, 16.0D, 3.0D, 16.0D);
      }

      return var10000;
   }

   protected void m_7926_(Builder<Block, BlockState> builder) {
      builder.m_61104_(new Property[]{FACING});
   }

   public BlockState m_5573_(BlockPlaceContext context) {
      return (BlockState)this.m_49966_().m_61124_(FACING, context.m_8125_().m_122424_());
   }

   public BlockState m_6843_(BlockState state, Rotation rot) {
      return (BlockState)state.m_61124_(FACING, rot.m_55954_((Direction)state.m_61143_(FACING)));
   }

   public BlockState m_6943_(BlockState state, Mirror mirrorIn) {
      return state.m_60717_(mirrorIn.m_54846_((Direction)state.m_61143_(FACING)));
   }

   public PushReaction m_5537_(BlockState state) {
      return PushReaction.BLOCK;
   }

   public boolean canHarvestBlock(BlockState state, BlockGetter world, BlockPos pos, Player player) {
      Item var6 = player.m_150109_().m_36056_().m_41720_();
      if (var6 instanceof PickaxeItem) {
         PickaxeItem tieredItem = (PickaxeItem)var6;
         return tieredItem.m_43314_().m_6604_() >= 1;
      } else {
         return false;
      }
   }

   public List<ItemStack> m_7381_(BlockState state, net.minecraft.world.level.storage.loot.LootContext.Builder builder) {
      List<ItemStack> dropsOriginal = super.m_7381_(state, builder);
      return !dropsOriginal.isEmpty() ? dropsOriginal : Collections.singletonList(new ItemStack(this, 1));
   }

   public void m_6807_(BlockState blockstate, Level world, BlockPos pos, BlockState oldState, boolean moving) {
      super.m_6807_(blockstate, world, pos, oldState, moving);
      world.m_186460_(pos, this, 1);
   }

   public void m_213897_(BlockState blockstate, ServerLevel world, BlockPos pos, RandomSource random) {
      super.m_213897_(blockstate, world, pos, random);
      int x = pos.m_123341_();
      int y = pos.m_123342_();
      int z = pos.m_123343_();
      Incubator1TickProcedure.execute(world, (double)x, (double)y, (double)z);
      world.m_186460_(pos, this, 1);
   }

   public InteractionResult m_6227_(BlockState blockstate, Level world, final BlockPos pos, Player entity, InteractionHand hand, BlockHitResult hit) {
      super.m_6227_(blockstate, world, pos, entity, hand, hit);
      if (entity instanceof ServerPlayer) {
         ServerPlayer player = (ServerPlayer)entity;
         NetworkHooks.openScreen(player, new MenuProvider() {
            public Component m_5446_() {
               return Component.m_237113_("Incubator");
            }

            public AbstractContainerMenu m_7208_(int id, Inventory inventory, Player player) {
               return new Incubator1GUIMenu(id, inventory, (new FriendlyByteBuf(Unpooled.buffer())).m_130064_(pos));
            }
         }, pos);
      }

      return InteractionResult.SUCCESS;
   }

   public MenuProvider m_7246_(BlockState state, Level worldIn, BlockPos pos) {
      BlockEntity tileEntity = worldIn.m_7702_(pos);
      MenuProvider var10000;
      if (tileEntity instanceof MenuProvider) {
         MenuProvider menuProvider = (MenuProvider)tileEntity;
         var10000 = menuProvider;
      } else {
         var10000 = null;
      }

      return var10000;
   }

   public BlockEntity m_142194_(BlockPos pos, BlockState state) {
      return new Incubator1BlockEntity(pos, state);
   }

   public boolean m_8133_(BlockState state, Level world, BlockPos pos, int eventID, int eventParam) {
      super.m_8133_(state, world, pos, eventID, eventParam);
      BlockEntity blockEntity = world.m_7702_(pos);
      return blockEntity == null ? false : blockEntity.m_7531_(eventID, eventParam);
   }

   public void m_6810_(BlockState state, Level world, BlockPos pos, BlockState newState, boolean isMoving) {
      if (state.m_60734_() != newState.m_60734_()) {
         BlockEntity blockEntity = world.m_7702_(pos);
         if (blockEntity instanceof Incubator1BlockEntity) {
            Incubator1BlockEntity be = (Incubator1BlockEntity)blockEntity;
            Containers.m_19002_(world, pos, be);
            world.m_46717_(pos, this);
         }

         super.m_6810_(state, world, pos, newState, isMoving);
      }

   }

   public boolean m_7278_(BlockState state) {
      return true;
   }

   public int m_6782_(BlockState blockState, Level world, BlockPos pos) {
      BlockEntity tileentity = world.m_7702_(pos);
      if (tileentity instanceof Incubator1BlockEntity) {
         Incubator1BlockEntity be = (Incubator1BlockEntity)tileentity;
         return AbstractContainerMenu.m_38938_(be);
      } else {
         return 0;
      }
   }

   static {
      FACING = HorizontalDirectionalBlock.f_54117_;
   }
}
