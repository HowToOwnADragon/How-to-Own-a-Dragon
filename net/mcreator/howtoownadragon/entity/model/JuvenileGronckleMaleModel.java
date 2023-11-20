package net.mcreator.howtoownadragon.entity.model;

import net.mcreator.howtoownadragon.entity.JuvenileGronckleMaleEntity;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;

public class JuvenileGronckleMaleModel extends GeoModel<JuvenileGronckleMaleEntity> {
   public ResourceLocation getAnimationResource(JuvenileGronckleMaleEntity entity) {
      return new ResourceLocation("how_to_own_a_dragon", "animations/juvigronckle.animation.json");
   }

   public ResourceLocation getModelResource(JuvenileGronckleMaleEntity entity) {
      return new ResourceLocation("how_to_own_a_dragon", "geo/juvigronckle.geo.json");
   }

   public ResourceLocation getTextureResource(JuvenileGronckleMaleEntity entity) {
      return new ResourceLocation("how_to_own_a_dragon", "textures/entities/" + entity.getTexture() + ".png");
   }
}
