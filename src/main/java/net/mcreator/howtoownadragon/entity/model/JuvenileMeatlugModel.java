package net.mcreator.howtoownadragon.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.howtoownadragon.entity.JuvenileMeatlugEntity;

public class JuvenileMeatlugModel extends GeoModel<JuvenileMeatlugEntity> {
	@Override
	public ResourceLocation getAnimationResource(JuvenileMeatlugEntity entity) {
		return new ResourceLocation("how_to_own_a_dragon", "animations/juvigronckle.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(JuvenileMeatlugEntity entity) {
		return new ResourceLocation("how_to_own_a_dragon", "geo/juvigronckle.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(JuvenileMeatlugEntity entity) {
		return new ResourceLocation("how_to_own_a_dragon", "textures/entities/" + entity.getTexture() + ".png");
	}

}
