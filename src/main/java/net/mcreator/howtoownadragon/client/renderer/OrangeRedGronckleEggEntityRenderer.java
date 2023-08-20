
package net.mcreator.howtoownadragon.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.howtoownadragon.entity.OrangeRedGronckleEggEntityEntity;
import net.mcreator.howtoownadragon.client.model.ModelGronckleEgg_Converted;

public class OrangeRedGronckleEggEntityRenderer extends MobRenderer<OrangeRedGronckleEggEntityEntity, ModelGronckleEgg_Converted<OrangeRedGronckleEggEntityEntity>> {
	public OrangeRedGronckleEggEntityRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelGronckleEgg_Converted(context.bakeLayer(ModelGronckleEgg_Converted.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(OrangeRedGronckleEggEntityEntity entity) {
		return new ResourceLocation("how_to_own_a_dragon:textures/entities/gronckleegg.png");
	}
}
