
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.howtoownadragon.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.howtoownadragon.client.renderer.TestGronckleRenderer;
import net.mcreator.howtoownadragon.client.renderer.TTTestRenderer;
import net.mcreator.howtoownadragon.client.renderer.TTMaleRenderer;
import net.mcreator.howtoownadragon.client.renderer.TTFemaleRenderer;
import net.mcreator.howtoownadragon.client.renderer.TTEggEntityRenderer;
import net.mcreator.howtoownadragon.client.renderer.NightFuryRenderer;
import net.mcreator.howtoownadragon.client.renderer.JuvenileTTMaleRenderer;
import net.mcreator.howtoownadragon.client.renderer.JuvenileTTFemaleRenderer;
import net.mcreator.howtoownadragon.client.renderer.JuvenileGronckleMaleRenderer;
import net.mcreator.howtoownadragon.client.renderer.JuvenileGronckleFemaleRenderer;
import net.mcreator.howtoownadragon.client.renderer.GronckleMaleRenderer;
import net.mcreator.howtoownadragon.client.renderer.GronckleFemaleRenderer;
import net.mcreator.howtoownadragon.client.renderer.GronckleEggEntityRenderer;
import net.mcreator.howtoownadragon.client.renderer.GronckleAttackRenderer;
import net.mcreator.howtoownadragon.client.renderer.BabyTTMaleRenderer;
import net.mcreator.howtoownadragon.client.renderer.BabyTTFemaleRenderer;
import net.mcreator.howtoownadragon.client.renderer.BabyGronckleMaleRenderer;
import net.mcreator.howtoownadragon.client.renderer.BabyGronckleFemaleRenderer;
import net.mcreator.howtoownadragon.client.renderer.AdolescentTTMaleRenderer;
import net.mcreator.howtoownadragon.client.renderer.AdolescentTTFemaleRenderer;
import net.mcreator.howtoownadragon.client.renderer.AdolescentGronckleMaleRenderer;
import net.mcreator.howtoownadragon.client.renderer.AdolescentGronckleFemaleRenderer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class HowToOwnADragonModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(HowToOwnADragonModEntities.NIGHT_FURY.get(), NightFuryRenderer::new);
		event.registerEntityRenderer(HowToOwnADragonModEntities.GRONCKLE_ATTACK.get(), GronckleAttackRenderer::new);
		event.registerEntityRenderer(HowToOwnADragonModEntities.GRONCKLE_MALE.get(), GronckleMaleRenderer::new);
		event.registerEntityRenderer(HowToOwnADragonModEntities.GRONCKLE_FEMALE.get(), GronckleFemaleRenderer::new);
		event.registerEntityRenderer(HowToOwnADragonModEntities.ADOLESCENT_GRONCKLE_MALE.get(), AdolescentGronckleMaleRenderer::new);
		event.registerEntityRenderer(HowToOwnADragonModEntities.ADOLESCENT_GRONCKLE_FEMALE.get(), AdolescentGronckleFemaleRenderer::new);
		event.registerEntityRenderer(HowToOwnADragonModEntities.JUVENILE_GRONCKLE_MALE.get(), JuvenileGronckleMaleRenderer::new);
		event.registerEntityRenderer(HowToOwnADragonModEntities.JUVENILE_GRONCKLE_FEMALE.get(), JuvenileGronckleFemaleRenderer::new);
		event.registerEntityRenderer(HowToOwnADragonModEntities.BABY_GRONCKLE_MALE.get(), BabyGronckleMaleRenderer::new);
		event.registerEntityRenderer(HowToOwnADragonModEntities.BABY_GRONCKLE_FEMALE.get(), BabyGronckleFemaleRenderer::new);
		event.registerEntityRenderer(HowToOwnADragonModEntities.GRONCKLE_EGG_ENTITY.get(), GronckleEggEntityRenderer::new);
		event.registerEntityRenderer(HowToOwnADragonModEntities.TT_MALE.get(), TTMaleRenderer::new);
		event.registerEntityRenderer(HowToOwnADragonModEntities.TEST_GRONCKLE.get(), TestGronckleRenderer::new);
		event.registerEntityRenderer(HowToOwnADragonModEntities.TT_FEMALE.get(), TTFemaleRenderer::new);
		event.registerEntityRenderer(HowToOwnADragonModEntities.TT_TEST.get(), TTTestRenderer::new);
		event.registerEntityRenderer(HowToOwnADragonModEntities.BABY_TT_FEMALE.get(), BabyTTFemaleRenderer::new);
		event.registerEntityRenderer(HowToOwnADragonModEntities.JUVENILE_TT_FEMALE.get(), JuvenileTTFemaleRenderer::new);
		event.registerEntityRenderer(HowToOwnADragonModEntities.ADOLESCENT_TT_FEMALE.get(), AdolescentTTFemaleRenderer::new);
		event.registerEntityRenderer(HowToOwnADragonModEntities.BABY_TT_MALE.get(), BabyTTMaleRenderer::new);
		event.registerEntityRenderer(HowToOwnADragonModEntities.JUVENILE_TT_MALE.get(), JuvenileTTMaleRenderer::new);
		event.registerEntityRenderer(HowToOwnADragonModEntities.ADOLESCENT_TT_MALE.get(), AdolescentTTMaleRenderer::new);
		event.registerEntityRenderer(HowToOwnADragonModEntities.TT_EGG_ENTITY.get(), TTEggEntityRenderer::new);
	}
}
