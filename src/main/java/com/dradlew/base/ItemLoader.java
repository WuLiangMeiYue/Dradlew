package com.dradlew.base;

import com.dradlew.items.IronMushroom;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ItemLoader {

    public static Item ironMushroom = new IronMushroom();

    public ItemLoader(FMLPreInitializationEvent event){
        register("iron_mushroom",ironMushroom);
    }

    public static void register(String name,Item item){
        GameRegistry.register(item.setRegistryName(name));
    }

    @SideOnly(Side.CLIENT)
    public static void registerRender(Item item){
        ModelResourceLocation model = new ModelResourceLocation(item.getRegistryName(),"inventory");
        ModelLoader.setCustomModelResourceLocation(item,0,model);
    }

    @SideOnly(Side.CLIENT)
    public static void registerRenders(){
        registerRender(ironMushroom);
    }

}
