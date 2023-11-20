package net.mcreator.howtoownadragon.world.dimension;

import net.mcreator.howtoownadragon.procedures.TheReaperEnterDimensionProcedure;
import net.mcreator.howtoownadragon.procedures.TheReaperPlayerLeavesDimensionProcedure;
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
public class TheReaperDimension {
   @SubscribeEvent
   public static void onPlayerChangedDimensionEvent(PlayerChangedDimensionEvent event) {
      Entity entity = event.getEntity();
      Level world = entity.f_19853_;
      double x = entity.m_20185_();
      double y = entity.m_20186_();
      double z = entity.m_20189_();
      if (event.getFrom() == ResourceKey.m_135785_(Registries.f_256858_, new ResourceLocation("how_to_own_a_dragon:the_reaper"))) {
         TheReaperPlayerLeavesDimensionProcedure.execute(entity);
      }

      if (event.getTo() == ResourceKey.m_135785_(Registries.f_256858_, new ResourceLocation("how_to_own_a_dragon:the_reaper"))) {
         TheReaperEnterDimensionProcedure.execute(world, x, y, z, entity);
      }

   }

   @EventBusSubscriber(
      bus = Bus.MOD
   )
   public static class DimensionSpecialEffectsHandler {
      @SubscribeEvent
      @OnlyIn(Dist.CLIENT)
      public static void registerDimensionSpecialEffects(RegisterDimensionSpecialEffectsEvent event) {
         DimensionSpecialEffects customEffect = new DimensionSpecialEffects(Float.NaN, true, SkyType.NONE, false, false) {
            {
               super(arg0, arg1, arg2, arg3, arg4);
            }

            public Vec3 m_5927_(Vec3 color, float sunHeight) {
               return color;
            }

            public boolean m_5781_(int x, int y) {
               return false;
            }
         };
         event.register(new ResourceLocation("how_to_own_a_dragon:the_reaper"), customEffect);
      }
   }
}
