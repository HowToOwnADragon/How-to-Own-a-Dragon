package net.mcreator.howtoownadragon.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;

import net.mcreator.howtoownadragon.world.inventory.MaleTTGUIMenu;

import java.util.HashMap;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.systems.RenderSystem;

public class MaleTTGUIScreen extends AbstractContainerScreen<MaleTTGUIMenu> {
	private final static HashMap<String, Object> guistate = MaleTTGUIMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;

	public MaleTTGUIScreen(MaleTTGUIMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 290;
		this.imageHeight = 166;
	}

	private static final ResourceLocation texture = new ResourceLocation("how_to_own_a_dragon:textures/screens/male_ttgui.png");

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

		RenderSystem.setShaderTexture(0, new ResourceLocation("how_to_own_a_dragon:textures/screens/man_symbol_-_copy.png"));
		this.blit(ms, this.leftPos + 112, this.topPos + 4, 0, 0, 10, 11, 10, 11);

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
		this.font.draw(poseStack, Component.translatable("gui.how_to_own_a_dragon.male_ttgui.label_male_gronckle"), 5, 5, -13421773);
		this.font.draw(poseStack, Component.translatable("gui.how_to_own_a_dragon.male_ttgui.label_inventory"), 64, 70, -13421773);
		this.font.draw(poseStack, Component.translatable("gui.how_to_own_a_dragon.male_ttgui.label_health"), 7, 83, -12829636);
		this.font.draw(poseStack, Component.translatable("gui.how_to_own_a_dragon.male_ttgui.label_healthvalue"), 31, 93, -12829636);
		this.font.draw(poseStack, Component.translatable("gui.how_to_own_a_dragon.male_ttgui.label_armor"), 20, 108, -12829636);
		this.font.draw(poseStack, Component.translatable("gui.how_to_own_a_dragon.male_ttgui.label_armorvalue"), 31, 118, -12829636);
		this.font.draw(poseStack, Component.translatable("gui.how_to_own_a_dragon.male_ttgui.label_damage"), 17, 133, -12829636);
		this.font.draw(poseStack, Component.translatable("gui.how_to_own_a_dragon.male_ttgui.label_damagevalue"), 31, 143, -12829636);
		this.font.draw(poseStack, Component.translatable("gui.how_to_own_a_dragon.male_ttgui.label_walk_speed"), 230, 84, -12829636);
		this.font.draw(poseStack, Component.translatable("gui.how_to_own_a_dragon.male_ttgui.label_walkspeedvalue"), 252, 94, -12829636);
		this.font.draw(poseStack, Component.translatable("gui.how_to_own_a_dragon.male_ttgui.label_fly_speed"), 232, 109, -12829636);
		this.font.draw(poseStack, Component.translatable("gui.how_to_own_a_dragon.male_ttgui.label_flyspeedvalue"), 252, 119, -12829636);
		this.font.draw(poseStack, Component.translatable("gui.how_to_own_a_dragon.male_ttgui.label_swim_speed"), 230, 134, -12829636);
		this.font.draw(poseStack, Component.translatable("gui.how_to_own_a_dragon.male_ttgui.label_swimspeedvalue"), 253, 144, -12829636);
	}

	@Override
	public void onClose() {
		super.onClose();
	}

	@Override
	public void init() {
		super.init();
	}
}
