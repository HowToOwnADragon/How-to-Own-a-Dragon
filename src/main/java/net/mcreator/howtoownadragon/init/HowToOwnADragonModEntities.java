
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

import net.mcreator.howtoownadragon.entity.ReadyToHatchPinkGronckleEggEntityEntity;
import net.mcreator.howtoownadragon.entity.ReadyToHatchOrangeRedGronckleEggEntityEntity;
import net.mcreator.howtoownadragon.entity.ReadyToHatchMeatlugsEggEntityEntity;
import net.mcreator.howtoownadragon.entity.ReadyToHatchBlueYellowGronckleEggEntityEntity;
import net.mcreator.howtoownadragon.entity.PinkGronckleEggEntityEntity;
import net.mcreator.howtoownadragon.entity.OrangeRedGronckleEggEntityEntity;
import net.mcreator.howtoownadragon.entity.NightFuryEntity;
import net.mcreator.howtoownadragon.entity.MeatlugsEggEntityEntity;
import net.mcreator.howtoownadragon.entity.MeatlugMaleEntity;
import net.mcreator.howtoownadragon.entity.MeatlugFemaleEntity;
import net.mcreator.howtoownadragon.entity.JuvenileMeatlugMaleEntity;
import net.mcreator.howtoownadragon.entity.JuvenileMeatlugFemaleEntity;
import net.mcreator.howtoownadragon.entity.JuvenileGroncklePinkMaleEntity;
import net.mcreator.howtoownadragon.entity.JuvenileGroncklePinkFemaleEntity;
import net.mcreator.howtoownadragon.entity.JuvenileGronckleOrangeRedMaleEntity;
import net.mcreator.howtoownadragon.entity.JuvenileGronckleOrangeRedFemaleEntity;
import net.mcreator.howtoownadragon.entity.JuvenileGronckleBlueYellowMaleEntity;
import net.mcreator.howtoownadragon.entity.JuvenileGronckleBlueYellowFemaleEntity;
import net.mcreator.howtoownadragon.entity.GroncklePinkMaleEntity;
import net.mcreator.howtoownadragon.entity.GroncklePinkFemaleEntity;
import net.mcreator.howtoownadragon.entity.GronckleOrangeRedMaleEntity;
import net.mcreator.howtoownadragon.entity.GronckleOrangeRedFemaleEntity;
import net.mcreator.howtoownadragon.entity.GronckleBlueYellowMaleEntity;
import net.mcreator.howtoownadragon.entity.GronckleBlueYellowFemaleEntity;
import net.mcreator.howtoownadragon.entity.GronckleAttackEntity;
import net.mcreator.howtoownadragon.entity.BlueYellowGronkleEggEntityEntity;
import net.mcreator.howtoownadragon.entity.BabyMeatlugMaleEntity;
import net.mcreator.howtoownadragon.entity.BabyMeatlugFemaleEntity;
import net.mcreator.howtoownadragon.entity.BabyGroncklePinkMaleEntity;
import net.mcreator.howtoownadragon.entity.BabyGroncklePinkFemaleEntity;
import net.mcreator.howtoownadragon.entity.BabyGronckleOrangeRedMaleEntity;
import net.mcreator.howtoownadragon.entity.BabyGronckleOrangeRedFemaleEntity;
import net.mcreator.howtoownadragon.entity.BabyGronckleBlueYellowMaleEntity;
import net.mcreator.howtoownadragon.entity.BabyGronckleBlueYellowFemaleEntity;
import net.mcreator.howtoownadragon.entity.AdolescentMeatlugMaleEntity;
import net.mcreator.howtoownadragon.entity.AdolescentMeatlugFemaleEntity;
import net.mcreator.howtoownadragon.entity.AdolescentGroncklePinkMaleEntity;
import net.mcreator.howtoownadragon.entity.AdolescentGroncklePinkFemaleEntity;
import net.mcreator.howtoownadragon.entity.AdolescentGronckleOrangeRedMaleEntity;
import net.mcreator.howtoownadragon.entity.AdolescentGronckleOrangeRedFemaleEntity;
import net.mcreator.howtoownadragon.entity.AdolescentGronckleBlueYellowMaleEntity;
import net.mcreator.howtoownadragon.entity.AdolescentGronckleBlueYellowFemaleEntity;
import net.mcreator.howtoownadragon.HowToOwnADragonMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class HowToOwnADragonModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, HowToOwnADragonMod.MODID);
	public static final RegistryObject<EntityType<NightFuryEntity>> NIGHT_FURY = register("night_fury", EntityType.Builder.<NightFuryEntity>of(NightFuryEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
			.setUpdateInterval(3).setCustomClientFactory(NightFuryEntity::new).fireImmune().sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<MeatlugMaleEntity>> MEATLUG_MALE = register("meatlug_male",
			EntityType.Builder.<MeatlugMaleEntity>of(MeatlugMaleEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(MeatlugMaleEntity::new)

					.sized(2f, 2f));
	public static final RegistryObject<EntityType<MeatlugFemaleEntity>> MEATLUG_FEMALE = register("meatlug_female",
			EntityType.Builder.<MeatlugFemaleEntity>of(MeatlugFemaleEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(MeatlugFemaleEntity::new)

					.sized(2f, 2f));
	public static final RegistryObject<EntityType<GronckleBlueYellowMaleEntity>> GRONCKLE_BLUE_YELLOW_MALE = register("gronckle_blue_yellow_male",
			EntityType.Builder.<GronckleBlueYellowMaleEntity>of(GronckleBlueYellowMaleEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)
					.setCustomClientFactory(GronckleBlueYellowMaleEntity::new)

					.sized(2f, 2f));
	public static final RegistryObject<EntityType<GronckleBlueYellowFemaleEntity>> GRONCKLE_BLUE_YELLOW_FEMALE = register("gronckle_blue_yellow_female",
			EntityType.Builder.<GronckleBlueYellowFemaleEntity>of(GronckleBlueYellowFemaleEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)
					.setCustomClientFactory(GronckleBlueYellowFemaleEntity::new)

					.sized(2f, 2f));
	public static final RegistryObject<EntityType<GroncklePinkMaleEntity>> GRONCKLE_PINK_MALE = register("gronckle_pink_male",
			EntityType.Builder.<GroncklePinkMaleEntity>of(GroncklePinkMaleEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(GroncklePinkMaleEntity::new)

					.sized(2f, 2f));
	public static final RegistryObject<EntityType<GroncklePinkFemaleEntity>> GRONCKLE_PINK_FEMALE = register("gronckle_pink_female",
			EntityType.Builder.<GroncklePinkFemaleEntity>of(GroncklePinkFemaleEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(GroncklePinkFemaleEntity::new)

					.sized(2f, 2f));
	public static final RegistryObject<EntityType<GronckleOrangeRedMaleEntity>> GRONCKLE_ORANGE_RED_MALE = register("gronckle_orange_red_male",
			EntityType.Builder.<GronckleOrangeRedMaleEntity>of(GronckleOrangeRedMaleEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)
					.setCustomClientFactory(GronckleOrangeRedMaleEntity::new)

					.sized(2f, 2f));
	public static final RegistryObject<EntityType<GronckleOrangeRedFemaleEntity>> GRONCKLE_ORANGE_RED_FEMALE = register("gronckle_orange_red_female",
			EntityType.Builder.<GronckleOrangeRedFemaleEntity>of(GronckleOrangeRedFemaleEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)
					.setCustomClientFactory(GronckleOrangeRedFemaleEntity::new)

					.sized(2f, 2f));
	public static final RegistryObject<EntityType<AdolescentMeatlugMaleEntity>> ADOLESCENT_MEATLUG_MALE = register("adolescent_meatlug_male",
			EntityType.Builder.<AdolescentMeatlugMaleEntity>of(AdolescentMeatlugMaleEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)
					.setCustomClientFactory(AdolescentMeatlugMaleEntity::new)

					.sized(1.5f, 1.5f));
	public static final RegistryObject<EntityType<AdolescentMeatlugFemaleEntity>> ADOLESCENT_MEATLUG_FEMALE = register("adolescent_meatlug_female",
			EntityType.Builder.<AdolescentMeatlugFemaleEntity>of(AdolescentMeatlugFemaleEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)
					.setCustomClientFactory(AdolescentMeatlugFemaleEntity::new)

					.sized(1.5f, 1.5f));
	public static final RegistryObject<EntityType<AdolescentGronckleBlueYellowMaleEntity>> ADOLESCENT_GRONCKLE_BLUE_YELLOW_MALE = register("adolescent_gronckle_blue_yellow_male",
			EntityType.Builder.<AdolescentGronckleBlueYellowMaleEntity>of(AdolescentGronckleBlueYellowMaleEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)
					.setCustomClientFactory(AdolescentGronckleBlueYellowMaleEntity::new)

					.sized(1.5f, 1.5f));
	public static final RegistryObject<EntityType<AdolescentGronckleBlueYellowFemaleEntity>> ADOLESCENT_GRONCKLE_BLUE_YELLOW_FEMALE = register("adolescent_gronckle_blue_yellow_female",
			EntityType.Builder.<AdolescentGronckleBlueYellowFemaleEntity>of(AdolescentGronckleBlueYellowFemaleEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)
					.setCustomClientFactory(AdolescentGronckleBlueYellowFemaleEntity::new)

					.sized(1.5f, 1.5f));
	public static final RegistryObject<EntityType<AdolescentGroncklePinkMaleEntity>> ADOLESCENT_GRONCKLE_PINK_MALE = register("adolescent_gronckle_pink_male",
			EntityType.Builder.<AdolescentGroncklePinkMaleEntity>of(AdolescentGroncklePinkMaleEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)
					.setCustomClientFactory(AdolescentGroncklePinkMaleEntity::new)

					.sized(1.5f, 1.5f));
	public static final RegistryObject<EntityType<AdolescentGroncklePinkFemaleEntity>> ADOLESCENT_GRONCKLE_PINK_FEMALE = register("adolescent_gronckle_pink_female",
			EntityType.Builder.<AdolescentGroncklePinkFemaleEntity>of(AdolescentGroncklePinkFemaleEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)
					.setCustomClientFactory(AdolescentGroncklePinkFemaleEntity::new)

					.sized(1.5f, 1.5f));
	public static final RegistryObject<EntityType<AdolescentGronckleOrangeRedMaleEntity>> ADOLESCENT_GRONCKLE_ORANGE_RED_MALE = register("adolescent_gronckle_orange_red_male",
			EntityType.Builder.<AdolescentGronckleOrangeRedMaleEntity>of(AdolescentGronckleOrangeRedMaleEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)
					.setCustomClientFactory(AdolescentGronckleOrangeRedMaleEntity::new)

					.sized(1.5f, 1.5f));
	public static final RegistryObject<EntityType<AdolescentGronckleOrangeRedFemaleEntity>> ADOLESCENT_GRONCKLE_ORANGE_RED_FEMALE = register("adolescent_gronckle_orange_red_female",
			EntityType.Builder.<AdolescentGronckleOrangeRedFemaleEntity>of(AdolescentGronckleOrangeRedFemaleEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)
					.setCustomClientFactory(AdolescentGronckleOrangeRedFemaleEntity::new)

					.sized(1.5f, 1.5f));
	public static final RegistryObject<EntityType<JuvenileMeatlugMaleEntity>> JUVENILE_MEATLUG_MALE = register("juvenile_meatlug_male",
			EntityType.Builder.<JuvenileMeatlugMaleEntity>of(JuvenileMeatlugMaleEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(JuvenileMeatlugMaleEntity::new)

					.sized(1f, 1f));
	public static final RegistryObject<EntityType<JuvenileMeatlugFemaleEntity>> JUVENILE_MEATLUG_FEMALE = register("juvenile_meatlug_female",
			EntityType.Builder.<JuvenileMeatlugFemaleEntity>of(JuvenileMeatlugFemaleEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)
					.setCustomClientFactory(JuvenileMeatlugFemaleEntity::new)

					.sized(1f, 1f));
	public static final RegistryObject<EntityType<JuvenileGronckleBlueYellowMaleEntity>> JUVENILE_GRONCKLE_BLUE_YELLOW_MALE = register("juvenile_gronckle_blue_yellow_male",
			EntityType.Builder.<JuvenileGronckleBlueYellowMaleEntity>of(JuvenileGronckleBlueYellowMaleEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)
					.setCustomClientFactory(JuvenileGronckleBlueYellowMaleEntity::new)

					.sized(1f, 1f));
	public static final RegistryObject<EntityType<JuvenileGronckleBlueYellowFemaleEntity>> JUVENILE_GRONCKLE_BLUE_YELLOW_FEMALE = register("juvenile_gronckle_blue_yellow_female",
			EntityType.Builder.<JuvenileGronckleBlueYellowFemaleEntity>of(JuvenileGronckleBlueYellowFemaleEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)
					.setCustomClientFactory(JuvenileGronckleBlueYellowFemaleEntity::new)

					.sized(1f, 1f));
	public static final RegistryObject<EntityType<JuvenileGroncklePinkMaleEntity>> JUVENILE_GRONCKLE_PINK_MALE = register("juvenile_gronckle_pink_male",
			EntityType.Builder.<JuvenileGroncklePinkMaleEntity>of(JuvenileGroncklePinkMaleEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)
					.setCustomClientFactory(JuvenileGroncklePinkMaleEntity::new)

					.sized(1f, 1f));
	public static final RegistryObject<EntityType<JuvenileGroncklePinkFemaleEntity>> JUVENILE_GRONCKLE_PINK_FEMALE = register("juvenile_gronckle_pink_female",
			EntityType.Builder.<JuvenileGroncklePinkFemaleEntity>of(JuvenileGroncklePinkFemaleEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)
					.setCustomClientFactory(JuvenileGroncklePinkFemaleEntity::new)

					.sized(1f, 1f));
	public static final RegistryObject<EntityType<JuvenileGronckleOrangeRedMaleEntity>> JUVENILE_GRONCKLE_ORANGE_RED_MALE = register("juvenile_gronckle_orange_red_male",
			EntityType.Builder.<JuvenileGronckleOrangeRedMaleEntity>of(JuvenileGronckleOrangeRedMaleEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)
					.setCustomClientFactory(JuvenileGronckleOrangeRedMaleEntity::new)

					.sized(1f, 1f));
	public static final RegistryObject<EntityType<JuvenileGronckleOrangeRedFemaleEntity>> JUVENILE_GRONCKLE_ORANGE_RED_FEMALE = register("juvenile_gronckle_orange_red_female",
			EntityType.Builder.<JuvenileGronckleOrangeRedFemaleEntity>of(JuvenileGronckleOrangeRedFemaleEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)
					.setCustomClientFactory(JuvenileGronckleOrangeRedFemaleEntity::new)

					.sized(1f, 1f));
	public static final RegistryObject<EntityType<BabyMeatlugMaleEntity>> BABY_MEATLUG_MALE = register("baby_meatlug_male",
			EntityType.Builder.<BabyMeatlugMaleEntity>of(BabyMeatlugMaleEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(BabyMeatlugMaleEntity::new)

					.sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<BabyMeatlugFemaleEntity>> BABY_MEATLUG_FEMALE = register("baby_meatlug_female",
			EntityType.Builder.<BabyMeatlugFemaleEntity>of(BabyMeatlugFemaleEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(BabyMeatlugFemaleEntity::new)

					.sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<BabyGronckleBlueYellowMaleEntity>> BABY_GRONCKLE_BLUE_YELLOW_MALE = register("baby_gronckle_blue_yellow_male",
			EntityType.Builder.<BabyGronckleBlueYellowMaleEntity>of(BabyGronckleBlueYellowMaleEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)
					.setCustomClientFactory(BabyGronckleBlueYellowMaleEntity::new)

					.sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<BabyGronckleBlueYellowFemaleEntity>> BABY_GRONCKLE_BLUE_YELLOW_FEMALE = register("baby_gronckle_blue_yellow_female",
			EntityType.Builder.<BabyGronckleBlueYellowFemaleEntity>of(BabyGronckleBlueYellowFemaleEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)
					.setCustomClientFactory(BabyGronckleBlueYellowFemaleEntity::new)

					.sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<BabyGroncklePinkMaleEntity>> BABY_GRONCKLE_PINK_MALE = register("baby_gronckle_pink_male",
			EntityType.Builder.<BabyGroncklePinkMaleEntity>of(BabyGroncklePinkMaleEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)
					.setCustomClientFactory(BabyGroncklePinkMaleEntity::new)

					.sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<BabyGroncklePinkFemaleEntity>> BABY_GRONCKLE_PINK_FEMALE = register("baby_gronckle_pink_female",
			EntityType.Builder.<BabyGroncklePinkFemaleEntity>of(BabyGroncklePinkFemaleEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)
					.setCustomClientFactory(BabyGroncklePinkFemaleEntity::new)

					.sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<BabyGronckleOrangeRedMaleEntity>> BABY_GRONCKLE_ORANGE_RED_MALE = register("baby_gronckle_orange_red_male",
			EntityType.Builder.<BabyGronckleOrangeRedMaleEntity>of(BabyGronckleOrangeRedMaleEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)
					.setCustomClientFactory(BabyGronckleOrangeRedMaleEntity::new)

					.sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<BabyGronckleOrangeRedFemaleEntity>> BABY_GRONCKLE_ORANGE_RED_FEMALE = register("baby_gronckle_orange_red_female",
			EntityType.Builder.<BabyGronckleOrangeRedFemaleEntity>of(BabyGronckleOrangeRedFemaleEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)
					.setCustomClientFactory(BabyGronckleOrangeRedFemaleEntity::new)

					.sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<GronckleAttackEntity>> GRONCKLE_ATTACK = register("projectile_gronckle_attack",
			EntityType.Builder.<GronckleAttackEntity>of(GronckleAttackEntity::new, MobCategory.MISC).setCustomClientFactory(GronckleAttackEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<MeatlugsEggEntityEntity>> MEATLUGS_EGG_ENTITY = register("meatlugs_egg_entity",
			EntityType.Builder.<MeatlugsEggEntityEntity>of(MeatlugsEggEntityEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(MeatlugsEggEntityEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<BlueYellowGronkleEggEntityEntity>> BLUE_YELLOW_GRONKLE_EGG_ENTITY = register("blue_yellow_gronkle_egg_entity",
			EntityType.Builder.<BlueYellowGronkleEggEntityEntity>of(BlueYellowGronkleEggEntityEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)
					.setCustomClientFactory(BlueYellowGronkleEggEntityEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<OrangeRedGronckleEggEntityEntity>> ORANGE_RED_GRONCKLE_EGG_ENTITY = register("orange_red_gronckle_egg_entity",
			EntityType.Builder.<OrangeRedGronckleEggEntityEntity>of(OrangeRedGronckleEggEntityEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)
					.setCustomClientFactory(OrangeRedGronckleEggEntityEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<PinkGronckleEggEntityEntity>> PINK_GRONCKLE_EGG_ENTITY = register("pink_gronckle_egg_entity",
			EntityType.Builder.<PinkGronckleEggEntityEntity>of(PinkGronckleEggEntityEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)
					.setCustomClientFactory(PinkGronckleEggEntityEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<ReadyToHatchMeatlugsEggEntityEntity>> READY_TO_HATCH_MEATLUGS_EGG_ENTITY = register("ready_to_hatch_meatlugs_egg_entity",
			EntityType.Builder.<ReadyToHatchMeatlugsEggEntityEntity>of(ReadyToHatchMeatlugsEggEntityEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)
					.setCustomClientFactory(ReadyToHatchMeatlugsEggEntityEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<ReadyToHatchBlueYellowGronckleEggEntityEntity>> READY_TO_HATCH_BLUE_YELLOW_GRONCKLE_EGG_ENTITY = register("ready_to_hatch_blue_yellow_gronckle_egg_entity",
			EntityType.Builder.<ReadyToHatchBlueYellowGronckleEggEntityEntity>of(ReadyToHatchBlueYellowGronckleEggEntityEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)
					.setCustomClientFactory(ReadyToHatchBlueYellowGronckleEggEntityEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<ReadyToHatchOrangeRedGronckleEggEntityEntity>> READY_TO_HATCH_ORANGE_RED_GRONCKLE_EGG_ENTITY = register("ready_to_hatch_orange_red_gronckle_egg_entity",
			EntityType.Builder.<ReadyToHatchOrangeRedGronckleEggEntityEntity>of(ReadyToHatchOrangeRedGronckleEggEntityEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)
					.setCustomClientFactory(ReadyToHatchOrangeRedGronckleEggEntityEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<ReadyToHatchPinkGronckleEggEntityEntity>> READY_TO_HATCH_PINK_GRONCKLE_EGG_ENTITY = register("ready_to_hatch_pink_gronckle_egg_entity",
			EntityType.Builder.<ReadyToHatchPinkGronckleEggEntityEntity>of(ReadyToHatchPinkGronckleEggEntityEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)
					.setCustomClientFactory(ReadyToHatchPinkGronckleEggEntityEntity::new)

					.sized(0.6f, 1.8f));

	private static <T extends Entity> RegistryObject<EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			NightFuryEntity.init();
			MeatlugMaleEntity.init();
			MeatlugFemaleEntity.init();
			GronckleBlueYellowMaleEntity.init();
			GronckleBlueYellowFemaleEntity.init();
			GroncklePinkMaleEntity.init();
			GroncklePinkFemaleEntity.init();
			GronckleOrangeRedMaleEntity.init();
			GronckleOrangeRedFemaleEntity.init();
			AdolescentMeatlugMaleEntity.init();
			AdolescentMeatlugFemaleEntity.init();
			AdolescentGronckleBlueYellowMaleEntity.init();
			AdolescentGronckleBlueYellowFemaleEntity.init();
			AdolescentGroncklePinkMaleEntity.init();
			AdolescentGroncklePinkFemaleEntity.init();
			AdolescentGronckleOrangeRedMaleEntity.init();
			AdolescentGronckleOrangeRedFemaleEntity.init();
			JuvenileMeatlugMaleEntity.init();
			JuvenileMeatlugFemaleEntity.init();
			JuvenileGronckleBlueYellowMaleEntity.init();
			JuvenileGronckleBlueYellowFemaleEntity.init();
			JuvenileGroncklePinkMaleEntity.init();
			JuvenileGroncklePinkFemaleEntity.init();
			JuvenileGronckleOrangeRedMaleEntity.init();
			JuvenileGronckleOrangeRedFemaleEntity.init();
			BabyMeatlugMaleEntity.init();
			BabyMeatlugFemaleEntity.init();
			BabyGronckleBlueYellowMaleEntity.init();
			BabyGronckleBlueYellowFemaleEntity.init();
			BabyGroncklePinkMaleEntity.init();
			BabyGroncklePinkFemaleEntity.init();
			BabyGronckleOrangeRedMaleEntity.init();
			BabyGronckleOrangeRedFemaleEntity.init();
			MeatlugsEggEntityEntity.init();
			BlueYellowGronkleEggEntityEntity.init();
			OrangeRedGronckleEggEntityEntity.init();
			PinkGronckleEggEntityEntity.init();
			ReadyToHatchMeatlugsEggEntityEntity.init();
			ReadyToHatchBlueYellowGronckleEggEntityEntity.init();
			ReadyToHatchOrangeRedGronckleEggEntityEntity.init();
			ReadyToHatchPinkGronckleEggEntityEntity.init();
		});
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(NIGHT_FURY.get(), NightFuryEntity.createAttributes().build());
		event.put(MEATLUG_MALE.get(), MeatlugMaleEntity.createAttributes().build());
		event.put(MEATLUG_FEMALE.get(), MeatlugFemaleEntity.createAttributes().build());
		event.put(GRONCKLE_BLUE_YELLOW_MALE.get(), GronckleBlueYellowMaleEntity.createAttributes().build());
		event.put(GRONCKLE_BLUE_YELLOW_FEMALE.get(), GronckleBlueYellowFemaleEntity.createAttributes().build());
		event.put(GRONCKLE_PINK_MALE.get(), GroncklePinkMaleEntity.createAttributes().build());
		event.put(GRONCKLE_PINK_FEMALE.get(), GroncklePinkFemaleEntity.createAttributes().build());
		event.put(GRONCKLE_ORANGE_RED_MALE.get(), GronckleOrangeRedMaleEntity.createAttributes().build());
		event.put(GRONCKLE_ORANGE_RED_FEMALE.get(), GronckleOrangeRedFemaleEntity.createAttributes().build());
		event.put(ADOLESCENT_MEATLUG_MALE.get(), AdolescentMeatlugMaleEntity.createAttributes().build());
		event.put(ADOLESCENT_MEATLUG_FEMALE.get(), AdolescentMeatlugFemaleEntity.createAttributes().build());
		event.put(ADOLESCENT_GRONCKLE_BLUE_YELLOW_MALE.get(), AdolescentGronckleBlueYellowMaleEntity.createAttributes().build());
		event.put(ADOLESCENT_GRONCKLE_BLUE_YELLOW_FEMALE.get(), AdolescentGronckleBlueYellowFemaleEntity.createAttributes().build());
		event.put(ADOLESCENT_GRONCKLE_PINK_MALE.get(), AdolescentGroncklePinkMaleEntity.createAttributes().build());
		event.put(ADOLESCENT_GRONCKLE_PINK_FEMALE.get(), AdolescentGroncklePinkFemaleEntity.createAttributes().build());
		event.put(ADOLESCENT_GRONCKLE_ORANGE_RED_MALE.get(), AdolescentGronckleOrangeRedMaleEntity.createAttributes().build());
		event.put(ADOLESCENT_GRONCKLE_ORANGE_RED_FEMALE.get(), AdolescentGronckleOrangeRedFemaleEntity.createAttributes().build());
		event.put(JUVENILE_MEATLUG_MALE.get(), JuvenileMeatlugMaleEntity.createAttributes().build());
		event.put(JUVENILE_MEATLUG_FEMALE.get(), JuvenileMeatlugFemaleEntity.createAttributes().build());
		event.put(JUVENILE_GRONCKLE_BLUE_YELLOW_MALE.get(), JuvenileGronckleBlueYellowMaleEntity.createAttributes().build());
		event.put(JUVENILE_GRONCKLE_BLUE_YELLOW_FEMALE.get(), JuvenileGronckleBlueYellowFemaleEntity.createAttributes().build());
		event.put(JUVENILE_GRONCKLE_PINK_MALE.get(), JuvenileGroncklePinkMaleEntity.createAttributes().build());
		event.put(JUVENILE_GRONCKLE_PINK_FEMALE.get(), JuvenileGroncklePinkFemaleEntity.createAttributes().build());
		event.put(JUVENILE_GRONCKLE_ORANGE_RED_MALE.get(), JuvenileGronckleOrangeRedMaleEntity.createAttributes().build());
		event.put(JUVENILE_GRONCKLE_ORANGE_RED_FEMALE.get(), JuvenileGronckleOrangeRedFemaleEntity.createAttributes().build());
		event.put(BABY_MEATLUG_MALE.get(), BabyMeatlugMaleEntity.createAttributes().build());
		event.put(BABY_MEATLUG_FEMALE.get(), BabyMeatlugFemaleEntity.createAttributes().build());
		event.put(BABY_GRONCKLE_BLUE_YELLOW_MALE.get(), BabyGronckleBlueYellowMaleEntity.createAttributes().build());
		event.put(BABY_GRONCKLE_BLUE_YELLOW_FEMALE.get(), BabyGronckleBlueYellowFemaleEntity.createAttributes().build());
		event.put(BABY_GRONCKLE_PINK_MALE.get(), BabyGroncklePinkMaleEntity.createAttributes().build());
		event.put(BABY_GRONCKLE_PINK_FEMALE.get(), BabyGroncklePinkFemaleEntity.createAttributes().build());
		event.put(BABY_GRONCKLE_ORANGE_RED_MALE.get(), BabyGronckleOrangeRedMaleEntity.createAttributes().build());
		event.put(BABY_GRONCKLE_ORANGE_RED_FEMALE.get(), BabyGronckleOrangeRedFemaleEntity.createAttributes().build());
		event.put(MEATLUGS_EGG_ENTITY.get(), MeatlugsEggEntityEntity.createAttributes().build());
		event.put(BLUE_YELLOW_GRONKLE_EGG_ENTITY.get(), BlueYellowGronkleEggEntityEntity.createAttributes().build());
		event.put(ORANGE_RED_GRONCKLE_EGG_ENTITY.get(), OrangeRedGronckleEggEntityEntity.createAttributes().build());
		event.put(PINK_GRONCKLE_EGG_ENTITY.get(), PinkGronckleEggEntityEntity.createAttributes().build());
		event.put(READY_TO_HATCH_MEATLUGS_EGG_ENTITY.get(), ReadyToHatchMeatlugsEggEntityEntity.createAttributes().build());
		event.put(READY_TO_HATCH_BLUE_YELLOW_GRONCKLE_EGG_ENTITY.get(), ReadyToHatchBlueYellowGronckleEggEntityEntity.createAttributes().build());
		event.put(READY_TO_HATCH_ORANGE_RED_GRONCKLE_EGG_ENTITY.get(), ReadyToHatchOrangeRedGronckleEggEntityEntity.createAttributes().build());
		event.put(READY_TO_HATCH_PINK_GRONCKLE_EGG_ENTITY.get(), ReadyToHatchPinkGronckleEggEntityEntity.createAttributes().build());
	}
}
