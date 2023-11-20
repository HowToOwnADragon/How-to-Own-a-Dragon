package net.mcreator.howtoownadragon.entity.model;

import net.mcreator.howtoownadragon.entity.JuvenileTTFemaleEntity;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;

public class JuvenileTTFemaleModel extends GeoModel<JuvenileTTFemaleEntity> {
   public ResourceLocation getAnimationResource(JuvenileTTFemaleEntity entity) {
      return new ResourceLocation("how_to_own_a_dragon", "animations/juvitt.animation.json");
   }

   public ResourceLocation getModelResource(JuvenileTTFemaleEntity entity) {
      return new ResourceLocation("how_to_own_a_dragon", "geo/juvitt.geo.json");
   }

   public ResourceLocation getTextureResource(JuvenileTTFemaleEntity entity) {
      return new ResourceLocation("how_to_own_a_dragon", "textures/entities/" + entity.getTexture() + ".png");
   }
}
