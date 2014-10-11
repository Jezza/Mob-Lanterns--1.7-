package com.gellegbs.lanterns;

import java.util.List;

import net.minecraft.block.Block;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.command.ICommandSender;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.ISidedInventory;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ChatComponentText;
import net.minecraft.world.World;
import net.minecraftforge.common.util.ForgeDirection;
import net.minecraftforge.fluids.FluidTankInfo;
import net.minecraftforge.fluids.IFluidHandler;

import com.gellegbs.lanterns.blocks.BlocksML;
import com.gellegbs.lanterns.world.GenerationHandler;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;

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

	public static CreativeTabs tabMobLanterns = new CreativeTabs(
			"tabMobLanterns") {

		public Item getTabIconItem() {
			return Item.getItemFromBlock(BlocksML.jackolantern);
		}

	};

}
