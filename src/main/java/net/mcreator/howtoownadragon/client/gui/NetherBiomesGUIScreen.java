package net.mcreator.howtoownadragon.client.gui;

public class NetherBiomesGUIScreen extends AbstractContainerScreen<NetherBiomesGUIMenu> {

	private final static HashMap<String, Object> guistate = NetherBiomesGUIMenu.guistate;

	private final Level world;
	private final int x, y, z;
	private final Player entity;

	ImageButton imagebutton_previous_page_arrow;

	public NetherBiomesGUIScreen(NetherBiomesGUIMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 120;
		this.imageHeight = 120;
	}

	@Override
	public boolean isPauseScreen() {
		return true;
	}

	private static final ResourceLocation texture = new ResourceLocation("how_to_own_a_dragon:textures/screens/nether_biomes_gui.png");

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
		this.font.draw(poseStack, Component.translatable("gui.how_to_own_a_dragon.nether_biomes_gui.label_all_nether_biomes"), 16, 5, -12829636);
		if (

		CrimsonForestReturnProcedure.execute()

		)
			this.font.draw(poseStack, Component.translatable("gui.how_to_own_a_dragon.nether_biomes_gui.label_crimson_forest"), 23, 33, -12829636);
		if (

		WarpedForestReturnProcedure.execute(entity)

		)
			this.font.draw(poseStack, Component.translatable("gui.how_to_own_a_dragon.nether_biomes_gui.label_warped_forest"), 24, 51, -12829636);
		if (

		SoulSandValleyReturnProcedure.execute(entity)

		)
			this.font.draw(poseStack, Component.translatable("gui.how_to_own_a_dragon.nether_biomes_gui.label_soul_sand_valley"), 18, 69, -12829636);
		if (

		NetherWastesReturnProcedure.execute(entity)

		)
			this.font.draw(poseStack, Component.translatable("gui.how_to_own_a_dragon.nether_biomes_gui.label_nether_waste"), 25, 87, -12829636);
		if (

		BasaltDeltasCheckProcedure.execute()

		)
			this.font.draw(poseStack, Component.translatable("gui.how_to_own_a_dragon.nether_biomes_gui.label_basalt_deltas"), 27, 105, -12829636);
	}

	@Override
	public void onClose() {
		super.onClose();
	}

	@Override
	public void init() {
		super.init();

		imagebutton_previous_page_arrow = new ImageButton(this.leftPos + 0, this.topPos + 97, 24, 20, 0, 0, 20, new ResourceLocation("how_to_own_a_dragon:textures/screens/atlas/imagebutton_previous_page_arrow.png"), 24, 40, e -> {
			if (true) {
				HowToOwnADragonMod.PACKET_HANDLER.sendToServer(new NetherBiomesGUIButtonMessage(0, x, y, z));
				NetherBiomesGUIButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		});

		guistate.put("button:imagebutton_previous_page_arrow", imagebutton_previous_page_arrow);
		this.addRenderableWidget(imagebutton_previous_page_arrow);

	}

}
