package com.TheRedMezek.NoEndermanGrief;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import net.minecraft.entity.monster.EntityEnderman;
import net.minecraft.init.Blocks;

@Mod(modid = NoEndermanGrief.MODID, version = NoEndermanGrief.VERSION, acceptedMinecraftVersions = "[1.7.10]")
public class NoEndermanGrief {
    public static final String MODID = "noendermangrief";
    public static final String VERSION = "1.0";

    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        EntityEnderman.setCarriable(Blocks.grass, false);
        EntityEnderman.setCarriable(Blocks.dirt, false);
        EntityEnderman.setCarriable(Blocks.sand, false);
        EntityEnderman.setCarriable(Blocks.gravel, false);
        EntityEnderman.setCarriable(Blocks.yellow_flower, false);
        EntityEnderman.setCarriable(Blocks.red_flower, false);
        EntityEnderman.setCarriable(Blocks.brown_mushroom, false);
        EntityEnderman.setCarriable(Blocks.red_mushroom, false);
        EntityEnderman.setCarriable(Blocks.tnt, false);
        EntityEnderman.setCarriable(Blocks.cactus, false);
        EntityEnderman.setCarriable(Blocks.clay, false);
        EntityEnderman.setCarriable(Blocks.pumpkin, false);
        EntityEnderman.setCarriable(Blocks.melon_block, false);
        EntityEnderman.setCarriable(Blocks.mycelium, false);
    }

    @EventHandler
    public void init(FMLInitializationEvent event) {}
}
