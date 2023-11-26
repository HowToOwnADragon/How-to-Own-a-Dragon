package net.mcreator.howtoownadragon.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.ImageButton;
import net.minecraft.client.gui.components.Button;

import net.mcreator.howtoownadragon.world.inventory.HusbandryTabGroupGUIMenu;
import net.mcreator.howtoownadragon.network.HusbandryTabGroupGUIButtonMessage;
import net.mcreator.howtoownadragon.HowToOwnADragonMod;

import java.util.HashMap;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.systems.RenderSystem;

public class HusbandryTabGroupGUIScreen extends AbstractContainerScreen<HusbandryTabGroupGUIMenu> {
	private final static HashMap<String, Object> guistate = HusbandryTabGroupGUIMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	Button button_two_by_two;
	Button button_a_complete_catalog;
	Button button_a_balanced_diet;
	ImageButton imagebutton_previous_page_arrow;

	public HusbandryTabGroupGUIScreen(HusbandryTabGroupGUIMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 205;
		this.imageHeight = 95;
	}

	@Override
	public boolean isPauseScreen() {
		return true;
	}

	private static final ResourceLocation texture = new ResourceLocation("how_to_own_a_dragon:textures/screens/husbandry_tab_group_gui.png");

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
		this.font.draw(poseStack, Component.translatable("gui.how_to_own_a_dragon.husbandry_tab_group_gui.label_vanilla_progressive_advancements"), 7, 5, -12829636);
	}

	@Override
	public void onClose() {
		super.onClose();
	}

	@Override
	public void init() {
		super.init();
		button_two_by_two = Button.builder(Component.translatable("gui.how_to_own_a_dragon.husbandry_tab_group_gui.button_two_by_two"), e -> {
			if (true) {
				HowToOwnADragonMod.PACKET_HANDLER.sendToServer(new HusbandryTabGroupGUIButtonMessage(0, x, y, z));
				HusbandryTabGroupGUIButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}).bounds(this.leftPos + 63, this.topPos + 23, 77, 20).build();
		guistate.put("button:button_two_by_two", button_two_by_two);
		this.addRenderableWidget(button_two_by_two);
		button_a_complete_catalog = Button.builder(Component.translatable("gui.how_to_own_a_dragon.husbandry_tab_group_gui.button_a_complete_catalog"), e -> {
			if (true) {
				HowToOwnADragonMod.PACKET_HANDLER.sendToServer(new HusbandryTabGroupGUIButtonMessage(1, x, y, z));
				HusbandryTabGroupGUIButtonMessage.handleButtonAction(entity, 1, x, y, z);
			}
		}).bounds(this.leftPos + 43, this.topPos + 46, 119, 20).build();
		guistate.put("button:button_a_complete_catalog", button_a_complete_catalog);
		this.addRenderableWidget(button_a_complete_catalog);
		button_a_balanced_diet = Button.builder(Component.translatable("gui.how_to_own_a_dragon.husbandry_tab_group_gui.button_a_balanced_diet"), e -> {
			if (true) {
				HowToOwnADragonMod.PACKET_HANDLER.sendToServer(new HusbandryTabGroupGUIButtonMessage(2, x, y, z));
				HusbandryTabGroupGUIButtonMessage.handleButtonAction(entity, 2, x, y, z);
			}
		}).bounds(this.leftPos + 51, this.topPos + 70, 103, 20).build();
		guistate.put("button:button_a_balanced_diet", button_a_balanced_diet);
		this.addRenderableWidget(button_a_balanced_diet);
		imagebutton_previous_page_arrow = new ImageButton(this.leftPos + 10, this.topPos + 73, 24, 20, 0, 0, 20, new ResourceLocation("how_to_own_a_dragon:textures/screens/atlas/imagebutton_previous_page_arrow.png"), 24, 40, e -> {
			if (true) {
				HowToOwnADragonMod.PACKET_HANDLER.sendToServer(new HusbandryTabGroupGUIButtonMessage(3, x, y, z));
				HusbandryTabGroupGUIButtonMessage.handleButtonAction(entity, 3, x, y, z);
			}
		});
		guistate.put("button:imagebutton_previous_page_arrow", imagebutton_previous_page_arrow);
		this.addRenderableWidget(imagebutton_previous_page_arrow);
	}
}
