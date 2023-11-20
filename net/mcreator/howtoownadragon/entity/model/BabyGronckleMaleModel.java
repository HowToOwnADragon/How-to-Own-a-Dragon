package net.mcreator.howtoownadragon.entity.model;

import net.mcreator.howtoownadragon.entity.BabyGronckleMaleEntity;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;

public class BabyGronckleMaleModel extends GeoModel<BabyGronckleMaleEntity> {
   public ResourceLocation getAnimationResource(BabyGronckleMaleEntity entity) {
      return new ResourceLocation("how_to_own_a_dragon", "animations/babygronckle.animation.json");
   }

   public ResourceLocation getModelResource(BabyGronckleMaleEntity entity) {
      return new ResourceLocation("how_to_own_a_dragon", "geo/babygronckle.geo.json");
   }

   public ResourceLocation getTextureResource(BabyGronckleMaleEntity entity) {
      return new ResourceLocation("how_to_own_a_dragon", "textures/entities/" + entity.getTexture() + ".png");
   }
}
