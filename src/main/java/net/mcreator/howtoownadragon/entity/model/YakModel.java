package net.mcreator.howtoownadragon.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.howtoownadragon.entity.YakEntity;

public class YakModel extends GeoModel<YakEntity> {
	@Override
	public ResourceLocation getAnimationResource(YakEntity entity) {
		return new ResourceLocation("how_to_own_a_dragon", "animations/yak.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(YakEntity entity) {
		return new ResourceLocation("how_to_own_a_dragon", "geo/yak.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(YakEntity entity) {
		return new ResourceLocation("how_to_own_a_dragon", "textures/entities/" + entity.getTexture() + ".png");
	}

}
