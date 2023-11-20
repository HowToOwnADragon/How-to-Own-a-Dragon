package net.mcreator.howtoownadragon.potion;

import com.mojang.blaze3d.vertex.PoseStack;
import java.util.function.Consumer;
import net.minecraft.client.gui.screens.inventory.EffectRenderingInventoryScreen;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraftforge.client.extensions.common.IClientMobEffectExtensions;

public class HitByArrowMobEffect extends MobEffect {
   public HitByArrowMobEffect() {
      super(MobEffectCategory.NEUTRAL, -1);
   }

   public String m_19481_() {
      return "effect.how_to_own_a_dragon.hit_by_arrow";
   }

   public boolean m_6584_(int duration, int amplifier) {
      return true;
   }

   public void initializeClient(Consumer<IClientMobEffectExtensions> consumer) {
      consumer.accept(new IClientMobEffectExtensions() {
         public boolean isVisibleInInventory(MobEffectInstance effect) {
            return false;
         }

         public boolean renderInventoryText(MobEffectInstance instance, EffectRenderingInventoryScreen<?> screen, PoseStack poseStack, int x, int y, int blitOffset) {
            return false;
         }

         public boolean isVisibleInGui(MobEffectInstance effect) {
            return false;
         }
      });
   }
}
