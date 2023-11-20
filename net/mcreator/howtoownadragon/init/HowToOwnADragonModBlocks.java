package net.mcreator.howtoownadragon.init;

import net.mcreator.howtoownadragon.block.DarkStoneBlock;
import net.mcreator.howtoownadragon.block.DeepIronBlockBlock;
import net.mcreator.howtoownadragon.block.DeepIronDoorBlock;
import net.mcreator.howtoownadragon.block.DeepIronRodBlock;
import net.mcreator.howtoownadragon.block.DeepIronSlabBlock;
import net.mcreator.howtoownadragon.block.DeepIronStairsBlock;
import net.mcreator.howtoownadragon.block.DeepIronWallBlock;
import net.mcreator.howtoownadragon.block.DragonProofMetalBarsBlock;
import net.mcreator.howtoownadragon.block.Incubator1Block;
import net.mcreator.howtoownadragon.block.LimestoneBlock;
import net.mcreator.howtoownadragon.block.PlainsGrassBlockBlock;
import net.mcreator.howtoownadragon.block.PortalBlockBlock;
import net.mcreator.howtoownadragon.block.ReaperArrowTrapBlock;
import net.mcreator.howtoownadragon.block.ReaperBearTrapBlock;
import net.mcreator.howtoownadragon.block.ReaperPortalBlock;
import net.mcreator.howtoownadragon.block.ReaperSpawnBlockBlock;
import net.mcreator.howtoownadragon.block.ReaperSpikeTrapBlock;
import net.mcreator.howtoownadragon.block.RustyDragonProofMetalBarsBlock;
import net.mcreator.howtoownadragon.block.SlowingBlockBlock;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class HowToOwnADragonModBlocks {
   public static final DeferredRegister<Block> REGISTRY;
   public static final RegistryObject<Block> PORTAL_BLOCK;
   public static final RegistryObject<Block> DARK_STONE;
   public static final RegistryObject<Block> DEEP_IRON_BLOCK;
   public static final RegistryObject<Block> DEEP_IRON_ROD;
   public static final RegistryObject<Block> DEEP_IRON_STAIRS;
   public static final RegistryObject<Block> DEEP_IRON_SLAB;
   public static final RegistryObject<Block> DEEP_IRON_DOOR;
   public static final RegistryObject<Block> DEEP_IRON_WALL;
   public static final RegistryObject<Block> REAPER_PORTAL;
   public static final RegistryObject<Block> REAPER_BEAR_TRAP;
   public static final RegistryObject<Block> REAPER_ARROW_TRAP;
   public static final RegistryObject<Block> SLOWING_BLOCK;
   public static final RegistryObject<Block> DRAGON_PROOF_METAL_BARS;
   public static final RegistryObject<Block> REAPER_SPIKE_TRAP;
   public static final RegistryObject<Block> RUSTY_DRAGON_PROOF_METAL_BARS;
   public static final RegistryObject<Block> REAPER_SPAWN_BLOCK;
   public static final RegistryObject<Block> LIMESTONE;
   public static final RegistryObject<Block> PLAINS_GRASS_BLOCK;
   public static final RegistryObject<Block> INCUBATOR_1;

   static {
      REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, "how_to_own_a_dragon");
      PORTAL_BLOCK = REGISTRY.register("portal_block", () -> {
         return new PortalBlockBlock();
      });
      DARK_STONE = REGISTRY.register("dark_stone", () -> {
         return new DarkStoneBlock();
      });
      DEEP_IRON_BLOCK = REGISTRY.register("deep_iron_block", () -> {
         return new DeepIronBlockBlock();
      });
      DEEP_IRON_ROD = REGISTRY.register("deep_iron_rod", () -> {
         return new DeepIronRodBlock();
      });
      DEEP_IRON_STAIRS = REGISTRY.register("deep_iron_stairs", () -> {
         return new DeepIronStairsBlock();
      });
      DEEP_IRON_SLAB = REGISTRY.register("deep_iron_slab", () -> {
         return new DeepIronSlabBlock();
      });
      DEEP_IRON_DOOR = REGISTRY.register("deep_iron_door", () -> {
         return new DeepIronDoorBlock();
      });
      DEEP_IRON_WALL = REGISTRY.register("deep_iron_wall", () -> {
         return new DeepIronWallBlock();
      });
      REAPER_PORTAL = REGISTRY.register("reaper_portal", () -> {
         return new ReaperPortalBlock();
      });
      REAPER_BEAR_TRAP = REGISTRY.register("reaper_bear_trap", () -> {
         return new ReaperBearTrapBlock();
      });
      REAPER_ARROW_TRAP = REGISTRY.register("reaper_arrow_trap", () -> {
         return new ReaperArrowTrapBlock();
      });
      SLOWING_BLOCK = REGISTRY.register("slowing_block", () -> {
         return new SlowingBlockBlock();
      });
      DRAGON_PROOF_METAL_BARS = REGISTRY.register("dragon_proof_metal_bars", () -> {
         return new DragonProofMetalBarsBlock();
      });
      REAPER_SPIKE_TRAP = REGISTRY.register("reaper_spike_trap", () -> {
         return new ReaperSpikeTrapBlock();
      });
      RUSTY_DRAGON_PROOF_METAL_BARS = REGISTRY.register("rusty_dragon_proof_metal_bars", () -> {
         return new RustyDragonProofMetalBarsBlock();
      });
      REAPER_SPAWN_BLOCK = REGISTRY.register("reaper_spawn_block", () -> {
         return new ReaperSpawnBlockBlock();
      });
      LIMESTONE = REGISTRY.register("limestone", () -> {
         return new LimestoneBlock();
      });
      PLAINS_GRASS_BLOCK = REGISTRY.register("plains_grass_block", () -> {
         return new PlainsGrassBlockBlock();
      });
      INCUBATOR_1 = REGISTRY.register("incubator_1", () -> {
         return new Incubator1Block();
      });
   }
}
