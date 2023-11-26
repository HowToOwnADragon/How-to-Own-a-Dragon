package net.mcreator.howtoownadragon.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.Button;

import net.mcreator.howtoownadragon.world.inventory.ProgressiveAchievementsMenu;
import net.mcreator.howtoownadragon.network.ProgressiveAchievementsButtonMessage;
import net.mcreator.howtoownadragon.HowToOwnADragonMod;

import java.util.HashMap;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.systems.RenderSystem;

public class ProgressiveAchievementsScreen extends AbstractContainerScreen<ProgressiveAchievementsMenu> {
	private final static HashMap<String, Object> guistate = ProgressiveAchievementsMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	Button button_vanilla_achievements;
	Button button_htoad_advancements;

	public ProgressiveAchievementsScreen(ProgressiveAchievementsMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 176;
		this.imageHeight = 80;
	}

	@Override
	public boolean isPauseScreen() {
		return true;
	}

	private static final ResourceLocation texture = new ResourceLocation("how_to_own_a_dragon:textures/screens/progressive_achievements.png");

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
		this.font.draw(poseStack, Component.translatable("gui.how_to_own_a_dragon.progressive_achievements.label_progressive_advancement_check"), 7, 8, -12829636);
	}

	@Override
	public void onClose() {
		super.onClose();
	}

	@Override
	public void init() {
		super.init();
		button_vanilla_achievements = Button.builder(Component.translatable("gui.how_to_own_a_dragon.progressive_achievements.button_vanilla_achievements"), e -> {
			if (true) {
				HowToOwnADragonMod.PACKET_HANDLER.sendToServer(new ProgressiveAchievementsButtonMessage(0, x, y, z));
				ProgressiveAchievementsButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}).bounds(this.leftPos + 22, this.topPos + 28, 129, 20).build();
		guistate.put("button:button_vanilla_achievements", button_vanilla_achievements);
		this.addRenderableWidget(button_vanilla_achievements);
		button_htoad_advancements = Button.builder(Component.translatable("gui.how_to_own_a_dragon.progressive_achievements.button_htoad_advancements"), e -> {
			if (true) {
				HowToOwnADragonMod.PACKET_HANDLER.sendToServer(new ProgressiveAchievementsButtonMessage(1, x, y, z));
				ProgressiveAchievementsButtonMessage.handleButtonAction(entity, 1, x, y, z);
			}
		}).bounds(this.leftPos + 27, this.topPos + 51, 119, 20).build();
		guistate.put("button:button_htoad_advancements", button_htoad_advancements);
		this.addRenderableWidget(button_htoad_advancements);
	}
}
