
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
import net.mcreator.howtoownadragon.entity.JuvenileMeatlugEntity;
import net.mcreator.howtoownadragon.entity.JuvenileGroncklePinkEntity;
import net.mcreator.howtoownadragon.entity.JuvenileGronckleOrangeRedEntity;
import net.mcreator.howtoownadragon.entity.JuvenileGronckleBlueYellowEntity;
import net.mcreator.howtoownadragon.entity.GroncklePinkEntity;
import net.mcreator.howtoownadragon.entity.GronckleOrangeRedEntity;
import net.mcreator.howtoownadragon.entity.GronckleBlueYellowEntity;
import net.mcreator.howtoownadragon.entity.BabyMeatlugEntity;
import net.mcreator.howtoownadragon.entity.BabyGroncklePinkEntity;
import net.mcreator.howtoownadragon.entity.BabyGronckleOrangeRedEntity;
import net.mcreator.howtoownadragon.entity.BabyGronckleBlueYellowEntity;
import net.mcreator.howtoownadragon.entity.AdolescentMeatlugEntity;
import net.mcreator.howtoownadragon.entity.AdolescentGronckleBlueYellowEntity;
import net.mcreator.howtoownadragon.entity.AdolecsentGroncklePinkEntity;
import net.mcreator.howtoownadragon.entity.AdolecsentGronckleOrangeRedEntity;
import net.mcreator.howtoownadragon.HowToOwnADragonMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class HowToOwnADragonModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, HowToOwnADragonMod.MODID);
	public static final RegistryObject<EntityType<NightFuryEntity>> NIGHT_FURY = register("night_fury", EntityType.Builder.<NightFuryEntity>of(NightFuryEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
			.setUpdateInterval(3).setCustomClientFactory(NightFuryEntity::new).fireImmune().sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<MeatlugEntity>> MEATLUG = register("meatlug",
			EntityType.Builder.<MeatlugEntity>of(MeatlugEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(MeatlugEntity::new)

					.sized(2f, 2f));
	public static final RegistryObject<EntityType<GronckleBlueYellowEntity>> GRONCKLE_BLUE_YELLOW = register("gronckle_blue_yellow",
			EntityType.Builder.<GronckleBlueYellowEntity>of(GronckleBlueYellowEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(GronckleBlueYellowEntity::new)

					.sized(2f, 2f));
	public static final RegistryObject<EntityType<GroncklePinkEntity>> GRONCKLE_PINK = register("gronckle_pink",
			EntityType.Builder.<GroncklePinkEntity>of(GroncklePinkEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(GroncklePinkEntity::new)

					.sized(2f, 2f));
	public static final RegistryObject<EntityType<GronckleOrangeRedEntity>> GRONCKLE_ORANGE_RED = register("gronckle_orange_red",
			EntityType.Builder.<GronckleOrangeRedEntity>of(GronckleOrangeRedEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(GronckleOrangeRedEntity::new)

					.sized(2f, 2f));
	public static final RegistryObject<EntityType<AdolescentMeatlugEntity>> ADOLESCENT_MEATLUG = register("adolescent_meatlug",
			EntityType.Builder.<AdolescentMeatlugEntity>of(AdolescentMeatlugEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(AdolescentMeatlugEntity::new)

					.sized(1.5f, 1.5f));
	public static final RegistryObject<EntityType<AdolescentGronckleBlueYellowEntity>> ADOLESCENT_GRONCKLE_BLUE_YELLOW = register("adolescent_gronckle_blue_yellow",
			EntityType.Builder.<AdolescentGronckleBlueYellowEntity>of(AdolescentGronckleBlueYellowEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)
					.setCustomClientFactory(AdolescentGronckleBlueYellowEntity::new)

					.sized(1.5f, 1.5f));
	public static final RegistryObject<EntityType<AdolecsentGroncklePinkEntity>> ADOLECSENT_GRONCKLE_PINK = register("adolecsent_gronckle_pink",
			EntityType.Builder.<AdolecsentGroncklePinkEntity>of(AdolecsentGroncklePinkEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)
					.setCustomClientFactory(AdolecsentGroncklePinkEntity::new)

					.sized(1.5f, 1.5f));
	public static final RegistryObject<EntityType<AdolecsentGronckleOrangeRedEntity>> ADOLECSENT_GRONCKLE_ORANGE_RED = register("adolecsent_gronckle_orange_red",
			EntityType.Builder.<AdolecsentGronckleOrangeRedEntity>of(AdolecsentGronckleOrangeRedEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)
					.setCustomClientFactory(AdolecsentGronckleOrangeRedEntity::new)

					.sized(1.5f, 1.5f));
	public static final RegistryObject<EntityType<JuvenileMeatlugEntity>> JUVENILE_MEATLUG = register("juvenile_meatlug",
			EntityType.Builder.<JuvenileMeatlugEntity>of(JuvenileMeatlugEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(JuvenileMeatlugEntity::new)

					.sized(1f, 1f));
	public static final RegistryObject<EntityType<JuvenileGronckleBlueYellowEntity>> JUVENILE_GRONCKLE_BLUE_YELLOW = register("juvenile_gronckle_blue_yellow",
			EntityType.Builder.<JuvenileGronckleBlueYellowEntity>of(JuvenileGronckleBlueYellowEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)
					.setCustomClientFactory(JuvenileGronckleBlueYellowEntity::new)

					.sized(1f, 1f));
	public static final RegistryObject<EntityType<JuvenileGroncklePinkEntity>> JUVENILE_GRONCKLE_PINK = register("juvenile_gronckle_pink",
			EntityType.Builder.<JuvenileGroncklePinkEntity>of(JuvenileGroncklePinkEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)
					.setCustomClientFactory(JuvenileGroncklePinkEntity::new)

					.sized(1f, 1f));
	public static final RegistryObject<EntityType<JuvenileGronckleOrangeRedEntity>> JUVENILE_GRONCKLE_ORANGE_RED = register("juvenile_gronckle_orange_red",
			EntityType.Builder.<JuvenileGronckleOrangeRedEntity>of(JuvenileGronckleOrangeRedEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)
					.setCustomClientFactory(JuvenileGronckleOrangeRedEntity::new)

					.sized(1f, 1f));
	public static final RegistryObject<EntityType<BabyMeatlugEntity>> BABY_MEATLUG = register("baby_meatlug",
			EntityType.Builder.<BabyMeatlugEntity>of(BabyMeatlugEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(BabyMeatlugEntity::new)

					.sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<BabyGronckleBlueYellowEntity>> BABY_GRONCKLE_BLUE_YELLOW = register("baby_gronckle_blue_yellow",
			EntityType.Builder.<BabyGronckleBlueYellowEntity>of(BabyGronckleBlueYellowEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)
					.setCustomClientFactory(BabyGronckleBlueYellowEntity::new)

					.sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<BabyGroncklePinkEntity>> BABY_GRONCKLE_PINK = register("baby_gronckle_pink",
			EntityType.Builder.<BabyGroncklePinkEntity>of(BabyGroncklePinkEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(BabyGroncklePinkEntity::new)

					.sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<BabyGronckleOrangeRedEntity>> BABY_GRONCKLE_ORANGE_RED = register("baby_gronckle_orange_red",
			EntityType.Builder.<BabyGronckleOrangeRedEntity>of(BabyGronckleOrangeRedEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)
					.setCustomClientFactory(BabyGronckleOrangeRedEntity::new)

					.sized(0.5f, 0.5f));

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
			AdolescentMeatlugEntity.init();
			AdolescentGronckleBlueYellowEntity.init();
			AdolecsentGroncklePinkEntity.init();
			AdolecsentGronckleOrangeRedEntity.init();
			JuvenileMeatlugEntity.init();
			JuvenileGronckleBlueYellowEntity.init();
			JuvenileGroncklePinkEntity.init();
			JuvenileGronckleOrangeRedEntity.init();
			BabyMeatlugEntity.init();
			BabyGronckleBlueYellowEntity.init();
			BabyGroncklePinkEntity.init();
			BabyGronckleOrangeRedEntity.init();
		});
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(NIGHT_FURY.get(), NightFuryEntity.createAttributes().build());
		event.put(MEATLUG.get(), MeatlugEntity.createAttributes().build());
		event.put(GRONCKLE_BLUE_YELLOW.get(), GronckleBlueYellowEntity.createAttributes().build());
		event.put(GRONCKLE_PINK.get(), GroncklePinkEntity.createAttributes().build());
		event.put(GRONCKLE_ORANGE_RED.get(), GronckleOrangeRedEntity.createAttributes().build());
		event.put(ADOLESCENT_MEATLUG.get(), AdolescentMeatlugEntity.createAttributes().build());
		event.put(ADOLESCENT_GRONCKLE_BLUE_YELLOW.get(), AdolescentGronckleBlueYellowEntity.createAttributes().build());
		event.put(ADOLECSENT_GRONCKLE_PINK.get(), AdolecsentGroncklePinkEntity.createAttributes().build());
		event.put(ADOLECSENT_GRONCKLE_ORANGE_RED.get(), AdolecsentGronckleOrangeRedEntity.createAttributes().build());
		event.put(JUVENILE_MEATLUG.get(), JuvenileMeatlugEntity.createAttributes().build());
		event.put(JUVENILE_GRONCKLE_BLUE_YELLOW.get(), JuvenileGronckleBlueYellowEntity.createAttributes().build());
		event.put(JUVENILE_GRONCKLE_PINK.get(), JuvenileGroncklePinkEntity.createAttributes().build());
		event.put(JUVENILE_GRONCKLE_ORANGE_RED.get(), JuvenileGronckleOrangeRedEntity.createAttributes().build());
		event.put(BABY_MEATLUG.get(), BabyMeatlugEntity.createAttributes().build());
		event.put(BABY_GRONCKLE_BLUE_YELLOW.get(), BabyGronckleBlueYellowEntity.createAttributes().build());
		event.put(BABY_GRONCKLE_PINK.get(), BabyGroncklePinkEntity.createAttributes().build());
		event.put(BABY_GRONCKLE_ORANGE_RED.get(), BabyGronckleOrangeRedEntity.createAttributes().build());
	}
}
