
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

import net.mcreator.howtoownadragon.entity.RTHGronckleEggEntityEntity;
import net.mcreator.howtoownadragon.entity.NightFuryEntity;
import net.mcreator.howtoownadragon.entity.JuvenileGronckleMaleEntity;
import net.mcreator.howtoownadragon.entity.JuvenileGronckleFemaleEntity;
import net.mcreator.howtoownadragon.entity.GronckleEggEntityEntity;
import net.mcreator.howtoownadragon.entity.GronckleAttackEntity;
import net.mcreator.howtoownadragon.entity.BabyGronckleMaleEntity;
import net.mcreator.howtoownadragon.entity.BabyGronckleFemaleEntity;
import net.mcreator.howtoownadragon.entity.AdolescentGronckleMaleEntity;
import net.mcreator.howtoownadragon.entity.AdolescentGronckleFemaleEntity;
import net.mcreator.howtoownadragon.HowToOwnADragonMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class HowToOwnADragonModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, HowToOwnADragonMod.MODID);
	public static final RegistryObject<EntityType<NightFuryEntity>> NIGHT_FURY = register("night_fury", EntityType.Builder.<NightFuryEntity>of(NightFuryEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
			.setUpdateInterval(3).setCustomClientFactory(NightFuryEntity::new).fireImmune().sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<GronckleAttackEntity>> GRONCKLE_ATTACK = register("projectile_gronckle_attack",
			EntityType.Builder.<GronckleAttackEntity>of(GronckleAttackEntity::new, MobCategory.MISC).setCustomClientFactory(GronckleAttackEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<AdolescentGronckleMaleEntity>> ADOLESCENT_GRONCKLE_MALE = register("adolescent_gronckle_male",
			EntityType.Builder.<AdolescentGronckleMaleEntity>of(AdolescentGronckleMaleEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)
					.setCustomClientFactory(AdolescentGronckleMaleEntity::new).fireImmune().sized(1.5f, 1.5f));
	public static final RegistryObject<EntityType<AdolescentGronckleFemaleEntity>> ADOLESCENT_GRONCKLE_FEMALE = register("adolescent_gronckle_female",
			EntityType.Builder.<AdolescentGronckleFemaleEntity>of(AdolescentGronckleFemaleEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)
					.setCustomClientFactory(AdolescentGronckleFemaleEntity::new).fireImmune().sized(1.5f, 1.5f));
	public static final RegistryObject<EntityType<JuvenileGronckleMaleEntity>> JUVENILE_GRONCKLE_MALE = register("juvenile_gronckle_male", EntityType.Builder.<JuvenileGronckleMaleEntity>of(JuvenileGronckleMaleEntity::new, MobCategory.CREATURE)
			.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(JuvenileGronckleMaleEntity::new).fireImmune().sized(1f, 1f));
	public static final RegistryObject<EntityType<JuvenileGronckleFemaleEntity>> JUVENILE_GRONCKLE_FEMALE = register("juvenile_gronckle_female",
			EntityType.Builder.<JuvenileGronckleFemaleEntity>of(JuvenileGronckleFemaleEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)
					.setCustomClientFactory(JuvenileGronckleFemaleEntity::new).fireImmune().sized(1f, 1f));
	public static final RegistryObject<EntityType<BabyGronckleMaleEntity>> BABY_GRONCKLE_MALE = register("baby_gronckle_male", EntityType.Builder.<BabyGronckleMaleEntity>of(BabyGronckleMaleEntity::new, MobCategory.CREATURE)
			.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(BabyGronckleMaleEntity::new).fireImmune().sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<BabyGronckleFemaleEntity>> BABY_GRONCKLE_FEMALE = register("baby_gronckle_female", EntityType.Builder.<BabyGronckleFemaleEntity>of(BabyGronckleFemaleEntity::new, MobCategory.CREATURE)
			.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(BabyGronckleFemaleEntity::new).fireImmune().sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<GronckleEggEntityEntity>> GRONCKLE_EGG_ENTITY = register("gronckle_egg_entity",
			EntityType.Builder.<GronckleEggEntityEntity>of(GronckleEggEntityEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(GronckleEggEntityEntity::new)

					.sized(0.6f, 0.8f));
	public static final RegistryObject<EntityType<RTHGronckleEggEntityEntity>> RTH_GRONCKLE_EGG_ENTITY = register("rth_gronckle_egg_entity",
			EntityType.Builder.<RTHGronckleEggEntityEntity>of(RTHGronckleEggEntityEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)
					.setCustomClientFactory(RTHGronckleEggEntityEntity::new)

					.sized(0.6f, 1.8f));

	private static <T extends Entity> RegistryObject<EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			NightFuryEntity.init();
			AdolescentGronckleMaleEntity.init();
			AdolescentGronckleFemaleEntity.init();
			JuvenileGronckleMaleEntity.init();
			JuvenileGronckleFemaleEntity.init();
			BabyGronckleMaleEntity.init();
			BabyGronckleFemaleEntity.init();
			GronckleEggEntityEntity.init();
			RTHGronckleEggEntityEntity.init();
		});
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(NIGHT_FURY.get(), NightFuryEntity.createAttributes().build());
		event.put(ADOLESCENT_GRONCKLE_MALE.get(), AdolescentGronckleMaleEntity.createAttributes().build());
		event.put(ADOLESCENT_GRONCKLE_FEMALE.get(), AdolescentGronckleFemaleEntity.createAttributes().build());
		event.put(JUVENILE_GRONCKLE_MALE.get(), JuvenileGronckleMaleEntity.createAttributes().build());
		event.put(JUVENILE_GRONCKLE_FEMALE.get(), JuvenileGronckleFemaleEntity.createAttributes().build());
		event.put(BABY_GRONCKLE_MALE.get(), BabyGronckleMaleEntity.createAttributes().build());
		event.put(BABY_GRONCKLE_FEMALE.get(), BabyGronckleFemaleEntity.createAttributes().build());
		event.put(GRONCKLE_EGG_ENTITY.get(), GronckleEggEntityEntity.createAttributes().build());
		event.put(RTH_GRONCKLE_EGG_ENTITY.get(), RTHGronckleEggEntityEntity.createAttributes().build());
	}
}
