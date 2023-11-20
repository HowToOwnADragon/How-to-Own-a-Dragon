package net.mcreator.howtoownadragon.entity.model;

import net.mcreator.howtoownadragon.entity.NadderFemaleEntity;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;

public class NadderFemaleModel extends GeoModel<NadderFemaleEntity> {
   public ResourceLocation getAnimationResource(NadderFemaleEntity entity) {
      return new ResourceLocation("how_to_own_a_dragon", "animations/grownnadder.animation.json");
   }

   public ResourceLocation getModelResource(NadderFemaleEntity entity) {
      return new ResourceLocation("how_to_own_a_dragon", "geo/grownnadder.geo.json");
   }

   public ResourceLocation getTextureResource(NadderFemaleEntity entity) {
      return new ResourceLocation("how_to_own_a_dragon", "textures/entities/" + entity.getTexture() + ".png");
   }
}
