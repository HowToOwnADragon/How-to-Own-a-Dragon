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

public class Modelgronckleattack<T extends Entity> extends EntityModel<T> {
   public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("how_to_own_a_dragon", "modelgronckleattack"), "main");
   public final ModelPart bb_main;

   public Modelgronckleattack(ModelPart root) {
      this.bb_main = root.m_171324_("bb_main");
   }

   public static LayerDefinition createBodyLayer() {
      MeshDefinition meshdefinition = new MeshDefinition();
      PartDefinition partdefinition = meshdefinition.m_171576_();
      partdefinition.m_171599_("bb_main", CubeListBuilder.m_171558_().m_171514_(2, 2).m_171488_(-4.0F, -12.0F, -4.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)).m_171514_(4, 4).m_171488_(-3.0F, -13.0F, -3.0F, 6.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).m_171514_(4, 4).m_171488_(-3.0F, -4.0F, -3.0F, 6.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).m_171514_(9, 9).m_171488_(-3.0F, -11.0F, -5.0F, 6.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).m_171514_(9, 9).m_171488_(-3.0F, -11.0F, 4.0F, 6.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).m_171514_(4, 4).m_171488_(-5.0F, -11.0F, -3.0F, 1.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)).m_171514_(4, 4).m_171488_(4.0F, -11.0F, -3.0F, 1.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.m_171419_(0.0F, 24.0F, 0.0F));
      return LayerDefinition.m_171565_(meshdefinition, 64, 64);
   }

   public void m_6973_(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
   }

   public void m_7695_(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
      this.bb_main.m_104306_(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
   }
}
