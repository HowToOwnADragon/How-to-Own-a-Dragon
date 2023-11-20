package net.mcreator.howtoownadragon.procedures;

import javax.annotation.Nullable;
import net.mcreator.howtoownadragon.HowToOwnADragonMod;
import net.mcreator.howtoownadragon.entity.AdolescentNadderFemaleEntity;
import net.mcreator.howtoownadragon.entity.AdolescentNadderMaleEntity;
import net.mcreator.howtoownadragon.entity.BabyNadderFemaleEntity;
import net.mcreator.howtoownadragon.entity.BabyNadderMaleEntity;
import net.mcreator.howtoownadragon.entity.JuvenileNadderFemaleEntity;
import net.mcreator.howtoownadragon.entity.JuvenileNadderMaleEntity;
import net.mcreator.howtoownadragon.entity.NadderFemaleEntity;
import net.mcreator.howtoownadragon.entity.NadderMaleEntity;
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
public class NadderColorLoadWorldProcedure {
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
            if (entity.m_6095_().m_204039_(TagKey.m_203882_(Registries.f_256939_, new ResourceLocation("how_to_own_a_dragon:nadder")))) {
               if (entity instanceof BabyNadderMaleEntity) {
                  BabyNadderMaleEntity animatablex;
                  if (entity.getPersistentData().m_128461_("naddercolor").equals("stormfly")) {
                     if (entity instanceof BabyNadderMaleEntity) {
                        animatablex = (BabyNadderMaleEntity)entity;
                        animatablex.setTexture("stormfly");
                     }
                  } else if (entity.getPersistentData().m_128461_("naddercolor").equals("red")) {
                     if (entity instanceof BabyNadderMaleEntity) {
                        animatablex = (BabyNadderMaleEntity)entity;
                        animatablex.setTexture("rednadder");
                     }
                  } else if (entity.getPersistentData().m_128461_("naddercolor").equals("purple") && entity instanceof BabyNadderMaleEntity) {
                     animatablex = (BabyNadderMaleEntity)entity;
                     animatablex.setTexture("purplenadder");
                  }
               } else if (entity instanceof BabyNadderFemaleEntity) {
                  BabyNadderFemaleEntity animatablexxx;
                  if (entity.getPersistentData().m_128461_("naddercolor").equals("stormfly")) {
                     if (entity instanceof BabyNadderFemaleEntity) {
                        animatablexxx = (BabyNadderFemaleEntity)entity;
                        animatablexxx.setTexture("stormfly");
                     }
                  } else if (entity.getPersistentData().m_128461_("naddercolor").equals("red")) {
                     if (entity instanceof BabyNadderFemaleEntity) {
                        animatablexxx = (BabyNadderFemaleEntity)entity;
                        animatablexxx.setTexture("rednadder");
                     }
                  } else if (entity.getPersistentData().m_128461_("naddercolor").equals("purple") && entity instanceof BabyNadderFemaleEntity) {
                     animatablexxx = (BabyNadderFemaleEntity)entity;
                     animatablexxx.setTexture("purplenadder");
                  }
               } else if (entity instanceof JuvenileNadderMaleEntity) {
                  JuvenileNadderMaleEntity animatablexxxxx;
                  if (entity.getPersistentData().m_128461_("naddercolor").equals("stormfly")) {
                     if (entity instanceof JuvenileNadderMaleEntity) {
                        animatablexxxxx = (JuvenileNadderMaleEntity)entity;
                        animatablexxxxx.setTexture("stormfly");
                     }
                  } else if (entity.getPersistentData().m_128461_("naddercolor").equals("red")) {
                     if (entity instanceof JuvenileNadderMaleEntity) {
                        animatablexxxxx = (JuvenileNadderMaleEntity)entity;
                        animatablexxxxx.setTexture("rednadder");
                     }
                  } else if (entity.getPersistentData().m_128461_("naddercolor").equals("purple") && entity instanceof JuvenileNadderMaleEntity) {
                     animatablexxxxx = (JuvenileNadderMaleEntity)entity;
                     animatablexxxxx.setTexture("purplenadder");
                  }
               } else if (entity instanceof JuvenileNadderFemaleEntity) {
                  JuvenileNadderFemaleEntity animatablexxxxxx;
                  if (entity.getPersistentData().m_128461_("naddercolor").equals("stormfly")) {
                     if (entity instanceof JuvenileNadderFemaleEntity) {
                        animatablexxxxxx = (JuvenileNadderFemaleEntity)entity;
                        animatablexxxxxx.setTexture("stormfly");
                     }
                  } else if (entity.getPersistentData().m_128461_("naddercolor").equals("red")) {
                     if (entity instanceof JuvenileNadderFemaleEntity) {
                        animatablexxxxxx = (JuvenileNadderFemaleEntity)entity;
                        animatablexxxxxx.setTexture("rednadder");
                     }
                  } else if (entity.getPersistentData().m_128461_("naddercolor").equals("purple") && entity instanceof JuvenileNadderFemaleEntity) {
                     animatablexxxxxx = (JuvenileNadderFemaleEntity)entity;
                     animatablexxxxxx.setTexture("purplenadder");
                  }
               } else if (entity instanceof AdolescentNadderMaleEntity) {
                  AdolescentNadderMaleEntity animatablexxxxxxx;
                  if (entity.getPersistentData().m_128461_("naddercolor").equals("stormfly")) {
                     if (entity instanceof AdolescentNadderMaleEntity) {
                        animatablexxxxxxx = (AdolescentNadderMaleEntity)entity;
                        animatablexxxxxxx.setTexture("stormfly");
                     }
                  } else if (entity.getPersistentData().m_128461_("naddercolor").equals("red")) {
                     if (entity instanceof AdolescentNadderMaleEntity) {
                        animatablexxxxxxx = (AdolescentNadderMaleEntity)entity;
                        animatablexxxxxxx.setTexture("rednadder");
                     }
                  } else if (entity.getPersistentData().m_128461_("naddercolor").equals("purple") && entity instanceof AdolescentNadderMaleEntity) {
                     animatablexxxxxxx = (AdolescentNadderMaleEntity)entity;
                     animatablexxxxxxx.setTexture("purplenadder");
                  }
               } else if (entity instanceof AdolescentNadderFemaleEntity) {
                  AdolescentNadderFemaleEntity animatable;
                  if (entity.getPersistentData().m_128461_("naddercolor").equals("stormfly")) {
                     if (entity instanceof AdolescentNadderFemaleEntity) {
                        animatable = (AdolescentNadderFemaleEntity)entity;
                        animatable.setTexture("stormfly");
                     }
                  } else if (entity.getPersistentData().m_128461_("naddercolor").equals("red")) {
                     if (entity instanceof AdolescentNadderFemaleEntity) {
                        animatable = (AdolescentNadderFemaleEntity)entity;
                        animatable.setTexture("rednadder");
                     }
                  } else if (entity.getPersistentData().m_128461_("naddercolor").equals("purple") && entity instanceof AdolescentNadderFemaleEntity) {
                     animatable = (AdolescentNadderFemaleEntity)entity;
                     animatable.setTexture("purplenadder");
                  }
               } else if (entity instanceof NadderMaleEntity) {
                  NadderMaleEntity animatablexx;
                  if (entity.getPersistentData().m_128461_("naddercolor").equals("stormfly")) {
                     if (entity instanceof NadderMaleEntity) {
                        animatablexx = (NadderMaleEntity)entity;
                        animatablexx.setTexture("stormfly");
                     }
                  } else if (entity.getPersistentData().m_128461_("naddercolor").equals("red")) {
                     if (entity instanceof NadderMaleEntity) {
                        animatablexx = (NadderMaleEntity)entity;
                        animatablexx.setTexture("rednadder");
                     }
                  } else if (entity.getPersistentData().m_128461_("naddercolor").equals("purple") && entity instanceof NadderMaleEntity) {
                     animatablexx = (NadderMaleEntity)entity;
                     animatablexx.setTexture("purplenadder");
                  }
               } else if (entity instanceof NadderFemaleEntity) {
                  NadderFemaleEntity animatablexxxx;
                  if (entity.getPersistentData().m_128461_("naddercolor").equals("stormfly")) {
                     if (entity instanceof NadderFemaleEntity) {
                        animatablexxxx = (NadderFemaleEntity)entity;
                        animatablexxxx.setTexture("stormfly");
                     }
                  } else if (entity.getPersistentData().m_128461_("naddercolor").equals("red")) {
                     if (entity instanceof NadderFemaleEntity) {
                        animatablexxxx = (NadderFemaleEntity)entity;
                        animatablexxxx.setTexture("rednadder");
                     }
                  } else if (entity.getPersistentData().m_128461_("naddercolor").equals("purple") && entity instanceof NadderFemaleEntity) {
                     animatablexxxx = (NadderFemaleEntity)entity;
                     animatablexxxx.setTexture("purplenadder");
                  }
               }
            }

         });
      }
   }
}
