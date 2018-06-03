package ru.flamesword.additionalcrafts.blocks;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.world.World;
import ru.flamesword.additionalcrafts.AdditionalCraftsBase;

import java.util.Random;

public class BlockInvisibleLight extends Block {

    public BlockInvisibleLight() {
        super(Material.glass);
        this.setBlockName("invisibleblocklight");
        this.setCreativeTab(AdditionalCraftsBase.tabOrdinaryCrafts);
        this.setHardness(0.1F);
        this.setResistance(1F);
        this.setLightLevel(1);
        this.setStepSound(soundTypeGlass);
        this.setBlockTextureName("additionalcrafts:InvisibleBlock");
    }

    public Item getItemDropped(int p_149650_1_, Random p_149650_2_, int p_149650_3_)
    {
        return null;
    }

    @SideOnly(Side.CLIENT)
    public int getRenderBlockPass()
    {
        return 1;
    }

    public boolean renderAsNormalBlock()
    {
        return false;
    }

    public boolean isOpaqueCube()
    {
        return false;
    }

    public AxisAlignedBB getCollisionBoundingBoxFromPool(World p_149668_1_, int p_149668_2_, int p_149668_3_, int p_149668_4_)
    {
        return null;
    }
}