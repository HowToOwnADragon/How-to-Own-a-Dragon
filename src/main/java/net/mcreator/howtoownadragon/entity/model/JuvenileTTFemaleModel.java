package net.mcreator.howtoownadragon.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.howtoownadragon.entity.JuvenileTTFemaleEntity;

public class JuvenileTTFemaleModel extends GeoModel<JuvenileTTFemaleEntity> {
	@Override
	public ResourceLocation getAnimationResource(JuvenileTTFemaleEntity entity) {
		return new ResourceLocation("how_to_own_a_dragon", "animations/growntt.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(JuvenileTTFemaleEntity entity) {
		return new ResourceLocation("how_to_own_a_dragon", "geo/growntt.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(JuvenileTTFemaleEntity entity) {
		return new ResourceLocation("how_to_own_a_dragon", "textures/entities/" + entity.getTexture() + ".png");
	}

}
