package net.mcreator.howtoownadragon.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.ImageButton;

import net.mcreator.howtoownadragon.world.inventory.ATFifthPageGUIMenu;
import net.mcreator.howtoownadragon.procedures.ATMushroomFieldsReturnProcedure;
import net.mcreator.howtoownadragon.procedures.ATMeadowReturnProcedure;
import net.mcreator.howtoownadragon.procedures.ATMangroveSwampReturnProcedure;
import net.mcreator.howtoownadragon.procedures.ATLushCavesReturnProcedure;
import net.mcreator.howtoownadragon.procedures.ATLukewarmOceanReturnProcedure;
import net.mcreator.howtoownadragon.network.ATFifthPageGUIButtonMessage;
import net.mcreator.howtoownadragon.HowToOwnADragonMod;

import java.util.HashMap;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.systems.RenderSystem;

public class ATFifthPageGUIScreen extends AbstractContainerScreen<ATFifthPageGUIMenu> {
	private final static HashMap<String, Object> guistate = ATFifthPageGUIMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	ImageButton imagebutton_previous_page_arrow;
	ImageButton imagebutton_next_page_mcreator_copy;

	public ATFifthPageGUIScreen(ATFifthPageGUIMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 100;
		this.imageHeight = 130;
	}

	@Override
	public boolean isPauseScreen() {
		return true;
	}

	private static final ResourceLocation texture = new ResourceLocation("how_to_own_a_dragon:textures/screens/at_fifth_page_gui.png");

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
		this.font.draw(poseStack, Component.translatable("gui.how_to_own_a_dragon.at_fifth_page_gui.label_fifth_page"), 23, 4, -12829636);
		if (ATLukewarmOceanReturnProcedure.execute(entity))
			this.font.draw(poseStack, Component.translatable("gui.how_to_own_a_dragon.at_fifth_page_gui.label_lukewarm_ocean"), 12, 22, -12829636);
		if (ATLushCavesReturnProcedure.execute(entity))
			this.font.draw(poseStack, Component.translatable("gui.how_to_own_a_dragon.at_fifth_page_gui.label_lush_caves"), 24, 39, -12829636);
		if (ATMangroveSwampReturnProcedure.execute(entity))
			this.font.draw(poseStack, Component.translatable("gui.how_to_own_a_dragon.at_fifth_page_gui.label_mangrove_swamp"), 14, 57, -12829636);
		if (ATMeadowReturnProcedure.execute(entity))
			this.font.draw(poseStack, Component.translatable("gui.how_to_own_a_dragon.at_fifth_page_gui.label_meadow"), 33, 75, -12829636);
		if (ATMushroomFieldsReturnProcedure.execute(entity))
			this.font.draw(poseStack, Component.translatable("gui.how_to_own_a_dragon.at_fifth_page_gui.label_mushroom_fields"), 11, 92, -12829636);
		if (ATLukewarmOceanReturnProcedure.execute(entity))
			this.font.draw(poseStack, Component.translatable("gui.how_to_own_a_dragon.at_fifth_page_gui.label_ocean"), 37, 110, -12829636);
	}

	@Override
	public void onClose() {
		super.onClose();
	}

	@Override
	public void init() {
		super.init();
		imagebutton_previous_page_arrow = new ImageButton(this.leftPos + 2, this.topPos + 107, 24, 20, 0, 0, 20, new ResourceLocation("how_to_own_a_dragon:textures/screens/atlas/imagebutton_previous_page_arrow.png"), 24, 40, e -> {
			if (true) {
				HowToOwnADragonMod.PACKET_HANDLER.sendToServer(new ATFifthPageGUIButtonMessage(0, x, y, z));
				ATFifthPageGUIButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		});
		guistate.put("button:imagebutton_previous_page_arrow", imagebutton_previous_page_arrow);
		this.addRenderableWidget(imagebutton_previous_page_arrow);
		imagebutton_next_page_mcreator_copy = new ImageButton(this.leftPos + 72, this.topPos + 107, 24, 20, 0, 0, 20, new ResourceLocation("how_to_own_a_dragon:textures/screens/atlas/imagebutton_next_page_mcreator_copy.png"), 24, 40, e -> {
			if (true) {
				HowToOwnADragonMod.PACKET_HANDLER.sendToServer(new ATFifthPageGUIButtonMessage(1, x, y, z));
				ATFifthPageGUIButtonMessage.handleButtonAction(entity, 1, x, y, z);
			}
		});
		guistate.put("button:imagebutton_next_page_mcreator_copy", imagebutton_next_page_mcreator_copy);
		this.addRenderableWidget(imagebutton_next_page_mcreator_copy);
	}
}
