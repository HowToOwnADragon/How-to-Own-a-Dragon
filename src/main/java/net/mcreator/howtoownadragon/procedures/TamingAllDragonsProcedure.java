package net.mcreator.howtoownadragon.procedures;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.advancements.AdvancementProgress;
import net.minecraft.advancements.Advancement;

public class TamingAllDragonsProcedure {
	public static void execute(Entity sourceentity) {
		if (sourceentity == null)
			return;
		double CountOfDragons = 0;
		if ((sourceentity.getPersistentData().getString("isnaddertamed")).equals("true")) {
			CountOfDragons = CountOfDragons + 1;
		}
		if ((sourceentity.getPersistentData().getString("isTTtamed")).equals("true")) {
			CountOfDragons = CountOfDragons + 1;
		}
		if ((sourceentity.getPersistentData().getString("isgronckletamed")).equals("true")) {
			CountOfDragons = CountOfDragons + 1;
		}
		if (CountOfDragons == 3) {
			if (sourceentity instanceof ServerPlayer _player) {
				Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("how_to_own_a_dragon:tame_all_dragons"));
				AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
				if (!_ap.isDone()) {
					for (String criteria : _ap.getRemainingCriteria())
						_player.getAdvancements().award(_adv, criteria);
				}
			}
		} else if (CountOfDragons < 3) {
			if (sourceentity instanceof Player _player && !_player.level.isClientSide())
				_player.displayClientMessage(Component.literal(("You do not have all tamable dragons. " + "You currently have " + CountOfDragons + " out of " + 3 + ".")), false);
		}
	}
}
