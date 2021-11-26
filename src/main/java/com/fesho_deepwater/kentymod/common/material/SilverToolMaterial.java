package com.fesho_deepwater.kentymod.common.material;

import com.fesho_deepwater.kentymod.core.init.ItemInit;
import net.minecraft.item.IItemTier;
import net.minecraft.item.crafting.Ingredient;

import java.util.function.Supplier;

public enum SilverToolMaterial implements IItemTier {

    Silver_Tool(4, 2000, 10f, 2f, 17, () -> Ingredient.fromItems(ItemInit.silver_ingot.get()));

    private final int harvestLevel;
    private final int maxUses;
    private final float efficiency;
    private final float attackDamage;
    private final int enchantability;
    private final Ingredient repairMaterial;

    SilverToolMaterial(int harvestLevel, int maxUses, float efficiency, float attackDamage,
                       int enchantability, Supplier<Ingredient> repairMaterial){
        this.harvestLevel=harvestLevel;
        this.maxUses=maxUses;
        this.efficiency=efficiency;
        this.attackDamage=attackDamage;
        this.enchantability=enchantability;
        this.repairMaterial=repairMaterial.get();
    }

    @Override
    public int getMaxUses() {
        return this.maxUses;
    }

    @Override
    public float getEfficiency() {
        return this.efficiency;
    }

    @Override
    public float getAttackDamage() {
        return this.attackDamage;
    }

    @Override
    public int getHarvestLevel() {
        return this.harvestLevel;
    }

    @Override
    public int getEnchantability() {
        return this.enchantability;
    }

    @Override
    public Ingredient getRepairMaterial() {
        return this.repairMaterial;
    }
}
