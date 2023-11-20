package net.mcreator.howtoownadragon.procedures;

import java.util.concurrent.atomic.AtomicReference;
import net.mcreator.howtoownadragon.init.HowToOwnADragonModItems;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraftforge.common.capabilities.ForgeCapabilities;

public class Incubator1HatchButtonProcedure {
   public static void execute(LevelAccessor world, double x, double y, double z) {
      if (((<undefinedtype>)(new Object() {
         public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
            AtomicReference<ItemStack> _retval = new AtomicReference(ItemStack.f_41583_);
            BlockEntity _ent = world.m_7702_(pos);
            if (_ent != null) {
               _ent.getCapability(ForgeCapabilities.ITEM_HANDLER, (Direction)null).ifPresent((capability) -> {
                  _retval.set(capability.getStackInSlot(slotid).m_41777_());
               });
            }

            return (ItemStack)_retval.get();
         }
      })).getItemStack(world, BlockPos.m_274561_(x, y, z), 2).m_41720_() == HowToOwnADragonModItems.GRONCKLE_EGG_ITEM.get() && ((<undefinedtype>)(new Object() {
         public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
            AtomicReference<ItemStack> _retval = new AtomicReference(ItemStack.f_41583_);
            BlockEntity _ent = world.m_7702_(pos);
            if (_ent != null) {
               _ent.getCapability(ForgeCapabilities.ITEM_HANDLER, (Direction)null).ifPresent((capability) -> {
                  _retval.set(capability.getStackInSlot(slotid).m_41777_());
               });
            }

            return (ItemStack)_retval.get();
         }
      })).getItemStack(world, BlockPos.m_274561_(x, y, z), 1).m_41720_() == Items.f_42448_) {
         if (((<undefinedtype>)(new Object() {
            public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
               AtomicReference<ItemStack> _retval = new AtomicReference(ItemStack.f_41583_);
               BlockEntity _ent = world.m_7702_(pos);
               if (_ent != null) {
                  _ent.getCapability(ForgeCapabilities.ITEM_HANDLER, (Direction)null).ifPresent((capability) -> {
                     _retval.set(capability.getStackInSlot(slotid).m_41777_());
                  });
               }

               return (ItemStack)_retval.get();
            }
         })).getItemStack(world, BlockPos.m_274561_(x, y, z), 2).m_41784_().m_128461_("groncklecolor").equals("pink")) {
            PinkIncubator1HatchButtonGronckleProcedure.execute(world, x, y, z);
         } else if (((<undefinedtype>)(new Object() {
            public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
               AtomicReference<ItemStack> _retval = new AtomicReference(ItemStack.f_41583_);
               BlockEntity _ent = world.m_7702_(pos);
               if (_ent != null) {
                  _ent.getCapability(ForgeCapabilities.ITEM_HANDLER, (Direction)null).ifPresent((capability) -> {
                     _retval.set(capability.getStackInSlot(slotid).m_41777_());
                  });
               }

               return (ItemStack)_retval.get();
            }
         })).getItemStack(world, BlockPos.m_274561_(x, y, z), 2).m_41784_().m_128461_("groncklecolor").equals("orangered")) {
            OrangeRedIncubator1HatchButtonGronckleProcedure.execute(world, x, y, z);
         } else if (((<undefinedtype>)(new Object() {
            public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
               AtomicReference<ItemStack> _retval = new AtomicReference(ItemStack.f_41583_);
               BlockEntity _ent = world.m_7702_(pos);
               if (_ent != null) {
                  _ent.getCapability(ForgeCapabilities.ITEM_HANDLER, (Direction)null).ifPresent((capability) -> {
                     _retval.set(capability.getStackInSlot(slotid).m_41777_());
                  });
               }

               return (ItemStack)_retval.get();
            }
         })).getItemStack(world, BlockPos.m_274561_(x, y, z), 2).m_41784_().m_128461_("groncklecolor").equals("blueyellow")) {
            BlueYellowIncubator1HatchButtonGronckleProcedure.execute(world, x, y, z);
         } else if (((<undefinedtype>)(new Object() {
            public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
               AtomicReference<ItemStack> _retval = new AtomicReference(ItemStack.f_41583_);
               BlockEntity _ent = world.m_7702_(pos);
               if (_ent != null) {
                  _ent.getCapability(ForgeCapabilities.ITEM_HANDLER, (Direction)null).ifPresent((capability) -> {
                     _retval.set(capability.getStackInSlot(slotid).m_41777_());
                  });
               }

               return (ItemStack)_retval.get();
            }
         })).getItemStack(world, BlockPos.m_274561_(x, y, z), 2).m_41784_().m_128461_("groncklecolor").equals("meatlug")) {
            MeatlugIncubator1HatchButtonGronckleProcedure.execute(world, x, y, z);
         }
      } else if (((<undefinedtype>)(new Object() {
         public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
            AtomicReference<ItemStack> _retval = new AtomicReference(ItemStack.f_41583_);
            BlockEntity _ent = world.m_7702_(pos);
            if (_ent != null) {
               _ent.getCapability(ForgeCapabilities.ITEM_HANDLER, (Direction)null).ifPresent((capability) -> {
                  _retval.set(capability.getStackInSlot(slotid).m_41777_());
               });
            }

            return (ItemStack)_retval.get();
         }
      })).getItemStack(world, BlockPos.m_274561_(x, y, z), 2).m_41720_() == HowToOwnADragonModItems.TT_EGG_ITEM.get() && ((<undefinedtype>)(new Object() {
         public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
            AtomicReference<ItemStack> _retval = new AtomicReference(ItemStack.f_41583_);
            BlockEntity _ent = world.m_7702_(pos);
            if (_ent != null) {
               _ent.getCapability(ForgeCapabilities.ITEM_HANDLER, (Direction)null).ifPresent((capability) -> {
                  _retval.set(capability.getStackInSlot(slotid).m_41777_());
               });
            }

            return (ItemStack)_retval.get();
         }
      })).getItemStack(world, BlockPos.m_274561_(x, y, z), 1).m_41720_() == Items.f_42648_) {
         if (((<undefinedtype>)(new Object() {
            public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
               AtomicReference<ItemStack> _retval = new AtomicReference(ItemStack.f_41583_);
               BlockEntity _ent = world.m_7702_(pos);
               if (_ent != null) {
                  _ent.getCapability(ForgeCapabilities.ITEM_HANDLER, (Direction)null).ifPresent((capability) -> {
                     _retval.set(capability.getStackInSlot(slotid).m_41777_());
                  });
               }

               return (ItemStack)_retval.get();
            }
         })).getItemStack(world, BlockPos.m_274561_(x, y, z), 2).m_41784_().m_128461_("ttcolor").equals("pink")) {
            PinkIncubator1HatchButtonTTProcedure.execute(world, x, y, z);
         } else if (((<undefinedtype>)(new Object() {
            public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
               AtomicReference<ItemStack> _retval = new AtomicReference(ItemStack.f_41583_);
               BlockEntity _ent = world.m_7702_(pos);
               if (_ent != null) {
                  _ent.getCapability(ForgeCapabilities.ITEM_HANDLER, (Direction)null).ifPresent((capability) -> {
                     _retval.set(capability.getStackInSlot(slotid).m_41777_());
                  });
               }

               return (ItemStack)_retval.get();
            }
         })).getItemStack(world, BlockPos.m_274561_(x, y, z), 2).m_41784_().m_128461_("ttcolor").equals("green")) {
            GreenIncubator1HatchButtonTTProcedure.execute(world, x, y, z);
         } else if (((<undefinedtype>)(new Object() {
            public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
               AtomicReference<ItemStack> _retval = new AtomicReference(ItemStack.f_41583_);
               BlockEntity _ent = world.m_7702_(pos);
               if (_ent != null) {
                  _ent.getCapability(ForgeCapabilities.ITEM_HANDLER, (Direction)null).ifPresent((capability) -> {
                     _retval.set(capability.getStackInSlot(slotid).m_41777_());
                  });
               }

               return (ItemStack)_retval.get();
            }
         })).getItemStack(world, BlockPos.m_274561_(x, y, z), 2).m_41784_().m_128461_("ttcolor").equals("turq")) {
            TurqIncubator1HatchButtonTTProcedure.execute(world, x, y, z);
         }
      } else if (((<undefinedtype>)(new Object() {
         public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
            AtomicReference<ItemStack> _retval = new AtomicReference(ItemStack.f_41583_);
            BlockEntity _ent = world.m_7702_(pos);
            if (_ent != null) {
               _ent.getCapability(ForgeCapabilities.ITEM_HANDLER, (Direction)null).ifPresent((capability) -> {
                  _retval.set(capability.getStackInSlot(slotid).m_41777_());
               });
            }

            return (ItemStack)_retval.get();
         }
      })).getItemStack(world, BlockPos.m_274561_(x, y, z), 2).m_41720_() == HowToOwnADragonModItems.NADDER_EGG_ITEM.get() && ((<undefinedtype>)(new Object() {
         public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
            AtomicReference<ItemStack> _retval = new AtomicReference(ItemStack.f_41583_);
            BlockEntity _ent = world.m_7702_(pos);
            if (_ent != null) {
               _ent.getCapability(ForgeCapabilities.ITEM_HANDLER, (Direction)null).ifPresent((capability) -> {
                  _retval.set(capability.getStackInSlot(slotid).m_41777_());
               });
            }

            return (ItemStack)_retval.get();
         }
      })).getItemStack(world, BlockPos.m_274561_(x, y, z), 1).m_41720_() == Items.f_42484_) {
         if (((<undefinedtype>)(new Object() {
            public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
               AtomicReference<ItemStack> _retval = new AtomicReference(ItemStack.f_41583_);
               BlockEntity _ent = world.m_7702_(pos);
               if (_ent != null) {
                  _ent.getCapability(ForgeCapabilities.ITEM_HANDLER, (Direction)null).ifPresent((capability) -> {
                     _retval.set(capability.getStackInSlot(slotid).m_41777_());
                  });
               }

               return (ItemStack)_retval.get();
            }
         })).getItemStack(world, BlockPos.m_274561_(x, y, z), 2).m_41784_().m_128461_("naddercolor").equals("stormfly")) {
            StormflyIncubator1HatchButtonNadderProcedure.execute(world, x, y, z);
         } else if (((<undefinedtype>)(new Object() {
            public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
               AtomicReference<ItemStack> _retval = new AtomicReference(ItemStack.f_41583_);
               BlockEntity _ent = world.m_7702_(pos);
               if (_ent != null) {
                  _ent.getCapability(ForgeCapabilities.ITEM_HANDLER, (Direction)null).ifPresent((capability) -> {
                     _retval.set(capability.getStackInSlot(slotid).m_41777_());
                  });
               }

               return (ItemStack)_retval.get();
            }
         })).getItemStack(world, BlockPos.m_274561_(x, y, z), 2).m_41784_().m_128461_("naddercolor").equals("red")) {
            RedIncubator1HatchButtonNadderProcedure.execute(world, x, y, z);
         } else if (((<undefinedtype>)(new Object() {
            public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
               AtomicReference<ItemStack> _retval = new AtomicReference(ItemStack.f_41583_);
               BlockEntity _ent = world.m_7702_(pos);
               if (_ent != null) {
                  _ent.getCapability(ForgeCapabilities.ITEM_HANDLER, (Direction)null).ifPresent((capability) -> {
                     _retval.set(capability.getStackInSlot(slotid).m_41777_());
                  });
               }

               return (ItemStack)_retval.get();
            }
         })).getItemStack(world, BlockPos.m_274561_(x, y, z), 2).m_41784_().m_128461_("naddercolor").equals("purple")) {
            PurpleIncubator1HatchButtonnadderProcedure.execute(world, x, y, z);
         }
      }

   }
}
