package agorasim20.copper.armorandtools.tools;

import agorasim20.copper.armorandtools.CopperArmorAndTools;
import net.minecraft.item.HoeItem;
import net.minecraft.item.ToolMaterial;
import net.minecraft.item.Item;

public class HoeBase extends HoeItem {

    public HoeBase(ToolMaterial material) {
        super(material, -3, -1f, new Item.Settings().group(CopperArmorAndTools.ITEM_GROUP));

    }

}
