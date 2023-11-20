package net.mcreator.howtoownadragon.entity.model;

import net.mcreator.howtoownadragon.entity.BabyGronckleFemaleEntity;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;

public class BabyGronckleFemaleModel extends GeoModel<BabyGronckleFemaleEntity> {
   public ResourceLocation getAnimationResource(BabyGronckleFemaleEntity entity) {
      return new ResourceLocation("how_to_own_a_dragon", "animations/babygronckle.animation.json");
   }

   public ResourceLocation getModelResource(BabyGronckleFemaleEntity entity) {
      return new ResourceLocation("how_to_own_a_dragon", "geo/babygronckle.geo.json");
   }

   public ResourceLocation getTextureResource(BabyGronckleFemaleEntity entity) {
      return new ResourceLocation("how_to_own_a_dragon", "textures/entities/" + entity.getTexture() + ".png");
   }
}
