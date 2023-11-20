package net.mcreator.howtoownadragon.procedures;

import net.minecraft.world.entity.Entity;
import net.minecraft.world.phys.Vec3;

public class EggGravityProcedure {
   public static void execute(Entity entity) {
      if (entity != null) {
         entity.m_20256_(new Vec3(0.0D, -0.5D, 0.0D));
      }
   }
}
