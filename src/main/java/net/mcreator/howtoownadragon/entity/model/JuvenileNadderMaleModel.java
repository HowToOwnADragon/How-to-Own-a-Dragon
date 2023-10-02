package net.mcreator.howtoownadragon.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.howtoownadragon.entity.JuvenileNadderMaleEntity;

public class JuvenileNadderMaleModel extends GeoModel<JuvenileNadderMaleEntity> {
	@Override
	public ResourceLocation getAnimationResource(JuvenileNadderMaleEntity entity) {
		return new ResourceLocation("how_to_own_a_dragon", "animations/juvideadlynadder.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(JuvenileNadderMaleEntity entity) {
		return new ResourceLocation("how_to_own_a_dragon", "geo/juvideadlynadder.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(JuvenileNadderMaleEntity entity) {
		return new ResourceLocation("how_to_own_a_dragon", "textures/entities/" + entity.getTexture() + ".png");
	}

}
