package net.mcreator.howtoownadragon.entity.model;

import net.mcreator.howtoownadragon.entity.NightFuryEntity;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;

public class NightFuryModel extends GeoModel<NightFuryEntity> {
   public ResourceLocation getAnimationResource(NightFuryEntity entity) {
      return new ResourceLocation("how_to_own_a_dragon", "animations/nightfury.animation.json");
   }

   public ResourceLocation getModelResource(NightFuryEntity entity) {
      return new ResourceLocation("how_to_own_a_dragon", "geo/nightfury.geo.json");
   }

   public ResourceLocation getTextureResource(NightFuryEntity entity) {
      return new ResourceLocation("how_to_own_a_dragon", "textures/entities/" + entity.getTexture() + ".png");
   }
}
