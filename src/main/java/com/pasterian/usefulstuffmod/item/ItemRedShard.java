package com.pasterian.usefulstuffmod.item;


import com.pasterian.usefulstuffmod.UsefulStuffMod;

public class ItemRedShard extends GenericItem {

    public ItemRedShard() {

        super();
        this.setUnlocalizedName("redShard");
        this.setCreativeTab(UsefulStuffMod.UMCreativeTabItem);
        this.canItemEditBlocks();
    }
}
