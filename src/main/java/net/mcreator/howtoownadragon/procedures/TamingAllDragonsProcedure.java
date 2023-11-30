package net.mcreator.howtoownadragon.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

public class TamingAllDragonsProcedure {
	public static void execute(Entity sourceentity) {
		if (sourceentity == null)
			return;
		if (sourceentity.getPersistentData().getBoolean("isnaddertamed") == true) {
			sourceentity.getPersistentData().putDouble("tamedragonprogress", (sourceentity.getPersistentData().getDouble("tamedragonprogress") + 1));
		} else if (sourceentity.getPersistentData().getBoolean("istttamed") == true) {
			sourceentity.getPersistentData().putDouble("tamedragonprogress", (sourceentity.getPersistentData().getDouble("tamedragonprogress") + 1));
		} else if (sourceentity.getPersistentData().getBoolean("isgronckletamed") == true) {
			sourceentity.getPersistentData().putDouble("tamedragonprogress", (sourceentity.getPersistentData().getDouble("tamedragonprogress") + 1));
		}
		if (sourceentity.getPersistentData().getDouble("tamedragonprogress") == 3) {
			if (sourceentity instanceof ServerPlayer _player) {
				Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("how_to_own_a_dragon:tame_all_dragons"));
				AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
				if (!_ap.isDone()) {
					for (String criteria : _ap.getRemainingCriteria())
						_player.getAdvancements().award(_adv, criteria);
				}
			}
		}
	}
}
