package net.mcreator.howtoownadragon.entity.model;

import software.bernie.geckolib.core.animation.AnimationState;

public class JuvenileGronckleMaleModel extends GeoModel<JuvenileGronckleMaleEntity> {
	@Override
	public ResourceLocation getAnimationResource(JuvenileGronckleMaleEntity entity) {
		return new ResourceLocation("how_to_own_a_dragon", "animations/juvigronckle.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(JuvenileGronckleMaleEntity entity) {
		return new ResourceLocation("how_to_own_a_dragon", "geo/juvigronckle.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(JuvenileGronckleMaleEntity entity) {
		return new ResourceLocation("how_to_own_a_dragon", "textures/entities/" + entity.getTexture() + ".png");
	}

}