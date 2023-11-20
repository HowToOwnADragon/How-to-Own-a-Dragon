package net.mcreator.howtoownadragon.procedures;

import io.netty.buffer.Unpooled;
import javax.annotation.Nullable;
import net.mcreator.howtoownadragon.init.HowToOwnADragonModItems;
import net.mcreator.howtoownadragon.world.inventory.MainPageInfoGronckleMenu;
import net.minecraft.commands.CommandSource;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.core.BlockPos;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.tags.TagKey;
import net.minecraft.world.MenuProvider;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.phys.Vec3;
import net.minecraftforge.event.entity.player.PlayerInteractEvent.EntityInteract;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.network.NetworkHooks;

@EventBusSubscriber
public class OpenInfoGronckleProcedure {
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
         ItemStack var10000;
         if (sourceentity instanceof LivingEntity) {
            LivingEntity _livEnt = (LivingEntity)sourceentity;
            var10000 = _livEnt.m_21205_();
         } else {
            var10000 = ItemStack.f_41583_;
         }

         if (var10000.m_41720_() == HowToOwnADragonModItems.DRAGON_EYE.get()) {
            if (sourceentity instanceof LivingEntity) {
               LivingEntity _livEnt = (LivingEntity)sourceentity;
               var10000 = _livEnt.m_21205_();
            } else {
               var10000 = ItemStack.f_41583_;
            }

            if (var10000.m_41784_().m_128459_("Lens") == 0.0D && entity.m_6095_().m_204039_(TagKey.m_203882_(Registries.f_256939_, new ResourceLocation("how_to_own_a_dragon:gronckles")))) {
               if (sourceentity instanceof ServerPlayer) {
                  ServerPlayer _ent = (ServerPlayer)sourceentity;
                  final BlockPos _bpos = BlockPos.m_274561_(x, y, z);
                  NetworkHooks.openScreen(_ent, new MenuProvider() {
                     public Component m_5446_() {
                        return Component.m_237113_("MainPageInfoGronckle");
                     }

                     public AbstractContainerMenu m_7208_(int id, Inventory inventory, Player player) {
                        return new MainPageInfoGronckleMenu(id, inventory, (new FriendlyByteBuf(Unpooled.buffer())).m_130064_(_bpos));
                     }
                  }, _bpos);
               }

               return;
            }
         }

         if (sourceentity instanceof LivingEntity) {
            LivingEntity _livEnt = (LivingEntity)sourceentity;
            var10000 = _livEnt.m_21205_();
         } else {
            var10000 = ItemStack.f_41583_;
         }

         if (var10000.m_41720_() == HowToOwnADragonModItems.DRAGON_EYE.get() && (new ItemStack((ItemLike)HowToOwnADragonModItems.DRAGON_EYE.get())).m_41784_().m_128459_("Lens") == -1.0D && entity.m_6095_().m_204039_(TagKey.m_203882_(Registries.f_256939_, new ResourceLocation("how_to_own_a_dragon:gronckles"))) && world instanceof ServerLevel) {
            ServerLevel _level = (ServerLevel)world;
            _level.m_7654_().m_129892_().m_230957_((new CommandSourceStack(CommandSource.f_80164_, new Vec3(x, y, z), Vec2.f_82462_, _level, 4, "", Component.m_237113_(""), _level.m_7654_(), (Entity)null)).m_81324_(), "say hi");
         }

      }
   }
}
