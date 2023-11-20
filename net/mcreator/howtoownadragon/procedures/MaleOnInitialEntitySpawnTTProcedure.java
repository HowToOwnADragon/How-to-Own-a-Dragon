package net.mcreator.howtoownadragon.procedures;

import net.mcreator.howtoownadragon.entity.TTMaleEntity;
import net.minecraft.util.Mth;
import net.minecraft.util.RandomSource;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.level.LevelAccessor;

public class MaleOnInitialEntitySpawnTTProcedure {
   public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
      if (entity != null) {
         NBTOnInitiallSpawnTTProcedure.execute(entity);
         TTMaleEntity animatable;
         if (Mth.m_216271_(RandomSource.m_216327_(), 1, 3) == 1) {
            if (entity instanceof TTMaleEntity) {
               animatable = (TTMaleEntity)entity;
               animatable.setTexture("greentt");
            }

            entity.getPersistentData().m_128359_("ttcolor", "green");
         } else if (Mth.m_216271_(RandomSource.m_216327_(), 1, 3) == 2) {
            if (entity instanceof TTMaleEntity) {
               animatable = (TTMaleEntity)entity;
               animatable.setTexture("pinktt");
            }

            entity.getPersistentData().m_128359_("ttcolor", "pink");
         } else if (Mth.m_216271_(RandomSource.m_216327_(), 1, 3) == 3) {
            if (entity instanceof TTMaleEntity) {
               animatable = (TTMaleEntity)entity;
               animatable.setTexture("turqtt");
            }

            entity.getPersistentData().m_128359_("ttcolor", "turq");
         } else {
            execute(world, x, y, z, entity);
         }

      }
   }
}
