package net.mcreator.howtoownadragon.entity.model;

import net.mcreator.howtoownadragon.entity.JuvenileNadderMaleEntity;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;

public class JuvenileNadderMaleModel extends GeoModel<JuvenileNadderMaleEntity> {
   public ResourceLocation getAnimationResource(JuvenileNadderMaleEntity entity) {
      return new ResourceLocation("how_to_own_a_dragon", "animations/juvideadlynadder.animation.json");
   }

   public ResourceLocation getModelResource(JuvenileNadderMaleEntity entity) {
      return new ResourceLocation("how_to_own_a_dragon", "geo/juvideadlynadder.geo.json");
   }

   public ResourceLocation getTextureResource(JuvenileNadderMaleEntity entity) {
      return new ResourceLocation("how_to_own_a_dragon", "textures/entities/" + entity.getTexture() + ".png");
   }
}
