package com.gellegbs.lanterns;

import com.gellegbs.lanterns.blocks.BlocksML;
import com.gellegbs.lanterns.world.GenerationHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import org.apache.logging.log4j.Logger;

@Mod(modid = Reference.MOD_ID, name = Reference.NAME, version = Reference.VERSION)
public class Lanterns {

    @Mod.Instance
    public static Lanterns INSTANCE;

    public static Logger logger;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        logger = event.getModLog();
    }

    @EventHandler
    public void load(FMLInitializationEvent event) {
        BlocksML.init();
        BlocksML.recipes();
        BlocksML.registerTileEntities();
        GameRegistry.registerWorldGenerator(new GenerationHandler(), 10);
    }

    public static CreativeTabs tabMobLanterns = new CreativeTabs(Reference.MOD_ID) {
        public Item getTabIconItem() {
            return Item.getItemFromBlock(BlocksML.jackoLantern);
        }
    };
}
