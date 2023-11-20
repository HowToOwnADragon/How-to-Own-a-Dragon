package net.mcreator.howtoownadragon.item;

import java.util.List;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Item.Properties;
import net.minecraft.world.level.Level;

public class LensDragonInfoItem extends Item {
   public LensDragonInfoItem() {
      super((new Properties()).m_41487_(1).m_41486_().m_41497_(Rarity.UNCOMMON));
   }

   public void m_7373_(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
      super.m_7373_(itemstack, world, list, flag);
      list.add(Component.m_237113_("§8Dragon Data"));
   }
}
