package ru.flamesword.additionalcrafts.blocks;

import java.util.Random;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.world.World;

public class BlockCandle extends Block
{

    public BlockCandle()
    {
        super(Material.clay);
        this.setCreativeTab(CreativeTabs.tabDecorations);
		this.setBlockTextureName("additionalcrafts:CandleBlock");
        this.setBlockName("candleblock");
		this.setHardness(0F);
		this.setLightOpacity(1);
		this.setLightLevel(0.4F);
		this.setResistance(0F);
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
        return 2;
    }

    public boolean renderAsNormalBlock()
    {
        return false;
    }
    
    @SideOnly(Side.CLIENT)
    public void randomDisplayTick(World p_149734_1_, int p_149734_2_, int p_149734_3_, int p_149734_4_, Random p_149734_5_)
    {
        int l = p_149734_1_.getBlockMetadata(p_149734_2_, p_149734_3_, p_149734_4_);
        double d0 = (double)((float)p_149734_2_ + 0.5F);
        double d1 = (double)((float)p_149734_3_ + 0.7F);
        double d2 = (double)((float)p_149734_4_ + 0.5F);
        double d3 = 0.2199999988079071D;
        double d4 = 0.27000001072883606D;

            p_149734_1_.spawnParticle("smoke", d0, d1+0.1, d2, 0.0D, 0.0D, 0.0D);
    }
}