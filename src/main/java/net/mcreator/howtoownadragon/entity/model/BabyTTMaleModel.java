package net.mcreator.howtoownadragon.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.howtoownadragon.entity.BabyTTMaleEntity;

public class BabyTTMaleModel extends GeoModel<BabyTTMaleEntity> {
	@Override
	public ResourceLocation getAnimationResource(BabyTTMaleEntity entity) {
		return new ResourceLocation("how_to_own_a_dragon", "animations/babytt.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(BabyTTMaleEntity entity) {
		return new ResourceLocation("how_to_own_a_dragon", "geo/babytt.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(BabyTTMaleEntity entity) {
		return new ResourceLocation("how_to_own_a_dragon", "textures/entities/" + entity.getTexture() + ".png");
	}

}
