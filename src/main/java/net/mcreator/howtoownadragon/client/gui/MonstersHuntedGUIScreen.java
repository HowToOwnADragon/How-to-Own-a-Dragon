package net.mcreator.howtoownadragon.client.gui;

public class MonstersHuntedGUIScreen extends AbstractContainerScreen<MonstersHuntedGUIMenu> {

	private final static HashMap<String, Object> guistate = MonstersHuntedGUIMenu.guistate;

	private final Level world;
	private final int x, y, z;
	private final Player entity;

	public MonstersHuntedGUIScreen(MonstersHuntedGUIMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 350;
		this.imageHeight = 150;
	}

	@Override
	public boolean isPauseScreen() {
		return true;
	}

	private static final ResourceLocation texture = new ResourceLocation("how_to_own_a_dragon:textures/screens/monsters_hunted_gui.png");

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
		this.font.draw(poseStack, Component.translatable("gui.how_to_own_a_dragon.monsters_hunted_gui.label_all_monsters_needed"), 124, 9, -12829636);
		this.font.draw(poseStack, Component.translatable("gui.how_to_own_a_dragon.monsters_hunted_gui.label_blaze"), 3, 29, -12829636);
		this.font.draw(poseStack, Component.translatable("gui.how_to_own_a_dragon.monsters_hunted_gui.label_cave_spider"), 3, 48, -12829636);
		this.font.draw(poseStack, Component.translatable("gui.how_to_own_a_dragon.monsters_hunted_gui.label_creeper"), 3, 68, -12829636);
		this.font.draw(poseStack, Component.translatable("gui.how_to_own_a_dragon.monsters_hunted_gui.label_drowned"), 3, 88, -12829636);
		this.font.draw(poseStack, Component.translatable("gui.how_to_own_a_dragon.monsters_hunted_gui.label_elder_guardian"), 3, 109, -12829636);
		this.font.draw(poseStack, Component.translatable("gui.how_to_own_a_dragon.monsters_hunted_gui.label_ender_dragon"), 3, 130, -12829636);
		this.font.draw(poseStack, Component.translatable("gui.how_to_own_a_dragon.monsters_hunted_gui.label_enderman"), 34, 29, -12829636);
		this.font.draw(poseStack, Component.translatable("gui.how_to_own_a_dragon.monsters_hunted_gui.label_endermite"), 65, 48, -12829636);
		this.font.draw(poseStack, Component.translatable("gui.how_to_own_a_dragon.monsters_hunted_gui.label_evoker"), 44, 68, -12829636);
		this.font.draw(poseStack, Component.translatable("gui.how_to_own_a_dragon.monsters_hunted_gui.label_ghast"), 45, 88, -12829636);
		this.font.draw(poseStack, Component.translatable("gui.how_to_own_a_dragon.monsters_hunted_gui.label_guardian"), 81, 109, -12829636);
		this.font.draw(poseStack, Component.translatable("gui.how_to_own_a_dragon.monsters_hunted_gui.label_hoglin"), 71, 130, -12829636);
		this.font.draw(poseStack, Component.translatable("gui.how_to_own_a_dragon.monsters_hunted_gui.label_husk"), 81, 29, -12829636);
		this.font.draw(poseStack, Component.translatable("gui.how_to_own_a_dragon.monsters_hunted_gui.label_magma_cube"), 118, 48, -12829636);
		this.font.draw(poseStack, Component.translatable("gui.how_to_own_a_dragon.monsters_hunted_gui.label_phantom"), 80, 68, -12829636);
		this.font.draw(poseStack, Component.translatable("gui.how_to_own_a_dragon.monsters_hunted_gui.label_piglin"), 76, 88, -12829636);
		this.font.draw(poseStack, Component.translatable("gui.how_to_own_a_dragon.monsters_hunted_gui.label_piglin_brute"), 112, 88, -12829636);
		this.font.draw(poseStack, Component.translatable("gui.how_to_own_a_dragon.monsters_hunted_gui.label_pillager"), 127, 109, -12829636);
		this.font.draw(poseStack, Component.translatable("gui.how_to_own_a_dragon.monsters_hunted_gui.label_ravenger"), 107, 130, -12829636);
		this.font.draw(poseStack, Component.translatable("gui.how_to_own_a_dragon.monsters_hunted_gui.label_shulker"), 107, 29, -12829636);
		this.font.draw(poseStack, Component.translatable("gui.how_to_own_a_dragon.monsters_hunted_gui.label_silverfish"), 175, 48, -12829636);
		this.font.draw(poseStack, Component.translatable("gui.how_to_own_a_dragon.monsters_hunted_gui.label_skeleton"), 122, 68, -12829636);
		this.font.draw(poseStack, Component.translatable("gui.how_to_own_a_dragon.monsters_hunted_gui.label_slime"), 179, 88, -12829636);
		this.font.draw(poseStack, Component.translatable("gui.how_to_own_a_dragon.monsters_hunted_gui.label_spider"), 174, 109, -12829636);
		this.font.draw(poseStack, Component.translatable("gui.how_to_own_a_dragon.monsters_hunted_gui.label_stray"), 153, 130, -12829636);
		this.font.draw(poseStack, Component.translatable("gui.how_to_own_a_dragon.monsters_hunted_gui.label_vex"), 149, 29, -12829636);
		this.font.draw(poseStack, Component.translatable("gui.how_to_own_a_dragon.monsters_hunted_gui.label_vindicator"), 232, 48, -12829636);
		this.font.draw(poseStack, Component.translatable("gui.how_to_own_a_dragon.monsters_hunted_gui.label_witch"), 169, 68, -12829636);
		this.font.draw(poseStack, Component.translatable("gui.how_to_own_a_dragon.monsters_hunted_gui.label_wither"), 200, 68, -12829636);
		this.font.draw(poseStack, Component.translatable("gui.how_to_own_a_dragon.monsters_hunted_gui.label_wither_skeleton"), 210, 88, -12829636);
		this.font.draw(poseStack, Component.translatable("gui.how_to_own_a_dragon.monsters_hunted_gui.label_zoglin"), 210, 109, -12829636);
		this.font.draw(poseStack, Component.translatable("gui.how_to_own_a_dragon.monsters_hunted_gui.label_zombie"), 184, 130, -12829636);
		this.font.draw(poseStack, Component.translatable("gui.how_to_own_a_dragon.monsters_hunted_gui.label_zombie_villager"), 170, 29, -12829636);
		this.font.draw(poseStack, Component.translatable("gui.how_to_own_a_dragon.monsters_hunted_gui.label_zombified_piglin"), 220, 130, -12829636);
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
