package com.pasterian.usefulstuffmod.block;

import com.pasterian.usefulstuffmod.init.UMBlocks;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.block.*;

import java.util.Random;

public class BlockYellowQuartz extends GenericBlock
{
    public BlockYellowQuartz()
    {
        super(Material.rock);
        this.setBlockName("YellowQuartz");
        this.setHardness(2.6f);
        this.setStepSound(soundTypeStone);
    }

}
