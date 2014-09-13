package com.gellegbs.lanterns;

import com.gellegbs.lanterns.blocks.BlocksML;
import com.gellegbs.lanterns.world.GenerationHandler;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

@Mod(modid = Reference.ID, name = Reference.NAME, version = Reference.VERSION)

public class Lanterns {

    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        ConfigHandler.init(event.getSuggestedConfigurationFile());
    }

    @EventHandler
    public void load(FMLInitializationEvent event) {

        BlocksML.init();
        BlocksML.recipes();
        BlocksML.registerTileEntities();
        GameRegistry.registerWorldGenerator(new GenerationHandler(), 10);
        
        
    }

    public static CreativeTabs tabMobLanterns = new CreativeTabs("tabMobLanterns") {
     
        public Item getTabIconItem() {
            return Item.getItemFromBlock(BlocksML.jackolantern);
            }
        		
    };
        

		
    }
