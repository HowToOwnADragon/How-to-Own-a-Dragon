
package net.mcreator.howtoownadragon.client.renderer;

import software.bernie.geckolib.renderer.GeoEntityRenderer;
import software.bernie.geckolib.cache.object.BakedGeoModel;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.howtoownadragon.entity.model.AdolescentGroncklePinkFemaleModel;
import net.mcreator.howtoownadragon.entity.AdolescentGroncklePinkFemaleEntity;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class AdolescentGroncklePinkFemaleRenderer extends GeoEntityRenderer<AdolescentGroncklePinkFemaleEntity> {
	public AdolescentGroncklePinkFemaleRenderer(EntityRendererProvider.Context renderManager) {
		super(renderManager, new AdolescentGroncklePinkFemaleModel());
		this.shadowRadius = 1f;
	}

	@Override
	public RenderType getRenderType(AdolescentGroncklePinkFemaleEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}

	@Override
	public void preRender(PoseStack poseStack, AdolescentGroncklePinkFemaleEntity entity, BakedGeoModel model, MultiBufferSource bufferSource, VertexConsumer buffer, boolean isReRender, float partialTick, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		float scale = 1f;
		this.scaleHeight = scale;
		this.scaleWidth = scale;
		super.preRender(poseStack, entity, model, bufferSource, buffer, isReRender, partialTick, packedLight, packedOverlay, red, green, blue, alpha);
	}
}
