package net.mcreator.howtoownadragon.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.howtoownadragon.entity.BabyNadderFemaleEntity;

public class BabyNadderFemaleModel extends GeoModel<BabyNadderFemaleEntity> {
	@Override
	public ResourceLocation getAnimationResource(BabyNadderFemaleEntity entity) {
		return new ResourceLocation("how_to_own_a_dragon", "animations/babydeadlynadder.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(BabyNadderFemaleEntity entity) {
		return new ResourceLocation("how_to_own_a_dragon", "geo/babydeadlynadder.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(BabyNadderFemaleEntity entity) {
		return new ResourceLocation("how_to_own_a_dragon", "textures/entities/" + entity.getTexture() + ".png");
	}

}
