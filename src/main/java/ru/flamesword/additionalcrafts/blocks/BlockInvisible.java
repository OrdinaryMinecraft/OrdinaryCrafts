package ru.flamesword.additionalcrafts.blocks;

import java.util.Random;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class BlockInvisible extends Block{

	public BlockInvisible() {
		super(Material.glass);
		this.setBlockName("invisibleblock");
		this.setCreativeTab(CreativeTabs.tabBlock);
		this.setHardness(0.1F);
		this.setResistance(1F);
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
        return 0;
    }
    
    public boolean renderAsNormalBlock()
    {
        return false;
    }
    
    public boolean isOpaqueCube()
    {
        return false;
    }
}