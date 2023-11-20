package net.mcreator.howtoownadragon.entity.model;

import net.mcreator.howtoownadragon.entity.TTEggEntityEntity;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;

public class TTEggEntityModel extends GeoModel<TTEggEntityEntity> {
   public ResourceLocation getAnimationResource(TTEggEntityEntity entity) {
      return new ResourceLocation("how_to_own_a_dragon", "animations/tteggmodelentity.animation.json");
   }

   public ResourceLocation getModelResource(TTEggEntityEntity entity) {
      return new ResourceLocation("how_to_own_a_dragon", "geo/tteggmodelentity.geo.json");
   }

   public ResourceLocation getTextureResource(TTEggEntityEntity entity) {
      return new ResourceLocation("how_to_own_a_dragon", "textures/entities/" + entity.getTexture() + ".png");
   }
}
