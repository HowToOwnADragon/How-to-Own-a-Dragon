package net.mcreator.howtoownadragon.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.ImageButton;
import net.minecraft.client.gui.components.Button;

import net.mcreator.howtoownadragon.world.inventory.VanillaTabGroupsGUIMenu;
import net.mcreator.howtoownadragon.network.VanillaTabGroupsGUIButtonMessage;
import net.mcreator.howtoownadragon.HowToOwnADragonMod;

import java.util.HashMap;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.systems.RenderSystem;

public class VanillaTabGroupsGUIScreen extends AbstractContainerScreen<VanillaTabGroupsGUIMenu> {
	private final static HashMap<String, Object> guistate = VanillaTabGroupsGUIMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	Button button_minecraft;
	Button button_nether;
	Button button_end;
	Button button_adventure;
	Button button_husbandry;
	ImageButton imagebutton_previous_page_arrow;

	public VanillaTabGroupsGUIScreen(VanillaTabGroupsGUIMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 140;
		this.imageHeight = 155;
	}

	@Override
	public boolean isPauseScreen() {
		return true;
	}

	private static final ResourceLocation texture = new ResourceLocation("how_to_own_a_dragon:textures/screens/vanilla_tab_groups_gui.png");

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
		this.font.draw(poseStack, Component.translatable("gui.how_to_own_a_dragon.vanilla_tab_groups_gui.label_all_vanilla_tab_groups"), 15, 8, -12829636);
	}

	@Override
	public void onClose() {
		super.onClose();
	}

	@Override
	public void init() {
		super.init();
		button_minecraft = Button.builder(Component.translatable("gui.how_to_own_a_dragon.vanilla_tab_groups_gui.button_minecraft"), e -> {
			if (true) {
				HowToOwnADragonMod.PACKET_HANDLER.sendToServer(new VanillaTabGroupsGUIButtonMessage(0, x, y, z));
				VanillaTabGroupsGUIButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}).bounds(this.leftPos + 32, this.topPos + 26, 72, 20).build();
		guistate.put("button:button_minecraft", button_minecraft);
		this.addRenderableWidget(button_minecraft);
		button_nether = Button.builder(Component.translatable("gui.how_to_own_a_dragon.vanilla_tab_groups_gui.button_nether"), e -> {
			if (true) {
				HowToOwnADragonMod.PACKET_HANDLER.sendToServer(new VanillaTabGroupsGUIButtonMessage(1, x, y, z));
				VanillaTabGroupsGUIButtonMessage.handleButtonAction(entity, 1, x, y, z);
			}
		}).bounds(this.leftPos + 40, this.topPos + 51, 56, 20).build();
		guistate.put("button:button_nether", button_nether);
		this.addRenderableWidget(button_nether);
		button_end = Button.builder(Component.translatable("gui.how_to_own_a_dragon.vanilla_tab_groups_gui.button_end"), e -> {
			if (true) {
				HowToOwnADragonMod.PACKET_HANDLER.sendToServer(new VanillaTabGroupsGUIButtonMessage(2, x, y, z));
				VanillaTabGroupsGUIButtonMessage.handleButtonAction(entity, 2, x, y, z);
			}
		}).bounds(this.leftPos + 47, this.topPos + 77, 40, 20).build();
		guistate.put("button:button_end", button_end);
		this.addRenderableWidget(button_end);
		button_adventure = Button.builder(Component.translatable("gui.how_to_own_a_dragon.vanilla_tab_groups_gui.button_adventure"), e -> {
			if (true) {
				HowToOwnADragonMod.PACKET_HANDLER.sendToServer(new VanillaTabGroupsGUIButtonMessage(3, x, y, z));
				VanillaTabGroupsGUIButtonMessage.handleButtonAction(entity, 3, x, y, z);
			}
		}).bounds(this.leftPos + 32, this.topPos + 103, 72, 20).build();
		guistate.put("button:button_adventure", button_adventure);
		this.addRenderableWidget(button_adventure);
		button_husbandry = Button.builder(Component.translatable("gui.how_to_own_a_dragon.vanilla_tab_groups_gui.button_husbandry"), e -> {
			if (true) {
				HowToOwnADragonMod.PACKET_HANDLER.sendToServer(new VanillaTabGroupsGUIButtonMessage(4, x, y, z));
				VanillaTabGroupsGUIButtonMessage.handleButtonAction(entity, 4, x, y, z);
			}
		}).bounds(this.leftPos + 32, this.topPos + 129, 72, 20).build();
		guistate.put("button:button_husbandry", button_husbandry);
		this.addRenderableWidget(button_husbandry);
		imagebutton_previous_page_arrow = new ImageButton(this.leftPos + 2, this.topPos + 132, 24, 20, 0, 0, 20, new ResourceLocation("how_to_own_a_dragon:textures/screens/atlas/imagebutton_previous_page_arrow.png"), 24, 40, e -> {
			if (true) {
				HowToOwnADragonMod.PACKET_HANDLER.sendToServer(new VanillaTabGroupsGUIButtonMessage(5, x, y, z));
				VanillaTabGroupsGUIButtonMessage.handleButtonAction(entity, 5, x, y, z);
			}
		});
		guistate.put("button:imagebutton_previous_page_arrow", imagebutton_previous_page_arrow);
		this.addRenderableWidget(imagebutton_previous_page_arrow);
	}
}
