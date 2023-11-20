package net.mcreator.howtoownadragon.entity.model;

import net.mcreator.howtoownadragon.entity.NadderMaleEntity;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;

public class NadderMaleModel extends GeoModel<NadderMaleEntity> {
   public ResourceLocation getAnimationResource(NadderMaleEntity entity) {
      return new ResourceLocation("how_to_own_a_dragon", "animations/grownnadder.animation.json");
   }

   public ResourceLocation getModelResource(NadderMaleEntity entity) {
      return new ResourceLocation("how_to_own_a_dragon", "geo/grownnadder.geo.json");
   }

   public ResourceLocation getTextureResource(NadderMaleEntity entity) {
      return new ResourceLocation("how_to_own_a_dragon", "textures/entities/" + entity.getTexture() + ".png");
   }
}
