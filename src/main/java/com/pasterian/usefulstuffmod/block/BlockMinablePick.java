package com.pasterian.usefulstuffmod.block;

import java.util.Random;

import com.pasterian.usefulstuffmod.UsefulStuffMod;
import com.pasterian.usefulstuffmod.reference.Reference;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.IBlockAccess;

public class BlockMinablePick extends Block {

    public ItemStack pickaxeIronStack = new ItemStack(Items.iron_pickaxe);

    public BlockMinablePick(Material mat){
        super(mat);
        this.setHarvestLevel("pickaxe", 2);
        this.setBlockName("MinablePick");
        this.setCreativeTab(UsefulStuffMod.UMCreativeTabBlock);
        this.setStepSound(Block.soundTypeMetal);
        this.setHardness(5.0F);
        this.setBlockTextureName(Reference.MOD_ID.toLowerCase() + ":" + "MinablePick");
    }

    private Random random = new Random();
    @Override
    public Item getItemDropped(int metadata, Random random, int fortune) {
        return Items.iron_pickaxe;
    }

    private Random rand = new Random();
    @Override
    public int getExpDrop(IBlockAccess p_149690_1_, int p_149690_5_, int p_149690_7_){
        if (this.getItemDropped(p_149690_5_, rand, p_149690_7_) != Item.getItemFromBlock(this))
        {
            return 5 + rand.nextInt(5);
        }
        return 0;
    }
}