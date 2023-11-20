package net.mcreator.howtoownadragon.init;

import net.mcreator.howtoownadragon.item.DeepIronIngotItem;
import net.mcreator.howtoownadragon.item.DragonEyeItem;
import net.mcreator.howtoownadragon.item.DragonProofMetalItem;
import net.mcreator.howtoownadragon.item.DragonSymbolItem;
import net.mcreator.howtoownadragon.item.GronckleAttackItem;
import net.mcreator.howtoownadragon.item.GronckleEggItemItem;
import net.mcreator.howtoownadragon.item.GronckleIronAxeItem;
import net.mcreator.howtoownadragon.item.GronckleIronHoeItem;
import net.mcreator.howtoownadragon.item.GronckleIronItem;
import net.mcreator.howtoownadragon.item.GronckleIronPickaxeItem;
import net.mcreator.howtoownadragon.item.GronckleIronShovelItem;
import net.mcreator.howtoownadragon.item.GronckleIronSwordItem;
import net.mcreator.howtoownadragon.item.GronckleSaddleItem;
import net.mcreator.howtoownadragon.item.GronckleScaleItem;
import net.mcreator.howtoownadragon.item.GronckleSpawnEggItem;
import net.mcreator.howtoownadragon.item.LensDragonInfoItem;
import net.mcreator.howtoownadragon.item.NadderArrowItem;
import net.mcreator.howtoownadragon.item.NadderEggItemItem;
import net.mcreator.howtoownadragon.item.NadderSaddleItem;
import net.mcreator.howtoownadragon.item.NadderScaleItem;
import net.mcreator.howtoownadragon.item.NadderSpineItem;
import net.mcreator.howtoownadragon.item.NightFuryArmorItem;
import net.mcreator.howtoownadragon.item.NightFuryScaleItem;
import net.mcreator.howtoownadragon.item.SaddleRackItem;
import net.mcreator.howtoownadragon.item.SpawnEggNadderItem;
import net.mcreator.howtoownadragon.item.SpawnEggTTItem;
import net.mcreator.howtoownadragon.item.TTEggItemItem;
import net.mcreator.howtoownadragon.item.TTScaleItem;
import net.mcreator.howtoownadragon.item.ValkasStaffItem;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.DoubleHighBlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Item.Properties;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class HowToOwnADragonModItems {
   public static final DeferredRegister<Item> REGISTRY;
   public static final RegistryObject<Item> PORTAL_BLOCK;
   public static final RegistryObject<Item> NIGHT_FURY_SCALE;
   public static final RegistryObject<Item> NIGHT_FURY_ARMOR_HELMET;
   public static final RegistryObject<Item> NIGHT_FURY_ARMOR_CHESTPLATE;
   public static final RegistryObject<Item> NIGHT_FURY_ARMOR_LEGGINGS;
   public static final RegistryObject<Item> NIGHT_FURY_ARMOR_BOOTS;
   public static final RegistryObject<Item> GRONCKLE_IRON;
   public static final RegistryObject<Item> GRONCKLE_IRON_SWORD;
   public static final RegistryObject<Item> GRONCKLE_IRON_PICKAXE;
   public static final RegistryObject<Item> GRONCKLE_IRON_SHOVEL;
   public static final RegistryObject<Item> GRONCKLE_IRON_AXE;
   public static final RegistryObject<Item> DARK_STONE;
   public static final RegistryObject<Item> DEEP_IRON_BLOCK;
   public static final RegistryObject<Item> DEEP_IRON_ROD;
   public static final RegistryObject<Item> DEEP_IRON_STAIRS;
   public static final RegistryObject<Item> DEEP_IRON_SLAB;
   public static final RegistryObject<Item> DEEP_IRON_DOOR;
   public static final RegistryObject<Item> DEEP_IRON_INGOT;
   public static final RegistryObject<Item> DRAGON_SYMBOL;
   public static final RegistryObject<Item> GRONCKLE_SCALE;
   public static final RegistryObject<Item> DEEP_IRON_WALL;
   public static final RegistryObject<Item> REAPER_PORTAL;
   public static final RegistryObject<Item> REAPER_BEAR_TRAP;
   public static final RegistryObject<Item> REAPER_ARROW_TRAP;
   public static final RegistryObject<Item> SLOWING_BLOCK;
   public static final RegistryObject<Item> DRAGON_EYE;
   public static final RegistryObject<Item> DRAGON_PROOF_METAL;
   public static final RegistryObject<Item> DRAGON_PROOF_METAL_BARS;
   public static final RegistryObject<Item> REAPER_SPIKE_TRAP;
   public static final RegistryObject<Item> RUSTY_DRAGON_PROOF_METAL_BARS;
   public static final RegistryObject<Item> REAPER_SPAWN_BLOCK;
   public static final RegistryObject<Item> LIMESTONE;
   public static final RegistryObject<Item> LENS_DRAGON_INFO;
   public static final RegistryObject<Item> GRONCKLE_ATTACK;
   public static final RegistryObject<Item> GRONCKLE_SADDLE;
   public static final RegistryObject<Item> SADDLE_RACK;
   public static final RegistryObject<Item> PLAINS_GRASS_BLOCK;
   public static final RegistryObject<Item> GRONCKLE_IRON_HOE;
   public static final RegistryObject<Item> INCUBATOR_1;
   public static final RegistryObject<Item> GRONCKLE_EGG_ITEM;
   public static final RegistryObject<Item> GRONCKLE_SPAWN_EGG;
   public static final RegistryObject<Item> VALKAS_STAFF;
   public static final RegistryObject<Item> SPAWN_EGG_TT;
   public static final RegistryObject<Item> TT_SCALE;
   public static final RegistryObject<Item> TT_EGG_ITEM;
   public static final RegistryObject<Item> SPAWN_EGG_NADDER;
   public static final RegistryObject<Item> NADDER_SCALE;
   public static final RegistryObject<Item> NADDER_SPINE;
   public static final RegistryObject<Item> NADDER_ARROW;
   public static final RegistryObject<Item> NADDER_SADDLE;
   public static final RegistryObject<Item> NADDER_EGG_ITEM;

   private static RegistryObject<Item> block(RegistryObject<Block> block) {
      return REGISTRY.register(block.getId().m_135815_(), () -> {
         return new BlockItem((Block)block.get(), new Properties());
      });
   }

   private static RegistryObject<Item> doubleBlock(RegistryObject<Block> block) {
      return REGISTRY.register(block.getId().m_135815_(), () -> {
         return new DoubleHighBlockItem((Block)block.get(), new Properties());
      });
   }

   static {
      REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, "how_to_own_a_dragon");
      PORTAL_BLOCK = block(HowToOwnADragonModBlocks.PORTAL_BLOCK);
      NIGHT_FURY_SCALE = REGISTRY.register("night_fury_scale", () -> {
         return new NightFuryScaleItem();
      });
      NIGHT_FURY_ARMOR_HELMET = REGISTRY.register("night_fury_armor_helmet", () -> {
         return new NightFuryArmorItem.Helmet();
      });
      NIGHT_FURY_ARMOR_CHESTPLATE = REGISTRY.register("night_fury_armor_chestplate", () -> {
         return new NightFuryArmorItem.Chestplate();
      });
      NIGHT_FURY_ARMOR_LEGGINGS = REGISTRY.register("night_fury_armor_leggings", () -> {
         return new NightFuryArmorItem.Leggings();
      });
      NIGHT_FURY_ARMOR_BOOTS = REGISTRY.register("night_fury_armor_boots", () -> {
         return new NightFuryArmorItem.Boots();
      });
      GRONCKLE_IRON = REGISTRY.register("gronckle_iron", () -> {
         return new GronckleIronItem();
      });
      GRONCKLE_IRON_SWORD = REGISTRY.register("gronckle_iron_sword", () -> {
         return new GronckleIronSwordItem();
      });
      GRONCKLE_IRON_PICKAXE = REGISTRY.register("gronckle_iron_pickaxe", () -> {
         return new GronckleIronPickaxeItem();
      });
      GRONCKLE_IRON_SHOVEL = REGISTRY.register("gronckle_iron_shovel", () -> {
         return new GronckleIronShovelItem();
      });
      GRONCKLE_IRON_AXE = REGISTRY.register("gronckle_iron_axe", () -> {
         return new GronckleIronAxeItem();
      });
      DARK_STONE = block(HowToOwnADragonModBlocks.DARK_STONE);
      DEEP_IRON_BLOCK = block(HowToOwnADragonModBlocks.DEEP_IRON_BLOCK);
      DEEP_IRON_ROD = block(HowToOwnADragonModBlocks.DEEP_IRON_ROD);
      DEEP_IRON_STAIRS = block(HowToOwnADragonModBlocks.DEEP_IRON_STAIRS);
      DEEP_IRON_SLAB = block(HowToOwnADragonModBlocks.DEEP_IRON_SLAB);
      DEEP_IRON_DOOR = doubleBlock(HowToOwnADragonModBlocks.DEEP_IRON_DOOR);
      DEEP_IRON_INGOT = REGISTRY.register("deep_iron_ingot", () -> {
         return new DeepIronIngotItem();
      });
      DRAGON_SYMBOL = REGISTRY.register("dragon_symbol", () -> {
         return new DragonSymbolItem();
      });
      GRONCKLE_SCALE = REGISTRY.register("gronckle_scale", () -> {
         return new GronckleScaleItem();
      });
      DEEP_IRON_WALL = block(HowToOwnADragonModBlocks.DEEP_IRON_WALL);
      REAPER_PORTAL = block(HowToOwnADragonModBlocks.REAPER_PORTAL);
      REAPER_BEAR_TRAP = block(HowToOwnADragonModBlocks.REAPER_BEAR_TRAP);
      REAPER_ARROW_TRAP = block(HowToOwnADragonModBlocks.REAPER_ARROW_TRAP);
      SLOWING_BLOCK = block(HowToOwnADragonModBlocks.SLOWING_BLOCK);
      DRAGON_EYE = REGISTRY.register("dragon_eye", () -> {
         return new DragonEyeItem();
      });
      DRAGON_PROOF_METAL = REGISTRY.register("dragon_proof_metal", () -> {
         return new DragonProofMetalItem();
      });
      DRAGON_PROOF_METAL_BARS = block(HowToOwnADragonModBlocks.DRAGON_PROOF_METAL_BARS);
      REAPER_SPIKE_TRAP = block(HowToOwnADragonModBlocks.REAPER_SPIKE_TRAP);
      RUSTY_DRAGON_PROOF_METAL_BARS = block(HowToOwnADragonModBlocks.RUSTY_DRAGON_PROOF_METAL_BARS);
      REAPER_SPAWN_BLOCK = block(HowToOwnADragonModBlocks.REAPER_SPAWN_BLOCK);
      LIMESTONE = block(HowToOwnADragonModBlocks.LIMESTONE);
      LENS_DRAGON_INFO = REGISTRY.register("lens_dragon_info", () -> {
         return new LensDragonInfoItem();
      });
      GRONCKLE_ATTACK = REGISTRY.register("gronckle_attack", () -> {
         return new GronckleAttackItem();
      });
      GRONCKLE_SADDLE = REGISTRY.register("gronckle_saddle", () -> {
         return new GronckleSaddleItem();
      });
      SADDLE_RACK = REGISTRY.register("saddle_rack", () -> {
         return new SaddleRackItem();
      });
      PLAINS_GRASS_BLOCK = block(HowToOwnADragonModBlocks.PLAINS_GRASS_BLOCK);
      GRONCKLE_IRON_HOE = REGISTRY.register("gronckle_iron_hoe", () -> {
         return new GronckleIronHoeItem();
      });
      INCUBATOR_1 = block(HowToOwnADragonModBlocks.INCUBATOR_1);
      GRONCKLE_EGG_ITEM = REGISTRY.register("gronckle_egg_item", () -> {
         return new GronckleEggItemItem();
      });
      GRONCKLE_SPAWN_EGG = REGISTRY.register("gronckle_spawn_egg", () -> {
         return new GronckleSpawnEggItem();
      });
      VALKAS_STAFF = REGISTRY.register("valkas_staff", () -> {
         return new ValkasStaffItem();
      });
      SPAWN_EGG_TT = REGISTRY.register("spawn_egg_tt", () -> {
         return new SpawnEggTTItem();
      });
      TT_SCALE = REGISTRY.register("tt_scale", () -> {
         return new TTScaleItem();
      });
      TT_EGG_ITEM = REGISTRY.register("tt_egg_item", () -> {
         return new TTEggItemItem();
      });
      SPAWN_EGG_NADDER = REGISTRY.register("spawn_egg_nadder", () -> {
         return new SpawnEggNadderItem();
      });
      NADDER_SCALE = REGISTRY.register("nadder_scale", () -> {
         return new NadderScaleItem();
      });
      NADDER_SPINE = REGISTRY.register("nadder_spine", () -> {
         return new NadderSpineItem();
      });
      NADDER_ARROW = REGISTRY.register("nadder_arrow", () -> {
         return new NadderArrowItem();
      });
      NADDER_SADDLE = REGISTRY.register("nadder_saddle", () -> {
         return new NadderSaddleItem();
      });
      NADDER_EGG_ITEM = REGISTRY.register("nadder_egg_item", () -> {
         return new NadderEggItemItem();
      });
   }
}
