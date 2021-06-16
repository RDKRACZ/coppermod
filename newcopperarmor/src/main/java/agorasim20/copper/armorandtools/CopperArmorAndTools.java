package agorasim20.copper.armorandtools;

import agorasim20.copper.armorandtools.armor.BaseArmor;
import agorasim20.copper.armorandtools.armor.CopperArmor;
import agorasim20.copper.armorandtools.tools.AxeBase;
import agorasim20.copper.armorandtools.tools.CopperTools;
import agorasim20.copper.armorandtools.tools.HoeBase;
import agorasim20.copper.armorandtools.tools.PickaxeBase;
import agorasim20.copper.armorandtools.tools.ShovelBase;
import agorasim20.copper.armorandtools.tools.SwordBase;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class CopperArmorAndTools implements ModInitializer {
	public static final ArmorMaterial COPPERARMOR = new CopperArmor();

	public static final ItemGroup ITEM_GROUP = FabricItemGroupBuilder
			.build(new Identifier("copperarmorandtools", "general"), () -> new ItemStack(Items.COPPER_INGOT));

	@Override
	public void onInitialize() {

		// armor
		Registry.register(Registry.ITEM, new Identifier("copperarmorandtools", "copperhelmet"),
				new BaseArmor(COPPERARMOR, EquipmentSlot.HEAD));
		Registry.register(Registry.ITEM, new Identifier("copperarmorandtools", "copperchestplate"),
				new BaseArmor(COPPERARMOR, EquipmentSlot.CHEST));
		Registry.register(Registry.ITEM, new Identifier("copperarmorandtools", "copperleggins"),
				new BaseArmor(COPPERARMOR, EquipmentSlot.LEGS));
		Registry.register(Registry.ITEM, new Identifier("copperarmorandtools", "copperboots"),
				new BaseArmor(COPPERARMOR, EquipmentSlot.FEET));

		// tools
		Registry.register(Registry.ITEM, new Identifier("copperarmorandtools", "copperpickaxe"),
				new PickaxeBase(new CopperTools()));
		Registry.register(Registry.ITEM, new Identifier("copperarmorandtools", "copperaxe"),
				new AxeBase(new CopperTools()));
		Registry.register(Registry.ITEM, new Identifier("copperarmorandtools", "copperhoe"),
				new HoeBase(new CopperTools()));
		Registry.register(Registry.ITEM, new Identifier("copperarmorandtools", "coppersword"),
				new SwordBase(new CopperTools()));
		Registry.register(Registry.ITEM, new Identifier("copperarmorandtools", "coppershovel"),
				new ShovelBase(new CopperTools()));

	}
}
