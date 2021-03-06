package com.gellegbs.lanterns.blocks;

import com.gellegbs.lanterns.Lanterns;
import com.gellegbs.lanterns.Reference;
import com.gellegbs.lanterns.tileentities.TESpawner;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.*;
import net.minecraft.entity.monster.EntitySkeleton;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.IIcon;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;

public class BlockSpawner extends BlockContainer {

    private BlockType type;

    public BlockSpawner(BlockType type) {
        super(Material.rock);
        this.type = type;
        this.setCreativeTab(Lanterns.tabMobLanterns);
        this.setBlockName(this.type.spawnerString);
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
        topIcon = register.registerIcon(Reference.IDENTIFIER + type.textureTopSpawner);
        faceIcon = register.registerIcon(Reference.IDENTIFIER + type.textureSideSpawner);
        blockIcon = register.registerIcon(Reference.IDENTIFIER + type.textureSideSpawner);
        activeFaceIcon = register.registerIcon(Reference.IDENTIFIER + type.textureSideSpawner);
    }

    @SideOnly(Side.CLIENT)
    @Override
    public IIcon getIcon(int side, int metadata) {

        if (side == 0 || side == 1) {
            return this.topIcon;
        }

        // metadata holds the block side with the face on in the lower 3 bits
        // (0xxx),
        // and if its active or not in the highest bit. (x000)
        if ((metadata & 7) == side) {
            boolean isActive = (metadata & 8) > 0;
            return (isActive) ? this.activeFaceIcon : this.faceIcon;
        }

        return this.blockIcon;
    }


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

    // spawner stuff

    public void updateBlock(World world, int x, int y, int z, int currentMeta) {
        if (!world.isRemote) {
            boolean isActive = (currentMeta & 8) > 0;
            boolean redstoneSignal = world.isBlockIndirectlyGettingPowered(x, y, z);

            if (redstoneSignal) {
                if (!isActive) {
                    if (type.spawnerId != 0) {
                        TESpawner spawner = (TESpawner) world.getTileEntity(x, y, z);
                        if (spawner.isActive()) {
                            Entity entity = EntityList.createEntityByID(type.spawnerId, world);
                            if (entity != null && entity instanceof EntityLivingBase) {
                                EntityLiving entityliving = (EntityLiving) entity;
                                entity.setLocationAndAngles(x, y + 1, z,
                                        MathHelper.wrapAngleTo180_float(world.rand.nextFloat() * 360.0F), 0.0F);
                                entityliving.rotationYawHead = entityliving.rotationYaw;
                                entityliving.renderYawOffset = entityliving.rotationYaw;
                                entityliving.onSpawnWithEgg((IEntityLivingData) null);
                                world.spawnEntityInWorld(entity);
                                entityliving.playLivingSound();
                                // wither skeleton related stuff
                                if (type == BlockType.WITHER_SKELETON && (entityliving instanceof EntitySkeleton)) {
                                    EntitySkeleton skeleton = (EntitySkeleton) entityliving;
                                    skeleton.setSkeletonType(1);
                                    skeleton.setCurrentItemOrArmor(0, new ItemStack(Items.stone_sword));
                                    skeleton.getEntityAttribute(SharedMonsterAttributes.attackDamage)
                                            .setBaseValue(4.0D);
                                }
                                spawner.decreaseUsage();
                            }
                        }
                    }
                    currentMeta = (currentMeta & 7) + 8;
                    world.setBlockMetadataWithNotify(x, y, z, currentMeta, 2);
                }
            } else {
                if (isActive) {
                    world.setBlockMetadataWithNotify(x, y, z, (currentMeta & 7), 2);
                }
            }
        }
    }

    @Override
    public TileEntity createNewTileEntity(World world, int n) {
        return new TESpawner();

    }


}
