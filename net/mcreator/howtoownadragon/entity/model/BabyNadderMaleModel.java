package net.mcreator.howtoownadragon.entity.model;

import net.mcreator.howtoownadragon.entity.BabyNadderMaleEntity;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;

public class BabyNadderMaleModel extends GeoModel<BabyNadderMaleEntity> {
   public ResourceLocation getAnimationResource(BabyNadderMaleEntity entity) {
      return new ResourceLocation("how_to_own_a_dragon", "animations/babydeadlynadder.animation.json");
   }

   public ResourceLocation getModelResource(BabyNadderMaleEntity entity) {
      return new ResourceLocation("how_to_own_a_dragon", "geo/babydeadlynadder.geo.json");
   }

   public ResourceLocation getTextureResource(BabyNadderMaleEntity entity) {
      return new ResourceLocation("how_to_own_a_dragon", "textures/entities/" + entity.getTexture() + ".png");
   }
}
