package net.mcreator.howtoownadragon.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.howtoownadragon.entity.AdolecsentGronckleOrangeRedEntity;

public class AdolecsentGronckleOrangeRedModel extends GeoModel<AdolecsentGronckleOrangeRedEntity> {
	@Override
	public ResourceLocation getAnimationResource(AdolecsentGronckleOrangeRedEntity entity) {
		return new ResourceLocation("how_to_own_a_dragon", "animations/adogronckle.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(AdolecsentGronckleOrangeRedEntity entity) {
		return new ResourceLocation("how_to_own_a_dragon", "geo/adogronckle.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(AdolecsentGronckleOrangeRedEntity entity) {
		return new ResourceLocation("how_to_own_a_dragon", "textures/entities/" + entity.getTexture() + ".png");
	}

}
