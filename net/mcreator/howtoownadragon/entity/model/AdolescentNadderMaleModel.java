package net.mcreator.howtoownadragon.entity.model;

import net.mcreator.howtoownadragon.entity.AdolescentNadderMaleEntity;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;

public class AdolescentNadderMaleModel extends GeoModel<AdolescentNadderMaleEntity> {
   public ResourceLocation getAnimationResource(AdolescentNadderMaleEntity entity) {
      return new ResourceLocation("how_to_own_a_dragon", "animations/adodeadlynadder.animation.json");
   }

   public ResourceLocation getModelResource(AdolescentNadderMaleEntity entity) {
      return new ResourceLocation("how_to_own_a_dragon", "geo/adodeadlynadder.geo.json");
   }

   public ResourceLocation getTextureResource(AdolescentNadderMaleEntity entity) {
      return new ResourceLocation("how_to_own_a_dragon", "textures/entities/" + entity.getTexture() + ".png");
   }
}
