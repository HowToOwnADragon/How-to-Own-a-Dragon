package net.mcreator.howtoownadragon.procedures;

import java.util.Comparator;
import net.mcreator.howtoownadragon.entity.GronckleEggEntityEntity;
import net.minecraft.commands.CommandSource;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.network.chat.Component;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.util.Mth;
import net.minecraft.util.RandomSource;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.phys.Vec3;

public class MeatlugAndBlueYellowEggGronckleProcedure {
   public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
      if (entity != null) {
         ServerLevel _level;
         if (Mth.m_216271_(RandomSource.m_216327_(), 1, 2) == 1) {
            if (world instanceof ServerLevel) {
               _level = (ServerLevel)world;
               _level.m_7654_().m_129892_().m_230957_((new CommandSourceStack(CommandSource.f_80164_, new Vec3(x, y, z), Vec2.f_82462_, _level, 4, "", Component.m_237113_(""), _level.m_7654_(), (Entity)null)).m_81324_(), "/execute at @e[type=how_to_own_a_dragon:gronckle_female, sort= nearest, limit= 1] run summon how_to_own_a_dragon:gronckle_egg_entity ~ ~ ~");
            }

            ((Entity)world.m_6443_(GronckleEggEntityEntity.class, AABB.m_165882_(new Vec3(x, y, z), 10.0D, 10.0D, 10.0D), (e) -> {
               return true;
            }).stream().sorted(((<undefinedtype>)(new Object() {
               Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                  return Comparator.comparingDouble((_entcnd) -> {
                     return _entcnd.m_20275_(_x, _y, _z);
                  });
               }
            })).compareDistOf(x, y, z)).findFirst().orElse((Object)null)).getPersistentData().m_128359_("groncklecolor", "meatlug");
            GiveBreedingCooldownGronckleProcedure.execute(world, x, y, z);
         } else if (Mth.m_216271_(RandomSource.m_216327_(), 1, 2) == 2) {
            if (world instanceof ServerLevel) {
               _level = (ServerLevel)world;
               _level.m_7654_().m_129892_().m_230957_((new CommandSourceStack(CommandSource.f_80164_, new Vec3(x, y, z), Vec2.f_82462_, _level, 4, "", Component.m_237113_(""), _level.m_7654_(), (Entity)null)).m_81324_(), "/execute at @e[type=how_to_own_a_dragon:gronckle_female, sort= nearest, limit= 1] run summon how_to_own_a_dragon:gronckle_egg_entity ~ ~ ~");
            }

            ((Entity)world.m_6443_(GronckleEggEntityEntity.class, AABB.m_165882_(new Vec3(x, y, z), 10.0D, 10.0D, 10.0D), (e) -> {
               return true;
            }).stream().sorted(((<undefinedtype>)(new Object() {
               Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                  return Comparator.comparingDouble((_entcnd) -> {
                     return _entcnd.m_20275_(_x, _y, _z);
                  });
               }
            })).compareDistOf(x, y, z)).findFirst().orElse((Object)null)).getPersistentData().m_128359_("groncklecolor", "blueyellow");
            GiveBreedingCooldownGronckleProcedure.execute(world, x, y, z);
         } else {
            execute(world, x, y, z, entity);
         }

      }
   }
}
