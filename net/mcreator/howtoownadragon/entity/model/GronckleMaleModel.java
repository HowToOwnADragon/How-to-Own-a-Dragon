package net.mcreator.howtoownadragon.entity.model;

import net.mcreator.howtoownadragon.entity.GronckleMaleEntity;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;

public class GronckleMaleModel extends GeoModel<GronckleMaleEntity> {
   public ResourceLocation getAnimationResource(GronckleMaleEntity entity) {
      return new ResourceLocation("how_to_own_a_dragon", "animations/gronckle.animation.json");
   }

   public ResourceLocation getModelResource(GronckleMaleEntity entity) {
      return new ResourceLocation("how_to_own_a_dragon", "geo/gronckle.geo.json");
   }

   public ResourceLocation getTextureResource(GronckleMaleEntity entity) {
      return new ResourceLocation("how_to_own_a_dragon", "textures/entities/" + entity.getTexture() + ".png");
   }
}
