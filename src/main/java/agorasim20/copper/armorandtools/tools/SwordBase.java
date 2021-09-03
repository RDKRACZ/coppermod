package agorasim20.copper.armorandtools.tools;

import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterial;
import agorasim20.copper.armorandtools.CopperArmorAndTools;
import net.minecraft.item.Item;

public class SwordBase extends SwordItem {

    public SwordBase(ToolMaterial toolMaterial) {
        super(toolMaterial, 2, -2.4f, new Item.Settings().group(CopperArmorAndTools.ITEM_GROUP));

    }

}
