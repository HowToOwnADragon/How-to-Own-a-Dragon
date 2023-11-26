
package net.mcreator.howtoownadragon.network;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class HTOADAdvancementsButtonMessage {

	private final int buttonID, x, y, z;

	public HTOADAdvancementsButtonMessage(FriendlyByteBuf buffer) {
		this.buttonID = buffer.readInt();
		this.x = buffer.readInt();
		this.y = buffer.readInt();
		this.z = buffer.readInt();
	}

	public HTOADAdvancementsButtonMessage(int buttonID, int x, int y, int z) {
		this.buttonID = buttonID;
		this.x = x;
		this.y = y;
		this.z = z;
	}

	public static void buffer(HTOADAdvancementsButtonMessage message, FriendlyByteBuf buffer) {
		buffer.writeInt(message.buttonID);
		buffer.writeInt(message.x);
		buffer.writeInt(message.y);
		buffer.writeInt(message.z);
	}

	public static void handler(HTOADAdvancementsButtonMessage message, Supplier<NetworkEvent.Context> contextSupplier) {
		NetworkEvent.Context context = contextSupplier.get();
		context.enqueueWork(() -> {
			Player entity = context.getSender();
			int buttonID = message.buttonID;
			int x = message.x;
			int y = message.y;
			int z = message.z;

			handleButtonAction(entity, buttonID, x, y, z);
		});
		context.setPacketHandled(true);
	}

	public static void handleButtonAction(Player entity, int buttonID, int x, int y, int z) {
		Level world = entity.level;
		HashMap guistate = HTOADAdvancementsMenu.guistate;

		// security measure to prevent arbitrary chunk generation
		if (!world.hasChunkAt(new BlockPos(x, y, z)))
			return;

		if (buttonID == 0) {

			OpenGottaCatchEmAllProcedure.execute();
		}
		if (buttonID == 1) {

			OpenLoveIsInTheAirProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 2) {

			BackButtonMainAdvancementGUIProcedure.execute(world, x, y, z, entity);
		}
	}

	@SubscribeEvent
	public static void registerMessage(FMLCommonSetupEvent event) {
		HowToOwnADragonMod.addNetworkMessage(HTOADAdvancementsButtonMessage.class, HTOADAdvancementsButtonMessage::buffer, HTOADAdvancementsButtonMessage::new, HTOADAdvancementsButtonMessage::handler);
	}

}
