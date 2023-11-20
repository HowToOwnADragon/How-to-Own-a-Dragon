package net.mcreator.howtoownadragon.procedures;

import net.minecraft.world.entity.Entity;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level.ExplosionInteraction;

public class GronckleExplodeAtBlockProcedure {
   public static void execute(LevelAccessor world, double x, double y, double z) {
      if (world instanceof Level) {
         Level _level = (Level)world;
         if (!_level.m_5776_()) {
            _level.m_254849_((Entity)null, x, y, z, 5.0F, ExplosionInteraction.NONE);
         }
      }

   }
}
