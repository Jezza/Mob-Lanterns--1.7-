package com.gellegbs.lanterns.world;

import java.util.Random;

import com.gellegbs.lanterns.blocks.BlockIds;
import com.gellegbs.lanterns.blocks.BlocksML;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraft.world.gen.feature.WorldGenerator;
import cpw.mods.fml.common.IWorldGenerator;
import cpw.mods.fml.common.registry.GameRegistry;

public class GenerationHandler implements IWorldGenerator {

	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world,
			IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {
		switch (world.provider.dimensionId) {
		case 0:
			generateOverworld(random, world, chunkX * 16, chunkZ * 16);
		}

	}

	public void generateOverworld(Random rand, World world, int x, int z) {
		addOres(BlocksML.spawnstone, world, rand, x, z, 1, 4, 17, 35, 60);
	}

	public void addOres(Block block, World world, Random rand, int blockXPos,
			int blockZPos, int minVeinSize, int maxVeinSize, int chanceToSpawn,
			int minY, int maxY) {
		WorldGenMinable mineable = new WorldGenMinable(block, minVeinSize
				+ rand.nextInt(maxVeinSize - minVeinSize), Blocks.stone);
		for (int i = 0; i < chanceToSpawn; i++) {
			int posX = blockXPos + rand.nextInt(15);
			int posZ = blockZPos + rand.nextInt(15);
			int posY = minY + rand.nextInt(maxY - minY);
			mineable.generate(world, rand, posX, posY, posZ);
		}

	}

}