package com.fesho_deepwater.kentymod;

import com.fesho_deepwater.kentymod.core.init.ItemInit;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;



@Mod("kentymod")
public class KentyMod
{
    public static final Logger LOGGER = LogManager.getLogger();
    public static final String MOD_ID = "kentymod";

    public KentyMod() {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();

        ItemInit.ITEMS.register(bus);
        System.out.println("asfasf");
        MinecraftForge.EVENT_BUS.register(this);
    }



}
