// Made with Blockbench 4.8.1
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class ModelGronckleEggItemImprovedentity<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "gronckleeggitemimprovedentity"), "main");
	private final ModelPart EGG;

	public ModelGronckleEggItemImprovedentity(ModelPart root) {
		this.EGG = root.getChild("EGG");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition EGG = partdefinition.addOrReplaceChild("EGG",
				CubeListBuilder.create().texOffs(0, 0)
						.addBox(-5.9211F, 1.5624F, -0.9709F, 9.0F, 8.5F, 9.0F, new CubeDeformation(0.0F)).texOffs(0, 18)
						.addBox(-5.4211F, -2.1876F, -0.4709F, 8.0F, 3.75F, 8.0F, new CubeDeformation(0.0F))
						.texOffs(0, 30).mirror()
						.addBox(-4.4211F, -3.1876F, 0.5291F, 6.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offset(1.4211F, 13.9376F, -3.5291F));

		PartDefinition cube_r1 = EGG.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(56, 4).mirror()
						.addBox(-5.8211F, 1.625F, 2.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
						.texOffs(56, 0).mirror()
						.addBox(-2.75F, 5.625F, -0.25F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.7854F, 0.0F, 0.0F));

		PartDefinition cube_r2 = EGG.addOrReplaceChild("cube_r2",
				CubeListBuilder.create().texOffs(56, 2).addBox(-1.0F, -3.0F, 3.0F, 2.0F, 2.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-5.2221F, 7.7755F, 3.3426F, 0.7854F, 0.0F, 0.0F));

		PartDefinition cube_r3 = EGG.addOrReplaceChild("cube_r3",
				CubeListBuilder.create().texOffs(56, 2).addBox(1.0F, 0.125F, -1.75F, 2.0F, 2.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-5.9721F, 4.9025F, 4.1407F, 0.7854F, 0.0F, 0.0F));

		PartDefinition cube_r4 = EGG.addOrReplaceChild("cube_r4",
				CubeListBuilder.create().texOffs(56, 0).addBox(1.5F, 0.0F, -0.625F, 2.0F, 2.0F, 1.75F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.4706F, 5.6664F, 7.8928F, 0.0F, 0.0F, 0.3927F));

		PartDefinition cube_r5 = EGG.addOrReplaceChild("cube_r5",
				CubeListBuilder.create().texOffs(56, 1).addBox(-1.0F, 0.625F, -1.3441F, 2.0F, 1.75F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.0494F, 3.4574F, 8.0732F, 0.0F, 0.0F, -0.3927F));

		PartDefinition cube_r6 = EGG.addOrReplaceChild("cube_r6",
				CubeListBuilder.create().texOffs(54, 2).mirror()
						.addBox(-9.5F, 0.375F, -2.5F, 2.0F, 1.75F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(2.6737F, 6.0624F, 4.7735F, 0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r7 = EGG.addOrReplaceChild("cube_r7",
				CubeListBuilder.create().texOffs(54, 2).addBox(-1.0F, -2.0F, 1.375F, 2.0F, 2.0F, 1.75F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.7706F, 8.2252F, -0.4985F, -0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r8 = EGG.addOrReplaceChild("cube_r8",
				CubeListBuilder.create().texOffs(54, 0).addBox(-1.0F, -0.875F, 0.0F, 2.0F, 2.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.6737F, 6.0624F, 4.7735F, 0.7854F, 0.0F, 0.0F));

		PartDefinition cube_r9 = EGG.addOrReplaceChild("cube_r9",
				CubeListBuilder.create().texOffs(56, 0).addBox(-0.5F, 4.25F, -0.625F, 2.0F, 2.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.8421F, -0.8365F, 2.9635F, -0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r10 = EGG
				.addOrReplaceChild("cube_r10",
						CubeListBuilder.create().texOffs(54, 0).addBox(-2.75F, -1.125F, -1.0F, 2.0F, 1.75F, 2.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.3927F));

		PartDefinition cube_r11 = EGG.addOrReplaceChild("cube_r11",
				CubeListBuilder.create().texOffs(56, 0).addBox(-1.0F, -2.125F, -2.0F, 2.0F, 2.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.0348F, -0.2865F, 7.1955F, 0.7854F, 0.0F, 0.0F));

		PartDefinition cube_r12 = EGG.addOrReplaceChild("cube_r12",
				CubeListBuilder.create().texOffs(56, 0).addBox(-1.0F, -0.875F, -1.0F, 2.0F, 1.75F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.2145F, 7.6508F, -0.8132F, 0.0F, 0.0F, -0.7854F));

		PartDefinition cube_r13 = EGG.addOrReplaceChild("cube_r13",
				CubeListBuilder.create().texOffs(56, 0).addBox(0.5F, 1.125F, 1.75F, 2.0F, 1.75F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.0551F, 2.9493F, -3.1143F, 0.0F, 0.0F, 0.3927F));

		PartDefinition cube_r14 = EGG.addOrReplaceChild("cube_r14",
				CubeListBuilder.create().texOffs(54, 2).addBox(-1.0F, -1.0F, 1.125F, 2.0F, 2.0F, 1.75F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-5.2602F, 3.7662F, -0.5235F, -0.3927F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {

	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		EGG.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}