package com.fesho_deepwater.kentymod;

import com.fesho_deepwater.kentymod.core.init.BlockInit;
import com.fesho_deepwater.kentymod.core.init.ItemInit;
import com.fesho_deepwater.kentymod.core.itemgroup.KentyModItemGroup;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


@Mod("kentymod")
@Mod.EventBusSubscriber(modid = KentyMod.MOD_ID, bus  = Bus.MOD)

public class KentyMod {
    public static final Logger LOGGER = LogManager.getLogger();
    public static final String MOD_ID = "kentymod";

    public KentyMod() {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();

        ItemInit.ITEMS.register(bus);
        BlockInit.BLOCKS.register(bus);

        MinecraftForge.EVENT_BUS.register(this);
    }


    @SubscribeEvent
    public static void onRegisterItems(final RegistryEvent.Register<Item> event) {
        BlockInit.BLOCKS.getEntries().stream().map(RegistryObject::get).forEach(block -> {
            event.getRegistry().register(new BlockItem(block,
                    new Item.Properties().group(KentyModItemGroup.kentymod)).setRegistryName(block.getRegistryName()));
        });
    }

}
