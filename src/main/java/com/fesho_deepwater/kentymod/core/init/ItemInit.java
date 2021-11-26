package com.fesho_deepwater.kentymod.core.init;

import com.fesho_deepwater.kentymod.KentyMod;
import com.fesho_deepwater.kentymod.common.material.SilverArmorMaterial;
import com.fesho_deepwater.kentymod.common.material.SilverToolMaterial;
import com.fesho_deepwater.kentymod.core.itemgroup.KentyModItemGroup;
import net.minecraft.client.tutorial.Tutorial;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.*;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemInit {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, KentyMod.MOD_ID);
    public static final RegistryObject<Item> silver_ingot = ITEMS.register("silver_ingot",
            () -> new Item(new Item.Properties().group(KentyModItemGroup.kentymod)));

    public static final RegistryObject<Item> silver_helmet = ITEMS.register("silver_helmet",
            () -> new ArmorItem(SilverArmorMaterial.Silver_Armor, EquipmentSlotType.HEAD,
                    new Item.Properties().group(KentyModItemGroup.kentymod)));

    public static final RegistryObject<Item> silver_chestplate = ITEMS.register("silver_chestplate",
            () -> new ArmorItem(SilverArmorMaterial.Silver_Armor, EquipmentSlotType.CHEST,
                    new Item.Properties().group(KentyModItemGroup.kentymod)));

    public static final RegistryObject<Item> silver_leggings = ITEMS.register("silver_leggings",
            () -> new ArmorItem(SilverArmorMaterial.Silver_Armor, EquipmentSlotType.LEGS,
                    new Item.Properties().group(KentyModItemGroup.kentymod)));

    public static final RegistryObject<Item> silver_boots = ITEMS.register("silver_boots",
            () -> new ArmorItem(SilverArmorMaterial.Silver_Armor, EquipmentSlotType.FEET,
                    new Item.Properties().group(KentyModItemGroup.kentymod)));

    public static final RegistryObject<Item> silver_sword = ITEMS.register("silver_sword",
            () -> new SwordItem(SilverToolMaterial.Silver_Tool, 5, -1,
                    new Item.Properties().group(KentyModItemGroup.kentymod)));

    public static final RegistryObject<Item> silver_pickaxe = ITEMS.register("silver_pickaxe",
            () -> new PickaxeItem(SilverToolMaterial.Silver_Tool, 5, -1,
                    new Item.Properties().group(KentyModItemGroup.kentymod)));

    public static final RegistryObject<Item> silver_axe = ITEMS.register("silver_axe",
            () -> new AxeItem(SilverToolMaterial.Silver_Tool, 5, -1,
                    new Item.Properties().group(KentyModItemGroup.kentymod)));

    public static final RegistryObject<Item> silver_hoe = ITEMS.register("silver_hoe",
            () -> new HoeItem(SilverToolMaterial.Silver_Tool, 5, -1,
                    new Item.Properties().group(KentyModItemGroup.kentymod)));

    public static final RegistryObject<Item> silver_shovel = ITEMS.register("silver_shovel",
            () -> new ShovelItem(SilverToolMaterial.Silver_Tool, 5, -1,
                    new Item.Properties().group(KentyModItemGroup.kentymod)));
}
