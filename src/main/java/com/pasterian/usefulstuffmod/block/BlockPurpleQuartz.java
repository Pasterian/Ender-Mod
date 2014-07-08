package com.pasterian.usefulstuffmod.block;

import com.pasterian.usefulstuffmod.init.UMBlocks;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.block.*;

import java.util.Random;

public class BlockPurpleQuartz extends GenericBlock
{
    public BlockPurpleQuartz()
    {
        super(Material.rock);
        this.setBlockName("PurpleQuartz");
        this.setHardness(2.6f);
        this.setStepSound(soundTypeStone);
    }

}
