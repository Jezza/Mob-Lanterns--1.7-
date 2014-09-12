package com.gellegbs.lanterns.blocks;

public enum BlockType {

    // lanterns
    BLAZE(BlockIds.BLAZE_BLOCK_NAME, "mob.blaze.breathe", BlockIds.BLAZETOP, BlockIds.BLAZEFRONT,
            BlockIds.BLAZESIDE, BlockIds.BLAZESIDEACTIVE, 0),

    CREEPER(BlockIds.CREEPER_BLOCK_NAME, "random.fuse", BlockIds.CREEPERTOP, BlockIds.CREEPERFRONT,
            BlockIds.CREEPERSIDE, BlockIds.CREEPERSIDEACTIVE, 0),

    ENDERMEN(BlockIds.ENDERMEN_BLOCK_NAME, "mob.endermen.stare", BlockIds.ENDERMENTOP, BlockIds.ENDERMENFRONT,
            BlockIds.ENDERMENSIDE, BlockIds.ENDERMENSIDEACTIVE, 0),

    GHAST(BlockIds.GHAST_BLOCK_NAME, "mob.ghast.scream", BlockIds.GHASTTOP, BlockIds.GHASTFRONT,
            BlockIds.GHASTSIDE, BlockIds.GHASTSIDEACTIVE, 0),

    JACKO(BlocksML.jackolantern, null, BlockIds.JACKOLANTERNTOP, BlockIds.JACKOLANTERNFRONT,
            BlockIds.JACKOLANTERNSIDE, BlockIds.JACKOLANTERNFRONT, 0),

    MAGMA_CUBE(BlockIds.MAGMA_BLOCK_NAME, "mob.slime.attack", BlockIds.MAGMATOP, BlockIds.MAGMAFRONT,
            BlockIds.MAGMASIDE, BlockIds.MAGMASIDEACTIVE, 0),

    PIGMEN(BlockIds.PIGMEN_BLOCK_NAME, "mob.zombiepig.zpigangry", BlockIds.PIGMENTOP, BlockIds.PIGMENFRONT,
            BlockIds.PIGMENSIDE, BlockIds.PIGMENSIDEACTIVE, 0),

    SKELETON(BlockIds.SKELETON_BLOCK_NAME, "mob.skeleton.say", BlockIds.SKELETONTOP, BlockIds.SKELETONFRONT,
            BlockIds.SKELETONSIDE, BlockIds.SKELETONSIDEACTIVE, 0),

    SLIME(BlockIds.SLIME_BLOCK_NAME, "mob.slime.big", BlockIds.SLIMETOP, BlockIds.SLIMEFRONT, BlockIds.SLIMESIDE,
            BlockIds.SLIMESIDEACTIVE, 0),

    SPIDER(BlockIds.SPIDER_BLOCK_NAME, "mob.spider.say", BlockIds.SPIDERTOP, BlockIds.SPIDERFRONT,
            BlockIds.SPIDERSIDE, BlockIds.SPIDERSIDEACTIVE, 0),

    WITHER_SKELETON(BlockIds.WITHERSKELE_BLOCK_NAME, "mob.skeleton.step", BlockIds.WITHERSKELETOP,
            BlockIds.WITHERSKELEFRONT, BlockIds.WITHERSKELESIDE, BlockIds.WITHERSKELESIDEACTIVE, 0),

    ZOMBIE(BlockIds.ZOMBIE_BLOCK_NAME, "mob.zombie.say", BlockIds.ZOMBIETOP, BlockIds.ZOMBIEFRONT,
            BlockIds.ZOMBIESIDE, BlockIds.ZOMBIESIDEACTIVE, 0),

    // spawners

    BLAZESPAWN(BlockIds.BLAZESPAWN_BLOCK_NAME, null, BlockIds.BLAZESPAWNTOP, BlockIds.BLAZESPAWNSIDE,
            BlockIds.BLAZESPAWNSIDE, BlockIds.BLAZESPAWNSIDE, 61),

    CREEPERSPAWN(BlockIds.CREEPERSPAWN_BLOCK_NAME, null, BlockIds.CREEPERSPAWNTOP, BlockIds.CREEPERSIDESPAWN,
            BlockIds.CREEPERSIDESPAWN, BlockIds.CREEPERSIDESPAWN, 50),

    ENDERMENSPAWN(BlockIds.ENDERMENSPAWN_BLOCK_NAME, null, BlockIds.ENDERMENSPAWNTOP, BlockIds.ENDERMENSPAWNSIDE,
            BlockIds.ENDERMENSPAWNSIDE, BlockIds.ENDERMENSPAWNSIDE, 58),

    GHASTSPAWN(BlockIds.GHASTSPAWN_BLOCK_NAME, null, BlockIds.GHASTSPAWNTOP, BlockIds.GHASTSPAWNSIDE,
            BlockIds.GHASTSPAWNSIDE, BlockIds.GHASTSPAWNSIDE, 56),

    MAGMASPAWN(BlockIds.MAGMASPAWN_BLOCK_NAME, null, BlockIds.MAGMASPAWNTOP, BlockIds.MAGMASPAWNSIDE,
            BlockIds.MAGMASPAWNSIDE, BlockIds.MAGMASPAWNSIDE, 62),

    PIGMENSPAWN(BlockIds.PIGMENSPAWN_BLOCK_NAME, null, BlockIds.PIGMENSPAWNTOP, BlockIds.PIGMENSPAWNSIDE,
            BlockIds.PIGMENSPAWNSIDE, BlockIds.PIGMENSPAWNSIDE, 57),

    SKELETONSPAWN(BlockIds.SKELETONSPAWN_BLOCK_NAME, null, BlockIds.SKELETONSPAWNTOP, BlockIds.SKELETONSPAWNSIDE,
            BlockIds.SKELETONSPAWNSIDE, BlockIds.SKELETONSPAWNSIDE, 51),

    SLIMESPAWN(BlockIds.SLIMESPAWN_BLOCK_NAME, null, BlockIds.SLIMESPAWNTOP, BlockIds.SLIMESPAWNSIDE,
            BlockIds.SLIMESPAWNSIDE, BlockIds.SLIMESPAWNSIDE, 55),

    SPIDERSPAWN(BlockIds.SPIDERSPAWN_BLOCK_NAME, null, BlockIds.SPIDERSPAWNTOP, BlockIds.SLIMESPAWNSIDE,
            BlockIds.SPIDERSPAWNSIDE, BlockIds.SPIDERSPAWNSIDE, 52),

    WITHERSKELESPAWN(BlockIds.WITHERSKELESPAWN_BLOCK_NAME, null, BlockIds.WITHERSKELESPAWNTOP,
            BlockIds.WITHERSKELESPAWNSIDE, BlockIds.WITHERSKELESPAWNSIDE, BlockIds.WITHERSKELESPAWNSIDE, 51),

    ZOMBIESPAWN(BlockIds.ZSPAWN_BLOCK_NAME, null, BlockIds.ZSPAWNTOP, BlockIds.ZSPAWNSIDE, BlockIds.ZSPAWNSIDE,
            BlockIds.ZSPAWNSIDE, 54),

    WITCHSPAWN(BlockIds.WITCHSPAWN_BLOCK_NAME, null, BlockIds.WITCHSPAWN_TOP, BlockIds.WITCHSPAWN_SIDE,
            BlockIds.WITCHSPAWN_SIDE, BlockIds.WITCHSPAWN_SIDE, 66),

    GIANTSPAWN(BlockIds.GIANTSPAWN_BLOCK_NAME, null, BlockIds.GIANTSPAWN_TOP, BlockIds.GIANTSPAWN_SIDE,
            BlockIds.GIANTSPAWN_SIDE, BlockIds.GIANTSPAWN_SIDE, 53);

    public final String unlocalizedName, sound, textureTop, textureFront, textureSide, textureSideActive;
    public int spawnerid;

    BlockType(String unlocalizedName, String sound, String textureTop, String textureFront, String textureSide,
            String textureSideActive, int spawnerid) {
        this.unlocalizedName = unlocalizedName;
        this.sound = sound;
        this.textureTop = textureTop;
        this.textureFront = textureFront;
        this.textureSide = textureSide;
        this.textureSideActive = textureSideActive;
        this.spawnerid = spawnerid;

    }
}
