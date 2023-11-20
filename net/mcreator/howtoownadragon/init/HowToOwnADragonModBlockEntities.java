package net.mcreator.howtoownadragon.init;

import com.mojang.datafixers.types.Type;
import net.mcreator.howtoownadragon.block.entity.Incubator1BlockEntity;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.entity.BlockEntityType.BlockEntitySupplier;
import net.minecraft.world.level.block.entity.BlockEntityType.Builder;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class HowToOwnADragonModBlockEntities {
   public static final DeferredRegister<BlockEntityType<?>> REGISTRY;
   public static final RegistryObject<BlockEntityType<?>> INCUBATOR_1;

   private static RegistryObject<BlockEntityType<?>> register(String registryname, RegistryObject<Block> block, BlockEntitySupplier<?> supplier) {
      return REGISTRY.register(registryname, () -> {
         return Builder.m_155273_(supplier, new Block[]{(Block)block.get()}).m_58966_((Type)null);
      });
   }

   static {
      REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, "how_to_own_a_dragon");
      INCUBATOR_1 = register("incubator_1", HowToOwnADragonModBlocks.INCUBATOR_1, Incubator1BlockEntity::new);
   }
}
