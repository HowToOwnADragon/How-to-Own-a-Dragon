package net.mcreator.howtoownadragon.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.howtoownadragon.entity.JuvenileGroncklePinkEntity;

public class JuvenileGroncklePinkModel extends GeoModel<JuvenileGroncklePinkEntity> {
	@Override
	public ResourceLocation getAnimationResource(JuvenileGroncklePinkEntity entity) {
		return new ResourceLocation("how_to_own_a_dragon", "animations/juvigronckle.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(JuvenileGroncklePinkEntity entity) {
		return new ResourceLocation("how_to_own_a_dragon", "geo/juvigronckle.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(JuvenileGroncklePinkEntity entity) {
		return new ResourceLocation("how_to_own_a_dragon", "textures/entities/" + entity.getTexture() + ".png");
	}

}
