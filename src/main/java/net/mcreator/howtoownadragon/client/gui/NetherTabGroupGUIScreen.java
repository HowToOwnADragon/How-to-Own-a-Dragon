package net.mcreator.howtoownadragon.client.gui;

public class NetherTabGroupGUIScreen extends AbstractContainerScreen<NetherTabGroupGUIMenu> {

	private final static HashMap<String, Object> guistate = NetherTabGroupGUIMenu.guistate;

	private final Level world;
	private final int x, y, z;
	private final Player entity;

	Button button_hot_tourist_destinations;

	ImageButton imagebutton_previous_page_arrow;

	public NetherTabGroupGUIScreen(NetherTabGroupGUIMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 196;
		this.imageHeight = 45;
	}

	@Override
	public boolean isPauseScreen() {
		return true;
	}

	private static final ResourceLocation texture = new ResourceLocation("how_to_own_a_dragon:textures/screens/nether_tab_group_gui.png");

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
		this.font.draw(poseStack, Component.translatable("gui.how_to_own_a_dragon.nether_tab_group_gui.label_nether_progressive_advancements"), 13, 5, -12829636);
	}

	@Override
	public void onClose() {
		super.onClose();
	}

	@Override
	public void init() {
		super.init();

		button_hot_tourist_destinations = Button.builder(Component.translatable("gui.how_to_own_a_dragon.nether_tab_group_gui.button_hot_tourist_destinations"), e -> {
			if (true) {
				HowToOwnADragonMod.PACKET_HANDLER.sendToServer(new NetherTabGroupGUIButtonMessage(0, x, y, z));
				NetherTabGroupGUIButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}).bounds(this.leftPos + 23, this.topPos + 20, 150, 20).build();

		guistate.put("button:button_hot_tourist_destinations", button_hot_tourist_destinations);
		this.addRenderableWidget(button_hot_tourist_destinations);

		imagebutton_previous_page_arrow = new ImageButton(this.leftPos + 0, this.topPos + 24, 24, 20, 0, 0, 20, new ResourceLocation("how_to_own_a_dragon:textures/screens/atlas/imagebutton_previous_page_arrow.png"), 24, 40, e -> {
			if (true) {
				HowToOwnADragonMod.PACKET_HANDLER.sendToServer(new NetherTabGroupGUIButtonMessage(1, x, y, z));
				NetherTabGroupGUIButtonMessage.handleButtonAction(entity, 1, x, y, z);
			}
		});

		guistate.put("button:imagebutton_previous_page_arrow", imagebutton_previous_page_arrow);
		this.addRenderableWidget(imagebutton_previous_page_arrow);

	}

}
