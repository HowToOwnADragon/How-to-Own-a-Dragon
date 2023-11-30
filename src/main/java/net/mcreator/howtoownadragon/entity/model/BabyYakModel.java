package net.mcreator.howtoownadragon.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.howtoownadragon.entity.BabyYakEntity;

public class BabyYakModel extends GeoModel<BabyYakEntity> {
	@Override
	public ResourceLocation getAnimationResource(BabyYakEntity entity) {
		return new ResourceLocation("how_to_own_a_dragon", "animations/yak.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(BabyYakEntity entity) {
		return new ResourceLocation("how_to_own_a_dragon", "geo/yak.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(BabyYakEntity entity) {
		return new ResourceLocation("how_to_own_a_dragon", "textures/entities/" + entity.getTexture() + ".png");
	}

}
