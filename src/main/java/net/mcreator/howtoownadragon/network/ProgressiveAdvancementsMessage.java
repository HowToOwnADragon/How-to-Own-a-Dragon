
package net.mcreator.howtoownadragon.network;

import net.mcreator.howtoownadragon.HowToOwnADragonMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class ProgressiveAdvancementsMessage {

	int type, pressedms;

	public ProgressiveAdvancementsMessage(int type, int pressedms) {
		this.type = type;
		this.pressedms = pressedms;
	}

	public ProgressiveAdvancementsMessage(FriendlyByteBuf buffer) {
		this.type = buffer.readInt();
		this.pressedms = buffer.readInt();
	}

	public static void buffer(ProgressiveAdvancementsMessage message, FriendlyByteBuf buffer) {
		buffer.writeInt(message.type);
		buffer.writeInt(message.pressedms);
	}

	public static void handler(ProgressiveAdvancementsMessage message, Supplier<NetworkEvent.Context> contextSupplier) {
		NetworkEvent.Context context = contextSupplier.get();
		context.enqueueWork(() -> {
			pressAction(context.getSender(), message.type, message.pressedms);
		});
		context.setPacketHandled(true);
	}

	public static void pressAction(Player entity, int type, int pressedms) {
		Level world = entity.level;
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();

		// security measure to prevent arbitrary chunk generation
		if (!world.hasChunkAt(entity.blockPosition()))
			return;

		if (type == 0) {

			ProgressiveAdvancementsOnKeyPressedProcedure.execute(world, x, y, z, entity);
		}

	}

	@SubscribeEvent
	public static void registerMessage(FMLCommonSetupEvent event) {
		HowToOwnADragonMod.addNetworkMessage(ProgressiveAdvancementsMessage.class, ProgressiveAdvancementsMessage::buffer, ProgressiveAdvancementsMessage::new, ProgressiveAdvancementsMessage::handler);
	}

}
