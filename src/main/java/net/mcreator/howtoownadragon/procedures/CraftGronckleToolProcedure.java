package net.mcreator.howtoownadragon.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.player.PlayerEvent;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.Entity;
import net.minecraft.tags.ItemTags;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.advancements.AdvancementProgress;
import net.minecraft.advancements.Advancement;

import net.mcreator.howtoownadragon.init.HowToOwnADragonModItems;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class CraftGronckleToolProcedure {
	@SubscribeEvent
	public static void onItemCrafted(PlayerEvent.ItemCraftedEvent event) {
		execute(event, event.getEntity());
	}

	public static void execute(Entity entity) {
		execute(null, entity);
	}

	private static void execute(@Nullable Event event, Entity entity) {
		if (entity == null)
			return;
		if (new ItemStack(HowToOwnADragonModItems.GRONCKLE_IRON_SWORD.get()).is(ItemTags.create(new ResourceLocation("how_to_own_a_dragon:gronckle_tools")))) {
			if (entity instanceof ServerPlayer _player) {
				Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("how_to_own_a_dragon:craft_a_gronckle_tool"));
				AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
				if (!_ap.isDone()) {
					for (String criteria : _ap.getRemainingCriteria())
						_player.getAdvancements().award(_adv, criteria);
				}
			}
		} else if (new ItemStack(HowToOwnADragonModItems.GRONCKLE_IRON_PICKAXE.get()).is(ItemTags.create(new ResourceLocation("how_to_own_a_dragon:gronckle_tools")))) {
			if (entity instanceof ServerPlayer _player) {
				Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("how_to_own_a_dragon:craft_a_gronckle_tool"));
				AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
				if (!_ap.isDone()) {
					for (String criteria : _ap.getRemainingCriteria())
						_player.getAdvancements().award(_adv, criteria);
				}
			}
		} else if (new ItemStack(HowToOwnADragonModItems.GRONCKLE_IRON_SHOVEL.get()).is(ItemTags.create(new ResourceLocation("how_to_own_a_dragon:gronckle_tools")))) {
			if (entity instanceof ServerPlayer _player) {
				Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("how_to_own_a_dragon:craft_a_gronckle_tool"));
				AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
				if (!_ap.isDone()) {
					for (String criteria : _ap.getRemainingCriteria())
						_player.getAdvancements().award(_adv, criteria);
				}
			}
		} else if (new ItemStack(HowToOwnADragonModItems.GRONCKLE_IRON_AXE.get()).is(ItemTags.create(new ResourceLocation("how_to_own_a_dragon:gronckle_tools")))) {
			if (entity instanceof ServerPlayer _player) {
				Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("how_to_own_a_dragon:craft_a_gronckle_tool"));
				AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
				if (!_ap.isDone()) {
					for (String criteria : _ap.getRemainingCriteria())
						_player.getAdvancements().award(_adv, criteria);
				}
			}
		} else if (new ItemStack(HowToOwnADragonModItems.GRONCKLE_IRON_HOE.get()).is(ItemTags.create(new ResourceLocation("how_to_own_a_dragon:gronckle_tools")))) {
			if (entity instanceof ServerPlayer _player) {
				Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("how_to_own_a_dragon:craft_a_gronckle_tool"));
				AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
				if (!_ap.isDone()) {
					for (String criteria : _ap.getRemainingCriteria())
						_player.getAdvancements().award(_adv, criteria);
				}
			}
		}
	}
}
