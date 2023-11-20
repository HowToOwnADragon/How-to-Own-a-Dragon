package net.mcreator.howtoownadragon.client.gui;

import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.vertex.PoseStack;
import java.util.HashMap;
import net.mcreator.howtoownadragon.HowToOwnADragonMod;
import net.mcreator.howtoownadragon.network.Incubator1GUIButtonMessage;
import net.mcreator.howtoownadragon.procedures.Incubator1RequirementProcedure;
import net.mcreator.howtoownadragon.procedures.Incubator1TimerShowProcedure;
import net.mcreator.howtoownadragon.world.inventory.Incubator1GUIMenu;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;

public class Incubator1GUIScreen extends AbstractContainerScreen<Incubator1GUIMenu> {
   private static final HashMap<String, Object> guistate;
   private final Level world;
   private final int x;
   private final int y;
   private final int z;
   private final Player entity;
   Button button_hatch;
   private static final ResourceLocation texture;

   public Incubator1GUIScreen(Incubator1GUIMenu container, Inventory inventory, Component text) {
      super(container, inventory, text);
      this.world = container.world;
      this.x = container.x;
      this.y = container.y;
      this.z = container.z;
      this.entity = container.entity;
      this.f_97726_ = 185;
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
      this.f_96547_.m_92889_(poseStack, Component.m_237115_("gui.how_to_own_a_dragon.incubator_1_gui.label_incubator"), 6.0F, 5.0F, -13421773);
      this.f_96547_.m_92889_(poseStack, Component.m_237115_("gui.how_to_own_a_dragon.incubator_1_gui.label_time_left"), 118.0F, 60.0F, -13421773);
      this.f_96547_.m_92889_(poseStack, Component.m_237115_("gui.how_to_own_a_dragon.incubator_1_gui.label_requirement"), 104.0F, 5.0F, -13421773);
      this.f_96547_.m_92883_(poseStack, Incubator1RequirementProcedure.execute(this.world, (double)this.x, (double)this.y, (double)this.z), 104.0F, 14.0F, -13421773);
      this.f_96547_.m_92883_(poseStack, Incubator1TimerShowProcedure.execute(this.world, (double)this.x, (double)this.y, (double)this.z), 119.0F, 68.0F, -13421773);
      this.f_96547_.m_92889_(poseStack, Component.m_237115_("gui.how_to_own_a_dragon.incubator_1_gui.label_inventory"), 11.0F, 71.0F, -13421773);
   }

   public void m_7379_() {
      super.m_7379_();
   }

   public void m_7856_() {
      super.m_7856_();
      this.button_hatch = Button.m_253074_(Component.m_237115_("gui.how_to_own_a_dragon.incubator_1_gui.button_hatch"), (e) -> {
         HowToOwnADragonMod.PACKET_HANDLER.sendToServer(new Incubator1GUIButtonMessage(0, this.x, this.y, this.z));
         Incubator1GUIButtonMessage.handleButtonAction(this.entity, 0, this.x, this.y, this.z);
      }).m_252987_(this.f_97735_ + 119, this.f_97736_ + 38, 51, 20).m_253136_();
      guistate.put("button:button_hatch", this.button_hatch);
      this.m_142416_(this.button_hatch);
   }

   static {
      guistate = Incubator1GUIMenu.guistate;
      texture = new ResourceLocation("how_to_own_a_dragon:textures/screens/incubator_1_gui.png");
   }
}
