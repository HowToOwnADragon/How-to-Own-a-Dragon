package net.mcreator.howtoownadragon.entity.model;

import net.mcreator.howtoownadragon.entity.BabyTTFemaleEntity;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;

public class BabyTTFemaleModel extends GeoModel<BabyTTFemaleEntity> {
   public ResourceLocation getAnimationResource(BabyTTFemaleEntity entity) {
      return new ResourceLocation("how_to_own_a_dragon", "animations/babytt.animation.json");
   }

   public ResourceLocation getModelResource(BabyTTFemaleEntity entity) {
      return new ResourceLocation("how_to_own_a_dragon", "geo/babytt.geo.json");
   }

   public ResourceLocation getTextureResource(BabyTTFemaleEntity entity) {
      return new ResourceLocation("how_to_own_a_dragon", "textures/entities/" + entity.getTexture() + ".png");
   }
}
