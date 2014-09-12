package com.gellegbs.lanterns.world;

import java.util.Random;



import com.gellegbs.lanterns.blocks.BlockIds;

import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraft.world.gen.feature.WorldGenerator;
import cpw.mods.fml.common.IWorldGenerator;
import cpw.mods.fml.common.registry.GameRegistry;

public class GenerationHandler implements IWorldGenerator {

    private WorldGenerator spawnstone;

    public GenerationHandler() {
        GameRegistry.registerWorldGenerator(this, 0);
        spawnstone = new WorldGenMinable(BlockIds.SPAWN_STONE_BLOCK_NAME, 3);
    }

    private void generateStandarOre(Random rand, int chunkX, int chunkZ, World world, int iterations,
            WorldGenerator gen, int lowestY, int highestY) {
        for (int i = 0; i < iterations; i++) {
            int x = chunkX * 16 + rand.nextInt(16);
            int z = chunkZ * 16 + rand.nextInt(16);
            int y = rand.nextInt(highestY - lowestY) + lowestY;

            gen.generate(world, rand, x, y, z);

        }
    }

    @Override
    public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator,
            IChunkProvider chunkProvider) {
        generateStandarOre(random, chunkX, chunkZ, world, 12, spawnstone, 28, 60);
    }

}
