package com.fesho_deepwater.kentymod.core.init;

import com.fesho_deepwater.kentymod.KentyMod;
import com.fesho_deepwater.kentymod.core.itemgroup.KentyModItemGroup;
import net.minecraft.client.tutorial.Tutorial;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemInit {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, KentyMod.MOD_ID);
    public static final RegistryObject<Item> Silver = ITEMS.register("silver",
            () -> new Item(new Item.Properties().group(KentyModItemGroup.kentymod)));


}
