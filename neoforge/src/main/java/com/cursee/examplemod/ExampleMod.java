package com.cursee.examplemod;

import net.neoforged.fml.common.Mod;

@Mod(Constants.MOD_ID)
public class ExampleMod {

    public ExampleMod() {

        CommonClass.init();
    }
}