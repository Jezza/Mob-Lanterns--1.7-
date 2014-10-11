package com.gellegbs.lanterns.blocks;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

import com.gellegbs.lanterns.tileentities.TESpawner;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class BlocksML {

    public static Block jackolantern;
    public static Block creeperlantern;
    public static Block zombielantern;
    public static Block skeletonlantern;
    public static Block spiderlantern;
    public static Block slimelantern;
    public static Block endermenlantern;
    public static Block pigmenlantern;
    public static Block blazelantern;
    public static Block magmacubelantern;
    public static Block witherskeletonlantern;
    public static Block ghastlantern;
    public static Block zspawn;
    public static Block blazespawn;
    public static Block creeperspawn;
    public static Block endermenspawn;
    public static Block skelespawn;
    public static Block spiderspawn;
    public static Block slimespawn;
    public static Block pigmenspawn;
    public static Block ghastspawn;
    public static Block witherskelespawn;
    public static Block magmaspawn;
    public static Block spawnstone;
    public static Block witchspawn;
    public static Block giantspawn;
   

    public static void init() {

        jackolantern = new BlockMobLantern(BlockType.JACKO).setBlockName(BlockIds.JACKOLANTERN_BLOCK_NAME);
        GameRegistry.registerBlock(jackolantern, BlockIds.JACKOLANTERN_NAME);

        creeperlantern = new BlockMobLantern(BlockType.CREEPER).setBlockName(BlockIds.CREEPER_BLOCK_NAME);
        GameRegistry.registerBlock(creeperlantern, BlockIds.CREEPER_NAME);

        zombielantern = new BlockMobLantern(BlockType.ZOMBIE).setBlockName(BlockIds.ZOMBIE_BLOCK_NAME);
        GameRegistry.registerBlock(zombielantern, BlockIds.ZOMBIE_NAME);

        skeletonlantern = new BlockMobLantern(BlockType.SKELETON).setBlockName(BlockIds.SKELETON_BLOCK_NAME);
        GameRegistry.registerBlock(skeletonlantern, BlockIds.SKELETON_NAME);

        spiderlantern = new BlockMobLantern(BlockType.SPIDER).setBlockName(BlockIds.SPIDER_BLOCK_NAME);
        GameRegistry.registerBlock(spiderlantern, BlockIds.SPIDER_NAME);

        slimelantern = new BlockMobLantern(BlockType.SLIME).setBlockName(BlockIds.SLIME_BLOCK_NAME);
        GameRegistry.registerBlock(slimelantern, BlockIds.SLIME_NAME);

        endermenlantern = new BlockMobLantern(BlockType.ENDERMEN).setBlockName(BlockIds.ENDERMEN_BLOCK_NAME);
        GameRegistry.registerBlock(endermenlantern, BlockIds.ENDERMEN_NAME);

        pigmenlantern = new BlockMobLantern(BlockType.PIGMEN).setBlockName(BlockIds.PIGMEN_BLOCK_NAME);
        GameRegistry.registerBlock(pigmenlantern, BlockIds.PIGMEN_NAME);

        blazelantern = new BlockMobLantern(BlockType.BLAZE).setBlockName(BlockIds.BLAZE_BLOCK_NAME);
        GameRegistry.registerBlock(blazelantern, BlockIds.BLAZE_NAME);

        magmacubelantern = new BlockMobLantern(BlockType.MAGMA_CUBE).setBlockName(BlockIds.MAGMA_BLOCK_NAME);
        GameRegistry.registerBlock(magmacubelantern, BlockIds.MAGMA_NAME);

        witherskeletonlantern = new BlockMobLantern(BlockType.WITHER_SKELETON).setBlockName(BlockIds.WITHERSKELE_BLOCK_NAME);
        GameRegistry.registerBlock(witherskeletonlantern, BlockIds.WITHERSKELE_NAME);

        ghastlantern = new BlockMobLantern(BlockType.GHAST).setBlockName(BlockIds.GHAST_BLOCK_NAME);
        GameRegistry.registerBlock(ghastlantern, BlockIds.GHAST_NAME);

        zspawn = new BlockSpawner(BlockType.ZOMBIESPAWN).setBlockName(BlockIds.ZSPAWN_BLOCK_NAME);
        GameRegistry.registerBlock(zspawn, BlockIds.ZSPAWN_NAME);

        blazespawn = new BlockSpawner(BlockType.BLAZESPAWN).setBlockName(BlockIds.BLAZESPAWN_BLOCK_NAME);
        GameRegistry.registerBlock(blazespawn, BlockIds.BLAZESPAWN_NAME );

        creeperspawn = new BlockSpawner(BlockType.CREEPERSPAWN).setBlockName(BlockIds.CREEPERSPAWN_BLOCK_NAME);
        GameRegistry.registerBlock(creeperspawn, BlockIds.CREEPERSPAWN_NAME);

        endermenspawn = new BlockSpawner(BlockType.ENDERMENSPAWN).setBlockName(BlockIds.ENDERMENSPAWN_BLOCK_NAME);
        GameRegistry.registerBlock(endermenspawn, BlockIds.ENDERMENSPAWN_NAME);

        skelespawn = new BlockSpawner(BlockType.SKELETONSPAWN).setBlockName(BlockIds.SKELETONSPAWN_BLOCK_NAME);
        GameRegistry.registerBlock(skelespawn, BlockIds.SKELETONSPAWN_BLOCK_NAME);

        spiderspawn = new BlockSpawner(BlockType.SPIDERSPAWN).setBlockName(BlockIds.SPIDERSPAWN_BLOCK_NAME);
        GameRegistry.registerBlock(spiderspawn, BlockIds.SPIDERSPAWN_NAME);

        slimespawn = new BlockSpawner(BlockType.SLIMESPAWN).setBlockName(BlockIds.SLIME_BLOCK_NAME);
        GameRegistry.registerBlock(slimespawn, BlockIds.SLIMESPAWN_NAME);

        pigmenspawn = new BlockSpawner (BlockType.PIGMENSPAWN).setBlockName(BlockIds.PIGMENSPAWN_BLOCK_NAME);
        GameRegistry.registerBlock(pigmenspawn, BlockIds.PIGMENSPAWN_NAME );

        ghastspawn = new BlockSpawner(BlockType.GHASTSPAWN).setBlockName(BlockIds.GHASTSPAWN_BLOCK_NAME);
        GameRegistry.registerBlock(ghastspawn, BlockIds.GHASTSPAWN_NAME);

        witherskelespawn = new BlockSpawner(BlockType.WITHERSKELESPAWN).setBlockName(BlockIds.WITHERSKELESPAWN_BLOCK_NAME);
        GameRegistry.registerBlock(witherskelespawn, BlockIds.WITHERSKELESPAWN_NAME);

        magmaspawn = new BlockSpawner(BlockType.MAGMASPAWN).setBlockName(BlockIds.MAGMASPAWN_BLOCK_NAME);
        GameRegistry.registerBlock(magmaspawn, BlockIds.MAGMASPAWN_NAME);

        witchspawn = new BlockSpawner(BlockType.WITCHSPAWN).setBlockName(BlockIds.WITCHSPAWN_BLOCK_NAME);
        GameRegistry.registerBlock(witchspawn, BlockIds.WITCHSPAWN_NAME);

        giantspawn = new BlockSpawner(BlockType.GIANTSPAWN).setBlockName(BlockIds.GIANTSPAWN_BLOCK_NAME);
        GameRegistry.registerBlock(giantspawn, BlockIds.GIANTSPAWN_NAME);

        spawnstone = new SpawnStone(spawnstone).setBlockName(BlockIds.SPAWN_STONE_BLOCK_NAME);
        GameRegistry.registerBlock(spawnstone, BlockIds.SPAWN_STONE_NAME);
        

    }

    public static void registerTileEntities() {
        GameRegistry.registerTileEntity(TESpawner.class, BlockIds.ZSPAWN_BLOCK_NAME);

    }

   

   

    public static void recipes() {
        GameRegistry.addShapelessRecipe(new ItemStack(BlocksML.jackolantern), new ItemStack(Blocks.lit_pumpkin),
                new ItemStack(Blocks.torch));
        GameRegistry.addShapelessRecipe(new ItemStack(BlocksML.creeperlantern), new ItemStack(Blocks.lit_pumpkin),
                new ItemStack(Items.gunpowder));
        GameRegistry.addShapelessRecipe(new ItemStack(BlocksML.zombielantern), new ItemStack(Blocks.lit_pumpkin),
                new ItemStack(Items.rotten_flesh));
        GameRegistry.addShapelessRecipe(new ItemStack(BlocksML.skeletonlantern), new ItemStack(Blocks.lit_pumpkin),
                new ItemStack(Items.bone));
        GameRegistry.addShapelessRecipe(new ItemStack(BlocksML.spiderlantern), new ItemStack(Blocks.lit_pumpkin),
                new ItemStack(Items.spider_eye));
        GameRegistry.addShapelessRecipe(new ItemStack(BlocksML.slimelantern), new ItemStack(Blocks.lit_pumpkin),
                new ItemStack(Items.slime_ball));
        GameRegistry.addShapelessRecipe(new ItemStack(BlocksML.endermenlantern), new ItemStack(Blocks.lit_pumpkin),
                new ItemStack(Items.ender_pearl));
        GameRegistry.addShapelessRecipe(new ItemStack(BlocksML.pigmenlantern), new ItemStack(Blocks.lit_pumpkin),
                new ItemStack(Items.gold_nugget));
        GameRegistry.addShapelessRecipe(new ItemStack(BlocksML.blazelantern), new ItemStack(Blocks.lit_pumpkin),
                new ItemStack(Items.blaze_powder));
        GameRegistry.addShapelessRecipe(new ItemStack(BlocksML.magmacubelantern), new ItemStack(Blocks.lit_pumpkin),
                new ItemStack(Items.magma_cream));
        GameRegistry.addShapelessRecipe(new ItemStack(BlocksML.witherskeletonlantern),
                new ItemStack(Blocks.lit_pumpkin), new ItemStack(Items.coal));
        GameRegistry.addShapelessRecipe(new ItemStack(BlocksML.ghastlantern), new ItemStack(Blocks.lit_pumpkin),
                new ItemStack(Items.ghast_tear));
        
        // spawners
        GameRegistry.addRecipe(new ItemStack(BlocksML.zspawn, 1), new Object[] { "FFF", "FBF", "FFF", 'F',
                Items.rotten_flesh, 'B', BlocksML.spawnstone, });

        GameRegistry.addRecipe(new ItemStack(BlocksML.blazespawn, 1), new Object[] { "RRR", "RBR", "RRR", 'R',
                Items.blaze_rod, 'B', BlocksML.spawnstone, });

        GameRegistry.addRecipe(new ItemStack(BlocksML.creeperspawn, 1), new Object[] { "RRR", "RBR", "RRR", 'R',
                Items.gunpowder, 'B', BlocksML.spawnstone, });

        GameRegistry.addRecipe(new ItemStack(BlocksML.endermenspawn, 1), new Object[] { "RRR", "RBR", "RRR", 'R',
                Items.ender_pearl, 'B', BlocksML.spawnstone, });

        GameRegistry.addRecipe(new ItemStack(BlocksML.ghastspawn, 1), new Object[] { "RRR", "RBR", "RRR", 'R',
                Items.ghast_tear, 'B', BlocksML.spawnstone, });

        GameRegistry.addRecipe(new ItemStack(BlocksML.giantspawn, 1), new Object[] { "RRR", "RBR", "RRR", 'R',
                new ItemStack(Items.skull, 1, 2), 'B', BlocksML.spawnstone, });

        GameRegistry.addRecipe(new ItemStack(BlocksML.magmaspawn, 1), new Object[] { "RRR", "RBR", "RRR", 'R',
                Items.magma_cream, 'B', BlocksML.spawnstone, });

        GameRegistry.addRecipe(new ItemStack(BlocksML.pigmenspawn, 1), new Object[] { "RRR", "RBR", "RRR", 'R',
                Items.gold_nugget, 'B', BlocksML.spawnstone, });

        GameRegistry.addRecipe(new ItemStack(BlocksML.skelespawn, 1), new Object[] { "RRR", "RBR", "RRR", 'R', Items.bone,
                'B', BlocksML.spawnstone, });

        GameRegistry.addRecipe(new ItemStack(BlocksML.slimespawn, 1), new Object[] { "RRR", "RBR", "RRR", 'R',
                Items.slime_ball, 'B', BlocksML.spawnstone, });

        GameRegistry.addRecipe(new ItemStack(BlocksML.spiderspawn, 1), new Object[] { "RRR", "RBR", "RRR", 'R',
                Items.spider_eye, 'B', BlocksML.spawnstone, });

        GameRegistry.addRecipe(new ItemStack(BlocksML.witchspawn, 1), new Object[] { "RRR", "RBR", "RRR", 'R',
                Items.nether_wart, 'B', BlocksML.spawnstone, });

        GameRegistry.addRecipe(new ItemStack(BlocksML.witherskelespawn, 1), new Object[] { "RRR", "RBR", "RRR", 'R',
                new ItemStack(Items.skull, 1, 1), 'B', BlocksML.spawnstone, });

    }

}
