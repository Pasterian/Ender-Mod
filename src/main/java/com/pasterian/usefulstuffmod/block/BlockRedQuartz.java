package com.pasterian.usefulstuffmod.block;

import com.pasterian.usefulstuffmod.init.UMBlocks;
import com.pasterian.usefulstuffmod.utility.UMUtil;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.block.*;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;

import java.util.Random;

public class BlockRedQuartz extends GenericTNT {
    public IIcon bottom;
    public IIcon top;
    public IIcon sideCap;


    public BlockRedQuartz() {
        super(Material.tnt);
        this.setBlockName("RedQuartz");
        this.setHardness(0.1f);
        this.setStepSound(soundTypeCloth);
    }

    public void registerBlockIcons(IIconRegister ir) {
        this.bottom = ir.registerIcon(UMUtil.getTexture("tnt_top"));
        this.top = ir.registerIcon(UMUtil.getTexture("tnt_top"));
        this.sideCap = ir.registerIcon(UMUtil.getTexture("tnt_side"));

    }

    @SideOnly(Side.CLIENT)
    public IIcon getIcon(int side, int meta) {
        return side == 0 ? this.bottom : side == 1 ? this.top :this.sideCap;

        //Connected return side == 0 ? this.bottom : side == 1 ? this.top : meta == 1 ? this.sideConnect:this.sideCap;
    }

    public void onBlockAdded(World world, int x, int y, int z) {
        this.updateMetaForTextures(world, x, y, z);
    }

    public void onNeighborBlockChange(World world, int x, int y, int z, Block neighbor) {
        this.updateMetaForTextures(world, x, y, z);
    }

    private void updateMetaForTextures(World world, int x, int y, int z) {
        if (world.getBlockMetadata(x, y, z) == 0 && world.getBlock(x, y + 1, z) == UMBlocks.redQuartz) {
            world.setBlock(x, y, z, UMBlocks.redQuartz, 1, 3);
        } else if (world.getBlockMetadata(x, y, z) == 1 && world.getBlock(x, y + 1, z) == Blocks.air) {
            world.setBlock(x, y, z, UMBlocks.redQuartz, 0, 3);
        }
    }
}
