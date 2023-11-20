package net.mcreator.howtoownadragon.procedures;

import javax.annotation.Nullable;
import net.mcreator.howtoownadragon.HowToOwnADragonMod;
import net.mcreator.howtoownadragon.entity.AdolescentGronckleFemaleEntity;
import net.mcreator.howtoownadragon.entity.AdolescentGronckleMaleEntity;
import net.mcreator.howtoownadragon.entity.BabyGronckleFemaleEntity;
import net.mcreator.howtoownadragon.entity.BabyGronckleMaleEntity;
import net.mcreator.howtoownadragon.entity.GronckleFemaleEntity;
import net.mcreator.howtoownadragon.entity.GronckleMaleEntity;
import net.mcreator.howtoownadragon.entity.JuvenileGronckleFemaleEntity;
import net.mcreator.howtoownadragon.entity.JuvenileGronckleMaleEntity;
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
public class GronckleColorLoadWorldProcedure {
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
            if (entity.m_6095_().m_204039_(TagKey.m_203882_(Registries.f_256939_, new ResourceLocation("how_to_own_a_dragon:gronckles"))) && !entity.getPersistentData().m_128471_("groncklesaddle")) {
               if (entity instanceof BabyGronckleMaleEntity) {
                  BabyGronckleMaleEntity animatablex;
                  if (entity.getPersistentData().m_128461_("groncklecolor").equals("pink")) {
                     if (entity instanceof BabyGronckleMaleEntity) {
                        animatablex = (BabyGronckleMaleEntity)entity;
                        animatablex.setTexture("babygroncklepink");
                     }
                  } else if (entity.getPersistentData().m_128461_("groncklecolor").equals("meatlug")) {
                     if (entity instanceof BabyGronckleMaleEntity) {
                        animatablex = (BabyGronckleMaleEntity)entity;
                        animatablex.setTexture("babymeatlug");
                     }
                  } else if (entity.getPersistentData().m_128461_("groncklecolor").equals("orangered")) {
                     if (entity instanceof BabyGronckleMaleEntity) {
                        animatablex = (BabyGronckleMaleEntity)entity;
                        animatablex.setTexture("babygronckleorange");
                     }
                  } else if (entity.getPersistentData().m_128461_("groncklecolor").equals("blueyellow") && entity instanceof BabyGronckleMaleEntity) {
                     animatablex = (BabyGronckleMaleEntity)entity;
                     animatablex.setTexture("babygroncleblue");
                  }
               } else if (entity instanceof BabyGronckleFemaleEntity) {
                  BabyGronckleFemaleEntity animatablexxx;
                  if (entity.getPersistentData().m_128461_("groncklecolor").equals("pink")) {
                     if (entity instanceof BabyGronckleFemaleEntity) {
                        animatablexxx = (BabyGronckleFemaleEntity)entity;
                        animatablexxx.setTexture("babygroncklepink");
                     }
                  } else if (entity.getPersistentData().m_128461_("groncklecolor").equals("meatlug")) {
                     if (entity instanceof BabyGronckleFemaleEntity) {
                        animatablexxx = (BabyGronckleFemaleEntity)entity;
                        animatablexxx.setTexture("babymeatlug");
                     }
                  } else if (entity.getPersistentData().m_128461_("groncklecolor").equals("orangered")) {
                     if (entity instanceof BabyGronckleFemaleEntity) {
                        animatablexxx = (BabyGronckleFemaleEntity)entity;
                        animatablexxx.setTexture("babygronckleorange");
                     }
                  } else if (entity.getPersistentData().m_128461_("groncklecolor").equals("blueyellow") && entity instanceof BabyGronckleFemaleEntity) {
                     animatablexxx = (BabyGronckleFemaleEntity)entity;
                     animatablexxx.setTexture("babygroncleblue");
                  }
               } else if (entity instanceof JuvenileGronckleMaleEntity) {
                  JuvenileGronckleMaleEntity animatablexxxxx;
                  if (entity.getPersistentData().m_128461_("groncklecolor").equals("pink")) {
                     if (entity instanceof JuvenileGronckleMaleEntity) {
                        animatablexxxxx = (JuvenileGronckleMaleEntity)entity;
                        animatablexxxxx.setTexture("juvigroncklepink");
                     }
                  } else if (entity.getPersistentData().m_128461_("groncklecolor").equals("meatlug")) {
                     if (entity instanceof JuvenileGronckleMaleEntity) {
                        animatablexxxxx = (JuvenileGronckleMaleEntity)entity;
                        animatablexxxxx.setTexture("juvimeatlug");
                     }
                  } else if (entity.getPersistentData().m_128461_("groncklecolor").equals("orangered")) {
                     if (entity instanceof JuvenileGronckleMaleEntity) {
                        animatablexxxxx = (JuvenileGronckleMaleEntity)entity;
                        animatablexxxxx.setTexture("juvigronckleorangered");
                     }
                  } else if (entity.getPersistentData().m_128461_("groncklecolor").equals("blueyellow") && entity instanceof JuvenileGronckleMaleEntity) {
                     animatablexxxxx = (JuvenileGronckleMaleEntity)entity;
                     animatablexxxxx.setTexture("juvigronckleblueyellow");
                  }
               } else if (entity instanceof JuvenileGronckleFemaleEntity) {
                  JuvenileGronckleFemaleEntity animatablexxxxxx;
                  if (entity.getPersistentData().m_128461_("groncklecolor").equals("pink")) {
                     if (entity instanceof JuvenileGronckleFemaleEntity) {
                        animatablexxxxxx = (JuvenileGronckleFemaleEntity)entity;
                        animatablexxxxxx.setTexture("juvigroncklepink");
                     }
                  } else if (entity.getPersistentData().m_128461_("groncklecolor").equals("meatlug")) {
                     if (entity instanceof JuvenileGronckleFemaleEntity) {
                        animatablexxxxxx = (JuvenileGronckleFemaleEntity)entity;
                        animatablexxxxxx.setTexture("juvimeatlug");
                     }
                  } else if (entity.getPersistentData().m_128461_("groncklecolor").equals("orangered")) {
                     if (entity instanceof JuvenileGronckleFemaleEntity) {
                        animatablexxxxxx = (JuvenileGronckleFemaleEntity)entity;
                        animatablexxxxxx.setTexture("juvigronckleorangered");
                     }
                  } else if (entity.getPersistentData().m_128461_("groncklecolor").equals("blueyellow") && entity instanceof JuvenileGronckleFemaleEntity) {
                     animatablexxxxxx = (JuvenileGronckleFemaleEntity)entity;
                     animatablexxxxxx.setTexture("juvigronckleblueyellow");
                  }
               } else if (entity instanceof AdolescentGronckleMaleEntity) {
                  AdolescentGronckleMaleEntity animatablexxxxxxx;
                  if (entity.getPersistentData().m_128461_("groncklecolor").equals("pink")) {
                     if (entity instanceof AdolescentGronckleMaleEntity) {
                        animatablexxxxxxx = (AdolescentGronckleMaleEntity)entity;
                        animatablexxxxxxx.setTexture("adogroncklepink");
                     }
                  } else if (entity.getPersistentData().m_128461_("groncklecolor").equals("meatlug")) {
                     if (entity instanceof AdolescentGronckleMaleEntity) {
                        animatablexxxxxxx = (AdolescentGronckleMaleEntity)entity;
                        animatablexxxxxxx.setTexture("adomeatlug");
                     }
                  } else if (entity.getPersistentData().m_128461_("groncklecolor").equals("orangered")) {
                     if (entity instanceof AdolescentGronckleMaleEntity) {
                        animatablexxxxxxx = (AdolescentGronckleMaleEntity)entity;
                        animatablexxxxxxx.setTexture("adogronckleorangered");
                     }
                  } else if (entity.getPersistentData().m_128461_("groncklecolor").equals("blueyellow") && entity instanceof AdolescentGronckleMaleEntity) {
                     animatablexxxxxxx = (AdolescentGronckleMaleEntity)entity;
                     animatablexxxxxxx.setTexture("adogronckleblueyellow");
                  }
               } else if (entity instanceof AdolescentGronckleFemaleEntity) {
                  AdolescentGronckleFemaleEntity animatable;
                  if (entity.getPersistentData().m_128461_("groncklecolor").equals("pink")) {
                     if (entity instanceof AdolescentGronckleFemaleEntity) {
                        animatable = (AdolescentGronckleFemaleEntity)entity;
                        animatable.setTexture("adogroncklepink");
                     }
                  } else if (entity.getPersistentData().m_128461_("groncklecolor").equals("meatlug")) {
                     if (entity instanceof AdolescentGronckleFemaleEntity) {
                        animatable = (AdolescentGronckleFemaleEntity)entity;
                        animatable.setTexture("adomeatlug");
                     }
                  } else if (entity.getPersistentData().m_128461_("groncklecolor").equals("orangered")) {
                     if (entity instanceof AdolescentGronckleFemaleEntity) {
                        animatable = (AdolescentGronckleFemaleEntity)entity;
                        animatable.setTexture("adogronckleorangered");
                     }
                  } else if (entity.getPersistentData().m_128461_("groncklecolor").equals("blueyellow") && entity instanceof AdolescentGronckleFemaleEntity) {
                     animatable = (AdolescentGronckleFemaleEntity)entity;
                     animatable.setTexture("adogronckleblueyellow");
                  }
               } else if (entity instanceof GronckleMaleEntity) {
                  GronckleMaleEntity animatablexx;
                  if (entity.getPersistentData().m_128461_("groncklecolor").equals("pink")) {
                     if (entity instanceof GronckleMaleEntity) {
                        animatablexx = (GronckleMaleEntity)entity;
                        animatablexx.setTexture("groncklepink");
                     }
                  } else if (entity.getPersistentData().m_128461_("groncklecolor").equals("meatlug")) {
                     if (entity instanceof GronckleMaleEntity) {
                        animatablexx = (GronckleMaleEntity)entity;
                        animatablexx.setTexture("meatlug");
                     }
                  } else if (entity.getPersistentData().m_128461_("groncklecolor").equals("orangered")) {
                     if (entity instanceof GronckleMaleEntity) {
                        animatablexx = (GronckleMaleEntity)entity;
                        animatablexx.setTexture("gronckleorangered");
                     }
                  } else if (entity.getPersistentData().m_128461_("groncklecolor").equals("blueyellow") && entity instanceof GronckleMaleEntity) {
                     animatablexx = (GronckleMaleEntity)entity;
                     animatablexx.setTexture("gronckleblueyellow");
                  }
               } else if (entity instanceof GronckleFemaleEntity) {
                  GronckleFemaleEntity animatablexxxx;
                  if (entity.getPersistentData().m_128461_("groncklecolor").equals("pink")) {
                     if (entity instanceof GronckleFemaleEntity) {
                        animatablexxxx = (GronckleFemaleEntity)entity;
                        animatablexxxx.setTexture("groncklepink");
                     }
                  } else if (entity.getPersistentData().m_128461_("groncklecolor").equals("meatlug")) {
                     if (entity instanceof GronckleFemaleEntity) {
                        animatablexxxx = (GronckleFemaleEntity)entity;
                        animatablexxxx.setTexture("meatlug");
                     }
                  } else if (entity.getPersistentData().m_128461_("groncklecolor").equals("orangered")) {
                     if (entity instanceof GronckleFemaleEntity) {
                        animatablexxxx = (GronckleFemaleEntity)entity;
                        animatablexxxx.setTexture("gronckleorangered");
                     }
                  } else if (entity.getPersistentData().m_128461_("groncklecolor").equals("blueyellow") && entity instanceof GronckleFemaleEntity) {
                     animatablexxxx = (GronckleFemaleEntity)entity;
                     animatablexxxx.setTexture("gronckleblueyellow");
                  }
               }
            }

         });
      }
   }
}
