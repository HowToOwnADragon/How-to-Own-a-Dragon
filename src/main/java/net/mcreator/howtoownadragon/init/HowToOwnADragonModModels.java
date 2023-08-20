
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.howtoownadragon.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.howtoownadragon.client.model.Modelgronckleattack;
import net.mcreator.howtoownadragon.client.model.ModelGronckleEgg_Converted;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class HowToOwnADragonModModels {
	@SubscribeEvent
	public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
		event.registerLayerDefinition(ModelGronckleEgg_Converted.LAYER_LOCATION, ModelGronckleEgg_Converted::createBodyLayer);
		event.registerLayerDefinition(Modelgronckleattack.LAYER_LOCATION, Modelgronckleattack::createBodyLayer);
	}
}
