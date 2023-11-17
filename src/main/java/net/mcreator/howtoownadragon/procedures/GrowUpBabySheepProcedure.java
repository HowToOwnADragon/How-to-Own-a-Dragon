package net.mcreator.howtoownadragon.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.network.chat.Component;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

import net.mcreator.howtoownadragon.entity.SheepEntity;
import net.mcreator.howtoownadragon.entity.BabySheepEntity;
import net.mcreator.howtoownadragon.HowToOwnADragonMod;

import java.util.Comparator;

public class GrowUpBabySheepProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof BabySheepEntity) {
			if (world instanceof ServerLevel _level)
				_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
						"/execute at @e[type=how_to_own_a_dragon:baby_sheep, sort= nearest, limit= 1] run summon how_to_own_a_dragon:sheep ~ ~ ~");
			if (world instanceof ServerLevel _level)
				_level.sendParticles(ParticleTypes.HEART, x, y, z, 30, 3, 3, 3, 1);
			HowToOwnADragonMod.queueServerWork(1, () -> {
				((Entity) world.getEntitiesOfClass(SheepEntity.class, AABB.ofSize(new Vec3(x, y, z), 10, 10, 10), e -> true).stream().sorted(new Object() {
					Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
						return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
					}
				}.compareDistOf(x, y, z)).findFirst().orElse(null)).getPersistentData().putString("sheepcolor", (entity.getPersistentData().getString("sheepcolor")));
				if (!entity.level.isClientSide())
					entity.discard();
			});
		}
	}
}
