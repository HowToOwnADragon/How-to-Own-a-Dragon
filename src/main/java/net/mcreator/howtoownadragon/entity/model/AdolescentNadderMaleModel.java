package net.mcreator.howtoownadragon.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.howtoownadragon.entity.AdolescentNadderMaleEntity;

public class AdolescentNadderMaleModel extends GeoModel<AdolescentNadderMaleEntity> {
	@Override
	public ResourceLocation getAnimationResource(AdolescentNadderMaleEntity entity) {
		return new ResourceLocation("how_to_own_a_dragon", "animations/adodeadlynadder.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(AdolescentNadderMaleEntity entity) {
		return new ResourceLocation("how_to_own_a_dragon", "geo/adodeadlynadder.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(AdolescentNadderMaleEntity entity) {
		return new ResourceLocation("how_to_own_a_dragon", "textures/entities/" + entity.getTexture() + ".png");
	}

}
