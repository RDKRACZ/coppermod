package agorasim20.copper.armorandtools.armor;

import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.Items;
import net.minecraft.recipe.Ingredient;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;

public class CopperArmor implements ArmorMaterial {
	private static final int[] BASE_DURABILITY = new int[] { 14, 18, 16, 12 };
	private static final int[] PROTECTION_VALUES = new int[] { 1, 5, 4, 1 };

	@Override
	public int getDurability(EquipmentSlot slot) {
		return BASE_DURABILITY[slot.getEntitySlotId()] * 10;
	}

	@Override
	public int getProtectionAmount(EquipmentSlot slot) {
		return PROTECTION_VALUES[slot.getEntitySlotId()];
	}

	@Override
	public int getEnchantability() {
		return 20;
	}

	@Override
	public SoundEvent getEquipSound() {
		return SoundEvents.ITEM_ARMOR_EQUIP_IRON;
	}

	@Override
	public Ingredient getRepairIngredient() {
		return Ingredient.ofItems(Items.COPPER_INGOT);
	}

	@Override
	public String getName() {
		return "copperarmor";
	}

	@Override
	public float getToughness() {
		return 1;
	}

	@Override
	public float getKnockbackResistance() {
		return 1;
	}
}