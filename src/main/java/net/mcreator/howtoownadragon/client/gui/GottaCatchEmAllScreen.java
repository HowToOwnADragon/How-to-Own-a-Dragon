package net.mcreator.howtoownadragon.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;

import net.mcreator.howtoownadragon.world.inventory.GottaCatchEmAllMenu;
import net.mcreator.howtoownadragon.procedures.TTTameReturnProcedure;
import net.mcreator.howtoownadragon.procedures.NadderTameReturnProcedure;
import net.mcreator.howtoownadragon.procedures.GronckleTameReturnProcedure;

import java.util.HashMap;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.systems.RenderSystem;

public class GottaCatchEmAllScreen extends AbstractContainerScreen<GottaCatchEmAllMenu> {
	private final static HashMap<String, Object> guistate = GottaCatchEmAllMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;

	public GottaCatchEmAllScreen(GottaCatchEmAllMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 110;
		this.imageHeight = 80;
	}

	@Override
	public boolean isPauseScreen() {
		return true;
	}

	private static final ResourceLocation texture = new ResourceLocation("how_to_own_a_dragon:textures/screens/gotta_catch_em_all.png");

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
		this.font.draw(poseStack, Component.translatable("gui.how_to_own_a_dragon.gotta_catch_em_all.label_dragons"), 5, 6, -12829636);
		if (GronckleTameReturnProcedure.execute(entity))
			this.font.draw(poseStack, Component.translatable("gui.how_to_own_a_dragon.gotta_catch_em_all.label_gronckle"), 33, 31, -12829636);
		if (TTTameReturnProcedure.execute(entity))
			this.font.draw(poseStack, Component.translatable("gui.how_to_own_a_dragon.gotta_catch_em_all.label_terrible_terror"), 14, 47, -12829636);
		if (NadderTameReturnProcedure.execute(entity))
			this.font.draw(poseStack, Component.translatable("gui.how_to_own_a_dragon.gotta_catch_em_all.label_deadly_nadder"), 21, 63, -12829636);
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
