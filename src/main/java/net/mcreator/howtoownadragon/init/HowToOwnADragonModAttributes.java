/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.howtoownadragon.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.fml.event.lifecycle.FMLConstructModEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.EntityAttributeModificationEvent;

import net.minecraft.world.entity.ai.attributes.RangedAttribute;
import net.minecraft.world.entity.ai.attributes.Attribute;

import net.mcreator.howtoownadragon.HowToOwnADragonMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class HowToOwnADragonModAttributes {
	public static final DeferredRegister<Attribute> ATTRIBUTES = DeferredRegister.create(ForgeRegistries.ATTRIBUTES, HowToOwnADragonMod.MODID);
	public static final RegistryObject<Attribute> GRONCKLEIRONCOOLDOWN = ATTRIBUTES.register("gronckle_iron_cooldown", () -> (new RangedAttribute("attribute." + HowToOwnADragonMod.MODID + ".gronckle_iron_cooldown", 600, 0, 1024)).setSyncable(true));
	public static final RegistryObject<Attribute> GRONCKLEDAMAGE = ATTRIBUTES.register("gronckle_damage", () -> (new RangedAttribute("attribute." + HowToOwnADragonMod.MODID + ".gronckle_damage", 5, 0, 1024)).setSyncable(true));

	@SubscribeEvent
	public static void register(FMLConstructModEvent event) {
		event.enqueueWork(() -> {
			ATTRIBUTES.register(FMLJavaModLoadingContext.get().getModEventBus());
		});
	}

	@SubscribeEvent
	public static void addAttributes(EntityAttributeModificationEvent event) {
		event.add(HowToOwnADragonModEntities.GRONCKLE_MALE.get(), GRONCKLEIRONCOOLDOWN.get());
		event.add(HowToOwnADragonModEntities.GRONCKLE_FEMALE.get(), GRONCKLEIRONCOOLDOWN.get());
		event.add(HowToOwnADragonModEntities.ADOLESCENT_GRONCKLE_MALE.get(), GRONCKLEIRONCOOLDOWN.get());
		event.add(HowToOwnADragonModEntities.ADOLESCENT_GRONCKLE_FEMALE.get(), GRONCKLEIRONCOOLDOWN.get());
		event.add(HowToOwnADragonModEntities.JUVENILE_GRONCKLE_MALE.get(), GRONCKLEIRONCOOLDOWN.get());
		event.add(HowToOwnADragonModEntities.JUVENILE_GRONCKLE_FEMALE.get(), GRONCKLEIRONCOOLDOWN.get());
		event.add(HowToOwnADragonModEntities.BABY_GRONCKLE_MALE.get(), GRONCKLEIRONCOOLDOWN.get());
		event.add(HowToOwnADragonModEntities.BABY_GRONCKLE_FEMALE.get(), GRONCKLEIRONCOOLDOWN.get());
		event.add(HowToOwnADragonModEntities.GRONCKLE_MALE.get(), GRONCKLEDAMAGE.get());
		event.add(HowToOwnADragonModEntities.GRONCKLE_FEMALE.get(), GRONCKLEDAMAGE.get());
		event.add(HowToOwnADragonModEntities.ADOLESCENT_GRONCKLE_MALE.get(), GRONCKLEDAMAGE.get());
		event.add(HowToOwnADragonModEntities.ADOLESCENT_GRONCKLE_FEMALE.get(), GRONCKLEDAMAGE.get());
		event.add(HowToOwnADragonModEntities.JUVENILE_GRONCKLE_MALE.get(), GRONCKLEDAMAGE.get());
		event.add(HowToOwnADragonModEntities.JUVENILE_GRONCKLE_FEMALE.get(), GRONCKLEDAMAGE.get());
		event.add(HowToOwnADragonModEntities.BABY_GRONCKLE_MALE.get(), GRONCKLEDAMAGE.get());
		event.add(HowToOwnADragonModEntities.BABY_GRONCKLE_FEMALE.get(), GRONCKLEDAMAGE.get());
	}
}
