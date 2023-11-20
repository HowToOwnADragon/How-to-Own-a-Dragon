package net.mcreator.howtoownadragon.procedures;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.entity.BlockEntity;

public class Incubator1TimerShowProcedure {
   public static String execute(LevelAccessor world, double x, double y, double z) {
      if (((<undefinedtype>)(new Object() {
         public String getValue(LevelAccessor world, BlockPos pos, String tag) {
            BlockEntity blockEntity = world.m_7702_(pos);
            return blockEntity != null ? blockEntity.getPersistentData().m_128461_(tag) : "";
         }
      })).getValue(world, BlockPos.m_274561_(x, y, z), "TimerLeft").equals("30 Sec")) {
         return "30 Sec";
      } else if (((<undefinedtype>)(new Object() {
         public String getValue(LevelAccessor world, BlockPos pos, String tag) {
            BlockEntity blockEntity = world.m_7702_(pos);
            return blockEntity != null ? blockEntity.getPersistentData().m_128461_(tag) : "";
         }
      })).getValue(world, BlockPos.m_274561_(x, y, z), "TimerLeft").equals("Done")) {
         return "Done";
      } else {
         return ((<undefinedtype>)(new Object() {
            public String getValue(LevelAccessor world, BlockPos pos, String tag) {
               BlockEntity blockEntity = world.m_7702_(pos);
               return blockEntity != null ? blockEntity.getPersistentData().m_128461_(tag) : "";
            }
         })).getValue(world, BlockPos.m_274561_(x, y, z), "TimerLeft").equals("Wrong Slot") ? "Wrong Slot" : "No Egg";
      }
   }
}
