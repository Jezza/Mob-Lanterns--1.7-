package com.gellegbs.lanterns.tileentities;

import net.minecraft.tileentity.TileEntity;

public class TESpawner extends TileEntity {

    private int maxUses = 100;

    public void decreaseUsage() {
        maxUses--;
    }

    public boolean isActive() {
        return maxUses > 0;
    }

}