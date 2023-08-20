
package net.mcreator.howtoownadragon.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.howtoownadragon.entity.MeatlugsEggEntityEntity;
import net.mcreator.howtoownadragon.client.model.ModelGronckleEgg_Converted;

public class MeatlugsEggEntityRenderer extends MobRenderer<MeatlugsEggEntityEntity, ModelGronckleEgg_Converted<MeatlugsEggEntityEntity>> {
	public MeatlugsEggEntityRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelGronckleEgg_Converted(context.bakeLayer(ModelGronckleEgg_Converted.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(MeatlugsEggEntityEntity entity) {
		return new ResourceLocation("how_to_own_a_dragon:textures/entities/gronckleegg.png");
	}
}
