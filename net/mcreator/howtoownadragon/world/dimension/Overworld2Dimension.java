package net.mcreator.howtoownadragon.world.dimension;

import net.mcreator.howtoownadragon.procedures.Overworld2setspawnProcedure;
import net.minecraft.client.renderer.DimensionSpecialEffects;
import net.minecraft.client.renderer.DimensionSpecialEffects.SkyType;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.Vec3;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.client.event.RegisterDimensionSpecialEffectsEvent;
import net.minecraftforge.event.entity.player.PlayerEvent.PlayerChangedDimensionEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;

@EventBusSubscriber
public class Overworld2Dimension {
   @SubscribeEvent
   public static void onPlayerChangedDimensionEvent(PlayerChangedDimensionEvent event) {
      Entity entity = event.getEntity();
      Level world = entity.f_19853_;
      double x = entity.m_20185_();
      double y = entity.m_20186_();
      double z = entity.m_20189_();
      if (event.getTo() == ResourceKey.m_135785_(Registries.f_256858_, new ResourceLocation("how_to_own_a_dragon:overworld_2"))) {
         Overworld2setspawnProcedure.execute(world, x, y, z);
      }

   }

   @EventBusSubscriber(
      bus = Bus.MOD
   )
   public static class DimensionSpecialEffectsHandler {
      @SubscribeEvent
      @OnlyIn(Dist.CLIENT)
      public static void registerDimensionSpecialEffects(RegisterDimensionSpecialEffectsEvent event) {
         DimensionSpecialEffects customEffect = new DimensionSpecialEffects(128.0F, true, SkyType.NORMAL, false, false) {
            {
               super(arg0, arg1, arg2, arg3, arg4);
            }

            public Vec3 m_5927_(Vec3 color, float sunHeight) {
               return color.m_82542_((double)sunHeight * 0.94D + 0.06D, (double)sunHeight * 0.94D + 0.06D, (double)sunHeight * 0.91D + 0.09D);
            }

            public boolean m_5781_(int x, int y) {
               return false;
            }
         };
         event.register(new ResourceLocation("how_to_own_a_dragon:overworld_2"), customEffect);
      }
   }
}
