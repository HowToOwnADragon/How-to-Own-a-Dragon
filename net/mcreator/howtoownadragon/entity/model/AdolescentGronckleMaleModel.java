package net.mcreator.howtoownadragon.entity.model;

import net.mcreator.howtoownadragon.entity.AdolescentGronckleMaleEntity;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;

public class AdolescentGronckleMaleModel extends GeoModel<AdolescentGronckleMaleEntity> {
   public ResourceLocation getAnimationResource(AdolescentGronckleMaleEntity entity) {
      return new ResourceLocation("how_to_own_a_dragon", "animations/adogronckle.animation.json");
   }

   public ResourceLocation getModelResource(AdolescentGronckleMaleEntity entity) {
      return new ResourceLocation("how_to_own_a_dragon", "geo/adogronckle.geo.json");
   }

   public ResourceLocation getTextureResource(AdolescentGronckleMaleEntity entity) {
      return new ResourceLocation("how_to_own_a_dragon", "textures/entities/" + entity.getTexture() + ".png");
   }
}
