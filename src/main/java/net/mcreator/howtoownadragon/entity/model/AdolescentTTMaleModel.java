package net.mcreator.howtoownadragon.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.howtoownadragon.entity.AdolescentTTMaleEntity;

public class AdolescentTTMaleModel extends GeoModel<AdolescentTTMaleEntity> {
	@Override
	public ResourceLocation getAnimationResource(AdolescentTTMaleEntity entity) {
		return new ResourceLocation("how_to_own_a_dragon", "animations/adott.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(AdolescentTTMaleEntity entity) {
		return new ResourceLocation("how_to_own_a_dragon", "geo/adott.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(AdolescentTTMaleEntity entity) {
		return new ResourceLocation("how_to_own_a_dragon", "textures/entities/" + entity.getTexture() + ".png");
	}

}
