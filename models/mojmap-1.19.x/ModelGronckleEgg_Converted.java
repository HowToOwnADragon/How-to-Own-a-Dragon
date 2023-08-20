// Made with Blockbench 4.8.1
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class ModelGronckleEgg_Converted<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "gronckleegg_converted"), "main");
	private final ModelPart eggbody;

	public ModelGronckleEgg_Converted(ModelPart root) {
		this.eggbody = root.getChild("eggbody");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition eggbody = partdefinition.addOrReplaceChild("eggbody", CubeListBuilder.create().texOffs(20, 0)
				.addBox(-11.3F, -2.43F, 4.58F, 5.72F, 1.43F, 5.72F, new CubeDeformation(0.0F)).texOffs(7, 0)
				.addBox(-12.015F, -7.578F, 3.865F, 7.15F, 5.72F, 7.15F, new CubeDeformation(0.0F)).texOffs(20, 12)
				.addBox(-11.3F, -8.722F, 4.58F, 5.72F, 1.43F, 5.72F, new CubeDeformation(0.0F)).texOffs(17, 18).mirror()
				.addBox(-10.585F, -9.294F, 5.295F, 4.29F, 1.43F, 4.29F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offset(8.0F, 24.0F, -8.0F));

		PartDefinition eggstip = eggbody.addOrReplaceChild("eggstip",
				CubeListBuilder.create().texOffs(6, 23)
						.addBox(-11.4F, -3.6F, 3.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(23, 23)
						.addBox(-12.4F, -3.6F, 5.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(23, 23)
						.addBox(-12.1F, -5.6F, 6.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(2, 24)
						.addBox(-12.3F, -4.0F, 9.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(8, 24)
						.addBox(-12.2F, -7.0F, 8.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(24, 24)
						.addBox(-5.4F, -7.0F, 8.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(24, 24)
						.addBox(-5.6F, -5.6F, 6.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 25)
						.addBox(-5.3F, -3.6F, 5.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(6, 25)
						.addBox(-5.7F, -4.0F, 9.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(12, 14)
						.addBox(-10.0F, -5.0F, 3.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(16, 17)
						.addBox(-11.0F, -7.0F, 3.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(19, 20)
						.addBox(-7.0F, -6.0F, 3.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(22, 23)
						.addBox(-8.0F, -4.0F, 3.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition eggstips = eggbody.addOrReplaceChild("eggstips",
				CubeListBuilder.create().texOffs(25, 26)
						.addBox(-10.0F, -6.0F, 10.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(26, 26)
						.addBox(-10.0F, -4.0F, 10.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(26, 26)
						.addBox(-7.0F, -7.0F, 10.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(26, 26)
						.addBox(-8.0F, -5.0F, 10.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 32, 32);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {

	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		eggbody.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}