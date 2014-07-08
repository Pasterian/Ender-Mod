package com.pasterian.usefulstuffmod.reference;

/**
 * Created by charleswalker on 07/07/2014.
 */

public class Reference {

public static final String MOD_ID = "UsefulStuffMod";
public static final String MOD_NAME = "Useful Stuff Mod";
public static final String VERSION = "1.7.10-1.0";

public static final String CLIENT_SIDE_PROXY= "com.pasterian.usefulstuffmod.proxy.ClientProxy";
public static final String SERVER_SIDE_PROXY= "com.pasterian.usefulstuffmod.proxy.ServerProxy";

public static final String GUI_FACTORY_CLASS = "com.pasterian.usefulstuffmod.client.gui.GuiFactory";

    public static final class NBT
    {
        public static final String CHARGE_LEVEL = "chargeLevel";
        public static final String MODE = "mode";
        public static final String CRAFTING_GUI_OPEN = "craftingGuiOpen";
        public static final String TRANSMUTATION_GUI_OPEN = "transmutationGuiOpen";
        public static final String ALCHEMICAL_BAG_GUI_OPEN = "alchemicalBagGuiOpen";
        public static final String UUID_MOST_SIG = "UUIDMostSig";
        public static final String UUID_LEAST_SIG = "UUIDLeastSig";
        public static final String DISPLAY = "display";
        public static final String COLOR = "color";
        public static final String STATE = "teState";
        public static final String CUSTOM_NAME = "CustomName";
        public static final String DIRECTION = "teDirection";
        public static final String OWNER = "owner";
    }
}
