package net.mcreator.howtoownadragon.procedures;

import net.minecraft.client.gui.screens.Screen;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.entity.Entity;

public class UseAbilityOnKeyPressedProcedure {
   public static void execute(Entity entity) {
      if (entity != null) {
         if (entity.m_20159_() && Screen.m_96639_() && entity.m_20202_().m_6095_().m_204039_(TagKey.m_203882_(Registries.f_256939_, new ResourceLocation("how_to_own_a_dragon:gronckle_full_grown")))) {
            GronckleAttackProcedureProcedure.execute(entity);
         }

      }
   }
}
