package com.pasterian.usefulstuffmod.entity;

import com.pasterian.usefulstuffmod.init.UMBlocks;
import com.pasterian.usefulstuffmod.utility.UMUtil;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.init.Blocks;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;

    public class EnderTNTPrimed extends Entity
    {
        /** How long the fuse is */
        public int fuse;
        private EntityLivingBase tntPlacedBy;
        private static final String __OBFID = "CL_00001681";

        public IIcon bottom;
        public IIcon top;
        public IIcon sideCap;


        public EnderTNTPrimed(World p_i1729_1_)
        {
            super(p_i1729_1_);
            this.preventEntitySpawning = true;
            this.setSize(0.98F, 0.98F);
            this.yOffset = this.height / 2.0F;
        }

        public EnderTNTPrimed(World p_i1730_1_, double p_i1730_2_, double p_i1730_4_, double p_i1730_6_, EntityLivingBase p_i1730_8_)
        {
            this(p_i1730_1_);
            this.setPosition(p_i1730_2_, p_i1730_4_, p_i1730_6_);
            float f = (float)(Math.random() * Math.PI * 2.0D);
            this.motionX = (double)(-((float)Math.sin((double)f)) * 0.02F);
            this.motionY = 0.20000000298023224D;
            this.motionZ = (double)(-((float)Math.cos((double)f)) * 0.02F);
            this.fuse = 80;
            this.prevPosX = p_i1730_2_;
            this.prevPosY = p_i1730_4_;
            this.prevPosZ = p_i1730_6_;
            this.tntPlacedBy = p_i1730_8_;
        }

        protected void entityInit() {}

        /**
         * returns if this entity triggers Block.onEntityWalking on the blocks they walk on. used for spiders and wolves to
         * prevent them from trampling crops
         */
        protected boolean canTriggerWalking()
        {
            return false;
        }

        /**
         * Returns true if other Entities should be prevented from moving through this Entity.
         */
        public boolean canBeCollidedWith()
        {
            return !this.isDead;
        }

        /**
         * Called to update the entity's position/logic.
         */
        public void onUpdate()
        {
            this.prevPosX = this.posX;
            this.prevPosY = this.posY;
            this.prevPosZ = this.posZ;
            this.motionY -= 0.03999999910593033D;
            this.moveEntity(this.motionX, this.motionY, this.motionZ);
            this.motionX *= 0.9800000190734863D;
            this.motionY *= 0.9800000190734863D;
            this.motionZ *= 0.9800000190734863D;

            if (this.onGround)
            {
                this.motionX *= 0.699999988079071D;
                this.motionZ *= 0.699999988079071D;
                this.motionY *= -0.5D;
            }

            if (this.fuse-- <= 0)
            {
                this.setDead();

                if (!this.worldObj.isRemote)
                {
                    this.explode();
                }
            }
            else
            {
                this.worldObj.spawnParticle("smoke", this.posX, this.posY + 0.5D, this.posZ, 0.0D, 0.0D, 0.0D);
            }
        }

        private void explode()
        {
            float f = 20.0F;
            this.worldObj.createExplosion(this, this.posX, this.posY, this.posZ, f, true);
        }

        /**
         * (abstract) Protected helper method to write subclass entity data to NBT.
         */
        protected void writeEntityToNBT(NBTTagCompound p_70014_1_)
        {
            p_70014_1_.setByte("Fuse", (byte)this.fuse);
        }

        /**
         * (abstract) Protected helper method to read subclass entity data from NBT.
         */
        protected void readEntityFromNBT(NBTTagCompound p_70037_1_)
        {
            this.fuse = p_70037_1_.getByte("Fuse");
        }

        @SideOnly(Side.CLIENT)
        public float getShadowSize()
        {
            return 0.0F;
        }

        /**
         * returns null or the entityliving it was placed or ignited by
         */
        public EntityLivingBase getTntPlacedBy()
        {
            return this.tntPlacedBy;
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
        if (world.getBlockMetadata(x, y, z) == 0 && world.getBlock(x, y + 1, z) == UMBlocks.enderTNT) {
            world.setBlock(x, y, z, UMBlocks.enderTNT, 1, 3);
        } else if (world.getBlockMetadata(x, y, z) == 1 && world.getBlock(x, y + 1, z) == Blocks.air) {
            world.setBlock(x, y, z, UMBlocks.enderTNT, 0, 3);
        }
    }
}