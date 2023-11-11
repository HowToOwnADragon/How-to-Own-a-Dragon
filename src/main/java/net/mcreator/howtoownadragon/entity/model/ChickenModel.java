package net.mcreator.howtoownadragon.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.howtoownadragon.entity.ChickenEntity;

public class ChickenModel extends GeoModel<ChickenEntity> {
	@Override
	public ResourceLocation getAnimationResource(ChickenEntity entity) {
		return new ResourceLocation("how_to_own_a_dragon", "animations/chicken.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ChickenEntity entity) {
		return new ResourceLocation("how_to_own_a_dragon", "geo/chicken.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ChickenEntity entity) {
		return new ResourceLocation("how_to_own_a_dragon", "textures/entities/" + entity.getTexture() + ".png");
	}

}
