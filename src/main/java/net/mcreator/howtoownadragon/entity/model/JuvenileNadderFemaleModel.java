package net.mcreator.howtoownadragon.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.howtoownadragon.entity.JuvenileNadderFemaleEntity;

public class JuvenileNadderFemaleModel extends GeoModel<JuvenileNadderFemaleEntity> {
	@Override
	public ResourceLocation getAnimationResource(JuvenileNadderFemaleEntity entity) {
		return new ResourceLocation("how_to_own_a_dragon", "animations/juvideadlynadder.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(JuvenileNadderFemaleEntity entity) {
		return new ResourceLocation("how_to_own_a_dragon", "geo/juvideadlynadder.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(JuvenileNadderFemaleEntity entity) {
		return new ResourceLocation("how_to_own_a_dragon", "textures/entities/" + entity.getTexture() + ".png");
	}

}
