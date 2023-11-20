package net.mcreator.howtoownadragon.client.gui;

import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.vertex.PoseStack;
import java.util.HashMap;
import net.mcreator.howtoownadragon.HowToOwnADragonMod;
import net.mcreator.howtoownadragon.network.GronkleIronGUIMaleButtonMessage;
import net.mcreator.howtoownadragon.world.inventory.GronkleIronGUIMaleMenu;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;

public class GronkleIronGUIMaleScreen extends AbstractContainerScreen<GronkleIronGUIMaleMenu> {
   private static final HashMap<String, Object> guistate;
   private final Level world;
   private final int x;
   private final int y;
   private final int z;
   private final Player entity;
   Button button_smelt;
   private static final ResourceLocation texture;

   public GronkleIronGUIMaleScreen(GronkleIronGUIMaleMenu container, Inventory inventory, Component text) {
      super(container, inventory, text);
      this.world = container.world;
      this.x = container.x;
      this.y = container.y;
      this.z = container.z;
      this.entity = container.entity;
      this.f_97726_ = 176;
      this.f_97727_ = 166;
   }

   public void m_86412_(PoseStack ms, int mouseX, int mouseY, float partialTicks) {
      this.m_7333_(ms);
      super.m_86412_(ms, mouseX, mouseY, partialTicks);
      this.m_7025_(ms, mouseX, mouseY);
   }

   protected void m_7286_(PoseStack ms, float partialTicks, int gx, int gy) {
      RenderSystem.m_157429_(1.0F, 1.0F, 1.0F, 1.0F);
      RenderSystem.m_69478_();
      RenderSystem.m_69453_();
      RenderSystem.m_157456_(0, texture);
      m_93133_(ms, this.f_97735_, this.f_97736_, 0.0F, 0.0F, this.f_97726_, this.f_97727_, this.f_97726_, this.f_97727_);
      RenderSystem.m_69461_();
   }

   public boolean m_7933_(int key, int b, int c) {
      if (key == 256) {
         this.f_96541_.f_91074_.m_6915_();
         return true;
      } else {
         return super.m_7933_(key, b, c);
      }
   }

   public void m_181908_() {
      super.m_181908_();
   }

   protected void m_7027_(PoseStack poseStack, int mouseX, int mouseY) {
      this.f_96547_.m_92889_(poseStack, Component.m_237115_("gui.how_to_own_a_dragon.gronkle_iron_gui_male.label_inventory"), 6.0F, 70.0F, -13421773);
      this.f_96547_.m_92889_(poseStack, Component.m_237115_("gui.how_to_own_a_dragon.gronkle_iron_gui_male.label_gronckle_iron"), 70.0F, 13.0F, -13421773);
   }

   public void m_7379_() {
      super.m_7379_();
   }

   public void m_7856_() {
      super.m_7856_();
      this.button_smelt = Button.m_253074_(Component.m_237115_("gui.how_to_own_a_dragon.gronkle_iron_gui_male.button_smelt"), (e) -> {
         HowToOwnADragonMod.PACKET_HANDLER.sendToServer(new GronkleIronGUIMaleButtonMessage(0, this.x, this.y, this.z));
         GronkleIronGUIMaleButtonMessage.handleButtonAction(this.entity, 0, this.x, this.y, this.z);
      }).m_252987_(this.f_97735_ + 80, this.f_97736_ + 52, 51, 20).m_253136_();
      guistate.put("button:button_smelt", this.button_smelt);
      this.m_142416_(this.button_smelt);
   }

   static {
      guistate = GronkleIronGUIMaleMenu.guistate;
      texture = new ResourceLocation("how_to_own_a_dragon:textures/screens/gronkle_iron_gui_male.png");
   }
}
