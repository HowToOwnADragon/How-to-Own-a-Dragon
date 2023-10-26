package net.mcreator.howtoownadragon.entity.model;

import software.bernie.geckolib.core.animation.AnimationState;

public class TTMaleModel extends GeoModel<TTMaleEntity> {
	@Override
	public ResourceLocation getAnimationResource(TTMaleEntity entity) {
		return new ResourceLocation("how_to_own_a_dragon", "animations/growntt.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(TTMaleEntity entity) {
		return new ResourceLocation("how_to_own_a_dragon", "geo/growntt.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(TTMaleEntity entity) {
		return new ResourceLocation("how_to_own_a_dragon", "textures/entities/" + entity.getTexture() + ".png");
	}

}