package net.mcreator.howtoownadragon.entity.model;

import software.bernie.geckolib.core.animation.AnimationState;

public class GronckleMaleModel extends GeoModel<GronckleMaleEntity> {
	@Override
	public ResourceLocation getAnimationResource(GronckleMaleEntity entity) {
		return new ResourceLocation("how_to_own_a_dragon", "animations/gronckle.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(GronckleMaleEntity entity) {
		return new ResourceLocation("how_to_own_a_dragon", "geo/gronckle.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(GronckleMaleEntity entity) {
		return new ResourceLocation("how_to_own_a_dragon", "textures/entities/" + entity.getTexture() + ".png");
	}

}