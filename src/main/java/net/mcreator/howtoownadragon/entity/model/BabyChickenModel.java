package net.mcreator.howtoownadragon.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.howtoownadragon.entity.BabyChickenEntity;

public class BabyChickenModel extends GeoModel<BabyChickenEntity> {
	@Override
	public ResourceLocation getAnimationResource(BabyChickenEntity entity) {
		return new ResourceLocation("how_to_own_a_dragon", "animations/chicken.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(BabyChickenEntity entity) {
		return new ResourceLocation("how_to_own_a_dragon", "geo/chicken.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(BabyChickenEntity entity) {
		return new ResourceLocation("how_to_own_a_dragon", "textures/entities/" + entity.getTexture() + ".png");
	}

}
