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

import net.mcreator.howtoownadragon.world.inventory.MaleGronckleGUIMenu;
import net.mcreator.howtoownadragon.procedures.MaleGronckleRendererProcedure;
import net.mcreator.howtoownadragon.network.MaleGronckleGUIButtonMessage;
import net.mcreator.howtoownadragon.HowToOwnADragonMod;

import java.util.HashMap;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.systems.RenderSystem;

public class MaleGronckleGUIScreen extends AbstractContainerScreen<MaleGronckleGUIMenu> {
	private final static HashMap<String, Object> guistate = MaleGronckleGUIMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	ImageButton imagebutton_next_page_mcreator_copy;

	public MaleGronckleGUIScreen(MaleGronckleGUIMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 290;
		this.imageHeight = 200;
	}

	private static final ResourceLocation texture = new ResourceLocation("how_to_own_a_dragon:textures/screens/male_gronckle_gui.png");

	@Override
	public void render(PoseStack ms, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(ms);
		super.render(ms, mouseX, mouseY, partialTicks);
		this.renderTooltip(ms, mouseX, mouseY);
		if (MaleGronckleRendererProcedure.execute(world) instanceof LivingEntity livingEntity) {
			InventoryScreen.renderEntityInInventoryFollowsAngle(ms, this.leftPos + 111, this.topPos + 72, 25, 0f, 0, livingEntity);
		}
	}

	@Override
	protected void renderBg(PoseStack ms, float partialTicks, int gx, int gy) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();
		RenderSystem.setShaderTexture(0, texture);
		this.blit(ms, this.leftPos, this.topPos, 0, 0, this.imageWidth, this.imageHeight, this.imageWidth, this.imageHeight);

		RenderSystem.setShaderTexture(0, new ResourceLocation("how_to_own_a_dragon:textures/screens/man_symbol_-_copy.png"));
		this.blit(ms, this.leftPos + 75, this.topPos + 4, 0, 0, 10, 11, 10, 11);

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
		this.font.draw(poseStack, Component.translatable("gui.how_to_own_a_dragon.male_gronckle_gui.label_male_gronckle"), 5, 5, -13421773);
		this.font.draw(poseStack, Component.translatable("gui.how_to_own_a_dragon.male_gronckle_gui.label_inventory"), 64, 87, -13421773);
		this.font.draw(poseStack, Component.translatable("gui.how_to_own_a_dragon.male_gronckle_gui.label_health"), 17, 100, -12829636);
		this.font.draw(poseStack, Component.translatable("gui.how_to_own_a_dragon.male_gronckle_gui.label_healthvalue"), 31, 110, -12829636);
		this.font.draw(poseStack, Component.translatable("gui.how_to_own_a_dragon.male_gronckle_gui.label_armor"), 20, 125, -12829636);
		this.font.draw(poseStack, Component.translatable("gui.how_to_own_a_dragon.male_gronckle_gui.label_armorvalue"), 31, 135, -12829636);
		this.font.draw(poseStack, Component.translatable("gui.how_to_own_a_dragon.male_gronckle_gui.label_damage"), 17, 150, -12829636);
		this.font.draw(poseStack, Component.translatable("gui.how_to_own_a_dragon.male_gronckle_gui.label_damagevalue"), 31, 160, -12829636);
		this.font.draw(poseStack, Component.translatable("gui.how_to_own_a_dragon.male_gronckle_gui.label_walk_speed"), 229, 101, -12829636);
		this.font.draw(poseStack, Component.translatable("gui.how_to_own_a_dragon.male_gronckle_gui.label_walkspeedvalue"), 252, 111, -12829636);
		this.font.draw(poseStack, Component.translatable("gui.how_to_own_a_dragon.male_gronckle_gui.label_fly_speed"), 232, 126, -12829636);
		this.font.draw(poseStack, Component.translatable("gui.how_to_own_a_dragon.male_gronckle_gui.label_flyspeedvalue"), 252, 136, -12829636);
		this.font.draw(poseStack, Component.translatable("gui.how_to_own_a_dragon.male_gronckle_gui.label_swim_speed"), 229, 151, -12829636);
		this.font.draw(poseStack, Component.translatable("gui.how_to_own_a_dragon.male_gronckle_gui.label_swimspeedvalue"), 252, 161, -12829636);
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
				HowToOwnADragonMod.PACKET_HANDLER.sendToServer(new MaleGronckleGUIButtonMessage(0, x, y, z));
				MaleGronckleGUIButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		});
		guistate.put("button:imagebutton_next_page_mcreator_copy", imagebutton_next_page_mcreator_copy);
		this.addRenderableWidget(imagebutton_next_page_mcreator_copy);
	}
}
