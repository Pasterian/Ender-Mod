package com.pasterian.usefulstuffmod.handler;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.DamageSource;
import net.minecraftforge.event.entity.living.LivingAttackEvent;
import net.minecraftforge.event.entity.player.ItemTooltipEvent;
import net.minecraftforge.event.entity.player.PlayerSleepInBedEvent;

/**
 * Name and cast of this class are irrelevant
 */
public class EventHandler
{
    /**
     * The key is the @ForgeSubscribe annotation and the cast of the Event you put in as argument.
     * The method name you pick does not matter. Method signature is public void, always.
     */
    @SubscribeEvent
    public void entityAttacked(LivingAttackEvent event)
    {
/*
* You can then proceed to read and change the Event's fields where possible
*/
        EntityLiving attackedEnt = (EntityLiving) event.entityLiving;
        DamageSource attackSource = event.source;
/*
* Note this possibility to interrupt certain (not all) events
*/
        if (event.isCancelable())
        {
            event.setCanceled(true);
        }

/*
* Events may offer further fields and methods. Just read them, it should be obvious.
*/
    }

    /**
     * To make sure you understand: You can mash together any events in a single class!
     */
    @SubscribeEvent
    public void onSleepyTime(PlayerSleepInBedEvent event)
    {
        event.result = EntityPlayer.EnumStatus.NOT_POSSIBLE_NOW;
    }
}