package net.mcreator.howtoownadragon.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.howtoownadragon.entity.NadderEggEntityEntity;

public class NadderEggEntityModel extends GeoModel<NadderEggEntityEntity> {
	@Override
	public ResourceLocation getAnimationResource(NadderEggEntityEntity entity) {
		return new ResourceLocation("how_to_own_a_dragon", "animations/nadderegg.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(NadderEggEntityEntity entity) {
		return new ResourceLocation("how_to_own_a_dragon", "geo/nadderegg.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(NadderEggEntityEntity entity) {
		return new ResourceLocation("how_to_own_a_dragon", "textures/entities/" + entity.getTexture() + ".png");
	}

}
