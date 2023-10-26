
package net.mcreator.howtoownadragon.client.renderer;

public class TestNadderRenderer extends GeoEntityRenderer<TestNadderEntity> {
	public TestNadderRenderer(EntityRendererProvider.Context renderManager) {
		super(renderManager, new TestNadderModel());
		this.shadowRadius = 0.5f;
	}

	@Override
	public RenderType getRenderType(TestNadderEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}

	@Override
	public void preRender(PoseStack poseStack, TestNadderEntity entity, BakedGeoModel model, MultiBufferSource bufferSource, VertexConsumer buffer, boolean isReRender, float partialTick, int packedLight, int packedOverlay, float red, float green,
			float blue, float alpha) {
		float scale = 1f;
		this.scaleHeight = scale;
		this.scaleWidth = scale;
		super.preRender(poseStack, entity, model, bufferSource, buffer, isReRender, partialTick, packedLight, packedOverlay, red, green, blue, alpha);
	}

}