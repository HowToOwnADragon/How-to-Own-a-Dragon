package net.mcreator.howtoownadragon.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.EntityJoinLevelEvent;

import net.minecraft.world.entity.Entity;
import net.minecraft.tags.TagKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;

import net.mcreator.howtoownadragon.entity.JuvenileGronckleMaleEntity;
import net.mcreator.howtoownadragon.entity.JuvenileGronckleFemaleEntity;
import net.mcreator.howtoownadragon.entity.GronckleMaleEntity;
import net.mcreator.howtoownadragon.entity.GronckleFemaleEntity;
import net.mcreator.howtoownadragon.entity.BabyGronckleMaleEntity;
import net.mcreator.howtoownadragon.entity.BabyGronckleFemaleEntity;
import net.mcreator.howtoownadragon.entity.AdolescentGronckleMaleEntity;
import net.mcreator.howtoownadragon.entity.AdolescentGronckleFemaleEntity;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class GronckleColorLoadWorldProcedure {
	@SubscribeEvent
	public static void onEntitySpawned(EntityJoinLevelEvent event) {
		execute(event, event.getEntity());
	}

	public static void execute(Entity entity) {
		execute(null, entity);
	}

	private static void execute(@Nullable Event event, Entity entity) {
		if (entity == null)
			return;
		if (entity.getType().is(TagKey.create(Registries.ENTITY_TYPE, new ResourceLocation("how_to_own_a_dragon:gronckles")))) {
			if (entity.getPersistentData().getBoolean("groncklesaddle") == false) {
				if (entity instanceof BabyGronckleMaleEntity) {
					if ((entity.getPersistentData().getString("groncklecolor")).equals("pink")) {
						if (entity instanceof BabyGronckleMaleEntity animatable)
							animatable.setTexture("babygroncklepink");
					} else if ((entity.getPersistentData().getString("groncklecolor")).equals("meatlug")) {
						if (entity instanceof BabyGronckleMaleEntity animatable)
							animatable.setTexture("babymeatlug");
					} else if ((entity.getPersistentData().getString("groncklecolor")).equals("orangered")) {
						if (entity instanceof BabyGronckleMaleEntity animatable)
							animatable.setTexture("babygronckleorange");
					} else if ((entity.getPersistentData().getString("groncklecolor")).equals("blueyellow")) {
						if (entity instanceof BabyGronckleMaleEntity animatable)
							animatable.setTexture("babygroncleblue");
					}
				} else if (entity instanceof BabyGronckleFemaleEntity) {
					if ((entity.getPersistentData().getString("groncklecolor")).equals("pink")) {
						if (entity instanceof BabyGronckleFemaleEntity animatable)
							animatable.setTexture("babygroncklepink");
					} else if ((entity.getPersistentData().getString("groncklecolor")).equals("meatlug")) {
						if (entity instanceof BabyGronckleFemaleEntity animatable)
							animatable.setTexture("babymeatlug");
					} else if ((entity.getPersistentData().getString("groncklecolor")).equals("orangered")) {
						if (entity instanceof BabyGronckleFemaleEntity animatable)
							animatable.setTexture("babygronckleorange");
					} else if ((entity.getPersistentData().getString("groncklecolor")).equals("blueyellow")) {
						if (entity instanceof BabyGronckleFemaleEntity animatable)
							animatable.setTexture("babygroncleblue");
					}
				} else if (entity instanceof JuvenileGronckleMaleEntity) {
					if ((entity.getPersistentData().getString("groncklecolor")).equals("pink")) {
						if (entity instanceof JuvenileGronckleMaleEntity animatable)
							animatable.setTexture("juvigroncklepink");
					} else if ((entity.getPersistentData().getString("groncklecolor")).equals("meatlug")) {
						if (entity instanceof JuvenileGronckleMaleEntity animatable)
							animatable.setTexture("juvimeatlug");
					} else if ((entity.getPersistentData().getString("groncklecolor")).equals("orangered")) {
						if (entity instanceof JuvenileGronckleMaleEntity animatable)
							animatable.setTexture("juvigronckleorangered");
					} else if ((entity.getPersistentData().getString("groncklecolor")).equals("blueyellow")) {
						if (entity instanceof JuvenileGronckleMaleEntity animatable)
							animatable.setTexture("juvigronckleblueyellow");
					}
				} else if (entity instanceof JuvenileGronckleFemaleEntity) {
					if ((entity.getPersistentData().getString("groncklecolor")).equals("pink")) {
						if (entity instanceof JuvenileGronckleFemaleEntity animatable)
							animatable.setTexture("juvigroncklepink");
					} else if ((entity.getPersistentData().getString("groncklecolor")).equals("meatlug")) {
						if (entity instanceof JuvenileGronckleFemaleEntity animatable)
							animatable.setTexture("juvimeatlug");
					} else if ((entity.getPersistentData().getString("groncklecolor")).equals("orangered")) {
						if (entity instanceof JuvenileGronckleFemaleEntity animatable)
							animatable.setTexture("juvigronckleorangered");
					} else if ((entity.getPersistentData().getString("groncklecolor")).equals("blueyellow")) {
						if (entity instanceof JuvenileGronckleFemaleEntity animatable)
							animatable.setTexture("juvigronckleblueyellow");
					}
				} else if (entity instanceof AdolescentGronckleMaleEntity) {
					if ((entity.getPersistentData().getString("groncklecolor")).equals("pink")) {
						if (entity instanceof AdolescentGronckleMaleEntity animatable)
							animatable.setTexture("adogroncklepink");
					} else if ((entity.getPersistentData().getString("groncklecolor")).equals("meatlug")) {
						if (entity instanceof AdolescentGronckleMaleEntity animatable)
							animatable.setTexture("adomeatlug");
					} else if ((entity.getPersistentData().getString("groncklecolor")).equals("orangered")) {
						if (entity instanceof AdolescentGronckleMaleEntity animatable)
							animatable.setTexture("adogronckleorangered");
					} else if ((entity.getPersistentData().getString("groncklecolor")).equals("blueyellow")) {
						if (entity instanceof AdolescentGronckleMaleEntity animatable)
							animatable.setTexture("adogronckleblueyellow");
					}
				} else if (entity instanceof AdolescentGronckleFemaleEntity) {
					if ((entity.getPersistentData().getString("groncklecolor")).equals("pink")) {
						if (entity instanceof AdolescentGronckleFemaleEntity animatable)
							animatable.setTexture("adogroncklepink");
					} else if ((entity.getPersistentData().getString("groncklecolor")).equals("meatlug")) {
						if (entity instanceof AdolescentGronckleFemaleEntity animatable)
							animatable.setTexture("adomeatlug");
					} else if ((entity.getPersistentData().getString("groncklecolor")).equals("orangered")) {
						if (entity instanceof AdolescentGronckleFemaleEntity animatable)
							animatable.setTexture("adogronckleorangered");
					} else if ((entity.getPersistentData().getString("groncklecolor")).equals("blueyellow")) {
						if (entity instanceof AdolescentGronckleFemaleEntity animatable)
							animatable.setTexture("adogronckleblueyellow");
					}
				} else if (entity instanceof GronckleMaleEntity) {
					if ((entity.getPersistentData().getString("groncklecolor")).equals("pink")) {
						if (entity instanceof GronckleMaleEntity animatable)
							animatable.setTexture("groncklepink");
					} else if ((entity.getPersistentData().getString("groncklecolor")).equals("meatlug")) {
						if (entity instanceof GronckleMaleEntity animatable)
							animatable.setTexture("mealtug");
					} else if ((entity.getPersistentData().getString("groncklecolor")).equals("orangered")) {
						if (entity instanceof GronckleMaleEntity animatable)
							animatable.setTexture("gronckleorangered");
					} else if ((entity.getPersistentData().getString("groncklecolor")).equals("blueyellow")) {
						if (entity instanceof GronckleMaleEntity animatable)
							animatable.setTexture("gronckleblueyellow");
					}
				} else if (entity instanceof GronckleFemaleEntity) {
					if ((entity.getPersistentData().getString("groncklecolor")).equals("pink")) {
						if (entity instanceof GronckleFemaleEntity animatable)
							animatable.setTexture("groncklepink");
					} else if ((entity.getPersistentData().getString("groncklecolor")).equals("meatlug")) {
						if (entity instanceof GronckleFemaleEntity animatable)
							animatable.setTexture("meatlug");
					} else if ((entity.getPersistentData().getString("groncklecolor")).equals("orangered")) {
						if (entity instanceof GronckleFemaleEntity animatable)
							animatable.setTexture("gronckleorangered");
					} else if ((entity.getPersistentData().getString("groncklecolor")).equals("blueyellow")) {
						if (entity instanceof GronckleFemaleEntity animatable)
							animatable.setTexture("gronckleblueyellow");
					}
				}
			}
		}
	}
}
