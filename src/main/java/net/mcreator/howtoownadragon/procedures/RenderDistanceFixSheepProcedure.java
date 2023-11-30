package net.mcreator.howtoownadragon.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

public class RenderDistanceFixSheepProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity.getType().is(TagKey.create(Registries.ENTITY_TYPE, new ResourceLocation("how_to_own_a_dragon:sheeps")))) {
			if ((entity.getPersistentData().getString("sheepcolor")).equals("white")) {
				if (!((entity instanceof SheepEntity animatable ? animatable.getTexture() : "null").equals("sheep"))) {
					if (entity instanceof SheepEntity animatable)
						animatable.setTexture("sheep");
				}
			} else if ((entity.getPersistentData().getString("sheepcolor")).equals("black")) {
				if (!((entity instanceof SheepEntity animatable ? animatable.getTexture() : "null").equals("sheepblack"))) {
					if (entity instanceof SheepEntity animatable)
						animatable.setTexture("sheepblack");
				}
			} else if ((entity.getPersistentData().getString("sheepcolor")).equals("grey")) {
				if (!((entity instanceof SheepEntity animatable ? animatable.getTexture() : "null").equals("sheepgrey"))) {
					if (entity instanceof SheepEntity animatable)
						animatable.setTexture("sheepgrey");
				}
			} else if ((entity.getPersistentData().getString("sheepcolor")).equals("lightgrey")) {
				if (!((entity instanceof SheepEntity animatable ? animatable.getTexture() : "null").equals("sheeplightgrey"))) {
					if (entity instanceof SheepEntity animatable)
						animatable.setTexture("sheeplightgrey");
				}
			} else if ((entity.getPersistentData().getString("sheepcolor")).equals("brown")) {
				if (!((entity instanceof SheepEntity animatable ? animatable.getTexture() : "null").equals("sheepbrown"))) {
					if (entity instanceof SheepEntity animatable)
						animatable.setTexture("sheepbrown");
				}
			} else if ((entity.getPersistentData().getString("sheepcolor")).equals("red")) {
				if (!((entity instanceof SheepEntity animatable ? animatable.getTexture() : "null").equals("sheepred"))) {
					if (entity instanceof SheepEntity animatable)
						animatable.setTexture("sheepred");
				}
			} else if ((entity.getPersistentData().getString("sheepcolor")).equals("orange")) {
				if (!((entity instanceof SheepEntity animatable ? animatable.getTexture() : "null").equals("sheeporange"))) {
					if (entity instanceof SheepEntity animatable)
						animatable.setTexture("sheeporange");
				}
			} else if ((entity.getPersistentData().getString("sheepcolor")).equals("yellow")) {
				if (!((entity instanceof SheepEntity animatable ? animatable.getTexture() : "null").equals("sheepyellow"))) {
					if (entity instanceof SheepEntity animatable)
						animatable.setTexture("sheepyellow");
				}
			} else if ((entity.getPersistentData().getString("sheepcolor")).equals("green")) {
				if (!((entity instanceof SheepEntity animatable ? animatable.getTexture() : "null").equals("sheepgreen"))) {
					if (entity instanceof SheepEntity animatable)
						animatable.setTexture("sheepgreen");
				}
			} else if ((entity.getPersistentData().getString("sheepcolor")).equals("lime")) {
				if (!((entity instanceof SheepEntity animatable ? animatable.getTexture() : "null").equals("sheeplime"))) {
					if (entity instanceof SheepEntity animatable)
						animatable.setTexture("sheeplime");
				}
			} else if ((entity.getPersistentData().getString("sheepcolor")).equals("cyan")) {
				if (!((entity instanceof SheepEntity animatable ? animatable.getTexture() : "null").equals("sheepcyan"))) {
					if (entity instanceof SheepEntity animatable)
						animatable.setTexture("sheepcyan");
				}
			} else if ((entity.getPersistentData().getString("sheepcolor")).equals("blue")) {
				if (!((entity instanceof SheepEntity animatable ? animatable.getTexture() : "null").equals("sheepblue"))) {
					if (entity instanceof SheepEntity animatable)
						animatable.setTexture("sheepblue");
				}
			} else if ((entity.getPersistentData().getString("sheepcolor")).equals("lightblue")) {
				if (!((entity instanceof SheepEntity animatable ? animatable.getTexture() : "null").equals("sheeplightblue"))) {
					if (entity instanceof SheepEntity animatable)
						animatable.setTexture("sheeplightblue");
				}
			} else if ((entity.getPersistentData().getString("sheepcolor")).equals("purple")) {
				if (!((entity instanceof SheepEntity animatable ? animatable.getTexture() : "null").equals("sheeppurple"))) {
					if (entity instanceof SheepEntity animatable)
						animatable.setTexture("sheeppurple");
				}
			} else if ((entity.getPersistentData().getString("sheepcolor")).equals("magenta")) {
				if (!((entity instanceof SheepEntity animatable ? animatable.getTexture() : "null").equals("sheepmagenta"))) {
					if (entity instanceof SheepEntity animatable)
						animatable.setTexture("sheepmagenta");
				}
			} else if ((entity.getPersistentData().getString("sheepcolor")).equals("pink")) {
				if (!((entity instanceof SheepEntity animatable ? animatable.getTexture() : "null").equals("sheeppink"))) {
					if (entity instanceof SheepEntity animatable)
						animatable.setTexture("sheeppink");
				}
			}
		}
	}
}
