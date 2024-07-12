package com.github.graczbeznicku.optimizedcustomitems;

import net.minecraft.init.Blocks;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

// TODO:
// Patch: net.optifine.config.NbtTagValue.matchesValue(String nbtValue)
// Regex is taking too long

@net.minecraftforge.fml.common.Mod(modid = "optimizedcustomitems", useMetadata=true)
public class Mod
{
    @net.minecraftforge.fml.common.Mod.EventHandler
    public void init(FMLInitializationEvent event)
    {
        System.out.println("Dirt: " + Blocks.dirt.getUnlocalizedName());
    }
}
