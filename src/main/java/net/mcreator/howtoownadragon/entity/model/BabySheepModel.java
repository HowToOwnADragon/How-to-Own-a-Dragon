package net.mcreator.howtoownadragon.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.howtoownadragon.entity.BabySheepEntity;

public class BabySheepModel extends GeoModel<BabySheepEntity> {
	@Override
	public ResourceLocation getAnimationResource(BabySheepEntity entity) {
		return new ResourceLocation("how_to_own_a_dragon", "animations/sheep.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(BabySheepEntity entity) {
		return new ResourceLocation("how_to_own_a_dragon", "geo/sheep.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(BabySheepEntity entity) {
		return new ResourceLocation("how_to_own_a_dragon", "textures/entities/" + entity.getTexture() + ".png");
	}

}
