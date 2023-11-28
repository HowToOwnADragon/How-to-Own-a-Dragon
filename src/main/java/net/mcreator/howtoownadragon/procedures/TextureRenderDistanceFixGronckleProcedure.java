package net.mcreator.howtoownadragon.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class TextureRenderDistanceFixGronckleProcedure {
	@SubscribeEvent
	public static void onEntityTick(LivingEvent.LivingTickEvent event) {
		execute(event, event.getEntity().level, event.getEntity());
	}

	public static void execute(LevelAccessor world, Entity entity) {
		execute(null, world, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		HowToOwnADragonMod.queueServerWork(1, () -> {
			if (entity.getType().is(TagKey.create(Registries.ENTITY_TYPE, new ResourceLocation("how_to_own_a_dragon:gronckles")))) {
				if (entity instanceof GronckleMaleEntity) {
					if ((entity.getPersistentData().getString("groncklecolor")).equals("pink")) {
						if (!((entity instanceof GronckleMaleEntity animatable ? animatable.getTexture() : "null").equals("groncklepink"))) {
							if (entity instanceof GronckleMaleEntity animatable)
								animatable.setTexture("groncklepink");
						}
					} else if ((entity.getPersistentData().getString("groncklecolor")).equals("orangered")) {
						if (!((entity instanceof GronckleMaleEntity animatable ? animatable.getTexture() : "null").equals("gronckleorangered"))) {
							if (entity instanceof GronckleMaleEntity animatable)
								animatable.setTexture("gronckleorangered");
						}
					} else if ((entity.getPersistentData().getString("groncklecolor")).equals("blueyellow")) {
						if (!((entity instanceof GronckleMaleEntity animatable ? animatable.getTexture() : "null").equals("gronckleblueyellow"))) {
							if (entity instanceof GronckleMaleEntity animatable)
								animatable.setTexture("gronckleblueyellow");
						}
					} else if ((entity.getPersistentData().getString("groncklecolor")).equals("meatlug")) {
						if (!((entity instanceof GronckleMaleEntity animatable ? animatable.getTexture() : "null").equals("meatlug"))) {
							if (entity instanceof GronckleMaleEntity animatable)
								animatable.setTexture("meatlug");
						}
					}
				} else {
					if (entity instanceof GronckleFemaleEntity) {
						if ((entity.getPersistentData().getString("groncklecolor")).equals("pink")) {
							if (!((entity instanceof GronckleFemaleEntity animatable ? animatable.getTexture() : "null").equals("groncklepink"))) {
								if (entity instanceof GronckleFemaleEntity animatable)
									animatable.setTexture("groncklepink");
							}
						} else if ((entity.getPersistentData().getString("groncklecolor")).equals("orangered")) {
							if (!((entity instanceof GronckleFemaleEntity animatable ? animatable.getTexture() : "null").equals("gronckleorangered"))) {
								if (entity instanceof GronckleFemaleEntity animatable)
									animatable.setTexture("gronckleorangered");
							}
						} else if ((entity.getPersistentData().getString("groncklecolor")).equals("blueyellow")) {
							if (!((entity instanceof GronckleFemaleEntity animatable ? animatable.getTexture() : "null").equals("gronckleblueyellow"))) {
								if (entity instanceof GronckleFemaleEntity animatable)
									animatable.setTexture("gronckleblueyellow");
							}
						} else if ((entity.getPersistentData().getString("groncklecolor")).equals("meatlug")) {
							if (!((entity instanceof GronckleFemaleEntity animatable ? animatable.getTexture() : "null").equals("meatlug"))) {
								if (entity instanceof GronckleFemaleEntity animatable)
									animatable.setTexture("meatlug");
							}
						}
					} else {
						if (entity instanceof AdolescentGronckleMaleEntity) {
							if ((entity.getPersistentData().getString("groncklecolor")).equals("pink")) {
								if (!((entity instanceof AdolescentGronckleMaleEntity animatable ? animatable.getTexture() : "null").equals("adogroncklepink"))) {
									if (entity instanceof AdolescentGronckleMaleEntity animatable)
										animatable.setTexture("adogroncklepink");
								}
							} else if ((entity.getPersistentData().getString("groncklecolor")).equals("meatlug")) {
								if (!((entity instanceof AdolescentGronckleMaleEntity animatable ? animatable.getTexture() : "null").equals("adomeatlug"))) {
									if (entity instanceof AdolescentGronckleMaleEntity animatable)
										animatable.setTexture("adomeatlug");
								}
							} else if ((entity.getPersistentData().getString("groncklecolor")).equals("orangered")) {
								if (!((entity instanceof AdolescentGronckleMaleEntity animatable ? animatable.getTexture() : "null").equals("adogronckleorangered"))) {
									if (entity instanceof AdolescentGronckleMaleEntity animatable)
										animatable.setTexture("adogronckleorangered");
								}
							} else if ((entity.getPersistentData().getString("groncklecolor")).equals("blueyellow")) {
								if (!((entity instanceof AdolescentGronckleMaleEntity animatable ? animatable.getTexture() : "null").equals("adogronckleblueyellow"))) {
									if (entity instanceof AdolescentGronckleMaleEntity animatable)
										animatable.setTexture("adogronckleblueyellow");
								}
							}
						} else {
							if (entity instanceof AdolescentGronckleFemaleEntity) {
								if ((entity.getPersistentData().getString("groncklecolor")).equals("pink")) {
									if (!((entity instanceof AdolescentGronckleFemaleEntity animatable ? animatable.getTexture() : "null").equals("adogroncklepink"))) {
										if (entity instanceof AdolescentGronckleFemaleEntity animatable)
											animatable.setTexture("adogroncklepink");
									}
								} else if ((entity.getPersistentData().getString("groncklecolor")).equals("meatlug")) {
									if (!((entity instanceof AdolescentGronckleFemaleEntity animatable ? animatable.getTexture() : "null").equals("adomeatlug"))) {
										if (entity instanceof AdolescentGronckleFemaleEntity animatable)
											animatable.setTexture("adomeatlug");
									}
								} else if ((entity.getPersistentData().getString("groncklecolor")).equals("orangered")) {
									if (!((entity instanceof AdolescentGronckleFemaleEntity animatable ? animatable.getTexture() : "null").equals("adogronckleorangered"))) {
										if (entity instanceof AdolescentGronckleFemaleEntity animatable)
											animatable.setTexture("adogronckleorangered");
									}
								} else if ((entity.getPersistentData().getString("groncklecolor")).equals("blueyellow")) {
									if (!((entity instanceof AdolescentGronckleFemaleEntity animatable ? animatable.getTexture() : "null").equals("adogronckleblueyellow"))) {
										if (entity instanceof AdolescentGronckleFemaleEntity animatable)
											animatable.setTexture("adogronckleblueyellow");
									}
								}
							} else {
								if (entity instanceof JuvenileGronckleMaleEntity) {
									if ((entity.getPersistentData().getString("groncklecolor")).equals("pink")) {
										if (!((entity instanceof JuvenileGronckleMaleEntity animatable ? animatable.getTexture() : "null").equals("juvigroncklepink"))) {
											if (entity instanceof JuvenileGronckleMaleEntity animatable)
												animatable.setTexture("juvigroncklepink");
										}
									} else if ((entity.getPersistentData().getString("groncklecolor")).equals("meatlug")) {
										if (!((entity instanceof JuvenileGronckleMaleEntity animatable ? animatable.getTexture() : "null").equals("juvimeatlug"))) {
											if (entity instanceof JuvenileGronckleMaleEntity animatable)
												animatable.setTexture("juvimeatlug");
										}
									} else if ((entity.getPersistentData().getString("groncklecolor")).equals("orangered")) {
										if (!((entity instanceof JuvenileGronckleMaleEntity animatable ? animatable.getTexture() : "null").equals("juvigronckleorangered"))) {
											if (entity instanceof JuvenileGronckleMaleEntity animatable)
												animatable.setTexture("juvigronckleorangered");
										}
									} else if ((entity.getPersistentData().getString("groncklecolor")).equals("blueyellow")) {
										if (!((entity instanceof JuvenileGronckleMaleEntity animatable ? animatable.getTexture() : "null").equals("juvigronckleblueyellow"))) {
											if (entity instanceof JuvenileGronckleMaleEntity animatable)
												animatable.setTexture("juvigronckleblueyellow");
										}
									}
								} else {
									if (entity instanceof JuvenileGronckleFemaleEntity) {
										if ((entity.getPersistentData().getString("groncklecolor")).equals("pink")) {
											if (!((entity instanceof JuvenileGronckleFemaleEntity animatable ? animatable.getTexture() : "null").equals("juvigroncklepink"))) {
												if (entity instanceof JuvenileGronckleFemaleEntity animatable)
													animatable.setTexture("juvigroncklepink");
											}
										} else if ((entity.getPersistentData().getString("groncklecolor")).equals("meatlug")) {
											if (!((entity instanceof JuvenileGronckleFemaleEntity animatable ? animatable.getTexture() : "null").equals("juvimeatlug"))) {
												if (entity instanceof JuvenileGronckleFemaleEntity animatable)
													animatable.setTexture("juvimeatlug");
											}
										} else if ((entity.getPersistentData().getString("groncklecolor")).equals("orangered")) {
											if (!((entity instanceof JuvenileGronckleFemaleEntity animatable ? animatable.getTexture() : "null").equals("juvigronckleorangered"))) {
												if (entity instanceof JuvenileGronckleFemaleEntity animatable)
													animatable.setTexture("juvigronckleorangered");
											}
										} else if ((entity.getPersistentData().getString("groncklecolor")).equals("blueyellow")) {
											if (!((entity instanceof JuvenileGronckleFemaleEntity animatable ? animatable.getTexture() : "null").equals("juvigronckleblueyellow"))) {
												if (entity instanceof JuvenileGronckleFemaleEntity animatable)
													animatable.setTexture("juvigronckleblueyellow");
											}
										}
									} else {
										if (entity instanceof BabyGronckleMaleEntity) {
											if ((entity.getPersistentData().getString("groncklecolor")).equals("pink")) {
												if (!((entity instanceof BabyGronckleMaleEntity animatable ? animatable.getTexture() : "null").equals("babygroncklepink"))) {
													if (entity instanceof BabyGronckleMaleEntity animatable)
														animatable.setTexture("babygroncklepink");
												}
											} else if ((entity.getPersistentData().getString("groncklecolor")).equals("meatlug")) {
												if (!((entity instanceof BabyGronckleMaleEntity animatable ? animatable.getTexture() : "null").equals("babymeatlug"))) {
													if (entity instanceof BabyGronckleMaleEntity animatable)
														animatable.setTexture("babymeatlug");
												}
											} else if ((entity.getPersistentData().getString("groncklecolor")).equals("orangered")) {
												if (!((entity instanceof BabyGronckleMaleEntity animatable ? animatable.getTexture() : "null").equals("babygronckleorange"))) {
													if (entity instanceof BabyGronckleMaleEntity animatable)
														animatable.setTexture("babygronckleorange");
												}
											} else if ((entity.getPersistentData().getString("groncklecolor")).equals("blueyellow")) {
												if (!((entity instanceof BabyGronckleMaleEntity animatable ? animatable.getTexture() : "null").equals("babygroncleblue"))) {
													if (entity instanceof BabyGronckleMaleEntity animatable)
														animatable.setTexture("babygroncleblue");
												}
											}
										} else {
											if (entity instanceof BabyGronckleFemaleEntity) {
												if ((entity.getPersistentData().getString("groncklecolor")).equals("pink")) {
													if (!((entity instanceof BabyGronckleFemaleEntity animatable ? animatable.getTexture() : "null").equals("babygroncklepink"))) {
														if (entity instanceof BabyGronckleFemaleEntity animatable)
															animatable.setTexture("babygroncklepink");
													}
												} else if ((entity.getPersistentData().getString("groncklecolor")).equals("meatlug")) {
													if (!((entity instanceof BabyGronckleFemaleEntity animatable ? animatable.getTexture() : "null").equals("babymeatlug"))) {
														if (entity instanceof BabyGronckleFemaleEntity animatable)
															animatable.setTexture("babymeatlug");
													}
												} else if ((entity.getPersistentData().getString("groncklecolor")).equals("orangered")) {
													if (!((entity instanceof BabyGronckleFemaleEntity animatable ? animatable.getTexture() : "null").equals("babygronckleorange"))) {
														if (entity instanceof BabyGronckleFemaleEntity animatable)
															animatable.setTexture("babygronckleorange");
													}
												} else if ((entity.getPersistentData().getString("groncklecolor")).equals("blueyellow")) {
													if (!((entity instanceof BabyGronckleFemaleEntity animatable ? animatable.getTexture() : "null").equals("babygroncleblue"))) {
														if (entity instanceof BabyGronckleFemaleEntity animatable)
															animatable.setTexture("babygroncleblue");
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
