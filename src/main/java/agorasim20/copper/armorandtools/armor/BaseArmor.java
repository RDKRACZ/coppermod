package agorasim20.copper.armorandtools.armor;

import agorasim20.copper.armorandtools.CopperArmorAndTools;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.Item;

public class BaseArmor extends ArmorItem {

    public BaseArmor(ArmorMaterial material, EquipmentSlot slot) {
        super(material, slot, new Item.Settings().group(CopperArmorAndTools.ITEM_GROUP));
    }
}
