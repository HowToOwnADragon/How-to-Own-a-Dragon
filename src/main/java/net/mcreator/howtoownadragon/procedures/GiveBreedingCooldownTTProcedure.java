package net.mcreator.howtoownadragon.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

public class GiveBreedingCooldownTTProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (((Entity) world.getEntitiesOfClass(TTFemaleEntity.class, AABB.ofSize(new Vec3(x, y, z), 10, 10, 10), e -> true).stream().sorted(new Object() {
			Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
				return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
			}
		}.compareDistOf(x, y, z)).findFirst().orElse(null)) instanceof LivingEntity _entity && !_entity.level.isClientSide())
			_entity.addEffect(new MobEffectInstance(HowToOwnADragonModMobEffects.BREEDING_COOLDOWN.get(), 600, 1, false, false));
	}
}
