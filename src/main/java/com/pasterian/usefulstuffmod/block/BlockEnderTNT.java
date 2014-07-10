package com.pasterian.usefulstuffmod.block;

import com.pasterian.usefulstuffmod.UsefulStuffMod;
import com.pasterian.usefulstuffmod.init.UMBlocks;
import com.pasterian.usefulstuffmod.utility.UMUtil;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;
import net.minecraftforge.event.entity.player.ItemTooltipEvent;

import java.util.EventListener;
import java.util.List;
import java.util.Random;

public class BlockEnderTNT extends GenericTNT {
    public IIcon bottom;
    public IIcon top;
    public IIcon sideCap;


    public BlockEnderTNT() {
        super();

        this.setCreativeTab(UsefulStuffMod.UMCreativeTabBlock);
        this.setBlockName("enderTNT");
        this.setHardness(0.0f);
        this.setStepSound(soundTypeGravel);

        this.blockParticleGravity = 1.0F;
    }

    public void registerBlockIcons(IIconRegister ir) {
        this.bottom = ir.registerIcon(UMUtil.getTexture("tnt_top"));
        this.top = ir.registerIcon(UMUtil.getTexture("tnt_top"));
        this.sideCap = ir.registerIcon(UMUtil.getTexture("tnt_side"));

    }

    @SideOnly(Side.CLIENT)
    public IIcon getIcon(int side, int meta) {
        return side == 0 ? this.bottom : side == 1 ? this.top : this.sideCap;

        //Connected return side == 0 ? this.bottom : side == 1 ? this.top : meta == 1 ? this.sideConnect:this.sideCap;
    }

    public void onBlockAdded(World world, int x, int y, int z) {
        this.updateMetaForTextures(world, x, y, z);

    }

    public void onNeighborBlockChange(World world, int x, int y, int z, Block neighbor) {
        this.updateMetaForTextures(world, x, y, z);
    }

    private void updateMetaForTextures(World world, int x, int y, int z) {
        if (world.getBlockMetadata(x, y, z) == 0 && world.getBlock(x, y + 1, z) == UMBlocks.enderTNT) {
            world.setBlock(x, y, z, UMBlocks.enderTNT, 1, 3);
        } else if (world.getBlockMetadata(x, y, z) == 1 && world.getBlock(x, y + 1, z) == Blocks.air) {
            world.setBlock(x, y, z, UMBlocks.enderTNT, 0, 3);
        }
    }

    @SideOnly(Side.CLIENT)
    public void randomDisplayTick(World worldObj, int posX, int posY, int posZ, Random rand){
            int direction = worldObj.getBlockMetadata(posX, posY, posZ);

            float x1 = (float)posX + rand.nextFloat();
            float y1 = (float)posY + rand.nextFloat();
            float z1 = (float)posZ + rand.nextFloat();

            float f =  rand.nextFloat();
            float f1 = rand.nextFloat();

                //worldObj.spawnParticle("portal", (double)(x1 - f), (double)(y1), (double)(z1 + f1), 1.0D /*red*/, 1.2D /*green*/, 1.6D /*blue*/);

                //worldObj.spawnParticle("portal", (double)(x1 + f), (double)(y1), (double)(z1 + f1), 1.0D /*red*/, 1.2D /*green*/, 1.6D /*blue*/);

                //worldObj.spawnParticle("portal", (double)(x1 + f1), (double)(y1), (double)(z1 - f), 1.0D /*red*/, 1.2D /*green*/, 1.6D /*blue*/);

                worldObj.spawnParticle("portal", (double)(x1), (double)(y1), (double)(z1), 1.0D /*red*/, 1.2D /*green*/, 1.6D /*blue*/);
            }
    @SubscribeEvent
    public void itemToolTip(ItemTooltipEvent event) {

    }

    @SubscribeEvent
    public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List par3List, boolean par4)
    {
        par3List.add("WARNINNG! UNSTABLE!");

    }

        }


