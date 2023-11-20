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

public class Modeltteggentitymodel<T extends Entity> extends EntityModel<T> {
   public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("how_to_own_a_dragon", "modeltteggentitymodel"), "main");
   public final ModelPart bone;

   public Modeltteggentitymodel(ModelPart root) {
      this.bone = root.m_171324_("bone");
   }

   public static LayerDefinition createBodyLayer() {
      MeshDefinition meshdefinition = new MeshDefinition();
      PartDefinition partdefinition = meshdefinition.m_171576_();
      partdefinition.m_171599_("bone", CubeListBuilder.m_171558_().m_171514_(4, 3).m_171488_(-1.755F, -3.315F, -1.755F, 3.51F, 3.315F, 3.51F, new CubeDeformation(0.0F)).m_171514_(3, 14).m_171488_(-1.56F, -4.7775F, -1.56F, 3.12F, 1.4625F, 3.12F, new CubeDeformation(0.0F)).m_171514_(18, 26).m_171488_(-1.17F, -5.1775F, -1.17F, 2.34F, 1.4F, 2.34F, new CubeDeformation(0.0F)), PartPose.m_171419_(0.0F, 24.0F, 0.0F));
      return LayerDefinition.m_171565_(meshdefinition, 32, 32);
   }

   public void m_6973_(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
   }

   public void m_7695_(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
      this.bone.m_104306_(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
   }
}
