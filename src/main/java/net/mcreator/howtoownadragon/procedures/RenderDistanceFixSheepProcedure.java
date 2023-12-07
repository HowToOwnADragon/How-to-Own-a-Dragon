package net.mcreator.howtoownadragon.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.tags.TagKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;

import net.mcreator.howtoownadragon.entity.SheepEntity;
import net.mcreator.howtoownadragon.HowToOwnADragonMod;

public class RenderDistanceFixSheepProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		HowToOwnADragonMod.queueServerWork(3, () -> {
			if (!(entity.getPersistentData().getBoolean("loadedsheep") == true)) {
				entity.getPersistentData().putBoolean("loadedsheep", true);
				if (entity.getType().is(TagKey.create(Registries.ENTITY_TYPE, new ResourceLocation("how_to_own_a_dragon:sheeps")))) {
					if ((entity.getPersistentData().getString("sheepcolor")).equals("white")) {
						if (entity instanceof SheepEntity animatable)
							animatable.setTexture("sheep");
						TextureFixSheepWaitProcedure.execute(world, entity);
					} else if ((entity.getPersistentData().getString("sheepcolor")).equals("black")) {
						if (entity instanceof SheepEntity animatable)
							animatable.setTexture("sheepblack");
						TextureFixSheepWaitProcedure.execute(world, entity);
					} else if ((entity.getPersistentData().getString("sheepcolor")).equals("grey")) {
						if (entity instanceof SheepEntity animatable)
							animatable.setTexture("sheepgrey");
						TextureFixSheepWaitProcedure.execute(world, entity);
					} else if ((entity.getPersistentData().getString("sheepcolor")).equals("lightgrey")) {
						if (entity instanceof SheepEntity animatable)
							animatable.setTexture("sheeplightgrey");
						TextureFixSheepWaitProcedure.execute(world, entity);
					} else if ((entity.getPersistentData().getString("sheepcolor")).equals("brown")) {
						if (entity instanceof SheepEntity animatable)
							animatable.setTexture("sheepbrown");
						TextureFixSheepWaitProcedure.execute(world, entity);
					} else if ((entity.getPersistentData().getString("sheepcolor")).equals("red")) {
						if (entity instanceof SheepEntity animatable)
							animatable.setTexture("sheepred");
						TextureFixSheepWaitProcedure.execute(world, entity);
					} else if ((entity.getPersistentData().getString("sheepcolor")).equals("orange")) {
						if (entity instanceof SheepEntity animatable)
							animatable.setTexture("sheeporange");
						TextureFixSheepWaitProcedure.execute(world, entity);
					} else if ((entity.getPersistentData().getString("sheepcolor")).equals("yellow")) {
						if (entity instanceof SheepEntity animatable)
							animatable.setTexture("sheepyellow");
						TextureFixSheepWaitProcedure.execute(world, entity);
					} else if ((entity.getPersistentData().getString("sheepcolor")).equals("green")) {
						if (entity instanceof SheepEntity animatable)
							animatable.setTexture("sheepgreen");
						TextureFixSheepWaitProcedure.execute(world, entity);
					} else if ((entity.getPersistentData().getString("sheepcolor")).equals("lime")) {
						if (entity instanceof SheepEntity animatable)
							animatable.setTexture("sheeplime");
						TextureFixSheepWaitProcedure.execute(world, entity);
					} else if ((entity.getPersistentData().getString("sheepcolor")).equals("cyan")) {
						if (entity instanceof SheepEntity animatable)
							animatable.setTexture("sheepcyan");
						TextureFixSheepWaitProcedure.execute(world, entity);
					} else if ((entity.getPersistentData().getString("sheepcolor")).equals("blue")) {
						if (entity instanceof SheepEntity animatable)
							animatable.setTexture("sheepblue");
						TextureFixSheepWaitProcedure.execute(world, entity);
					} else if ((entity.getPersistentData().getString("sheepcolor")).equals("lightblue")) {
						if (entity instanceof SheepEntity animatable)
							animatable.setTexture("sheeplightblue");
						TextureFixSheepWaitProcedure.execute(world, entity);
					} else if ((entity.getPersistentData().getString("sheepcolor")).equals("purple")) {
						if (entity instanceof SheepEntity animatable)
							animatable.setTexture("sheeppurple");
						TextureFixSheepWaitProcedure.execute(world, entity);
					} else if ((entity.getPersistentData().getString("sheepcolor")).equals("magenta")) {
						if (entity instanceof SheepEntity animatable)
							animatable.setTexture("sheepmagenta");
						TextureFixSheepWaitProcedure.execute(world, entity);
					} else if ((entity.getPersistentData().getString("sheepcolor")).equals("pink")) {
						if (entity instanceof SheepEntity animatable)
							animatable.setTexture("sheeppink");
						TextureFixSheepWaitProcedure.execute(world, entity);
					} else {
						OnInitialEntitySpawnSheepProcedure.execute(world, entity);
						HowToOwnADragonMod.queueServerWork(200, () -> {
							entity.getPersistentData().putBoolean("loadedsheep", false);
							RenderDistanceFixSheepProcedure.execute(world, entity);
						});
					}
				}
			}
		});
	}
}
