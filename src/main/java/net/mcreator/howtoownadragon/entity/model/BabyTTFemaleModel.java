package net.mcreator.howtoownadragon.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.howtoownadragon.entity.BabyTTFemaleEntity;

public class BabyTTFemaleModel extends GeoModel<BabyTTFemaleEntity> {
	@Override
	public ResourceLocation getAnimationResource(BabyTTFemaleEntity entity) {
		return new ResourceLocation("how_to_own_a_dragon", "animations/growntt.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(BabyTTFemaleEntity entity) {
		return new ResourceLocation("how_to_own_a_dragon", "geo/growntt.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(BabyTTFemaleEntity entity) {
		return new ResourceLocation("how_to_own_a_dragon", "textures/entities/" + entity.getTexture() + ".png");
	}

}
