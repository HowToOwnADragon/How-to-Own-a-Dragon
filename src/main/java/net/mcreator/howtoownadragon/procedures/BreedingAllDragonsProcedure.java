package net.mcreator.howtoownadragon.procedures;

import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.advancements.AdvancementProgress;
import net.minecraft.advancements.Advancement;

public class BreedingAllDragonsProcedure {
	public static void execute(Entity sourceentity) {
		if (sourceentity == null)
			return;
		if (sourceentity.getPersistentData().getBoolean("isnadderbreed") == true) {
			sourceentity.getPersistentData().putDouble("breeddragonprogress", (sourceentity.getPersistentData().getDouble("breeddragonprogress") + 1));
		} else if (sourceentity.getPersistentData().getBoolean("isttbreed") == true) {
			sourceentity.getPersistentData().putDouble("breeddragonprogress", (sourceentity.getPersistentData().getDouble("breeddragonprogress") + 1));
		} else if (sourceentity.getPersistentData().getBoolean("isgroncklebreed") == true) {
			sourceentity.getPersistentData().putDouble("breeddragonprogress", (sourceentity.getPersistentData().getDouble("breeddragonprogress") + 1));
		}
		if (sourceentity.getPersistentData().getDouble("breeddragonprogress") == 3) {
			if (sourceentity instanceof ServerPlayer _player) {
				Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("how_to_own_a_dragon:breed_all_dragons"));
				AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
				if (!_ap.isDone()) {
					for (String criteria : _ap.getRemainingCriteria())
						_player.getAdvancements().award(_adv, criteria);
				}
			}
		}
	}
}
