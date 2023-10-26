package net.mcreator.howtoownadragon.entity.model;

import software.bernie.geckolib.core.animation.AnimationState;

public class GronckleFemaleModel extends GeoModel<GronckleFemaleEntity> {
	@Override
	public ResourceLocation getAnimationResource(GronckleFemaleEntity entity) {
		return new ResourceLocation("how_to_own_a_dragon", "animations/gronckle.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(GronckleFemaleEntity entity) {
		return new ResourceLocation("how_to_own_a_dragon", "geo/gronckle.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(GronckleFemaleEntity entity) {
		return new ResourceLocation("how_to_own_a_dragon", "textures/entities/" + entity.getTexture() + ".png");
	}

}