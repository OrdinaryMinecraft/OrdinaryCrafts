package ru.flamesword.additionalcrafts.blocks;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.world.World;
import ru.flamesword.additionalcrafts.AdditionalCraftsBase;

public class BlockSmoke extends Block
{

    public BlockSmoke()
    {
        super(Material.web);
        this.setCreativeTab(AdditionalCraftsBase.tabOrdinaryCrafts);
		this.setBlockTextureName("additionalcrafts:SmokeBlock");
        this.setBlockName("smokeblock");
		this.setHardness(0.1F);
		this.setResistance(1F);
    }

    public boolean isOpaqueCube()
    {
        return false;
    }

    public AxisAlignedBB getCollisionBoundingBoxFromPool(World p_149668_1_, int p_149668_2_, int p_149668_3_, int p_149668_4_)
    {
        return null;
    }

    public int getRenderType()
    {
        return 1;
    }

    public boolean renderAsNormalBlock()
    {
        return false;
    }

    public Item getItemDropped(int p_149650_1_, Random p_149650_2_, int p_149650_3_)
    {
        return null;
    }

    protected boolean canSilkHarvest()
    {
        return true;
    }
}