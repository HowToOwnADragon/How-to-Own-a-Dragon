package net.mcreator.howtoownadragon.client.gui;

public class MHFirstPageGUIScreen extends AbstractContainerScreen<MHFirstPageGUIMenu> {

	private final static HashMap<String, Object> guistate = MHFirstPageGUIMenu.guistate;

	private final Level world;
	private final int x, y, z;
	private final Player entity;

	ImageButton imagebutton_previous_page_arrow;
	ImageButton imagebutton_next_page_mcreator_copy;

	public MHFirstPageGUIScreen(MHFirstPageGUIMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 100;
		this.imageHeight = 140;
	}

	private static final ResourceLocation texture = new ResourceLocation("how_to_own_a_dragon:textures/screens/mh_first_page_gui.png");

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
		this.font.draw(poseStack, Component.translatable("gui.how_to_own_a_dragon.mh_first_page_gui.label_first_page"), 21, 7, -12829636);
		this.font.draw(poseStack, Component.translatable("gui.how_to_own_a_dragon.mh_first_page_gui.label_zombie"), 32, 28, -12829636);
		this.font.draw(poseStack, Component.translatable("gui.how_to_own_a_dragon.mh_first_page_gui.label_zombie_villager"), 11, 43, -12829636);
		this.font.draw(poseStack, Component.translatable("gui.how_to_own_a_dragon.mh_first_page_gui.label_zombified_piglin"), 7, 58, -12829636);
		this.font.draw(poseStack, Component.translatable("gui.how_to_own_a_dragon.mh_first_page_gui.label_wither"), 32, 73, -12829636);
		this.font.draw(poseStack, Component.translatable("gui.how_to_own_a_dragon.mh_first_page_gui.label_wither_skeleton"), 11, 88, -12829636);
		this.font.draw(poseStack, Component.translatable("gui.how_to_own_a_dragon.mh_first_page_gui.label_zoglin"), 32, 104, -12829636);
		this.font.draw(poseStack, Component.translatable("gui.how_to_own_a_dragon.mh_first_page_gui.label_spider"), 33, 120, -12829636);
	}

	@Override
	public void onClose() {
		super.onClose();
	}

	@Override
	public void init() {
		super.init();

		imagebutton_previous_page_arrow = new ImageButton(this.leftPos + 2, this.topPos + 117, 24, 20, 0, 0, 20, new ResourceLocation("how_to_own_a_dragon:textures/screens/atlas/imagebutton_previous_page_arrow.png"), 24, 40, e -> {
		});

		guistate.put("button:imagebutton_previous_page_arrow", imagebutton_previous_page_arrow);
		this.addRenderableWidget(imagebutton_previous_page_arrow);

		imagebutton_next_page_mcreator_copy = new ImageButton(this.leftPos + 72, this.topPos + 117, 24, 20, 0, 0, 20, new ResourceLocation("how_to_own_a_dragon:textures/screens/atlas/imagebutton_next_page_mcreator_copy.png"), 24, 40, e -> {
		});

		guistate.put("button:imagebutton_next_page_mcreator_copy", imagebutton_next_page_mcreator_copy);
		this.addRenderableWidget(imagebutton_next_page_mcreator_copy);

	}

}
