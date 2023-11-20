package net.mcreator.howtoownadragon.client.renderer;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.mcreator.howtoownadragon.client.model.Modelgronckleattack;
import net.mcreator.howtoownadragon.entity.GronckleAttackEntity;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider.Context;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.resources.ResourceLocation;

public class GronckleAttackRenderer extends EntityRenderer<GronckleAttackEntity> {
   private static final ResourceLocation texture = new ResourceLocation("how_to_own_a_dragon:textures/entities/gronckleattack.png");
   private final Modelgronckleattack model;

   public GronckleAttackRenderer(Context context) {
      super(context);
      this.model = new Modelgronckleattack(context.m_174023_(Modelgronckleattack.LAYER_LOCATION));
   }

   public void render(GronckleAttackEntity entityIn, float entityYaw, float partialTicks, PoseStack poseStack, MultiBufferSource bufferIn, int packedLightIn) {
      VertexConsumer vb = bufferIn.m_6299_(RenderType.m_110452_(this.getTextureLocation(entityIn)));
      poseStack.m_85836_();
      this.model.m_7695_(poseStack, vb, packedLightIn, OverlayTexture.f_118083_, 1.0F, 1.0F, 1.0F, 0.0625F);
      poseStack.m_85849_();
      super.m_7392_(entityIn, entityYaw, partialTicks, poseStack, bufferIn, packedLightIn);
   }

   public ResourceLocation getTextureLocation(GronckleAttackEntity entity) {
      return texture;
   }
}
