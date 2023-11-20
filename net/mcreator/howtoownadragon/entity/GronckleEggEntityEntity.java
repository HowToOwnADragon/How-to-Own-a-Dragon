package net.mcreator.howtoownadragon.entity;

import net.mcreator.howtoownadragon.init.HowToOwnADragonModEntities;
import net.mcreator.howtoownadragon.procedures.EggGravityProcedure;
import net.mcreator.howtoownadragon.procedures.GronckleEntityIsHurtProcedure;
import net.minecraft.network.protocol.Packet;
import net.minecraft.network.protocol.game.ClientGamePacketListener;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.damagesource.DamageTypes;
import net.minecraft.world.entity.AreaEffectCloud;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.MobType;
import net.minecraft.world.entity.PathfinderMob;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier.Builder;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.entity.projectile.ThrownPotion;
import net.minecraft.world.level.Level;
import net.minecraftforge.network.NetworkHooks;
import net.minecraftforge.network.PlayMessages.SpawnEntity;

public class GronckleEggEntityEntity extends PathfinderMob {
   public GronckleEggEntityEntity(SpawnEntity packet, Level world) {
      this((EntityType)HowToOwnADragonModEntities.GRONCKLE_EGG_ENTITY.get(), world);
   }

   public GronckleEggEntityEntity(EntityType<GronckleEggEntityEntity> type, Level world) {
      super(type, world);
      this.f_19793_ = 0.6F;
      this.f_21364_ = 0;
      this.m_21557_(true);
      this.m_21530_();
   }

   public Packet<ClientGamePacketListener> m_5654_() {
      return NetworkHooks.getEntitySpawningPacket(this);
   }

   public MobType m_6336_() {
      return MobType.f_21640_;
   }

   public boolean m_6785_(double distanceToClosestPlayer) {
      return false;
   }

   public boolean m_6469_(DamageSource source, float amount) {
      GronckleEntityIsHurtProcedure.execute(this.f_19853_, this, source.m_7639_());
      if (source.m_276093_(DamageTypes.f_268631_)) {
         return false;
      } else if (source.m_7640_() instanceof AbstractArrow) {
         return false;
      } else if (source.m_7640_() instanceof Player) {
         return false;
      } else if (!(source.m_7640_() instanceof ThrownPotion) && !(source.m_7640_() instanceof AreaEffectCloud)) {
         if (source.m_276093_(DamageTypes.f_268671_)) {
            return false;
         } else if (source.m_276093_(DamageTypes.f_268585_)) {
            return false;
         } else if (source.m_276093_(DamageTypes.f_268722_)) {
            return false;
         } else if (source.m_276093_(DamageTypes.f_268450_)) {
            return false;
         } else if (source.m_276093_(DamageTypes.f_268714_)) {
            return false;
         } else if (source.m_276093_(DamageTypes.f_268482_)) {
            return false;
         } else if (source.m_276093_(DamageTypes.f_268493_)) {
            return false;
         } else {
            return source.m_276093_(DamageTypes.f_268641_) ? false : super.m_6469_(source, amount);
         }
      } else {
         return false;
      }
   }

   public InteractionResult m_6071_(Player sourceentity, InteractionHand hand) {
      sourceentity.m_21120_(hand);
      InteractionResult retval = InteractionResult.m_19078_(this.f_19853_.m_5776_());
      super.m_6071_(sourceentity, hand);
      double x = this.m_20185_();
      double y = this.m_20186_();
      double z = this.m_20189_();
      Level world = this.f_19853_;
      GronckleEntityIsHurtProcedure.execute(world, this, sourceentity);
      return retval;
   }

   public void m_6075_() {
      super.m_6075_();
      EggGravityProcedure.execute(this);
   }

   public boolean m_7337_(Entity entity) {
      return true;
   }

   public boolean m_5829_() {
      return true;
   }

   public static void init() {
   }

   public static Builder createAttributes() {
      Builder builder = Mob.m_21552_();
      builder = builder.m_22268_(Attributes.f_22279_, 0.3D);
      builder = builder.m_22268_(Attributes.f_22276_, 10.0D);
      builder = builder.m_22268_(Attributes.f_22284_, 0.0D);
      builder = builder.m_22268_(Attributes.f_22281_, 3.0D);
      builder = builder.m_22268_(Attributes.f_22277_, 16.0D);
      return builder;
   }
}
