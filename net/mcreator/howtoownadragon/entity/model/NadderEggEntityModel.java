package net.mcreator.howtoownadragon.entity.model;

import net.mcreator.howtoownadragon.entity.NadderEggEntityEntity;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;

public class NadderEggEntityModel extends GeoModel<NadderEggEntityEntity> {
   public ResourceLocation getAnimationResource(NadderEggEntityEntity entity) {
      return new ResourceLocation("how_to_own_a_dragon", "animations/nadderegg.animation.json");
   }

   public ResourceLocation getModelResource(NadderEggEntityEntity entity) {
      return new ResourceLocation("how_to_own_a_dragon", "geo/nadderegg.geo.json");
   }

   public ResourceLocation getTextureResource(NadderEggEntityEntity entity) {
      return new ResourceLocation("how_to_own_a_dragon", "textures/entities/" + entity.getTexture() + ".png");
   }
}
