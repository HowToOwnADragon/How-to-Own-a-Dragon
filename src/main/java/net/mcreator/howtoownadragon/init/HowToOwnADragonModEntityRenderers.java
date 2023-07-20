
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.howtoownadragon.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.howtoownadragon.client.renderer.NightFuryRenderer;
import net.mcreator.howtoownadragon.client.renderer.MeatlugRenderer;
import net.mcreator.howtoownadragon.client.renderer.JuvenileMeatlugRenderer;
import net.mcreator.howtoownadragon.client.renderer.JuvenileGroncklePinkRenderer;
import net.mcreator.howtoownadragon.client.renderer.JuvenileGronckleOrangeRedRenderer;
import net.mcreator.howtoownadragon.client.renderer.JuvenileGronckleBlueYellowRenderer;
import net.mcreator.howtoownadragon.client.renderer.GroncklePinkRenderer;
import net.mcreator.howtoownadragon.client.renderer.GronckleOrangeRedRenderer;
import net.mcreator.howtoownadragon.client.renderer.GronckleBlueYellowRenderer;
import net.mcreator.howtoownadragon.client.renderer.BabyMeatlugRenderer;
import net.mcreator.howtoownadragon.client.renderer.BabyGroncklePinkRenderer;
import net.mcreator.howtoownadragon.client.renderer.BabyGronckleOrangeRedRenderer;
import net.mcreator.howtoownadragon.client.renderer.BabyGronckleBlueYellowRenderer;
import net.mcreator.howtoownadragon.client.renderer.AdolescentMeatlugRenderer;
import net.mcreator.howtoownadragon.client.renderer.AdolescentGronckleBlueYellowRenderer;
import net.mcreator.howtoownadragon.client.renderer.AdolecsentGroncklePinkRenderer;
import net.mcreator.howtoownadragon.client.renderer.AdolecsentGronckleOrangeRedRenderer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class HowToOwnADragonModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(HowToOwnADragonModEntities.NIGHT_FURY.get(), NightFuryRenderer::new);
		event.registerEntityRenderer(HowToOwnADragonModEntities.MEATLUG.get(), MeatlugRenderer::new);
		event.registerEntityRenderer(HowToOwnADragonModEntities.GRONCKLE_BLUE_YELLOW.get(), GronckleBlueYellowRenderer::new);
		event.registerEntityRenderer(HowToOwnADragonModEntities.GRONCKLE_PINK.get(), GroncklePinkRenderer::new);
		event.registerEntityRenderer(HowToOwnADragonModEntities.GRONCKLE_ORANGE_RED.get(), GronckleOrangeRedRenderer::new);
		event.registerEntityRenderer(HowToOwnADragonModEntities.ADOLESCENT_MEATLUG.get(), AdolescentMeatlugRenderer::new);
		event.registerEntityRenderer(HowToOwnADragonModEntities.ADOLESCENT_GRONCKLE_BLUE_YELLOW.get(), AdolescentGronckleBlueYellowRenderer::new);
		event.registerEntityRenderer(HowToOwnADragonModEntities.ADOLECSENT_GRONCKLE_PINK.get(), AdolecsentGroncklePinkRenderer::new);
		event.registerEntityRenderer(HowToOwnADragonModEntities.ADOLECSENT_GRONCKLE_ORANGE_RED.get(), AdolecsentGronckleOrangeRedRenderer::new);
		event.registerEntityRenderer(HowToOwnADragonModEntities.JUVENILE_MEATLUG.get(), JuvenileMeatlugRenderer::new);
		event.registerEntityRenderer(HowToOwnADragonModEntities.JUVENILE_GRONCKLE_BLUE_YELLOW.get(), JuvenileGronckleBlueYellowRenderer::new);
		event.registerEntityRenderer(HowToOwnADragonModEntities.JUVENILE_GRONCKLE_PINK.get(), JuvenileGroncklePinkRenderer::new);
		event.registerEntityRenderer(HowToOwnADragonModEntities.JUVENILE_GRONCKLE_ORANGE_RED.get(), JuvenileGronckleOrangeRedRenderer::new);
		event.registerEntityRenderer(HowToOwnADragonModEntities.BABY_MEATLUG.get(), BabyMeatlugRenderer::new);
		event.registerEntityRenderer(HowToOwnADragonModEntities.BABY_GRONCKLE_BLUE_YELLOW.get(), BabyGronckleBlueYellowRenderer::new);
		event.registerEntityRenderer(HowToOwnADragonModEntities.BABY_GRONCKLE_PINK.get(), BabyGroncklePinkRenderer::new);
		event.registerEntityRenderer(HowToOwnADragonModEntities.BABY_GRONCKLE_ORANGE_RED.get(), BabyGronckleOrangeRedRenderer::new);
	}
}
