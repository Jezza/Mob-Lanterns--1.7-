package com.gellegbs.lanterns;

import java.io.File;

import net.minecraftforge.common.config.Configuration;

import com.gellegbs.lanterns.blocks.BlockIds;

public class ConfigHandler {
    public static void init(File file) {
        Configuration config = new Configuration(file);

        config.load();




        config.save();
    }
}
