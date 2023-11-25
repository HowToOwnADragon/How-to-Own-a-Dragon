package net.mcreator.howtoownadragon.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.howtoownadragon.entity.AdolescentTTFemaleEntity;

public class AdolescentTTFemaleModel extends GeoModel<AdolescentTTFemaleEntity> {
	@Override
	public ResourceLocation getAnimationResource(AdolescentTTFemaleEntity entity) {
		return new ResourceLocation("how_to_own_a_dragon", "animations/adott.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(AdolescentTTFemaleEntity entity) {
		return new ResourceLocation("how_to_own_a_dragon", "geo/adott.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(AdolescentTTFemaleEntity entity) {
		return new ResourceLocation("how_to_own_a_dragon", "textures/entities/" + entity.getTexture() + ".png");
	}

}
