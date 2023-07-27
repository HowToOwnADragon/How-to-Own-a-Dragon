
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.howtoownadragon.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.effect.MobEffect;

import net.mcreator.howtoownadragon.potion.StoneGrowingMobEffect;
import net.mcreator.howtoownadragon.potion.SandStoneGrowingMobEffect;
import net.mcreator.howtoownadragon.potion.IronIngotGrowingMobEffect;
import net.mcreator.howtoownadragon.potion.InLoveMobEffect;
import net.mcreator.howtoownadragon.potion.HitByArrowMobEffect;
import net.mcreator.howtoownadragon.potion.GronckleIronCooldownMobEffect;
import net.mcreator.howtoownadragon.potion.GraniteGrowingMobEffect;
import net.mcreator.howtoownadragon.potion.DioriteGrowingMobEffect;
import net.mcreator.howtoownadragon.potion.DeepslateGrowingMobEffect;
import net.mcreator.howtoownadragon.potion.CobblestoneGrowingMobEffect;
import net.mcreator.howtoownadragon.potion.CobbledDeepslateGrowingMobEffect;
import net.mcreator.howtoownadragon.potion.BucketOfLavaGrowingMobEffect;
import net.mcreator.howtoownadragon.potion.BreedCooldownMobEffect;
import net.mcreator.howtoownadragon.potion.AndesiteGrowingMobEffect;
import net.mcreator.howtoownadragon.HowToOwnADragonMod;

public class HowToOwnADragonModMobEffects {
	public static final DeferredRegister<MobEffect> REGISTRY = DeferredRegister.create(ForgeRegistries.MOB_EFFECTS, HowToOwnADragonMod.MODID);
	public static final RegistryObject<MobEffect> HIT_BY_ARROW = REGISTRY.register("hit_by_arrow", () -> new HitByArrowMobEffect());
	public static final RegistryObject<MobEffect> STONE_GROWING = REGISTRY.register("stone_growing", () -> new StoneGrowingMobEffect());
	public static final RegistryObject<MobEffect> COBBLESTONE_GROWING = REGISTRY.register("cobblestone_growing", () -> new CobblestoneGrowingMobEffect());
	public static final RegistryObject<MobEffect> DEEPSLATE_GROWING = REGISTRY.register("deepslate_growing", () -> new DeepslateGrowingMobEffect());
	public static final RegistryObject<MobEffect> COBBLED_DEEPSLATE_GROWING = REGISTRY.register("cobbled_deepslate_growing", () -> new CobbledDeepslateGrowingMobEffect());
	public static final RegistryObject<MobEffect> DIORITE_GROWING = REGISTRY.register("diorite_growing", () -> new DioriteGrowingMobEffect());
	public static final RegistryObject<MobEffect> GRANITE_GROWING = REGISTRY.register("granite_growing", () -> new GraniteGrowingMobEffect());
	public static final RegistryObject<MobEffect> ANDESITE_GROWING = REGISTRY.register("andesite_growing", () -> new AndesiteGrowingMobEffect());
	public static final RegistryObject<MobEffect> BUCKET_OF_LAVA_GROWING = REGISTRY.register("bucket_of_lava_growing", () -> new BucketOfLavaGrowingMobEffect());
	public static final RegistryObject<MobEffect> IRON_INGOT_GROWING = REGISTRY.register("iron_ingot_growing", () -> new IronIngotGrowingMobEffect());
	public static final RegistryObject<MobEffect> SAND_STONE_GROWING = REGISTRY.register("sand_stone_growing", () -> new SandStoneGrowingMobEffect());
	public static final RegistryObject<MobEffect> IN_LOVE = REGISTRY.register("in_love", () -> new InLoveMobEffect());
	public static final RegistryObject<MobEffect> BREED_COOLDOWN = REGISTRY.register("breed_cooldown", () -> new BreedCooldownMobEffect());
	public static final RegistryObject<MobEffect> GRONCKLE_IRON_COOLDOWN = REGISTRY.register("gronckle_iron_cooldown", () -> new GronckleIronCooldownMobEffect());
}
