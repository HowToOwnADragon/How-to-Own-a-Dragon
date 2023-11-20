package net.mcreator.howtoownadragon.client.model;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.EntityModel;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.CubeDeformation;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.PartDefinition;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.Entity;

public class ModelGronckleEggItemImprovedentity<T extends Entity> extends EntityModel<T> {
   public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("how_to_own_a_dragon", "model_gronckle_egg_item_improvedentity"), "main");
   public final ModelPart EGG;

   public ModelGronckleEggItemImprovedentity(ModelPart root) {
      this.EGG = root.m_171324_("EGG");
   }

   public static LayerDefinition createBodyLayer() {
      MeshDefinition meshdefinition = new MeshDefinition();
      PartDefinition partdefinition = meshdefinition.m_171576_();
      PartDefinition EGG = partdefinition.m_171599_("EGG", CubeListBuilder.m_171558_().m_171514_(0, 0).m_171488_(-5.9211F, 1.5624F, -0.9709F, 9.0F, 8.5F, 9.0F, new CubeDeformation(0.0F)).m_171514_(0, 18).m_171488_(-5.4211F, -2.1876F, -0.4709F, 8.0F, 3.75F, 8.0F, new CubeDeformation(0.0F)).m_171514_(0, 30).m_171480_().m_171488_(-4.4211F, -3.1876F, 0.5291F, 6.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).m_171555_(false), PartPose.m_171419_(1.4211F, 13.9376F, -3.5291F));
      EGG.m_171599_("cube_r1", CubeListBuilder.m_171558_().m_171514_(56, 4).m_171480_().m_171488_(-5.8211F, 1.625F, 2.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).m_171555_(false).m_171514_(56, 0).m_171480_().m_171488_(-2.75F, 5.625F, -0.25F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).m_171555_(false), PartPose.m_171423_(0.0F, 0.0F, 0.0F, 0.7854F, 0.0F, 0.0F));
      EGG.m_171599_("cube_r2", CubeListBuilder.m_171558_().m_171514_(56, 2).m_171488_(-1.0F, -3.0F, 3.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.m_171423_(-5.2221F, 7.7755F, 3.3426F, 0.7854F, 0.0F, 0.0F));
      EGG.m_171599_("cube_r3", CubeListBuilder.m_171558_().m_171514_(56, 2).m_171488_(1.0F, 0.125F, -1.75F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.m_171423_(-5.9721F, 4.9025F, 4.1407F, 0.7854F, 0.0F, 0.0F));
      EGG.m_171599_("cube_r4", CubeListBuilder.m_171558_().m_171514_(56, 0).m_171488_(1.5F, 0.0F, -0.625F, 2.0F, 2.0F, 1.75F, new CubeDeformation(0.0F)), PartPose.m_171423_(-1.4706F, 5.6664F, 7.8928F, 0.0F, 0.0F, 0.3927F));
      EGG.m_171599_("cube_r5", CubeListBuilder.m_171558_().m_171514_(56, 1).m_171488_(-1.0F, 0.625F, -1.3441F, 2.0F, 1.75F, 2.0F, new CubeDeformation(0.0F)), PartPose.m_171423_(-4.0494F, 3.4574F, 8.0732F, 0.0F, 0.0F, -0.3927F));
      EGG.m_171599_("cube_r6", CubeListBuilder.m_171558_().m_171514_(54, 2).m_171480_().m_171488_(-9.5F, 0.375F, -2.5F, 2.0F, 1.75F, 2.0F, new CubeDeformation(0.0F)).m_171555_(false), PartPose.m_171423_(2.6737F, 6.0624F, 4.7735F, 0.3927F, 0.0F, 0.0F));
      EGG.m_171599_("cube_r7", CubeListBuilder.m_171558_().m_171514_(54, 2).m_171488_(-1.0F, -2.0F, 1.375F, 2.0F, 2.0F, 1.75F, new CubeDeformation(0.0F)), PartPose.m_171423_(2.7706F, 8.2252F, -0.4985F, -0.3927F, 0.0F, 0.0F));
      EGG.m_171599_("cube_r8", CubeListBuilder.m_171558_().m_171514_(54, 0).m_171488_(-1.0F, -0.875F, 0.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.m_171423_(2.6737F, 6.0624F, 4.7735F, 0.7854F, 0.0F, 0.0F));
      EGG.m_171599_("cube_r9", CubeListBuilder.m_171558_().m_171514_(56, 0).m_171488_(-0.5F, 4.25F, -0.625F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.m_171423_(1.8421F, -0.8365F, 2.9635F, -0.3927F, 0.0F, 0.0F));
      EGG.m_171599_("cube_r10", CubeListBuilder.m_171558_().m_171514_(54, 0).m_171488_(-2.75F, -1.125F, -1.0F, 2.0F, 1.75F, 2.0F, new CubeDeformation(0.0F)), PartPose.m_171423_(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.3927F));
      EGG.m_171599_("cube_r11", CubeListBuilder.m_171558_().m_171514_(56, 0).m_171488_(-1.0F, -2.125F, -2.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.m_171423_(2.0348F, -0.2865F, 7.1955F, 0.7854F, 0.0F, 0.0F));
      EGG.m_171599_("cube_r12", CubeListBuilder.m_171558_().m_171514_(56, 0).m_171488_(-1.0F, -0.875F, -1.0F, 2.0F, 1.75F, 2.0F, new CubeDeformation(0.0F)), PartPose.m_171423_(-3.2145F, 7.6508F, -0.8132F, 0.0F, 0.0F, -0.7854F));
      EGG.m_171599_("cube_r13", CubeListBuilder.m_171558_().m_171514_(56, 0).m_171488_(0.5F, 1.125F, 1.75F, 2.0F, 1.75F, 2.0F, new CubeDeformation(0.0F)), PartPose.m_171423_(-1.0551F, 2.9493F, -3.1143F, 0.0F, 0.0F, 0.3927F));
      EGG.m_171599_("cube_r14", CubeListBuilder.m_171558_().m_171514_(54, 2).m_171488_(-1.0F, -1.0F, 1.125F, 2.0F, 2.0F, 1.75F, new CubeDeformation(0.0F)), PartPose.m_171423_(-5.2602F, 3.7662F, -0.5235F, -0.3927F, 0.0F, 0.0F));
      return LayerDefinition.m_171565_(meshdefinition, 64, 64);
   }

   public void m_6973_(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
   }

   public void m_7695_(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
      this.EGG.m_104306_(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
   }
}
