package com.pasterian.usefulstuffmod.tabs;

import com.pasterian.usefulstuffmod.init.UMBlocks;
import com.pasterian.usefulstuffmod.init.UMItems;
import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;

public class CreativeTabBlock extends CreativeTabs
{
    public CreativeTabBlock(String label)
    {
        super(label);
    }

    @Override
    public Item getTabIconItem()
    {
        return Item.getItemFromBlock(UMBlocks.MinablePick);
    }
}
