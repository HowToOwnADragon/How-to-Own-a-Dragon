package net.mcreator.howtoownadragon.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.howtoownadragon.entity.NightFuryEntity;

public class NightFuryModel extends GeoModel<NightFuryEntity> {
	@Override
	public ResourceLocation getAnimationResource(NightFuryEntity entity) {
		return new ResourceLocation("how_to_own_a_dragon", "animations/nightfurydone.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(NightFuryEntity entity) {
		return new ResourceLocation("how_to_own_a_dragon", "geo/nightfurydone.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(NightFuryEntity entity) {
		return new ResourceLocation("how_to_own_a_dragon", "textures/entities/" + entity.getTexture() + ".png");
	}

}
