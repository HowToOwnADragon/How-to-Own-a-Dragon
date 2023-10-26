package net.mcreator.howtoownadragon.entity.model;

import software.bernie.geckolib.core.animation.AnimationState;

public class TestGronckleModel extends GeoModel<TestGronckleEntity> {
	@Override
	public ResourceLocation getAnimationResource(TestGronckleEntity entity) {
		return new ResourceLocation("how_to_own_a_dragon", "animations/gronckle.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(TestGronckleEntity entity) {
		return new ResourceLocation("how_to_own_a_dragon", "geo/gronckle.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(TestGronckleEntity entity) {
		return new ResourceLocation("how_to_own_a_dragon", "textures/entities/" + entity.getTexture() + ".png");
	}

}