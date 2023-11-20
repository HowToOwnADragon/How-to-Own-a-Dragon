package net.mcreator.howtoownadragon.procedures;

import net.mcreator.howtoownadragon.HowToOwnADragonMod;
import net.mcreator.howtoownadragon.network.HowToOwnADragonModVariables;
import net.minecraft.commands.CommandSource;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.Mirror;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.world.level.levelgen.structure.templatesystem.StructurePlaceSettings;
import net.minecraft.world.level.levelgen.structure.templatesystem.StructureTemplate;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.phys.Vec3;

public class TheHiddenWorldPlayerEntersDimensionProcedure {
   public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
      if (entity != null) {
         if (!HowToOwnADragonModVariables.WorldVariables.get(world).HasplayerenteredHWbefore) {
            HowToOwnADragonMod.queueServerWork(1, () -> {
               ServerLevel _level;
               if (world instanceof ServerLevel) {
                  _level = (ServerLevel)world;
                  StructureTemplate template = _level.m_215082_().m_230359_(new ResourceLocation("how_to_own_a_dragon", "hw_entrance_in_hw"));
                  if (template != null) {
                     template.m_230328_(_level, new BlockPos(0, 100, 0), new BlockPos(0, 100, 0), (new StructurePlaceSettings()).m_74379_(Rotation.NONE).m_74377_(Mirror.NONE).m_74392_(false), _level.f_46441_, 3);
                  }
               }

               if (world instanceof ServerLevel) {
                  _level = (ServerLevel)world;
                  _level.m_7654_().m_129892_().m_230957_((new CommandSourceStack(CommandSource.f_80164_, new Vec3(x, y, z), Vec2.f_82462_, _level, 4, "", Component.m_237113_(""), _level.m_7654_(), (Entity)null)).m_81324_(), "tp @p 10 140 10");
               }

               HowToOwnADragonModVariables.WorldVariables.get(world).HasplayerenteredHWbefore = true;
               HowToOwnADragonModVariables.WorldVariables.get(world).syncData(world);
            });
         } else if (HowToOwnADragonModVariables.WorldVariables.get(world).HasplayerenteredHWbefore) {
            if (entity instanceof Player) {
               Player _player = (Player)entity;
               if (!_player.f_19853_.m_5776_()) {
                  _player.m_5661_(Component.m_237113_("This isnt your first time"), false);
               }
            }

            if (world instanceof ServerLevel) {
               ServerLevel _level = (ServerLevel)world;
               _level.m_7654_().m_129892_().m_230957_((new CommandSourceStack(CommandSource.f_80164_, new Vec3(x, y, z), Vec2.f_82462_, _level, 4, "", Component.m_237113_(""), _level.m_7654_(), (Entity)null)).m_81324_(), "tp @p 0 200 0");
            }
         }

      }
   }
}
