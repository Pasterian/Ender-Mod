package com.pasterian.usefulstuffmod.item;


import com.pasterian.usefulstuffmod.UsefulStuffMod;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraft.client.particle.EntityAuraFX;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntitySnowball;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.entity.player.ArrowNockEvent;

public class ItemBlueShard extends GenericItem {

    public ItemBlueShard() {

        super();
        this.setUnlocalizedName("blueShard");
        this.setCreativeTab(UsefulStuffMod.UMCreativeTabItem);
    }
}