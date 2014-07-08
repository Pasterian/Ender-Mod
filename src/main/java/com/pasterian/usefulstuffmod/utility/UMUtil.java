package com.pasterian.usefulstuffmod.utility;

import com.pasterian.usefulstuffmod.reference.Reference;

public class UMUtil {

    public static String getTexture(String name)
    {
        if (name == null)
        {
            throw new IllegalArgumentException("Name cannot be null!");
        }
        return Reference.MOD_ID.toLowerCase() + ":" + name;
    }

    }

