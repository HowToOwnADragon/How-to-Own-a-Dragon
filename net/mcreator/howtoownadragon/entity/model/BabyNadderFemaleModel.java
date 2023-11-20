package net.mcreator.howtoownadragon.entity.model;

import net.mcreator.howtoownadragon.entity.BabyNadderFemaleEntity;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;

public class BabyNadderFemaleModel extends GeoModel<BabyNadderFemaleEntity> {
   public ResourceLocation getAnimationResource(BabyNadderFemaleEntity entity) {
      return new ResourceLocation("how_to_own_a_dragon", "animations/babydeadlynadder.animation.json");
   }

   public ResourceLocation getModelResource(BabyNadderFemaleEntity entity) {
      return new ResourceLocation("how_to_own_a_dragon", "geo/babydeadlynadder.geo.json");
   }

   public ResourceLocation getTextureResource(BabyNadderFemaleEntity entity) {
      return new ResourceLocation("how_to_own_a_dragon", "textures/entities/" + entity.getTexture() + ".png");
   }
}
