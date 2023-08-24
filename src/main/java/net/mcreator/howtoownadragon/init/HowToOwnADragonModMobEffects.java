
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.howtoownadragon.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.effect.MobEffect;

import net.mcreator.howtoownadragon.potion.InLoveMobEffect;
import net.mcreator.howtoownadragon.potion.HitByArrowMobEffect;
import net.mcreator.howtoownadragon.potion.CombatCooldownMobEffect;
import net.mcreator.howtoownadragon.potion.BreedCooldownMobEffect;
import net.mcreator.howtoownadragon.HowToOwnADragonMod;

public class HowToOwnADragonModMobEffects {
	public static final DeferredRegister<MobEffect> REGISTRY = DeferredRegister.create(ForgeRegistries.MOB_EFFECTS, HowToOwnADragonMod.MODID);
	public static final RegistryObject<MobEffect> HIT_BY_ARROW = REGISTRY.register("hit_by_arrow", () -> new HitByArrowMobEffect());
	public static final RegistryObject<MobEffect> IN_LOVE = REGISTRY.register("in_love", () -> new InLoveMobEffect());
	public static final RegistryObject<MobEffect> BREED_COOLDOWN = REGISTRY.register("breed_cooldown", () -> new BreedCooldownMobEffect());
	public static final RegistryObject<MobEffect> COMBAT_COOLDOWN = REGISTRY.register("combat_cooldown", () -> new CombatCooldownMobEffect());
}
