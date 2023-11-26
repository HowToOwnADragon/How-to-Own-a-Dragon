package net.mcreator.howtoownadragon.client.gui;

public class HTOADAdvancementsScreen extends AbstractContainerScreen<HTOADAdvancementsMenu> {

	private final static HashMap<String, Object> guistate = HTOADAdvancementsMenu.guistate;

	private final Level world;
	private final int x, y, z;
	private final Player entity;

	Button button_gotta_catch_em_all;
	Button button_breed_all_dragons;

	ImageButton imagebutton_previous_page_arrow;

	public HTOADAdvancementsScreen(HTOADAdvancementsMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 180;
		this.imageHeight = 80;
	}

	@Override
	public boolean isPauseScreen() {
		return true;
	}

	private static final ResourceLocation texture = new ResourceLocation("how_to_own_a_dragon:textures/screens/htoad_advancements.png");

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
		this.font.draw(poseStack, Component.translatable("gui.how_to_own_a_dragon.htoad_advancements.label_htoad_advancements"), 6, 7, -12829636);
	}

	@Override
	public void onClose() {
		super.onClose();
	}

	@Override
	public void init() {
		super.init();

		button_gotta_catch_em_all = Button.builder(Component.translatable("gui.how_to_own_a_dragon.htoad_advancements.button_gotta_catch_em_all"), e -> {
			if (true) {
				HowToOwnADragonMod.PACKET_HANDLER.sendToServer(new HTOADAdvancementsButtonMessage(0, x, y, z));
				HTOADAdvancementsButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}).bounds(this.leftPos + 28, this.topPos + 28, 124, 20).build();

		guistate.put("button:button_gotta_catch_em_all", button_gotta_catch_em_all);
		this.addRenderableWidget(button_gotta_catch_em_all);

		button_breed_all_dragons = Button.builder(Component.translatable("gui.how_to_own_a_dragon.htoad_advancements.button_breed_all_dragons"), e -> {
			if (true) {
				HowToOwnADragonMod.PACKET_HANDLER.sendToServer(new HTOADAdvancementsButtonMessage(1, x, y, z));
				HTOADAdvancementsButtonMessage.handleButtonAction(entity, 1, x, y, z);
			}
		}).bounds(this.leftPos + 34, this.topPos + 52, 113, 20).build();

		guistate.put("button:button_breed_all_dragons", button_breed_all_dragons);
		this.addRenderableWidget(button_breed_all_dragons);

		imagebutton_previous_page_arrow = new ImageButton(this.leftPos + 1, this.topPos + 57, 24, 20, 0, 0, 20, new ResourceLocation("how_to_own_a_dragon:textures/screens/atlas/imagebutton_previous_page_arrow.png"), 24, 40, e -> {
			if (true) {
				HowToOwnADragonMod.PACKET_HANDLER.sendToServer(new HTOADAdvancementsButtonMessage(2, x, y, z));
				HTOADAdvancementsButtonMessage.handleButtonAction(entity, 2, x, y, z);
			}
		});

		guistate.put("button:imagebutton_previous_page_arrow", imagebutton_previous_page_arrow);
		this.addRenderableWidget(imagebutton_previous_page_arrow);

	}

}
