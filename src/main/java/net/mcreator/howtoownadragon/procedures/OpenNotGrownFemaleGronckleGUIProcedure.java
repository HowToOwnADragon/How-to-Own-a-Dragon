package net.mcreator.howtoownadragon.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class OpenNotGrownFemaleGronckleGUIProcedure {
	@SubscribeEvent
	public static void onRightClickEntity(PlayerInteractEvent.EntityInteract event) {
		if (event.getHand() != event.getEntity().getUsedItemHand())
			return;
		execute(event, event.getLevel(), event.getPos().getX(), event.getPos().getY(), event.getPos().getZ(), event.getTarget(), event.getEntity());
	}

	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, Entity sourceentity) {
		execute(null, world, x, y, z, entity, sourceentity);
	}

private static void execute(
@Nullable Event event,
LevelAccessor world,
double x,
double y,
double z,
Entity entity,
Entity sourceentity
) {
if(
entity == null ||
sourceentity == null
) return ;
if (entity.getType().is(TagKey.create(Registries.ENTITY_TYPE, new ResourceLocation("how_to_own_a_dragon:male_gronckle")))&&&&(sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem():ItemStack.EMPTY).getItem() == ItemStack.EMPTY.getItem()) {{
if(sourceentity instanceof ServerPlayer _ent) {
BlockPos _bpos = BlockPos.containing(x,y,z);
NetworkHooks.openScreen((ServerPlayer) _ent, new MenuProvider() {
@Override public Component getDisplayName() {
return Component.literal("NotGrownMaleGronckleGUI");
}
@Override public AbstractContainerMenu createMenu(int id, Inventory inventory, Player player) {
return new NotGrownMaleGronckleGUIMenu(id, inventory, new FriendlyByteBuf(Unpooled.buffer()).writeBlockPos(_bpos));
}
}, _bpos);
}
}
}
}
}
