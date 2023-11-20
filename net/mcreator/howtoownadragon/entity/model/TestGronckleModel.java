package net.mcreator.howtoownadragon.entity.model;

import net.mcreator.howtoownadragon.entity.TestGronckleEntity;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;

public class TestGronckleModel extends GeoModel<TestGronckleEntity> {
   public ResourceLocation getAnimationResource(TestGronckleEntity entity) {
      return new ResourceLocation("how_to_own_a_dragon", "animations/gronckle.animation.json");
   }

   public ResourceLocation getModelResource(TestGronckleEntity entity) {
      return new ResourceLocation("how_to_own_a_dragon", "geo/gronckle.geo.json");
   }

   public ResourceLocation getTextureResource(TestGronckleEntity entity) {
      return new ResourceLocation("how_to_own_a_dragon", "textures/entities/" + entity.getTexture() + ".png");
   }
}
