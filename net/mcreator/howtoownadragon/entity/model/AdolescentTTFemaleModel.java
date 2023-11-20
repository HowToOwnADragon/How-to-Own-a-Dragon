package net.mcreator.howtoownadragon.entity.model;

import net.mcreator.howtoownadragon.entity.AdolescentTTFemaleEntity;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;

public class AdolescentTTFemaleModel extends GeoModel<AdolescentTTFemaleEntity> {
   public ResourceLocation getAnimationResource(AdolescentTTFemaleEntity entity) {
      return new ResourceLocation("how_to_own_a_dragon", "animations/adott.animation.json");
   }

   public ResourceLocation getModelResource(AdolescentTTFemaleEntity entity) {
      return new ResourceLocation("how_to_own_a_dragon", "geo/adott.geo.json");
   }

   public ResourceLocation getTextureResource(AdolescentTTFemaleEntity entity) {
      return new ResourceLocation("how_to_own_a_dragon", "textures/entities/" + entity.getTexture() + ".png");
   }
}
