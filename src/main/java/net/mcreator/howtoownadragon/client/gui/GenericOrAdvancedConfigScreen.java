package net.mcreator.howtoownadragon.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.Button;

import net.mcreator.howtoownadragon.world.inventory.GenericOrAdvancedConfigMenu;

import java.util.HashMap;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.systems.RenderSystem;

public class GenericOrAdvancedConfigScreen extends AbstractContainerScreen<GenericOrAdvancedConfigMenu> {
	private final static HashMap<String, Object> guistate = GenericOrAdvancedConfigMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	Button button_generic;
	Button button_advanced;
	Button button_example_generic;
	Button button_example_advanced;

	public GenericOrAdvancedConfigScreen(GenericOrAdvancedConfigMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 176;
		this.imageHeight = 166;
	}

	@Override
	public boolean isPauseScreen() {
		return true;
	}

	private static final ResourceLocation texture = new ResourceLocation("how_to_own_a_dragon:textures/screens/generic_or_advanced_config.png");

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

		RenderSystem.setShaderTexture(0, new ResourceLocation("how_to_own_a_dragon:textures/screens/whattypeofconfigdoyouwant.png"));
		this.blit(ms, this.leftPos + 4, this.topPos + 4, 0, 0, 161, 12, 161, 12);

		RenderSystem.setShaderTexture(0, new ResourceLocation("how_to_own_a_dragon:textures/screens/genericconfigexplanation.png"));
		this.blit(ms, this.leftPos + 3, this.topPos + 16, 0, 0, 160, 24, 160, 24);

		RenderSystem.setShaderTexture(0, new ResourceLocation("how_to_own_a_dragon:textures/screens/advancedconfigexplanation.png"));
		this.blit(ms, this.leftPos + 3, this.topPos + 40, 0, 0, 160, 25, 160, 25);

		RenderSystem.setShaderTexture(0, new ResourceLocation("how_to_own_a_dragon:textures/screens/confignote.png"));
		this.blit(ms, this.leftPos + 2, this.topPos + 136, 0, 0, 125, 25, 125, 25);

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
	}

	@Override
	public void onClose() {
		super.onClose();
	}

	@Override
	public void init() {
		super.init();
		button_generic = Button.builder(Component.translatable("gui.how_to_own_a_dragon.generic_or_advanced_config.button_generic"), e -> {
		}).bounds(this.leftPos + 3, this.topPos + 116, 61, 20).build();
		guistate.put("button:button_generic", button_generic);
		this.addRenderableWidget(button_generic);
		button_advanced = Button.builder(Component.translatable("gui.how_to_own_a_dragon.generic_or_advanced_config.button_advanced"), e -> {
		}).bounds(this.leftPos + 102, this.topPos + 116, 67, 20).build();
		guistate.put("button:button_advanced", button_advanced);
		this.addRenderableWidget(button_advanced);
		button_example_generic = Button.builder(Component.translatable("gui.how_to_own_a_dragon.generic_or_advanced_config.button_example_generic"), e -> {
		}).bounds(this.leftPos + 36, this.topPos + 67, 103, 20).build();
		guistate.put("button:button_example_generic", button_example_generic);
		this.addRenderableWidget(button_example_generic);
		button_example_advanced = Button.builder(Component.translatable("gui.how_to_own_a_dragon.generic_or_advanced_config.button_example_advanced"), e -> {
		}).bounds(this.leftPos + 33, this.topPos + 90, 108, 20).build();
		guistate.put("button:button_example_advanced", button_example_advanced);
		this.addRenderableWidget(button_example_advanced);
	}
}
