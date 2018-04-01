package com.dradlew;

import com.dradlew.base.ItemLoader;
import com.dradlew.common.CommonProxy;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Dradlew.MODID, version = Dradlew.VERSION)
public class Dradlew {
    public static final String MODID = "dradlew";
    public static final String VERSION = "1.0";

    @Mod.Instance(Dradlew.MODID)
    public static Dradlew instance;
    @SidedProxy(clientSide = "com.dradlew.client.ClientProxy", serverSide = "com.dradlew.common.CommonProxy")
    public static CommonProxy commonProxy;

    @EventHandler
    public void init(FMLInitializationEvent event) {
        commonProxy.init(event);
    }

    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        commonProxy.preInit(event);
        new ItemLoader(event);
    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event) {
        commonProxy.postInit(event);
    }

}
