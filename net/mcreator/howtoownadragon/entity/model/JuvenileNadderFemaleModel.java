package net.mcreator.howtoownadragon.entity.model;

import net.mcreator.howtoownadragon.entity.JuvenileNadderFemaleEntity;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;

public class JuvenileNadderFemaleModel extends GeoModel<JuvenileNadderFemaleEntity> {
   public ResourceLocation getAnimationResource(JuvenileNadderFemaleEntity entity) {
      return new ResourceLocation("how_to_own_a_dragon", "animations/juvideadlynadder.animation.json");
   }

   public ResourceLocation getModelResource(JuvenileNadderFemaleEntity entity) {
      return new ResourceLocation("how_to_own_a_dragon", "geo/juvideadlynadder.geo.json");
   }

   public ResourceLocation getTextureResource(JuvenileNadderFemaleEntity entity) {
      return new ResourceLocation("how_to_own_a_dragon", "textures/entities/" + entity.getTexture() + ".png");
   }
}
