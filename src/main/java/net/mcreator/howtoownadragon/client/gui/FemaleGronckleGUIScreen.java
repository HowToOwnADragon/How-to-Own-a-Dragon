package net.mcreator.howtoownadragon.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.ImageButton;

import net.mcreator.howtoownadragon.world.inventory.FemaleGronckleGUIMenu;
import net.mcreator.howtoownadragon.procedures.DisplayHealthAttributeProcedure;
import net.mcreator.howtoownadragon.procedures.DisplayArmorAttributeProcedure;
import net.mcreator.howtoownadragon.network.FemaleGronckleGUIButtonMessage;
import net.mcreator.howtoownadragon.HowToOwnADragonMod;

import java.util.HashMap;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.systems.RenderSystem;

public class FemaleGronckleGUIScreen extends AbstractContainerScreen<FemaleGronckleGUIMenu> {
	private final static HashMap<String, Object> guistate = FemaleGronckleGUIMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	ImageButton imagebutton_next_page_mcreator_copy;

	public FemaleGronckleGUIScreen(FemaleGronckleGUIMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 290;
		this.imageHeight = 200;
	}

	private static final ResourceLocation texture = new ResourceLocation("how_to_own_a_dragon:textures/screens/female_gronckle_gui.png");

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

		RenderSystem.setShaderTexture(0, new ResourceLocation("how_to_own_a_dragon:textures/screens/woman_symbol_-_copy.png"));
		this.blit(ms, this.leftPos + 84, this.topPos + 4, 0, 0, 11, 12, 11, 12);

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
		this.font.draw(poseStack, Component.translatable("gui.how_to_own_a_dragon.female_gronckle_gui.label_male_gronckle"), 5, 5, -13421773);
		this.font.draw(poseStack, Component.translatable("gui.how_to_own_a_dragon.female_gronckle_gui.label_inventory"), 64, 87, -13421773);
		this.font.draw(poseStack, Component.translatable("gui.how_to_own_a_dragon.female_gronckle_gui.label_label_health"), 8, 100, -12829636);
		this.font.draw(poseStack,

				DisplayHealthAttributeProcedure.execute(entity), 26, 110, -12829636);
		this.font.draw(poseStack, Component.translatable("gui.how_to_own_a_dragon.female_gronckle_gui.label_label_armor"), 20, 125, -12829636);
		this.font.draw(poseStack,

				DisplayArmorAttributeProcedure.execute(entity), 27, 135, -12829636);
		this.font.draw(poseStack, Component.translatable("gui.how_to_own_a_dragon.female_gronckle_gui.label_label_damage"), 17, 150, -12829636);
		this.font.draw(poseStack, Component.translatable("gui.how_to_own_a_dragon.female_gronckle_gui.label_label_damagevalue"), 30, 159, -12829636);
		this.font.draw(poseStack, Component.translatable("gui.how_to_own_a_dragon.female_gronckle_gui.label_label_walk_speed"), 230, 101, -12829636);
		this.font.draw(poseStack, Component.translatable("gui.how_to_own_a_dragon.female_gronckle_gui.label_label_walkspeedvalue"), 248, 111, -12829636);
		this.font.draw(poseStack, Component.translatable("gui.how_to_own_a_dragon.female_gronckle_gui.label_label_fly_speed"), 232, 126, -12829636);
		this.font.draw(poseStack, Component.translatable("gui.how_to_own_a_dragon.female_gronckle_gui.label_label_flyspeedvalue"), 248, 136, -12829636);
		this.font.draw(poseStack, Component.translatable("gui.how_to_own_a_dragon.female_gronckle_gui.label_label_swim_speed"), 230, 151, -12829636);
		this.font.draw(poseStack, Component.translatable("gui.how_to_own_a_dragon.female_gronckle_gui.label_label_swimspeedvalue"), 253, 161, -12829636);
	}

	@Override
	public void onClose() {
		super.onClose();
	}

	@Override
	public void init() {
		super.init();
		imagebutton_next_page_mcreator_copy = new ImageButton(this.leftPos + 262, this.topPos + 177, 24, 20, 0, 0, 20, new ResourceLocation("how_to_own_a_dragon:textures/screens/atlas/imagebutton_next_page_mcreator_copy.png"), 24, 40, e -> {
			if (true) {
				HowToOwnADragonMod.PACKET_HANDLER.sendToServer(new FemaleGronckleGUIButtonMessage(0, x, y, z));
				FemaleGronckleGUIButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		});
		guistate.put("button:imagebutton_next_page_mcreator_copy", imagebutton_next_page_mcreator_copy);
		this.addRenderableWidget(imagebutton_next_page_mcreator_copy);
	}
}
