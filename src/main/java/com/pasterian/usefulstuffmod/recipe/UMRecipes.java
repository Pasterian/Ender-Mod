package com.pasterian.usefulstuffmod;

import com.pasterian.usefulstuffmod.init.UMBlocks;
import com.pasterian.usefulstuffmod.init.UMItems;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

public class UMRecipes {

    public static void init() {

        ItemStack blueQuartzStack = new ItemStack(UMBlocks.blueQuartz);
        ItemStack redQuartzStack = new ItemStack(UMBlocks.redQuartz);
        ItemStack yellowQuartzStack = new ItemStack(UMBlocks.yellowQuartz);
        ItemStack greenQuartzStack = new ItemStack(UMBlocks.greenQuartz);
        ItemStack pinkQuartzStack = new ItemStack(UMBlocks.pinkQuartz);
        ItemStack purpleQuartzStack = new ItemStack(UMBlocks.purpleQuartz);
        ItemStack cyanQuartzStack = new ItemStack(UMBlocks.cyanQuartz);

        ItemStack blueShardStack = new ItemStack(UMItems.blueShard);
        ItemStack redShardStack = new ItemStack(UMItems.redShard);
        ItemStack yellowShardStack = new ItemStack(UMItems.yellowShard);
        ItemStack greenShardStack = new ItemStack(UMItems.greenShard);
        ItemStack cyanShardStack = new ItemStack(UMItems.cyanShard);
        ItemStack pinkShardStack = new ItemStack(UMItems.pinkShard);
        ItemStack purpleShardStack = new ItemStack(UMItems.purpleShard);

        ItemStack minablePickStack = new ItemStack(UMBlocks.MinablePick);
        ItemStack stoneStack = new ItemStack(Blocks.stone);
        ItemStack pickaxeIronStack = new ItemStack(Items.iron_pickaxe);


//        ItemStack gemParmentaStack = new ItemStack(UMItems.parGem);
//        ItemStack blockParmentaStack = new ItemStack(UMBlocks.parmentaBlock);
//        ItemStack ParmentaStack = new ItemStack(UMItems.parGem, 9);
//
//        ItemStack parHelmetStack = new ItemStack(UMItems.parmentaHelm);
//        ItemStack parChestStack = new ItemStack(UMItems.parmentaChest);
//        ItemStack parLegsStack = new ItemStack(UMItems.parmentaLegs);
//        ItemStack parBootsStack = new ItemStack(UMItems.parmentaBoots);

        // Register Crafting Recipes

//        GameRegistry.addRecipe(parHelmetStack, "xxx", "xyx", "yyy", 'x', gemParmentaStack);
//        GameRegistry.addRecipe(parChestStack, "xyx", "xxx", "xxx", 'x', gemParmentaStack);
//        GameRegistry.addRecipe(parLegsStack, "xxx", "xyx", "xyx", 'x', gemParmentaStack);
//        GameRegistry.addRecipe(parBootsStack, "yyy", "xyx", "xyx", 'x', gemParmentaStack);

        GameRegistry.addRecipe(minablePickStack, "xxx", "xyx", "xxx", 'x', stoneStack, 'y', pickaxeIronStack);

        GameRegistry.addRecipe(blueQuartzStack, "xx", "xx", 'x', blueShardStack);
        GameRegistry.addRecipe(redQuartzStack, "xx","xx", 'x', redShardStack);
        GameRegistry.addRecipe(yellowQuartzStack, "xx","xx", 'x', yellowShardStack);
        GameRegistry.addRecipe(cyanQuartzStack, "xx","xx", 'x', cyanShardStack);
        GameRegistry.addRecipe(greenQuartzStack, "xx","xx", 'x', greenShardStack);
        GameRegistry.addRecipe(pinkQuartzStack, "xx","xx", 'x', pinkShardStack);
        GameRegistry.addRecipe(purpleQuartzStack, "xx","xx", 'x', purpleShardStack);

//        GameRegistry.addShapelessRecipe(ParmentaStack, UMBlocks.parmentaBlock);
//        GameRegistry.addRecipe(blockParmentaStack, "xxx","xxx","xxx", 'x', gemParmentaStack);
    }

}