package net.mcreator.howtoownadragon.client.gui;

import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.vertex.PoseStack;
import java.util.HashMap;
import net.mcreator.howtoownadragon.HowToOwnADragonMod;
import net.mcreator.howtoownadragon.network.MainPageInfoGronckleButtonMessage;
import net.mcreator.howtoownadragon.world.inventory.MainPageInfoGronckleMenu;
import net.minecraft.client.gui.components.ImageButton;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;

public class MainPageInfoGronckleScreen extends AbstractContainerScreen<MainPageInfoGronckleMenu> {
   private static final HashMap<String, Object> guistate;
   private final Level world;
   private final int x;
   private final int y;
   private final int z;
   private final Player entity;
   ImageButton imagebutton_food_button_infolens_90x30_impro;
   private static final ResourceLocation texture;

   public MainPageInfoGronckleScreen(MainPageInfoGronckleMenu container, Inventory inventory, Component text) {
      super(container, inventory, text);
      this.world = container.world;
      this.x = container.x;
      this.y = container.y;
      this.z = container.z;
      this.entity = container.entity;
      this.f_97726_ = 400;
      this.f_97727_ = 230;
   }

   public boolean m_7043_() {
      return true;
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
      RenderSystem.m_157456_(0, new ResourceLocation("how_to_own_a_dragon:textures/screens/ehhhhhh.png"));
      m_93133_(ms, this.f_97735_ + 0, this.f_97736_ + -1, 0.0F, 0.0F, -1, -1, -1, -1);
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
   }

   public void m_7379_() {
      super.m_7379_();
   }

   public void m_7856_() {
      super.m_7856_();
      this.imagebutton_food_button_infolens_90x30_impro = new ImageButton(this.f_97735_ + 15, this.f_97736_ + 13, 90, 30, 0, 0, 30, new ResourceLocation("how_to_own_a_dragon:textures/screens/atlas/imagebutton_food_button_infolens_90x30_impro.png"), 90, 60, (e) -> {
         HowToOwnADragonMod.PACKET_HANDLER.sendToServer(new MainPageInfoGronckleButtonMessage(0, this.x, this.y, this.z));
         MainPageInfoGronckleButtonMessage.handleButtonAction(this.entity, 0, this.x, this.y, this.z);
      });
      guistate.put("button:imagebutton_food_button_infolens_90x30_impro", this.imagebutton_food_button_infolens_90x30_impro);
      this.m_142416_(this.imagebutton_food_button_infolens_90x30_impro);
   }

   static {
      guistate = MainPageInfoGronckleMenu.guistate;
      texture = new ResourceLocation("how_to_own_a_dragon:textures/screens/main_page_info_gronckle.png");
   }
}
