package net.mcreator.howtoownadragon.procedures;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.entity.BlockEntity;

public class Incubator1RequirementProcedure {
   public static String execute(LevelAccessor world, double x, double y, double z) {
      if (((<undefinedtype>)(new Object() {
         public String getValue(LevelAccessor world, BlockPos pos, String tag) {
            BlockEntity blockEntity = world.m_7702_(pos);
            return blockEntity != null ? blockEntity.getPersistentData().m_128461_(tag) : "";
         }
      })).getValue(world, BlockPos.m_274561_(x, y, z), "IncubatorRequirement").equals("Rabbit")) {
         return "Rabbit's Foot";
      } else if (((<undefinedtype>)(new Object() {
         public String getValue(LevelAccessor world, BlockPos pos, String tag) {
            BlockEntity blockEntity = world.m_7702_(pos);
            return blockEntity != null ? blockEntity.getPersistentData().m_128461_(tag) : "";
         }
      })).getValue(world, BlockPos.m_274561_(x, y, z), "IncubatorRequirement").equals("Wrong Slot")) {
         return "Wrong Slot";
      } else if (((<undefinedtype>)(new Object() {
         public String getValue(LevelAccessor world, BlockPos pos, String tag) {
            BlockEntity blockEntity = world.m_7702_(pos);
            return blockEntity != null ? blockEntity.getPersistentData().m_128461_(tag) : "";
         }
      })).getValue(world, BlockPos.m_274561_(x, y, z), "IncubatorRequirement").equals("Egg is Hatching")) {
         return "Egg is Hatching";
      } else if (((<undefinedtype>)(new Object() {
         public String getValue(LevelAccessor world, BlockPos pos, String tag) {
            BlockEntity blockEntity = world.m_7702_(pos);
            return blockEntity != null ? blockEntity.getPersistentData().m_128461_(tag) : "";
         }
      })).getValue(world, BlockPos.m_274561_(x, y, z), "IncubatorRequirement").equals("Lava Bucket")) {
         return "Lava Bucket";
      } else {
         return ((<undefinedtype>)(new Object() {
            public String getValue(LevelAccessor world, BlockPos pos, String tag) {
               BlockEntity blockEntity = world.m_7702_(pos);
               return blockEntity != null ? blockEntity.getPersistentData().m_128461_(tag) : "";
            }
         })).getValue(world, BlockPos.m_274561_(x, y, z), "IncubatorRequirement").equals("Flint") ? "Flint" : "No Egg";
      }
   }
}
