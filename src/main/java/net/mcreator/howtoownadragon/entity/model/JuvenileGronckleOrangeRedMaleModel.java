package net.mcreator.howtoownadragon.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.howtoownadragon.entity.JuvenileGronckleOrangeRedMaleEntity;

public class JuvenileGronckleOrangeRedMaleModel extends GeoModel<JuvenileGronckleOrangeRedMaleEntity> {
	@Override
	public ResourceLocation getAnimationResource(JuvenileGronckleOrangeRedMaleEntity entity) {
		return new ResourceLocation("how_to_own_a_dragon", "animations/juvigronckle.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(JuvenileGronckleOrangeRedMaleEntity entity) {
		return new ResourceLocation("how_to_own_a_dragon", "geo/juvigronckle.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(JuvenileGronckleOrangeRedMaleEntity entity) {
		return new ResourceLocation("how_to_own_a_dragon", "textures/entities/" + entity.getTexture() + ".png");
	}

}
