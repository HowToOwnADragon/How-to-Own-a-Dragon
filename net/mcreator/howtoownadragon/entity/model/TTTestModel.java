package net.mcreator.howtoownadragon.entity.model;

import net.mcreator.howtoownadragon.entity.TTTestEntity;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;

public class TTTestModel extends GeoModel<TTTestEntity> {
   public ResourceLocation getAnimationResource(TTTestEntity entity) {
      return new ResourceLocation("how_to_own_a_dragon", "animations/growntt.animation.json");
   }

   public ResourceLocation getModelResource(TTTestEntity entity) {
      return new ResourceLocation("how_to_own_a_dragon", "geo/growntt.geo.json");
   }

   public ResourceLocation getTextureResource(TTTestEntity entity) {
      return new ResourceLocation("how_to_own_a_dragon", "textures/entities/" + entity.getTexture() + ".png");
   }
}
