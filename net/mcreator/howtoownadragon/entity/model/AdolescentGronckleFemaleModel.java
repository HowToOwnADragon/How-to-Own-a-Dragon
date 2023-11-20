package net.mcreator.howtoownadragon.entity.model;

import net.mcreator.howtoownadragon.entity.AdolescentGronckleFemaleEntity;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;

public class AdolescentGronckleFemaleModel extends GeoModel<AdolescentGronckleFemaleEntity> {
   public ResourceLocation getAnimationResource(AdolescentGronckleFemaleEntity entity) {
      return new ResourceLocation("how_to_own_a_dragon", "animations/adogronckle.animation.json");
   }

   public ResourceLocation getModelResource(AdolescentGronckleFemaleEntity entity) {
      return new ResourceLocation("how_to_own_a_dragon", "geo/adogronckle.geo.json");
   }

   public ResourceLocation getTextureResource(AdolescentGronckleFemaleEntity entity) {
      return new ResourceLocation("how_to_own_a_dragon", "textures/entities/" + entity.getTexture() + ".png");
   }
}
