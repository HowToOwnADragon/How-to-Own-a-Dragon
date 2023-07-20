package net.mcreator.howtoownadragon.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.howtoownadragon.entity.AdolescentGronckleBlueYellowEntity;

public class AdolescentGronckleBlueYellowModel extends GeoModel<AdolescentGronckleBlueYellowEntity> {
	@Override
	public ResourceLocation getAnimationResource(AdolescentGronckleBlueYellowEntity entity) {
		return new ResourceLocation("how_to_own_a_dragon", "animations/adogronckle.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(AdolescentGronckleBlueYellowEntity entity) {
		return new ResourceLocation("how_to_own_a_dragon", "geo/adogronckle.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(AdolescentGronckleBlueYellowEntity entity) {
		return new ResourceLocation("how_to_own_a_dragon", "textures/entities/" + entity.getTexture() + ".png");
	}

}
