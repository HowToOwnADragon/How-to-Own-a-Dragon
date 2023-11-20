package net.mcreator.howtoownadragon.procedures;

import net.minecraft.world.entity.Entity;

public class NBTDataSpawnNadderProcedure {
   public static void execute(Entity entity) {
      if (entity != null) {
         entity.getPersistentData().m_128379_("nadderfeedcooldown", false);
         entity.getPersistentData().m_128379_("naddersaddle", false);
      }
   }
}
