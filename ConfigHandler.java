package com.gellegbs.lanterns;

import java.io.File;

import net.minecraftforge.common.config.Configuration;

import com.gellegbs.lanterns.blocks.BlockIds;

public class ConfigHandler {
    public static void init(File file) {
        Configuration config = new Configuration(file);

        config.load();



        BlockIds.BLAZESPAWN_ID = config.getBlock(BlockIds.BLAZESPAWN_KEY, BlockIds.BLAZESPAWN_DEFAULT).getInt();
        BlockIds.CREEPERSPAWN_ID = config.getBlock(BlockIds.CREEPERSPAWN_KEY, BlockIds.CREEPERSPAWN_DEFAULT).getInt();
        BlockIds.ENDERMENSPAWN_ID = config.getBlock(BlockIds.ENDERMENSPAWN_KEY, BlockIds.ENDERMENSPAWN_DEFAULT)
                .getInt();
        BlockIds.GHASTSPAWN_ID = config.getBlock(BlockIds.GHASTSPAWN_KEY, BlockIds.GHAST_DEFAULT).getInt();
        BlockIds.MAGMASPAWN_ID = config.getBlock(BlockIds.MAGMASPAWN_KEY, BlockIds.MAGMA_DEFAULT).getInt();
        BlockIds.PIGMENSPAWN_ID = config.getBlock(BlockIds.PIGMENSPAWN_KEY, BlockIds.PIGMENSPAWN_DEFAULT).getInt();
        BlockIds.SKELETONSPAWN_ID = config.getBlock(BlockIds.SKELETONSPAWN_KEY, BlockIds.SKELETONSPAWN_DEFAULT)
                .getInt();
        BlockIds.SLIMESPAWN_ID = config.getBlock(BlockIds.SLIMESPAWN_KEY, BlockIds.SLIME_DEFAULT).getInt();
        BlockIds.SPIDERSPAWN_ID = config.getBlock(BlockIds.SPIDERSPAWN_KEY, BlockIds.SPIDERSPAWN_DEFAULT).getInt();
        BlockIds.WITHERSKELESPAWN_ID = config
                .getBlock(BlockIds.WITHERSKELESPAWN_KEY, BlockIds.WITHERSKELESPAWN_DEFAULT).getInt();
        BlockIds.WITCHSPAWN_ID = config.getBlock(BlockIds.WITCHSPAWN_KEY, BlockIds.WITCHSPAWN_DEFAULT).getInt();
        BlockIds.SPAWN_STONE_ID = config.getBlock(BlockIds.SPAWN_STONE_KEY, BlockIds.SPAWN_STONE_DEFAULT).getInt();
        BlockIds.GIANTSPAWN_ID = config.getBlock(BlockIds.GIANTSPAWN_KEY, BlockIds.GIANTSPAWN_DEFAULT).getInt();

        config.save();
    }
}
