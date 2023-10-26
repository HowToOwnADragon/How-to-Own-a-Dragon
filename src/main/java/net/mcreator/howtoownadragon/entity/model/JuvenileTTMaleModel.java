package net.mcreator.howtoownadragon.entity.model;

import software.bernie.geckolib.core.animation.AnimationState;

public class JuvenileTTMaleModel extends GeoModel<JuvenileTTMaleEntity> {
	@Override
	public ResourceLocation getAnimationResource(JuvenileTTMaleEntity entity) {
		return new ResourceLocation("how_to_own_a_dragon", "animations/juvitt.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(JuvenileTTMaleEntity entity) {
		return new ResourceLocation("how_to_own_a_dragon", "geo/juvitt.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(JuvenileTTMaleEntity entity) {
		return new ResourceLocation("how_to_own_a_dragon", "textures/entities/" + entity.getTexture() + ".png");
	}

}