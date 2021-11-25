package com.fesho_deepwater.kentymod.core.itemgroup;

import com.fesho_deepwater.kentymod.core.init.ItemInit;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class KentyModItemGroup extends ItemGroup {

    public static final KentyModItemGroup kentymod = new KentyModItemGroup(ItemGroup.GROUPS.length, "kentymod");

    public KentyModItemGroup(int index, String label){
        super(index, label);
    }

    @Override
    public ItemStack createIcon() {
        return new ItemStack(ItemInit.silver_ingot.get());
    }
}
