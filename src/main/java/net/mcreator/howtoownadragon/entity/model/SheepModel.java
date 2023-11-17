package net.mcreator.howtoownadragon.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.howtoownadragon.entity.SheepEntity;

public class SheepModel extends GeoModel<SheepEntity> {
	@Override
	public ResourceLocation getAnimationResource(SheepEntity entity) {
		return new ResourceLocation("how_to_own_a_dragon", "animations/sheep.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(SheepEntity entity) {
		return new ResourceLocation("how_to_own_a_dragon", "geo/sheep.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(SheepEntity entity) {
		return new ResourceLocation("how_to_own_a_dragon", "textures/entities/" + entity.getTexture() + ".png");
	}

}
