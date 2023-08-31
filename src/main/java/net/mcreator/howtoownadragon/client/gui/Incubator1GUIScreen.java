package net.mcreator.howtoownadragon.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.Button;

import net.mcreator.howtoownadragon.world.inventory.Incubator1GUIMenu;
import net.mcreator.howtoownadragon.procedures.Incubator1TimerShowProcedure;
import net.mcreator.howtoownadragon.procedures.Incubator1RequirementProcedure;
import net.mcreator.howtoownadragon.network.Incubator1GUIButtonMessage;
import net.mcreator.howtoownadragon.HowToOwnADragonMod;

import java.util.HashMap;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.systems.RenderSystem;

public class Incubator1GUIScreen extends AbstractContainerScreen<Incubator1GUIMenu> {
	private final static HashMap<String, Object> guistate = Incubator1GUIMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	Button button_hatch;

	public Incubator1GUIScreen(Incubator1GUIMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 185;
		this.imageHeight = 166;
	}

	private static final ResourceLocation texture = new ResourceLocation("how_to_own_a_dragon:textures/screens/incubator_1_gui.png");

	@Override
	public void render(PoseStack ms, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(ms);
		super.render(ms, mouseX, mouseY, partialTicks);
		this.renderTooltip(ms, mouseX, mouseY);
	}

	@Override
	protected void renderBg(PoseStack ms, float partialTicks, int gx, int gy) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();
		RenderSystem.setShaderTexture(0, texture);
		this.blit(ms, this.leftPos, this.topPos, 0, 0, this.imageWidth, this.imageHeight, this.imageWidth, this.imageHeight);
		RenderSystem.disableBlend();
	}

	@Override
	public boolean keyPressed(int key, int b, int c) {
		if (key == 256) {
			this.minecraft.player.closeContainer();
			return true;
		}
		return super.keyPressed(key, b, c);
	}

	@Override
	public void containerTick() {
		super.containerTick();
	}

	@Override
	protected void renderLabels(PoseStack poseStack, int mouseX, int mouseY) {
		this.font.draw(poseStack, Component.translatable("gui.how_to_own_a_dragon.incubator_1_gui.label_incubator"), 6, 5, -13421773);
		this.font.draw(poseStack, Component.translatable("gui.how_to_own_a_dragon.incubator_1_gui.label_time_left"), 118, 60, -13421773);
		this.font.draw(poseStack, Component.translatable("gui.how_to_own_a_dragon.incubator_1_gui.label_requirement"), 104, 5, -13421773);
		this.font.draw(poseStack,

				Incubator1RequirementProcedure.execute(world, x, y, z), 104, 14, -13421773);
		this.font.draw(poseStack,

				Incubator1TimerShowProcedure.execute(world, x, y, z), 119, 68, -13421773);
		this.font.draw(poseStack, Component.translatable("gui.how_to_own_a_dragon.incubator_1_gui.label_inventory"), 11, 71, -13421773);
	}

	@Override
	public void onClose() {
		super.onClose();
	}

	@Override
	public void init() {
		super.init();
		button_hatch = Button.builder(Component.translatable("gui.how_to_own_a_dragon.incubator_1_gui.button_hatch"), e -> {
			if (true) {
				HowToOwnADragonMod.PACKET_HANDLER.sendToServer(new Incubator1GUIButtonMessage(0, x, y, z));
				Incubator1GUIButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}).bounds(this.leftPos + 119, this.topPos + 38, 51, 20).build();
		guistate.put("button:button_hatch", button_hatch);
		this.addRenderableWidget(button_hatch);
	}
}
