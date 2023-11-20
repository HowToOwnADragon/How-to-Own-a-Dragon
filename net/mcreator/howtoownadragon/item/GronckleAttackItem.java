package net.mcreator.howtoownadragon.item;

import net.mcreator.howtoownadragon.entity.GronckleAttackEntity;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.projectile.AbstractArrow.Pickup;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ProjectileWeaponItem;
import net.minecraft.world.item.UseAnim;
import net.minecraft.world.item.Item.Properties;
import net.minecraft.world.level.Level;

public class GronckleAttackItem extends Item {
   public GronckleAttackItem() {
      super((new Properties()).m_41503_(100));
   }

   public InteractionResultHolder<ItemStack> m_7203_(Level world, Player entity, InteractionHand hand) {
      entity.m_6672_(hand);
      return new InteractionResultHolder(InteractionResult.SUCCESS, entity.m_21120_(hand));
   }

   public UseAnim m_6164_(ItemStack itemstack) {
      return UseAnim.NONE;
   }

   public int m_8105_(ItemStack itemstack) {
      return 72000;
   }

   public void m_5551_(ItemStack itemstack, Level world, LivingEntity entityLiving, int timeLeft) {
      if (!world.m_5776_() && entityLiving instanceof ServerPlayer) {
         ServerPlayer entity = (ServerPlayer)entityLiving;
         double x = entity.m_20185_();
         double y = entity.m_20186_();
         double z = entity.m_20189_();
         ItemStack stack = ProjectileWeaponItem.m_43010_(entity, (e) -> {
            return e.m_41720_() == Items.f_42412_;
         });
         if (stack == ItemStack.f_41583_) {
            for(int i = 0; i < entity.m_150109_().f_35974_.size(); ++i) {
               ItemStack teststack = (ItemStack)entity.m_150109_().f_35974_.get(i);
               if (teststack != null && teststack.m_41720_() == Items.f_42412_) {
                  stack = teststack;
                  break;
               }
            }
         }

         if (entity.m_150110_().f_35937_ || stack != ItemStack.f_41583_) {
            GronckleAttackEntity entityarrow = GronckleAttackEntity.shoot(world, entity, world.m_213780_(), 1.0F, 5.0D, 5);
            itemstack.m_41622_(1, entity, (e) -> {
               e.m_21190_(entity.m_7655_());
            });
            if (entity.m_150110_().f_35937_) {
               entityarrow.f_36705_ = Pickup.CREATIVE_ONLY;
            } else if ((new ItemStack(Items.f_42412_)).m_41763_()) {
               if (stack.m_220157_(1, world.m_213780_(), entity)) {
                  stack.m_41774_(1);
                  stack.m_41721_(0);
                  if (stack.m_41619_()) {
                     entity.m_150109_().m_36057_(stack);
                  }
               }
            } else {
               stack.m_41774_(1);
               if (stack.m_41619_()) {
                  entity.m_150109_().m_36057_(stack);
               }
            }
         }
      }

   }
}
