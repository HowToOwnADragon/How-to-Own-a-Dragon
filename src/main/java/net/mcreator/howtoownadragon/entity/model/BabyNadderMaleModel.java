package net.mcreator.howtoownadragon.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.howtoownadragon.entity.BabyNadderMaleEntity;

public class BabyNadderMaleModel extends GeoModel<BabyNadderMaleEntity> {
	@Override
	public ResourceLocation getAnimationResource(BabyNadderMaleEntity entity) {
		return new ResourceLocation("how_to_own_a_dragon", "animations/babydeadlynadder.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(BabyNadderMaleEntity entity) {
		return new ResourceLocation("how_to_own_a_dragon", "geo/babydeadlynadder.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(BabyNadderMaleEntity entity) {
		return new ResourceLocation("how_to_own_a_dragon", "textures/entities/" + entity.getTexture() + ".png");
	}

}
