package net.mcreator.howtoownadragon.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class TextureRenderDistanceFixNadderProcedure {
	@SubscribeEvent
	public static void onEntityTick(LivingEvent.LivingTickEvent event) {
		execute(event, event.getEntity());
	}

	public static void execute(Entity entity) {
		execute(null, entity);
	}

	private static void execute(@Nullable Event event, Entity entity) {
		if (entity == null)
			return;
		if (entity.getType().is(TagKey.create(Registries.ENTITY_TYPE, new ResourceLocation("how_to_own_a_dragon:nadder")))) {
			if (entity instanceof NadderMaleEntity) {
				if ((entity.getPersistentData().getString("naddercolor")).equals("red")) {
					if (entity instanceof NadderMaleEntity animatable)
						animatable.setTexture("rednadder");
				} else if ((entity.getPersistentData().getString("naddercolor")).equals("purple")) {
					if (entity instanceof NadderMaleEntity animatable)
						animatable.setTexture("purplenadder");
				} else if ((entity.getPersistentData().getString("naddercolor")).equals("stormfly")) {
					if (entity instanceof NadderMaleEntity animatable)
						animatable.setTexture("stormfly");
				}
			} else {
				if (entity instanceof NadderFemaleEntity) {
					if ((entity.getPersistentData().getString("naddercolor")).equals("red")) {
						if (entity instanceof NadderFemaleEntity animatable)
							animatable.setTexture("rednadder");
					} else if ((entity.getPersistentData().getString("naddercolor")).equals("purple")) {
						if (entity instanceof NadderFemaleEntity animatable)
							animatable.setTexture("purplenadder");
					} else if ((entity.getPersistentData().getString("naddercolor")).equals("stormfly")) {
						if (entity instanceof NadderFemaleEntity animatable)
							animatable.setTexture("stormfly");
					}
				} else {
					if (entity instanceof AdolescentNadderMaleEntity) {
						if ((entity.getPersistentData().getString("naddercolor")).equals("red")) {
							if (entity instanceof AdolescentNadderMaleEntity animatable)
								animatable.setTexture("rednadder");
						} else if ((entity.getPersistentData().getString("naddercolor")).equals("purple")) {
							if (entity instanceof AdolescentNadderMaleEntity animatable)
								animatable.setTexture("purplenadder");
						} else if ((entity.getPersistentData().getString("naddercolor")).equals("stormfly")) {
							if (entity instanceof AdolescentNadderMaleEntity animatable)
								animatable.setTexture("stormfly");
						}
					} else {
						if (entity instanceof AdolescentNadderFemaleEntity) {
							if ((entity.getPersistentData().getString("naddercolor")).equals("red")) {
								if (entity instanceof AdolescentNadderFemaleEntity animatable)
									animatable.setTexture("rednadder");
							} else if ((entity.getPersistentData().getString("naddercolor")).equals("purple")) {
								if (entity instanceof AdolescentNadderFemaleEntity animatable)
									animatable.setTexture("purplenadder");
							} else if ((entity.getPersistentData().getString("naddercolor")).equals("stormfly")) {
								if (entity instanceof AdolescentNadderFemaleEntity animatable)
									animatable.setTexture("stormfly");
							}
						} else {
							if (entity instanceof JuvenileNadderMaleEntity) {
								if ((entity.getPersistentData().getString("naddercolor")).equals("red")) {
									if (entity instanceof JuvenileNadderMaleEntity animatable)
										animatable.setTexture("rednadder");
								} else if ((entity.getPersistentData().getString("naddercolor")).equals("purple")) {
									if (entity instanceof JuvenileNadderMaleEntity animatable)
										animatable.setTexture("purplenadder");
								} else if ((entity.getPersistentData().getString("naddercolor")).equals("stormfly")) {
									if (entity instanceof JuvenileNadderMaleEntity animatable)
										animatable.setTexture("stormfly");
								}
							} else {
								if (entity instanceof JuvenileNadderFemaleEntity) {
									if ((entity.getPersistentData().getString("naddercolor")).equals("red")) {
										if (entity instanceof JuvenileNadderFemaleEntity animatable)
											animatable.setTexture("rednadder");
									} else if ((entity.getPersistentData().getString("naddercolor")).equals("purple")) {
										if (entity instanceof JuvenileNadderFemaleEntity animatable)
											animatable.setTexture("purplenadder");
									} else if ((entity.getPersistentData().getString("naddercolor")).equals("stormfly")) {
										if (entity instanceof JuvenileNadderFemaleEntity animatable)
											animatable.setTexture("stormfly");
									}
								} else {
									if (entity instanceof BabyNadderMaleEntity) {
										if ((entity.getPersistentData().getString("naddercolor")).equals("red")) {
											if (entity instanceof BabyNadderMaleEntity animatable)
												animatable.setTexture("rednadder");
										} else if ((entity.getPersistentData().getString("naddercolor")).equals("purple")) {
											if (entity instanceof BabyNadderMaleEntity animatable)
												animatable.setTexture("purplenadder");
										} else if ((entity.getPersistentData().getString("naddercolor")).equals("stormfly")) {
											if (entity instanceof BabyNadderMaleEntity animatable)
												animatable.setTexture("stormfly");
										}
									} else {
										if (entity instanceof BabyNadderFemaleEntity) {
											if ((entity.getPersistentData().getString("naddercolor")).equals("red")) {
												if (entity instanceof BabyNadderFemaleEntity animatable)
													animatable.setTexture("rednadder");
											} else if ((entity.getPersistentData().getString("naddercolor")).equals("purple")) {
												if (entity instanceof BabyNadderFemaleEntity animatable)
													animatable.setTexture("purplenadder");
											} else if ((entity.getPersistentData().getString("naddercolor")).equals("stormfly")) {
												if (entity instanceof BabyNadderFemaleEntity animatable)
													animatable.setTexture("stormfly");
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
