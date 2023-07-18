package net.mcreator.howtoownadragon.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.howtoownadragon.entity.GroncklePinkEntity;

public class GroncklePinkModel extends GeoModel<GroncklePinkEntity> {
	@Override
	public ResourceLocation getAnimationResource(GroncklePinkEntity entity) {
		return new ResourceLocation("how_to_own_a_dragon", "animations/gronckle.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(GroncklePinkEntity entity) {
		return new ResourceLocation("how_to_own_a_dragon", "geo/gronckle.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(GroncklePinkEntity entity) {
		return new ResourceLocation("how_to_own_a_dragon", "textures/entities/" + entity.getTexture() + ".png");
	}

}
