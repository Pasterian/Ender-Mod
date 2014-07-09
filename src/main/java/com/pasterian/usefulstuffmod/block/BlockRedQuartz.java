package com.pasterian.usefulstuffmod.block;

import net.minecraft.block.material.Material;

public class BlockRedQuartz extends GenericBlock {

    public BlockRedQuartz() {
        super(Material.rock);
        this.setBlockName("RedQuartz");
        this.setHardness(2.3f);
        this.setStepSound(soundTypeStone);
    }
}