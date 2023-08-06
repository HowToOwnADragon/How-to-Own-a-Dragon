package net.mcreator.howtoownadragon.client.renderer;

import net.minecraft.util.Mth;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.EntityRenderer;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.howtoownadragon.entity.GronckleAttackEntity;
import net.mcreator.howtoownadragon.client.model.Modelgronckleattack;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class GronckleAttackRenderer extends EntityRenderer<GronckleAttackEntity> {
	private static final ResourceLocation texture = new ResourceLocation("how_to_own_a_dragon:textures/entities/gronckleattack.png");
	private final Modelgronckleattack model;

	public GronckleAttackRenderer(EntityRendererProvider.Context context) {
		super(context);
		model = new Modelgronckleattack(context.bakeLayer(Modelgronckleattack.LAYER_LOCATION));
	}

	@Override
	public void render(GronckleAttackEntity entityIn, float entityYaw, float partialTicks, PoseStack poseStack, MultiBufferSource bufferIn, int packedLightIn) {
		VertexConsumer vb = bufferIn.getBuffer(RenderType.entityCutout(this.getTextureLocation(entityIn)));
		poseStack.pushPose();
		model.renderToBuffer(poseStack, vb, packedLightIn, OverlayTexture.NO_OVERLAY, 1, 1, 1, 0.0625f);
		poseStack.popPose();
		super.render(entityIn, entityYaw, partialTicks, poseStack, bufferIn, packedLightIn);
	}

	@Override
	public ResourceLocation getTextureLocation(GronckleAttackEntity entity) {
		return texture;
	}
}
