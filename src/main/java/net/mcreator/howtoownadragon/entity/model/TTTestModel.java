package net.mcreator.howtoownadragon.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.howtoownadragon.entity.TTTestEntity;

public class TTTestModel extends GeoModel<TTTestEntity> {
	@Override
	public ResourceLocation getAnimationResource(TTTestEntity entity) {
		return new ResourceLocation("how_to_own_a_dragon", "animations/growntt.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(TTTestEntity entity) {
		return new ResourceLocation("how_to_own_a_dragon", "geo/growntt.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(TTTestEntity entity) {
		return new ResourceLocation("how_to_own_a_dragon", "textures/entities/" + entity.getTexture() + ".png");
	}

}
