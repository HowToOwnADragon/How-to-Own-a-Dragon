package net.mcreator.howtoownadragon.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.howtoownadragon.entity.BabyGronckleBlueYellowEntity;

public class BabyGronckleBlueYellowModel extends GeoModel<BabyGronckleBlueYellowEntity> {
	@Override
	public ResourceLocation getAnimationResource(BabyGronckleBlueYellowEntity entity) {
		return new ResourceLocation("how_to_own_a_dragon", "animations/babygronckle.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(BabyGronckleBlueYellowEntity entity) {
		return new ResourceLocation("how_to_own_a_dragon", "geo/babygronckle.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(BabyGronckleBlueYellowEntity entity) {
		return new ResourceLocation("how_to_own_a_dragon", "textures/entities/" + entity.getTexture() + ".png");
	}

}
