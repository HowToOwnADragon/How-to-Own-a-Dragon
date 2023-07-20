package net.mcreator.howtoownadragon.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.howtoownadragon.entity.AdolecsentGroncklePinkEntity;

public class AdolecsentGroncklePinkModel extends GeoModel<AdolecsentGroncklePinkEntity> {
	@Override
	public ResourceLocation getAnimationResource(AdolecsentGroncklePinkEntity entity) {
		return new ResourceLocation("how_to_own_a_dragon", "animations/adogronckle.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(AdolecsentGroncklePinkEntity entity) {
		return new ResourceLocation("how_to_own_a_dragon", "geo/adogronckle.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(AdolecsentGroncklePinkEntity entity) {
		return new ResourceLocation("how_to_own_a_dragon", "textures/entities/" + entity.getTexture() + ".png");
	}

}
