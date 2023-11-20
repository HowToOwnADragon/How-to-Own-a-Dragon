package net.mcreator.howtoownadragon.procedures;

import javax.annotation.Nullable;
import net.mcreator.howtoownadragon.init.HowToOwnADragonModItems;
import net.minecraft.client.Minecraft;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.tags.TagKey;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.GameType;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.LevelAccessor;
import net.minecraftforge.event.entity.player.PlayerInteractEvent.EntityInteract;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;

@EventBusSubscriber
public class GronckleSpawningEggRightclickedEntityProcedure {
   @SubscribeEvent
   public static void onRightClickEntity(EntityInteract event) {
      if (event.getHand() == event.getEntity().m_7655_()) {
         execute(event, event.getLevel(), (double)event.getPos().m_123341_(), (double)event.getPos().m_123342_(), (double)event.getPos().m_123343_(), event.getTarget(), event.getEntity());
      }
   }

   public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, Entity sourceentity) {
      execute((Event)null, world, x, y, z, entity, sourceentity);
   }

   private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z, Entity entity, Entity sourceentity) {
      if (entity != null && sourceentity != null) {
         LivingEntity _livEnt;
         ItemStack var10000;
         if (((<undefinedtype>)(new Object() {
            public boolean checkGamemode(Entity _ent) {
               if (_ent instanceof ServerPlayer) {
                  ServerPlayer _serverPlayer = (ServerPlayer)_ent;
                  return _serverPlayer.f_8941_.m_9290_() == GameType.CREATIVE;
               } else if (_ent.f_19853_.m_5776_() && _ent instanceof Player) {
                  Player _player = (Player)_ent;
                  return Minecraft.m_91087_().m_91403_().m_104949_(_player.m_36316_().getId()) != null && Minecraft.m_91087_().m_91403_().m_104949_(_player.m_36316_().getId()).m_105325_() == GameType.CREATIVE;
               } else {
                  return false;
               }
            }
         })).checkGamemode(sourceentity) && entity.m_6095_().m_204039_(TagKey.m_203882_(Registries.f_256939_, new ResourceLocation("how_to_own_a_dragon:gronckles")))) {
            if (sourceentity instanceof LivingEntity) {
               _livEnt = (LivingEntity)sourceentity;
               var10000 = _livEnt.m_21205_();
            } else {
               var10000 = ItemStack.f_41583_;
            }

            if (var10000.m_41720_() == HowToOwnADragonModItems.GRONCKLE_SPAWN_EGG.get()) {
               GronckleSpawnBabyProcedureProcedure.execute(world, x, y, z, entity);
            }
         } else {
            if (sourceentity instanceof LivingEntity) {
               _livEnt = (LivingEntity)sourceentity;
               var10000 = _livEnt.m_21205_();
            } else {
               var10000 = ItemStack.f_41583_;
            }

            if (var10000.m_41720_() == HowToOwnADragonModItems.GRONCKLE_SPAWN_EGG.get()) {
               if (sourceentity instanceof LivingEntity) {
                  LivingEntity _entity = (LivingEntity)sourceentity;
                  ItemStack _setstack = new ItemStack((ItemLike)HowToOwnADragonModItems.GRONCKLE_SPAWN_EGG.get());
                  ItemStack var10001;
                  if (sourceentity instanceof LivingEntity) {
                     LivingEntity _livEnt = (LivingEntity)sourceentity;
                     var10001 = _livEnt.m_21205_();
                  } else {
                     var10001 = ItemStack.f_41583_;
                  }

                  _setstack.m_41764_(var10001.m_41613_() - 1);
                  _entity.m_21008_(InteractionHand.MAIN_HAND, _setstack);
                  if (_entity instanceof Player) {
                     Player _player = (Player)_entity;
                     _player.m_150109_().m_6596_();
                  }
               }

               GronckleSpawnBabyProcedureProcedure.execute(world, x, y, z, entity);
            }
         }

      }
   }
}
