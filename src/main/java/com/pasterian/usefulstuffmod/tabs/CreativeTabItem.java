package com.pasterian.usefulstuffmod.tabs;

import com.pasterian.usefulstuffmod.init.UMItems;
import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class CreativeTabItem extends CreativeTabs
{
    public CreativeTabItem(String label)
    {
        super(label);
    }

    @Override
    public Item getTabIconItem()
    {
        return UMItems.blueShard;
    }
}
