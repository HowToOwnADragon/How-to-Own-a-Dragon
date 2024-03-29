package net.mcreator.howtoownadragon.procedures;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.mcreator.howtoownadragon.procedures.GetUUIDAttributeProcedure;


public class DisplayHealthAttributeProcedure {

    public static String execute(Entity entity) {
        if (entity == null)
            return "0";
        if (GetUUIDAttributeProcedure.EntityUUID != null && GetUUIDAttributeProcedure.EntityUUID instanceof LivingEntity) {
            LivingEntity livingEntityUUID = (LivingEntity) GetUUIDAttributeProcedure.EntityUUID;
            return "" + livingEntityUUID.getMaxHealth();
        }

        return "0";
    }
}
