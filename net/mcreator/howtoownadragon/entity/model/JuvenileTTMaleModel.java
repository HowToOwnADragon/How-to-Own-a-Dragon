package net.mcreator.howtoownadragon.entity.model;

import net.mcreator.howtoownadragon.entity.JuvenileTTMaleEntity;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;

public class JuvenileTTMaleModel extends GeoModel<JuvenileTTMaleEntity> {
   public ResourceLocation getAnimationResource(JuvenileTTMaleEntity entity) {
      return new ResourceLocation("how_to_own_a_dragon", "animations/juvitt.animation.json");
   }

   public ResourceLocation getModelResource(JuvenileTTMaleEntity entity) {
      return new ResourceLocation("how_to_own_a_dragon", "geo/juvitt.geo.json");
   }

   public ResourceLocation getTextureResource(JuvenileTTMaleEntity entity) {
      return new ResourceLocation("how_to_own_a_dragon", "textures/entities/" + entity.getTexture() + ".png");
   }
}
