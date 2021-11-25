package com.fesho_deepwater.kentymod.common.material;

import java.util.function.Supplier;
import com.fesho_deepwater.kentymod.core.init.ItemInit;

import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.SoundEvents;

import java.util.function.Supplier;

public enum SilverArmorMaterial implements IArmorMaterial {

    Silver_Armor("silver_armor", 8, new int[] {2, 5, 7, 3}, 17, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 4f, 0.2f, () -> Ingredient.fromItems(ItemInit.silver_ingot.get()));

    private static final int[] baseDurabilty ={128, 144, 160, 112};
    private final String name;
    private final int durabilityMultiplier;
    private final int[] armorVal;
    private final int encantability;
    private final SoundEvent equipSound;
    private final float toughness;
    private final float knockbackResistance;
    private final Ingredient repairIngredient;

    SilverArmorMaterial(String name, int durabilityMultiplier, int[] armorVal, int encantability, SoundEvent equipSound,
                        float toughness, float knockbackResistance, Supplier<Ingredient> repairIngredient){
        this.name=name;
        this.durabilityMultiplier=durabilityMultiplier;
        this.armorVal=armorVal;
        this.encantability=encantability;
        this.equipSound=equipSound;
        this.toughness=toughness;
        this.knockbackResistance=knockbackResistance;
        this.repairIngredient=repairIngredient.get();
    }

    @Override
    public int getDurability(EquipmentSlotType slot) {
        return this.baseDurabilty[slot.getIndex()] * this.durabilityMultiplier;
    }

    @Override
    public int getDamageReductionAmount(EquipmentSlotType slot) {
        return this.armorVal[slot.getIndex()];
    }

    @Override
    public int getEnchantability() {
        return this.encantability;
    }

    @Override
    public SoundEvent getSoundEvent() {
        return this.equipSound;
    }

    @Override
    public Ingredient getRepairMaterial() {
        return this.repairIngredient;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public float getToughness() {
        return this.toughness;
    }

    @Override
    public float getKnockbackResistance() {
        return this.knockbackResistance;
    }

    public SoundEvent getEquipSound() {
        return equipSound;
    }
}
