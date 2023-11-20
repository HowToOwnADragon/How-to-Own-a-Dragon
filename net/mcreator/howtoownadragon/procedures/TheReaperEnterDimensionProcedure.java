package net.mcreator.howtoownadragon.procedures;

import net.minecraft.commands.CommandSource;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.Mirror;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.world.level.levelgen.structure.templatesystem.StructurePlaceSettings;
import net.minecraft.world.level.levelgen.structure.templatesystem.StructureTemplate;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.phys.Vec3;

public class TheReaperEnterDimensionProcedure {
   public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
      if (entity != null) {
         boolean found = false;
         double sx = 0.0D;
         double sy = 0.0D;
         double sz = 0.0D;
         LivingEntity _entity;
         if (entity instanceof LivingEntity) {
            _entity = (LivingEntity)entity;
            if (!_entity.f_19853_.m_5776_()) {
               _entity.m_7292_(new MobEffectInstance(MobEffects.f_19610_, 60, 255, false, false));
            }
         }

         if (entity instanceof LivingEntity) {
            _entity = (LivingEntity)entity;
            if (!_entity.f_19853_.m_5776_()) {
               _entity.m_7292_(new MobEffectInstance(MobEffects.f_19599_, 1000000, 2, false, false));
            }
         }

         ServerLevel _level;
         if (world instanceof ServerLevel) {
            _level = (ServerLevel)world;
            _level.m_7654_().m_129892_().m_230957_((new CommandSourceStack(CommandSource.f_80164_, new Vec3(x, y, z), Vec2.f_82462_, _level, 4, "", Component.m_237113_(""), _level.m_7654_(), (Entity)null)).m_81324_(), "tp @p ~10.5 207 ~2.5");
         }

         sx = -3.0D;
         found = false;

         for(int index0 = 0; index0 < 6; ++index0) {
            sy = -3.0D;

            for(int index1 = 0; index1 < 6; ++index1) {
               sz = -3.0D;

               for(int index2 = 0; index2 < 6; ++index2) {
                  if (world.m_8055_(BlockPos.m_274561_(x + sx, y + sy, z + sz)).m_60734_() == Blocks.f_50741_) {
                     found = true;
                  }

                  ++sz;
               }

               ++sy;
            }

            ++sx;
         }

         if (!found) {
            if (world instanceof ServerLevel) {
               _level = (ServerLevel)world;
               _level.m_7654_().m_129892_().m_230957_((new CommandSourceStack(CommandSource.f_80164_, new Vec3(x, y, z), Vec2.f_82462_, _level, 4, "", Component.m_237113_(""), _level.m_7654_(), (Entity)null)).m_81324_(), "tp @p ~ 300 ~");
            }

            if (world instanceof ServerLevel) {
               _level = (ServerLevel)world;
               StructureTemplate template = _level.m_215082_().m_230359_(new ResourceLocation("how_to_own_a_dragon", "reaper_inside_prototype_6"));
               if (template != null) {
                  template.m_230328_(_level, BlockPos.m_274561_(x, 200.0D, z), BlockPos.m_274561_(x, 200.0D, z), (new StructurePlaceSettings()).m_74379_(Rotation.NONE).m_74377_(Mirror.NONE).m_74392_(false), _level.f_46441_, 3);
               }
            }

            if (world instanceof ServerLevel) {
               _level = (ServerLevel)world;
               _level.m_7654_().m_129892_().m_230957_((new CommandSourceStack(CommandSource.f_80164_, new Vec3(x, y, z), Vec2.f_82462_, _level, 4, "", Component.m_237113_(""), _level.m_7654_(), (Entity)null)).m_81324_(), "tp @p ~10.5 207 ~2.5");
            }
         }

      }
   }
}
