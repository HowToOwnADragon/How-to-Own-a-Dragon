package net.mcreator.howtoownadragon.entity.model;

import net.mcreator.howtoownadragon.entity.TTFemaleEntity;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;

public class TTFemaleModel extends GeoModel<TTFemaleEntity> {
   public ResourceLocation getAnimationResource(TTFemaleEntity entity) {
      return new ResourceLocation("how_to_own_a_dragon", "animations/growntt.animation.json");
   }

   public ResourceLocation getModelResource(TTFemaleEntity entity) {
      return new ResourceLocation("how_to_own_a_dragon", "geo/growntt.geo.json");
   }

   public ResourceLocation getTextureResource(TTFemaleEntity entity) {
      return new ResourceLocation("how_to_own_a_dragon", "textures/entities/" + entity.getTexture() + ".png");
   }
}
