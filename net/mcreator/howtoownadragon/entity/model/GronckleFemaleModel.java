package net.mcreator.howtoownadragon.entity.model;

import net.mcreator.howtoownadragon.entity.GronckleFemaleEntity;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;

public class GronckleFemaleModel extends GeoModel<GronckleFemaleEntity> {
   public ResourceLocation getAnimationResource(GronckleFemaleEntity entity) {
      return new ResourceLocation("how_to_own_a_dragon", "animations/gronckle.animation.json");
   }

   public ResourceLocation getModelResource(GronckleFemaleEntity entity) {
      return new ResourceLocation("how_to_own_a_dragon", "geo/gronckle.geo.json");
   }

   public ResourceLocation getTextureResource(GronckleFemaleEntity entity) {
      return new ResourceLocation("how_to_own_a_dragon", "textures/entities/" + entity.getTexture() + ".png");
   }
}
