package net.mcreator.howtoownadragon.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.howtoownadragon.entity.AdolescentNadderFemaleEntity;

public class AdolescentNadderFemaleModel extends GeoModel<AdolescentNadderFemaleEntity> {
	@Override
	public ResourceLocation getAnimationResource(AdolescentNadderFemaleEntity entity) {
		return new ResourceLocation("how_to_own_a_dragon", "animations/adodeadlynadder.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(AdolescentNadderFemaleEntity entity) {
		return new ResourceLocation("how_to_own_a_dragon", "geo/adodeadlynadder.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(AdolescentNadderFemaleEntity entity) {
		return new ResourceLocation("how_to_own_a_dragon", "textures/entities/" + entity.getTexture() + ".png");
	}

}
