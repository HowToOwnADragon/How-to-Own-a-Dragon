package net.mcreator.howtoownadragon.init;

import net.mcreator.howtoownadragon.potion.AttackCooldownMobEffect;
import net.mcreator.howtoownadragon.potion.BreedingCooldownMobEffect;
import net.mcreator.howtoownadragon.potion.GronckleIronCooldownMobEffect;
import net.mcreator.howtoownadragon.potion.HitByArrowMobEffect;
import net.minecraft.world.effect.MobEffect;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class HowToOwnADragonModMobEffects {
   public static final DeferredRegister<MobEffect> REGISTRY;
   public static final RegistryObject<MobEffect> HIT_BY_ARROW;
   public static final RegistryObject<MobEffect> ATTACK_COOLDOWN;
   public static final RegistryObject<MobEffect> BREEDING_COOLDOWN;
   public static final RegistryObject<MobEffect> GRONCKLE_IRON_COOLDOWN;

   static {
      REGISTRY = DeferredRegister.create(ForgeRegistries.MOB_EFFECTS, "how_to_own_a_dragon");
      HIT_BY_ARROW = REGISTRY.register("hit_by_arrow", () -> {
         return new HitByArrowMobEffect();
      });
      ATTACK_COOLDOWN = REGISTRY.register("attack_cooldown", () -> {
         return new AttackCooldownMobEffect();
      });
      BREEDING_COOLDOWN = REGISTRY.register("breeding_cooldown", () -> {
         return new BreedingCooldownMobEffect();
      });
      GRONCKLE_IRON_COOLDOWN = REGISTRY.register("gronckle_iron_cooldown", () -> {
         return new GronckleIronCooldownMobEffect();
      });
   }
}
