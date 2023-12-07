package net.mcreator.howtoownadragon.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.EntityJoinLevelEvent;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.tags.TagKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;

import net.mcreator.howtoownadragon.entity.NadderMaleEntity;
import net.mcreator.howtoownadragon.entity.NadderFemaleEntity;
import net.mcreator.howtoownadragon.entity.JuvenileNadderMaleEntity;
import net.mcreator.howtoownadragon.entity.JuvenileNadderFemaleEntity;
import net.mcreator.howtoownadragon.entity.BabyNadderMaleEntity;
import net.mcreator.howtoownadragon.entity.BabyNadderFemaleEntity;
import net.mcreator.howtoownadragon.entity.AdolescentNadderMaleEntity;
import net.mcreator.howtoownadragon.entity.AdolescentNadderFemaleEntity;
import net.mcreator.howtoownadragon.HowToOwnADragonMod;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class TextureRenderDistanceFixNadderProcedure {
	@SubscribeEvent
	public static void onEntitySpawned(EntityJoinLevelEvent event) {
		execute(event, event.getLevel(), event.getEntity());
	}

	public static void execute(LevelAccessor world, Entity entity) {
		execute(null, world, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		HowToOwnADragonMod.queueServerWork(3, () -> {
			if (!(entity.getPersistentData().getBoolean("loadednadder") == true)) {
				entity.getPersistentData().putBoolean("loadednadder", true);
				if (entity.getType().is(TagKey.create(Registries.ENTITY_TYPE, new ResourceLocation("how_to_own_a_dragon:nadder")))) {
					if (!(entity.getPersistentData().getBoolean("naddersaddle") == true)) {
						if (entity instanceof NadderMaleEntity) {
							if ((entity.getPersistentData().getString("naddercolor")).equals("red")) {
								if (entity instanceof NadderMaleEntity animatable)
									animatable.setTexture("rednadder");
								TextureFixNadderWaitProcedure.execute(world, entity);
							} else if ((entity.getPersistentData().getString("naddercolor")).equals("purple")) {
								if (entity instanceof NadderMaleEntity animatable)
									animatable.setTexture("purplenadder");
								TextureFixNadderWaitProcedure.execute(world, entity);
							} else if ((entity.getPersistentData().getString("naddercolor")).equals("stormfly")) {
								if (entity instanceof NadderMaleEntity animatable)
									animatable.setTexture("stormfly");
								TextureFixNadderWaitProcedure.execute(world, entity);
							} else {
								NBTDataSpawnNadderProcedure.execute(entity);
								RandomColorMaleNadderProcedure.execute(entity);
								TextureFixNadderWaitProcedure.execute(world, entity);
							}
						} else {
							if (entity instanceof NadderFemaleEntity) {
								if ((entity.getPersistentData().getString("naddercolor")).equals("red")) {
									if (entity instanceof NadderFemaleEntity animatable)
										animatable.setTexture("rednadder");
									TextureFixNadderWaitProcedure.execute(world, entity);
								} else if ((entity.getPersistentData().getString("naddercolor")).equals("purple")) {
									if (entity instanceof NadderFemaleEntity animatable)
										animatable.setTexture("purplenadder");
									TextureFixNadderWaitProcedure.execute(world, entity);
								} else if ((entity.getPersistentData().getString("naddercolor")).equals("stormfly")) {
									if (entity instanceof NadderFemaleEntity animatable)
										animatable.setTexture("stormfly");
									TextureFixNadderWaitProcedure.execute(world, entity);
								} else {
									NBTDataSpawnNadderProcedure.execute(entity);
									RandomColorFemaleNadderProcedure.execute(entity);
									TextureFixNadderWaitProcedure.execute(world, entity);
								}
							} else {
								if (entity instanceof AdolescentNadderMaleEntity) {
									if ((entity.getPersistentData().getString("naddercolor")).equals("red")) {
										if (entity instanceof AdolescentNadderMaleEntity animatable)
											animatable.setTexture("rednadder");
										TextureFixNadderWaitProcedure.execute(world, entity);
									} else if ((entity.getPersistentData().getString("naddercolor")).equals("purple")) {
										if (entity instanceof AdolescentNadderMaleEntity animatable)
											animatable.setTexture("purplenadder");
										TextureFixNadderWaitProcedure.execute(world, entity);
									} else if ((entity.getPersistentData().getString("naddercolor")).equals("stormfly")) {
										if (entity instanceof AdolescentNadderMaleEntity animatable)
											animatable.setTexture("stormfly");
										TextureFixNadderWaitProcedure.execute(world, entity);
									}
								} else {
									if (entity instanceof AdolescentNadderFemaleEntity) {
										if ((entity.getPersistentData().getString("naddercolor")).equals("red")) {
											if (entity instanceof AdolescentNadderFemaleEntity animatable)
												animatable.setTexture("rednadder");
											TextureFixNadderWaitProcedure.execute(world, entity);
										} else if ((entity.getPersistentData().getString("naddercolor")).equals("purple")) {
											if (entity instanceof AdolescentNadderFemaleEntity animatable)
												animatable.setTexture("purplenadder");
											TextureFixNadderWaitProcedure.execute(world, entity);
										} else if ((entity.getPersistentData().getString("naddercolor")).equals("stormfly")) {
											if (entity instanceof AdolescentNadderFemaleEntity animatable)
												animatable.setTexture("stormfly");
											TextureFixNadderWaitProcedure.execute(world, entity);
										}
									} else {
										if (entity instanceof JuvenileNadderMaleEntity) {
											if ((entity.getPersistentData().getString("naddercolor")).equals("red")) {
												if (entity instanceof JuvenileNadderMaleEntity animatable)
													animatable.setTexture("rednadder");
												TextureFixNadderWaitProcedure.execute(world, entity);
											} else if ((entity.getPersistentData().getString("naddercolor")).equals("purple")) {
												if (entity instanceof JuvenileNadderMaleEntity animatable)
													animatable.setTexture("purplenadder");
												TextureFixNadderWaitProcedure.execute(world, entity);
											} else if ((entity.getPersistentData().getString("naddercolor")).equals("stormfly")) {
												if (entity instanceof JuvenileNadderMaleEntity animatable)
													animatable.setTexture("stormfly");
												TextureFixNadderWaitProcedure.execute(world, entity);
											}
										} else {
											if (entity instanceof JuvenileNadderFemaleEntity) {
												if ((entity.getPersistentData().getString("naddercolor")).equals("red")) {
													if (entity instanceof JuvenileNadderFemaleEntity animatable)
														animatable.setTexture("rednadder");
													TextureFixNadderWaitProcedure.execute(world, entity);
												} else if ((entity.getPersistentData().getString("naddercolor")).equals("purple")) {
													if (entity instanceof JuvenileNadderFemaleEntity animatable)
														animatable.setTexture("purplenadder");
													TextureFixNadderWaitProcedure.execute(world, entity);
												} else if ((entity.getPersistentData().getString("naddercolor")).equals("stormfly")) {
													if (entity instanceof JuvenileNadderFemaleEntity animatable)
														animatable.setTexture("stormfly");
													TextureFixNadderWaitProcedure.execute(world, entity);
												}
											} else {
												if (entity instanceof BabyNadderMaleEntity) {
													if ((entity.getPersistentData().getString("naddercolor")).equals("red")) {
														if (entity instanceof BabyNadderMaleEntity animatable)
															animatable.setTexture("rednadder");
														TextureFixNadderWaitProcedure.execute(world, entity);
													} else if ((entity.getPersistentData().getString("naddercolor")).equals("purple")) {
														if (entity instanceof BabyNadderMaleEntity animatable)
															animatable.setTexture("purplenadder");
														TextureFixNadderWaitProcedure.execute(world, entity);
													} else if ((entity.getPersistentData().getString("naddercolor")).equals("stormfly")) {
														if (entity instanceof BabyNadderMaleEntity animatable)
															animatable.setTexture("stormfly");
														TextureFixNadderWaitProcedure.execute(world, entity);
													}
												} else {
													if (entity instanceof BabyNadderFemaleEntity) {
														if ((entity.getPersistentData().getString("naddercolor")).equals("red")) {
															if (entity instanceof BabyNadderFemaleEntity animatable)
																animatable.setTexture("rednadder");
															TextureFixNadderWaitProcedure.execute(world, entity);
														} else if ((entity.getPersistentData().getString("naddercolor")).equals("purple")) {
															if (entity instanceof BabyNadderFemaleEntity animatable)
																animatable.setTexture("purplenadder");
															TextureFixNadderWaitProcedure.execute(world, entity);
														} else if ((entity.getPersistentData().getString("naddercolor")).equals("stormfly")) {
															if (entity instanceof BabyNadderFemaleEntity animatable)
																animatable.setTexture("stormfly");
															TextureFixNadderWaitProcedure.execute(world, entity);
														}
													}
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		});
	}
}
