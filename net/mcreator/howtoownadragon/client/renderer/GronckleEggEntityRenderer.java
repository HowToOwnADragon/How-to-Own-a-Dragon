package net.mcreator.howtoownadragon.client.renderer;

import net.mcreator.howtoownadragon.client.model.ModelGronckleEggItemImprovedentity;
import net.mcreator.howtoownadragon.entity.GronckleEggEntityEntity;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider.Context;
import net.minecraft.resources.ResourceLocation;

public class GronckleEggEntityRenderer extends MobRenderer<GronckleEggEntityEntity, ModelGronckleEggItemImprovedentity<GronckleEggEntityEntity>> {
   public GronckleEggEntityRenderer(Context context) {
      super(context, new ModelGronckleEggItemImprovedentity(context.m_174023_(ModelGronckleEggItemImprovedentity.LAYER_LOCATION)), 0.5F);
   }

   public ResourceLocation getTextureLocation(GronckleEggEntityEntity entity) {
      return new ResourceLocation("how_to_own_a_dragon:textures/entities/gronckletextureimprovedentity.png");
   }
}
