package net.mcreator.howtoownadragon.entity.model;

import software.bernie.geckolib.core.animation.AnimationState;

public class BabyGronckleMaleModel extends GeoModel<BabyGronckleMaleEntity> {
	@Override
	public ResourceLocation getAnimationResource(BabyGronckleMaleEntity entity) {
		return new ResourceLocation("how_to_own_a_dragon", "animations/babygronckle.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(BabyGronckleMaleEntity entity) {
		return new ResourceLocation("how_to_own_a_dragon", "geo/babygronckle.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(BabyGronckleMaleEntity entity) {
		return new ResourceLocation("how_to_own_a_dragon", "textures/entities/" + entity.getTexture() + ".png");
	}

}