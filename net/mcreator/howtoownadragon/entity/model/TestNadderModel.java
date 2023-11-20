package net.mcreator.howtoownadragon.entity.model;

import net.mcreator.howtoownadragon.entity.TestNadderEntity;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;

public class TestNadderModel extends GeoModel<TestNadderEntity> {
   public ResourceLocation getAnimationResource(TestNadderEntity entity) {
      return new ResourceLocation("how_to_own_a_dragon", "animations/grownnadder.animation.json");
   }

   public ResourceLocation getModelResource(TestNadderEntity entity) {
      return new ResourceLocation("how_to_own_a_dragon", "geo/grownnadder.geo.json");
   }

   public ResourceLocation getTextureResource(TestNadderEntity entity) {
      return new ResourceLocation("how_to_own_a_dragon", "textures/entities/" + entity.getTexture() + ".png");
   }
}
