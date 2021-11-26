package com.fesho_deepwater.kentymod.core.init;

import com.fesho_deepwater.kentymod.KentyMod;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;


public class BlockInit {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, KentyMod.MOD_ID);
    public static final RegistryObject<Block> block_of_silver = BLOCKS.register("block_of_silver",
            () -> new Block(AbstractBlock.Properties.create(Material.IRON,
                    MaterialColor.GRAY).hardnessAndResistance(5,6).harvestTool(ToolType.PICKAXE).harvestLevel(2).sound(SoundType.METAL)));
}
