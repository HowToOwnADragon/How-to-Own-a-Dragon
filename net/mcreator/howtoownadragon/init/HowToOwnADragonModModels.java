package net.mcreator.howtoownadragon.init;

import net.mcreator.howtoownadragon.client.model.ModelGronckleEggItemImprovedentity;
import net.mcreator.howtoownadragon.client.model.Modelgronckleattack;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.EntityRenderersEvent.RegisterLayerDefinitions;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;

@EventBusSubscriber(
   bus = Bus.MOD,
   value = {Dist.CLIENT}
)
public class HowToOwnADragonModModels {
   @SubscribeEvent
   public static void registerLayerDefinitions(RegisterLayerDefinitions event) {
      event.registerLayerDefinition(ModelGronckleEggItemImprovedentity.LAYER_LOCATION, ModelGronckleEggItemImprovedentity::createBodyLayer);
      event.registerLayerDefinition(Modelgronckleattack.LAYER_LOCATION, Modelgronckleattack::createBodyLayer);
   }
}
