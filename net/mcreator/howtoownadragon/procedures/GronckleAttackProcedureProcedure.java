package net.mcreator.howtoownadragon.procedures;

import net.mcreator.howtoownadragon.entity.GronckleAttackEntity;
import net.mcreator.howtoownadragon.init.HowToOwnADragonModEntities;
import net.mcreator.howtoownadragon.init.HowToOwnADragonModMobEffects;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.entity.projectile.Projectile;
import net.minecraft.world.level.Level;

public class GronckleAttackProcedureProcedure {
   public static void execute(Entity entity) {
      if (entity != null) {
         if (entity.m_20202_().m_6084_()) {
            Entity _shootFrom = entity.m_20202_();
            Level projectileLevel;
            Projectile _entityToSpawn;
            if (_shootFrom instanceof LivingEntity) {
               LivingEntity _livEnt3 = (LivingEntity)_shootFrom;
               if (_livEnt3.m_21023_((MobEffect)HowToOwnADragonModMobEffects.ATTACK_COOLDOWN.get())) {
                  if (entity.m_20202_().getPersistentData().m_128459_("GronckleAttack") == 1.0D) {
                     _shootFrom = entity.m_20202_();
                     projectileLevel = _shootFrom.f_19853_;
                     if (!projectileLevel.m_5776_()) {
                        _entityToSpawn = ((<undefinedtype>)(new Object() {
                           public Projectile getArrow(Level level, Entity shooter, float damage, int knockback) {
                              AbstractArrow entityToSpawn = new GronckleAttackEntity((EntityType)HowToOwnADragonModEntities.GRONCKLE_ATTACK.get(), level);
                              entityToSpawn.m_5602_(shooter);
                              entityToSpawn.m_36781_((double)damage);
                              entityToSpawn.m_36735_(knockback);
                              entityToSpawn.m_20225_(true);
                              entityToSpawn.m_20254_(100);
                              entityToSpawn.m_36762_(true);
                              return entityToSpawn;
                           }
                        })).getArrow(projectileLevel, entity.m_20202_(), 2.0F, 1);
                        _entityToSpawn.m_6034_(_shootFrom.m_20185_(), _shootFrom.m_20188_() - 0.1D, _shootFrom.m_20189_());
                        _entityToSpawn.m_6686_(_shootFrom.m_20154_().f_82479_, _shootFrom.m_20154_().f_82480_, _shootFrom.m_20154_().f_82481_, 1.0F, 0.0F);
                        projectileLevel.m_7967_(_entityToSpawn);
                     }

                     entity.m_20202_().getPersistentData().m_128347_("GronckleAttack", 2.0D);
                     return;
                  } else if (entity.m_20202_().getPersistentData().m_128459_("GronckleAttack") == 2.0D) {
                     _shootFrom = entity.m_20202_();
                     projectileLevel = _shootFrom.f_19853_;
                     if (!projectileLevel.m_5776_()) {
                        _entityToSpawn = ((<undefinedtype>)(new Object() {
                           public Projectile getArrow(Level level, Entity shooter, float damage, int knockback) {
                              AbstractArrow entityToSpawn = new GronckleAttackEntity((EntityType)HowToOwnADragonModEntities.GRONCKLE_ATTACK.get(), level);
                              entityToSpawn.m_5602_(shooter);
                              entityToSpawn.m_36781_((double)damage);
                              entityToSpawn.m_36735_(knockback);
                              entityToSpawn.m_20225_(true);
                              entityToSpawn.m_20254_(100);
                              entityToSpawn.m_36762_(true);
                              return entityToSpawn;
                           }
                        })).getArrow(projectileLevel, entity.m_20202_(), 2.0F, 1);
                        _entityToSpawn.m_6034_(_shootFrom.m_20185_(), _shootFrom.m_20188_() - 0.1D, _shootFrom.m_20189_());
                        _entityToSpawn.m_6686_(_shootFrom.m_20154_().f_82479_, _shootFrom.m_20154_().f_82480_, _shootFrom.m_20154_().f_82481_, 1.0F, 0.0F);
                        projectileLevel.m_7967_(_entityToSpawn);
                     }

                     entity.m_20202_().getPersistentData().m_128347_("GronckleAttack", 3.0D);
                     return;
                  } else if (entity.m_20202_().getPersistentData().m_128459_("GronckleAttack") == 3.0D) {
                     _shootFrom = entity.m_20202_();
                     projectileLevel = _shootFrom.f_19853_;
                     if (!projectileLevel.m_5776_()) {
                        _entityToSpawn = ((<undefinedtype>)(new Object() {
                           public Projectile getArrow(Level level, Entity shooter, float damage, int knockback) {
                              AbstractArrow entityToSpawn = new GronckleAttackEntity((EntityType)HowToOwnADragonModEntities.GRONCKLE_ATTACK.get(), level);
                              entityToSpawn.m_5602_(shooter);
                              entityToSpawn.m_36781_((double)damage);
                              entityToSpawn.m_36735_(knockback);
                              entityToSpawn.m_20225_(true);
                              entityToSpawn.m_20254_(100);
                              entityToSpawn.m_36762_(true);
                              return entityToSpawn;
                           }
                        })).getArrow(projectileLevel, entity.m_20202_(), 2.0F, 1);
                        _entityToSpawn.m_6034_(_shootFrom.m_20185_(), _shootFrom.m_20188_() - 0.1D, _shootFrom.m_20189_());
                        _entityToSpawn.m_6686_(_shootFrom.m_20154_().f_82479_, _shootFrom.m_20154_().f_82480_, _shootFrom.m_20154_().f_82481_, 1.0F, 0.0F);
                        projectileLevel.m_7967_(_entityToSpawn);
                     }

                     entity.m_20202_().getPersistentData().m_128347_("GronckleAttack", 4.0D);
                     return;
                  } else {
                     if (entity.m_20202_().getPersistentData().m_128459_("GronckleAttack") == 5.0D) {
                        _shootFrom = entity.m_20202_();
                        projectileLevel = _shootFrom.f_19853_;
                        if (!projectileLevel.m_5776_()) {
                           _entityToSpawn = ((<undefinedtype>)(new Object() {
                              public Projectile getArrow(Level level, Entity shooter, float damage, int knockback) {
                                 AbstractArrow entityToSpawn = new GronckleAttackEntity((EntityType)HowToOwnADragonModEntities.GRONCKLE_ATTACK.get(), level);
                                 entityToSpawn.m_5602_(shooter);
                                 entityToSpawn.m_36781_((double)damage);
                                 entityToSpawn.m_36735_(knockback);
                                 entityToSpawn.m_20225_(true);
                                 entityToSpawn.m_20254_(100);
                                 entityToSpawn.m_36762_(true);
                                 return entityToSpawn;
                              }
                           })).getArrow(projectileLevel, entity.m_20202_(), 2.0F, 1);
                           _entityToSpawn.m_6034_(_shootFrom.m_20185_(), _shootFrom.m_20188_() - 0.1D, _shootFrom.m_20189_());
                           _entityToSpawn.m_6686_(_shootFrom.m_20154_().f_82479_, _shootFrom.m_20154_().f_82480_, _shootFrom.m_20154_().f_82481_, 1.0F, 0.0F);
                           projectileLevel.m_7967_(_entityToSpawn);
                        }

                        entity.m_20202_().getPersistentData().m_128347_("GronckleAttack", 0.0D);
                     } else if (entity.m_20202_().getPersistentData().m_128459_("GronckleAttack") == 4.0D) {
                        _shootFrom = entity.m_20202_();
                        projectileLevel = _shootFrom.f_19853_;
                        if (!projectileLevel.m_5776_()) {
                           _entityToSpawn = ((<undefinedtype>)(new Object() {
                              public Projectile getArrow(Level level, Entity shooter, float damage, int knockback) {
                                 AbstractArrow entityToSpawn = new GronckleAttackEntity((EntityType)HowToOwnADragonModEntities.GRONCKLE_ATTACK.get(), level);
                                 entityToSpawn.m_5602_(shooter);
                                 entityToSpawn.m_36781_((double)damage);
                                 entityToSpawn.m_36735_(knockback);
                                 entityToSpawn.m_20225_(true);
                                 entityToSpawn.m_20254_(100);
                                 entityToSpawn.m_36762_(true);
                                 return entityToSpawn;
                              }
                           })).getArrow(projectileLevel, entity.m_20202_(), 2.0F, 1);
                           _entityToSpawn.m_6034_(_shootFrom.m_20185_(), _shootFrom.m_20188_() - 0.1D, _shootFrom.m_20189_());
                           _entityToSpawn.m_6686_(_shootFrom.m_20154_().f_82479_, _shootFrom.m_20154_().f_82480_, _shootFrom.m_20154_().f_82481_, 1.0F, 0.0F);
                           projectileLevel.m_7967_(_entityToSpawn);
                        }

                        entity.m_20202_().getPersistentData().m_128347_("GronckleAttack", 5.0D);
                        return;
                     }

                     return;
                  }
               }
            }

            _shootFrom = entity.m_20202_();
            projectileLevel = _shootFrom.f_19853_;
            if (!projectileLevel.m_5776_()) {
               _entityToSpawn = ((<undefinedtype>)(new Object() {
                  public Projectile getArrow(Level level, Entity shooter, float damage, int knockback) {
                     AbstractArrow entityToSpawn = new GronckleAttackEntity((EntityType)HowToOwnADragonModEntities.GRONCKLE_ATTACK.get(), level);
                     entityToSpawn.m_5602_(shooter);
                     entityToSpawn.m_36781_((double)damage);
                     entityToSpawn.m_36735_(knockback);
                     entityToSpawn.m_20225_(true);
                     entityToSpawn.m_20254_(100);
                     entityToSpawn.m_36762_(true);
                     return entityToSpawn;
                  }
               })).getArrow(projectileLevel, entity.m_20202_(), 2.0F, 1);
               _entityToSpawn.m_6034_(_shootFrom.m_20185_(), _shootFrom.m_20188_() - 0.1D, _shootFrom.m_20189_());
               _entityToSpawn.m_6686_(_shootFrom.m_20154_().f_82479_, _shootFrom.m_20154_().f_82480_, _shootFrom.m_20154_().f_82481_, 1.0F, 0.0F);
               projectileLevel.m_7967_(_entityToSpawn);
            }

            entity.m_20202_().getPersistentData().m_128347_("GronckleAttack", 1.0D);
            Entity var6 = entity.m_20202_();
            if (var6 instanceof LivingEntity) {
               LivingEntity _entity = (LivingEntity)var6;
               if (!_entity.f_19853_.m_5776_()) {
                  _entity.m_7292_(new MobEffectInstance((MobEffect)HowToOwnADragonModMobEffects.ATTACK_COOLDOWN.get(), 600, 1, false, false));
               }
            }
         }

      }
   }
}
