package com.pasterian.usefulstuffmod;

import com.pasterian.usefulstuffmod.UMRecipes;
import com.pasterian.usefulstuffmod.entity.EnderTNTPrimed;
import com.pasterian.usefulstuffmod.handler.ConfigurationHandler;
import com.pasterian.usefulstuffmod.init.UMBlocks;
import com.pasterian.usefulstuffmod.init.UMItems;
import com.pasterian.usefulstuffmod.proxy.IProxy;
import com.pasterian.usefulstuffmod.reference.Reference;
import com.pasterian.usefulstuffmod.tabs.CreativeTabBlock;
import com.pasterian.usefulstuffmod.tabs.CreativeTabItem;
import com.pasterian.usefulstuffmod.utility.LogHelper;
import cpw.mods.fml.client.registry.RenderingRegistry;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.EntityRegistry;
import net.minecraft.creativetab.CreativeTabs;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION, guiFactory = Reference.GUI_FACTORY_CLASS)

public class UsefulStuffMod {

    public static CreativeTabs UMCreativeTabItem = new CreativeTabItem("UMItemTab");
    public static CreativeTabs UMCreativeTabBlock = new CreativeTabBlock("UMBlockTab");

    @Mod.Instance(Reference.MOD_ID)
    public static UsefulStuffMod instance;

    @SidedProxy(clientSide = Reference.CLIENT_SIDE_PROXY, serverSide = Reference.SERVER_SIDE_PROXY)
    public static IProxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {

        UMItems.init();
        UMBlocks.init();

        LogHelper.info("Mod Starting");
        LogHelper.info("Pre Initialization Complete");

        ConfigurationHandler.init(event.getSuggestedConfigurationFile());
        FMLCommonHandler.instance().bus().register(new ConfigurationHandler());

        EntityRegistry.registerGlobalEntityID(EnderTNTPrimed.class, "entitytntprimed", EntityRegistry.findGlobalUniqueEntityId());
        EntityRegistry.registerModEntity(EnderTNTPrimed.class, "entitytntprimed", 51, this, 256, 1, false);

        LogHelper.debug("Config File loaded");
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {

        UMRecipes.init();
        LogHelper.info("Recipes Loaded!");
        LogHelper.debug("Initialization Complete");
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event) {

        LogHelper.debug("Post Initialization Complete");
    }
}
