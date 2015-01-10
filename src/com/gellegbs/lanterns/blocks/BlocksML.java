package com.gellegbs.lanterns.blocks;

import com.gellegbs.lanterns.Lanterns;
import com.gellegbs.lanterns.tileentities.TESpawner;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

import java.lang.reflect.Field;
import java.util.HashMap;

public class BlocksML {

    public static Block jackoLantern;
    public static Block creeperLantern;
    public static Block zombieLantern;
    public static Block skeletonLantern;
    public static Block spiderLantern;
    public static Block slimeLantern;
    public static Block endermenLantern;
    public static Block pigmenLantern;
    public static Block blazeLantern;
    public static Block magmaCubeLantern;
    public static Block witherSkeletonLantern;
    public static Block ghastLantern;

    public static Block zombieSpawn;
    public static Block blazeSpawn;
    public static Block creeperSpawn;
    public static Block endermenSpawn;
    public static Block skeletonSpawn;
    public static Block spiderSpawn;
    public static Block slimeSpawn;
    public static Block pigmenSpawn;
    public static Block ghastSpawn;
    public static Block witherSkeletonSpawn;
    public static Block magmaCubeSpawn;
    public static Block spawnStone;
    public static Block witchSpawn;
    public static Block giantSpawn;

    public static void init() {
        Field[] declaredFields = BlocksML.class.getDeclaredFields();
        HashMap<String, Field> fieldMap = new HashMap<>();
        for (Field field : declaredFields) {
            /**
             *  The reason I set this to true, is for two reasons.
             *  1. In the event that someone makes a field private for some stupid reason which defeats the purpose of maintaining a reference... and
             *  2. The performance of setting a field value is MASSIVELY increased (40x) when this is true.
             *  It acts a bypass for most of it, as this makes only one securityManager check and sets a flag.
             *  When a field is set, it checks multiple times stepping through the multiple hoops, UNLESS that flag is set.
             */
            field.setAccessible(true);
            fieldMap.put(field.getName(), field);
        }

        // Yes, setting each this for loop is stupid and slow, but it's only used once, AND it's for gelly to easily add blocks.
        for (BlockType blockType : BlockType.values()) {

            if (blockType.isLantern && fieldMap.containsKey(blockType.lanternString)) {
                BlockMobLantern lantern = new BlockMobLantern(blockType);
                GameRegistry.registerBlock(lantern, blockType.lanternString);
                try {
                    fieldMap.get(blockType.lanternString).set(null, lantern);
                } catch (IllegalAccessException e) {
                    // Never going to be reached.
                    Lanterns.logger.fatal("Failed to set field: {}", blockType.lanternString);
                    Lanterns.logger.fatal("Exception thrown:", e);
                }
            }

            if (blockType.isSpawner && fieldMap.containsKey(blockType.spawnerString)) {
                BlockSpawner spawner = new BlockSpawner(blockType);
                GameRegistry.registerBlock(spawner, blockType.spawnerString);
                try {
                    fieldMap.get(blockType.spawnerString).set(null, spawner);
                } catch (IllegalAccessException e) {
                    // Never going to be reached.
                    Lanterns.logger.fatal("Failed to set field: {}", blockType.spawnerString);
                    Lanterns.logger.fatal("Exception thrown:", e);
                }
            }
        }


//        jackoLantern = new BlockMobLantern(BlockType.JACKO);
//        GameRegistry.registerBlock(jackoLantern, BlockIds.JACKOLANTERN_NAME);
//
//        creeperlantern = new BlockMobLantern(BlockType.CREEPER);
//        GameRegistry.registerBlock(creeperlantern, BlockIds.CREEPER_NAME);
//
//        zombielantern = new BlockMobLantern(BlockType.ZOMBIE);
//        GameRegistry.registerBlock(zombielantern, BlockIds.ZOMBIE_NAME);
//
//        skeletonlantern = new BlockMobLantern(BlockType.SKELETON);
//        GameRegistry.registerBlock(skeletonlantern, BlockIds.SKELETON_NAME);
//
//        spiderlantern = new BlockMobLantern(BlockType.SPIDER);
//        GameRegistry.registerBlock(spiderlantern, BlockIds.SPIDER_NAME);
//
//        slimelantern = new BlockMobLantern(BlockType.SLIME);
//        GameRegistry.registerBlock(slimelantern, BlockIds.SLIME_NAME);
//
//        endermenlantern = new BlockMobLantern(BlockType.ENDERMEN);
//        GameRegistry.registerBlock(endermenlantern, BlockIds.ENDERMEN_NAME);
//
//        pigmenlantern = new BlockMobLantern(BlockType.PIGMEN).setBlockName(BlockIds.PIGMEN_BLOCK_NAME);
//        GameRegistry.registerBlock(pigmenlantern, BlockIds.PIGMEN_NAME);
//
//        blazelantern = new BlockMobLantern(BlockType.BLAZE).setBlockName(BlockIds.BLAZE_BLOCK_NAME);
//        GameRegistry.registerBlock(blazelantern, BlockIds.BLAZE_NAME);
//
//        magmacubelantern = new BlockMobLantern(BlockType.MAGMA_CUBE).setBlockName(BlockIds.MAGMA_BLOCK_NAME);
//        GameRegistry.registerBlock(magmacubelantern, BlockIds.MAGMA_NAME);
//
//        witherskeletonlantern = new BlockMobLantern(BlockType.WITHER_SKELETON).setBlockName(BlockIds.WITHERSKELE_BLOCK_NAME);
//        GameRegistry.registerBlock(witherskeletonlantern, BlockIds.WITHERSKELE_NAME);
//
//        ghastlantern = new BlockMobLantern(BlockType.GHAST).setBlockName(BlockIds.GHAST_BLOCK_NAME);
//        GameRegistry.registerBlock(ghastlantern, BlockIds.GHAST_NAME);
//
//        zspawn = new BlockSpawner(BlockType.ZOMBIESPAWN).setBlockName(BlockIds.ZSPAWN_BLOCK_NAME);
//        GameRegistry.registerBlock(zspawn, BlockIds.ZSPAWN_NAME);
//
//        blazespawn = new BlockSpawner(BlockType.BLAZESPAWN).setBlockName(BlockIds.BLAZESPAWN_BLOCK_NAME);
//        GameRegistry.registerBlock(blazespawn, BlockIds.BLAZESPAWN_NAME);
//
//        creeperspawn = new BlockSpawner(BlockType.CREEPERSPAWN).setBlockName(BlockIds.CREEPERSPAWN_BLOCK_NAME);
//        GameRegistry.registerBlock(creeperspawn, BlockIds.CREEPERSPAWN_NAME);
//
//        endermenspawn = new BlockSpawner(BlockType.ENDERMENSPAWN).setBlockName(BlockIds.ENDERMENSPAWN_BLOCK_NAME);
//        GameRegistry.registerBlock(endermenspawn, BlockIds.ENDERMENSPAWN_NAME);
//
//        skelespawn = new BlockSpawner(BlockType.SKELETONSPAWN).setBlockName(BlockIds.SKELETONSPAWN_BLOCK_NAME);
//        GameRegistry.registerBlock(skelespawn, BlockIds.SKELETONSPAWN_BLOCK_NAME);
//
//        spiderspawn = new BlockSpawner(BlockType.SPIDERSPAWN).setBlockName(BlockIds.SPIDERSPAWN_BLOCK_NAME);
//        GameRegistry.registerBlock(spiderspawn, BlockIds.SPIDERSPAWN_NAME);
//
//        slimespawn = new BlockSpawner(BlockType.SLIMESPAWN).setBlockName(BlockIds.SLIME_BLOCK_NAME);
//        GameRegistry.registerBlock(slimespawn, BlockIds.SLIMESPAWN_NAME);
//
//        pigmenspawn = new BlockSpawner(BlockType.PIGMENSPAWN).setBlockName(BlockIds.PIGMENSPAWN_BLOCK_NAME);
//        GameRegistry.registerBlock(pigmenspawn, BlockIds.PIGMENSPAWN_NAME);
//
//        ghastspawn = new BlockSpawner(BlockType.GHASTSPAWN).setBlockName(BlockIds.GHASTSPAWN_BLOCK_NAME);
//        GameRegistry.registerBlock(ghastspawn, BlockIds.GHASTSPAWN_NAME);
//
//        witherskelespawn = new BlockSpawner(BlockType.WITHERSKELESPAWN).setBlockName(BlockIds.WITHERSKELESPAWN_BLOCK_NAME);
//        GameRegistry.registerBlock(witherskelespawn, BlockIds.WITHERSKELESPAWN_NAME);
//
//        magmaspawn = new BlockSpawner(BlockType.MAGMASPAWN).setBlockName(BlockIds.MAGMASPAWN_BLOCK_NAME);
//        GameRegistry.registerBlock(magmaspawn, BlockIds.MAGMASPAWN_NAME);
//
//        witchspawn = new BlockSpawner(BlockType.WITCHSPAWN).setBlockName(BlockIds.WITCHSPAWN_BLOCK_NAME);
//        GameRegistry.registerBlock(witchspawn, BlockIds.WITCHSPAWN_NAME);
//
//        giantspawn = new BlockSpawner(BlockType.GIANTSPAWN).setBlockName(BlockIds.GIANTSPAWN_BLOCK_NAME);
//        GameRegistry.registerBlock(giantspawn, BlockIds.GIANTSPAWN_NAME);

        spawnStone = new SpawnStone();
        GameRegistry.registerBlock(spawnStone, BlockIds.SPAWN_STONE_NAME);
    }

    public static void registerTileEntities() {
        GameRegistry.registerTileEntity(TESpawner.class, BlockIds.TILE_SPAWNER_STRING);
    }


    public static void recipes() {
        GameRegistry.addShapelessRecipe(new ItemStack(BlocksML.jackoLantern), new ItemStack(Blocks.lit_pumpkin),
                new ItemStack(Blocks.torch));
        GameRegistry.addShapelessRecipe(new ItemStack(BlocksML.creeperLantern), new ItemStack(Blocks.lit_pumpkin),
                new ItemStack(Items.gunpowder));
        GameRegistry.addShapelessRecipe(new ItemStack(BlocksML.zombieLantern), new ItemStack(Blocks.lit_pumpkin),
                new ItemStack(Items.rotten_flesh));
        GameRegistry.addShapelessRecipe(new ItemStack(BlocksML.skeletonLantern), new ItemStack(Blocks.lit_pumpkin),
                new ItemStack(Items.bone));
        GameRegistry.addShapelessRecipe(new ItemStack(BlocksML.spiderLantern), new ItemStack(Blocks.lit_pumpkin),
                new ItemStack(Items.spider_eye));
        GameRegistry.addShapelessRecipe(new ItemStack(BlocksML.slimeLantern), new ItemStack(Blocks.lit_pumpkin),
                new ItemStack(Items.slime_ball));
        GameRegistry.addShapelessRecipe(new ItemStack(BlocksML.endermenLantern), new ItemStack(Blocks.lit_pumpkin),
                new ItemStack(Items.ender_pearl));
        GameRegistry.addShapelessRecipe(new ItemStack(BlocksML.pigmenLantern), new ItemStack(Blocks.lit_pumpkin),
                new ItemStack(Items.gold_nugget));
        GameRegistry.addShapelessRecipe(new ItemStack(BlocksML.blazeLantern), new ItemStack(Blocks.lit_pumpkin),
                new ItemStack(Items.blaze_powder));
        GameRegistry.addShapelessRecipe(new ItemStack(BlocksML.magmaCubeLantern), new ItemStack(Blocks.lit_pumpkin),
                new ItemStack(Items.magma_cream));
        GameRegistry.addShapelessRecipe(new ItemStack(BlocksML.witherSkeletonLantern),
                new ItemStack(Blocks.lit_pumpkin), new ItemStack(Items.coal));
        GameRegistry.addShapelessRecipe(new ItemStack(BlocksML.ghastLantern), new ItemStack(Blocks.lit_pumpkin),
                new ItemStack(Items.ghast_tear));

        // spawners
        GameRegistry.addRecipe(new ItemStack(BlocksML.zombieSpawn, 1), "FFF", "FBF", "FFF", 'F',
                Items.rotten_flesh, 'B', BlocksML.spawnStone);

        GameRegistry.addRecipe(new ItemStack(BlocksML.blazeSpawn, 1), "RRR", "RBR", "RRR", 'R',
                Items.blaze_rod, 'B', BlocksML.spawnStone);

        GameRegistry.addRecipe(new ItemStack(BlocksML.creeperSpawn, 1), "RRR", "RBR", "RRR", 'R',
                Items.gunpowder, 'B', BlocksML.spawnStone);

        GameRegistry.addRecipe(new ItemStack(BlocksML.endermenSpawn, 1), "RRR", "RBR", "RRR", 'R',
                Items.ender_pearl, 'B', BlocksML.spawnStone);

        GameRegistry.addRecipe(new ItemStack(BlocksML.ghastSpawn, 1), "RRR", "RBR", "RRR", 'R',
                Items.ghast_tear, 'B', BlocksML.spawnStone);

        GameRegistry.addRecipe(new ItemStack(BlocksML.giantSpawn, 1), "RRR", "RBR", "RRR", 'R',
                new ItemStack(Items.skull, 1, 2), 'B', BlocksML.spawnStone);

        GameRegistry.addRecipe(new ItemStack(BlocksML.magmaCubeSpawn, 1), "RRR", "RBR", "RRR", 'R',
                Items.magma_cream, 'B', BlocksML.spawnStone);

        GameRegistry.addRecipe(new ItemStack(BlocksML.pigmenSpawn, 1), "RRR", "RBR", "RRR", 'R',
                Items.gold_nugget, 'B', BlocksML.spawnStone);

        GameRegistry.addRecipe(new ItemStack(BlocksML.skeletonSpawn, 1), "RRR", "RBR", "RRR", 'R', Items.bone,
                'B', BlocksML.spawnStone);

        GameRegistry.addRecipe(new ItemStack(BlocksML.slimeSpawn, 1), "RRR", "RBR", "RRR", 'R',
                Items.slime_ball, 'B', BlocksML.spawnStone);

        GameRegistry.addRecipe(new ItemStack(BlocksML.spiderSpawn, 1), "RRR", "RBR", "RRR", 'R',
                Items.spider_eye, 'B', BlocksML.spawnStone);

        GameRegistry.addRecipe(new ItemStack(BlocksML.witchSpawn, 1), "RRR", "RBR", "RRR", 'R',
                Items.nether_wart, 'B', BlocksML.spawnStone);

        GameRegistry.addRecipe(new ItemStack(BlocksML.witherSkeletonSpawn, 1), "RRR", "RBR", "RRR", 'R',
                new ItemStack(Items.skull, 1, 1), 'B', BlocksML.spawnStone);

    }

}
