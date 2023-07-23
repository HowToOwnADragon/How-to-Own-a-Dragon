package net.mcreator.howtoownadragon.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.howtoownadragon.entity.GronckleOrangeRedEntity;

public class GronckleOrangeRedModel extends GeoModel<GronckleOrangeRedEntity> {
	@Override
	public ResourceLocation getAnimationResource(GronckleOrangeRedEntity entity) {
		return new ResourceLocation("how_to_own_a_dragon", "animations/gronckle.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(GronckleOrangeRedEntity entity) {
		return new ResourceLocation("how_to_own_a_dragon", "geo/gronckle.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(GronckleOrangeRedEntity entity) {
		return new ResourceLocation("how_to_own_a_dragon", "textures/entities/" + entity.getTexture() + ".png");
	}

}