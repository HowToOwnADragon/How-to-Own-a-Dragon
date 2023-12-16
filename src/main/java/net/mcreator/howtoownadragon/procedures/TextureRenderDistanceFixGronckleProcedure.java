package net.mcreator.howtoownadragon.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.living.LivingEvent;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.tags.TagKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;

import net.mcreator.howtoownadragon.entity.JuvenileGronckleMaleEntity;
import net.mcreator.howtoownadragon.entity.JuvenileGronckleFemaleEntity;
import net.mcreator.howtoownadragon.entity.GronckleMaleEntity;
import net.mcreator.howtoownadragon.entity.GronckleFemaleEntity;
import net.mcreator.howtoownadragon.entity.BabyGronckleMaleEntity;
import net.mcreator.howtoownadragon.entity.BabyGronckleFemaleEntity;
import net.mcreator.howtoownadragon.entity.AdolescentGronckleMaleEntity;
import net.mcreator.howtoownadragon.entity.AdolescentGronckleFemaleEntity;
import net.mcreator.howtoownadragon.HowToOwnADragonMod;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class TextureRenderDistanceFixGronckleProcedure {
	@SubscribeEvent
	public static void onEntityTick(LivingEvent.LivingTickEvent event) {
		execute(event, event.getEntity().level, event.getEntity().getX(), event.getEntity().getY(), event.getEntity().getZ(), event.getEntity());
	}

	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		execute(null, world, x, y, z, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		HowToOwnADragonMod.queueServerWork(3, () -> {
			if (!(entity.getPersistentData().getBoolean("loadedgronckle") == true)) {
				entity.getPersistentData().putBoolean("loadedgronckle", true);
				if (entity.getType().is(TagKey.create(Registries.ENTITY_TYPE, new ResourceLocation("how_to_own_a_dragon:gronckles")))) {
					if (!(entity.getPersistentData().getBoolean("groncklesaddle") == true)) {
						if (entity instanceof GronckleMaleEntity) {
							if ((entity.getPersistentData().getString("groncklecolor")).equals("pink")) {
								if (!((entity instanceof GronckleMaleEntity animatable ? animatable.getTexture() : "null").equals("pink"))) {
									SetGronckleMaleTexturePinkProcedure.execute(entity);
									TextureFixGronckleWaitProcedure.execute(world, entity);
								}
							} else if ((entity.getPersistentData().getString("groncklecolor")).equals("orangered")) {
								if (!((entity instanceof GronckleMaleEntity animatable ? animatable.getTexture() : "null").equals("orangered"))) {
									SetGronckleMaleTextureOrangeRedProcedure.execute(entity);
									TextureFixGronckleWaitProcedure.execute(world, entity);
								}
							} else if ((entity.getPersistentData().getString("groncklecolor")).equals("blueyellow")) {
								if (!((entity instanceof GronckleMaleEntity animatable ? animatable.getTexture() : "null").equals("blueyellow"))) {
									SetGronckleMaleTextureBlueYellowProcedure.execute(entity);
									TextureFixGronckleWaitProcedure.execute(world, entity);
								}
							} else if ((entity.getPersistentData().getString("groncklecolor")).equals("meatlug")) {
								if (!((entity instanceof GronckleMaleEntity animatable ? animatable.getTexture() : "null").equals("meatlug"))) {
									SetGronckleMaleTextureMeatlugProcedure.execute(entity);
									TextureFixGronckleWaitProcedure.execute(world, entity);
								}
							} else {
								RandomColorMaleGronckleProcedure.execute(world, x, y, z, entity);
								NBTDataSpawnGronckleProcedure.execute(entity);
							}
						} else {
							if (entity instanceof GronckleFemaleEntity) {
								if ((entity.getPersistentData().getString("groncklecolor")).equals("pink")) {
									if (!((entity instanceof GronckleFemaleEntity animatable ? animatable.getTexture() : "null").equals("pink"))) {
										SetGronckleFemaleTexturePinkProcedure.execute(entity);
										TextureFixGronckleWaitProcedure.execute(world, entity);
									}
								} else if ((entity.getPersistentData().getString("groncklecolor")).equals("orangered")) {
									if (!((entity instanceof GronckleFemaleEntity animatable ? animatable.getTexture() : "null").equals("orangered"))) {
										SetGronckleFemaleTextureOrangeRedProcedure.execute(entity);
										TextureFixGronckleWaitProcedure.execute(world, entity);
									}
								} else if ((entity.getPersistentData().getString("groncklecolor")).equals("blueyellow")) {
									if (!((entity instanceof GronckleFemaleEntity animatable ? animatable.getTexture() : "null").equals("blueyellow"))) {
										SetGronckleFemaleTextureBlueYellowProcedure.execute(entity);
										TextureFixGronckleWaitProcedure.execute(world, entity);
									}
								} else if ((entity.getPersistentData().getString("groncklecolor")).equals("meatlug")) {
									if (!((entity instanceof GronckleFemaleEntity animatable ? animatable.getTexture() : "null").equals("meatlug"))) {
										SetGronckleFemaleTextureMeatlugProcedure.execute(entity);
										TextureFixGronckleWaitProcedure.execute(world, entity);
									}
								} else {
									RandomColorFemaleGronckleProcedure.execute(world, x, y, z, entity);
									NBTDataSpawnGronckleProcedure.execute(entity);
								}
							} else {
								if (entity instanceof AdolescentGronckleMaleEntity) {
									if ((entity.getPersistentData().getString("groncklecolor")).equals("pink")) {
										if (entity instanceof AdolescentGronckleMaleEntity animatable)
											animatable.setTexture("adogroncklepink");
										TextureFixGronckleWaitProcedure.execute(world, entity);
									} else if ((entity.getPersistentData().getString("groncklecolor")).equals("meatlug")) {
										if (entity instanceof AdolescentGronckleMaleEntity animatable)
											animatable.setTexture("adomeatlug");
										TextureFixGronckleWaitProcedure.execute(world, entity);
									} else if ((entity.getPersistentData().getString("groncklecolor")).equals("orangered")) {
										if (entity instanceof AdolescentGronckleMaleEntity animatable)
											animatable.setTexture("adogronckleorangered");
										TextureFixGronckleWaitProcedure.execute(world, entity);
									} else if ((entity.getPersistentData().getString("groncklecolor")).equals("blueyellow")) {
										if (entity instanceof AdolescentGronckleMaleEntity animatable)
											animatable.setTexture("adogronckleblueyellow");
										TextureFixGronckleWaitProcedure.execute(world, entity);
									}
								} else {
									if (entity instanceof AdolescentGronckleFemaleEntity) {
										if ((entity.getPersistentData().getString("groncklecolor")).equals("pink")) {
											if (entity instanceof AdolescentGronckleFemaleEntity animatable)
												animatable.setTexture("adogroncklepink");
											TextureFixGronckleWaitProcedure.execute(world, entity);
										} else if ((entity.getPersistentData().getString("groncklecolor")).equals("meatlug")) {
											if (entity instanceof AdolescentGronckleFemaleEntity animatable)
												animatable.setTexture("adomeatlug");
											TextureFixGronckleWaitProcedure.execute(world, entity);
										} else if ((entity.getPersistentData().getString("groncklecolor")).equals("orangered")) {
											if (entity instanceof AdolescentGronckleFemaleEntity animatable)
												animatable.setTexture("adogronckleorangered");
											TextureFixGronckleWaitProcedure.execute(world, entity);
										} else if ((entity.getPersistentData().getString("groncklecolor")).equals("blueyellow")) {
											if (entity instanceof AdolescentGronckleFemaleEntity animatable)
												animatable.setTexture("adogronckleblueyellow");
											TextureFixGronckleWaitProcedure.execute(world, entity);
										}
									} else {
										if (entity instanceof JuvenileGronckleMaleEntity) {
											if ((entity.getPersistentData().getString("groncklecolor")).equals("pink")) {
												if (entity instanceof JuvenileGronckleMaleEntity animatable)
													animatable.setTexture("juvigroncklepink");
												TextureFixGronckleWaitProcedure.execute(world, entity);
											} else if ((entity.getPersistentData().getString("groncklecolor")).equals("meatlug")) {
												if (entity instanceof JuvenileGronckleMaleEntity animatable)
													animatable.setTexture("juvimeatlug");
												TextureFixGronckleWaitProcedure.execute(world, entity);
											} else if ((entity.getPersistentData().getString("groncklecolor")).equals("orangered")) {
												if (entity instanceof JuvenileGronckleMaleEntity animatable)
													animatable.setTexture("juvigronckleorangered");
												TextureFixGronckleWaitProcedure.execute(world, entity);
											} else if ((entity.getPersistentData().getString("groncklecolor")).equals("blueyellow")) {
												if (entity instanceof JuvenileGronckleMaleEntity animatable)
													animatable.setTexture("juvigronckleblueyellow");
												TextureFixGronckleWaitProcedure.execute(world, entity);
											}
										} else {
											if (entity instanceof JuvenileGronckleFemaleEntity) {
												if ((entity.getPersistentData().getString("groncklecolor")).equals("pink")) {
													if (entity instanceof JuvenileGronckleFemaleEntity animatable)
														animatable.setTexture("juvigroncklepink");
													TextureFixGronckleWaitProcedure.execute(world, entity);
												} else if ((entity.getPersistentData().getString("groncklecolor")).equals("meatlug")) {
													if (entity instanceof JuvenileGronckleFemaleEntity animatable)
														animatable.setTexture("juvimeatlug");
													TextureFixGronckleWaitProcedure.execute(world, entity);
												} else if ((entity.getPersistentData().getString("groncklecolor")).equals("orangered")) {
													if (entity instanceof JuvenileGronckleFemaleEntity animatable)
														animatable.setTexture("juvigronckleorangered");
													TextureFixGronckleWaitProcedure.execute(world, entity);
												} else if ((entity.getPersistentData().getString("groncklecolor")).equals("blueyellow")) {
													if (entity instanceof JuvenileGronckleFemaleEntity animatable)
														animatable.setTexture("juvigronckleblueyellow");
													TextureFixGronckleWaitProcedure.execute(world, entity);
												}
											} else {
												if (entity instanceof BabyGronckleMaleEntity) {
													if ((entity.getPersistentData().getString("groncklecolor")).equals("pink")) {
														if (entity instanceof BabyGronckleMaleEntity animatable)
															animatable.setTexture("babygroncklepink");
														TextureFixGronckleWaitProcedure.execute(world, entity);
													} else if ((entity.getPersistentData().getString("groncklecolor")).equals("meatlug")) {
														if (entity instanceof BabyGronckleMaleEntity animatable)
															animatable.setTexture("babymeatlug");
														TextureFixGronckleWaitProcedure.execute(world, entity);
													} else if ((entity.getPersistentData().getString("groncklecolor")).equals("orangered")) {
														if (entity instanceof BabyGronckleMaleEntity animatable)
															animatable.setTexture("babygronckleorange");
														TextureFixGronckleWaitProcedure.execute(world, entity);
													} else if ((entity.getPersistentData().getString("groncklecolor")).equals("blueyellow")) {
														if (entity instanceof BabyGronckleMaleEntity animatable)
															animatable.setTexture("babygroncleblue");
														TextureFixGronckleWaitProcedure.execute(world, entity);
													}
												} else {
													if (entity instanceof BabyGronckleFemaleEntity) {
														if ((entity.getPersistentData().getString("groncklecolor")).equals("pink")) {
															if (entity instanceof BabyGronckleFemaleEntity animatable)
																animatable.setTexture("babygroncklepink");
															TextureFixGronckleWaitProcedure.execute(world, entity);
														} else if ((entity.getPersistentData().getString("groncklecolor")).equals("meatlug")) {
															if (entity instanceof BabyGronckleFemaleEntity animatable)
																animatable.setTexture("babymeatlug");
															TextureFixGronckleWaitProcedure.execute(world, entity);
														} else if ((entity.getPersistentData().getString("groncklecolor")).equals("orangered")) {
															if (entity instanceof BabyGronckleFemaleEntity animatable)
																animatable.setTexture("babygronckleorange");
															TextureFixGronckleWaitProcedure.execute(world, entity);
														} else if ((entity.getPersistentData().getString("groncklecolor")).equals("blueyellow")) {
															if (entity instanceof BabyGronckleFemaleEntity animatable)
																animatable.setTexture("babygroncleblue");
															TextureFixGronckleWaitProcedure.execute(world, entity);
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
