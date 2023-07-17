
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.howtoownadragon.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;

import net.mcreator.howtoownadragon.entity.NightFuryEntity;
import net.mcreator.howtoownadragon.entity.MeatlugEntity;
import net.mcreator.howtoownadragon.entity.GroncklePinkEntity;
import net.mcreator.howtoownadragon.entity.GronckleOrangeRedEntity;
import net.mcreator.howtoownadragon.entity.GronckleBlueYellowEntity;
import net.mcreator.howtoownadragon.HowToOwnADragonMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class HowToOwnADragonModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, HowToOwnADragonMod.MODID);
	public static final RegistryObject<EntityType<NightFuryEntity>> NIGHT_FURY = register("night_fury", EntityType.Builder.<NightFuryEntity>of(NightFuryEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
			.setUpdateInterval(3).setCustomClientFactory(NightFuryEntity::new).fireImmune().sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<MeatlugEntity>> MEATLUG = register("meatlug",
			EntityType.Builder.<MeatlugEntity>of(MeatlugEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(MeatlugEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<GronckleBlueYellowEntity>> GRONCKLE_BLUE_YELLOW = register("gronckle_blue_yellow",
			EntityType.Builder.<GronckleBlueYellowEntity>of(GronckleBlueYellowEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(GronckleBlueYellowEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<GroncklePinkEntity>> GRONCKLE_PINK = register("gronckle_pink",
			EntityType.Builder.<GroncklePinkEntity>of(GroncklePinkEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(GroncklePinkEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<GronckleOrangeRedEntity>> GRONCKLE_ORANGE_RED = register("gronckle_orange_red",
			EntityType.Builder.<GronckleOrangeRedEntity>of(GronckleOrangeRedEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(GronckleOrangeRedEntity::new)

					.sized(0.6f, 1.8f));

	private static <T extends Entity> RegistryObject<EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			NightFuryEntity.init();
			MeatlugEntity.init();
			GronckleBlueYellowEntity.init();
			GroncklePinkEntity.init();
			GronckleOrangeRedEntity.init();
		});
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(NIGHT_FURY.get(), NightFuryEntity.createAttributes().build());
		event.put(MEATLUG.get(), MeatlugEntity.createAttributes().build());
		event.put(GRONCKLE_BLUE_YELLOW.get(), GronckleBlueYellowEntity.createAttributes().build());
		event.put(GRONCKLE_PINK.get(), GroncklePinkEntity.createAttributes().build());
		event.put(GRONCKLE_ORANGE_RED.get(), GronckleOrangeRedEntity.createAttributes().build());
	}
}
