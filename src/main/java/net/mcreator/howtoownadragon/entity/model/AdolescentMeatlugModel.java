package net.mcreator.howtoownadragon.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.howtoownadragon.entity.AdolescentMeatlugEntity;

public class AdolescentMeatlugModel extends GeoModel<AdolescentMeatlugEntity> {
	@Override
	public ResourceLocation getAnimationResource(AdolescentMeatlugEntity entity) {
		return new ResourceLocation("how_to_own_a_dragon", "animations/adogronckle.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(AdolescentMeatlugEntity entity) {
		return new ResourceLocation("how_to_own_a_dragon", "geo/adogronckle.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(AdolescentMeatlugEntity entity) {
		return new ResourceLocation("how_to_own_a_dragon", "textures/entities/" + entity.getTexture() + ".png");
	}

}
