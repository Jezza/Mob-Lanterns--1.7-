package com.gellegbs.lanterns.blocks;

public enum BlockType {

    // Lanterns
    JACKO("jacko"),
    CREEPER("creeper", "creeper.primed", 50),
    ZOMBIE("zombie", "mob.zombie.say", 54),
    SKELETON("skeleton", "mob.skeleton.say", 51),
    SPIDER("spider", "mob.spider.say", 52),
    SLIME("slime", "mob.slime.big", 55),
    ENDERMEN("endermen", "mob.endermen.stare", 58),
    PIGMEN("pigmen", "mob.zombiepig.zpigangry", 57),
    BLAZE("blaze", "mob.blaze.breathe", 61),
    MAGMA_CUBE("magmaCube", "mob.slime.attack", 62),
    WITHER_SKELETON("witherSkeleton", "mob.skeleton.step", 51),
    GHAST("ghast", "mob.ghast.scream", 56),

    WITCH("witch", 66),
    GIANT("giant", 53);

    public boolean isLantern = false;
    public String lanternString = "";

    public boolean isSpawner = false;
    public String spawnerString = "";

    public String sound = "";
    public String textureTop, textureSide, textureFront, textureActive;

    public int spawnerId = -1;
    public String textureTopSpawner, textureSideSpawner;

    /**
     * Empty lantern constructor.
     * Just made for lanterns that have no sound, and no corresponding spawner.
     * EG, Jack-O-Lantern
     */
    BlockType(String name) {
        initLantern(name, "");
    }

    /**
     * Lantern that has a sound, but no spawner.
     */
    BlockType(String name, String sound) {
        initLantern(name, sound);
    }

    /**
     * Constructor for empty spawners. (Spawners that are ONLY spawners.)
     */
    BlockType(String name, int spawnerId) {
        initSpawner(name, spawnerId);
    }

    /**
     * Used to make a spawner and a lantern.
     * - NOTE; the lantern DOESN'T HAVE SOUND. If you want a lantern with sound, use the one below.
     */
    BlockType(String name, int spawnerId, boolean dummy) {
        this(name, "", spawnerId);
    }

    /**
     * For both lanterns AND spawners.
     * - Note; Lanterns with sound. Use the above constructor otherwise.
     */
    BlockType(String name, String sound, int spawnerId) {
        initLantern(name, sound);
        initSpawner(name, spawnerId);
    }

    private void initLantern(String name, String sound) {
        this.isLantern = true;
        this.sound = sound;
        this.lanternString = name + "Lantern";

        this.textureTop = lanternString + "_top";
        this.textureSide = lanternString + "_side";
        this.textureFront = lanternString + "_front";
        this.textureActive = lanternString + "_active";
    }

    private void initSpawner(String name, int spawnerId) {
        this.isSpawner = true;
        this.spawnerId = spawnerId;
        this.spawnerString = name + "Spawn";

        textureTopSpawner = spawnerString + "_top";
        textureSideSpawner = spawnerString + "_side";
    }

}
