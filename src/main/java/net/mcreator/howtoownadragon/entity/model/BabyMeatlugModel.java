package net.mcreator.howtoownadragon.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.howtoownadragon.entity.BabyMeatlugEntity;

public class BabyMeatlugModel extends GeoModel<BabyMeatlugEntity> {
	@Override
	public ResourceLocation getAnimationResource(BabyMeatlugEntity entity) {
		return new ResourceLocation("how_to_own_a_dragon", "animations/babygronckle.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(BabyMeatlugEntity entity) {
		return new ResourceLocation("how_to_own_a_dragon", "geo/babygronckle.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(BabyMeatlugEntity entity) {
		return new ResourceLocation("how_to_own_a_dragon", "textures/entities/" + entity.getTexture() + ".png");
	}

}
