
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.howtoownadragon.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.howtoownadragon.client.renderer.PinkGronckleEggEntityRenderer;
import net.mcreator.howtoownadragon.client.renderer.OrangeRedGronckleEggEntityRenderer;
import net.mcreator.howtoownadragon.client.renderer.NightFuryRenderer;
import net.mcreator.howtoownadragon.client.renderer.MeatlugsEggEntityRenderer;
import net.mcreator.howtoownadragon.client.renderer.MeatlugMaleRenderer;
import net.mcreator.howtoownadragon.client.renderer.MeatlugFemaleRenderer;
import net.mcreator.howtoownadragon.client.renderer.JuvenileMeatlugMaleRenderer;
import net.mcreator.howtoownadragon.client.renderer.JuvenileMeatlugFemaleRenderer;
import net.mcreator.howtoownadragon.client.renderer.JuvenileGroncklePinkMaleRenderer;
import net.mcreator.howtoownadragon.client.renderer.JuvenileGroncklePinkFemaleRenderer;
import net.mcreator.howtoownadragon.client.renderer.JuvenileGronckleOrangeRedMaleRenderer;
import net.mcreator.howtoownadragon.client.renderer.JuvenileGronckleOrangeRedFemaleRenderer;
import net.mcreator.howtoownadragon.client.renderer.JuvenileGronckleBlueYellowMaleRenderer;
import net.mcreator.howtoownadragon.client.renderer.JuvenileGronckleBlueYellowFemaleRenderer;
import net.mcreator.howtoownadragon.client.renderer.GroncklePinkMaleRenderer;
import net.mcreator.howtoownadragon.client.renderer.GroncklePinkFemaleRenderer;
import net.mcreator.howtoownadragon.client.renderer.GronckleOrangeRedMaleRenderer;
import net.mcreator.howtoownadragon.client.renderer.GronckleOrangeRedFemaleRenderer;
import net.mcreator.howtoownadragon.client.renderer.GronckleBlueYellowMaleRenderer;
import net.mcreator.howtoownadragon.client.renderer.GronckleBlueYellowFemaleRenderer;
import net.mcreator.howtoownadragon.client.renderer.GronckleAttackRenderer;
import net.mcreator.howtoownadragon.client.renderer.BlueYellowGronkleEggEntityRenderer;
import net.mcreator.howtoownadragon.client.renderer.BabyMeatlugMaleRenderer;
import net.mcreator.howtoownadragon.client.renderer.BabyMeatlugFemaleRenderer;
import net.mcreator.howtoownadragon.client.renderer.BabyGroncklePinkMaleRenderer;
import net.mcreator.howtoownadragon.client.renderer.BabyGroncklePinkFemaleRenderer;
import net.mcreator.howtoownadragon.client.renderer.BabyGronckleOrangeRedMaleRenderer;
import net.mcreator.howtoownadragon.client.renderer.BabyGronckleOrangeRedFemaleRenderer;
import net.mcreator.howtoownadragon.client.renderer.BabyGronckleBlueYellowMaleRenderer;
import net.mcreator.howtoownadragon.client.renderer.BabyGronckleBlueYellowFemaleRenderer;
import net.mcreator.howtoownadragon.client.renderer.AdolescentMeatlugMaleRenderer;
import net.mcreator.howtoownadragon.client.renderer.AdolescentMeatlugFemaleRenderer;
import net.mcreator.howtoownadragon.client.renderer.AdolescentGroncklePinkMaleRenderer;
import net.mcreator.howtoownadragon.client.renderer.AdolescentGroncklePinkFemaleRenderer;
import net.mcreator.howtoownadragon.client.renderer.AdolescentGronckleOrangeRedMaleRenderer;
import net.mcreator.howtoownadragon.client.renderer.AdolescentGronckleOrangeRedFemaleRenderer;
import net.mcreator.howtoownadragon.client.renderer.AdolescentGronckleBlueYellowMaleRenderer;
import net.mcreator.howtoownadragon.client.renderer.AdolescentGronckleBlueYellowFemaleRenderer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class HowToOwnADragonModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(HowToOwnADragonModEntities.NIGHT_FURY.get(), NightFuryRenderer::new);
		event.registerEntityRenderer(HowToOwnADragonModEntities.MEATLUG_MALE.get(), MeatlugMaleRenderer::new);
		event.registerEntityRenderer(HowToOwnADragonModEntities.MEATLUG_FEMALE.get(), MeatlugFemaleRenderer::new);
		event.registerEntityRenderer(HowToOwnADragonModEntities.GRONCKLE_BLUE_YELLOW_MALE.get(), GronckleBlueYellowMaleRenderer::new);
		event.registerEntityRenderer(HowToOwnADragonModEntities.GRONCKLE_BLUE_YELLOW_FEMALE.get(), GronckleBlueYellowFemaleRenderer::new);
		event.registerEntityRenderer(HowToOwnADragonModEntities.GRONCKLE_PINK_MALE.get(), GroncklePinkMaleRenderer::new);
		event.registerEntityRenderer(HowToOwnADragonModEntities.GRONCKLE_PINK_FEMALE.get(), GroncklePinkFemaleRenderer::new);
		event.registerEntityRenderer(HowToOwnADragonModEntities.GRONCKLE_ORANGE_RED_MALE.get(), GronckleOrangeRedMaleRenderer::new);
		event.registerEntityRenderer(HowToOwnADragonModEntities.GRONCKLE_ORANGE_RED_FEMALE.get(), GronckleOrangeRedFemaleRenderer::new);
		event.registerEntityRenderer(HowToOwnADragonModEntities.ADOLESCENT_MEATLUG_MALE.get(), AdolescentMeatlugMaleRenderer::new);
		event.registerEntityRenderer(HowToOwnADragonModEntities.ADOLESCENT_MEATLUG_FEMALE.get(), AdolescentMeatlugFemaleRenderer::new);
		event.registerEntityRenderer(HowToOwnADragonModEntities.ADOLESCENT_GRONCKLE_BLUE_YELLOW_MALE.get(), AdolescentGronckleBlueYellowMaleRenderer::new);
		event.registerEntityRenderer(HowToOwnADragonModEntities.ADOLESCENT_GRONCKLE_BLUE_YELLOW_FEMALE.get(), AdolescentGronckleBlueYellowFemaleRenderer::new);
		event.registerEntityRenderer(HowToOwnADragonModEntities.ADOLESCENT_GRONCKLE_PINK_MALE.get(), AdolescentGroncklePinkMaleRenderer::new);
		event.registerEntityRenderer(HowToOwnADragonModEntities.ADOLESCENT_GRONCKLE_PINK_FEMALE.get(), AdolescentGroncklePinkFemaleRenderer::new);
		event.registerEntityRenderer(HowToOwnADragonModEntities.ADOLESCENT_GRONCKLE_ORANGE_RED_MALE.get(), AdolescentGronckleOrangeRedMaleRenderer::new);
		event.registerEntityRenderer(HowToOwnADragonModEntities.ADOLESCENT_GRONCKLE_ORANGE_RED_FEMALE.get(), AdolescentGronckleOrangeRedFemaleRenderer::new);
		event.registerEntityRenderer(HowToOwnADragonModEntities.JUVENILE_MEATLUG_MALE.get(), JuvenileMeatlugMaleRenderer::new);
		event.registerEntityRenderer(HowToOwnADragonModEntities.JUVENILE_MEATLUG_FEMALE.get(), JuvenileMeatlugFemaleRenderer::new);
		event.registerEntityRenderer(HowToOwnADragonModEntities.JUVENILE_GRONCKLE_BLUE_YELLOW_MALE.get(), JuvenileGronckleBlueYellowMaleRenderer::new);
		event.registerEntityRenderer(HowToOwnADragonModEntities.JUVENILE_GRONCKLE_BLUE_YELLOW_FEMALE.get(), JuvenileGronckleBlueYellowFemaleRenderer::new);
		event.registerEntityRenderer(HowToOwnADragonModEntities.JUVENILE_GRONCKLE_PINK_MALE.get(), JuvenileGroncklePinkMaleRenderer::new);
		event.registerEntityRenderer(HowToOwnADragonModEntities.JUVENILE_GRONCKLE_PINK_FEMALE.get(), JuvenileGroncklePinkFemaleRenderer::new);
		event.registerEntityRenderer(HowToOwnADragonModEntities.JUVENILE_GRONCKLE_ORANGE_RED_MALE.get(), JuvenileGronckleOrangeRedMaleRenderer::new);
		event.registerEntityRenderer(HowToOwnADragonModEntities.JUVENILE_GRONCKLE_ORANGE_RED_FEMALE.get(), JuvenileGronckleOrangeRedFemaleRenderer::new);
		event.registerEntityRenderer(HowToOwnADragonModEntities.BABY_MEATLUG_MALE.get(), BabyMeatlugMaleRenderer::new);
		event.registerEntityRenderer(HowToOwnADragonModEntities.BABY_MEATLUG_FEMALE.get(), BabyMeatlugFemaleRenderer::new);
		event.registerEntityRenderer(HowToOwnADragonModEntities.BABY_GRONCKLE_BLUE_YELLOW_MALE.get(), BabyGronckleBlueYellowMaleRenderer::new);
		event.registerEntityRenderer(HowToOwnADragonModEntities.BABY_GRONCKLE_BLUE_YELLOW_FEMALE.get(), BabyGronckleBlueYellowFemaleRenderer::new);
		event.registerEntityRenderer(HowToOwnADragonModEntities.BABY_GRONCKLE_PINK_MALE.get(), BabyGroncklePinkMaleRenderer::new);
		event.registerEntityRenderer(HowToOwnADragonModEntities.BABY_GRONCKLE_PINK_FEMALE.get(), BabyGroncklePinkFemaleRenderer::new);
		event.registerEntityRenderer(HowToOwnADragonModEntities.BABY_GRONCKLE_ORANGE_RED_MALE.get(), BabyGronckleOrangeRedMaleRenderer::new);
		event.registerEntityRenderer(HowToOwnADragonModEntities.BABY_GRONCKLE_ORANGE_RED_FEMALE.get(), BabyGronckleOrangeRedFemaleRenderer::new);
		event.registerEntityRenderer(HowToOwnADragonModEntities.GRONCKLE_ATTACK.get(), GronckleAttackRenderer::new);
		event.registerEntityRenderer(HowToOwnADragonModEntities.MEATLUGS_EGG_ENTITY.get(), MeatlugsEggEntityRenderer::new);
		event.registerEntityRenderer(HowToOwnADragonModEntities.BLUE_YELLOW_GRONKLE_EGG_ENTITY.get(), BlueYellowGronkleEggEntityRenderer::new);
		event.registerEntityRenderer(HowToOwnADragonModEntities.ORANGE_RED_GRONCKLE_EGG_ENTITY.get(), OrangeRedGronckleEggEntityRenderer::new);
		event.registerEntityRenderer(HowToOwnADragonModEntities.PINK_GRONCKLE_EGG_ENTITY.get(), PinkGronckleEggEntityRenderer::new);
	}
}
