package com.pasterian.usefulstuffmod.init;

import com.pasterian.usefulstuffmod.item.*;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;

public class UMItems{

    // Quartz Shards
    public static final GenericItem redShard = new ItemRedShard();
    public static final GenericItem blueShard = new ItemBlueShard();
    public static final GenericItem pinkShard = new ItemPinkShard();
    public static final GenericItem purpleShard = new ItemPurpleShard();
    public static final GenericItem greenShard = new ItemGreenShard();
    public static final GenericItem yellowShard = new ItemYellowShard();
    public static final GenericItem cyanShard = new ItemCyanShard();

public static void init() {

    // Quartz Shards
    GameRegistry.registerItem(redShard, "redShard");
    GameRegistry.registerItem(blueShard, "blueShard");
    GameRegistry.registerItem(pinkShard, "pinkShard");
    GameRegistry.registerItem(purpleShard, "purpleShard");
    GameRegistry.registerItem(greenShard, "greenShard");
    GameRegistry.registerItem(yellowShard, "yellowShard");
    GameRegistry.registerItem(cyanShard, "cyanShard");

	}
}
