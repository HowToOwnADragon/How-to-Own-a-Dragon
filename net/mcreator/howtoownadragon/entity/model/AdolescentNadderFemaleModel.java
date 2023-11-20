package net.mcreator.howtoownadragon.entity.model;

import net.mcreator.howtoownadragon.entity.AdolescentNadderFemaleEntity;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;

public class AdolescentNadderFemaleModel extends GeoModel<AdolescentNadderFemaleEntity> {
   public ResourceLocation getAnimationResource(AdolescentNadderFemaleEntity entity) {
      return new ResourceLocation("how_to_own_a_dragon", "animations/adodeadlynadder.animation.json");
   }

   public ResourceLocation getModelResource(AdolescentNadderFemaleEntity entity) {
      return new ResourceLocation("how_to_own_a_dragon", "geo/adodeadlynadder.geo.json");
   }

   public ResourceLocation getTextureResource(AdolescentNadderFemaleEntity entity) {
      return new ResourceLocation("how_to_own_a_dragon", "textures/entities/" + entity.getTexture() + ".png");
   }
}
