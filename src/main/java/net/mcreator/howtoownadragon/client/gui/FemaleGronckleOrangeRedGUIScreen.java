package net.mcreator.howtoownadragon.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.InventoryScreen;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.ImageButton;

import net.mcreator.howtoownadragon.world.inventory.FemaleGronckleOrangeRedGUIMenu;
import net.mcreator.howtoownadragon.procedures.GronckleOrangeRedRenderProcedure;
import net.mcreator.howtoownadragon.network.FemaleGronckleOrangeRedGUIButtonMessage;
import net.mcreator.howtoownadragon.HowToOwnADragonMod;

import java.util.HashMap;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.systems.RenderSystem;

public class FemaleGronckleOrangeRedGUIScreen extends AbstractContainerScreen<FemaleGronckleOrangeRedGUIMenu> {
	private final static HashMap<String, Object> guistate = FemaleGronckleOrangeRedGUIMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	ImageButton imagebutton_next_page_mcreator_copy;

	public FemaleGronckleOrangeRedGUIScreen(FemaleGronckleOrangeRedGUIMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 176;
		this.imageHeight = 166;
	}

	private static final ResourceLocation texture = new ResourceLocation("how_to_own_a_dragon:textures/screens/female_gronckle_orange_red_gui.png");

	@Override
	public void render(PoseStack ms, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(ms);
		super.render(ms, mouseX, mouseY, partialTicks);
		this.renderTooltip(ms, mouseX, mouseY);
		if (GronckleOrangeRedRenderProcedure.execute(world) instanceof LivingEntity livingEntity) {
			InventoryScreen.renderEntityInInventoryFollowsAngle(ms, this.leftPos + 35, this.topPos + 52, 10, 0f + (float) Math.atan((this.leftPos + 35 - mouseX) / 40.0), (float) Math.atan((this.topPos + 2 - mouseY) / 40.0), livingEntity);
		}
	}

	@Override
	protected void renderBg(PoseStack ms, float partialTicks, int gx, int gy) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();
		RenderSystem.setShaderTexture(0, texture);
		this.blit(ms, this.leftPos, this.topPos, 0, 0, this.imageWidth, this.imageHeight, this.imageWidth, this.imageHeight);

		RenderSystem.setShaderTexture(0, new ResourceLocation("how_to_own_a_dragon:textures/screens/saddelrackingui.png"));
		this.blit(ms, this.leftPos + 79, this.topPos + 40, 0, 0, 16, 16, 16, 16);

		RenderSystem.setShaderTexture(0, new ResourceLocation("how_to_own_a_dragon:textures/screens/woman_symbol_-_copy.png"));
		this.blit(ms, this.leftPos + 84, this.topPos + 5, 0, 0, 11, 12, 11, 12);

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
		this.font.draw(poseStack, Component.translatable("gui.how_to_own_a_dragon.female_gronckle_orange_red_gui.label_male_gronckle"), 6, 6, -13421773);
		this.font.draw(poseStack, Component.translatable("gui.how_to_own_a_dragon.female_gronckle_orange_red_gui.label_inventory"), 7, 70, -13421773);
	}

	@Override
	public void onClose() {
		super.onClose();
	}

	@Override
	public void init() {
		super.init();
		imagebutton_next_page_mcreator_copy = new ImageButton(this.leftPos + 146, this.topPos + 62, 24, 20, 0, 0, 20, new ResourceLocation("how_to_own_a_dragon:textures/screens/atlas/imagebutton_next_page_mcreator_copy.png"), 24, 40, e -> {
			if (true) {
				HowToOwnADragonMod.PACKET_HANDLER.sendToServer(new FemaleGronckleOrangeRedGUIButtonMessage(0, x, y, z));
				FemaleGronckleOrangeRedGUIButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		});
		guistate.put("button:imagebutton_next_page_mcreator_copy", imagebutton_next_page_mcreator_copy);
		this.addRenderableWidget(imagebutton_next_page_mcreator_copy);
	}
}
