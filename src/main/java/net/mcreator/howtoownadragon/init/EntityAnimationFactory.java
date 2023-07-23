package net.mcreator.howtoownadragon.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.living.LivingEvent;

import net.mcreator.howtoownadragon.entity.NightFuryEntity;
import net.mcreator.howtoownadragon.entity.MeatlugMaleEntity;
import net.mcreator.howtoownadragon.entity.MeatlugFemaleEntity;
import net.mcreator.howtoownadragon.entity.JuvenileMeatlugMaleEntity;
import net.mcreator.howtoownadragon.entity.JuvenileMeatlugFemaleEntity;
import net.mcreator.howtoownadragon.entity.JuvenileGroncklePinkMaleEntity;
import net.mcreator.howtoownadragon.entity.JuvenileGroncklePinkFemaleEntity;
import net.mcreator.howtoownadragon.entity.JuvenileGronckleOrangeRedMaleEntity;
import net.mcreator.howtoownadragon.entity.JuvenileGronckleOrangeRedFemaleEntity;
import net.mcreator.howtoownadragon.entity.JuvenileGronckleBlueYellowMaleEntity;
import net.mcreator.howtoownadragon.entity.JuvenileGronckleBlueYellowFemaleEntity;
import net.mcreator.howtoownadragon.entity.GroncklePinkMaleEntity;
import net.mcreator.howtoownadragon.entity.GroncklePinkFemaleEntity;
import net.mcreator.howtoownadragon.entity.GronckleOrangeRedMaleEntity;
import net.mcreator.howtoownadragon.entity.GronckleOrangeRedFemaleEntity;
import net.mcreator.howtoownadragon.entity.GronckleBlueYellowMaleEntity;
import net.mcreator.howtoownadragon.entity.GronckleBlueYellowFemaleEntity;
import net.mcreator.howtoownadragon.entity.BabyMeatlugMaleEntity;
import net.mcreator.howtoownadragon.entity.BabyMeatlugFemaleEntity;
import net.mcreator.howtoownadragon.entity.BabyGroncklePinkMaleEntity;
import net.mcreator.howtoownadragon.entity.BabyGroncklePinkFemaleEntity;
import net.mcreator.howtoownadragon.entity.BabyGronckleOrangeRedMaleEntity;
import net.mcreator.howtoownadragon.entity.BabyGronckleOrangeRedFemaleEntity;
import net.mcreator.howtoownadragon.entity.BabyGronckleBlueYellowMaleEntity;
import net.mcreator.howtoownadragon.entity.BabyGronckleBlueYellowFemaleEntity;
import net.mcreator.howtoownadragon.entity.AdolescentMeatlugMaleEntity;
import net.mcreator.howtoownadragon.entity.AdolescentMeatlugFemaleEntity;
import net.mcreator.howtoownadragon.entity.AdolescentGroncklePinkMaleEntity;
import net.mcreator.howtoownadragon.entity.AdolescentGroncklePinkFemaleEntity;
import net.mcreator.howtoownadragon.entity.AdolescentGronckleOrangeRedMaleEntity;
import net.mcreator.howtoownadragon.entity.AdolescentGronckleOrangeRedFemaleEntity;
import net.mcreator.howtoownadragon.entity.AdolescentGronckleBlueYellowMaleEntity;
import net.mcreator.howtoownadragon.entity.AdolescentGronckleBlueYellowFemaleEntity;

@Mod.EventBusSubscriber
public class EntityAnimationFactory {
	@SubscribeEvent
	public static void onEntityTick(LivingEvent.LivingTickEvent event) {
		if (event != null && event.getEntity() != null) {
			if (event.getEntity() instanceof NightFuryEntity syncable) {
				String animation = syncable.getSyncedAnimation();
				if (!animation.equals("undefined")) {
					syncable.setAnimation("undefined");
					syncable.animationprocedure = animation;
				}
			}
			if (event.getEntity() instanceof MeatlugMaleEntity syncable) {
				String animation = syncable.getSyncedAnimation();
				if (!animation.equals("undefined")) {
					syncable.setAnimation("undefined");
					syncable.animationprocedure = animation;
				}
			}
			if (event.getEntity() instanceof MeatlugFemaleEntity syncable) {
				String animation = syncable.getSyncedAnimation();
				if (!animation.equals("undefined")) {
					syncable.setAnimation("undefined");
					syncable.animationprocedure = animation;
				}
			}
			if (event.getEntity() instanceof GronckleBlueYellowMaleEntity syncable) {
				String animation = syncable.getSyncedAnimation();
				if (!animation.equals("undefined")) {
					syncable.setAnimation("undefined");
					syncable.animationprocedure = animation;
				}
			}
			if (event.getEntity() instanceof GronckleBlueYellowFemaleEntity syncable) {
				String animation = syncable.getSyncedAnimation();
				if (!animation.equals("undefined")) {
					syncable.setAnimation("undefined");
					syncable.animationprocedure = animation;
				}
			}
			if (event.getEntity() instanceof GroncklePinkMaleEntity syncable) {
				String animation = syncable.getSyncedAnimation();
				if (!animation.equals("undefined")) {
					syncable.setAnimation("undefined");
					syncable.animationprocedure = animation;
				}
			}
			if (event.getEntity() instanceof GroncklePinkFemaleEntity syncable) {
				String animation = syncable.getSyncedAnimation();
				if (!animation.equals("undefined")) {
					syncable.setAnimation("undefined");
					syncable.animationprocedure = animation;
				}
			}
			if (event.getEntity() instanceof GronckleOrangeRedMaleEntity syncable) {
				String animation = syncable.getSyncedAnimation();
				if (!animation.equals("undefined")) {
					syncable.setAnimation("undefined");
					syncable.animationprocedure = animation;
				}
			}
			if (event.getEntity() instanceof GronckleOrangeRedFemaleEntity syncable) {
				String animation = syncable.getSyncedAnimation();
				if (!animation.equals("undefined")) {
					syncable.setAnimation("undefined");
					syncable.animationprocedure = animation;
				}
			}
			if (event.getEntity() instanceof AdolescentMeatlugMaleEntity syncable) {
				String animation = syncable.getSyncedAnimation();
				if (!animation.equals("undefined")) {
					syncable.setAnimation("undefined");
					syncable.animationprocedure = animation;
				}
			}
			if (event.getEntity() instanceof AdolescentMeatlugFemaleEntity syncable) {
				String animation = syncable.getSyncedAnimation();
				if (!animation.equals("undefined")) {
					syncable.setAnimation("undefined");
					syncable.animationprocedure = animation;
				}
			}
			if (event.getEntity() instanceof AdolescentGronckleBlueYellowMaleEntity syncable) {
				String animation = syncable.getSyncedAnimation();
				if (!animation.equals("undefined")) {
					syncable.setAnimation("undefined");
					syncable.animationprocedure = animation;
				}
			}
			if (event.getEntity() instanceof AdolescentGronckleBlueYellowFemaleEntity syncable) {
				String animation = syncable.getSyncedAnimation();
				if (!animation.equals("undefined")) {
					syncable.setAnimation("undefined");
					syncable.animationprocedure = animation;
				}
			}
			if (event.getEntity() instanceof AdolescentGroncklePinkMaleEntity syncable) {
				String animation = syncable.getSyncedAnimation();
				if (!animation.equals("undefined")) {
					syncable.setAnimation("undefined");
					syncable.animationprocedure = animation;
				}
			}
			if (event.getEntity() instanceof AdolescentGroncklePinkFemaleEntity syncable) {
				String animation = syncable.getSyncedAnimation();
				if (!animation.equals("undefined")) {
					syncable.setAnimation("undefined");
					syncable.animationprocedure = animation;
				}
			}
			if (event.getEntity() instanceof AdolescentGronckleOrangeRedMaleEntity syncable) {
				String animation = syncable.getSyncedAnimation();
				if (!animation.equals("undefined")) {
					syncable.setAnimation("undefined");
					syncable.animationprocedure = animation;
				}
			}
			if (event.getEntity() instanceof AdolescentGronckleOrangeRedFemaleEntity syncable) {
				String animation = syncable.getSyncedAnimation();
				if (!animation.equals("undefined")) {
					syncable.setAnimation("undefined");
					syncable.animationprocedure = animation;
				}
			}
			if (event.getEntity() instanceof JuvenileMeatlugMaleEntity syncable) {
				String animation = syncable.getSyncedAnimation();
				if (!animation.equals("undefined")) {
					syncable.setAnimation("undefined");
					syncable.animationprocedure = animation;
				}
			}
			if (event.getEntity() instanceof JuvenileMeatlugFemaleEntity syncable) {
				String animation = syncable.getSyncedAnimation();
				if (!animation.equals("undefined")) {
					syncable.setAnimation("undefined");
					syncable.animationprocedure = animation;
				}
			}
			if (event.getEntity() instanceof JuvenileGronckleBlueYellowMaleEntity syncable) {
				String animation = syncable.getSyncedAnimation();
				if (!animation.equals("undefined")) {
					syncable.setAnimation("undefined");
					syncable.animationprocedure = animation;
				}
			}
			if (event.getEntity() instanceof JuvenileGronckleBlueYellowFemaleEntity syncable) {
				String animation = syncable.getSyncedAnimation();
				if (!animation.equals("undefined")) {
					syncable.setAnimation("undefined");
					syncable.animationprocedure = animation;
				}
			}
			if (event.getEntity() instanceof JuvenileGroncklePinkMaleEntity syncable) {
				String animation = syncable.getSyncedAnimation();
				if (!animation.equals("undefined")) {
					syncable.setAnimation("undefined");
					syncable.animationprocedure = animation;
				}
			}
			if (event.getEntity() instanceof JuvenileGroncklePinkFemaleEntity syncable) {
				String animation = syncable.getSyncedAnimation();
				if (!animation.equals("undefined")) {
					syncable.setAnimation("undefined");
					syncable.animationprocedure = animation;
				}
			}
			if (event.getEntity() instanceof JuvenileGronckleOrangeRedMaleEntity syncable) {
				String animation = syncable.getSyncedAnimation();
				if (!animation.equals("undefined")) {
					syncable.setAnimation("undefined");
					syncable.animationprocedure = animation;
				}
			}
			if (event.getEntity() instanceof JuvenileGronckleOrangeRedFemaleEntity syncable) {
				String animation = syncable.getSyncedAnimation();
				if (!animation.equals("undefined")) {
					syncable.setAnimation("undefined");
					syncable.animationprocedure = animation;
				}
			}
			if (event.getEntity() instanceof BabyMeatlugMaleEntity syncable) {
				String animation = syncable.getSyncedAnimation();
				if (!animation.equals("undefined")) {
					syncable.setAnimation("undefined");
					syncable.animationprocedure = animation;
				}
			}
			if (event.getEntity() instanceof BabyMeatlugFemaleEntity syncable) {
				String animation = syncable.getSyncedAnimation();
				if (!animation.equals("undefined")) {
					syncable.setAnimation("undefined");
					syncable.animationprocedure = animation;
				}
			}
			if (event.getEntity() instanceof BabyGronckleBlueYellowMaleEntity syncable) {
				String animation = syncable.getSyncedAnimation();
				if (!animation.equals("undefined")) {
					syncable.setAnimation("undefined");
					syncable.animationprocedure = animation;
				}
			}
			if (event.getEntity() instanceof BabyGronckleBlueYellowFemaleEntity syncable) {
				String animation = syncable.getSyncedAnimation();
				if (!animation.equals("undefined")) {
					syncable.setAnimation("undefined");
					syncable.animationprocedure = animation;
				}
			}
			if (event.getEntity() instanceof BabyGroncklePinkMaleEntity syncable) {
				String animation = syncable.getSyncedAnimation();
				if (!animation.equals("undefined")) {
					syncable.setAnimation("undefined");
					syncable.animationprocedure = animation;
				}
			}
			if (event.getEntity() instanceof BabyGroncklePinkFemaleEntity syncable) {
				String animation = syncable.getSyncedAnimation();
				if (!animation.equals("undefined")) {
					syncable.setAnimation("undefined");
					syncable.animationprocedure = animation;
				}
			}
			if (event.getEntity() instanceof BabyGronckleOrangeRedMaleEntity syncable) {
				String animation = syncable.getSyncedAnimation();
				if (!animation.equals("undefined")) {
					syncable.setAnimation("undefined");
					syncable.animationprocedure = animation;
				}
			}
			if (event.getEntity() instanceof BabyGronckleOrangeRedFemaleEntity syncable) {
				String animation = syncable.getSyncedAnimation();
				if (!animation.equals("undefined")) {
					syncable.setAnimation("undefined");
					syncable.animationprocedure = animation;
				}
			}
		}
	}
}
