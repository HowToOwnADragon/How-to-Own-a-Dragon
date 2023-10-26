package net.mcreator.howtoownadragon.entity.model;

import software.bernie.geckolib.core.animation.AnimationState;

public class JuvenileGronckleFemaleModel extends GeoModel<JuvenileGronckleFemaleEntity> {
	@Override
	public ResourceLocation getAnimationResource(JuvenileGronckleFemaleEntity entity) {
		return new ResourceLocation("how_to_own_a_dragon", "animations/juvigronckle.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(JuvenileGronckleFemaleEntity entity) {
		return new ResourceLocation("how_to_own_a_dragon", "geo/juvigronckle.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(JuvenileGronckleFemaleEntity entity) {
		return new ResourceLocation("how_to_own_a_dragon", "textures/entities/" + entity.getTexture() + ".png");
	}

}