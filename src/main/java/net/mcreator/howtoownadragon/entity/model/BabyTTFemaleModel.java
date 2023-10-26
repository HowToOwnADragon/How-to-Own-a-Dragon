package net.mcreator.howtoownadragon.entity.model;

import software.bernie.geckolib.core.animation.AnimationState;

public class BabyTTFemaleModel extends GeoModel<BabyTTFemaleEntity> {
	@Override
	public ResourceLocation getAnimationResource(BabyTTFemaleEntity entity) {
		return new ResourceLocation("how_to_own_a_dragon", "animations/babytt.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(BabyTTFemaleEntity entity) {
		return new ResourceLocation("how_to_own_a_dragon", "geo/babytt.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(BabyTTFemaleEntity entity) {
		return new ResourceLocation("how_to_own_a_dragon", "textures/entities/" + entity.getTexture() + ".png");
	}

}