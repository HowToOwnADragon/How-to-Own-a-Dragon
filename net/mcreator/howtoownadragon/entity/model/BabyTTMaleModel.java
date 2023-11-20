package net.mcreator.howtoownadragon.entity.model;

import net.mcreator.howtoownadragon.entity.BabyTTMaleEntity;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;

public class BabyTTMaleModel extends GeoModel<BabyTTMaleEntity> {
   public ResourceLocation getAnimationResource(BabyTTMaleEntity entity) {
      return new ResourceLocation("how_to_own_a_dragon", "animations/babytt.animation.json");
   }

   public ResourceLocation getModelResource(BabyTTMaleEntity entity) {
      return new ResourceLocation("how_to_own_a_dragon", "geo/babytt.geo.json");
   }

   public ResourceLocation getTextureResource(BabyTTMaleEntity entity) {
      return new ResourceLocation("how_to_own_a_dragon", "textures/entities/" + entity.getTexture() + ".png");
   }
}
