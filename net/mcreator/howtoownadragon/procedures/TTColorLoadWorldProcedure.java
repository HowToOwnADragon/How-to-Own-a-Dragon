package net.mcreator.howtoownadragon.procedures;

import javax.annotation.Nullable;
import net.mcreator.howtoownadragon.HowToOwnADragonMod;
import net.mcreator.howtoownadragon.entity.AdolescentTTFemaleEntity;
import net.mcreator.howtoownadragon.entity.AdolescentTTMaleEntity;
import net.mcreator.howtoownadragon.entity.BabyTTFemaleEntity;
import net.mcreator.howtoownadragon.entity.BabyTTMaleEntity;
import net.mcreator.howtoownadragon.entity.JuvenileTTFemaleEntity;
import net.mcreator.howtoownadragon.entity.JuvenileTTMaleEntity;
import net.mcreator.howtoownadragon.entity.TTFemaleEntity;
import net.mcreator.howtoownadragon.entity.TTMaleEntity;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.level.LevelAccessor;
import net.minecraftforge.event.entity.EntityJoinLevelEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;

@EventBusSubscriber
public class TTColorLoadWorldProcedure {
   @SubscribeEvent
   public static void onEntitySpawned(EntityJoinLevelEvent event) {
      execute(event, event.getLevel(), event.getEntity());
   }

   public static void execute(LevelAccessor world, Entity entity) {
      execute((Event)null, world, entity);
   }

   private static void execute(@Nullable Event event, LevelAccessor world, Entity entity) {
      if (entity != null) {
         HowToOwnADragonMod.queueServerWork(2, () -> {
            if (entity.m_6095_().m_204039_(TagKey.m_203882_(Registries.f_256939_, new ResourceLocation("how_to_own_a_dragon:tt")))) {
               if (entity instanceof BabyTTMaleEntity) {
                  BabyTTMaleEntity animatablex;
                  if (entity.getPersistentData().m_128461_("ttcolor").equals("green")) {
                     if (entity instanceof BabyTTMaleEntity) {
                        animatablex = (BabyTTMaleEntity)entity;
                        animatablex.setTexture("greentt");
                     }
                  } else if (entity.getPersistentData().m_128461_("ttcolor").equals("pink")) {
                     if (entity instanceof BabyTTMaleEntity) {
                        animatablex = (BabyTTMaleEntity)entity;
                        animatablex.setTexture("pinktt");
                     }
                  } else if (entity.getPersistentData().m_128461_("ttcolor").equals("turq") && entity instanceof BabyTTMaleEntity) {
                     animatablex = (BabyTTMaleEntity)entity;
                     animatablex.setTexture("turqtt");
                  }
               } else if (entity instanceof BabyTTFemaleEntity) {
                  BabyTTFemaleEntity animatablexxx;
                  if (entity.getPersistentData().m_128461_("ttcolor").equals("green")) {
                     if (entity instanceof BabyTTFemaleEntity) {
                        animatablexxx = (BabyTTFemaleEntity)entity;
                        animatablexxx.setTexture("greentt");
                     }
                  } else if (entity.getPersistentData().m_128461_("ttcolor").equals("pink")) {
                     if (entity instanceof BabyTTFemaleEntity) {
                        animatablexxx = (BabyTTFemaleEntity)entity;
                        animatablexxx.setTexture("pinktt");
                     }
                  } else if (entity.getPersistentData().m_128461_("ttcolor").equals("turq") && entity instanceof BabyTTFemaleEntity) {
                     animatablexxx = (BabyTTFemaleEntity)entity;
                     animatablexxx.setTexture("turqtt");
                  }
               } else if (entity instanceof JuvenileTTMaleEntity) {
                  JuvenileTTMaleEntity animatablexxxxx;
                  if (entity.getPersistentData().m_128461_("ttcolor").equals("green")) {
                     if (entity instanceof JuvenileTTMaleEntity) {
                        animatablexxxxx = (JuvenileTTMaleEntity)entity;
                        animatablexxxxx.setTexture("greentt");
                     }
                  } else if (entity.getPersistentData().m_128461_("ttcolor").equals("pink")) {
                     if (entity instanceof JuvenileTTMaleEntity) {
                        animatablexxxxx = (JuvenileTTMaleEntity)entity;
                        animatablexxxxx.setTexture("pinktt");
                     }
                  } else if (entity.getPersistentData().m_128461_("ttcolor").equals("turq") && entity instanceof JuvenileTTMaleEntity) {
                     animatablexxxxx = (JuvenileTTMaleEntity)entity;
                     animatablexxxxx.setTexture("turqtt");
                  }
               } else if (entity instanceof JuvenileTTFemaleEntity) {
                  JuvenileTTFemaleEntity animatablexxxxxx;
                  if (entity.getPersistentData().m_128461_("ttcolor").equals("green")) {
                     if (entity instanceof JuvenileTTFemaleEntity) {
                        animatablexxxxxx = (JuvenileTTFemaleEntity)entity;
                        animatablexxxxxx.setTexture("greentt");
                     }
                  } else if (entity.getPersistentData().m_128461_("ttcolor").equals("pink")) {
                     if (entity instanceof JuvenileTTFemaleEntity) {
                        animatablexxxxxx = (JuvenileTTFemaleEntity)entity;
                        animatablexxxxxx.setTexture("pinktt");
                     }
                  } else if (entity.getPersistentData().m_128461_("ttcolor").equals("turq") && entity instanceof JuvenileTTFemaleEntity) {
                     animatablexxxxxx = (JuvenileTTFemaleEntity)entity;
                     animatablexxxxxx.setTexture("turqtt");
                  }
               } else if (entity instanceof AdolescentTTMaleEntity) {
                  AdolescentTTMaleEntity animatablexxxxxxx;
                  if (entity.getPersistentData().m_128461_("ttcolor").equals("green")) {
                     if (entity instanceof AdolescentTTMaleEntity) {
                        animatablexxxxxxx = (AdolescentTTMaleEntity)entity;
                        animatablexxxxxxx.setTexture("greentt");
                     }
                  } else if (entity.getPersistentData().m_128461_("ttcolor").equals("pink")) {
                     if (entity instanceof AdolescentTTMaleEntity) {
                        animatablexxxxxxx = (AdolescentTTMaleEntity)entity;
                        animatablexxxxxxx.setTexture("pinktt");
                     }
                  } else if (entity.getPersistentData().m_128461_("ttcolor").equals("turq") && entity instanceof AdolescentTTMaleEntity) {
                     animatablexxxxxxx = (AdolescentTTMaleEntity)entity;
                     animatablexxxxxxx.setTexture("turqtt");
                  }
               } else if (entity instanceof AdolescentTTFemaleEntity) {
                  AdolescentTTFemaleEntity animatable;
                  if (entity.getPersistentData().m_128461_("ttcolor").equals("green")) {
                     if (entity instanceof AdolescentTTFemaleEntity) {
                        animatable = (AdolescentTTFemaleEntity)entity;
                        animatable.setTexture("greentt");
                     }
                  } else if (entity.getPersistentData().m_128461_("ttcolor").equals("pink")) {
                     if (entity instanceof AdolescentTTFemaleEntity) {
                        animatable = (AdolescentTTFemaleEntity)entity;
                        animatable.setTexture("pinktt");
                     }
                  } else if (entity.getPersistentData().m_128461_("ttcolor").equals("turq") && entity instanceof AdolescentTTFemaleEntity) {
                     animatable = (AdolescentTTFemaleEntity)entity;
                     animatable.setTexture("turqtt");
                  }
               } else if (entity instanceof TTMaleEntity) {
                  TTMaleEntity animatablexx;
                  if (entity.getPersistentData().m_128461_("ttcolor").equals("green")) {
                     if (entity instanceof TTMaleEntity) {
                        animatablexx = (TTMaleEntity)entity;
                        animatablexx.setTexture("greentt");
                     }
                  } else if (entity.getPersistentData().m_128461_("ttcolor").equals("pink")) {
                     if (entity instanceof TTMaleEntity) {
                        animatablexx = (TTMaleEntity)entity;
                        animatablexx.setTexture("pinktt");
                     }
                  } else if (entity.getPersistentData().m_128461_("ttcolor").equals("turq") && entity instanceof TTMaleEntity) {
                     animatablexx = (TTMaleEntity)entity;
                     animatablexx.setTexture("turqtt");
                  }
               } else if (entity instanceof TTFemaleEntity) {
                  TTFemaleEntity animatablexxxx;
                  if (entity.getPersistentData().m_128461_("ttcolor").equals("green")) {
                     if (entity instanceof TTFemaleEntity) {
                        animatablexxxx = (TTFemaleEntity)entity;
                        animatablexxxx.setTexture("greentt");
                     }
                  } else if (entity.getPersistentData().m_128461_("ttcolor").equals("pink")) {
                     if (entity instanceof TTFemaleEntity) {
                        animatablexxxx = (TTFemaleEntity)entity;
                        animatablexxxx.setTexture("pinktt");
                     }
                  } else if (entity.getPersistentData().m_128461_("ttcolor").equals("turq") && entity instanceof TTFemaleEntity) {
                     animatablexxxx = (TTFemaleEntity)entity;
                     animatablexxxx.setTexture("turqtt");
                  }
               }
            }

         });
      }
   }
}
