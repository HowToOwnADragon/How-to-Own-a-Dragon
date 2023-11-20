package net.mcreator.howtoownadragon.procedures;

import net.minecraft.world.entity.Entity;

public class NBTOnInitiallSpawnTTProcedure {
   public static void execute(Entity entity) {
      if (entity != null) {
         entity.getPersistentData().m_128379_("ttfeedcooldown", false);
         entity.getPersistentData().m_128359_("ttfoodcooldown", "false");
      }
   }
}
