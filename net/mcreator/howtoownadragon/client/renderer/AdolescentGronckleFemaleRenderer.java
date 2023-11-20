package net.mcreator.howtoownadragon.client.renderer;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.mcreator.howtoownadragon.entity.AdolescentGronckleFemaleEntity;
import net.mcreator.howtoownadragon.entity.model.AdolescentGronckleFemaleModel;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRendererProvider.Context;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.cache.object.BakedGeoModel;
import software.bernie.geckolib.renderer.GeoEntityRenderer;

public class AdolescentGronckleFemaleRenderer extends GeoEntityRenderer<AdolescentGronckleFemaleEntity> {
   public AdolescentGronckleFemaleRenderer(Context renderManager) {
      super(renderManager, new AdolescentGronckleFemaleModel());
      this.f_114477_ = 1.0F;
   }

   public RenderType getRenderType(AdolescentGronckleFemaleEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
      return RenderType.m_110473_(this.m_5478_(animatable));
   }

   public void preRender(PoseStack poseStack, AdolescentGronckleFemaleEntity entity, BakedGeoModel model, MultiBufferSource bufferSource, VertexConsumer buffer, boolean isReRender, float partialTick, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
      float scale = 1.0F;
      this.scaleHeight = scale;
      this.scaleWidth = scale;
      super.preRender(poseStack, entity, model, bufferSource, buffer, isReRender, partialTick, packedLight, packedOverlay, red, green, blue, alpha);
   }
}
