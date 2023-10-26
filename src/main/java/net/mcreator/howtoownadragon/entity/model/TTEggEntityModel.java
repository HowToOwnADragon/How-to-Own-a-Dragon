package net.mcreator.howtoownadragon.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.howtoownadragon.entity.TTEggEntityEntity;

public class TTEggEntityModel extends GeoModel<TTEggEntityEntity> {
	@Override
	public ResourceLocation getAnimationResource(TTEggEntityEntity entity) {
		return new ResourceLocation("how_to_own_a_dragon", "animations/tteggmodelentity.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(TTEggEntityEntity entity) {
		return new ResourceLocation("how_to_own_a_dragon", "geo/tteggmodelentity.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(TTEggEntityEntity entity) {
		return new ResourceLocation("how_to_own_a_dragon", "textures/entities/" + entity.getTexture() + ".png");
	}

}
