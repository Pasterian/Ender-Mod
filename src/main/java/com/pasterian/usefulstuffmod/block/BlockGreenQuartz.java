package com.pasterian.usefulstuffmod.block;

import com.pasterian.usefulstuffmod.init.UMBlocks;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.block.*;

import java.util.Random;

public class BlockGreenQuartz extends GenericBlock
{
    public BlockGreenQuartz()
    {
        super(Material.rock);
        this.setBlockName("GreenQuartz");
        this.setHardness(2.6f);
        this.setStepSound(soundTypeStone);
    }

}
