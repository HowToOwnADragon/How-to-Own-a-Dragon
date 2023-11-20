package net.mcreator.howtoownadragon.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.living.AnimalTameEvent;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.TamableAnimal;
import net.minecraft.world.entity.Entity;
import net.minecraft.tags.TagKey;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;
import net.minecraft.advancements.AdvancementProgress;
import net.minecraft.advancements.Advancement;

import net.mcreator.howtoownadragon.HowToOwnADragonMod;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class ObtainFirstTameDragonAchievementsProcedure {
	@SubscribeEvent
	public static void onEntityTamed(AnimalTameEvent event) {
		execute(event, event.getAnimal().level, event.getAnimal(), event.getTamer());
	}

	public static void execute(LevelAccessor world, Entity entity, Entity sourceentity) {
		execute(null, world, entity, sourceentity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, Entity entity, Entity sourceentity) {
		if (entity == null || sourceentity == null)
			return;
		HowToOwnADragonMod.queueServerWork(3, () -> {
			if (entity.getType().is(TagKey.create(Registries.ENTITY_TYPE, new ResourceLocation("how_to_own_a_dragon:dragons")))) {
				if ((sourceentity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null) instanceof ServerPlayer _player) {
					Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("how_to_own_a_dragon:first_tamed_dragon"));
					AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
					if (!_ap.isDone()) {
						for (String criteria : _ap.getRemainingCriteria())
							_player.getAdvancements().award(_adv, criteria);
					}
				}
			}
		});
	}
}
