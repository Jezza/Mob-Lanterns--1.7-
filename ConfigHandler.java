package com.gellegbs.lanterns;

import java.io.File;

import net.minecraftforge.common.config.Configuration;

import com.gellegbs.lanterns.blocks.BlockIds;

public class ConfigHandler {
    public static void init(File file) {
        Configuration config = new Configuration(file);

        config.load();

        BlockIds.BLAZE_ID = config.getBlock(BlockIds.BLAZE_KEY, BlockIds.BLAZE_DEFAULT).getInt();
        BlockIds.CREEPER_ID = config.getBlock(BlockIds.CREEPER_KEY, BlockIds.CREEPER_DEFAULT).getInt();
        BlockIds.ENDERMEN_ID = config.getBlock(BlockIds.ENDERMEN_KEY, BlockIds.ENDERMEN_DEFAULT).getInt();
        BlockIds.GHAST_ID = config.getBlock(BlockIds.GHAST_KEY, BlockIds.GHAST_DEFAULT).getInt();
        BlockIds.JACKOLANTERN_ID = config.getBlock(BlockIds.JACKOLANTERN_KEY, BlockIds.JACKOLANTERN_DEFAULT).getInt();
        BlockIds.MAGMA_ID = config.getBlock(BlockIds.MAGMA_KEY, BlockIds.MAGMA_DEFAULT).getInt();
        BlockIds.PIGMEN_ID = config.getBlock(BlockIds.PIGMEN_KEY, BlockIds.PIGMEN_DEFAULT).getInt();
        BlockIds.SKELETON_ID = config.getBlock(BlockIds.SKELETON_KEY, BlockIds.SKELETON_DEFAULT).getInt();
        BlockIds.SLIME_ID = config.getBlock(BlockIds.SLIME_KEY, BlockIds.SLIME_DEFAULT).getInt();
        BlockIds.SPIDER_ID = config.getBlock(BlockIds.SPIDER_KEY, BlockIds.SPIDER_DEFAULT).getInt();
        BlockIds.WITHERSKELE_ID = config.getBlock(BlockIds.WITHERSKELE_KEY, BlockIds.WITHERSKELE_DEFAULT).getInt();
        BlockIds.ZOMBIE_ID = config.getBlock(BlockIds.ZOMBIE_KEY, BlockIds.ZOMBIE_DEFAULT).getInt();
        BlockIds.ZSPAWN_ID = config.getBlock(BlockIds.ZSPAWN_KEY, BlockIds.ZSPAWN_DEFAULT).getInt();
        BlockIds.ZSPAWN_ID = config.getBlock(BlockIds.ZSPAWN_KEY, BlockIds.ZSPAWN_DEFAULT).getInt();
        BlockIds.SPAWN_STONE_ID = config.getBlock(BlockIds.SPAWN_STONE_KEY, BlockIds.SPAWN_STONE_DEFAULT).getInt();

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
