package net.mcreator.howtoownadragon.entity.model;

import net.mcreator.howtoownadragon.entity.AdolescentTTMaleEntity;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;

public class AdolescentTTMaleModel extends GeoModel<AdolescentTTMaleEntity> {
   public ResourceLocation getAnimationResource(AdolescentTTMaleEntity entity) {
      return new ResourceLocation("how_to_own_a_dragon", "animations/adott.animation.json");
   }

   public ResourceLocation getModelResource(AdolescentTTMaleEntity entity) {
      return new ResourceLocation("how_to_own_a_dragon", "geo/adott.geo.json");
   }

   public ResourceLocation getTextureResource(AdolescentTTMaleEntity entity) {
      return new ResourceLocation("how_to_own_a_dragon", "textures/entities/" + entity.getTexture() + ".png");
   }
}
