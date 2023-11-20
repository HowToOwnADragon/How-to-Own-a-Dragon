package net.mcreator.howtoownadragon.procedures;

import net.minecraft.world.InteractionHand;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.Blocks;

public class MeatlugItemNeededForGrowUpGronckleProcedure {
   public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, Entity sourceentity) {
      if (entity != null && sourceentity != null) {
         ItemStack var10000;
         LivingEntity _livEnt;
         Player _player;
         ItemStack _stktoremove;
         if (entity.getPersistentData().m_128461_("groncklegrowup").equals("stone")) {
            if (sourceentity instanceof LivingEntity) {
               _livEnt = (LivingEntity)sourceentity;
               var10000 = _livEnt.m_21205_();
            } else {
               var10000 = ItemStack.f_41583_;
            }

            if (var10000.m_41720_() == Blocks.f_50069_.m_5456_()) {
               if (sourceentity instanceof Player) {
                  _player = (Player)sourceentity;
                  _stktoremove = new ItemStack(Blocks.f_50069_);
                  _player.m_150109_().m_36022_((p) -> {
                     return _stktoremove.m_41720_() == p.m_41720_();
                  }, 1, _player.f_36095_.m_39730_());
               }

               MeatlugGrowUpProcedureGronckleProcedure.execute(world, x, y, z, entity, sourceentity);
            }
         } else if (entity.getPersistentData().m_128461_("groncklegrowup").equals("cobblestone")) {
            if (sourceentity instanceof LivingEntity) {
               _livEnt = (LivingEntity)sourceentity;
               var10000 = _livEnt.m_21205_();
            } else {
               var10000 = ItemStack.f_41583_;
            }

            if (var10000.m_41720_() == Blocks.f_50652_.m_5456_()) {
               if (sourceentity instanceof Player) {
                  _player = (Player)sourceentity;
                  _stktoremove = new ItemStack(Blocks.f_50652_);
                  _player.m_150109_().m_36022_((p) -> {
                     return _stktoremove.m_41720_() == p.m_41720_();
                  }, 1, _player.f_36095_.m_39730_());
               }

               MeatlugGrowUpProcedureGronckleProcedure.execute(world, x, y, z, entity, sourceentity);
            }
         } else if (entity.getPersistentData().m_128461_("groncklegrowup").equals("deepslate")) {
            if (sourceentity instanceof LivingEntity) {
               _livEnt = (LivingEntity)sourceentity;
               var10000 = _livEnt.m_21205_();
            } else {
               var10000 = ItemStack.f_41583_;
            }

            if (var10000.m_41720_() == Blocks.f_152550_.m_5456_()) {
               if (sourceentity instanceof Player) {
                  _player = (Player)sourceentity;
                  _stktoremove = new ItemStack(Blocks.f_152550_);
                  _player.m_150109_().m_36022_((p) -> {
                     return _stktoremove.m_41720_() == p.m_41720_();
                  }, 1, _player.f_36095_.m_39730_());
               }

               MeatlugGrowUpProcedureGronckleProcedure.execute(world, x, y, z, entity, sourceentity);
            }
         } else if (entity.getPersistentData().m_128461_("groncklegrowup").equals("cobbleddeepslate")) {
            if (sourceentity instanceof LivingEntity) {
               _livEnt = (LivingEntity)sourceentity;
               var10000 = _livEnt.m_21205_();
            } else {
               var10000 = ItemStack.f_41583_;
            }

            if (var10000.m_41720_() == Blocks.f_152551_.m_5456_()) {
               if (sourceentity instanceof Player) {
                  _player = (Player)sourceentity;
                  _stktoremove = new ItemStack(Blocks.f_152551_);
                  _player.m_150109_().m_36022_((p) -> {
                     return _stktoremove.m_41720_() == p.m_41720_();
                  }, 1, _player.f_36095_.m_39730_());
               }

               MeatlugGrowUpProcedureGronckleProcedure.execute(world, x, y, z, entity, sourceentity);
            }
         } else if (entity.getPersistentData().m_128461_("groncklegrowup").equals("andesite")) {
            if (sourceentity instanceof LivingEntity) {
               _livEnt = (LivingEntity)sourceentity;
               var10000 = _livEnt.m_21205_();
            } else {
               var10000 = ItemStack.f_41583_;
            }

            if (var10000.m_41720_() == Blocks.f_50334_.m_5456_()) {
               if (sourceentity instanceof Player) {
                  _player = (Player)sourceentity;
                  _stktoremove = new ItemStack(Blocks.f_50334_);
                  _player.m_150109_().m_36022_((p) -> {
                     return _stktoremove.m_41720_() == p.m_41720_();
                  }, 1, _player.f_36095_.m_39730_());
               }

               MeatlugGrowUpProcedureGronckleProcedure.execute(world, x, y, z, entity, sourceentity);
            }
         } else if (entity.getPersistentData().m_128461_("groncklegrowup").equals("diorite")) {
            if (sourceentity instanceof LivingEntity) {
               _livEnt = (LivingEntity)sourceentity;
               var10000 = _livEnt.m_21205_();
            } else {
               var10000 = ItemStack.f_41583_;
            }

            if (var10000.m_41720_() == Blocks.f_50228_.m_5456_()) {
               if (sourceentity instanceof Player) {
                  _player = (Player)sourceentity;
                  _stktoremove = new ItemStack(Blocks.f_50228_);
                  _player.m_150109_().m_36022_((p) -> {
                     return _stktoremove.m_41720_() == p.m_41720_();
                  }, 1, _player.f_36095_.m_39730_());
               }

               MeatlugGrowUpProcedureGronckleProcedure.execute(world, x, y, z, entity, sourceentity);
            }
         } else if (entity.getPersistentData().m_128461_("groncklegrowup").equals("granite")) {
            if (sourceentity instanceof LivingEntity) {
               _livEnt = (LivingEntity)sourceentity;
               var10000 = _livEnt.m_21205_();
            } else {
               var10000 = ItemStack.f_41583_;
            }

            if (var10000.m_41720_() == Blocks.f_50122_.m_5456_()) {
               if (sourceentity instanceof Player) {
                  _player = (Player)sourceentity;
                  _stktoremove = new ItemStack(Blocks.f_50122_);
                  _player.m_150109_().m_36022_((p) -> {
                     return _stktoremove.m_41720_() == p.m_41720_();
                  }, 1, _player.f_36095_.m_39730_());
               }

               MeatlugGrowUpProcedureGronckleProcedure.execute(world, x, y, z, entity, sourceentity);
            }
         } else if (entity.getPersistentData().m_128461_("groncklegrowup").equals("lava")) {
            if (sourceentity instanceof LivingEntity) {
               _livEnt = (LivingEntity)sourceentity;
               var10000 = _livEnt.m_21205_();
            } else {
               var10000 = ItemStack.f_41583_;
            }

            if (var10000.m_41720_() == Items.f_42448_) {
               if (sourceentity instanceof LivingEntity) {
                  LivingEntity _entity = (LivingEntity)sourceentity;
                  _stktoremove = new ItemStack(Items.f_42446_);
                  _stktoremove.m_41764_(1);
                  _entity.m_21008_(InteractionHand.MAIN_HAND, _stktoremove);
                  if (_entity instanceof Player) {
                     Player _player = (Player)_entity;
                     _player.m_150109_().m_6596_();
                  }
               }

               MeatlugGrowUpProcedureGronckleProcedure.execute(world, x, y, z, entity, sourceentity);
            }
         } else if (entity.getPersistentData().m_128461_("groncklegrowup").equals("iron")) {
            if (sourceentity instanceof LivingEntity) {
               _livEnt = (LivingEntity)sourceentity;
               var10000 = _livEnt.m_21205_();
            } else {
               var10000 = ItemStack.f_41583_;
            }

            if (var10000.m_41720_() == Items.f_42416_) {
               if (sourceentity instanceof Player) {
                  _player = (Player)sourceentity;
                  _stktoremove = new ItemStack(Items.f_42416_);
                  _player.m_150109_().m_36022_((p) -> {
                     return _stktoremove.m_41720_() == p.m_41720_();
                  }, 1, _player.f_36095_.m_39730_());
               }

               MeatlugGrowUpProcedureGronckleProcedure.execute(world, x, y, z, entity, sourceentity);
            }
         } else if (entity.getPersistentData().m_128461_("groncklegrowup").equals("sandstone")) {
            if (sourceentity instanceof LivingEntity) {
               _livEnt = (LivingEntity)sourceentity;
               var10000 = _livEnt.m_21205_();
            } else {
               var10000 = ItemStack.f_41583_;
            }

            if (var10000.m_41720_() == Blocks.f_50062_.m_5456_()) {
               if (sourceentity instanceof Player) {
                  _player = (Player)sourceentity;
                  _stktoremove = new ItemStack(Blocks.f_50062_);
                  _player.m_150109_().m_36022_((p) -> {
                     return _stktoremove.m_41720_() == p.m_41720_();
                  }, 1, _player.f_36095_.m_39730_());
               }

               MeatlugGrowUpProcedureGronckleProcedure.execute(world, x, y, z, entity, sourceentity);
            }
         }

      }
   }
}
