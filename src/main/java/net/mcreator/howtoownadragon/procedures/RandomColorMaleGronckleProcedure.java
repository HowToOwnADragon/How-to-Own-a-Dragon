package net.mcreator.howtoownadragon.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.EntityJoinLevelEvent;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;

import net.mcreator.howtoownadragon.HowToOwnADragonMod;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class RandomColorMaleGronckleProcedure {
	@SubscribeEvent
	public static void onEntitySpawned(EntityJoinLevelEvent event) {
		execute(event, event.getLevel(), event.getEntity());
	}

	public static void execute(LevelAccessor world, Entity entity) {
		execute(null, world, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		HowToOwnADragonMod.queueServerWork(2, () -> {
			NBTDataSpawnGronckleProcedure.execute(entity);
			if (Mth.nextInt(RandomSource.create(), 1, 3) == 1) {
				entity.getPersistentData().putString("groncklecolor", "pink");
				TextureFixGroncklePinkMaleProcedure.execute(world, entity);
			} else if (Mth.nextInt(RandomSource.create(), 1, 3) == 2) {
				entity.getPersistentData().putString("groncklecolor", "orangered");
				TextureFixGronckleOrangeRedMaleProcedure.execute(world, entity);
			} else if (Mth.nextInt(RandomSource.create(), 1, 3) == 3) {
				entity.getPersistentData().putString("groncklecolor", "blueyellow");
				TextureFixGronckleBlueYellowMaleProcedure.execute(world, entity);
			} else {
				RandomColorMaleGronckleProcedure.execute(world, entity);
			}
		});
	}
}
