package com.gellegbs.lanterns.tileentities;

import net.minecraft.tileentity.TileEntity;

public class TESpawner extends TileEntity {

	private int maxUses = 100;

	@Override
	public void updateEntity() {

//		int currentMeta = this.getBlockMetadata();
//
//		if (!world.isRemote) {
//			boolean isActive = (currentMeta & 8) > 0;
//			boolean redstoneSignal = worldObj.isBlockIndirectlyGettingPowered(x,
//					y, z);
//
//			if (redstoneSignal) {
//				if (!isActive) {
//					if (type.sound != null) {
//						worldObj.playSoundEffect(x, y, z, type.sound, 1f, 1f);
//
//					}
//					currentMeta = (currentMeta & 7) + 8;
//					worldObj.setBlockMetadataWithNotify(x, y, z, currentMeta, 2);
//				}
//			} else {
//				if (isActive) {
//					worldObj.setBlockMetadataWithNotify(x, y, z,
//							(currentMeta & 7), 2);
//				}
//			}
//		}
		super.updateEntity();
	}

	public void decreaseUsage() {
		maxUses--;
	}

	public boolean isActive() {
		return maxUses > 0;
	}

}