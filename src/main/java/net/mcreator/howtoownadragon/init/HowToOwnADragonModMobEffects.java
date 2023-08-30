
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.howtoownadragon.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.effect.MobEffect;

import net.mcreator.howtoownadragon.potion.HitByArrowMobEffect;
import net.mcreator.howtoownadragon.HowToOwnADragonMod;

public class HowToOwnADragonModMobEffects {
	public static final DeferredRegister<MobEffect> REGISTRY = DeferredRegister.create(ForgeRegistries.MOB_EFFECTS, HowToOwnADragonMod.MODID);
	public static final RegistryObject<MobEffect> HIT_BY_ARROW = REGISTRY.register("hit_by_arrow", () -> new HitByArrowMobEffect());
}
