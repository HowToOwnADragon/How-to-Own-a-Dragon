package net.mcreator.howtoownadragon.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.ImageButton;
import net.minecraft.client.gui.components.Button;

import net.mcreator.howtoownadragon.world.inventory.AdventureTabGroupGUIMenu;
import net.mcreator.howtoownadragon.network.AdventureTabGroupGUIButtonMessage;
import net.mcreator.howtoownadragon.HowToOwnADragonMod;

import java.util.HashMap;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.systems.RenderSystem;

public class AdventureTabGroupGUIScreen extends AbstractContainerScreen<AdventureTabGroupGUIMenu> {
	private final static HashMap<String, Object> guistate = AdventureTabGroupGUIMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	Button button_monsters_hunted;
	Button button_adventuring_time;
	ImageButton imagebutton_previous_page_arrow;

	public AdventureTabGroupGUIScreen(AdventureTabGroupGUIMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 200;
		this.imageHeight = 80;
	}

	@Override
	public boolean isPauseScreen() {
		return true;
	}

	private static final ResourceLocation texture = new ResourceLocation("how_to_own_a_dragon:textures/screens/adventure_tab_group_gui.png");

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
		this.font.draw(poseStack, Component.translatable("gui.how_to_own_a_dragon.adventure_tab_group_gui.label_adventure_progressive_achievemen"), 6, 6, -12829636);
	}

	@Override
	public void onClose() {
		super.onClose();
	}

	@Override
	public void init() {
		super.init();
		button_monsters_hunted = Button.builder(Component.translatable("gui.how_to_own_a_dragon.adventure_tab_group_gui.button_monsters_hunted"), e -> {
			if (true) {
				HowToOwnADragonMod.PACKET_HANDLER.sendToServer(new AdventureTabGroupGUIButtonMessage(0, x, y, z));
				AdventureTabGroupGUIButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}).bounds(this.leftPos + 47, this.topPos + 28, 103, 20).build();
		guistate.put("button:button_monsters_hunted", button_monsters_hunted);
		this.addRenderableWidget(button_monsters_hunted);
		button_adventuring_time = Button.builder(Component.translatable("gui.how_to_own_a_dragon.adventure_tab_group_gui.button_adventuring_time"), e -> {
			if (true) {
				HowToOwnADragonMod.PACKET_HANDLER.sendToServer(new AdventureTabGroupGUIButtonMessage(1, x, y, z));
				AdventureTabGroupGUIButtonMessage.handleButtonAction(entity, 1, x, y, z);
			}
		}).bounds(this.leftPos + 45, this.topPos + 53, 108, 20).build();
		guistate.put("button:button_adventuring_time", button_adventuring_time);
		this.addRenderableWidget(button_adventuring_time);
		imagebutton_previous_page_arrow = new ImageButton(this.leftPos + 7, this.topPos + 56, 24, 20, 0, 0, 20, new ResourceLocation("how_to_own_a_dragon:textures/screens/atlas/imagebutton_previous_page_arrow.png"), 24, 40, e -> {
			if (true) {
				HowToOwnADragonMod.PACKET_HANDLER.sendToServer(new AdventureTabGroupGUIButtonMessage(2, x, y, z));
				AdventureTabGroupGUIButtonMessage.handleButtonAction(entity, 2, x, y, z);
			}
		});
		guistate.put("button:imagebutton_previous_page_arrow", imagebutton_previous_page_arrow);
		this.addRenderableWidget(imagebutton_previous_page_arrow);
	}
}
