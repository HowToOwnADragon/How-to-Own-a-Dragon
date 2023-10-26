package net.mcreator.howtoownadragon.entity.model;

import software.bernie.geckolib.core.animation.AnimationState;

public class JuvenileTTFemaleModel extends GeoModel<JuvenileTTFemaleEntity> {
	@Override
	public ResourceLocation getAnimationResource(JuvenileTTFemaleEntity entity) {
		return new ResourceLocation("how_to_own_a_dragon", "animations/juvitt.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(JuvenileTTFemaleEntity entity) {
		return new ResourceLocation("how_to_own_a_dragon", "geo/juvitt.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(JuvenileTTFemaleEntity entity) {
		return new ResourceLocation("how_to_own_a_dragon", "textures/entities/" + entity.getTexture() + ".png");
	}

}