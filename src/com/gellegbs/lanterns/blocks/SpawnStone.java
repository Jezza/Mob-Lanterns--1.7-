package com.gellegbs.lanterns.blocks;

import com.gellegbs.lanterns.Lanterns;
import com.gellegbs.lanterns.Reference;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class SpawnStone extends Block {
    public SpawnStone() {
        super(Material.rock);
        this.setCreativeTab(Lanterns.tabMobLanterns);
        this.setBlockName(BlockIds.SPAWN_STONE_BLOCK_NAME);
        this.setHardness(1.5F);
        this.setBlockTextureName(Reference.IDENTIFIER + BlockIds.SPAWN_STONE_TEXTURE);
    }
}
