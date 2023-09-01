package net.mcreator.howtoownadragon.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.ImageButton;

import net.mcreator.howtoownadragon.world.inventory.MainPageInfoGronckleMenu;
import net.mcreator.howtoownadragon.network.MainPageInfoGronckleButtonMessage;
import net.mcreator.howtoownadragon.HowToOwnADragonMod;

import java.util.HashMap;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.systems.RenderSystem;

public class MainPageInfoGronckleScreen extends AbstractContainerScreen<MainPageInfoGronckleMenu> {
	private final static HashMap<String, Object> guistate = MainPageInfoGronckleMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	ImageButton imagebutton_food_button_infolens_90x30_impro;

	public MainPageInfoGronckleScreen(MainPageInfoGronckleMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 400;
		this.imageHeight = 230;
	}

	@Override
	public boolean isPauseScreen() {
		return true;
	}

	private static final ResourceLocation texture = new ResourceLocation("how_to_own_a_dragon:textures/screens/main_page_info_gronckle.png");

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

		RenderSystem.setShaderTexture(0, new ResourceLocation("how_to_own_a_dragon:textures/screens/ehhhhhh.png"));
		this.blit(ms, this.leftPos + 0, this.topPos + -1, 0, 0, -1, -1, -1, -1);

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
		imagebutton_food_button_infolens_90x30_impro = new ImageButton(this.leftPos + 15, this.topPos + 13, 90, 30, 0, 0, 30, new ResourceLocation("how_to_own_a_dragon:textures/screens/atlas/imagebutton_food_button_infolens_90x30_impro.png"), 90, 60,
				e -> {
					if (true) {
						HowToOwnADragonMod.PACKET_HANDLER.sendToServer(new MainPageInfoGronckleButtonMessage(0, x, y, z));
						MainPageInfoGronckleButtonMessage.handleButtonAction(entity, 0, x, y, z);
					}
				});
		guistate.put("button:imagebutton_food_button_infolens_90x30_impro", imagebutton_food_button_infolens_90x30_impro);
		this.addRenderableWidget(imagebutton_food_button_infolens_90x30_impro);
	}
}
