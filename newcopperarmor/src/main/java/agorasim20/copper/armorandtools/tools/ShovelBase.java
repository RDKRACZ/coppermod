package agorasim20.copper.armorandtools.tools;

import net.minecraft.item.ShovelItem;
import net.minecraft.item.ToolMaterial;
import agorasim20.copper.armorandtools.CopperArmorAndTools;
import net.minecraft.item.Item;

public class ShovelBase extends ShovelItem {

    public ShovelBase(ToolMaterial material) {
        super(material, 0, -3f, new Item.Settings().group(CopperArmorAndTools.ITEM_GROUP));

    }

}
