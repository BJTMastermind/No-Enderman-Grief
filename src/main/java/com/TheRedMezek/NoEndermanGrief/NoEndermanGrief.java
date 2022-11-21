package com.TheRedMezek.NoEndermanGrief;

import net.minecraft.entity.monster.EntityEnderman;
import net.minecraft.init.Blocks;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = NoEndermanGrief.MODID, version = NoEndermanGrief.VERSION, acceptedMinecraftVersions = "[1.12.2]")
public class NoEndermanGrief {
    public static final String MODID = "noendermangrief";
    public static final String VERSION = "1.0";

    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        EntityEnderman.setCarriable(Blocks.GRASS, false);
        EntityEnderman.setCarriable(Blocks.DIRT, false);
        EntityEnderman.setCarriable(Blocks.SAND, false);
        EntityEnderman.setCarriable(Blocks.GRAVEL, false);
        EntityEnderman.setCarriable(Blocks.YELLOW_FLOWER, false);
        EntityEnderman.setCarriable(Blocks.RED_FLOWER, false);
        EntityEnderman.setCarriable(Blocks.BROWN_MUSHROOM, false);
        EntityEnderman.setCarriable(Blocks.RED_MUSHROOM, false);
        EntityEnderman.setCarriable(Blocks.TNT, false);
        EntityEnderman.setCarriable(Blocks.CACTUS, false);
        EntityEnderman.setCarriable(Blocks.CLAY, false);
        EntityEnderman.setCarriable(Blocks.PUMPKIN, false);
        EntityEnderman.setCarriable(Blocks.MELON_BLOCK, false);
        EntityEnderman.setCarriable(Blocks.MYCELIUM, false);
    }

    @EventHandler
    public void init(FMLInitializationEvent event) {}
}
