package net.mcreator.howtoownadragon.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.living.LivingEvent;

import net.minecraft.world.entity.Entity;
import net.minecraft.tags.TagKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;

import net.mcreator.howtoownadragon.entity.TTMaleEntity;
import net.mcreator.howtoownadragon.entity.TTFemaleEntity;
import net.mcreator.howtoownadragon.entity.JuvenileTTMaleEntity;
import net.mcreator.howtoownadragon.entity.JuvenileTTFemaleEntity;
import net.mcreator.howtoownadragon.entity.JuvenileNadderMaleEntity;
import net.mcreator.howtoownadragon.entity.JuvenileNadderFemaleEntity;
import net.mcreator.howtoownadragon.entity.BabyTTMaleEntity;
import net.mcreator.howtoownadragon.entity.BabyTTFemaleEntity;
import net.mcreator.howtoownadragon.entity.AdolescentTTMaleEntity;
import net.mcreator.howtoownadragon.entity.AdolescentTTFemaleEntity;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class RenderDistanceFixTTProcedure {
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
		if (entity.getType().is(TagKey.create(Registries.ENTITY_TYPE, new ResourceLocation("how_to_own_a_dragon:tt")))) {
			if (entity instanceof TTMaleEntity) {
				if ((entity.getPersistentData().getString("ttcolor")).equals("green")) {
					if (!((entity instanceof TTMaleEntity animatable ? animatable.getTexture() : "null").equals("greentt"))) {
						if (entity instanceof TTMaleEntity animatable)
							animatable.setTexture("greentt");
					}
				} else if ((entity.getPersistentData().getString("ttcolor")).equals("pink")) {
					if (!((entity instanceof TTMaleEntity animatable ? animatable.getTexture() : "null").equals("pinktt"))) {
						if (entity instanceof TTMaleEntity animatable)
							animatable.setTexture("pinktt");
					}
				} else if ((entity.getPersistentData().getString("ttcolor")).equals("turq")) {
					if (!((entity instanceof TTMaleEntity animatable ? animatable.getTexture() : "null").equals("turqtt"))) {
						if (entity instanceof TTMaleEntity animatable)
							animatable.setTexture("turqtt");
					}
				}
			} else {
				if (entity instanceof TTFemaleEntity) {
					if ((entity.getPersistentData().getString("ttcolor")).equals("green")) {
						if (!((entity instanceof TTFemaleEntity animatable ? animatable.getTexture() : "null").equals("greentt"))) {
							if (entity instanceof TTFemaleEntity animatable)
								animatable.setTexture("greentt");
						}
					} else if ((entity.getPersistentData().getString("ttcolor")).equals("pink")) {
						if (!((entity instanceof TTFemaleEntity animatable ? animatable.getTexture() : "null").equals("pinktt"))) {
							if (entity instanceof TTFemaleEntity animatable)
								animatable.setTexture("pinktt");
						}
					} else if ((entity.getPersistentData().getString("ttcolor")).equals("turq")) {
						if (!((entity instanceof TTFemaleEntity animatable ? animatable.getTexture() : "null").equals("turqtt"))) {
							if (entity instanceof TTFemaleEntity animatable)
								animatable.setTexture("turqtt");
						}
					}
				} else {
					if (entity instanceof AdolescentTTMaleEntity) {
						if ((entity.getPersistentData().getString("ttcolor")).equals("green")) {
							if (!((entity instanceof AdolescentTTMaleEntity animatable ? animatable.getTexture() : "null").equals("greentt"))) {
								if (entity instanceof AdolescentTTMaleEntity animatable)
									animatable.setTexture("greentt");
							}
						} else if ((entity.getPersistentData().getString("ttcolor")).equals("pink")) {
							if (!((entity instanceof AdolescentTTMaleEntity animatable ? animatable.getTexture() : "null").equals("pinktt"))) {
								if (entity instanceof AdolescentTTMaleEntity animatable)
									animatable.setTexture("pinktt");
							}
						} else if ((entity.getPersistentData().getString("ttcolor")).equals("turq")) {
							if (!((entity instanceof AdolescentTTMaleEntity animatable ? animatable.getTexture() : "null").equals("turqtt"))) {
								if (entity instanceof AdolescentTTMaleEntity animatable)
									animatable.setTexture("turqtt");
							}
						}
					} else {
						if (entity instanceof AdolescentTTFemaleEntity) {
							if ((entity.getPersistentData().getString("ttcolor")).equals("green")) {
								if (!((entity instanceof AdolescentTTFemaleEntity animatable ? animatable.getTexture() : "null").equals("greentt"))) {
									if (entity instanceof AdolescentTTFemaleEntity animatable)
										animatable.setTexture("greentt");
								}
							} else if ((entity.getPersistentData().getString("ttcolor")).equals("pink")) {
								if (!((entity instanceof AdolescentTTFemaleEntity animatable ? animatable.getTexture() : "null").equals("pinktt"))) {
									if (entity instanceof AdolescentTTFemaleEntity animatable)
										animatable.setTexture("pinktt");
								}
							} else if ((entity.getPersistentData().getString("ttcolor")).equals("turq")) {
								if (!((entity instanceof AdolescentTTFemaleEntity animatable ? animatable.getTexture() : "null").equals("turqtt"))) {
									if (entity instanceof AdolescentTTFemaleEntity animatable)
										animatable.setTexture("turqtt");
								}
							}
						} else {
							if (entity instanceof JuvenileTTMaleEntity) {
								if ((entity.getPersistentData().getString("ttcolor")).equals("green")) {
									if (!((entity instanceof JuvenileTTMaleEntity animatable ? animatable.getTexture() : "null").equals("greentt"))) {
										if (entity instanceof JuvenileNadderMaleEntity animatable)
											animatable.setTexture("greentt");
									}
								} else if ((entity.getPersistentData().getString("ttcolor")).equals("pink")) {
									if (!((entity instanceof JuvenileTTMaleEntity animatable ? animatable.getTexture() : "null").equals("pinktt"))) {
										if (entity instanceof JuvenileNadderMaleEntity animatable)
											animatable.setTexture("pinktt");
									}
								} else if ((entity.getPersistentData().getString("ttcolor")).equals("turq")) {
									if (!((entity instanceof JuvenileTTMaleEntity animatable ? animatable.getTexture() : "null").equals("turqtt"))) {
										if (entity instanceof JuvenileNadderMaleEntity animatable)
											animatable.setTexture("turqtt");
									}
								}
							} else {
								if (entity instanceof JuvenileTTFemaleEntity) {
									if ((entity.getPersistentData().getString("ttcolor")).equals("green")) {
										if (!((entity instanceof JuvenileTTFemaleEntity animatable ? animatable.getTexture() : "null").equals("greentt"))) {
											if (entity instanceof JuvenileNadderFemaleEntity animatable)
												animatable.setTexture("greentt");
										}
									} else if ((entity.getPersistentData().getString("ttcolor")).equals("pink")) {
										if (!((entity instanceof JuvenileTTFemaleEntity animatable ? animatable.getTexture() : "null").equals("pinktt"))) {
											if (entity instanceof JuvenileNadderFemaleEntity animatable)
												animatable.setTexture("pinktt");
										}
									} else if ((entity.getPersistentData().getString("ttcolor")).equals("turq")) {
										if (!((entity instanceof JuvenileTTFemaleEntity animatable ? animatable.getTexture() : "null").equals("turqtt"))) {
											if (entity instanceof JuvenileNadderFemaleEntity animatable)
												animatable.setTexture("turqtt");
										}
									}
								} else {
									if (entity instanceof BabyTTMaleEntity) {
										if ((entity.getPersistentData().getString("ttcolor")).equals("green")) {
											if (!((entity instanceof BabyTTMaleEntity animatable ? animatable.getTexture() : "null").equals("greentt"))) {
												if (entity instanceof BabyTTMaleEntity animatable)
													animatable.setTexture("greentt");
											}
										} else if ((entity.getPersistentData().getString("ttcolor")).equals("pink")) {
											if (!((entity instanceof BabyTTMaleEntity animatable ? animatable.getTexture() : "null").equals("pinktt"))) {
												if (entity instanceof BabyTTMaleEntity animatable)
													animatable.setTexture("pinktt");
											}
										} else if ((entity.getPersistentData().getString("ttcolor")).equals("turq")) {
											if (!((entity instanceof BabyTTMaleEntity animatable ? animatable.getTexture() : "null").equals("turqtt"))) {
												if (entity instanceof BabyTTMaleEntity animatable)
													animatable.setTexture("turqtt");
											}
										}
									} else {
										if (entity instanceof BabyTTFemaleEntity) {
											if ((entity.getPersistentData().getString("ttcolor")).equals("green")) {
												if (!((entity instanceof BabyTTFemaleEntity animatable ? animatable.getTexture() : "null").equals("greentt"))) {
													if (entity instanceof BabyTTFemaleEntity animatable)
														animatable.setTexture("greentt");
												}
											} else if ((entity.getPersistentData().getString("ttcolor")).equals("pink")) {
												if (!((entity instanceof BabyTTFemaleEntity animatable ? animatable.getTexture() : "null").equals("pinktt"))) {
													if (entity instanceof BabyTTFemaleEntity animatable)
														animatable.setTexture("pinktt");
												}
											} else if ((entity.getPersistentData().getString("ttcolor")).equals("turq")) {
												if (!((entity instanceof BabyTTFemaleEntity animatable ? animatable.getTexture() : "null").equals("turqtt"))) {
													if (entity instanceof BabyTTFemaleEntity animatable)
														animatable.setTexture("turqtt");
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
}
