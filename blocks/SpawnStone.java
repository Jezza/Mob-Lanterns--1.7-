package com.gellegbs.lanterns.blocks;

import com.gellegbs.lanterns.Lanterns;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class SpawnStone extends Block {
    public SpawnStone(Block par1) {
        super(Material.rock);
        this.setCreativeTab(Lanterns.tabMobLanterns);
        this.setBlockName(BlockIds.SPAWN_STONE_BLOCK_NAME);
        this.setHardness(1.5F);
        this.setBlockTextureName(BlockIds.TEXTURE_LOCATION + ":" + BlockIds.SPAWN_STONE_TEXTURE);

    }
}
