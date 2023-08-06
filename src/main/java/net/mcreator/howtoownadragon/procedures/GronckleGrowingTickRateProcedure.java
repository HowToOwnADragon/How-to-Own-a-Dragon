package net.mcreator.howtoownadragon.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.TamableAnimal;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.network.chat.Component;

import net.mcreator.howtoownadragon.init.HowToOwnADragonModMobEffects;
import net.mcreator.howtoownadragon.HowToOwnADragonMod;

import java.util.Comparator;

public class GronckleGrowingTickRateProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof TamableAnimal _toTame && ((Entity) world.getEntitiesOfClass(Player.class, AABB.ofSize(new Vec3(x, y, z), 4, 4, 4), e -> true).stream().sorted(new Object() {
			Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
				return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
			}
		}.compareDistOf(x, y, z)).findFirst().orElse(null)) instanceof Player _owner)
			_toTame.tame(_owner);
		HowToOwnADragonMod.queueServerWork(6000, () -> {
			if (Mth.nextInt(RandomSource.create(), 1, 10) <= 2) {
				if (Mth.nextInt(RandomSource.create(), 1, 10) == 1) {
					if ((entity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null) instanceof Player _player && !_player.level.isClientSide())
						_player.displayClientMessage(Component.literal(("Your " + entity.getDisplayName().getString() + " is ready to grow up! It requires some sustenance. It needs some Stone!")), false);
					if (entity instanceof LivingEntity _entity && !_entity.level.isClientSide())
						_entity.addEffect(new MobEffectInstance(HowToOwnADragonModMobEffects.STONE_GROWING.get(), 12000, 1, false, false));
				} else if (Mth.nextInt(RandomSource.create(), 1, 10) == 2) {
					if ((entity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null) instanceof Player _player && !_player.level.isClientSide())
						_player.displayClientMessage(Component.literal(("Your " + entity.getDisplayName().getString() + " is ready to grow up! It requires some sustenance. It needs some Cobblestone!")), false);
					if (entity instanceof LivingEntity _entity && !_entity.level.isClientSide())
						_entity.addEffect(new MobEffectInstance(HowToOwnADragonModMobEffects.COBBLESTONE_GROWING.get(), 12000, 1, false, false));
				} else if (Mth.nextInt(RandomSource.create(), 1, 10) == 3) {
					if ((entity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null) instanceof Player _player && !_player.level.isClientSide())
						_player.displayClientMessage(Component.literal(("Your " + entity.getDisplayName().getString() + " is ready to grow up! It requires some sustenance. It needs some Deepslate!")), false);
					if (entity instanceof LivingEntity _entity && !_entity.level.isClientSide())
						_entity.addEffect(new MobEffectInstance(HowToOwnADragonModMobEffects.DEEPSLATE_GROWING.get(), 12000, 1, false, false));
				} else if (Mth.nextInt(RandomSource.create(), 1, 10) == 4) {
					if ((entity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null) instanceof Player _player && !_player.level.isClientSide())
						_player.displayClientMessage(Component.literal(("Your " + entity.getDisplayName().getString() + " is ready to grow up! It requires some sustenance. It needs some Cobbled Deepslate!")), false);
					if (entity instanceof LivingEntity _entity && !_entity.level.isClientSide())
						_entity.addEffect(new MobEffectInstance(HowToOwnADragonModMobEffects.COBBLED_DEEPSLATE_GROWING.get(), 12000, 1, false, false));
				} else if (Mth.nextInt(RandomSource.create(), 1, 10) == 5) {
					if ((entity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null) instanceof Player _player && !_player.level.isClientSide())
						_player.displayClientMessage(Component.literal(("Your " + entity.getDisplayName().getString() + " is ready to grow up! It requires some sustenance. It needs some Andesite!")), false);
					if (entity instanceof LivingEntity _entity && !_entity.level.isClientSide())
						_entity.addEffect(new MobEffectInstance(HowToOwnADragonModMobEffects.ANDESITE_GROWING.get(), 12000, 1, false, false));
				} else if (Mth.nextInt(RandomSource.create(), 1, 10) == 6) {
					if ((entity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null) instanceof Player _player && !_player.level.isClientSide())
						_player.displayClientMessage(Component.literal(("Your " + entity.getDisplayName().getString() + " is ready to grow up! It requires some sustenance. It needs some Diorite!")), false);
					if (entity instanceof LivingEntity _entity && !_entity.level.isClientSide())
						_entity.addEffect(new MobEffectInstance(HowToOwnADragonModMobEffects.DIORITE_GROWING.get(), 12000, 1, false, false));
				} else if (Mth.nextInt(RandomSource.create(), 1, 10) == 7) {
					if ((entity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null) instanceof Player _player && !_player.level.isClientSide())
						_player.displayClientMessage(Component.literal(("Your " + entity.getDisplayName().getString() + " is ready to grow up! It requires some sustenance. It needs some Granite!")), false);
					if (entity instanceof LivingEntity _entity && !_entity.level.isClientSide())
						_entity.addEffect(new MobEffectInstance(HowToOwnADragonModMobEffects.GRANITE_GROWING.get(), 12000, 1, false, false));
				} else if (Mth.nextInt(RandomSource.create(), 1, 10) == 8) {
					if ((entity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null) instanceof Player _player && !_player.level.isClientSide())
						_player.displayClientMessage(Component.literal(("Your " + entity.getDisplayName().getString() + " is ready to grow up! It requires some sustenance. It needs some Lava!")), false);
					if (entity instanceof LivingEntity _entity && !_entity.level.isClientSide())
						_entity.addEffect(new MobEffectInstance(HowToOwnADragonModMobEffects.BUCKET_OF_LAVA_GROWING.get(), 12000, 1, false, false));
				} else if (Mth.nextInt(RandomSource.create(), 1, 10) == 9) {
					if ((entity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null) instanceof Player _player && !_player.level.isClientSide())
						_player.displayClientMessage(Component.literal(("Your " + entity.getDisplayName().getString() + " is ready to grow up! It requires some sustenance. It needs some Iron!")), false);
					if (entity instanceof LivingEntity _entity && !_entity.level.isClientSide())
						_entity.addEffect(new MobEffectInstance(HowToOwnADragonModMobEffects.IRON_INGOT_GROWING.get(), 12000, 1, false, false));
				} else if (Mth.nextInt(RandomSource.create(), 1, 10) == 10) {
					if ((entity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null) instanceof Player _player && !_player.level.isClientSide())
						_player.displayClientMessage(Component.literal(("Your " + entity.getDisplayName().getString() + " is ready to grow up! It requires some sustenance. It needs some Sandstone!")), false);
					if (entity instanceof LivingEntity _entity && !_entity.level.isClientSide())
						_entity.addEffect(new MobEffectInstance(HowToOwnADragonModMobEffects.SAND_STONE_GROWING.get(), 12000, 1, false, false));
				}
			} else {
				HowToOwnADragonMod.queueServerWork(6000, () -> {
					if (Mth.nextInt(RandomSource.create(), 3, 10) <= 4) {
						if (Mth.nextInt(RandomSource.create(), 1, 10) == 1) {
							if ((entity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null) instanceof Player _player && !_player.level.isClientSide())
								_player.displayClientMessage(Component.literal(("Your " + entity.getDisplayName().getString() + " is ready to grow up! It requires some sustenance. It needs some Stone!")), false);
							if (entity instanceof LivingEntity _entity && !_entity.level.isClientSide())
								_entity.addEffect(new MobEffectInstance(HowToOwnADragonModMobEffects.STONE_GROWING.get(), 12000, 1, false, false));
						} else if (Mth.nextInt(RandomSource.create(), 1, 10) == 2) {
							if ((entity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null) instanceof Player _player && !_player.level.isClientSide())
								_player.displayClientMessage(Component.literal(("Your " + entity.getDisplayName().getString() + " is ready to grow up! It requires some sustenance. It needs some Cobblestone!")), false);
							if (entity instanceof LivingEntity _entity && !_entity.level.isClientSide())
								_entity.addEffect(new MobEffectInstance(HowToOwnADragonModMobEffects.COBBLESTONE_GROWING.get(), 12000, 1, false, false));
						} else if (Mth.nextInt(RandomSource.create(), 1, 10) == 3) {
							if ((entity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null) instanceof Player _player && !_player.level.isClientSide())
								_player.displayClientMessage(Component.literal(("Your " + entity.getDisplayName().getString() + " is ready to grow up! It requires some sustenance. It needs some Deepslate!")), false);
							if (entity instanceof LivingEntity _entity && !_entity.level.isClientSide())
								_entity.addEffect(new MobEffectInstance(HowToOwnADragonModMobEffects.DEEPSLATE_GROWING.get(), 12000, 1, false, false));
						} else if (Mth.nextInt(RandomSource.create(), 1, 10) == 4) {
							if ((entity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null) instanceof Player _player && !_player.level.isClientSide())
								_player.displayClientMessage(Component.literal(("Your " + entity.getDisplayName().getString() + " is ready to grow up! It requires some sustenance. It needs some Cobbled Deepslate!")), false);
							if (entity instanceof LivingEntity _entity && !_entity.level.isClientSide())
								_entity.addEffect(new MobEffectInstance(HowToOwnADragonModMobEffects.COBBLED_DEEPSLATE_GROWING.get(), 12000, 1, false, false));
						} else if (Mth.nextInt(RandomSource.create(), 1, 10) == 5) {
							if ((entity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null) instanceof Player _player && !_player.level.isClientSide())
								_player.displayClientMessage(Component.literal(("Your " + entity.getDisplayName().getString() + " is ready to grow up! It requires some sustenance. It needs some Andesite!")), false);
							if (entity instanceof LivingEntity _entity && !_entity.level.isClientSide())
								_entity.addEffect(new MobEffectInstance(HowToOwnADragonModMobEffects.ANDESITE_GROWING.get(), 12000, 1, false, false));
						} else if (Mth.nextInt(RandomSource.create(), 1, 10) == 6) {
							if ((entity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null) instanceof Player _player && !_player.level.isClientSide())
								_player.displayClientMessage(Component.literal(("Your " + entity.getDisplayName().getString() + " is ready to grow up! It requires some sustenance. It needs some Diorite!")), false);
							if (entity instanceof LivingEntity _entity && !_entity.level.isClientSide())
								_entity.addEffect(new MobEffectInstance(HowToOwnADragonModMobEffects.DIORITE_GROWING.get(), 12000, 1, false, false));
						} else if (Mth.nextInt(RandomSource.create(), 1, 10) == 7) {
							if ((entity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null) instanceof Player _player && !_player.level.isClientSide())
								_player.displayClientMessage(Component.literal(("Your " + entity.getDisplayName().getString() + " is ready to grow up! It requires some sustenance. It needs some Granite!")), false);
							if (entity instanceof LivingEntity _entity && !_entity.level.isClientSide())
								_entity.addEffect(new MobEffectInstance(HowToOwnADragonModMobEffects.GRANITE_GROWING.get(), 12000, 1, false, false));
						} else if (Mth.nextInt(RandomSource.create(), 1, 10) == 8) {
							if ((entity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null) instanceof Player _player && !_player.level.isClientSide())
								_player.displayClientMessage(Component.literal(("Your " + entity.getDisplayName().getString() + " is ready to grow up! It requires some sustenance. It needs some Lava!")), false);
							if (entity instanceof LivingEntity _entity && !_entity.level.isClientSide())
								_entity.addEffect(new MobEffectInstance(HowToOwnADragonModMobEffects.BUCKET_OF_LAVA_GROWING.get(), 12000, 1, false, false));
						} else if (Mth.nextInt(RandomSource.create(), 1, 10) == 9) {
							if ((entity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null) instanceof Player _player && !_player.level.isClientSide())
								_player.displayClientMessage(Component.literal(("Your " + entity.getDisplayName().getString() + " is ready to grow up! It requires some sustenance. It needs some Iron!")), false);
							if (entity instanceof LivingEntity _entity && !_entity.level.isClientSide())
								_entity.addEffect(new MobEffectInstance(HowToOwnADragonModMobEffects.IRON_INGOT_GROWING.get(), 12000, 1, false, false));
						} else if (Mth.nextInt(RandomSource.create(), 1, 10) == 10) {
							if ((entity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null) instanceof Player _player && !_player.level.isClientSide())
								_player.displayClientMessage(Component.literal(("Your " + entity.getDisplayName().getString() + " is ready to grow up! It requires some sustenance. It needs some Sandstone!")), false);
							if (entity instanceof LivingEntity _entity && !_entity.level.isClientSide())
								_entity.addEffect(new MobEffectInstance(HowToOwnADragonModMobEffects.SAND_STONE_GROWING.get(), 12000, 1, false, false));
						}
					} else {
						HowToOwnADragonMod.queueServerWork(6000, () -> {
							if (Mth.nextInt(RandomSource.create(), 5, 10) <= 6) {
								if (Mth.nextInt(RandomSource.create(), 1, 10) == 1) {
									if ((entity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null) instanceof Player _player && !_player.level.isClientSide())
										_player.displayClientMessage(Component.literal(("Your " + entity.getDisplayName().getString() + " is ready to grow up! It requires some sustenance. It needs some Stone!")), false);
									if (entity instanceof LivingEntity _entity && !_entity.level.isClientSide())
										_entity.addEffect(new MobEffectInstance(HowToOwnADragonModMobEffects.STONE_GROWING.get(), 12000, 1, false, false));
								} else if (Mth.nextInt(RandomSource.create(), 1, 10) == 2) {
									if ((entity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null) instanceof Player _player && !_player.level.isClientSide())
										_player.displayClientMessage(Component.literal(("Your " + entity.getDisplayName().getString() + " is ready to grow up! It requires some sustenance. It needs some Cobblestone!")), false);
									if (entity instanceof LivingEntity _entity && !_entity.level.isClientSide())
										_entity.addEffect(new MobEffectInstance(HowToOwnADragonModMobEffects.COBBLESTONE_GROWING.get(), 12000, 1, false, false));
								} else if (Mth.nextInt(RandomSource.create(), 1, 10) == 3) {
									if ((entity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null) instanceof Player _player && !_player.level.isClientSide())
										_player.displayClientMessage(Component.literal(("Your " + entity.getDisplayName().getString() + " is ready to grow up! It requires some sustenance. It needs some Deepslate!")), false);
									if (entity instanceof LivingEntity _entity && !_entity.level.isClientSide())
										_entity.addEffect(new MobEffectInstance(HowToOwnADragonModMobEffects.DEEPSLATE_GROWING.get(), 12000, 1, false, false));
								} else if (Mth.nextInt(RandomSource.create(), 1, 10) == 4) {
									if ((entity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null) instanceof Player _player && !_player.level.isClientSide())
										_player.displayClientMessage(Component.literal(("Your " + entity.getDisplayName().getString() + " is ready to grow up! It requires some sustenance. It needs some Cobbled Deepslate!")), false);
									if (entity instanceof LivingEntity _entity && !_entity.level.isClientSide())
										_entity.addEffect(new MobEffectInstance(HowToOwnADragonModMobEffects.COBBLED_DEEPSLATE_GROWING.get(), 12000, 1, false, false));
								} else if (Mth.nextInt(RandomSource.create(), 1, 10) == 5) {
									if ((entity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null) instanceof Player _player && !_player.level.isClientSide())
										_player.displayClientMessage(Component.literal(("Your " + entity.getDisplayName().getString() + " is ready to grow up! It requires some sustenance. It needs some Andesite!")), false);
									if (entity instanceof LivingEntity _entity && !_entity.level.isClientSide())
										_entity.addEffect(new MobEffectInstance(HowToOwnADragonModMobEffects.ANDESITE_GROWING.get(), 12000, 1, false, false));
								} else if (Mth.nextInt(RandomSource.create(), 1, 10) == 6) {
									if ((entity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null) instanceof Player _player && !_player.level.isClientSide())
										_player.displayClientMessage(Component.literal(("Your " + entity.getDisplayName().getString() + " is ready to grow up! It requires some sustenance. It needs some Diorite!")), false);
									if (entity instanceof LivingEntity _entity && !_entity.level.isClientSide())
										_entity.addEffect(new MobEffectInstance(HowToOwnADragonModMobEffects.DIORITE_GROWING.get(), 12000, 1, false, false));
								} else if (Mth.nextInt(RandomSource.create(), 1, 10) == 7) {
									if ((entity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null) instanceof Player _player && !_player.level.isClientSide())
										_player.displayClientMessage(Component.literal(("Your " + entity.getDisplayName().getString() + " is ready to grow up! It requires some sustenance. It needs some Granite!")), false);
									if (entity instanceof LivingEntity _entity && !_entity.level.isClientSide())
										_entity.addEffect(new MobEffectInstance(HowToOwnADragonModMobEffects.GRANITE_GROWING.get(), 12000, 1, false, false));
								} else if (Mth.nextInt(RandomSource.create(), 1, 10) == 8) {
									if ((entity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null) instanceof Player _player && !_player.level.isClientSide())
										_player.displayClientMessage(Component.literal(("Your " + entity.getDisplayName().getString() + " is ready to grow up! It requires some sustenance. It needs some Lava!")), false);
									if (entity instanceof LivingEntity _entity && !_entity.level.isClientSide())
										_entity.addEffect(new MobEffectInstance(HowToOwnADragonModMobEffects.BUCKET_OF_LAVA_GROWING.get(), 12000, 1, false, false));
								} else if (Mth.nextInt(RandomSource.create(), 1, 10) == 9) {
									if ((entity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null) instanceof Player _player && !_player.level.isClientSide())
										_player.displayClientMessage(Component.literal(("Your " + entity.getDisplayName().getString() + " is ready to grow up! It requires some sustenance. It needs some Iron!")), false);
									if (entity instanceof LivingEntity _entity && !_entity.level.isClientSide())
										_entity.addEffect(new MobEffectInstance(HowToOwnADragonModMobEffects.IRON_INGOT_GROWING.get(), 12000, 1, false, false));
								} else if (Mth.nextInt(RandomSource.create(), 1, 10) == 10) {
									if ((entity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null) instanceof Player _player && !_player.level.isClientSide())
										_player.displayClientMessage(Component.literal(("Your " + entity.getDisplayName().getString() + " is ready to grow up! It requires some sustenance. It needs some Sandstone!")), false);
									if (entity instanceof LivingEntity _entity && !_entity.level.isClientSide())
										_entity.addEffect(new MobEffectInstance(HowToOwnADragonModMobEffects.SAND_STONE_GROWING.get(), 12000, 1, false, false));
								}
							} else {
								HowToOwnADragonMod.queueServerWork(6000, () -> {
									if (Mth.nextInt(RandomSource.create(), 7, 10) <= 8) {
										if (Mth.nextInt(RandomSource.create(), 1, 10) == 1) {
											if ((entity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null) instanceof Player _player && !_player.level.isClientSide())
												_player.displayClientMessage(Component.literal(("Your " + entity.getDisplayName().getString() + " is ready to grow up! It requires some sustenance. It needs some Stone!")), false);
											if (entity instanceof LivingEntity _entity && !_entity.level.isClientSide())
												_entity.addEffect(new MobEffectInstance(HowToOwnADragonModMobEffects.STONE_GROWING.get(), 12000, 1, false, false));
										} else if (Mth.nextInt(RandomSource.create(), 1, 10) == 2) {
											if ((entity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null) instanceof Player _player && !_player.level.isClientSide())
												_player.displayClientMessage(Component.literal(("Your " + entity.getDisplayName().getString() + " is ready to grow up! It requires some sustenance. It needs some Cobblestone!")), false);
											if (entity instanceof LivingEntity _entity && !_entity.level.isClientSide())
												_entity.addEffect(new MobEffectInstance(HowToOwnADragonModMobEffects.COBBLESTONE_GROWING.get(), 12000, 1, false, false));
										} else if (Mth.nextInt(RandomSource.create(), 1, 10) == 3) {
											if ((entity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null) instanceof Player _player && !_player.level.isClientSide())
												_player.displayClientMessage(Component.literal(("Your " + entity.getDisplayName().getString() + " is ready to grow up! It requires some sustenance. It needs some Deepslate!")), false);
											if (entity instanceof LivingEntity _entity && !_entity.level.isClientSide())
												_entity.addEffect(new MobEffectInstance(HowToOwnADragonModMobEffects.DEEPSLATE_GROWING.get(), 12000, 1, false, false));
										} else if (Mth.nextInt(RandomSource.create(), 1, 10) == 4) {
											if ((entity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null) instanceof Player _player && !_player.level.isClientSide())
												_player.displayClientMessage(Component.literal(("Your " + entity.getDisplayName().getString() + " is ready to grow up! It requires some sustenance. It needs some Cobbled Deepslate!")), false);
											if (entity instanceof LivingEntity _entity && !_entity.level.isClientSide())
												_entity.addEffect(new MobEffectInstance(HowToOwnADragonModMobEffects.COBBLED_DEEPSLATE_GROWING.get(), 12000, 1, false, false));
										} else if (Mth.nextInt(RandomSource.create(), 1, 10) == 5) {
											if ((entity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null) instanceof Player _player && !_player.level.isClientSide())
												_player.displayClientMessage(Component.literal(("Your " + entity.getDisplayName().getString() + " is ready to grow up! It requires some sustenance. It needs some Andesite!")), false);
											if (entity instanceof LivingEntity _entity && !_entity.level.isClientSide())
												_entity.addEffect(new MobEffectInstance(HowToOwnADragonModMobEffects.ANDESITE_GROWING.get(), 12000, 1, false, false));
										} else if (Mth.nextInt(RandomSource.create(), 1, 10) == 6) {
											if ((entity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null) instanceof Player _player && !_player.level.isClientSide())
												_player.displayClientMessage(Component.literal(("Your " + entity.getDisplayName().getString() + " is ready to grow up! It requires some sustenance. It needs some Diorite!")), false);
											if (entity instanceof LivingEntity _entity && !_entity.level.isClientSide())
												_entity.addEffect(new MobEffectInstance(HowToOwnADragonModMobEffects.DIORITE_GROWING.get(), 12000, 1, false, false));
										} else if (Mth.nextInt(RandomSource.create(), 1, 10) == 7) {
											if ((entity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null) instanceof Player _player && !_player.level.isClientSide())
												_player.displayClientMessage(Component.literal(("Your " + entity.getDisplayName().getString() + " is ready to grow up! It requires some sustenance. It needs some Granite!")), false);
											if (entity instanceof LivingEntity _entity && !_entity.level.isClientSide())
												_entity.addEffect(new MobEffectInstance(HowToOwnADragonModMobEffects.GRANITE_GROWING.get(), 12000, 1, false, false));
										} else if (Mth.nextInt(RandomSource.create(), 1, 10) == 8) {
											if ((entity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null) instanceof Player _player && !_player.level.isClientSide())
												_player.displayClientMessage(Component.literal(("Your " + entity.getDisplayName().getString() + " is ready to grow up! It requires some sustenance. It needs some Lava!")), false);
											if (entity instanceof LivingEntity _entity && !_entity.level.isClientSide())
												_entity.addEffect(new MobEffectInstance(HowToOwnADragonModMobEffects.BUCKET_OF_LAVA_GROWING.get(), 12000, 1, false, false));
										} else if (Mth.nextInt(RandomSource.create(), 1, 10) == 9) {
											if ((entity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null) instanceof Player _player && !_player.level.isClientSide())
												_player.displayClientMessage(Component.literal(("Your " + entity.getDisplayName().getString() + " is ready to grow up! It requires some sustenance. It needs some Iron!")), false);
											if (entity instanceof LivingEntity _entity && !_entity.level.isClientSide())
												_entity.addEffect(new MobEffectInstance(HowToOwnADragonModMobEffects.IRON_INGOT_GROWING.get(), 12000, 1, false, false));
										} else if (Mth.nextInt(RandomSource.create(), 1, 10) == 10) {
											if ((entity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null) instanceof Player _player && !_player.level.isClientSide())
												_player.displayClientMessage(Component.literal(("Your " + entity.getDisplayName().getString() + " is ready to grow up! It requires some sustenance. It needs some Sandstone!")), false);
											if (entity instanceof LivingEntity _entity && !_entity.level.isClientSide())
												_entity.addEffect(new MobEffectInstance(HowToOwnADragonModMobEffects.SAND_STONE_GROWING.get(), 12000, 1, false, false));
										}
									} else {
										HowToOwnADragonMod.queueServerWork(6000, () -> {
											if (Mth.nextInt(RandomSource.create(), 1, 10) == 1) {
												if ((entity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null) instanceof Player _player && !_player.level.isClientSide())
													_player.displayClientMessage(Component.literal(("Your " + entity.getDisplayName().getString() + " is ready to grow up! It requires some sustenance. It needs some Stone!")), false);
												if (entity instanceof LivingEntity _entity && !_entity.level.isClientSide())
													_entity.addEffect(new MobEffectInstance(HowToOwnADragonModMobEffects.STONE_GROWING.get(), 12000, 1, false, false));
											} else if (Mth.nextInt(RandomSource.create(), 1, 10) == 2) {
												if ((entity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null) instanceof Player _player && !_player.level.isClientSide())
													_player.displayClientMessage(Component.literal(("Your " + entity.getDisplayName().getString() + " is ready to grow up! It requires some sustenance. It needs some Cobblestone!")), false);
												if (entity instanceof LivingEntity _entity && !_entity.level.isClientSide())
													_entity.addEffect(new MobEffectInstance(HowToOwnADragonModMobEffects.COBBLESTONE_GROWING.get(), 12000, 1, false, false));
											} else if (Mth.nextInt(RandomSource.create(), 1, 10) == 3) {
												if ((entity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null) instanceof Player _player && !_player.level.isClientSide())
													_player.displayClientMessage(Component.literal(("Your " + entity.getDisplayName().getString() + " is ready to grow up! It requires some sustenance. It needs some Deepslate!")), false);
												if (entity instanceof LivingEntity _entity && !_entity.level.isClientSide())
													_entity.addEffect(new MobEffectInstance(HowToOwnADragonModMobEffects.DEEPSLATE_GROWING.get(), 12000, 1, false, false));
											} else if (Mth.nextInt(RandomSource.create(), 1, 10) == 4) {
												if ((entity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null) instanceof Player _player && !_player.level.isClientSide())
													_player.displayClientMessage(Component.literal(("Your " + entity.getDisplayName().getString() + " is ready to grow up! It requires some sustenance. It needs some Cobbled Deepslate!")), false);
												if (entity instanceof LivingEntity _entity && !_entity.level.isClientSide())
													_entity.addEffect(new MobEffectInstance(HowToOwnADragonModMobEffects.COBBLED_DEEPSLATE_GROWING.get(), 12000, 1, false, false));
											} else if (Mth.nextInt(RandomSource.create(), 1, 10) == 5) {
												if ((entity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null) instanceof Player _player && !_player.level.isClientSide())
													_player.displayClientMessage(Component.literal(("Your " + entity.getDisplayName().getString() + " is ready to grow up! It requires some sustenance. It needs some Andesite!")), false);
												if (entity instanceof LivingEntity _entity && !_entity.level.isClientSide())
													_entity.addEffect(new MobEffectInstance(HowToOwnADragonModMobEffects.ANDESITE_GROWING.get(), 12000, 1, false, false));
											} else if (Mth.nextInt(RandomSource.create(), 1, 10) == 6) {
												if ((entity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null) instanceof Player _player && !_player.level.isClientSide())
													_player.displayClientMessage(Component.literal(("Your " + entity.getDisplayName().getString() + " is ready to grow up! It requires some sustenance. It needs some Diorite!")), false);
												if (entity instanceof LivingEntity _entity && !_entity.level.isClientSide())
													_entity.addEffect(new MobEffectInstance(HowToOwnADragonModMobEffects.DIORITE_GROWING.get(), 12000, 1, false, false));
											} else if (Mth.nextInt(RandomSource.create(), 1, 10) == 7) {
												if ((entity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null) instanceof Player _player && !_player.level.isClientSide())
													_player.displayClientMessage(Component.literal(("Your " + entity.getDisplayName().getString() + " is ready to grow up! It requires some sustenance. It needs some Granite!")), false);
												if (entity instanceof LivingEntity _entity && !_entity.level.isClientSide())
													_entity.addEffect(new MobEffectInstance(HowToOwnADragonModMobEffects.GRANITE_GROWING.get(), 12000, 1, false, false));
											} else if (Mth.nextInt(RandomSource.create(), 1, 10) == 8) {
												if ((entity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null) instanceof Player _player && !_player.level.isClientSide())
													_player.displayClientMessage(Component.literal(("Your " + entity.getDisplayName().getString() + " is ready to grow up! It requires some sustenance. It needs some Lava!")), false);
												if (entity instanceof LivingEntity _entity && !_entity.level.isClientSide())
													_entity.addEffect(new MobEffectInstance(HowToOwnADragonModMobEffects.BUCKET_OF_LAVA_GROWING.get(), 12000, 1, false, false));
											} else if (Mth.nextInt(RandomSource.create(), 1, 10) == 9) {
												if ((entity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null) instanceof Player _player && !_player.level.isClientSide())
													_player.displayClientMessage(Component.literal(("Your " + entity.getDisplayName().getString() + " is ready to grow up! It requires some sustenance. It needs some Iron!")), false);
												if (entity instanceof LivingEntity _entity && !_entity.level.isClientSide())
													_entity.addEffect(new MobEffectInstance(HowToOwnADragonModMobEffects.IRON_INGOT_GROWING.get(), 12000, 1, false, false));
											} else if (Mth.nextInt(RandomSource.create(), 1, 10) == 10) {
												if ((entity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null) instanceof Player _player && !_player.level.isClientSide())
													_player.displayClientMessage(Component.literal(("Your " + entity.getDisplayName().getString() + " is ready to grow up! It requires some sustenance. It needs some Sandstone!")), false);
												if (entity instanceof LivingEntity _entity && !_entity.level.isClientSide())
													_entity.addEffect(new MobEffectInstance(HowToOwnADragonModMobEffects.SAND_STONE_GROWING.get(), 12000, 1, false, false));
											}
										});
									}
								});
							}
						});
					}
				});
			}
		});
	}
}
