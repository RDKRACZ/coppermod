package agorasim20.copper.armorandtools.tools;

import agorasim20.copper.armorandtools.CopperArmorAndTools;
import net.minecraft.item.Item;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ToolMaterial;

public class PickaxeBase extends PickaxeItem {
    public PickaxeBase(ToolMaterial material) {
        super(material, 0, -2.8f, new Item.Settings().group(CopperArmorAndTools.ITEM_GROUP));
    }
}
