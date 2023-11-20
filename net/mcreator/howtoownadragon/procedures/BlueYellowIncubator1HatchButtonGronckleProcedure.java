package net.mcreator.howtoownadragon.procedures;

import net.mcreator.howtoownadragon.entity.BabyGronckleFemaleEntity;
import net.mcreator.howtoownadragon.entity.BabyGronckleMaleEntity;
import net.mcreator.howtoownadragon.init.HowToOwnADragonModEntities;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.util.Mth;
import net.minecraft.util.RandomSource;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.SpawnGroupData;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraftforge.common.capabilities.ForgeCapabilities;
import net.minecraftforge.items.IItemHandlerModifiable;

public class BlueYellowIncubator1HatchButtonGronckleProcedure {
   public static void execute(LevelAccessor world, double x, double y, double z) {
      ServerLevel _level;
      Mob _mobToSpawn;
      BlockEntity _ent;
      boolean _slotid;
      ItemStack _setstack;
      boolean _amount;
      if (Mth.m_216271_(RandomSource.m_216327_(), 1, 2) == 1) {
         if (world instanceof ServerLevel) {
            _level = (ServerLevel)world;
            Entity entityToSpawn = new BabyGronckleMaleEntity((EntityType)HowToOwnADragonModEntities.BABY_GRONCKLE_MALE.get(), _level);
            entityToSpawn.m_7678_(x, y + 1.0D, z, 0.0F, 0.0F);
            entityToSpawn.m_5618_(0.0F);
            entityToSpawn.m_5616_(0.0F);
            entityToSpawn.m_20334_(0.0D, 0.0D, 0.0D);
            if (entityToSpawn instanceof Mob) {
               _mobToSpawn = (Mob)entityToSpawn;
               _mobToSpawn.m_6518_(_level, _level.m_6436_(entityToSpawn.m_20183_()), MobSpawnType.MOB_SUMMONED, (SpawnGroupData)null, (CompoundTag)null);
            }

            _level.m_7967_(entityToSpawn);
         }

         _ent = world.m_7702_(BlockPos.m_274561_(x, y, z));
         if (_ent != null) {
            _slotid = true;
            _setstack = new ItemStack(Items.f_42446_);
            _setstack.m_41764_(1);
            _ent.getCapability(ForgeCapabilities.ITEM_HANDLER, (Direction)null).ifPresent((capability) -> {
               if (capability instanceof IItemHandlerModifiable) {
                  ((IItemHandlerModifiable)capability).setStackInSlot(1, _setstack);
               }

            });
         }

         _ent = world.m_7702_(BlockPos.m_274561_(x, y, z));
         if (_ent != null) {
            _slotid = true;
            _amount = true;
            _ent.getCapability(ForgeCapabilities.ITEM_HANDLER, (Direction)null).ifPresent((capability) -> {
               if (capability instanceof IItemHandlerModifiable) {
                  ItemStack _stk = capability.getStackInSlot(2).m_41777_();
                  _stk.m_41774_(1);
                  ((IItemHandlerModifiable)capability).setStackInSlot(2, _stk);
               }

            });
         }

         BlueYellowIncubator1CallNBTDataProcedureProcedure.execute(world, x, y, z);
      } else if (Mth.m_216271_(RandomSource.m_216327_(), 1, 2) == 2) {
         if (world instanceof ServerLevel) {
            _level = (ServerLevel)world;
            Entity entityToSpawn = new BabyGronckleFemaleEntity((EntityType)HowToOwnADragonModEntities.BABY_GRONCKLE_FEMALE.get(), _level);
            entityToSpawn.m_7678_(x, y + 1.0D, z, 0.0F, 0.0F);
            entityToSpawn.m_5618_(0.0F);
            entityToSpawn.m_5616_(0.0F);
            entityToSpawn.m_20334_(0.0D, 0.0D, 0.0D);
            if (entityToSpawn instanceof Mob) {
               _mobToSpawn = (Mob)entityToSpawn;
               _mobToSpawn.m_6518_(_level, _level.m_6436_(entityToSpawn.m_20183_()), MobSpawnType.MOB_SUMMONED, (SpawnGroupData)null, (CompoundTag)null);
            }

            _level.m_7967_(entityToSpawn);
         }

         _ent = world.m_7702_(BlockPos.m_274561_(x, y, z));
         if (_ent != null) {
            _slotid = true;
            _setstack = new ItemStack(Items.f_42446_);
            _setstack.m_41764_(1);
            _ent.getCapability(ForgeCapabilities.ITEM_HANDLER, (Direction)null).ifPresent((capability) -> {
               if (capability instanceof IItemHandlerModifiable) {
                  ((IItemHandlerModifiable)capability).setStackInSlot(1, _setstack);
               }

            });
         }

         _ent = world.m_7702_(BlockPos.m_274561_(x, y, z));
         if (_ent != null) {
            _slotid = true;
            _amount = true;
            _ent.getCapability(ForgeCapabilities.ITEM_HANDLER, (Direction)null).ifPresent((capability) -> {
               if (capability instanceof IItemHandlerModifiable) {
                  ItemStack _stk = capability.getStackInSlot(2).m_41777_();
                  _stk.m_41774_(1);
                  ((IItemHandlerModifiable)capability).setStackInSlot(2, _stk);
               }

            });
         }

         BlueYellowIncubator1CallNBTDataProcedureProcedure.execute(world, x, y, z);
      } else {
         execute(world, x, y, z);
      }

   }
}
