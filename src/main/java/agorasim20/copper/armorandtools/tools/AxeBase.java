package agorasim20.copper.armorandtools.tools;

import net.minecraft.item.Item;
import agorasim20.copper.armorandtools.CopperArmorAndTools;
import net.minecraft.item.AxeItem;
import net.minecraft.item.ToolMaterial;

public class AxeBase extends AxeItem {
    public AxeBase(ToolMaterial material) {
        super(material, 5, -3.2f, new Item.Settings().group(CopperArmorAndTools.ITEM_GROUP));
    }
}
