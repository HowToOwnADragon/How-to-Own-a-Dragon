package net.mcreator.howtoownadragon.entity.model;

import software.bernie.geckolib.core.animation.AnimationState;

public class AdolescentGronckleFemaleModel extends GeoModel<AdolescentGronckleFemaleEntity> {
	@Override
	public ResourceLocation getAnimationResource(AdolescentGronckleFemaleEntity entity) {
		return new ResourceLocation("how_to_own_a_dragon", "animations/adogronckle.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(AdolescentGronckleFemaleEntity entity) {
		return new ResourceLocation("how_to_own_a_dragon", "geo/adogronckle.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(AdolescentGronckleFemaleEntity entity) {
		return new ResourceLocation("how_to_own_a_dragon", "textures/entities/" + entity.getTexture() + ".png");
	}

}