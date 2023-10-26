package net.mcreator.howtoownadragon.entity.model;

import software.bernie.geckolib.core.animation.AnimationState;

public class BabyGronckleFemaleModel extends GeoModel<BabyGronckleFemaleEntity> {
	@Override
	public ResourceLocation getAnimationResource(BabyGronckleFemaleEntity entity) {
		return new ResourceLocation("how_to_own_a_dragon", "animations/babygronckle.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(BabyGronckleFemaleEntity entity) {
		return new ResourceLocation("how_to_own_a_dragon", "geo/babygronckle.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(BabyGronckleFemaleEntity entity) {
		return new ResourceLocation("how_to_own_a_dragon", "textures/entities/" + entity.getTexture() + ".png");
	}

}