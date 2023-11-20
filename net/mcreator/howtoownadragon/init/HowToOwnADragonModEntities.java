package net.mcreator.howtoownadragon.init;

import net.mcreator.howtoownadragon.entity.AdolescentGronckleFemaleEntity;
import net.mcreator.howtoownadragon.entity.AdolescentGronckleMaleEntity;
import net.mcreator.howtoownadragon.entity.AdolescentNadderFemaleEntity;
import net.mcreator.howtoownadragon.entity.AdolescentNadderMaleEntity;
import net.mcreator.howtoownadragon.entity.AdolescentTTFemaleEntity;
import net.mcreator.howtoownadragon.entity.AdolescentTTMaleEntity;
import net.mcreator.howtoownadragon.entity.BabyGronckleFemaleEntity;
import net.mcreator.howtoownadragon.entity.BabyGronckleMaleEntity;
import net.mcreator.howtoownadragon.entity.BabyNadderFemaleEntity;
import net.mcreator.howtoownadragon.entity.BabyNadderMaleEntity;
import net.mcreator.howtoownadragon.entity.BabyTTFemaleEntity;
import net.mcreator.howtoownadragon.entity.BabyTTMaleEntity;
import net.mcreator.howtoownadragon.entity.GronckleAttackEntity;
import net.mcreator.howtoownadragon.entity.GronckleEggEntityEntity;
import net.mcreator.howtoownadragon.entity.GronckleFemaleEntity;
import net.mcreator.howtoownadragon.entity.GronckleMaleEntity;
import net.mcreator.howtoownadragon.entity.JuvenileGronckleFemaleEntity;
import net.mcreator.howtoownadragon.entity.JuvenileGronckleMaleEntity;
import net.mcreator.howtoownadragon.entity.JuvenileNadderFemaleEntity;
import net.mcreator.howtoownadragon.entity.JuvenileNadderMaleEntity;
import net.mcreator.howtoownadragon.entity.JuvenileTTFemaleEntity;
import net.mcreator.howtoownadragon.entity.JuvenileTTMaleEntity;
import net.mcreator.howtoownadragon.entity.NadderEggEntityEntity;
import net.mcreator.howtoownadragon.entity.NadderFemaleEntity;
import net.mcreator.howtoownadragon.entity.NadderMaleEntity;
import net.mcreator.howtoownadragon.entity.NightFuryEntity;
import net.mcreator.howtoownadragon.entity.TTEggEntityEntity;
import net.mcreator.howtoownadragon.entity.TTFemaleEntity;
import net.mcreator.howtoownadragon.entity.TTMaleEntity;
import net.mcreator.howtoownadragon.entity.TTTestEntity;
import net.mcreator.howtoownadragon.entity.TestGronckleEntity;
import net.mcreator.howtoownadragon.entity.TestNadderEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType.Builder;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

@EventBusSubscriber(
   bus = Bus.MOD
)
public class HowToOwnADragonModEntities {
   public static final DeferredRegister<EntityType<?>> REGISTRY;
   public static final RegistryObject<EntityType<NightFuryEntity>> NIGHT_FURY;
   public static final RegistryObject<EntityType<GronckleAttackEntity>> GRONCKLE_ATTACK;
   public static final RegistryObject<EntityType<GronckleMaleEntity>> GRONCKLE_MALE;
   public static final RegistryObject<EntityType<GronckleFemaleEntity>> GRONCKLE_FEMALE;
   public static final RegistryObject<EntityType<AdolescentGronckleMaleEntity>> ADOLESCENT_GRONCKLE_MALE;
   public static final RegistryObject<EntityType<AdolescentGronckleFemaleEntity>> ADOLESCENT_GRONCKLE_FEMALE;
   public static final RegistryObject<EntityType<JuvenileGronckleMaleEntity>> JUVENILE_GRONCKLE_MALE;
   public static final RegistryObject<EntityType<JuvenileGronckleFemaleEntity>> JUVENILE_GRONCKLE_FEMALE;
   public static final RegistryObject<EntityType<BabyGronckleMaleEntity>> BABY_GRONCKLE_MALE;
   public static final RegistryObject<EntityType<BabyGronckleFemaleEntity>> BABY_GRONCKLE_FEMALE;
   public static final RegistryObject<EntityType<GronckleEggEntityEntity>> GRONCKLE_EGG_ENTITY;
   public static final RegistryObject<EntityType<TTMaleEntity>> TT_MALE;
   public static final RegistryObject<EntityType<TestGronckleEntity>> TEST_GRONCKLE;
   public static final RegistryObject<EntityType<TTFemaleEntity>> TT_FEMALE;
   public static final RegistryObject<EntityType<TTTestEntity>> TT_TEST;
   public static final RegistryObject<EntityType<BabyTTFemaleEntity>> BABY_TT_FEMALE;
   public static final RegistryObject<EntityType<JuvenileTTFemaleEntity>> JUVENILE_TT_FEMALE;
   public static final RegistryObject<EntityType<AdolescentTTFemaleEntity>> ADOLESCENT_TT_FEMALE;
   public static final RegistryObject<EntityType<BabyTTMaleEntity>> BABY_TT_MALE;
   public static final RegistryObject<EntityType<JuvenileTTMaleEntity>> JUVENILE_TT_MALE;
   public static final RegistryObject<EntityType<AdolescentTTMaleEntity>> ADOLESCENT_TT_MALE;
   public static final RegistryObject<EntityType<TTEggEntityEntity>> TT_EGG_ENTITY;
   public static final RegistryObject<EntityType<NadderMaleEntity>> NADDER_MALE;
   public static final RegistryObject<EntityType<TestNadderEntity>> TEST_NADDER;
   public static final RegistryObject<EntityType<NadderFemaleEntity>> NADDER_FEMALE;
   public static final RegistryObject<EntityType<BabyNadderFemaleEntity>> BABY_NADDER_FEMALE;
   public static final RegistryObject<EntityType<BabyNadderMaleEntity>> BABY_NADDER_MALE;
   public static final RegistryObject<EntityType<JuvenileNadderMaleEntity>> JUVENILE_NADDER_MALE;
   public static final RegistryObject<EntityType<JuvenileNadderFemaleEntity>> JUVENILE_NADDER_FEMALE;
   public static final RegistryObject<EntityType<AdolescentNadderFemaleEntity>> ADOLESCENT_NADDER_FEMALE;
   public static final RegistryObject<EntityType<AdolescentNadderMaleEntity>> ADOLESCENT_NADDER_MALE;
   public static final RegistryObject<EntityType<NadderEggEntityEntity>> NADDER_EGG_ENTITY;

   private static <T extends Entity> RegistryObject<EntityType<T>> register(String registryname, Builder<T> entityTypeBuilder) {
      return REGISTRY.register(registryname, () -> {
         return entityTypeBuilder.m_20712_(registryname);
      });
   }

   @SubscribeEvent
   public static void init(FMLCommonSetupEvent event) {
      event.enqueueWork(() -> {
         NightFuryEntity.init();
         GronckleMaleEntity.init();
         GronckleFemaleEntity.init();
         AdolescentGronckleMaleEntity.init();
         AdolescentGronckleFemaleEntity.init();
         JuvenileGronckleMaleEntity.init();
         JuvenileGronckleFemaleEntity.init();
         BabyGronckleMaleEntity.init();
         BabyGronckleFemaleEntity.init();
         GronckleEggEntityEntity.init();
         TTMaleEntity.init();
         TestGronckleEntity.init();
         TTFemaleEntity.init();
         TTTestEntity.init();
         BabyTTFemaleEntity.init();
         JuvenileTTFemaleEntity.init();
         AdolescentTTFemaleEntity.init();
         BabyTTMaleEntity.init();
         JuvenileTTMaleEntity.init();
         AdolescentTTMaleEntity.init();
         TTEggEntityEntity.init();
         NadderMaleEntity.init();
         TestNadderEntity.init();
         NadderFemaleEntity.init();
         BabyNadderFemaleEntity.init();
         BabyNadderMaleEntity.init();
         JuvenileNadderMaleEntity.init();
         JuvenileNadderFemaleEntity.init();
         AdolescentNadderFemaleEntity.init();
         AdolescentNadderMaleEntity.init();
         NadderEggEntityEntity.init();
      });
   }

   @SubscribeEvent
   public static void registerAttributes(EntityAttributeCreationEvent event) {
      event.put((EntityType)NIGHT_FURY.get(), NightFuryEntity.createAttributes().m_22265_());
      event.put((EntityType)GRONCKLE_MALE.get(), GronckleMaleEntity.createAttributes().m_22265_());
      event.put((EntityType)GRONCKLE_FEMALE.get(), GronckleFemaleEntity.createAttributes().m_22265_());
      event.put((EntityType)ADOLESCENT_GRONCKLE_MALE.get(), AdolescentGronckleMaleEntity.createAttributes().m_22265_());
      event.put((EntityType)ADOLESCENT_GRONCKLE_FEMALE.get(), AdolescentGronckleFemaleEntity.createAttributes().m_22265_());
      event.put((EntityType)JUVENILE_GRONCKLE_MALE.get(), JuvenileGronckleMaleEntity.createAttributes().m_22265_());
      event.put((EntityType)JUVENILE_GRONCKLE_FEMALE.get(), JuvenileGronckleFemaleEntity.createAttributes().m_22265_());
      event.put((EntityType)BABY_GRONCKLE_MALE.get(), BabyGronckleMaleEntity.createAttributes().m_22265_());
      event.put((EntityType)BABY_GRONCKLE_FEMALE.get(), BabyGronckleFemaleEntity.createAttributes().m_22265_());
      event.put((EntityType)GRONCKLE_EGG_ENTITY.get(), GronckleEggEntityEntity.createAttributes().m_22265_());
      event.put((EntityType)TT_MALE.get(), TTMaleEntity.createAttributes().m_22265_());
      event.put((EntityType)TEST_GRONCKLE.get(), TestGronckleEntity.createAttributes().m_22265_());
      event.put((EntityType)TT_FEMALE.get(), TTFemaleEntity.createAttributes().m_22265_());
      event.put((EntityType)TT_TEST.get(), TTTestEntity.createAttributes().m_22265_());
      event.put((EntityType)BABY_TT_FEMALE.get(), BabyTTFemaleEntity.createAttributes().m_22265_());
      event.put((EntityType)JUVENILE_TT_FEMALE.get(), JuvenileTTFemaleEntity.createAttributes().m_22265_());
      event.put((EntityType)ADOLESCENT_TT_FEMALE.get(), AdolescentTTFemaleEntity.createAttributes().m_22265_());
      event.put((EntityType)BABY_TT_MALE.get(), BabyTTMaleEntity.createAttributes().m_22265_());
      event.put((EntityType)JUVENILE_TT_MALE.get(), JuvenileTTMaleEntity.createAttributes().m_22265_());
      event.put((EntityType)ADOLESCENT_TT_MALE.get(), AdolescentTTMaleEntity.createAttributes().m_22265_());
      event.put((EntityType)TT_EGG_ENTITY.get(), TTEggEntityEntity.createAttributes().m_22265_());
      event.put((EntityType)NADDER_MALE.get(), NadderMaleEntity.createAttributes().m_22265_());
      event.put((EntityType)TEST_NADDER.get(), TestNadderEntity.createAttributes().m_22265_());
      event.put((EntityType)NADDER_FEMALE.get(), NadderFemaleEntity.createAttributes().m_22265_());
      event.put((EntityType)BABY_NADDER_FEMALE.get(), BabyNadderFemaleEntity.createAttributes().m_22265_());
      event.put((EntityType)BABY_NADDER_MALE.get(), BabyNadderMaleEntity.createAttributes().m_22265_());
      event.put((EntityType)JUVENILE_NADDER_MALE.get(), JuvenileNadderMaleEntity.createAttributes().m_22265_());
      event.put((EntityType)JUVENILE_NADDER_FEMALE.get(), JuvenileNadderFemaleEntity.createAttributes().m_22265_());
      event.put((EntityType)ADOLESCENT_NADDER_FEMALE.get(), AdolescentNadderFemaleEntity.createAttributes().m_22265_());
      event.put((EntityType)ADOLESCENT_NADDER_MALE.get(), AdolescentNadderMaleEntity.createAttributes().m_22265_());
      event.put((EntityType)NADDER_EGG_ENTITY.get(), NadderEggEntityEntity.createAttributes().m_22265_());
   }

   static {
      REGISTRY = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, "how_to_own_a_dragon");
      NIGHT_FURY = register("night_fury", Builder.m_20704_(NightFuryEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(NightFuryEntity::new).m_20719_().m_20699_(0.6F, 1.8F));
      GRONCKLE_ATTACK = register("projectile_gronckle_attack", Builder.m_20704_(GronckleAttackEntity::new, MobCategory.MISC).setCustomClientFactory(GronckleAttackEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).m_20699_(0.5F, 0.5F));
      GRONCKLE_MALE = register("gronckle_male", Builder.m_20704_(GronckleMaleEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(GronckleMaleEntity::new).m_20719_().m_20699_(2.0F, 2.0F));
      GRONCKLE_FEMALE = register("gronckle_female", Builder.m_20704_(GronckleFemaleEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(GronckleFemaleEntity::new).m_20719_().m_20699_(2.0F, 2.0F));
      ADOLESCENT_GRONCKLE_MALE = register("adolescent_gronckle_male", Builder.m_20704_(AdolescentGronckleMaleEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(AdolescentGronckleMaleEntity::new).m_20719_().m_20699_(1.5F, 1.5F));
      ADOLESCENT_GRONCKLE_FEMALE = register("adolescent_gronckle_female", Builder.m_20704_(AdolescentGronckleFemaleEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(AdolescentGronckleFemaleEntity::new).m_20719_().m_20699_(1.5F, 1.5F));
      JUVENILE_GRONCKLE_MALE = register("juvenile_gronckle_male", Builder.m_20704_(JuvenileGronckleMaleEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(JuvenileGronckleMaleEntity::new).m_20719_().m_20699_(1.0F, 1.0F));
      JUVENILE_GRONCKLE_FEMALE = register("juvenile_gronckle_female", Builder.m_20704_(JuvenileGronckleFemaleEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(JuvenileGronckleFemaleEntity::new).m_20719_().m_20699_(1.0F, 1.0F));
      BABY_GRONCKLE_MALE = register("baby_gronckle_male", Builder.m_20704_(BabyGronckleMaleEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(BabyGronckleMaleEntity::new).m_20719_().m_20699_(0.5F, 0.5F));
      BABY_GRONCKLE_FEMALE = register("baby_gronckle_female", Builder.m_20704_(BabyGronckleFemaleEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(BabyGronckleFemaleEntity::new).m_20719_().m_20699_(0.5F, 0.5F));
      GRONCKLE_EGG_ENTITY = register("gronckle_egg_entity", Builder.m_20704_(GronckleEggEntityEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(GronckleEggEntityEntity::new).m_20719_().m_20699_(0.6F, 0.8F));
      TT_MALE = register("tt_male", Builder.m_20704_(TTMaleEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(TTMaleEntity::new).m_20699_(0.45F, 0.5F));
      TEST_GRONCKLE = register("test_gronckle", Builder.m_20704_(TestGronckleEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(TestGronckleEntity::new).m_20719_().m_20699_(2.0F, 2.0F));
      TT_FEMALE = register("tt_female", Builder.m_20704_(TTFemaleEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(TTFemaleEntity::new).m_20699_(0.45F, 0.5F));
      TT_TEST = register("tt_test", Builder.m_20704_(TTTestEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(TTTestEntity::new).m_20699_(0.6F, 1.8F));
      BABY_TT_FEMALE = register("baby_tt_female", Builder.m_20704_(BabyTTFemaleEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(BabyTTFemaleEntity::new).m_20699_(0.15F, 0.2F));
      JUVENILE_TT_FEMALE = register("juvenile_tt_female", Builder.m_20704_(JuvenileTTFemaleEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(JuvenileTTFemaleEntity::new).m_20699_(0.2F, 0.3F));
      ADOLESCENT_TT_FEMALE = register("adolescent_tt_female", Builder.m_20704_(AdolescentTTFemaleEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(AdolescentTTFemaleEntity::new).m_20699_(0.4F, 0.4F));
      BABY_TT_MALE = register("baby_tt_male", Builder.m_20704_(BabyTTMaleEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(BabyTTMaleEntity::new).m_20699_(0.15F, 0.2F));
      JUVENILE_TT_MALE = register("juvenile_tt_male", Builder.m_20704_(JuvenileTTMaleEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(JuvenileTTMaleEntity::new).m_20699_(0.2F, 0.3F));
      ADOLESCENT_TT_MALE = register("adolescent_tt_male", Builder.m_20704_(AdolescentTTMaleEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(AdolescentTTMaleEntity::new).m_20699_(0.4F, 0.4F));
      TT_EGG_ENTITY = register("tt_egg_entity", Builder.m_20704_(TTEggEntityEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(TTEggEntityEntity::new).m_20699_(0.3F, 0.4F));
      NADDER_MALE = register("nadder_male", Builder.m_20704_(NadderMaleEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(NadderMaleEntity::new).m_20719_().m_20699_(1.2F, 2.5F));
      TEST_NADDER = register("test_nadder", Builder.m_20704_(TestNadderEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(TestNadderEntity::new).m_20719_().m_20699_(0.6F, 1.8F));
      NADDER_FEMALE = register("nadder_female", Builder.m_20704_(NadderFemaleEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(NadderFemaleEntity::new).m_20719_().m_20699_(1.2F, 2.5F));
      BABY_NADDER_FEMALE = register("baby_nadder_female", Builder.m_20704_(BabyNadderFemaleEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(BabyNadderFemaleEntity::new).m_20719_().m_20699_(0.4F, 0.6F));
      BABY_NADDER_MALE = register("baby_nadder_male", Builder.m_20704_(BabyNadderMaleEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(BabyNadderMaleEntity::new).m_20719_().m_20699_(0.4F, 0.6F));
      JUVENILE_NADDER_MALE = register("juvenile_nadder_male", Builder.m_20704_(JuvenileNadderMaleEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(JuvenileNadderMaleEntity::new).m_20719_().m_20699_(0.6F, 1.2F));
      JUVENILE_NADDER_FEMALE = register("juvenile_nadder_female", Builder.m_20704_(JuvenileNadderFemaleEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(JuvenileNadderFemaleEntity::new).m_20719_().m_20699_(0.6F, 1.2F));
      ADOLESCENT_NADDER_FEMALE = register("adolescent_nadder_female", Builder.m_20704_(AdolescentNadderFemaleEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(AdolescentNadderFemaleEntity::new).m_20719_().m_20699_(0.9F, 2.0F));
      ADOLESCENT_NADDER_MALE = register("adolescent_nadder_male", Builder.m_20704_(AdolescentNadderMaleEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(AdolescentNadderMaleEntity::new).m_20719_().m_20699_(0.9F, 2.0F));
      NADDER_EGG_ENTITY = register("nadder_egg_entity", Builder.m_20704_(NadderEggEntityEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(NadderEggEntityEntity::new).m_20699_(0.6F, 0.8F));
   }
}
