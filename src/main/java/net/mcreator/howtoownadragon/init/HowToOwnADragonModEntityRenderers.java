
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
import net.mcreator.howtoownadragon.client.renderer.GroncklePinkRenderer;
import net.mcreator.howtoownadragon.client.renderer.GronckleOrangeRedRenderer;
import net.mcreator.howtoownadragon.client.renderer.GronckleBlueYellowRenderer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class HowToOwnADragonModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(HowToOwnADragonModEntities.NIGHT_FURY.get(), NightFuryRenderer::new);
		event.registerEntityRenderer(HowToOwnADragonModEntities.MEATLUG.get(), MeatlugRenderer::new);
		event.registerEntityRenderer(HowToOwnADragonModEntities.GRONCKLE_BLUE_YELLOW.get(), GronckleBlueYellowRenderer::new);
		event.registerEntityRenderer(HowToOwnADragonModEntities.GRONCKLE_PINK.get(), GroncklePinkRenderer::new);
		event.registerEntityRenderer(HowToOwnADragonModEntities.GRONCKLE_ORANGE_RED.get(), GronckleOrangeRedRenderer::new);
	}
}
