package net.mcreator.howtoownadragon.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.living.LivingEvent;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.tags.TagKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;

import net.mcreator.howtoownadragon.entity.GronckleMaleEntity;
import net.mcreator.howtoownadragon.HowToOwnADragonMod;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class TextureFixGronckleBlueYellowMaleProcedure {
	@SubscribeEvent
	public static void onEntityTick(LivingEvent.LivingTickEvent event) {
		execute(event, event.getEntity().level, event.getEntity());
	}

	public static void execute(LevelAccessor world, Entity entity) {
		execute(null, world, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		HowToOwnADragonMod.queueServerWork(3, () -> {
			if (!(entity.getPersistentData().getBoolean("loadedgronckle") == true)) {
				entity.getPersistentData().putBoolean("loadedgronckle", true);
				if (entity.getType().is(TagKey.create(Registries.ENTITY_TYPE, new ResourceLocation("how_to_own_a_dragon:gronckles")))) {
					if (!(entity.getPersistentData().getBoolean("groncklesaddle") == true)) {
						if (entity instanceof GronckleMaleEntity) {
							if ((entity.getPersistentData().getString("groncklecolor")).equals("blueyellow")) {
								SetGronckleMaleTextureBlueYellowProcedure.execute(entity);
								TextureFixGronckleWaitProcedure.execute(world, entity);
							}
						}
					}
				}
			}
		});
	}
}
