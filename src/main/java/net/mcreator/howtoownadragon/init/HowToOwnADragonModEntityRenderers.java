
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.howtoownadragon.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.howtoownadragon.client.renderer.RTHGronckleEggEntityRenderer;
import net.mcreator.howtoownadragon.client.renderer.NightFuryRenderer;
import net.mcreator.howtoownadragon.client.renderer.JuvenileGronckleMaleRenderer;
import net.mcreator.howtoownadragon.client.renderer.JuvenileGronckleFemaleRenderer;
import net.mcreator.howtoownadragon.client.renderer.GronckleEggEntityRenderer;
import net.mcreator.howtoownadragon.client.renderer.GronckleAttackRenderer;
import net.mcreator.howtoownadragon.client.renderer.BabyGronckleMaleRenderer;
import net.mcreator.howtoownadragon.client.renderer.BabyGronckleFemaleRenderer;
import net.mcreator.howtoownadragon.client.renderer.AdolescentGronckleMaleRenderer;
import net.mcreator.howtoownadragon.client.renderer.AdolescentGronckleFemaleRenderer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class HowToOwnADragonModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(HowToOwnADragonModEntities.NIGHT_FURY.get(), NightFuryRenderer::new);
		event.registerEntityRenderer(HowToOwnADragonModEntities.GRONCKLE_ATTACK.get(), GronckleAttackRenderer::new);
		event.registerEntityRenderer(HowToOwnADragonModEntities.ADOLESCENT_GRONCKLE_MALE.get(), AdolescentGronckleMaleRenderer::new);
		event.registerEntityRenderer(HowToOwnADragonModEntities.ADOLESCENT_GRONCKLE_FEMALE.get(), AdolescentGronckleFemaleRenderer::new);
		event.registerEntityRenderer(HowToOwnADragonModEntities.JUVENILE_GRONCKLE_MALE.get(), JuvenileGronckleMaleRenderer::new);
		event.registerEntityRenderer(HowToOwnADragonModEntities.JUVENILE_GRONCKLE_FEMALE.get(), JuvenileGronckleFemaleRenderer::new);
		event.registerEntityRenderer(HowToOwnADragonModEntities.BABY_GRONCKLE_MALE.get(), BabyGronckleMaleRenderer::new);
		event.registerEntityRenderer(HowToOwnADragonModEntities.BABY_GRONCKLE_FEMALE.get(), BabyGronckleFemaleRenderer::new);
		event.registerEntityRenderer(HowToOwnADragonModEntities.GRONCKLE_EGG_ENTITY.get(), GronckleEggEntityRenderer::new);
		event.registerEntityRenderer(HowToOwnADragonModEntities.RTH_GRONCKLE_EGG_ENTITY.get(), RTHGronckleEggEntityRenderer::new);
	}
}
