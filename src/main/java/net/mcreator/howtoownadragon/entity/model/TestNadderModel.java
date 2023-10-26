package net.mcreator.howtoownadragon.entity.model;

import software.bernie.geckolib.core.animation.AnimationState;

public class TestNadderModel extends GeoModel<TestNadderEntity> {
	@Override
	public ResourceLocation getAnimationResource(TestNadderEntity entity) {
		return new ResourceLocation("how_to_own_a_dragon", "animations/grownnadder.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(TestNadderEntity entity) {
		return new ResourceLocation("how_to_own_a_dragon", "geo/grownnadder.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(TestNadderEntity entity) {
		return new ResourceLocation("how_to_own_a_dragon", "textures/entities/" + entity.getTexture() + ".png");
	}

}