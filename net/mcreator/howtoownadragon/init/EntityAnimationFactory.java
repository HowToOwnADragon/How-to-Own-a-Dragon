package net.mcreator.howtoownadragon.init;

import net.mcreator.howtoownadragon.entity.AdolescentGronckleFemaleEntity;
import net.mcreator.howtoownadragon.entity.AdolescentGronckleMaleEntity;
import net.mcreator.howtoownadragon.entity.AdolescentNadderFemaleEntity;
import net.mcreator.howtoownadragon.entity.AdolescentNadderMaleEntity;
import net.mcreator.howtoownadragon.entity.AdolescentTTFemaleEntity;
import net.mcreator.howtoownadragon.entity.AdolescentTTMaleEntity;
import net.mcreator.howtoownadragon.entity.BabyGronckleFemaleEntity;
import net.mcreator.howtoownadragon.entity.BabyGronckleMaleEntity;
import net.mcreator.howtoownadragon.entity.BabyNadderFemaleEntity;
import net.mcreator.howtoownadragon.entity.BabyNadderMaleEntity;
import net.mcreator.howtoownadragon.entity.BabyTTFemaleEntity;
import net.mcreator.howtoownadragon.entity.BabyTTMaleEntity;
import net.mcreator.howtoownadragon.entity.GronckleFemaleEntity;
import net.mcreator.howtoownadragon.entity.GronckleMaleEntity;
import net.mcreator.howtoownadragon.entity.JuvenileGronckleFemaleEntity;
import net.mcreator.howtoownadragon.entity.JuvenileGronckleMaleEntity;
import net.mcreator.howtoownadragon.entity.JuvenileNadderFemaleEntity;
import net.mcreator.howtoownadragon.entity.JuvenileNadderMaleEntity;
import net.mcreator.howtoownadragon.entity.JuvenileTTFemaleEntity;
import net.mcreator.howtoownadragon.entity.JuvenileTTMaleEntity;
import net.mcreator.howtoownadragon.entity.NadderEggEntityEntity;
import net.mcreator.howtoownadragon.entity.NadderFemaleEntity;
import net.mcreator.howtoownadragon.entity.NadderMaleEntity;
import net.mcreator.howtoownadragon.entity.NightFuryEntity;
import net.mcreator.howtoownadragon.entity.TTEggEntityEntity;
import net.mcreator.howtoownadragon.entity.TTFemaleEntity;
import net.mcreator.howtoownadragon.entity.TTMaleEntity;
import net.mcreator.howtoownadragon.entity.TTTestEntity;
import net.mcreator.howtoownadragon.entity.TestGronckleEntity;
import net.mcreator.howtoownadragon.entity.TestNadderEntity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraftforge.event.entity.living.LivingEvent.LivingTickEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;

@EventBusSubscriber
public class EntityAnimationFactory {
   @SubscribeEvent
   public static void onEntityTick(LivingTickEvent event) {
      if (event != null && event.getEntity() != null) {
         LivingEntity var2 = event.getEntity();
         String animation;
         if (var2 instanceof NightFuryEntity) {
            NightFuryEntity syncable = (NightFuryEntity)var2;
            animation = syncable.getSyncedAnimation();
            if (!animation.equals("undefined")) {
               syncable.setAnimation("undefined");
               syncable.animationprocedure = animation;
            }
         }

         var2 = event.getEntity();
         if (var2 instanceof GronckleMaleEntity) {
            GronckleMaleEntity syncable = (GronckleMaleEntity)var2;
            animation = syncable.getSyncedAnimation();
            if (!animation.equals("undefined")) {
               syncable.setAnimation("undefined");
               syncable.animationprocedure = animation;
            }
         }

         var2 = event.getEntity();
         if (var2 instanceof GronckleFemaleEntity) {
            GronckleFemaleEntity syncable = (GronckleFemaleEntity)var2;
            animation = syncable.getSyncedAnimation();
            if (!animation.equals("undefined")) {
               syncable.setAnimation("undefined");
               syncable.animationprocedure = animation;
            }
         }

         var2 = event.getEntity();
         if (var2 instanceof AdolescentGronckleMaleEntity) {
            AdolescentGronckleMaleEntity syncable = (AdolescentGronckleMaleEntity)var2;
            animation = syncable.getSyncedAnimation();
            if (!animation.equals("undefined")) {
               syncable.setAnimation("undefined");
               syncable.animationprocedure = animation;
            }
         }

         var2 = event.getEntity();
         if (var2 instanceof AdolescentGronckleFemaleEntity) {
            AdolescentGronckleFemaleEntity syncable = (AdolescentGronckleFemaleEntity)var2;
            animation = syncable.getSyncedAnimation();
            if (!animation.equals("undefined")) {
               syncable.setAnimation("undefined");
               syncable.animationprocedure = animation;
            }
         }

         var2 = event.getEntity();
         if (var2 instanceof JuvenileGronckleMaleEntity) {
            JuvenileGronckleMaleEntity syncable = (JuvenileGronckleMaleEntity)var2;
            animation = syncable.getSyncedAnimation();
            if (!animation.equals("undefined")) {
               syncable.setAnimation("undefined");
               syncable.animationprocedure = animation;
            }
         }

         var2 = event.getEntity();
         if (var2 instanceof JuvenileGronckleFemaleEntity) {
            JuvenileGronckleFemaleEntity syncable = (JuvenileGronckleFemaleEntity)var2;
            animation = syncable.getSyncedAnimation();
            if (!animation.equals("undefined")) {
               syncable.setAnimation("undefined");
               syncable.animationprocedure = animation;
            }
         }

         var2 = event.getEntity();
         if (var2 instanceof BabyGronckleMaleEntity) {
            BabyGronckleMaleEntity syncable = (BabyGronckleMaleEntity)var2;
            animation = syncable.getSyncedAnimation();
            if (!animation.equals("undefined")) {
               syncable.setAnimation("undefined");
               syncable.animationprocedure = animation;
            }
         }

         var2 = event.getEntity();
         if (var2 instanceof BabyGronckleFemaleEntity) {
            BabyGronckleFemaleEntity syncable = (BabyGronckleFemaleEntity)var2;
            animation = syncable.getSyncedAnimation();
            if (!animation.equals("undefined")) {
               syncable.setAnimation("undefined");
               syncable.animationprocedure = animation;
            }
         }

         var2 = event.getEntity();
         if (var2 instanceof TTMaleEntity) {
            TTMaleEntity syncable = (TTMaleEntity)var2;
            animation = syncable.getSyncedAnimation();
            if (!animation.equals("undefined")) {
               syncable.setAnimation("undefined");
               syncable.animationprocedure = animation;
            }
         }

         var2 = event.getEntity();
         if (var2 instanceof TestGronckleEntity) {
            TestGronckleEntity syncable = (TestGronckleEntity)var2;
            animation = syncable.getSyncedAnimation();
            if (!animation.equals("undefined")) {
               syncable.setAnimation("undefined");
               syncable.animationprocedure = animation;
            }
         }

         var2 = event.getEntity();
         if (var2 instanceof TTFemaleEntity) {
            TTFemaleEntity syncable = (TTFemaleEntity)var2;
            animation = syncable.getSyncedAnimation();
            if (!animation.equals("undefined")) {
               syncable.setAnimation("undefined");
               syncable.animationprocedure = animation;
            }
         }

         var2 = event.getEntity();
         if (var2 instanceof TTTestEntity) {
            TTTestEntity syncable = (TTTestEntity)var2;
            animation = syncable.getSyncedAnimation();
            if (!animation.equals("undefined")) {
               syncable.setAnimation("undefined");
               syncable.animationprocedure = animation;
            }
         }

         var2 = event.getEntity();
         if (var2 instanceof BabyTTFemaleEntity) {
            BabyTTFemaleEntity syncable = (BabyTTFemaleEntity)var2;
            animation = syncable.getSyncedAnimation();
            if (!animation.equals("undefined")) {
               syncable.setAnimation("undefined");
               syncable.animationprocedure = animation;
            }
         }

         var2 = event.getEntity();
         if (var2 instanceof JuvenileTTFemaleEntity) {
            JuvenileTTFemaleEntity syncable = (JuvenileTTFemaleEntity)var2;
            animation = syncable.getSyncedAnimation();
            if (!animation.equals("undefined")) {
               syncable.setAnimation("undefined");
               syncable.animationprocedure = animation;
            }
         }

         var2 = event.getEntity();
         if (var2 instanceof AdolescentTTFemaleEntity) {
            AdolescentTTFemaleEntity syncable = (AdolescentTTFemaleEntity)var2;
            animation = syncable.getSyncedAnimation();
            if (!animation.equals("undefined")) {
               syncable.setAnimation("undefined");
               syncable.animationprocedure = animation;
            }
         }

         var2 = event.getEntity();
         if (var2 instanceof BabyTTMaleEntity) {
            BabyTTMaleEntity syncable = (BabyTTMaleEntity)var2;
            animation = syncable.getSyncedAnimation();
            if (!animation.equals("undefined")) {
               syncable.setAnimation("undefined");
               syncable.animationprocedure = animation;
            }
         }

         var2 = event.getEntity();
         if (var2 instanceof JuvenileTTMaleEntity) {
            JuvenileTTMaleEntity syncable = (JuvenileTTMaleEntity)var2;
            animation = syncable.getSyncedAnimation();
            if (!animation.equals("undefined")) {
               syncable.setAnimation("undefined");
               syncable.animationprocedure = animation;
            }
         }

         var2 = event.getEntity();
         if (var2 instanceof AdolescentTTMaleEntity) {
            AdolescentTTMaleEntity syncable = (AdolescentTTMaleEntity)var2;
            animation = syncable.getSyncedAnimation();
            if (!animation.equals("undefined")) {
               syncable.setAnimation("undefined");
               syncable.animationprocedure = animation;
            }
         }

         var2 = event.getEntity();
         if (var2 instanceof TTEggEntityEntity) {
            TTEggEntityEntity syncable = (TTEggEntityEntity)var2;
            animation = syncable.getSyncedAnimation();
            if (!animation.equals("undefined")) {
               syncable.setAnimation("undefined");
               syncable.animationprocedure = animation;
            }
         }

         var2 = event.getEntity();
         if (var2 instanceof NadderMaleEntity) {
            NadderMaleEntity syncable = (NadderMaleEntity)var2;
            animation = syncable.getSyncedAnimation();
            if (!animation.equals("undefined")) {
               syncable.setAnimation("undefined");
               syncable.animationprocedure = animation;
            }
         }

         var2 = event.getEntity();
         if (var2 instanceof TestNadderEntity) {
            TestNadderEntity syncable = (TestNadderEntity)var2;
            animation = syncable.getSyncedAnimation();
            if (!animation.equals("undefined")) {
               syncable.setAnimation("undefined");
               syncable.animationprocedure = animation;
            }
         }

         var2 = event.getEntity();
         if (var2 instanceof NadderFemaleEntity) {
            NadderFemaleEntity syncable = (NadderFemaleEntity)var2;
            animation = syncable.getSyncedAnimation();
            if (!animation.equals("undefined")) {
               syncable.setAnimation("undefined");
               syncable.animationprocedure = animation;
            }
         }

         var2 = event.getEntity();
         if (var2 instanceof BabyNadderFemaleEntity) {
            BabyNadderFemaleEntity syncable = (BabyNadderFemaleEntity)var2;
            animation = syncable.getSyncedAnimation();
            if (!animation.equals("undefined")) {
               syncable.setAnimation("undefined");
               syncable.animationprocedure = animation;
            }
         }

         var2 = event.getEntity();
         if (var2 instanceof BabyNadderMaleEntity) {
            BabyNadderMaleEntity syncable = (BabyNadderMaleEntity)var2;
            animation = syncable.getSyncedAnimation();
            if (!animation.equals("undefined")) {
               syncable.setAnimation("undefined");
               syncable.animationprocedure = animation;
            }
         }

         var2 = event.getEntity();
         if (var2 instanceof JuvenileNadderMaleEntity) {
            JuvenileNadderMaleEntity syncable = (JuvenileNadderMaleEntity)var2;
            animation = syncable.getSyncedAnimation();
            if (!animation.equals("undefined")) {
               syncable.setAnimation("undefined");
               syncable.animationprocedure = animation;
            }
         }

         var2 = event.getEntity();
         if (var2 instanceof JuvenileNadderFemaleEntity) {
            JuvenileNadderFemaleEntity syncable = (JuvenileNadderFemaleEntity)var2;
            animation = syncable.getSyncedAnimation();
            if (!animation.equals("undefined")) {
               syncable.setAnimation("undefined");
               syncable.animationprocedure = animation;
            }
         }

         var2 = event.getEntity();
         if (var2 instanceof AdolescentNadderFemaleEntity) {
            AdolescentNadderFemaleEntity syncable = (AdolescentNadderFemaleEntity)var2;
            animation = syncable.getSyncedAnimation();
            if (!animation.equals("undefined")) {
               syncable.setAnimation("undefined");
               syncable.animationprocedure = animation;
            }
         }

         var2 = event.getEntity();
         if (var2 instanceof AdolescentNadderMaleEntity) {
            AdolescentNadderMaleEntity syncable = (AdolescentNadderMaleEntity)var2;
            animation = syncable.getSyncedAnimation();
            if (!animation.equals("undefined")) {
               syncable.setAnimation("undefined");
               syncable.animationprocedure = animation;
            }
         }

         var2 = event.getEntity();
         if (var2 instanceof NadderEggEntityEntity) {
            NadderEggEntityEntity syncable = (NadderEggEntityEntity)var2;
            animation = syncable.getSyncedAnimation();
            if (!animation.equals("undefined")) {
               syncable.setAnimation("undefined");
               syncable.animationprocedure = animation;
            }
         }
      }

   }
}
