package com.cursee.examplemod;

import net.fabricmc.api.ModInitializer;

public class ExampleMod implements ModInitializer {
    
    @Override
    public void onInitialize() {

        CommonClass.init();
    }
}
