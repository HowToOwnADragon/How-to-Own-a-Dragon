package net.mcreator.howtoownadragon.entity.model;

import net.mcreator.howtoownadragon.entity.JuvenileGronckleFemaleEntity;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;

public class JuvenileGronckleFemaleModel extends GeoModel<JuvenileGronckleFemaleEntity> {
   public ResourceLocation getAnimationResource(JuvenileGronckleFemaleEntity entity) {
      return new ResourceLocation("how_to_own_a_dragon", "animations/juvigronckle.animation.json");
   }

   public ResourceLocation getModelResource(JuvenileGronckleFemaleEntity entity) {
      return new ResourceLocation("how_to_own_a_dragon", "geo/juvigronckle.geo.json");
   }

   public ResourceLocation getTextureResource(JuvenileGronckleFemaleEntity entity) {
      return new ResourceLocation("how_to_own_a_dragon", "textures/entities/" + entity.getTexture() + ".png");
   }
}
