package com.gellegbs.lanterns.blocks;

import com.gellegbs.lanterns.Lanterns;
import com.gellegbs.lanterns.Reference;
import com.google.common.base.Strings;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.BlockDirectional;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;

public class BlockMobLantern extends BlockDirectional {

    private BlockType type;

    public BlockMobLantern(BlockType type) {
        super(Material.gourd);
        this.type = type;
        this.setCreativeTab(Lanterns.tabMobLanterns);
        this.setLightLevel(1F);
        this.setBlockName(this.type.lanternString);
    }

    // icon junk

    @SideOnly(Side.CLIENT)
    private IIcon topIcon;
    @SideOnly(Side.CLIENT)
    private IIcon faceIcon;
    @SideOnly(Side.CLIENT)
    private IIcon blockIcon;
    @SideOnly(Side.CLIENT)
    private IIcon activeFaceIcon;

    @SideOnly(Side.CLIENT)
    @Override
    public void registerBlockIcons(IIconRegister register) {
        topIcon = register.registerIcon(Reference.IDENTIFIER + type.textureTop);
        faceIcon = register.registerIcon(Reference.IDENTIFIER + type.textureFront);
        blockIcon = register.registerIcon(Reference.IDENTIFIER + type.textureSide);
        // Yeah, I couldn't be bothered writing ANOTHER constructor. It's 2:26am
        if (type != BlockType.JACKO)
            activeFaceIcon = register.registerIcon(Reference.IDENTIFIER + type.textureActive);
    }

    @SideOnly(Side.CLIENT)
    @Override
    public IIcon getIcon(int side, int metadata) {
        if (side == 0 || side == 1) {
            return this.topIcon;
        }

        // metadata holds the block side with the face on in the lower 3 bits
        // and if its active or not in the highest bit. (x000)
        if ((metadata & 7) == side) {
            boolean isActive = (metadata & 8) > 0;
            return (isActive) ? this.activeFaceIcon : this.faceIcon;
        }

        return this.blockIcon;
    }

    @Override
    public void onBlockPlacedBy(World world, int x, int y, int z, EntityLivingBase entity, ItemStack itemstack) {
        int whichDirectionFacing = MathHelper.floor_double((double) (entity.rotationYaw * 4.0F / 360.0F) + 2.5D) & 3;

        // map the facing to the block side with the face and store it as
        // metadata.
        // mapping is as follows: Facing -> BlockSideWithFace
        // 0 -> 3
        // 1 -> 4
        // 2 -> 2
        // 3 -> 5
        //
        // we just check against 0,1 and 3 as 2 would be fine by itself.
        int blockSideWithFace = whichDirectionFacing;
        if (whichDirectionFacing == 0)
            blockSideWithFace = 3;
        else if (whichDirectionFacing == 1)
            blockSideWithFace = 4;
        else if (whichDirectionFacing == 3)
            blockSideWithFace = 5;

        world.setBlockMetadataWithNotify(x, y, z, blockSideWithFace, 2);
        this.updateBlock(world, x, y, z, blockSideWithFace);
    }

    @Override
    public void onNeighborBlockChange(World world, int x, int y, int z, Block par5) {
        if (!world.isRemote) {
            this.updateBlock(world, x, y, z, world.getBlockMetadata(x, y, z));
        }
    }

    @Override
    public void onBlockAdded(World world, int x, int y, int z) {
        if (!world.isRemote) {
            this.updateBlock(world, x, y, z, world.getBlockMetadata(x, y, z));
        }
    }

    public void updateBlock(World world, int x, int y, int z, int currentMeta) {
        if (!world.isRemote) {
            boolean isActive = (currentMeta & 8) > 0;

            boolean redstoneSignal = world.isBlockIndirectlyGettingPowered(x, y, z);

            if (redstoneSignal) {
                if (!isActive) {
                    if (!Strings.isNullOrEmpty(type.sound)) {
                        world.playSoundEffect(x, y, z, type.sound, 1f, 1f);
                    }
                    currentMeta = (currentMeta & 7) + 8;
                    world.setBlockMetadataWithNotify(x, y, z, currentMeta, 3);
                }
            } else {
                if (isActive) {
                    world.setBlockMetadataWithNotify(x, y, z,
                            (currentMeta & 7), 3);
                }
            }
        }

    }

}
