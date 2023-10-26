package net.mcreator.howtoownadragon.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.howtoownadragon.entity.NadderMaleEntity;

public class NadderMaleModel extends GeoModel<NadderMaleEntity> {
	@Override
	public ResourceLocation getAnimationResource(NadderMaleEntity entity) {
		return new ResourceLocation("how_to_own_a_dragon", "animations/grownnadder.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(NadderMaleEntity entity) {
		return new ResourceLocation("how_to_own_a_dragon", "geo/grownnadder.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(NadderMaleEntity entity) {
		return new ResourceLocation("how_to_own_a_dragon", "textures/entities/" + entity.getTexture() + ".png");
	}

}
