package com.pasterian.usefulstuffmod.init;

import com.pasterian.usefulstuffmod.block.*;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class UMBlocks {

    public static final Block MinablePick = new BlockMinablePick(Material.rock);
    public static final GenericTNT redQuartz = new BlockRedQuartz();
    public static final GenericBlock blueQuartz = new BlockBlueQuartz();
    public static final GenericBlock yellowQuartz = new BlockYellowQuartz();
    public static final GenericBlock greenQuartz = new BlockGreenQuartz();
    public static final GenericBlock pinkQuartz = new BlockPinkQuartz();
    public static final GenericBlock purpleQuartz = new BlockPurpleQuartz();
    public static final GenericBlock cyanQuartz = new BlockCyanQuartz();

    public static void init() {

        GameRegistry.registerBlock(redQuartz, "RedQuartz");
        GameRegistry.registerBlock(purpleQuartz, "PurpleQuartz");
        GameRegistry.registerBlock(pinkQuartz, "PinkQuartz");
        GameRegistry.registerBlock(greenQuartz, "GreenQuartz");
        GameRegistry.registerBlock(yellowQuartz, "YellowQuartz");
        GameRegistry.registerBlock(cyanQuartz, "CyanQuartz");
        GameRegistry.registerBlock(blueQuartz, "BlueQuartz");
        GameRegistry.registerBlock(MinablePick, "minablePick");
    }
}

