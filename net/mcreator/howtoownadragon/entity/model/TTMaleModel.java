package net.mcreator.howtoownadragon.entity.model;

import net.mcreator.howtoownadragon.entity.TTMaleEntity;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;

public class TTMaleModel extends GeoModel<TTMaleEntity> {
   public ResourceLocation getAnimationResource(TTMaleEntity entity) {
      return new ResourceLocation("how_to_own_a_dragon", "animations/growntt.animation.json");
   }

   public ResourceLocation getModelResource(TTMaleEntity entity) {
      return new ResourceLocation("how_to_own_a_dragon", "geo/growntt.geo.json");
   }

   public ResourceLocation getTextureResource(TTMaleEntity entity) {
      return new ResourceLocation("how_to_own_a_dragon", "textures/entities/" + entity.getTexture() + ".png");
   }
}
