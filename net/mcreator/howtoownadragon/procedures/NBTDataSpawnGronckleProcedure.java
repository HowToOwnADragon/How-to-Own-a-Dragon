package net.mcreator.howtoownadragon.procedures;

import net.minecraft.world.entity.Entity;

public class NBTDataSpawnGronckleProcedure {
   public static void execute(Entity entity) {
      if (entity != null) {
         entity.getPersistentData().m_128379_("groncklefeedcooldown", false);
         entity.getPersistentData().m_128379_("groncklesaddle", false);
      }
   }
}
