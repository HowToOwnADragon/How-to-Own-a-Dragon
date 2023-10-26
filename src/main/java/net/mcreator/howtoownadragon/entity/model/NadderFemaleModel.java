package net.mcreator.howtoownadragon.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.howtoownadragon.entity.NadderFemaleEntity;

public class NadderFemaleModel extends GeoModel<NadderFemaleEntity> {
	@Override
	public ResourceLocation getAnimationResource(NadderFemaleEntity entity) {
		return new ResourceLocation("how_to_own_a_dragon", "animations/grownnadder.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(NadderFemaleEntity entity) {
		return new ResourceLocation("how_to_own_a_dragon", "geo/grownnadder.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(NadderFemaleEntity entity) {
		return new ResourceLocation("how_to_own_a_dragon", "textures/entities/" + entity.getTexture() + ".png");
	}

}
