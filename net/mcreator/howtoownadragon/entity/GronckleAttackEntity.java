package net.mcreator.howtoownadragon.entity;

import net.mcreator.howtoownadragon.init.HowToOwnADragonModEntities;
import net.mcreator.howtoownadragon.procedures.GronckleAttackProjectileHitsLivingEntityProcedure;
import net.mcreator.howtoownadragon.procedures.GronckleExplodeAtBlockProcedure;
import net.minecraft.network.protocol.Packet;
import net.minecraft.network.protocol.game.ClientGamePacketListener;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundSource;
import net.minecraft.util.RandomSource;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.entity.projectile.ItemSupplier;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.EntityHitResult;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.network.NetworkHooks;
import net.minecraftforge.network.PlayMessages.SpawnEntity;
import net.minecraftforge.registries.ForgeRegistries;

@OnlyIn(
   value = Dist.CLIENT,
   _interface = ItemSupplier.class
)
public class GronckleAttackEntity extends AbstractArrow implements ItemSupplier {
   public GronckleAttackEntity(SpawnEntity packet, Level world) {
      super((EntityType)HowToOwnADragonModEntities.GRONCKLE_ATTACK.get(), world);
   }

   public GronckleAttackEntity(EntityType<? extends GronckleAttackEntity> type, Level world) {
      super(type, world);
   }

   public GronckleAttackEntity(EntityType<? extends GronckleAttackEntity> type, double x, double y, double z, Level world) {
      super(type, x, y, z, world);
   }

   public GronckleAttackEntity(EntityType<? extends GronckleAttackEntity> type, LivingEntity entity, Level world) {
      super(type, entity, world);
   }

   public Packet<ClientGamePacketListener> m_5654_() {
      return NetworkHooks.getEntitySpawningPacket(this);
   }

   @OnlyIn(Dist.CLIENT)
   public ItemStack m_7846_() {
      return new ItemStack(Items.f_42412_);
   }

   protected ItemStack m_7941_() {
      return new ItemStack(Items.f_42412_);
   }

   protected void m_7761_(LivingEntity entity) {
      super.m_7761_(entity);
      entity.m_21317_(entity.m_21234_() - 1);
   }

   public void m_5790_(EntityHitResult entityHitResult) {
      super.m_5790_(entityHitResult);
      GronckleAttackProjectileHitsLivingEntityProcedure.execute(this.f_19853_, this.m_20185_(), this.m_20186_(), this.m_20189_(), entityHitResult.m_82443_());
   }

   public void m_8060_(BlockHitResult blockHitResult) {
      super.m_8060_(blockHitResult);
      GronckleExplodeAtBlockProcedure.execute(this.f_19853_, (double)blockHitResult.m_82425_().m_123341_(), (double)blockHitResult.m_82425_().m_123342_(), (double)blockHitResult.m_82425_().m_123343_());
   }

   public void m_8119_() {
      super.m_8119_();
      if (this.f_36703_) {
         this.m_146870_();
      }

   }

   public static GronckleAttackEntity shoot(Level world, LivingEntity entity, RandomSource random, float power, double damage, int knockback) {
      GronckleAttackEntity entityarrow = new GronckleAttackEntity((EntityType)HowToOwnADragonModEntities.GRONCKLE_ATTACK.get(), entity, world);
      entityarrow.m_6686_(entity.m_20252_(1.0F).f_82479_, entity.m_20252_(1.0F).f_82480_, entity.m_20252_(1.0F).f_82481_, power * 2.0F, 0.0F);
      entityarrow.m_20225_(true);
      entityarrow.m_36762_(true);
      entityarrow.m_36781_(damage);
      entityarrow.m_36735_(knockback);
      entityarrow.m_20254_(100);
      world.m_7967_(entityarrow);
      world.m_6263_((Player)null, entity.m_20185_(), entity.m_20186_(), entity.m_20189_(), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.arrow.shoot")), SoundSource.PLAYERS, 1.0F, 1.0F / (random.m_188501_() * 0.5F + 1.0F) + power / 2.0F);
      return entityarrow;
   }

   public static GronckleAttackEntity shoot(LivingEntity entity, LivingEntity target) {
      GronckleAttackEntity entityarrow = new GronckleAttackEntity((EntityType)HowToOwnADragonModEntities.GRONCKLE_ATTACK.get(), entity, entity.f_19853_);
      double dx = target.m_20185_() - entity.m_20185_();
      double dy = target.m_20186_() + (double)target.m_20192_() - 1.1D;
      double dz = target.m_20189_() - entity.m_20189_();
      entityarrow.m_6686_(dx, dy - entityarrow.m_20186_() + Math.hypot(dx, dz) * 0.20000000298023224D, dz, 2.0F, 12.0F);
      entityarrow.m_20225_(true);
      entityarrow.m_36781_(5.0D);
      entityarrow.m_36735_(5);
      entityarrow.m_36762_(true);
      entityarrow.m_20254_(100);
      entity.f_19853_.m_7967_(entityarrow);
      entity.f_19853_.m_6263_((Player)null, entity.m_20185_(), entity.m_20186_(), entity.m_20189_(), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.arrow.shoot")), SoundSource.PLAYERS, 1.0F, 1.0F / (RandomSource.m_216327_().m_188501_() * 0.5F + 1.0F));
      return entityarrow;
   }
}
